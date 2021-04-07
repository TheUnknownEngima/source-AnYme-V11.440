package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.content.a;
import com.mikepenz.materialize.R$attr;
import com.mikepenz.materialize.R$dimen;

@SuppressLint({"InlinedApi"})
/* renamed from: to1  reason: default package */
public class to1 {
    public static float a(float f, Context context) {
        return f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static int b(Context context) {
        int k = k(context, R$attr.actionBarSize);
        return k == 0 ? context.getResources().getDimensionPixelSize(R$dimen.abc_action_bar_default_height_material) : k;
    }

    public static StateListDrawable c(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, drawable2);
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    public static int d(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(context.getResources().getConfiguration().orientation == 1 ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int e(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static Drawable f(Context context) {
        return a.f(context, h(context));
    }

    public static StateListDrawable g(Context context, int i, boolean z) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        ColorDrawable colorDrawable = new ColorDrawable(i);
        stateListDrawable.addState(new int[]{16842913}, colorDrawable);
        stateListDrawable.addState(new int[0], f(context));
        if (z) {
            int integer = context.getResources().getInteger(17694720);
            stateListDrawable.setEnterFadeDuration(integer);
            stateListDrawable.setExitFadeDuration(integer);
        }
        return stateListDrawable;
    }

    public static int h(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.selectableItemBackground, typedValue, true);
        return typedValue.resourceId;
    }

    public static int i(Context context) {
        return j(context, false);
    }

    public static int j(Context context, boolean z) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.tool_bar_top_padding);
        if (dimensionPixelSize2 != 0 || z) {
            return dimensionPixelSize == 0 ? dimensionPixelSize2 : dimensionPixelSize;
        }
        return 0;
    }

    public static int k(Context context, int i) {
        TypedArray typedArray = null;
        try {
            typedArray = context.getTheme().obtainStyledAttributes(new int[]{i});
            return typedArray.getDimensionPixelSize(0, 0);
        } finally {
            if (typedArray != null) {
                typedArray.recycle();
            }
        }
    }

    public static int l(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.data;
        }
        return 0;
    }

    public static int m(Context context, int i, int i2) {
        int l = l(context, i);
        return l == 0 ? h2.a(context.getResources(), i2, context.getTheme()) : l;
    }

    public static void n(View view, int i) {
        o4.l0(view, a.f(view.getContext(), i));
    }

    @SuppressLint({"NewApi"})
    @Deprecated
    public static void o(View view, Drawable drawable) {
        o4.l0(view, drawable);
    }

    public static void p(Activity activity, int i, boolean z) {
        int i2;
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            i2 = i | attributes.flags;
        } else {
            i2 = (~i) & attributes.flags;
        }
        attributes.flags = i2;
        window.setAttributes(attributes);
    }

    public static void q(Activity activity, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            p(activity, 134217728, z);
        }
    }

    public static void r(Activity activity, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            p(activity, 67108864, z);
        }
    }
}
