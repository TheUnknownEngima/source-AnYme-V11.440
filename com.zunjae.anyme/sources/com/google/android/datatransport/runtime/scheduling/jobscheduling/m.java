package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public class m {
    private final Context a;
    private final e b;
    private final bp c;
    private final s d;
    private final Executor e;
    private final jq f;
    private final kq g;

    public m(Context context, e eVar, bp bpVar, s sVar, Executor executor, jq jqVar, kq kqVar) {
        this.a = context;
        this.b = eVar;
        this.c = bpVar;
        this.d = sVar;
        this.e = executor;
        this.f = jqVar;
        this.g = kqVar;
    }

    static /* synthetic */ Object c(m mVar, g gVar, Iterable iterable, eo eoVar, int i) {
        if (gVar.c() == g.a.TRANSIENT_ERROR) {
            mVar.c.E0(iterable);
            mVar.d.a(eoVar, i + 1);
            return null;
        }
        mVar.c.j(iterable);
        if (gVar.c() == g.a.OK) {
            mVar.c.u(eoVar, mVar.g.a() + gVar.b());
        }
        if (!mVar.c.C0(eoVar)) {
            return null;
        }
        mVar.d.a(eoVar, 1);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2.d.a(r3, r4 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void e(com.google.android.datatransport.runtime.scheduling.jobscheduling.m r2, defpackage.eo r3, int r4, java.lang.Runnable r5) {
        /*
            jq r0 = r2.f     // Catch:{ iq -> 0x0024 }
            bp r1 = r2.c     // Catch:{ iq -> 0x0024 }
            r1.getClass()     // Catch:{ iq -> 0x0024 }
            jq$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.k.a(r1)     // Catch:{ iq -> 0x0024 }
            r0.a(r1)     // Catch:{ iq -> 0x0024 }
            boolean r0 = r2.a()     // Catch:{ iq -> 0x0024 }
            if (r0 != 0) goto L_0x001e
            jq r0 = r2.f     // Catch:{ iq -> 0x0024 }
            jq$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.l.a(r2, r3, r4)     // Catch:{ iq -> 0x0024 }
            r0.a(r1)     // Catch:{ iq -> 0x0024 }
            goto L_0x002b
        L_0x001e:
            r2.f(r3, r4)     // Catch:{ iq -> 0x0024 }
            goto L_0x002b
        L_0x0022:
            r2 = move-exception
            goto L_0x002f
        L_0x0024:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.s r2 = r2.d     // Catch:{ all -> 0x0022 }
            int r4 = r4 + 1
            r2.a(r3, r4)     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r5.run()
            return
        L_0x002f:
            r5.run()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.m.e(com.google.android.datatransport.runtime.scheduling.jobscheduling.m, eo, int, java.lang.Runnable):void");
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public void f(eo eoVar, int i) {
        g gVar;
        com.google.android.datatransport.runtime.backends.m a2 = this.b.a(eoVar.b());
        Iterable<hp> iterable = (Iterable) this.f.a(i.a(this, eoVar));
        if (iterable.iterator().hasNext()) {
            if (a2 == null) {
                mo.a("Uploader", "Unknown backend for %s, deleting event batch for it...", eoVar);
                gVar = g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (hp b2 : iterable) {
                    arrayList.add(b2.b());
                }
                f.a a3 = f.a();
                a3.b(arrayList);
                a3.c(eoVar.c());
                gVar = a2.a(a3.a());
            }
            this.f.a(j.a(this, gVar, iterable, eoVar, i));
        }
    }

    public void g(eo eoVar, int i, Runnable runnable) {
        this.e.execute(h.a(this, eoVar, i, runnable));
    }
}
