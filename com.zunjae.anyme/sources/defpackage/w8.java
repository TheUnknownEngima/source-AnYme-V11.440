package defpackage;

import android.util.TypedValue;
import android.view.View;

/* renamed from: w8  reason: default package */
public final class w8 {
    static {
        new TypedValue();
    }

    public static <T> T a(View view, int i, String str, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e) {
            String d = d(view, i);
            throw new IllegalStateException("View '" + d + "' with ID " + i + " for " + str + " was of the wrong type. See cause for more info.", e);
        }
    }

    public static View b(View view, int i, String str) {
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        String d = d(view, i);
        throw new IllegalStateException("Required view '" + d + "' with ID " + i + " for " + str + " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    }

    public static <T> T c(View view, int i, String str, Class<T> cls) {
        return a(b(view, i, str), i, str, cls);
    }

    private static String d(View view, int i) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i);
    }
}
