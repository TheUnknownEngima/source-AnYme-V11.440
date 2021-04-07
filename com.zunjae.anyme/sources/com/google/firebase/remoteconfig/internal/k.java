package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.e;
import com.google.firebase.installations.g;
import com.google.firebase.installations.l;
import com.google.firebase.remoteconfig.f;
import com.google.firebase.remoteconfig.i;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.j;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class k {
    static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};
    private final g a;
    private final eb1 b;
    private final Executor c;
    private final e d;
    private final Random e;
    private final e f;
    private final ConfigFetchHttpClient g;
    private final m h;
    private final Map<String, String> i;

    public static class a {
        private final int a;
        private final f b;
        private final String c;

        private a(Date date, int i, f fVar, String str) {
            this.a = i;
            this.b = fVar;
            this.c = str;
        }

        public static a a(Date date) {
            return new a(date, 1, (f) null, (String) null);
        }

        public static a b(f fVar, String str) {
            return new a(fVar.e(), 0, fVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, (f) null, (String) null);
        }

        public f d() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public String e() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return this.a;
        }
    }

    static {
        TimeUnit.HOURS.toSeconds(12);
    }

    public k(g gVar, eb1 eb1, Executor executor, e eVar, Random random, e eVar2, ConfigFetchHttpClient configFetchHttpClient, m mVar, Map<String, String> map) {
        this.a = gVar;
        this.b = eb1;
        this.c = executor;
        this.d = eVar;
        this.e = random;
        this.f = eVar2;
        this.g = configFetchHttpClient;
        this.h = mVar;
        this.i = map;
    }

    private boolean a(long j2, Date date) {
        Date d2 = this.h.d();
        if (d2.equals(m.d)) {
            return false;
        }
        return date.before(new Date(d2.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private j b(j jVar) {
        String str;
        int a2 = jVar.a();
        if (a2 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a2 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a2 == 429) {
            throw new f("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a2 != 500) {
            switch (a2) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a3 = jVar.a();
        return new j(a3, "Fetch failed: " + str, jVar);
    }

    private String c(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2))});
    }

    private a e(String str, String str2, Date date) {
        try {
            a fetch = this.g.fetch(this.g.c(), str, str2, j(), this.h.c(), this.i, date);
            if (fetch.e() != null) {
                this.h.h(fetch.e());
            }
            this.h.f();
            return fetch;
        } catch (j e2) {
            m.a q = q(e2.a(), date);
            if (p(q, e2.a())) {
                throw new i(q.a().getTime());
            }
            throw b(e2);
        }
    }

    private e81<a> f(String str, String str2, Date date) {
        try {
            a e2 = e(str, str2, date);
            return e2.f() != 0 ? h81.e(e2) : this.f.i(e2.d()).s(this.c, j.b(e2));
        } catch (com.google.firebase.remoteconfig.g e3) {
            return h81.d(e3);
        }
    }

    /* access modifiers changed from: private */
    public e81<a> g(e81<f> e81, long j2) {
        e81<TContinuationResult> e812;
        Date date = new Date(this.d.c());
        if (e81.q() && a(j2, date)) {
            return h81.e(a.c(date));
        }
        Date h2 = h(date);
        if (h2 != null) {
            e812 = h81.d(new i(c(h2.getTime() - date.getTime()), h2.getTime()));
        } else {
            e81<String> f2 = this.a.f();
            e81<l> a2 = this.a.a(false);
            e812 = h81.i(f2, a2).k(this.c, h.b(this, f2, a2, date));
        }
        return e812.k(this.c, i.b(this, date));
    }

    private Date h(Date date) {
        Date a2 = this.h.a().a();
        if (date.before(a2)) {
            return a2;
        }
        return null;
    }

    private long i(int i2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = j;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i2, iArr.length) - 1]);
        return (millis / 2) + ((long) this.e.nextInt((int) millis));
    }

    private Map<String, String> j() {
        HashMap hashMap = new HashMap();
        eb1 eb1 = this.b;
        if (eb1 == null) {
            return hashMap;
        }
        for (Map.Entry next : eb1.a(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    private boolean k(int i2) {
        return i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504;
    }

    static /* synthetic */ e81 n(k kVar, e81 e81, e81 e812, Date date, e81 e813) {
        return !e81.q() ? h81.d(new f("Firebase Installations failed to get installation ID for fetch.", e81.l())) : !e812.q() ? h81.d(new f("Firebase Installations failed to get installation auth token for fetch.", e812.l())) : kVar.f((String) e81.m(), ((l) e812.m()).b(), date);
    }

    private boolean p(m.a aVar, int i2) {
        return aVar.b() > 1 || i2 == 429;
    }

    private m.a q(int i2, Date date) {
        if (k(i2)) {
            r(date);
        }
        return this.h.a();
    }

    private void r(Date date) {
        int b2 = this.h.a().b() + 1;
        this.h.g(b2, new Date(date.getTime() + i(b2)));
    }

    /* access modifiers changed from: private */
    public void s(e81<a> e81, Date date) {
        if (e81.q()) {
            this.h.j(date);
            return;
        }
        Exception l = e81.l();
        if (l != null) {
            if (l instanceof i) {
                this.h.k();
            } else {
                this.h.i();
            }
        }
    }

    public e81<a> d(long j2) {
        if (this.h.e()) {
            j2 = 0;
        }
        return this.f.c().k(this.c, g.b(this, j2));
    }
}
