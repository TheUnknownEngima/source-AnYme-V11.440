package defpackage;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

@SuppressLint({"InlinedApi"})
/* renamed from: oo1  reason: default package */
public class oo1 extends StateListDrawable {
    private int e;
    private int f;

    public oo1(Drawable drawable, int i, int i2) {
        Drawable mutate = drawable.mutate();
        addState(new int[]{16842913}, mutate);
        addState(new int[0], mutate);
        this.e = i;
        this.f = i2;
    }

    public oo1(Drawable drawable, Drawable drawable2, int i, int i2) {
        Drawable mutate = drawable.mutate();
        int[] iArr = {16842913};
        addState(iArr, drawable2.mutate());
        addState(new int[0], mutate);
        this.e = i;
        this.f = i2;
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (int i : iArr) {
            if (i == 16842913) {
                z = true;
            }
        }
        super.setColorFilter(z ? this.f : this.e, PorterDuff.Mode.SRC_IN);
        return super.onStateChange(iArr);
    }
}
