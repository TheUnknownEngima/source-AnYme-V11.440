package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.o5;

/* renamed from: q5  reason: default package */
public final class q5 extends o5<q5> {
    private r5 s = null;
    private float t = Float.MAX_VALUE;
    private boolean u = false;

    public <K> q5(K k, p5<K> p5Var) {
        super(k, p5Var);
    }

    private void p() {
        r5 r5Var = this.s;
        if (r5Var != null) {
            double a = (double) r5Var.a();
            if (a > ((double) this.g)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
            } else if (a < ((double) this.h)) {
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
        } else {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
    }

    public void k() {
        p();
        this.s.g((double) f());
        super.k();
    }

    /* access modifiers changed from: package-private */
    public boolean m(long j) {
        long j2;
        double d;
        double d2;
        r5 r5Var;
        if (this.u) {
            float f = this.t;
            if (f != Float.MAX_VALUE) {
                this.s.e(f);
                this.t = Float.MAX_VALUE;
            }
            this.b = this.s.a();
            this.a = Utils.FLOAT_EPSILON;
            this.u = false;
            return true;
        }
        if (this.t != Float.MAX_VALUE) {
            this.s.a();
            j2 = j / 2;
            o5.h h = this.s.h((double) this.b, (double) this.a, j2);
            this.s.e(this.t);
            this.t = Float.MAX_VALUE;
            r5Var = this.s;
            d2 = (double) h.a;
            d = (double) h.b;
        } else {
            r5Var = this.s;
            d2 = (double) this.b;
            d = (double) this.a;
            j2 = j;
        }
        o5.h h2 = r5Var.h(d2, d, j2);
        this.b = h2.a;
        this.a = h2.b;
        float max = Math.max(this.b, this.h);
        this.b = max;
        float min = Math.min(max, this.g);
        this.b = min;
        if (!o(min, this.a)) {
            return false;
        }
        this.b = this.s.a();
        this.a = Utils.FLOAT_EPSILON;
        return true;
    }

    public void n(float f) {
        if (g()) {
            this.t = f;
            return;
        }
        if (this.s == null) {
            this.s = new r5(f);
        }
        this.s.e(f);
        k();
    }

    /* access modifiers changed from: package-private */
    public boolean o(float f, float f2) {
        return this.s.c(f, f2);
    }

    public q5 q(r5 r5Var) {
        this.s = r5Var;
        return this;
    }
}
