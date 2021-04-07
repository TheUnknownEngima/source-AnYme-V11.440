package defpackage;

import androidx.constraintlayout.motion.widget.g;
import androidx.constraintlayout.motion.widget.r;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: q0  reason: default package */
public class q0 {
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;

    public void a(float f2, float f3, int i, int i2, float[] fArr) {
        int i3 = i;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = (f3 - 0.5f) * 2.0f;
        float f8 = f4 + this.c;
        float f9 = f5 + this.d;
        float f10 = f8 + (this.a * f6);
        float f11 = f9 + (this.b * f7);
        float radians = (float) Math.toRadians((double) this.e);
        double radians2 = (double) ((float) Math.toRadians((double) this.f));
        double d2 = (double) (((float) i2) * f7);
        fArr[0] = f10 + (((float) ((((double) (((float) (-i3)) * f6)) * Math.sin(radians2)) - (Math.cos(radians2) * d2))) * radians);
        fArr[1] = f11 + (radians * ((float) ((((double) (((float) i3) * f6)) * Math.cos(radians2)) - (d2 * Math.sin(radians2)))));
    }

    public void b() {
        this.e = Utils.FLOAT_EPSILON;
        this.d = Utils.FLOAT_EPSILON;
        this.c = Utils.FLOAT_EPSILON;
        this.b = Utils.FLOAT_EPSILON;
        this.a = Utils.FLOAT_EPSILON;
    }

    public void c(g gVar, float f2) {
        if (gVar != null) {
            this.e = gVar.b(f2);
        }
    }

    public void d(r rVar, float f2) {
        if (rVar != null) {
            this.e = rVar.b(f2);
            this.f = rVar.a(f2);
        }
    }

    public void e(g gVar, g gVar2, float f2) {
        if (gVar != null || gVar2 != null) {
            if (gVar == null) {
                this.a = gVar.b(f2);
            }
            if (gVar2 == null) {
                this.b = gVar2.b(f2);
            }
        }
    }

    public void f(r rVar, r rVar2, float f2) {
        if (rVar != null) {
            this.a = rVar.b(f2);
        }
        if (rVar2 != null) {
            this.b = rVar2.b(f2);
        }
    }

    public void g(g gVar, g gVar2, float f2) {
        if (gVar != null) {
            this.c = gVar.b(f2);
        }
        if (gVar2 != null) {
            this.d = gVar2.b(f2);
        }
    }

    public void h(r rVar, r rVar2, float f2) {
        if (rVar != null) {
            this.c = rVar.b(f2);
        }
        if (rVar2 != null) {
            this.d = rVar2.b(f2);
        }
    }
}
