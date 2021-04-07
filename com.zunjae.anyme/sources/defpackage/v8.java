package defpackage;

import android.view.View;

/* renamed from: v8  reason: default package */
public abstract class v8 implements View.OnClickListener {
    /* access modifiers changed from: package-private */
    public static boolean e = true;
    private static final Runnable f = u8.e;

    public abstract void a(View view);

    public final void onClick(View view) {
        if (e) {
            e = false;
            view.post(f);
            a(view);
        }
    }
}
