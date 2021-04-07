package defpackage;

import android.content.Context;
import java.util.WeakHashMap;

/* renamed from: u2  reason: default package */
public final class u2 {
    private static final WeakHashMap<Context, u2> a = new WeakHashMap<>();

    private u2(Context context) {
    }

    public static u2 a(Context context) {
        u2 u2Var;
        synchronized (a) {
            u2Var = a.get(context);
            if (u2Var == null) {
                u2Var = new u2(context);
                a.put(context, u2Var);
            }
        }
        return u2Var;
    }
}
