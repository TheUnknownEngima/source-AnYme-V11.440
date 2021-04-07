package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$styleable;

/* renamed from: wa1  reason: default package */
public class wa1 {
    public static final ma1 m = new ua1(0.5f);
    na1 a;
    na1 b;
    na1 c;
    na1 d;
    ma1 e;
    ma1 f;
    ma1 g;
    ma1 h;
    pa1 i;
    pa1 j;
    pa1 k;
    pa1 l;

    /* renamed from: wa1$b */
    public static final class b {
        /* access modifiers changed from: private */
        public na1 a = sa1.b();
        /* access modifiers changed from: private */
        public na1 b = sa1.b();
        /* access modifiers changed from: private */
        public na1 c = sa1.b();
        /* access modifiers changed from: private */
        public na1 d = sa1.b();
        /* access modifiers changed from: private */
        public ma1 e = new ka1(Utils.FLOAT_EPSILON);
        /* access modifiers changed from: private */
        public ma1 f = new ka1(Utils.FLOAT_EPSILON);
        /* access modifiers changed from: private */
        public ma1 g = new ka1(Utils.FLOAT_EPSILON);
        /* access modifiers changed from: private */
        public ma1 h = new ka1(Utils.FLOAT_EPSILON);
        /* access modifiers changed from: private */
        public pa1 i = sa1.c();
        /* access modifiers changed from: private */
        public pa1 j = sa1.c();
        /* access modifiers changed from: private */
        public pa1 k = sa1.c();
        /* access modifiers changed from: private */
        public pa1 l = sa1.c();

        public b() {
        }

        public b(wa1 wa1) {
            this.a = wa1.a;
            this.b = wa1.b;
            this.c = wa1.c;
            this.d = wa1.d;
            this.e = wa1.e;
            this.f = wa1.f;
            this.g = wa1.g;
            this.h = wa1.h;
            this.i = wa1.i;
            this.j = wa1.j;
            this.k = wa1.k;
            this.l = wa1.l;
        }

        private static float n(na1 na1) {
            if (na1 instanceof va1) {
                return ((va1) na1).a;
            }
            if (na1 instanceof oa1) {
                return ((oa1) na1).a;
            }
            return -1.0f;
        }

        public b A(ma1 ma1) {
            this.g = ma1;
            return this;
        }

        public b B(pa1 pa1) {
            this.i = pa1;
            return this;
        }

        public b C(int i2, ma1 ma1) {
            D(sa1.a(i2));
            F(ma1);
            return this;
        }

        public b D(na1 na1) {
            this.a = na1;
            float n = n(na1);
            if (n != -1.0f) {
                E(n);
            }
            return this;
        }

        public b E(float f2) {
            this.e = new ka1(f2);
            return this;
        }

        public b F(ma1 ma1) {
            this.e = ma1;
            return this;
        }

        public b G(int i2, ma1 ma1) {
            H(sa1.a(i2));
            J(ma1);
            return this;
        }

        public b H(na1 na1) {
            this.b = na1;
            float n = n(na1);
            if (n != -1.0f) {
                I(n);
            }
            return this;
        }

        public b I(float f2) {
            this.f = new ka1(f2);
            return this;
        }

        public b J(ma1 ma1) {
            this.f = ma1;
            return this;
        }

        public wa1 m() {
            return new wa1(this);
        }

        public b o(float f2) {
            E(f2);
            I(f2);
            z(f2);
            v(f2);
            return this;
        }

        public b p(ma1 ma1) {
            F(ma1);
            J(ma1);
            A(ma1);
            w(ma1);
            return this;
        }

        public b q(int i2, float f2) {
            r(sa1.a(i2));
            o(f2);
            return this;
        }

        public b r(na1 na1) {
            D(na1);
            H(na1);
            y(na1);
            u(na1);
            return this;
        }

        public b s(pa1 pa1) {
            this.k = pa1;
            return this;
        }

        public b t(int i2, ma1 ma1) {
            u(sa1.a(i2));
            w(ma1);
            return this;
        }

        public b u(na1 na1) {
            this.d = na1;
            float n = n(na1);
            if (n != -1.0f) {
                v(n);
            }
            return this;
        }

