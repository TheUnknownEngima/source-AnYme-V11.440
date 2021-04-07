package defpackage;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: iw1  reason: default package */
public final class iw1 implements ViewPager.j {
    private final float a;
    private final float b;

    public iw1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public void a(View view, float f) {
        v62.e(view, "page");
        if (f >= ((float) -1)) {
            float f2 = (float) 1;
            if (f <= f2) {
                view.setScaleX(Math.max(this.a, f2 - Math.abs(f)));
                view.setScaleY(Math.max(this.a, f2 - Math.abs(f)));
                view.setAlpha(Math.max(this.b, f2 - Math.abs(f)));
                return;
            }
        }
        view.setAlpha(Utils.FLOAT_EPSILON);
    }
}
