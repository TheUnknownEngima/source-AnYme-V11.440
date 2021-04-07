package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.f;

/* renamed from: x8  reason: default package */
public class x8 {

    /* renamed from: x8$a */
    static class a implements Runnable {
        final /* synthetic */ f e;
        final /* synthetic */ f.e f;

        a(f fVar, f.e eVar) {
            this.e = fVar;
            this.f = eVar;
        }

        public void run() {
            this.e.i().requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f.j().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.e.i(), 1);
            }
        }
    }

    /* renamed from: x8$b */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.afollestad.materialdialogs.e[] r0 = com.afollestad.materialdialogs.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                com.afollestad.materialdialogs.e r1 = com.afollestad.materialdialogs.e.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.afollestad.materialdialogs.e r1 = com.afollestad.materialdialogs.e.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.x8.b.<clinit>():void");
        }
    }

    public static int a(int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static ColorStateList b(Context context, int i) {
        int l = l(context, 16842806);
        if (i == 0) {
            i = l;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{a(i, 0.4f), i});
    }

    public static int c(Context context, int i) {
        return androidx.core.content.a.d(context, i);
    }

    public static int d(Context context) {
        return a(g(l(context, 16842806)) ? -16777216 : -1, 0.3f);
    }

    private static int e(e eVar) {
        int i = b.a[eVar.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static void f(DialogInterface dialogInterface, f.e eVar) {
        InputMethodManager inputMethodManager;
        f fVar = (f) dialogInterface;
        if (fVar.i() != null && (inputMethodManager = (InputMethodManager) eVar.j().getSystemService("input_method")) != null) {
            View currentFocus = fVar.getCurrentFocus();
            IBinder iBinder = null;
            if (currentFocus != null) {
                iBinder = currentFocus.getWindowToken();
            } else if (fVar.l() != null) {
                iBinder = fVar.l().getWindowToken();
            }
            if (iBinder != null) {
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
            }
        }
    }

    public static boolean g(int i) {
        return 1.0d - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / 255.0d) >= 0.5d;
    }

    public static <T> boolean h(T t, T[] tArr) {
        if (!(tArr == null || tArr.length == 0)) {
            for (T equals : tArr) {
                if (equals.equals(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ColorStateList i(Context context, int i, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            if (peekValue.type < 28 || peekValue.type > 31) {
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
                obtainStyledAttributes.recycle();
                return colorStateList2 != null ? colorStateList2 : colorStateList;
            }
            ColorStateList b2 = b(context, peekValue.data);
            obtainStyledAttributes.recycle();
            return b2;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static boolean j(Context context, int i) {
        return k(context, i, false);
    }

    public static boolean k(Context context, int i, boolean z) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getBoolean(0, z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int l(Context context, int i) {
        return m(context, i, 0);
    }

    public static int m(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int n(Context context, int i) {
        return o(context, i, -1);
    }

    private static int o(Context context, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static Drawable p(Context context, int i) {
        return q(context, i, (Drawable) null);
    }

    private static Drawable q(Context context, int i, Drawable drawable) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static e r(Context context, int i, e eVar) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            int i2 = obtainStyledAttributes.getInt(0, e(eVar));
            if (i2 == 1) {
                e eVar2 = e.CENTER;
                obtainStyledAttributes.recycle();
                return eVar2;
            } else if (i2 != 2) {
                return e.START;
            } else {
                e eVar3 = e.END;
                obtainStyledAttributes.recycle();
                return eVar3;
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static String s(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return (String) typedValue.string;
    }

    public static void t(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT < 16) {
            view.setBackgroundDrawable(drawable);
        } else {
            view.setBackground(drawable);
        }
    }

    public static void u(DialogInterface dialogInterface, f.e eVar) {
        f fVar = (f) dialogInterface;
        if (fVar.i() != null) {
            fVar.i().post(new a(fVar, eVar));
        }
    }
}
