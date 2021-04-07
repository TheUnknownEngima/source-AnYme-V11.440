package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import androidx.work.impl.d;
import androidx.work.impl.e;
import androidx.work.impl.h;
import androidx.work.k;
import androidx.work.m;

public abstract class a implements Runnable {
    private final b e = new b();

    /* renamed from: androidx.work.impl.utils.a$a  reason: collision with other inner class name */
    static class C0065a extends a {
        final /* synthetic */ h f;
        final /* synthetic */ String g;
        final /* synthetic */ boolean h;

        C0065a(h hVar, String str, boolean z) {
            this.f = hVar;
            this.g = str;
            this.h = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public void e() {
            WorkDatabase m = this.f.m();
            m.c();
            try {
                for (String a : m.D().k(this.g)) {
                    a(this.f, a);
                }
                m.v();
                m.h();
                if (this.h) {
                    d(this.f);
                }
            } catch (Throwable th) {
                m.h();
                throw th;
            }
        }
    }

    public static a b(String str, h hVar, boolean z) {
        return new C0065a(hVar, str, z);
    }

    private void c(WorkDatabase workDatabase, String str) {
        j8 D = workDatabase.D();
        for (String c : workDatabase.x().b(str)) {
            c(workDatabase, c);
        }
        m.a l = D.l(str);
        if (l != m.a.SUCCEEDED && l != m.a.FAILED) {
            D.a(m.a.CANCELLED, str);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, String str) {
        c(hVar.m(), str);
        hVar.k().h(str);
        for (d d : hVar.l()) {
            d.d(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(h hVar) {
        e.b(hVar.h(), hVar.m(), hVar.l());
    }

    /* access modifiers changed from: package-private */
    public abstract void e();

    public void run() {
        try {
            e();
            this.e.a(k.a);
        } catch (Throwable th) {
            this.e.a(new k.b.a(th));
        }
    }
}
