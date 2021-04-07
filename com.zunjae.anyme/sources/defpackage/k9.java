package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.afollestad.recyclical.R$attr;

/* renamed from: k9  reason: default package */
public final class k9 {

    /* renamed from: k9$a */
    public static final class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ z52 e;

        a(z52 z52) {
            this.e = z52;
        }

        public void onViewAttachedToWindow(View view) {
            v62.f(view, "v");
            this.e.r(view);
        }

        public void onViewDetachedFromWindow(View view) {
            v62.f(view, "v");
        }
    }

    /* renamed from: k9$b */
    public static final class b implements View.OnAttachStateChangeListener {
        final /* synthetic */ z52 e;

        b(z52 z52) {
            this.e = z52;
        }

        public void onViewAttachedToWindow(View view) {
            v62.f(view, "v");
        }

        public void onViewDetachedFromWindow(View view) {
            v62.f(view, "v");
            this.e.r(view);
        }
    }

    public static final boolean a(View view) {
        if (view == null) {
            return false;
        }
        return o4.N(view);
    }

    public static final void b(View view) {
        if (view != null && view.getBackground() == null && view.getContext() != null) {
            Context context = view.getContext();
            v62.b(context, "context");
            view.setBackground(f(context, Integer.valueOf(R$attr.selectableItemBackground), (Drawable) null, 2, (Object) null));
        }
    }

    public static final void c(View view, z52<? super View, u22> z52) {
        v62.f(z52, "block");
        if (view != null) {
            view.addOnAttachStateChangeListener(new a(z52));
        }
        if (a(view) && view != null) {
            z52.r(view);
        }
    }

    public static final void d(View view, z52<? super View, u22> z52) {
        v62.f(z52, "block");
        if (view != null) {
            view.addOnAttachStateChangeListener(new b(z52));
        }
        if (!a(view) && view != null) {
            z52.r(view);
        }
    }

    public static final Drawable e(Context context, Integer num, Drawable drawable) {
        v62.f(context, "$this$resolveDrawable");
        if (num == null) {
            return drawable;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num.intValue()});
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

    public static /* synthetic */ Drawable f(Context context, Integer num, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            drawable = null;
        }
        return e(context, num, drawable);
    }
}
