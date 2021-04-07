package com.mikepenz.iconics.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.sm1;

public class IconicsTextView extends AppCompatTextView {
    protected final xm1 i;

    public IconicsTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public IconicsTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new xm1();
        if (!isInEditMode()) {
            g(context, attributeSet, i2);
        }
    }

    private void h() {
        this.i.a(this);
    }

    public void f(Context context, AttributeSet attributeSet, int i2) {
        ym1.q(context, attributeSet, this.i);
    }

    public void g(Context context, AttributeSet attributeSet, int i2) {
        f(context, attributeSet, i2);
        h();
    }

    public tm1 getIconicsDrawableBottom() {
        tm1 tm1 = this.i.d;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getIconicsDrawableEnd() {
        tm1 tm1 = this.i.c;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getIconicsDrawableStart() {
        tm1 tm1 = this.i.a;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getIconicsDrawableTop() {
        tm1 tm1 = this.i.b;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public void setDrawableBottom(tm1 tm1) {
        this.i.d = tm1;
        h();
    }

    public void setDrawableEnd(tm1 tm1) {
        this.i.c = tm1;
        h();
    }

    public void setDrawableForAll(tm1 tm1) {
        xm1 xm1 = this.i;
        xm1.a = tm1;
        xm1.b = tm1;
        xm1.c = tm1;
        xm1.d = tm1;
        h();
    }

    public void setDrawableStart(tm1 tm1) {
        this.i.a = tm1;
        h();
    }

    public void setDrawableTop(tm1 tm1) {
        this.i.b = tm1;
        h();
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!isInEditMode()) {
            sm1.a aVar = new sm1.a();
            aVar.a(getContext());
            charSequence = aVar.c(charSequence).a();
        }
        super.setText(charSequence, bufferType);
    }
}
