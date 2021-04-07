package defpackage;

import android.content.Context;

/* renamed from: v80  reason: default package */
public class v80 {
    private static v80 b = new v80();
    private u80 a = null;

    public static u80 a(Context context) {
        return b.b(context);
    }

    private final synchronized u80 b(Context context) {
        if (this.a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.a = new u80(context);
        }
        return this.a;
    }
}
