package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import java.util.Map;

public class ChangeBounds extends Transition {
    private static final String[] Q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> R = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> S = new c(PointF.class, "topLeft");
    private static final Property<k, PointF> T = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> U = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> V = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> W = new g(PointF.class, "position");
    private static p X = new p();
    private int[] N = new int[2];
    private boolean O = false;
    private boolean P = false;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup e;
        final /* synthetic */ BitmapDrawable f;
        final /* synthetic */ View g;
        final /* synthetic */ float h;

        a(ChangeBounds changeBounds, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.e = viewGroup;
            this.f = bitmapDrawable;
            this.g = view;
            this.h = f2;
        }

        public void onAnimationEnd(Animator animator) {
            i0.b(this.e).b(this.f);
            i0.h(this.g, this.h);
        }
    }

    static class b extends Property<Drawable, PointF> {
        private Rect a = new Rect();

        b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.a);
            Rect rect = this.a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    }

    static class c extends Property<k, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            i0.g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            i0.g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            i0.g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    class h extends AnimatorListenerAdapter {
        final /* synthetic */ k e;
        private k mViewBounds = this.e;

        h(ChangeBounds changeBounds, k kVar) {
            this.e = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {
        private boolean e;
        final /* synthetic */ View f;
        final /* synthetic */ Rect g;
        final /* synthetic */ int h;
        final /* synthetic */ int i;
        final /* synthetic */ int j;
        final /* synthetic */ int k;

        i(ChangeBounds changeBounds, View view, Rect rect, int i2, int i3, int i4, int i5) {
            this.f = view;
            this.g = rect;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
        }

        public void onAnimationCancel(Animator animator) {
            this.e = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.e) {
                o4.o0(this.f, this.g);
                i0.g(this.f, this.h, this.i, this.j, this.k);
            }
        }
    }

    class j extends t {
        boolean e = false;
        final /* synthetic */ ViewGroup f;

        j(ChangeBounds changeBounds, ViewGroup viewGroup) {
            this.f = viewGroup;
        }

        public void b(Transition transition) {
            d0.d(this.f, false);
        }

        public void c(Transition transition) {
            if (!this.e) {
                d0.d(this.f, false);
            }
            transition.h0(this);
        }

        public void d(Transition transition) {
            d0.d(this.f, false);
            this.e = true;
        }

        public void e(Transition transition) {
            d0.d(this.f, true);
        }
    }

    private static class k {
        private int a;
        private int b;
        private int c;
        private int d;
        private View e;
        private int f;
        private int g;

        k(View view) {
            this.e = view;
        }

        private void b() {
            i0.g(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        /* access modifiers changed from: package-private */
        public void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        /* access modifiers changed from: package-private */
        public void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    public ChangeBounds() {
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.b);
        boolean e2 = i2.e(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        z0(e2);
    }

    private void x0(x xVar) {
        View view = xVar.b;
        if (o4.O(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            xVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            xVar.a.put("android:changeBounds:parent", xVar.b.getParent());
            if (this.P) {
                xVar.b.getLocationInWindow(this.N);
                xVar.a.put("android:changeBounds:windowX", Integer.valueOf(this.N[0]));
                xVar.a.put("android:changeBounds:windowY", Integer.valueOf(this.N[1]));
            }
            if (this.O) {
                xVar.a.put("android:changeBounds:clip", o4.r(view));
            }
        }
    }

    private boolean y0(View view, View view2) {
        if (!this.P) {
            return true;
        }
        x B = B(view, true);
        if (B == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == B.b) {
            return true;
        }
        return false;
    }

    public String[] R() {
        return Q;
    }

    public void j(x xVar) {
        x0(xVar);
    }

    public void p(x xVar) {
        x0(xVar);
    }

    public Animator t(ViewGroup viewGroup, x xVar, x xVar2) {
        int i2;
        View view;
        Animator animator;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        x xVar3 = xVar;
        x xVar4 = xVar2;
        if (xVar3 == null || xVar4 == null) {
            return null;
        }
        Map<String, Object> map = xVar3.a;
        Map<String, Object> map2 = xVar4.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = xVar4.b;
        if (y0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) xVar3.a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) xVar4.a.get("android:changeBounds:bounds");
            int i4 = rect2.left;
            int i5 = rect3.left;
            int i6 = rect2.top;
            int i7 = rect3.top;
            int i8 = rect2.right;
            int i9 = rect3.right;
            int i10 = rect2.bottom;
            int i11 = rect3.bottom;
            int i12 = i8 - i4;
            int i13 = i10 - i6;
            int i14 = i9 - i5;
            int i15 = i11 - i7;
            View view3 = view2;
            Rect rect4 = (Rect) xVar3.a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) xVar4.a.get("android:changeBounds:clip");
            if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
                i2 = 0;
            } else {
                i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
                if (!(i8 == i9 && i10 == i11)) {
                    i2++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i2++;
            }
            if (i2 <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.O) {
                view = view3;
                i0.g(view, i4, i6, i8, i10);
                if (i2 == 2) {
                    if (i12 == i14 && i13 == i15) {
                        path = D().a((float) i4, (float) i6, (float) i5, (float) i7);
                        property = W;
                    } else {
                        k kVar = new k(view);
                        ObjectAnimator a2 = m.a(kVar, S, D().a((float) i4, (float) i6, (float) i5, (float) i7));
                        ObjectAnimator a3 = m.a(kVar, T, D().a((float) i8, (float) i10, (float) i9, (float) i11));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a2, a3});
                        animatorSet.addListener(new h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i4 == i5 && i6 == i7) {
                    path = D().a((float) i8, (float) i10, (float) i9, (float) i11);
                    property = U;
                } else {
                    path = D().a((float) i4, (float) i6, (float) i5, (float) i7);
                    property = V;
                }
                animator = m.a(view, property, path);
            } else {
                view = view3;
                i0.g(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
                ObjectAnimator a4 = (i4 == i5 && i6 == i7) ? null : m.a(view, W, D().a((float) i4, (float) i6, (float) i5, (float) i7));
                if (rect7 == null) {
                    i3 = 0;
                    rect = new Rect(0, 0, i12, i13);
                } else {
                    i3 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i3, i3, i14, i15) : rect6;
                if (!rect.equals(rect8)) {
                    o4.o0(view, rect);
                    p pVar = X;
                    Object[] objArr = new Object[2];
                    objArr[i3] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", pVar, objArr);
                    ofObject.addListener(new i(this, view, rect6, i5, i7, i9, i11));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = w.c(a4, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                d0.d(viewGroup4, true);
                b(new j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) xVar3.a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) xVar3.a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) xVar4.a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) xVar4.a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.N);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c2 = i0.c(view2);
        i0.h(view2, Utils.FLOAT_EPSILON);
        i0.b(viewGroup).a(bitmapDrawable);
        PathMotion D = D();
        int[] iArr = this.N;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{o.a(R, D.a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new a(this, viewGroup, bitmapDrawable, view2, c2));
        return ofPropertyValuesHolder;
    }

    public void z0(boolean z) {
        this.O = z;
    }
}
