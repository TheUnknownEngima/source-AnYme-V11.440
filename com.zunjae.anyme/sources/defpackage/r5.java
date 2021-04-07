package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.o5;

/* renamed from: r5  reason: default package */
public final class r5 {
    double a = Math.sqrt(1500.0d);
    double b = 0.5d;
    private boolean c = false;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i = Double.MAX_VALUE;
    private final o5.h j = new o5.h();

    public r5() {
    }

    public r5(float f2) {
        this.i = (double) f2;
    }

    private void b() {
        if (!this.c) {
            if (this.i != Double.MAX_VALUE) {
                double d2 = this.b;
                if (d2 > 1.0d) {
                    double d3 = this.a;
                    this.f = ((-d2) * d3) + (d3 * Math.sqrt((d2 * d2) - 1.0d));
                    double d4 = this.b;
                    double d5 = this.a;
                    this.g = ((-d4) * d5) - (d5 * Math.sqrt((d4 * d4) - 1.0d));
                } else if (d2 >= Utils.DOUBLE_EPSILON && d2 < 1.0d) {
                    this.h = this.a * Math.sqrt(1.0d - (d2 * d2));
                }
                this.c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public float a() {
        return (float) this.i;
    }

    public boolean c(float f2, float f3) {
        return ((double) Math.abs(f3)) < this.e && ((double) Math.abs(f2 - a())) < this.d;
    }

    public r5 d(float f2) {
        if (f2 >= Utils.FLOAT_EPSILON) {
            this.b = (double) f2;
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public r5 e(float f2) {
        this.i = (double) f2;
        return this;
    }

    public r5 f(float f2) {
        if (f2 > Utils.FLOAT_EPSILON) {
            this.a = Math.sqrt((double) f2);
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* access modifiers changed from: package-private */
    public void g(double d2) {
        double abs = Math.abs(d2);
        this.d = abs;
        this.e = abs * 62.5d;
    }

    /* access modifiers changed from: package-private */
    public o5.h h(double d2, double d3, long j2) {
        double d4;
        double d5;
        b();
        double d6 = ((double) j2) / 1000.0d;
        double d7 = d2 - this.i;
        double d8 = this.b;
        if (d8 > 1.0d) {
            double d9 = this.g;
            double d10 = this.f;
            double d11 = d7 - (((d9 * d7) - d3) / (d9 - d10));
            double d12 = ((d7 * d9) - d3) / (d9 - d10);
            d5 = (Math.pow(2.718281828459045d, d9 * d6) * d11) + (Math.pow(2.718281828459045d, this.f * d6) * d12);
            double d13 = this.g;
            double pow = d11 * d13 * Math.pow(2.718281828459045d, d13 * d6);
            double d14 = this.f;
            d4 = pow + (d12 * d14 * Math.pow(2.718281828459045d, d14 * d6));
        } else if (d8 == 1.0d) {
            double d15 = this.a;
            double d16 = d3 + (d15 * d7);
            double d17 = d7 + (d16 * d6);
            d5 = Math.pow(2.718281828459045d, (-d15) * d6) * d17;
            double pow2 = d17 * Math.pow(2.718281828459045d, (-this.a) * d6);
            double d18 = this.a;
            d4 = (d16 * Math.pow(2.718281828459045d, (-d18) * d6)) + (pow2 * (-d18));
        } else {
            double d19 = 1.0d / this.h;
            double d20 = this.a;
            double d21 = d19 * ((d8 * d20 * d7) + d3);
            double pow3 = Math.pow(2.718281828459045d, (-d8) * d20 * d6) * ((Math.cos(this.h * d6) * d7) + (Math.sin(this.h * d6) * d21));
            double d22 = this.a;
            double d23 = this.b;
            double d24 = (-d22) * pow3 * d23;
            double pow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d6);
            double d25 = this.h;
            double d26 = pow3;
            double sin = (-d25) * d7 * Math.sin(d25 * d6);
            double d27 = this.h;
            d4 = d24 + (pow4 * (sin + (d21 * d27 * Math.cos(d27 * d6))));
            d5 = d26;
        }
        o5.h hVar = this.j;
        hVar.a = (float) (d5 + this.i);
        hVar.b = (float) d4;
        return hVar;
    }
}
