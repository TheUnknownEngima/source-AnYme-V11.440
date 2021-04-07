package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.base.R$styleable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonImpl;
import com.google.android.gms.common.internal.v;
import defpackage.y80;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    private int e;
    private int f;
    private View g;
    private View.OnClickListener h;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SignInButton, 0, 0);
        try {
            this.e = obtainStyledAttributes.getInt(R$styleable.SignInButton_buttonSize, 0);
            this.f = obtainStyledAttributes.getInt(R$styleable.SignInButton_colorScheme, 2);
            obtainStyledAttributes.recycle();
            a(this.e, this.f);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a(int i, int i2) {
        this.e = i;
        this.f = i2;
        Context context = getContext();
        View view = this.g;
        if (view != null) {
            removeView(view);
        }
        try {
            this.g = v.c(context, this.e, this.f);
        } catch (y80.a unused) {
            int i3 = this.e;
            int i4 = this.f;
            SignInButtonImpl signInButtonImpl = new SignInButtonImpl(context);
            signInButtonImpl.a(context.getResources(), i3, i4);
            this.g = signInButtonImpl;
        }
        addView(this.g);
        this.g.setEnabled(isEnabled());
        this.g.setOnClickListener(this);
    }

    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null && view == this.g) {
            onClickListener.onClick(this);
        }
    }

    public final void setColorScheme(int i) {
        a(this.e, i);
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.g.setEnabled(z);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        View view = this.g;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public final void setScopes(Scope[] scopeArr) {
        a(this.e, this.f);
    }

    public final void setSize(int i) {
        a(i, this.f);
    }
}
