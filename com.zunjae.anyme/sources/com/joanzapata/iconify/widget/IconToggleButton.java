package com.joanzapata.iconify.widget;

import android.content.Context;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.internal.HasOnViewAttachListener;

public class IconToggleButton extends ToggleButton implements HasOnViewAttachListener {
    private HasOnViewAttachListener.HasOnViewAttachListenerDelegate delegate;

    public IconToggleButton(Context context) {
        super(context);
        init();
    }

    public IconToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public IconToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        setTransformationMethod((TransformationMethod) null);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.delegate.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.delegate.onDetachedFromWindow();
    }

    public void setOnViewAttachListener(HasOnViewAttachListener.OnViewAttachListener onViewAttachListener) {
        if (this.delegate == null) {
            this.delegate = new HasOnViewAttachListener.HasOnViewAttachListenerDelegate(this);
        }
        this.delegate.setOnViewAttachListener(onViewAttachListener);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(Iconify.compute(getContext(), charSequence, this), TextView.BufferType.NORMAL);
    }
}
