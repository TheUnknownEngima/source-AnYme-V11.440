package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;
import androidx.core.widget.h;

class AppCompatPopupWindow extends PopupWindow {
    private static final boolean b = (Build.VERSION.SDK_INT < 21);
    private boolean a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i, 0);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        g0 u = g0.u(context, attributeSet, R$styleable.PopupWindow, i, i2);
        if (u.r(R$styleable.PopupWindow_overlapAnchor)) {
            b(u.a(R$styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(u.g(R$styleable.PopupWindow_android_popupBackground));
        u.v();
    }

    private void b(boolean z) {
        if (b) {
            this.a = z;
        } else {
            h.a(this, z);
        }
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
