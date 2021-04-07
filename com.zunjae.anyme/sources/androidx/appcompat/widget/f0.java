package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class f0 extends x {
    private final WeakReference<Context> b;

    public f0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.b.get();
        if (!(drawable == null || context == null)) {
            w.h().x(context, i, drawable);
        }
        return drawable;
    }
}
