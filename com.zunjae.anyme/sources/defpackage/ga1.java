package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: ga1  reason: default package */
public class ga1 extends Drawable implements za1, androidx.core.graphics.drawable.b {
    private b e;

    /* renamed from: ga1$b */
    static final class b extends Drawable.ConstantState {
        ra1 a;
        boolean b;

        public b(b bVar) {
            this.a = (ra1) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }

        public b(ra1 ra1) {
            this.a = ra1;
            this.b = false;
        }

        /* renamed from: a */
        public ga1 newDrawable() {
            return new ga1(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }

    private ga1(b bVar) {
        this.e = bVar;
    }

    public ga1(wa1 wa1) {
        this(new b(new ra1(wa1)));
    }

    public ga1 a() {
        this.e = new b(this.e);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.e;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.e;
    }

    public int getOpacity() {
        return this.e.a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ Drawable mutate() {
        a();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e.a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.e.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e2 = ha1.e(iArr);
        b bVar = this.e;
        if (bVar.b == e2) {
            return onStateChange;
        }
        bVar.b = e2;
        return true;
    }

    public void setAlpha(int i) {
        this.e.a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.e.a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(wa1 wa1) {
        this.e.a.setShapeAppearanceModel(wa1);
    }

    public void setTint(int i) {
        this.e.a.setTint(i);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.e.a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.e.a.setTintMode(mode);
    }
}
