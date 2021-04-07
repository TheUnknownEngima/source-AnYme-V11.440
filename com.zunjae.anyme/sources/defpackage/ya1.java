package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ya1  reason: default package */
public class ya1 {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List<f> g = new ArrayList();
    private final List<g> h = new ArrayList();
    private boolean i;

    /* renamed from: ya1$a */
    class a extends g {
        final /* synthetic */ List b;
        final /* synthetic */ Matrix c;

        a(ya1 ya1, List list, Matrix matrix) {
            this.b = list;
            this.c = matrix;
        }

        public void a(Matrix matrix, ia1 ia1, int i, Canvas canvas) {
            for (g a : this.b) {
                a.a(this.c, ia1, i, canvas);
            }
        }
    }

    /* renamed from: ya1$b */
    static class b extends g {
        private final d b;

        public b(d dVar) {
            this.b = dVar;
        }

        public void a(Matrix matrix, ia1 ia1, int i, Canvas canvas) {
            float h = this.b.m();
            float i2 = this.b.n();
            ia1.a(canvas, matrix, new RectF(this.b.k(), this.b.o(), this.b.l(), this.b.j()), i, h, i2);
        }
    }

    /* renamed from: ya1$c */
    static class c extends g {
        private final e b;
        private final float c;
        private final float d;

        public c(e eVar, float f, float f2) {
            this.b = eVar;
            this.c = f;
            this.d = f2;
        }

        public void a(Matrix matrix, ia1 ia1, int i, Canvas canvas) {
            RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) Math.hypot((double) (this.b.c - this.d), (double) (this.b.b - this.c)), Utils.FLOAT_EPSILON);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(c());
            ia1.b(canvas, matrix2, rectF, i);
        }

        /* access modifiers changed from: package-private */
        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.b.c - this.d) / (this.b.b - this.c))));
        }
    }

    /* renamed from: ya1$d */
    public static class d extends f {
        private static final RectF h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public d(float f2, float f3, float f4, float f5) {
            q(f2);
            u(f3);
            r(f4);
            p(f5);
        }

        /* access modifiers changed from: private */
        public float j() {
            return this.e;
        }

        /* access modifiers changed from: private */
        public float k() {
            return this.b;
        }

        /* access modifiers changed from: private */
        public float l() {
            return this.d;
        }

        /* access modifiers changed from: private */
        public float m() {
            return this.f;
        }

        /* access modifiers changed from: private */
        public float n() {
            return this.g;
        }

        /* access modifiers changed from: private */
        public float o() {
            return this.c;
        }

        private void p(float f2) {
            this.e = f2;
        }

        private void q(float f2) {
            this.b = f2;
        }

        private void r(float f2) {
            this.d = f2;
        }

        /* access modifiers changed from: private */
        public void s(float f2) {
            this.f = f2;
        }

        /* access modifiers changed from: private */
        public void t(float f2) {
            this.g = f2;
        }

        private void u(float f2) {
            this.c = f2;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            h.set(k(), o(), l(), j());
            path.arcTo(h, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: ya1$e */
    public static class e extends f {
        /* access modifiers changed from: private */
        public float b;
        /* access modifiers changed from: private */
        public float c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* renamed from: ya1$f */
    public static abstract class f {
        protected final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* renamed from: ya1$g */
    static abstract class g {
        static final Matrix a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, ia1 ia1, int i, Canvas canvas);

        public final void b(ia1 ia1, int i, Canvas canvas) {
            a(a, ia1, i, canvas);
        }
    }

    public ya1() {
        n(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
    }

    private void b(float f2) {
        if (g() != f2) {
            float g2 = ((f2 - g()) + 360.0f) % 360.0f;
            if (g2 <= 180.0f) {
                d dVar = new d(i(), j(), i(), j());
                dVar.s(g());
                dVar.t(g2);
                this.h.add(new b(dVar));
                p(f2);
            }
        }
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.h.add(gVar);
        p(f3);
    }

    private float g() {
        return this.e;
    }

    private float h() {
        return this.f;
    }

    private void p(float f2) {
        this.e = f2;
    }

    private void q(float f2) {
        this.f = f2;
    }

    private void r(float f2) {
        this.c = f2;
    }

    private void s(float f2) {
        this.d = f2;
    }

    private void t(float f2) {
        this.a = f2;
    }

    private void u(float f2) {
        this.b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < Utils.FLOAT_EPSILON;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = (double) f8;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.g.get(i2).a(matrix, path);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public g f(Matrix matrix) {
        b(h());
        return new a(this, new ArrayList(this.h), matrix);
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        float unused = eVar.b = f2;
        float unused2 = eVar.c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, Utils.FLOAT_EPSILON);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }
}
