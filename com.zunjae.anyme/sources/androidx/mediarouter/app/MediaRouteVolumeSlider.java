package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatSeekBar;

class MediaRouteVolumeSlider extends AppCompatSeekBar {
    private final float f;
    private boolean g;
    private Drawable h;
    private int i;
    private int j;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f = i.h(context);
    }

    public void a(int i2) {
        b(i2, i2);
    }

    public void b(int i2, int i3) {
        if (this.i != i2) {
            if (Color.alpha(i2) != 255) {
                "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i2);
            }
            this.i = i2;
        }
        if (this.j != i3) {
            if (Color.alpha(i3) != 255) {
                "Volume slider background color cannot be translucent: #" + Integer.toHexString(i3);
            }
            this.j = i3;
        }
    }

    public void c(boolean z) {
        if (this.g != z) {
            this.g = z;
            super.setThumb(z ? null : this.h);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i2 = isEnabled() ? 255 : (int) (this.f * 255.0f);
        this.h.setColorFilter(this.i, PorterDuff.Mode.SRC_IN);
        this.h.setAlpha(i2);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.j, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.i, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i2);
    }

    public void setThumb(Drawable drawable) {
        this.h = drawable;
        if (this.g) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
