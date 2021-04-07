package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import defpackage.l2;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: e7  reason: default package */
public class e7 extends d7 {
    static final PorterDuff.Mode n = PorterDuff.Mode.SRC_IN;
    private h f;
    private PorterDuffColorFilter g;
    private ColorFilter h;
    private boolean i;
    private boolean j;
    private final float[] k;
    private final Matrix l;
    private final Rect m;

    /* renamed from: e7$b */
    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.a = l2.d(string2);
            }
            this.c = i2.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (i2.r(xmlPullParser, "pathData")) {
                TypedArray s = i2.s(resources, theme, attributeSet, w6.d);
                f(s, xmlPullParser);
                s.recycle();
            }
        }
    }

    /* renamed from: e7$c */
    private static class c extends f {
        private int[] e;
        d2 f;
        float g = Utils.FLOAT_EPSILON;
        d2 h;
        float i = 1.0f;
        float j = 1.0f;
        float k = Utils.FLOAT_EPSILON;
        float l = 1.0f;
        float m = Utils.FLOAT_EPSILON;
        Paint.Cap n = Paint.Cap.BUTT;
        Paint.Join o = Paint.Join.MITER;
        float p = 4.0f;

        c() {
        }

        c(c cVar) {
            super(cVar);
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.c = cVar.c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (i2.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.a = l2.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.h = i2.i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.j = i2.j(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
                this.n = e(i2.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
                this.o = f(i2.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
                this.p = i2.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
                this.f = i2.i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.i = i2.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
                this.g = i2.j(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
                this.l = i2.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
                this.m = i2.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
                this.k = i2.j(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
                this.c = i2.k(typedArray, xmlPullParser, "fillType", 13, this.c);
            }
        }

        public boolean a() {
            return this.h.i() || this.f.i();
        }

        public boolean b(int[] iArr) {
            return this.f.j(iArr) | this.h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = i2.s(resources, theme, attributeSet, w6.c);
            h(s, xmlPullParser, theme);
            s.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.h.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f.e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f2) {
            this.j = f2;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i2) {
            this.h.k(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f2) {
            this.i = f2;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i2) {
            this.f.k(i2);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f2) {
            this.g = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

    /* renamed from: e7$d */
    private static class d extends e {
        final Matrix a = new Matrix();
        final ArrayList<e> b = new ArrayList<>();
        float c = Utils.FLOAT_EPSILON;
        private float d = Utils.FLOAT_EPSILON;
        private float e = Utils.FLOAT_EPSILON;
        private float f = 1.0f;
        private float g = 1.0f;
        private float h = Utils.FLOAT_EPSILON;
        private float i = Utils.FLOAT_EPSILON;
        final Matrix j = new Matrix();
        int k;
        private int[] l;
        private String m = null;

        public d() {
            super();
        }

        public d(d dVar, b0<String, Object> b0Var) {
            super();
            f fVar;
            this.c = dVar.c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                b0Var.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.b.add(new d((d) eVar, b0Var));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(fVar);
                    String str2 = fVar.b;
                    if (str2 != null) {
                        b0Var.put(str2, fVar);
                    }
                }
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = i2.j(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = i2.j(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = i2.j(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = i2.j(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = i2.j(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            d();
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                if (this.b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z = false;
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                z |= this.b.get(i2).b(iArr);
            }
            return z;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s = i2.s(resources, theme, attributeSet, w6.b);
            e(s, xmlPullParser);
            s.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f) {
                this.f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                d();
            }
        }
    }

    /* renamed from: e7$e */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: e7$f */
    private static abstract class f extends e {
        protected l2.b[] a = null;
        String b;
        int c = 0;
        int d;

        public f() {
            super();
        }

        public f(f fVar) {
            super();
            this.b = fVar.b;
            this.d = fVar.d;
            this.a = l2.f(fVar.a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            l2.b[] bVarArr = this.a;
            if (bVarArr != null) {
                l2.b.e(bVarArr, path);
            }
        }

        public l2.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(l2.b[] bVarArr) {
            if (!l2.b(this.a, bVarArr)) {
                this.a = l2.f(bVarArr);
            } else {
                l2.j(this.a, bVarArr);
            }
        }
    }

    /* renamed from: e7$g */
    private static class g {
        private static final Matrix q = new Matrix();
        private final Path a;
        private final Path b;
        private final Matrix c;
        Paint d;
        Paint e;
        private PathMeasure f;
        private int g;
        final d h;
        float i;
        float j;
        float k;
        float l;
        int m;
        String n;
        Boolean o;
        final b0<String, Object> p;

        public g() {
            this.c = new Matrix();
            this.i = Utils.FLOAT_EPSILON;
            this.j = Utils.FLOAT_EPSILON;
            this.k = Utils.FLOAT_EPSILON;
            this.l = Utils.FLOAT_EPSILON;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new b0<>();
            this.h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        public g(g gVar) {
            this.c = new Matrix();
            this.i = Utils.FLOAT_EPSILON;
            this.j = Utils.FLOAT_EPSILON;
            this.k = Utils.FLOAT_EPSILON;
            this.l = Utils.FLOAT_EPSILON;
            this.m = 255;
            this.n = null;
            this.o = null;
            b0<String, Object> b0Var = new b0<>();
            this.p = b0Var;
            this.h = new d(gVar.h, b0Var);
            this.a = new Path(gVar.a);
            this.b = new Path(gVar.b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.a.set(matrix);
            dVar.a.preConcat(dVar.j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.b.size(); i4++) {
                e eVar = dVar.b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = ((float) i2) / this.k;
            float f3 = ((float) i3) / this.l;
            float min = Math.min(f2, f3);
            Matrix matrix = dVar.a;
            this.c.set(matrix);
            this.c.postScale(f2, f3);
            float e2 = e(matrix);
            if (e2 != Utils.FLOAT_EPSILON) {
                fVar.d(this.a);
                Path path = this.a;
                this.b.reset();
                if (fVar.c()) {
                    this.b.setFillType(fVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.b.addPath(path, this.c);
                    canvas.clipPath(this.b);
                    return;
                }
                c cVar = (c) fVar;
                if (!(cVar.k == Utils.FLOAT_EPSILON && cVar.l == 1.0f)) {
                    float f4 = cVar.k;
                    float f5 = cVar.m;
                    float f6 = (f4 + f5) % 1.0f;
                    float f7 = (cVar.l + f5) % 1.0f;
                    if (this.f == null) {
                        this.f = new PathMeasure();
                    }
                    this.f.setPath(this.a, false);
                    float length = this.f.getLength();
                    float f8 = f6 * length;
                    float f9 = f7 * length;
                    path.reset();
                    if (f8 > f9) {
                        this.f.getSegment(f8, length, path, true);
                        this.f.getSegment(Utils.FLOAT_EPSILON, f9, path, true);
                    } else {
                        this.f.getSegment(f8, f9, path, true);
                    }
                    path.rLineTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
                this.b.addPath(path, this.c);
                if (cVar.h.l()) {
                    d2 d2Var = cVar.h;
                    if (this.e == null) {
                        Paint paint = new Paint(1);
                        this.e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.e;
                    if (d2Var.h()) {
                        Shader f10 = d2Var.f();
                        f10.setLocalMatrix(this.c);
                        paint2.setShader(f10);
                        paint2.setAlpha(Math.round(cVar.j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(e7.a(d2Var.e(), cVar.j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.b.setFillType(cVar.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.b, paint2);
                }
                if (cVar.f.l()) {
                    d2 d2Var2 = cVar.f;
                    if (this.d == null) {
                        Paint paint3 = new Paint(1);
                        this.d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.d;
                    Paint.Join join = cVar.o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.p);
                    if (d2Var2.h()) {
                        Shader f11 = d2Var2.f();
                        f11.setLocalMatrix(this.c);
                        paint4.setShader(f11);
                        paint4.setAlpha(Math.round(cVar.i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(e7.a(d2Var2.e(), cVar.i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.g * min * e2);
                    canvas.drawPath(this.b, paint4);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {Utils.FLOAT_EPSILON, 1.0f, 1.0f, Utils.FLOAT_EPSILON};
            matrix.mapVectors(fArr);
            float a2 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            return max > Utils.FLOAT_EPSILON ? Math.abs(a2) / max : Utils.FLOAT_EPSILON;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.h, q, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = Boolean.valueOf(this.h.a());
            }
            return this.o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.m = i2;
        }
    }

    /* renamed from: e7$h */
    private static class h extends Drawable.ConstantState {
        int a;
        g b;
        ColorStateList c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public h() {
            this.c = null;
            this.d = e7.n;
            this.b = new g();
        }

        public h(h hVar) {
            this.c = null;
            this.d = e7.n;
            if (hVar != null) {
                this.a = hVar.a;
                g gVar = new g(hVar.b);
                this.b = gVar;
                if (hVar.b.e != null) {
                    gVar.e = new Paint(hVar.b.e);
                }
                if (hVar.b.d != null) {
                    this.b.d = new Paint(hVar.b.d);
                }
                this.c = hVar.c;
                this.d = hVar.d;
                this.e = hVar.e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f.getWidth() && i3 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f == null || !a(i2, i3)) {
                this.f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint = new Paint();
                this.l = paint;
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] iArr) {
            boolean g2 = this.b.g(iArr);
            this.k |= g2;
            return g2;
        }

        public void i() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public void j(int i2, int i3) {
            this.f.eraseColor(0);
            this.b.b(new Canvas(this.f), i2, i3, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new e7(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new e7(this);
        }
    }

    /* renamed from: e7$i */
    private static class i extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            e7 e7Var = new e7();
            e7Var.e = (VectorDrawable) this.a.newDrawable();
            return e7Var;
        }

        public Drawable newDrawable(Resources resources) {
            e7 e7Var = new e7();
            e7Var.e = (VectorDrawable) this.a.newDrawable(resources);
            return e7Var;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            e7 e7Var = new e7();
            e7Var.e = (VectorDrawable) this.a.newDrawable(resources, theme);
            return e7Var;
        }
    }

    e7() {
        this.j = true;
        this.k = new float[9];
        this.l = new Matrix();
        this.m = new Rect();
        this.f = new h();
    }

    e7(h hVar) {
        this.j = true;
        this.k = new float[9];
        this.l = new Matrix();
        this.m = new Rect();
        this.f = hVar;
        this.g = j(this.g, hVar.c, hVar.d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (((float) Color.alpha(i2)) * f2)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[Catch:{ IOException | XmlPullParserException -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037 A[Catch:{ IOException | XmlPullParserException -> 0x003f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.e7 b(android.content.res.Resources r4, int r5, android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001d
            e7 r0 = new e7
            r0.<init>()
            android.graphics.drawable.Drawable r4 = defpackage.h2.b(r4, r5, r6)
            r0.e = r4
            e7$i r4 = new e7$i
            android.graphics.drawable.Drawable r5 = r0.e
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            return r0
        L_0x001d:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x003f }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x003f }
        L_0x0025:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x003f }
            r2 = 2
            if (r1 == r2) goto L_0x0030
            r3 = 1
            if (r1 == r3) goto L_0x0030
            goto L_0x0025
        L_0x0030:
            if (r1 != r2) goto L_0x0037
            e7 r4 = c(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x003f }
            return r4
        L_0x0037:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x003f }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x003f }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x003f }
        L_0x003f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7.b(android.content.res.Resources, int, android.content.res.Resources$Theme):e7");
    }

    public static e7 c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        e7 e7Var = new e7();
        e7Var.inflate(resources, xmlPullParser, attributeSet, theme);
        return e7Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: e7$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: e7$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: e7$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: e7$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: e7$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
        /*
            r10 = this;
            e7$h r0 = r10.f
            e7$g r1 = r0.b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            e7$d r3 = r1.h
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            e7$d r7 = (defpackage.e7.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            e7$c r3 = new e7$c
            r3.<init>()
            r3.g(r11, r13, r14, r12)
            java.util.ArrayList<e7$e> r6 = r7.b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            b0<java.lang.String, java.lang.Object> r6 = r1.p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            e7$b r3 = new e7$b
            r3.<init>()
            r3.e(r11, r13, r14, r12)
            java.util.ArrayList<e7$e> r7 = r7.b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            b0<java.lang.String, java.lang.Object> r7 = r1.p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.a
            int r3 = r3.d
        L_0x0081:
            r3 = r3 | r7
            r0.a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            e7$d r3 = new e7$d
            r3.<init>()
            r3.c(r11, r13, r14, r12)
            java.util.ArrayList<e7$e> r7 = r7.b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            b0<java.lang.String, java.lang.Object> r7 = r1.p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.a
            int r3 = r3.k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7.e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f;
        g gVar = hVar.b;
        hVar.d = g(i2.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g2 = i2.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g2 != null) {
            hVar.c = g2;
        }
        hVar.e = i2.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.e);
        gVar.k = i2.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.k);
        float j2 = i2.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.l);
        gVar.l = j2;
        if (gVar.k <= Utils.FLOAT_EPSILON) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j2 > Utils.FLOAT_EPSILON) {
            gVar.i = typedArray.getDimension(3, gVar.i);
            float dimension = typedArray.getDimension(2, gVar.j);
            gVar.j = dimension;
            if (gVar.i <= Utils.FLOAT_EPSILON) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > Utils.FLOAT_EPSILON) {
                gVar.setAlpha(i2.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.n = string;
                    gVar.p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f.b.p.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.m);
        if (this.m.width() > 0 && this.m.height() > 0) {
            ColorFilter colorFilter = this.h;
            if (colorFilter == null) {
                colorFilter = this.g;
            }
            canvas.getMatrix(this.l);
            this.l.getValues(this.k);
            float abs = Math.abs(this.k[0]);
            float abs2 = Math.abs(this.k[4]);
            float abs3 = Math.abs(this.k[1]);
            float abs4 = Math.abs(this.k[3]);
            if (!(abs3 == Utils.FLOAT_EPSILON && abs4 == Utils.FLOAT_EPSILON)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.m.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.m.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.m;
                canvas.translate((float) rect.left, (float) rect.top);
                if (f()) {
                    canvas.translate((float) this.m.width(), Utils.FLOAT_EPSILON);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.m.offsetTo(0, 0);
                this.f.c(min, min2);
                if (!this.j) {
                    this.f.j(min, min2);
                } else if (!this.f.b()) {
                    this.f.j(min, min2);
                    this.f.i();
                }
                this.f.d(canvas, colorFilter, this.m);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.h;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.e != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.e.getConstantState());
        }
        this.f.a = getChangingConfigurations();
        return this.f;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f.b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f.b.i;
    }

    public int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z) {
        this.j = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f;
        hVar.b = new g();
        TypedArray s = i2.s(resources, theme, attributeSet, w6.a);
        i(s, xmlPullParser, theme);
        s.recycle();
        hVar.a = getChangingConfigurations();
        hVar.k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.g = j(this.g, hVar.c, hVar.d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.e
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            e7$h r0 = r1.f
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            e7$h r0 = r1.f
            android.content.res.ColorStateList r0 = r0.c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.i && super.mutate() == this) {
            this.f = new h(this.f);
            this.i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f;
        ColorStateList colorStateList = hVar.c;
        if (!(colorStateList == null || (mode = hVar.d) == null)) {
            this.g = j(this.g, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f.b.getRootAlpha() != i2) {
            this.f.b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z);
        } else {
            this.f.e = z;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.h = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f;
        if (hVar.c != colorStateList) {
            hVar.c = colorStateList;
            this.g = j(this.g, colorStateList, hVar.d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        h hVar = this.f;
        if (hVar.d != mode) {
            hVar.d = mode;
            this.g = j(this.g, hVar.c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
