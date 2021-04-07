package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.R$attr;
import defpackage.wa1;
import defpackage.xa1;
import defpackage.ya1;
import java.util.BitSet;

/* renamed from: ra1  reason: default package */
public class ra1 extends Drawable implements androidx.core.graphics.drawable.b, za1 {
    private static final String A = ra1.class.getSimpleName();
    private static final Paint B = new Paint(1);
    private c e;
    /* access modifiers changed from: private */
    public final ya1.g[] f;
    /* access modifiers changed from: private */
    public final ya1.g[] g;
    /* access modifiers changed from: private */
    public final BitSet h;
    /* access modifiers changed from: private */
    public boolean i;
    private final Matrix j;
    private final Path k;
    private final Path l;
    private final RectF m;
    private final RectF n;
    private final Region o;
    private final Region p;
    private wa1 q;
    private final Paint r;
    private final Paint s;
    private final ia1 t;
    private final xa1.a u;
    private final xa1 v;
    private PorterDuffColorFilter w;
    private PorterDuffColorFilter x;
    private final RectF y;
    private boolean z;

    /* renamed from: ra1$a */
    class a implements xa1.a {
        a() {
        }

        public void a(ya1 ya1, Matrix matrix, int i) {
            ra1.this.h.set(i, ya1.e());
            ra1.this.f[i] = ya1.f(matrix);
        }

        public void b(ya1 ya1, Matrix matrix, int i) {
            ra1.this.h.set(i + 4, ya1.e());
            ra1.this.g[i] = ya1.f(matrix);
        }
    }

    /* renamed from: ra1$b */
    class b implements wa1.c {
        final /* synthetic */ float a;

        b(ra1 ra1, float f) {
            this.a = f;
        }

        public ma1 a(ma1 ma1) {
            return ma1 instanceof ua1 ? ma1 : new la1(this.a, ma1);
        }
    }

    /* renamed from: ra1$c */
    static final class c extends Drawable.ConstantState {
        public wa1 a;
        public w91 b;
        public ColorFilter c;
        public ColorStateList d = null;
        public ColorStateList e = null;
        public ColorStateList f = null;
        public ColorStateList g = null;
        public PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
        public Rect i = null;
        public float j = 1.0f;
        public float k = 1.0f;
        public float l;
        public int m = 255;
        public float n = Utils.FLOAT_EPSILON;
        public float o = Utils.FLOAT_EPSILON;
        public float p = Utils.FLOAT_EPSILON;
        public int q = 0;
        public int r = 0;
        public int s = 0;
        public int t = 0;
        public boolean u = false;
        public Paint.Style v = Paint.Style.FILL_AND_STROKE;

        public c(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.l = cVar.l;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f = cVar.f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }

        public c(wa1 wa1, w91 w91) {
            this.a = wa1;
            this.b = w91;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            ra1 ra1 = new ra1(this, (a) null);
            boolean unused = ra1.i = true;
            return ra1;
        }
    }

    public ra1() {
        this(new wa1());
    }

    public ra1(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(wa1.e(context, attributeSet, i2, i3).m());
    }

    private ra1(c cVar) {
        this.f = new ya1.g[4];
        this.g = new ya1.g[4];
        this.h = new BitSet(8);
        this.j = new Matrix();
        this.k = new Path();
        this.l = new Path();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new Region();
        this.p = new Region();
        this.r = new Paint(1);
        this.s = new Paint(1);
        this.t = new ia1();
        this.v = new xa1();
        this.y = new RectF();
        this.z = true;
        this.e = cVar;
        this.s.setStyle(Paint.Style.STROKE);
        this.r.setStyle(Paint.Style.FILL);
        B.setColor(-1);
        B.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        m0();
        l0(getState());
        this.u = new a();
    }

    /* synthetic */ ra1(c cVar, a aVar) {
        this(cVar);
    }

    public ra1(wa1 wa1) {
        this(new c(wa1, (w91) null));
    }

    private float E() {
        return M() ? this.s.getStrokeWidth() / 2.0f : Utils.FLOAT_EPSILON;
    }

    private boolean K() {
        c cVar = this.e;
        int i2 = cVar.q;
        return i2 != 1 && cVar.r > 0 && (i2 == 2 || U());
    }

