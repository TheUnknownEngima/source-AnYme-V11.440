package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
    private static final TimeInterpolator Q = new DecelerateInterpolator();
    private static final TimeInterpolator R = new AccelerateInterpolator();
    private static final g S = new a();
    private static final g T = new b();
    private static final g U = new c();
    private static final g V = new d();
    private static final g W = new e();
    private static final g X = new f();
    private g P = X;

    static class a extends h {
        a() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    static class b extends h {
        b() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (o4.y(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX + width : translationX - width;
        }
    }

    static class c extends i {
        c() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    static class d extends h {
        d() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    static class e extends h {
        e() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (o4.y(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = (float) viewGroup.getWidth();
            return z ? translationX - width : translationX + width;
        }
    }

    static class f extends i {
        f() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    private static abstract class h implements g {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    private static abstract class i implements g {
        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        G0(80);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.f);
        int k = i2.k(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        G0(k);
    }

    private void x0(x xVar) {
        int[] iArr = new int[2];
        xVar.b.getLocationOnScreen(iArr);
        xVar.a.put("android:slide:screenPosition", iArr);
    }

    public Animator A0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        if (xVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) xVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return z.a(view, xVar2, iArr[0], iArr[1], this.P.b(viewGroup, view), this.P.a(viewGroup, view), translationX, translationY, Q, this);
    }

    public Animator D0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        if (xVar == null) {
            return null;
        }
        int[] iArr = (int[]) xVar.a.get("android:slide:screenPosition");
        return z.a(view, xVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.P.b(viewGroup, view), this.P.a(viewGroup, view), R, this);
    }

    public void G0(int i2) {
        g gVar;
        if (i2 == 3) {
            gVar = S;
        } else if (i2 == 5) {
            gVar = V;
        } else if (i2 == 48) {
            gVar = U;
        } else if (i2 == 80) {
            gVar = X;
        } else if (i2 == 8388611) {
            gVar = T;
        } else if (i2 == 8388613) {
            gVar = W;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.P = gVar;
        r rVar = new r();
        rVar.j(i2);
        t0(rVar);
    }

    public void j(x xVar) {
        super.j(xVar);
        x0(xVar);
    }

    public void p(x xVar) {
        super.p(xVar);
        x0(xVar);
    }
}
