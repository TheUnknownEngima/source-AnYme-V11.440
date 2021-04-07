package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.github.mikephil.charting.utils.Utils;

public class Explode extends Visibility {
    private static final TimeInterpolator Q = new DecelerateInterpolator();
    private static final TimeInterpolator R = new AccelerateInterpolator();
    private int[] P = new int[2];

    public Explode() {
        t0(new c());
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        t0(new c());
    }

    private static float G0(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    private static float H0(View view, int i, int i2) {
        return G0((float) Math.max(i, view.getWidth() - i), (float) Math.max(i2, view.getHeight() - i2));
    }

    private void I0(View view, Rect rect, int[] iArr) {
        int i;
        int i2;
        View view2 = view;
        view2.getLocationOnScreen(this.P);
        int[] iArr2 = this.P;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        Rect x = x();
        if (x == null) {
            i2 = (view.getWidth() / 2) + i3 + Math.round(view.getTranslationX());
            i = (view.getHeight() / 2) + i4 + Math.round(view.getTranslationY());
        } else {
            int centerX = x.centerX();
            i = x.centerY();
            i2 = centerX;
        }
        float centerX2 = (float) (rect.centerX() - i2);
        float centerY = (float) (rect.centerY() - i);
        if (centerX2 == Utils.FLOAT_EPSILON && centerY == Utils.FLOAT_EPSILON) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float G0 = G0(centerX2, centerY);
        float H0 = H0(view2, i2 - i3, i - i4);
        iArr[0] = Math.round((centerX2 / G0) * H0);
        iArr[1] = Math.round(H0 * (centerY / G0));
    }

    private void x0(x xVar) {
        View view = xVar.b;
        view.getLocationOnScreen(this.P);
        int[] iArr = this.P;
        int i = iArr[0];
        int i2 = iArr[1];
        xVar.a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    public Animator A0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        if (xVar2 == null) {
            return null;
        }
        Rect rect = (Rect) xVar2.a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        I0(viewGroup, rect, this.P);
        int[] iArr = this.P;
        return z.a(view, xVar2, rect.left, rect.top, translationX + ((float) iArr[0]), translationY + ((float) iArr[1]), translationX, translationY, Q, this);
    }

    public Animator D0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        float f;
        float f2;
        if (xVar == null) {
            return null;
        }
        Rect rect = (Rect) xVar.a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) xVar.b.getTag(R$id.transition_position);
        if (iArr != null) {
            f2 = ((float) (iArr[0] - rect.left)) + translationX;
            f = ((float) (iArr[1] - rect.top)) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f2 = translationX;
            f = translationY;
        }
        I0(viewGroup, rect, this.P);
        int[] iArr2 = this.P;
        return z.a(view, xVar, i, i2, translationX, translationY, f2 + ((float) iArr2[0]), f + ((float) iArr2[1]), R, this);
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
