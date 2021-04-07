package defpackage;

import android.content.Context;
import android.graphics.Typeface;

/* renamed from: z8  reason: default package */
public class z8 {
    private static final h0<String, Typeface> a = new h0<>();

    public static Typeface a(Context context, String str) {
        synchronized (a) {
            if (!a.containsKey(str)) {
                try {
                    Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", new Object[]{str}));
                    a.put(str, createFromAsset);
                    return createFromAsset;
                } catch (RuntimeException unused) {
                    return null;
                }
            } else {
                Typeface typeface = a.get(str);
                return typeface;
            }
        }
    }
}
