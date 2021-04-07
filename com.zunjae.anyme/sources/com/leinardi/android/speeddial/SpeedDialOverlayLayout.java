package com.leinardi.android.speeddial;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class SpeedDialOverlayLayout extends RelativeLayout {
    private static final String g = SpeedDialOverlayLayout.class.getSimpleName();
    private boolean e;
    private View.OnClickListener f;

    public SpeedDialOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public SpeedDialOverlayLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet);
    }

    private void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SpeedDialOverlayLayout, 0, 0);
        int a = h2.a(getResources(), R$color.sd_overlay_color, context.getTheme());
        try {
            a = obtainStyledAttributes.getColor(R$styleable.SpeedDialOverlayLayout_android_background, a);
            this.e = obtainStyledAttributes.getBoolean(R$styleable.SpeedDialOverlayLayout_clickable_overlay, true);
        } catch (Exception unused) {
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            setElevation(getResources().getDimension(R$dimen.sd_overlay_elevation));
        }
        setBackgroundColor(a);
        setVisibility(8);
        getResources().getInteger(17694722);
    }

    public boolean a() {
        return this.e;
    }

    public void b(boolean z) {
        if (z) {
            b.d(this);
        } else {
            setVisibility(8);
        }
    }

    public void d(boolean z) {
        if (z) {
            b.c(this);
        } else {
            setVisibility(0);
        }
    }

    public void setAnimationDuration(int i) {
    }

    public void setClickableOverlay(boolean z) {
        this.e = z;
        setOnClickListener(this.f);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
        if (!a()) {
            onClickListener = null;
        }
        super.setOnClickListener(onClickListener);
    }
}
