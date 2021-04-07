package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.zunjae.anyme.C0271R$bool;

/* renamed from: bw1  reason: default package */
public final class bw1 {
    public static final bw1 a = new bw1();

    private bw1() {
    }

    public static /* synthetic */ int b(bw1 bw1, Context context, int i, int i2, int i3, int i4, int i5, Object obj) {
        return bw1.a(context, i, i2, i3, (i5 & 16) != 0 ? 0 : i4);
    }

    private final zv1 c(Context context) {
        boolean z = context.getResources().getBoolean(C0271R$bool.IsPhone);
        boolean z2 = context.getResources().getBoolean(C0271R$bool.Is7);
        boolean z3 = context.getResources().getBoolean(C0271R$bool.Is10);
        if (!z) {
            if (z2) {
                return zv1.SevenInch;
            }
            if (z3) {
                return zv1.TenInch;
            }
        }
        return zv1.Phone;
    }

    public final int a(Context context, int i, int i2, int i3, int i4) {
        v62.e(context, "context");
        boolean a2 = ew1.a.a(context);
        if (!a2) {
            if (!a2) {
                i4 = 0;
            } else {
                throw new j22();
            }
        }
        int i5 = aw1.a[c(context).ordinal()];
        if (i5 == 1) {
            return i + i4;
        }
        if (i5 == 2) {
            return i2 + i4;
        }
        if (i5 == 3) {
            return i3 + i4;
        }
        throw new j22();
    }

    public final void d(Activity activity) {
        if (activity != null) {
            try {
                Object systemService = activity.getSystemService("input_method");
                if (systemService != null) {
                    View currentFocus = activity.getCurrentFocus();
                    v62.c(currentFocus);
                    v62.d(currentFocus, "context.currentFocus!!");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            } catch (Exception unused) {
            }
        }
    }

    public final boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }
}