        public b v(float f2) {
            this.h = new ka1(f2);
            return this;
        }

        public b w(ma1 ma1) {
            this.h = ma1;
            return this;
        }

        public b x(int i2, ma1 ma1) {
            y(sa1.a(i2));
            A(ma1);
            return this;
        }

        public b y(na1 na1) {
            this.c = na1;
            float n = n(na1);
            if (n != -1.0f) {
                z(n);
            }
            return this;
        }

        public b z(float f2) {
            this.g = new ka1(f2);
            return this;
        }
    }

    /* renamed from: wa1$c */
    public interface c {
        ma1 a(ma1 ma1);
    }

    public wa1() {
        this.a = sa1.b();
        this.b = sa1.b();
        this.c = sa1.b();
        this.d = sa1.b();
        this.e = new ka1(Utils.FLOAT_EPSILON);
        this.f = new ka1(Utils.FLOAT_EPSILON);
        this.g = new ka1(Utils.FLOAT_EPSILON);
        this.h = new ka1(Utils.FLOAT_EPSILON);
        this.i = sa1.c();
        this.j = sa1.c();
        this.k = sa1.c();
        this.l = sa1.c();
    }

    private wa1(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i2, int i3) {
        return c(context, i2, i3, 0);
    }

    private static b c(Context context, int i2, int i3, int i4) {
        return d(context, i2, i3, new ka1((float) i4));
    }

    private static b d(Context context, int i2, int i3, ma1 ma1) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, R$styleable.ShapeAppearance);
        try {
            int i4 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamily, 0);
            int i5 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopLeft, i4);
            int i6 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyTopRight, i4);
            int i7 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomRight, i4);
            int i8 = obtainStyledAttributes.getInt(R$styleable.ShapeAppearance_cornerFamilyBottomLeft, i4);
            ma1 m2 = m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSize, ma1);
            ma1 m3 = m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopLeft, m2);
            ma1 m4 = m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeTopRight, m2);
            ma1 m5 = m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomRight, m2);
            ma1 m6 = m(obtainStyledAttributes, R$styleable.ShapeAppearance_cornerSizeBottomLeft, m2);
            b bVar = new b();
            bVar.C(i5, m3);
            bVar.G(i6, m4);
            bVar.x(i7, m5);
            bVar.t(i8, m6);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i2, int i3) {
        return f(context, attributeSet, i2, i3, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return g(context, attributeSet, i2, i3, new ka1((float) i4));
    }

    public static b g(Context context, AttributeSet attributeSet, int i2, int i3, ma1 ma1) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, ma1);
    }

    private static ma1 m(TypedArray typedArray, int i2, ma1 ma1) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return ma1;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new ka1((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new ua1(peekValue.getFraction(1.0f, 1.0f)) : ma1;
    }

    public pa1 h() {
        return this.k;
    }

    public na1 i() {
        return this.d;
    }

    public ma1 j() {
        return this.h;
    }

    public na1 k() {
        return this.c;
    }

    public ma1 l() {
        return this.g;
    }

    public pa1 n() {
        return this.l;
    }

    public pa1 o() {
        return this.j;
    }

    public pa1 p() {
        return this.i;
    }

    public na1 q() {
        return this.a;
    }

    public ma1 r() {
        return this.e;
    }

    public na1 s() {
        return this.b;
    }

    public ma1 t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        Class<pa1> cls = pa1.class;
        boolean z = this.l.getClass().equals(cls) && this.j.getClass().equals(cls) && this.i.getClass().equals(cls) && this.k.getClass().equals(cls);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof va1) && (this.a instanceof va1) && (this.c instanceof va1) && (this.d instanceof va1));
    }

    public b v() {
        return new b(this);
    }

    public wa1 w(float f2) {
        b v = v();
        v.o(f2);
        return v.m();
    }

    public wa1 x(ma1 ma1) {
        b v = v();
        v.p(ma1);
        return v.m();
    }

    public wa1 y(c cVar) {
        b v = v();
        v.F(cVar.a(r()));
        v.J(cVar.a(t()));
        v.w(cVar.a(j()));
        v.A(cVar.a(l()));
        return v.m();
    }
}