    private boolean L() {
        Paint.Style style = this.e.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean M() {
        Paint.Style style = this.e.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.s.getStrokeWidth() > Utils.FLOAT_EPSILON;
    }

    private void O() {
        super.invalidateSelf();
    }

    private void R(Canvas canvas) {
        if (K()) {
            canvas.save();
            T(canvas);
            if (!this.z) {
                n(canvas);
            } else {
                int width = (int) (this.y.width() - ((float) getBounds().width()));
                int height = (int) (this.y.height() - ((float) getBounds().height()));
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.y.width()) + (this.e.r * 2) + width, ((int) this.y.height()) + (this.e.r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f2 = (float) ((getBounds().left - this.e.r) - width);
                float f3 = (float) ((getBounds().top - this.e.r) - height);
                canvas2.translate(-f2, -f3);
                n(canvas2);
                canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
                createBitmap.recycle();
            }
            canvas.restore();
        }
    }

    private static int S(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    private void T(Canvas canvas) {
        int A2 = A();
        int B2 = B();
        if (Build.VERSION.SDK_INT < 21 && this.z) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.e.r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(A2, B2);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate((float) A2, (float) B2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.PorterDuffColorFilter f(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.l(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra1.f(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.e.j != 1.0f) {
            this.j.reset();
            Matrix matrix = this.j;
            float f2 = this.e.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.j);
        }
        path.computeBounds(this.y, true);
    }

    private void i() {
        wa1 y2 = D().y(new b(this, -E()));
        this.q = y2;
        this.v.d(y2, this.e.k, v(), this.l);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z2) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        return (colorStateList == null || mode == null) ? f(paint, z2) : j(colorStateList, mode, z2);
    }

    private int l(int i2) {
        float J = J() + z();
        w91 w91 = this.e.b;
        return w91 != null ? w91.c(i2, J) : i2;
    }

    private boolean l0(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.e.d == null || (color2 = this.r.getColor()) == (colorForState2 = this.e.d.getColorForState(iArr, color2))) {
            z2 = false;
        } else {
            this.r.setColor(colorForState2);
            z2 = true;
        }
        if (this.e.e == null || (color = this.s.getColor()) == (colorForState = this.e.e.getColorForState(iArr, color))) {
            return z2;
        }
        this.s.setColor(colorForState);
        return true;
    }

    public static ra1 m(Context context, float f2) {
        int c2 = t91.c(context, R$attr.colorSurface, ra1.class.getSimpleName());
        ra1 ra1 = new ra1();
        ra1.N(context);
        ra1.Y(ColorStateList.valueOf(c2));
        ra1.X(f2);
        return ra1;
    }

    private boolean m0() {
        PorterDuffColorFilter porterDuffColorFilter = this.w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.x;
        c cVar = this.e;
        this.w = k(cVar.g, cVar.h, this.r, true);
        c cVar2 = this.e;
        this.x = k(cVar2.f, cVar2.h, this.s, false);
        c cVar3 = this.e;
        if (cVar3.u) {
            this.t.d(cVar3.g.getColorForState(getState(), 0));
        }
        return !p3.a(porterDuffColorFilter, this.w) || !p3.a(porterDuffColorFilter2, this.x);
    }

    private void n(Canvas canvas) {
        int cardinality = this.h.cardinality();
        if (this.e.s != 0) {
            canvas.drawPath(this.k, this.t.c());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f[i2].b(this.t, this.e.r, canvas);
            this.g[i2].b(this.t, this.e.r, canvas);
        }
        if (this.z) {
            int A2 = A();
            int B2 = B();
            canvas.translate((float) (-A2), (float) (-B2));
            canvas.drawPath(this.k, B);
            canvas.translate((float) A2, (float) B2);
        }
    }

    private void n0() {
        float J = J();
        this.e.r = (int) Math.ceil((double) (0.75f * J));
        this.e.s = (int) Math.ceil((double) (J * 0.25f));
        m0();
        O();
    }

    private void o(Canvas canvas) {
        q(canvas, this.r, this.k, this.e.a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, wa1 wa1, RectF rectF) {
        if (wa1.u(rectF)) {
            float a2 = wa1.t().a(rectF) * this.e.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void r(Canvas canvas) {
        q(canvas, this.s, this.l, this.q, v());
    }

    private RectF v() {
        this.n.set(u());
        float E = E();
        this.n.inset(E, E);
        return this.n;
    }

    public int A() {
        c cVar = this.e;
        return (int) (((double) cVar.s) * Math.sin(Math.toRadians((double) cVar.t)));
    }

    public int B() {
        c cVar = this.e;
        return (int) (((double) cVar.s) * Math.cos(Math.toRadians((double) cVar.t)));
    }

    public int C() {
        return this.e.r;
    }

    public wa1 D() {
        return this.e.a;
    }

    public ColorStateList F() {
        return this.e.g;
    }

    public float G() {
        return this.e.a.r().a(u());
    }

    public float H() {
        return this.e.a.t().a(u());
    }

    public float I() {
        return this.e.p;
    }

    public float J() {
        return w() + I();
    }

    public void N(Context context) {
        this.e.b = new w91(context);
        n0();
    }

    public boolean P() {
        w91 w91 = this.e.b;
        return w91 != null && w91.d();
    }

    public boolean Q() {
        return this.e.a.u(u());
    }

    public boolean U() {
        return Build.VERSION.SDK_INT < 21 || (!Q() && !this.k.isConvex() && Build.VERSION.SDK_INT < 29);
    }

    public void V(float f2) {
        setShapeAppearanceModel(this.e.a.w(f2));
    }

    public void W(ma1 ma1) {
        setShapeAppearanceModel(this.e.a.x(ma1));
    }

    public void X(float f2) {
        c cVar = this.e;
        if (cVar.o != f2) {
            cVar.o = f2;
            n0();
        }
    }

    public void Y(ColorStateList colorStateList) {
        c cVar = this.e;
        if (cVar.d != colorStateList) {
            cVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public void Z(float f2) {
        c cVar = this.e;
        if (cVar.k != f2) {
            cVar.k = f2;
            this.i = true;
            invalidateSelf();
        }
    }

    public void a0(int i2, int i3, int i4, int i5) {
        c cVar = this.e;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.e.i.set(i2, i3, i4, i5);
        invalidateSelf();
    }

    public void b0(Paint.Style style) {
        this.e.v = style;
        O();
    }

    public void c0(float f2) {
        c cVar = this.e;
        if (cVar.n != f2) {
            cVar.n = f2;
            n0();
        }
    }

    public void d0(boolean z2) {
        this.z = z2;
    }

    public void draw(Canvas canvas) {
        this.r.setColorFilter(this.w);
        int alpha = this.r.getAlpha();
        this.r.setAlpha(S(alpha, this.e.m));
        this.s.setColorFilter(this.x);
        this.s.setStrokeWidth(this.e.l);
        int alpha2 = this.s.getAlpha();
        this.s.setAlpha(S(alpha2, this.e.m));
        if (this.i) {
            i();
            g(u(), this.k);
            this.i = false;
        }
        R(canvas);
        if (L()) {
            o(canvas);
        }
        if (M()) {
            r(canvas);
        }
        this.r.setAlpha(alpha);
        this.s.setAlpha(alpha2);
    }

    public void e0(int i2) {
        this.t.d(i2);
        this.e.u = false;
        O();
    }

    public void f0(int i2) {
        c cVar = this.e;
        if (cVar.t != i2) {
            cVar.t = i2;
            O();
        }
    }

    public void g0(int i2) {
        c cVar = this.e;
        if (cVar.q != i2) {
            cVar.q = i2;
            O();
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.e;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.e.q != 2) {
            if (Q()) {
                outline.setRoundRect(getBounds(), G() * this.e.k);
                return;
            }
            g(u(), this.k);
            if (this.k.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.k);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.e.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.o.set(getBounds());
        g(u(), this.k);
        this.p.setPath(this.k, this.o);
        this.o.op(this.p, Region.Op.DIFFERENCE);
        return this.o;
    }

    /* access modifiers changed from: protected */
    public final void h(RectF rectF, Path path) {
        xa1 xa1 = this.v;
        c cVar = this.e;
        wa1 wa1 = cVar.a;
        float f2 = cVar.k;
        xa1.e(wa1, f2, rectF, this.u, path);
    }

    public void h0(float f2, int i2) {
        k0(f2);
        j0(ColorStateList.valueOf(i2));
    }

    public void i0(float f2, ColorStateList colorStateList) {
        k0(f2);
        j0(colorStateList);
    }

    public void invalidateSelf() {
        this.i = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.e.e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.e.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.e.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.e.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            ra1$c r0 = r1.e
            android.content.res.ColorStateList r0 = r0.g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            ra1$c r0 = r1.e
            android.content.res.ColorStateList r0 = r0.f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            ra1$c r0 = r1.e
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            ra1$c r0 = r1.e
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra1.isStateful():boolean");
    }

    public void j0(ColorStateList colorStateList) {
        c cVar = this.e;
        if (cVar.e != colorStateList) {
            cVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public void k0(float f2) {
        this.e.l = f2;
        invalidateSelf();
    }

    public Drawable mutate() {
        this.e = new c(this.e);
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.i = true;
        super.onBoundsChange(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z2 = l0(iArr) || m0();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.e.a, rectF);
    }

    public float s() {
        return this.e.a.j().a(u());
    }

    public void setAlpha(int i2) {
        c cVar = this.e;
        if (cVar.m != i2) {
            cVar.m = i2;
            O();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.e.c = colorFilter;
        O();
    }

    public void setShapeAppearanceModel(wa1 wa1) {
        this.e.a = wa1;
        invalidateSelf();
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.e.g = colorStateList;
        m0();
        O();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.e;
        if (cVar.h != mode) {
            cVar.h = mode;
            m0();
            O();
        }
    }

    public float t() {
        return this.e.a.l().a(u());
    }

    /* access modifiers changed from: protected */
    public RectF u() {
        this.m.set(getBounds());
        return this.m;
    }

    public float w() {
        return this.e.o;
    }

    public ColorStateList x() {
        return this.e.d;
    }

    public float y() {
        return this.e.k;
    }

    public float z() {
        return this.e.n;
    }
}
