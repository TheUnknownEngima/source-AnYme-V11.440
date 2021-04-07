package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;

/* renamed from: i  reason: default package */
public class i extends Drawable implements Drawable.Callback {
    private Drawable e;

    public i(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.e;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.e.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.e.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.e.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.e.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.e.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.e.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.e.getMinimumWidth();
    }

    public int getOpacity() {
        return this.e.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.e.getPadding(rect);
    }

    public int[] getState() {
        return this.e.getState();
    }

    public Region getTransparentRegion() {
        return this.e.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.h(this.e);
    }

    public boolean isStateful() {
        return this.e.isStateful();
    }

    public void jumpToCurrentState() {
        a.i(this.e);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.e.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.e.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        a.j(this.e, z);
    }

    public void setChangingConfigurations(int i) {
        this.e.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.e.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.e.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        a.k(this.e, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        a.l(this.e, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.e.setState(iArr);
    }

    public void setTint(int i) {
        a.n(this.e, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.o(this.e, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.p(this.e, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.e.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
