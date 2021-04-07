package com.mikepenz.iconics.view;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.core.widget.i;

public class IconicsCheckableTextView extends IconicsTextView implements Checkable {
    private static final int[] o = {16842912};
    protected xm1 j;
    private boolean k;
    private boolean l;
    private boolean m;
    private a n;

    public interface a {
        void a(IconicsCheckableTextView iconicsCheckableTextView, boolean z);
    }

    public IconicsCheckableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public IconicsCheckableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void h() {
        i.m(this, k(), l(), j(), i());
    }

    private StateListDrawable i() {
        return gn1.b(getContext(), this.i.d, this.j.d, this.k);
    }

    private StateListDrawable j() {
        return gn1.b(getContext(), this.i.c, this.j.c, this.k);
    }

    private StateListDrawable k() {
        return gn1.b(getContext(), this.i.a, this.j.a, this.k);
    }

    private StateListDrawable l() {
        return gn1.b(getContext(), this.i.b, this.j.b, this.k);
    }

    public void f(Context context, AttributeSet attributeSet, int i) {
        ym1.o(context, attributeSet, this.j);
        this.k = ym1.n(context, attributeSet);
    }

    public void g(Context context, AttributeSet attributeSet, int i) {
        this.j = new xm1();
        setFocusable(true);
        setClickable(true);
        super.f(context, attributeSet, i);
        f(context, attributeSet, i);
        h();
    }

    public CharSequence getAccessibilityClassName() {
        return IconicsCheckableTextView.class.getName();
    }

    public tm1 getCheckedIconicsDrawableBottom() {
        tm1 tm1 = this.j.d;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getCheckedIconicsDrawableEnd() {
        tm1 tm1 = this.j.c;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getCheckedIconicsDrawableStart() {
        tm1 tm1 = this.j.a;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getCheckedIconicsDrawableTop() {
        tm1 tm1 = this.j.b;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public boolean isChecked() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            TextView.mergeDrawableStates(onCreateDrawableState, o);
        }
        return onCreateDrawableState;
    }

    public boolean performClick() {
        toggle();
        boolean performClick = super.performClick();
        if (!performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    public void setChecked(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
            if (!this.m) {
                this.m = true;
                a aVar = this.n;
                if (aVar != null) {
                    aVar.a(this, this.l);
                }
                this.m = false;
            }
        }
    }

    public void setCheckedDrawableBottom(tm1 tm1) {
        this.j.d = tm1;
        h();
    }

    public void setCheckedDrawableEnd(tm1 tm1) {
        this.j.c = tm1;
        h();
    }

    public void setCheckedDrawableForAll(tm1 tm1) {
        xm1 xm1 = this.j;
        xm1.a = tm1;
        xm1.b = tm1;
        xm1.c = tm1;
        xm1.d = tm1;
        h();
    }

    public void setCheckedDrawableStart(tm1 tm1) {
        this.j.a = tm1;
        h();
    }

    public void setCheckedDrawableTop(tm1 tm1) {
        this.j.b = tm1;
        h();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.n = aVar;
    }

    public void toggle() {
        setChecked(!this.l);
    }
}
