package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import defpackage.ul;

/* renamed from: sl  reason: default package */
public class sl implements ul<Drawable> {
    private final int a;
    private final boolean b;

    public sl(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    /* renamed from: b */
    public boolean a(Drawable drawable, ul.a aVar) {
        Drawable b2 = aVar.b();
        if (b2 == null) {
            b2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{b2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.b);
        transitionDrawable.startTransition(this.a);
        aVar.a(transitionDrawable);
        return true;
    }
}
