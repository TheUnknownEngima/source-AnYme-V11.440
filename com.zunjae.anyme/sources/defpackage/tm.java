package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.Interpolator;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* renamed from: tm  reason: default package */
public class tm {

    /* renamed from: tm$a */
    static class a extends f {
        a(View view, e eVar) {
            super(view, eVar);
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
            view.setVisibility(0);
        }
    }

    /* renamed from: tm$b */
    static class b extends f {
        b(View view, e eVar) {
            super(view, eVar);
        }

        /* access modifiers changed from: package-private */
        public void b(View view) {
            view.setVisibility(8);
        }
    }

    /* renamed from: tm$c */
    static class c extends f {
        c(View view, e eVar) {
            super(view, eVar);
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
            view.setVisibility(0);
        }
    }

    /* renamed from: tm$d */
    static class d extends f {
        d(View view, e eVar) {
            super(view, eVar);
        }

        /* access modifiers changed from: package-private */
        public void b(View view) {
            view.setVisibility(8);
        }
    }

    /* renamed from: tm$e */
    public interface e {
        boolean a(View view);

        boolean b(View view);

        boolean c(View view);
    }

    /* renamed from: tm$f */
    private static class f extends AnimatorListenerAdapter {
        private View e;
        private e f;

        f(View view, e eVar) {
            this.e = view;
            this.f = eVar;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
        }

        /* access modifiers changed from: package-private */
        public void b(View view) {
        }

        /* access modifiers changed from: package-private */
        public void c(View view) {
        }

        public void onAnimationCancel(Animator animator) {
            e eVar = this.f;
            if (eVar == null || !eVar.a(this.e)) {
                a(this.e);
            }
        }

        public void onAnimationEnd(Animator animator) {
            e eVar = this.f;
            if (eVar == null || !eVar.b(this.e)) {
                b(this.e);
            }
        }

        public void onAnimationStart(Animator animator) {
            e eVar = this.f;
            if (eVar == null || !eVar.c(this.e)) {
                c(this.e);
            }
        }
    }

    public static float a(Point point, Point point2) {
        return (float) Math.sqrt(Math.pow((double) (point.x - point2.x), 2.0d) + Math.pow((double) (point.y - point2.y), 2.0d));
    }

    public static Animator b(View view, int i, e eVar) {
        if (view.getAlpha() == 1.0f) {
            view.setAlpha(Utils.FLOAT_EPSILON);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f});
        ofFloat.addListener(new c(view, eVar));
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(e());
        return ofFloat;
    }

    public static Animator c(View view, int i, e eVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f});
        ofFloat.addListener(new d(view, eVar));
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(e());
        return ofFloat;
    }

    protected static Point d(View view) {
        return new Point(view.getWidth() / 2, view.getHeight() / 2);
    }

    protected static Interpolator e() {
        return new u5();
    }

    protected static int f(Point point, View view) {
        ArrayList<Point> arrayList = new ArrayList<>();
        arrayList.add(new Point(view.getLeft(), view.getTop()));
        arrayList.add(new Point(view.getRight(), view.getTop()));
        arrayList.add(new Point(view.getLeft(), view.getBottom()));
        arrayList.add(new Point(view.getRight(), view.getBottom()));
        float f2 = Utils.FLOAT_EPSILON;
        for (Point a2 : arrayList) {
            float a3 = a(point, a2);
            if (a3 > f2) {
                f2 = a3;
            }
        }
        return (int) Math.ceil((double) f2);
    }

    public static Animator g(View view, int i, e eVar, Point point) {
        if (point == null) {
            point = d(view);
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, point.x, point.y, (float) f(point, view), Utils.FLOAT_EPSILON);
        createCircularReveal.addListener(new b(view, eVar));
        createCircularReveal.setDuration((long) i);
        createCircularReveal.setInterpolator(e());
        return createCircularReveal;
    }

    public static Animator h(View view, int i, e eVar, Point point) {
        return Build.VERSION.SDK_INT >= 21 ? g(view, i, eVar, point) : c(view, i, eVar);
    }

    static /* synthetic */ void i(View view, ValueAnimator valueAnimator) {
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.requestLayout();
    }

    public static Animator j(View view, int i, e eVar, Point point) {
        if (point == null) {
            point = d(view);
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, point.x, point.y, Utils.FLOAT_EPSILON, (float) f(point, view));
        createCircularReveal.addListener(new a(view, eVar));
        createCircularReveal.setDuration((long) i);
        createCircularReveal.setInterpolator(e());
        return createCircularReveal;
    }

    public static Animator k(View view, int i, e eVar, Point point) {
        return Build.VERSION.SDK_INT >= 21 ? j(view, i, eVar, point) : b(view, i, eVar);
    }

    public static Animator l(View view, int i, int i2, int i3) {
        return m(view, i, i2, i3, (e) null);
    }

    public static Animator m(View view, int i, int i2, int i3, e eVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new om(view));
        ofInt.addListener(new f(view, eVar));
        ofInt.setDuration((long) i3);
        ofInt.setInterpolator(e());
        return ofInt;
    }
}
