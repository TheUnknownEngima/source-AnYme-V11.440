package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.a;

/* renamed from: yi  reason: default package */
public final class yi {
    private static volatile boolean a = true;

    public static Drawable a(Context context, int i, Resources.Theme theme) {
        return c(context, context, i, theme);
    }

    public static Drawable b(Context context, Context context2, int i) {
        return c(context, context2, i, (Resources.Theme) null);
    }

    private static Drawable c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return a.f(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i, theme);
    }

    private static Drawable d(Context context, int i, Resources.Theme theme) {
        return h2.b(context.getResources(), i, theme);
    }

    private static Drawable e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new p(context, theme);
        }
        return f.d(context, i);
    }
}
