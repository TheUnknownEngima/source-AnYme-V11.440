package defpackage;

import android.content.Context;
import defpackage.ge1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: cd1  reason: default package */
class cd1 {
    private final kc1 a;
    private final ff1 b;
    private final zf1 c;
    private final id1 d;
    private final ed1 e;
    private String f;

    cd1(kc1 kc1, ff1 ff1, zf1 zf1, id1 id1, ed1 ed1) {
        this.a = kc1;
        this.b = ff1;
        this.c = zf1;
        this.d = id1;
        this.e = ed1;
    }

    public static cd1 b(Context context, tc1 tc1, gf1 gf1, xb1 xb1, id1 id1, ed1 ed1, xg1 xg1, eg1 eg1) {
        return new cd1(new kc1(context, tc1, xb1, xg1), new ff1(new File(gf1.a()), eg1), zf1.a(context), id1, ed1);
    }

    private static List<ge1.b> e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            ge1.b.a a2 = ge1.b.a();
            a2.b((String) next.getKey());
            a2.c((String) next.getValue());
            arrayList.add(a2.a());
        }
        Collections.sort(arrayList, bd1.a());
        return arrayList;
    }

    /* access modifiers changed from: private */
    public boolean i(e81<lc1> e81) {
        if (e81.q()) {
            lc1 m = e81.m();
            jb1 f2 = jb1.f();
            f2.b("Crashlytics report successfully enqueued to DataTransport: " + m.c());
            this.b.h(m.c());
            return true;
        }
        jb1.f().c("Crashlytics report could not be enqueued to DataTransport", e81.l());
        return false;
    }

    private void j(Throwable th, Thread thread, String str, long j, boolean z) {
        String str2 = this.f;
        if (str2 == null) {
            jb1.f().b("Cannot persist event, no currently open session");
            return;
        }
        boolean equals = str.equals("crash");
        ge1.d.C0116d b2 = this.a.b(th, thread, str, j, 4, 8, z);
        ge1.d.C0116d.b g = b2.g();
        String d2 = this.d.d();
        if (d2 != null) {
            ge1.d.C0116d.C0127d.a a2 = ge1.d.C0116d.C0127d.a();
            a2.b(d2);
            g.d(a2.a());
        } else {
            jb1.f().b("No log data to include with this event.");
        }
        List<ge1.b> e2 = e(this.e.a());
        if (!e2.isEmpty()) {
            ge1.d.C0116d.a.C0117a f2 = b2.b().f();
            f2.c(he1.a(e2));
            g.b(f2.a());
        }
        this.b.A(g.a(), str2, equals);
    }

    public void c(String str, List<xc1> list) {
        ArrayList arrayList = new ArrayList();
        for (xc1 b2 : list) {
            ge1.c.b b3 = b2.b();
            if (b3 != null) {
                arrayList.add(b3);
            }
        }
        ff1 ff1 = this.b;
        ge1.c.a a2 = ge1.c.a();
        a2.b(he1.a(arrayList));
        ff1.j(str, a2.a());
    }

    public void d(long j) {
        this.b.i(this.f, j);
    }

    public void g(String str, long j) {
        this.f = str;
        this.b.B(this.a.c(str, j));
    }

    public void h() {
        this.f = null;
    }

    public void k(Throwable th, Thread thread, long j) {
        j(th, thread, "crash", j, true);
    }

    public void l(Throwable th, Thread thread, long j) {
        j(th, thread, "error", j, false);
    }

    public void m() {
        this.b.g();
    }

    /* access modifiers changed from: package-private */
    public e81<Void> n(Executor executor, pc1 pc1) {
        if (pc1 == pc1.NONE) {
            jb1.f().b("Send via DataTransport disabled. Removing DataTransport reports.");
            this.b.g();
            return h81.e(null);
        }
        List<lc1> x = this.b.x();
        ArrayList arrayList = new ArrayList();
        for (lc1 next : x) {
            if (next.b().k() != ge1.e.NATIVE || pc1 == pc1.ALL) {
                arrayList.add(this.c.e(next).i(executor, ad1.b(this)));
            } else {
                jb1.f().b("Send native reports via DataTransport disabled. Removing DataTransport reports.");
                this.b.h(next.c());
            }
        }
        return h81.f(arrayList);
    }
}
