package defpackage;

import android.opengl.Matrix;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: z50  reason: default package */
public final class z50 {
    private final float[] a = new float[16];
    private final float[] b = new float[16];
    private final r50<float[]> c = new r50<>();
    private boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float sqrt = (float) Math.sqrt((double) ((fArr2[10] * fArr2[10]) + (fArr2[8] * fArr2[8])));
        fArr[0] = fArr2[10] / sqrt;
        fArr[2] = fArr2[8] / sqrt;
        fArr[8] = (-fArr2[8]) / sqrt;
        fArr[10] = fArr2[10] / sqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != Utils.FLOAT_EPSILON) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees((double) length), f / length, f2 / length, f3 / length);
            return;
        }
        Matrix.setIdentityM(fArr, 0);
    }

    public boolean c(float[] fArr, long j) {
        float[] i = this.c.i(j);
        if (i == null) {
            return false;
        }
        b(this.b, i);
        if (!this.d) {
            a(this.a, this.b);
            this.d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.a, 0, this.b, 0);
        return true;
    }

    public void d() {
        this.c.c();
        this.d = false;
    }

    public void e(long j, float[] fArr) {
        this.c.a(j, fArr);
    }
}
