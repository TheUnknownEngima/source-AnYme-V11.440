package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t  reason: default package */
public class t {
    final ArrayList<t4> a = new ArrayList<>();
    private long b = -1;
    private Interpolator c;
    u4 d;
    private boolean e;
    private final v4 f = new a();

    /* renamed from: t$a */
    class a extends v4 {
        private boolean a = false;
        private int b = 0;

        a() {
        }

        public void b(View view) {
            int i = this.b + 1;
            this.b = i;
            if (i == t.this.a.size()) {
                u4 u4Var = t.this.d;
                if (u4Var != null) {
                    u4Var.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.a) {
                this.a = true;
                u4 u4Var = t.this.d;
                if (u4Var != null) {
                    u4Var.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.b = 0;
            this.a = false;
            t.this.b();
        }
    }

    public void a() {
        if (this.e) {
            Iterator<t4> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.e = false;
    }

    public t c(t4 t4Var) {
        if (!this.e) {
            this.a.add(t4Var);
        }
        return this;
    }

    public t d(t4 t4Var, t4 t4Var2) {
        this.a.add(t4Var);
        t4Var2.i(t4Var.c());
        this.a.add(t4Var2);
        return this;
    }

    public t e(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public t f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public t g(u4 u4Var) {
        if (!this.e) {
            this.d = u4Var;
        }
        return this;
    }

    public void h() {
        if (!this.e) {
            Iterator<t4> it = this.a.iterator();
            while (it.hasNext()) {
                t4 next = it.next();
                long j = this.b;
                if (j >= 0) {
                    next.e(j);
                }
                Interpolator interpolator = this.c;
                if (interpolator != null) {
                    next.f(interpolator);
                }
                if (this.d != null) {
                    next.g(this.f);
                }
                next.k();
            }
            this.e = true;
        }
    }
}
