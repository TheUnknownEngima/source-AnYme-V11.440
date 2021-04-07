package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.afollestad.materialdialogs.R$dimen;
import com.afollestad.materialdialogs.e;

@SuppressLint({"AppCompatCustomView"})
public class MDButton extends TextView {
    private boolean e = false;
    private e f;
    private int g;
    private Drawable h;
    private Drawable i;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public MDButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    private void a(Context context) {
        this.g = context.getResources().getDimensionPixelSize(R$dimen.md_dialog_frame_margin);
        this.f = e.END;
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z, boolean z2) {
        if (this.e != z || z2) {
            setGravity(z ? this.f.getGravityInt() | 16 : 17);
            if (Build.VERSION.SDK_INT >= 17) {
                setTextAlignment(z ? this.f.getTextAlignment() : 4);
            }
            x8.t(this, z ? this.h : this.i);
            if (z) {
                setPadding(this.g, getPaddingTop(), this.g, getPaddingBottom());
            }
            this.e = z;
        }
    }

    public void setAllCapsCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 14) {
            setAllCaps(z);
        } else {
            setTransformationMethod(z ? new a(getContext()) : null);
        }
    }

    public void setDefaultSelector(Drawable drawable) {
        this.i = drawable;
        if (!this.e) {
            b(false, true);
        }
    }

    public void setStackedGravity(e eVar) {
        this.f = eVar;
    }

    public void setStackedSelector(Drawable drawable) {
        this.h = drawable;
        if (this.e) {
            b(true, true);
        }
    }
}
