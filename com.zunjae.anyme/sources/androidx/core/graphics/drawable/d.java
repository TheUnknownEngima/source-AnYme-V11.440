package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

class d extends Drawable implements Drawable.Callback, c, b {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    private int e;
    private PorterDuff.Mode f;
    private boolean g;
    f h;
    private boolean i;
    Drawable j;

    d(Drawable drawable) {
        this.h = d();
        a(drawable);
    }

    d(f fVar, Resources resources) {
        this.h = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.h);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.h;
        if (fVar != null && (constantState = fVar.b) != null) {
            a(constantState.newDrawable(resources));
        }
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.h;
        ColorStateList colorStateList = fVar.c;
        PorterDuff.Mode mode = fVar.d;
        if (colorStateList == null || mode == null) {
            this.g = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.g && colorForState == this.e && mode == this.f)) {
                setColorFilter(colorForState, mode);
                this.e = colorForState;
                this.f = mode;
                this.g = true;
                return true;
            }
        }
        return false;
    }

    public final void a(Drawable drawable) {
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.h;
            if (fVar != null) {
                fVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final Drawable b() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.j.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.h;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.j.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.h;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.h.a = getChangingConfigurations();
        return this.h;
    }

    public Drawable getCurrent() {
        return this.j.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.j.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.j.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.j.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.j.getMinimumWidth();
    }

    public int getOpacity() {
        return this.j.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.j.getPadding(rect);
    }

    public int[] getState() {
        return this.j.getState();
    }

    public Region getTransparentRegion() {
        return this.j.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.j.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            androidx.core.graphics.drawable.f r0 = r1.h
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.j
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.j.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.i && super.mutate() == this) {
            this.h = d();
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.h;
            if (fVar != null) {
                Drawable drawable2 = this.j;
                fVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.i = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i2) {
        return this.j.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.j.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        this.j.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i2) {
        this.j.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.j.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.j.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return f(iArr) || this.j.setState(iArr);
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.h.c = colorStateList;
        f(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.h.d = mode;
        f(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.j.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
