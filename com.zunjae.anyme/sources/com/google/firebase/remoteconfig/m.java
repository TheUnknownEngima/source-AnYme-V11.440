package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.firebase.c;
import com.google.firebase.installations.g;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.k;
import com.google.firebase.remoteconfig.internal.l;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.o;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class m {
    private static final e j = h.d();
    private static final Random k = new Random();
    private final Map<String, e> a;
    private final Context b;
    private final ExecutorService c;
    private final c d;
    private final g e;
    private final com.google.firebase.abt.c f;
    private final eb1 g;
    private final String h;
    private Map<String, String> i;

    m(Context context, c cVar, g gVar, com.google.firebase.abt.c cVar2, eb1 eb1) {
        this(context, Executors.newCachedThreadPool(), cVar, gVar, cVar2, eb1, new o(context, cVar.j().c()), true);
    }

    protected m(Context context, ExecutorService executorService, c cVar, g gVar, com.google.firebase.abt.c cVar2, eb1 eb1, o oVar, boolean z) {
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = executorService;
        this.d = cVar;
        this.e = gVar;
        this.f = cVar2;
        this.g = eb1;
        this.h = cVar.j().c();
        if (z) {
            h81.c(executorService, k.a(this));
            oVar.getClass();
            h81.c(executorService, l.a(oVar));
        }
    }

    public static com.google.firebase.remoteconfig.internal.e c(Context context, String str, String str2, String str3) {
        return com.google.firebase.remoteconfig.internal.e.f(Executors.newCachedThreadPool(), n.c(context, String.format("%s_%s_%s_%s.json", new Object[]{"frc", str, str2, str3})));
    }

    private com.google.firebase.remoteconfig.internal.e d(String str, String str2) {
        return c(this.b, this.h, str, str2);
    }

    private l h(com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2) {
        return new l(eVar, eVar2);
    }

    static com.google.firebase.remoteconfig.internal.m i(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.m(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, "settings"}), 0));
    }

    private static boolean j(c cVar, String str) {
        return str.equals("firebase") && k(cVar);
    }

    private static boolean k(c cVar) {
        return cVar.i().equals("[DEFAULT]");
    }

    /* access modifiers changed from: package-private */
    public synchronized e a(c cVar, String str, g gVar, com.google.firebase.abt.c cVar2, Executor executor, com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.e eVar2, com.google.firebase.remoteconfig.internal.e eVar3, k kVar, l lVar, com.google.firebase.remoteconfig.internal.m mVar) {
        e eVar4;
        String str2 = str;
        synchronized (this) {
            if (!this.a.containsKey(str2)) {
                e eVar5 = new e(this.b, cVar, gVar, j(cVar, str) ? cVar2 : null, executor, eVar, eVar2, eVar3, kVar, lVar, mVar);
                eVar5.p();
                this.a.put(str2, eVar5);
            }
            eVar4 = this.a.get(str2);
        }
        return eVar4;
    }

    public synchronized e b(String str) {
        com.google.firebase.remoteconfig.internal.e d2;
        com.google.firebase.remoteconfig.internal.e d3;
        com.google.firebase.remoteconfig.internal.e d4;
        com.google.firebase.remoteconfig.internal.m i2;
        d2 = d(str, "fetch");
        d3 = d(str, "activate");
        d4 = d(str, "defaults");
        i2 = i(this.b, this.h, str);
        return a(this.d, str, this.e, this.f, this.c, d2, d3, d4, f(str, d2, i2), h(d3, d4), i2);
    }

    /* access modifiers changed from: package-private */
    public e e() {
        return b("firebase");
    }

    /* access modifiers changed from: package-private */
    public synchronized k f(String str, com.google.firebase.remoteconfig.internal.e eVar, com.google.firebase.remoteconfig.internal.m mVar) {
        return new k(this.e, k(this.d) ? this.g : null, this.c, j, k, eVar, g(this.d.j().b(), str, mVar), mVar, this.i);
    }

    /* access modifiers changed from: package-private */
    public ConfigFetchHttpClient g(String str, String str2, com.google.firebase.remoteconfig.internal.m mVar) {
        return new ConfigFetchHttpClient(this.b, this.d.j().c(), str, str2, mVar.b(), mVar.b());
    }
}
