package defpackage;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;

/* renamed from: wm1  reason: default package */
public class wm1 {
    public boolean a;
    public tm1 b;
    public tm1 c;

    public void a(Context context) {
        this.b = new tm1(context);
        this.c = new tm1(context);
    }

    public StateListDrawable b(Context context) {
        return gn1.b(context, this.c, this.b, this.a);
    }
}
