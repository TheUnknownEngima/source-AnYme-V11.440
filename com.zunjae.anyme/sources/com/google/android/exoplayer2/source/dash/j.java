package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.upstream.e;
import defpackage.vt;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public final class j implements Handler.Callback {
    private final e e;
    private final b f;
    /* access modifiers changed from: private */
    public final gy g = new gy();
    /* access modifiers changed from: private */
    public final Handler h = v50.t(this);
    private final TreeMap<Long, Long> i = new TreeMap<>();
    private h10 j;
    private long k;
    private long l = -9223372036854775807L;
    private long m = -9223372036854775807L;
    private boolean n;
    private boolean o;

    private static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    public interface b {
        void a();

        void b(long j);
    }

    public final class c implements vt {
        private final k00 a;
        private final g0 b = new g0();
        private final cy c = new cy();

        c(e eVar) {
            this.a = new k00(eVar, j.this.h.getLooper(), qs.d());
        }

        private cy e() {
            this.c.clear();
            if (this.a.K(this.b, this.c, false, false, 0) != -4) {
                return null;
            }
            this.c.l();
            return this.c;
        }

        private void i(long j, long j2) {
            j.this.h.sendMessage(j.this.h.obtainMessage(1, new a(j, j2)));
        }

        private void j() {
            while (this.a.E(false)) {
                cy e = e();
                if (e != null) {
                    long j = e.h;
                    fy fyVar = (fy) j.this.g.a(e).c(0);
                    if (j.g(fyVar.e, fyVar.f)) {
                        k(j, fyVar);
                    }
                }
            }
            this.a.o();
        }

        private void k(long j, fy fyVar) {
            long c2 = j.e(fyVar);
            if (c2 != -9223372036854775807L) {
                i(j, c2);
            }
        }

        public int a(it itVar, int i, boolean z) {
            return this.a.a(itVar, i, z);
        }

        public void b(i50 i50, int i) {
            this.a.b(i50, i);
        }

        public void c(long j, int i, int i2, int i3, vt.a aVar) {
            this.a.c(j, i, i2, i3, aVar);
            j();
        }

        public void d(f0 f0Var) {
            this.a.d(f0Var);
        }

        public boolean f(long j) {
            return j.this.i(j);
        }

        public boolean g(v00 v00) {
            return j.this.j(v00);
        }

        public void h(v00 v00) {
            j.this.m(v00);
        }

        public void l() {
            this.a.M();
        }
    }

    public j(h10 h10, b bVar, e eVar) {
        this.j = h10;
        this.f = bVar;
        this.e = eVar;
    }

    private Map.Entry<Long, Long> d(long j2) {
        return this.i.ceilingEntry(Long.valueOf(j2));
    }

    /* access modifiers changed from: private */
    public static long e(fy fyVar) {
        try {
            return v50.r0(v50.x(fyVar.i));
        } catch (m0 unused) {
            return -9223372036854775807L;
        }
    }

    private void f(long j2, long j3) {
        Long l2 = this.i.get(Long.valueOf(j3));
        if (l2 == null || l2.longValue() > j2) {
            this.i.put(Long.valueOf(j3), Long.valueOf(j2));
        }
    }

    public static boolean g(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    private void h() {
        long j2 = this.m;
        if (j2 == -9223372036854775807L || j2 != this.l) {
            this.n = true;
            this.m = this.l;
            this.f.a();
        }
    }

    private void l() {
        this.f.b(this.k);
    }

    private void o() {
        Iterator<Map.Entry<Long, Long>> it = this.i.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) it.next().getKey()).longValue() < this.j.h) {
                it.remove();
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (this.o) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        f(aVar.a, aVar.b);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(long j2) {
        h10 h10 = this.j;
        boolean z = false;
        if (!h10.d) {
            return false;
        }
        if (this.n) {
            return true;
        }
        Map.Entry<Long, Long> d = d(h10.h);
        if (d != null && d.getValue().longValue() < j2) {
            this.k = d.getKey().longValue();
            l();
            z = true;
        }
        if (z) {
            h();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean j(v00 v00) {
        if (!this.j.d) {
            return false;
        }
        if (this.n) {
            return true;
        }
        long j2 = this.l;
        if (!(j2 != -9223372036854775807L && j2 < v00.f)) {
            return false;
        }
        h();
        return true;
    }

    public c k() {
        return new c(this.e);
    }

    /* access modifiers changed from: package-private */
    public void m(v00 v00) {
        long j2 = this.l;
        if (j2 != -9223372036854775807L || v00.g > j2) {
            this.l = v00.g;
        }
    }

    public void n() {
        this.o = true;
        this.h.removeCallbacksAndMessages((Object) null);
    }

    public void p(h10 h10) {
        this.n = false;
        this.k = -9223372036854775807L;
        this.j = h10;
        o();
    }
}
