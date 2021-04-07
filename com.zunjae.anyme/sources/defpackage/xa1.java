package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: xa1  reason: default package */
public class xa1 {
    private final ya1[] a = new ya1[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final ya1 g = new ya1();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private boolean j = true;

    /* renamed from: xa1$a */
    public interface a {
        void a(ya1 ya1, Matrix matrix, int i);

        void b(ya1 ya1, Matrix matrix, int i);
    }

    /* renamed from: xa1$b */
    static final class b {
        public final wa1 a;
        public final Path b;
        public final RectF c;
        public final a d;
        public final float e;

        b(wa1 wa1, float f, RectF rectF, a aVar, Path path) {
            this.d = aVar;
            this.a = wa1;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public xa1() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new ya1();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    private float a(int i2) {
        return (float) ((i2 + 1) * 90);
    }

    private void b(b bVar, int i2) {
        this.h[0] = this.a[i2].k();
        this.h[1] = this.a[i2].l();
        this.b[i2].mapPoints(this.h);
        Path path = bVar.b;
        float[] fArr = this.h;
        if (i2 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.a[i2].d(this.b[i2], bVar.b);
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.a(this.a[i2], this.b[i2], i2);
        }
    }

    private void c(b bVar, int i2) {
        Path path;
        Matrix matrix;
        ya1 ya1;
        int i3 = (i2 + 1) % 4;
        this.h[0] = this.a[i2].i();
        this.h[1] = this.a[i2].j();
        this.b[i2].mapPoints(this.h);
        this.i[0] = this.a[i3].k();
        this.i[1] = this.a[i3].l();
        this.b[i3].mapPoints(this.i);
        float[] fArr = this.h;
        float f2 = fArr[0];
        float[] fArr2 = this.i;
        float max = Math.max(((float) Math.hypot((double) (f2 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, Utils.FLOAT_EPSILON);
        float i4 = i(bVar.c, i2);
        this.g.n(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        pa1 j2 = j(i2, bVar.a);
        j2.c(max, i4, bVar.e, this.g);
        Path path2 = new Path();
        this.g.d(this.c[i2], path2);
        if (!this.j || Build.VERSION.SDK_INT < 19 || (!j2.b() && !k(path2, i2) && !k(path2, i3))) {
            ya1 = this.g;
            matrix = this.c[i2];
            path = bVar.b;
        } else {
            path2.op(path2, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.c[i2].mapPoints(this.h);
            Path path3 = this.e;
            float[] fArr3 = this.h;
            path3.moveTo(fArr3[0], fArr3[1]);
            ya1 = this.g;
            matrix = this.c[i2];
            path = this.e;
        }
        ya1.d(matrix, path);
        a aVar = bVar.d;
        if (aVar != null) {
            aVar.b(this.g, this.c[i2], i2);
        }
    }

    private void f(int i2, RectF rectF, PointF pointF) {
        float f2;
        float f3;
        float f4;
        if (i2 == 1) {
            f4 = rectF.right;
            f3 = rectF.bottom;
        } else if (i2 != 2) {
            f2 = i2 != 3 ? rectF.right : rectF.left;
            f3 = rectF.top;
        } else {
            f4 = rectF.left;
            f3 = rectF.bottom;
        }
        pointF.set(f2, f3);
    }

    private ma1 g(int i2, wa1 wa1) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? wa1.t() : wa1.r() : wa1.j() : wa1.l();
    }

    private na1 h(int i2, wa1 wa1) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? wa1.s() : wa1.q() : wa1.i() : wa1.k();
    }

    private float i(RectF rectF, int i2) {
        float centerX;
        float f2;
        float[] fArr = this.h;
        ya1[] ya1Arr = this.a;
        fArr[0] = ya1Arr[i2].c;
        fArr[1] = ya1Arr[i2].d;
        this.b[i2].mapPoints(fArr);
        if (i2 == 1 || i2 == 3) {
            centerX = rectF.centerX();
            f2 = this.h[0];
        } else {
            centerX = rectF.centerY();
            f2 = this.h[1];
        }
        return Math.abs(centerX - f2);
    }

    private pa1 j(int i2, wa1 wa1) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? wa1.o() : wa1.p() : wa1.n() : wa1.h();
    }

    private boolean k(Path path, int i2) {
        Path path2 = new Path();
        this.a[i2].d(this.b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void l(b bVar, int i2) {
        h(i2, bVar.a).b(this.a[i2], 90.0f, bVar.e, bVar.c, g(i2, bVar.a));
        float a2 = a(i2);
        this.b[i2].reset();
        f(i2, bVar.c, this.d);
        Matrix matrix = this.b[i2];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i2].preRotate(a2);
    }

    private void m(int i2) {
        this.h[0] = this.a[i2].i();
        this.h[1] = this.a[i2].j();
        this.b[i2].mapPoints(this.h);
        float a2 = a(i2);
        this.c[i2].reset();
        Matrix matrix = this.c[i2];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i2].preRotate(a2);
    }

    public void d(wa1 wa1, float f2, RectF rectF, Path path) {
        e(wa1, f2, rectF, (a) null, path);
    }

    public void e(wa1 wa1, float f2, RectF rectF, a aVar, Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        b bVar = new b(wa1, f2, rectF, aVar, path);
        for (int i2 = 0; i2 < 4; i2++) {
            l(bVar, i2);
            m(i2);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            b(bVar, i3);
            c(bVar, i3);
        }
        path.close();
        this.e.close();
        if (Build.VERSION.SDK_INT >= 19 && !this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }
}
