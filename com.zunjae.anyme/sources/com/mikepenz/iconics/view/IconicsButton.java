package com.mikepenz.iconics.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.sm1;

public class IconicsButton extends AppCompatButton {
    private final xm1 g;

    public IconicsButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.buttonStyle);
    }

    public IconicsButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new xm1();
        if (!isInEditMode()) {
            b(context, attributeSet, i);
        }
    }

    private void c() {
        this.g.a(this);
    }

    public void a(Context context, AttributeSet attributeSet, int i) {
        ym1.q(context, attributeSet, this.g);
    }

    public void b(Context context, AttributeSet attributeSet, int i) {
        a(context, attributeSet, i);
        c();
    }

    public tm1 getIconicsDrawableBottom() {
        tm1 tm1 = this.g.d;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getIconicsDrawableEnd() {
        tm1 tm1 = this.g.c;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getIconicsDrawableStart() {
        tm1 tm1 = this.g.a;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public tm1 getIconicsDrawableTop() {
        tm1 tm1 = this.g.b;
        if (tm1 != null) {
            return tm1;
        }
        return null;
    }

    public void setDrawableBottom(tm1 tm1) {
        this.g.d = tm1;
        c();
    }

    public void setDrawableEnd(tm1 tm1) {
        this.g.c = tm1;
        c();
    }

    public void setDrawableForAll(tm1 tm1) {
        xm1 xm1 = this.g;
        xm1.a = tm1;
        xm1.b = tm1;
        xm1.c = tm1;
        xm1.d = tm1;
        c();
    }

    public void setDrawableStart(tm1 tm1) {
        this.g.a = tm1;
        c();
    }

    public void setDrawableTop(tm1 tm1) {
        this.g.b = tm1;
        c();
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        setAllCaps(false);
        if (!isInEditMode()) {
            sm1.a aVar = new sm1.a();
            aVar.a(getContext());
            charSequence = aVar.c(charSequence).a();
        }
        super.setText(charSequence, bufferType);
    }
}
