package berlin.volders.badger;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import berlin.volders.badger.a;

public class e extends a {
    private static final boolean h = (Build.VERSION.SDK_INT >= 21);
    private static final boolean i;
    private final b c;
    private final Paint d = new Paint();
    private final Paint e = new Paint();
    private boolean f = true;
    private String g = "";

    public static abstract class a<T extends e> implements a.b<T> {
        protected final b a;
        protected final int b;
        protected final int c;

        public a(Context context, b bVar) {
            this(bVar, e.a(context), e.b(context));
        }

        public a(b bVar, int i, int i2) {
            this.a = bVar;
            this.b = i;
            this.c = i2;
        }
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 23) {
            z = false;
        }
        i = z;
    }

    protected e(b bVar, int i2, int i3) {
        this.c = bVar;
        this.d.setColor(i2);
        this.e.setColor(i3);
    }

    @SuppressLint({"NewApi"})
    static int a(Context context) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        return theme.resolveAttribute(R$attr.badgeShapeColor, typedValue, true) ? typedValue.data : theme.resolveAttribute(R$attr.colorAccent, typedValue, true) ? typedValue.data : (!h || !theme.resolveAttribute(16843829, typedValue, true)) ? i ? context.getResources().getColor(R$color.badgeShapeColor) : context.getColor(R$color.badgeShapeColor) : typedValue.data;
    }

    @SuppressLint({"NewApi"})
    static int b(Context context) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        return theme.resolveAttribute(R$attr.badgeTextColor, typedValue, true) ? typedValue.data : theme.resolveAttribute(R$attr.titleTextColor, typedValue, true) ? typedValue.data : i ? context.getResources().getColor(R$color.badgeTextColor) : theme.resolveAttribute(16844003, typedValue, true) ? typedValue.data : context.getColor(R$color.badgeTextColor);
    }

    /* access modifiers changed from: protected */
    public void c(Paint paint) {
        paint.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public void d(Paint paint) {
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
    }

    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        if (this.g.length() != 0) {
            if (this.f) {
                this.f = false;
                c(this.d);
                d(this.e);
            }
            Rect c2 = this.c.c(canvas, getBounds(), this.d, getLayoutDirection());
            this.e.setTextSize(((float) c2.height()) * 0.6f);
            canvas.drawText(this.g, c2.exactCenterX(), c2.exactCenterY() - ((this.e.ascent() + this.e.descent()) * 0.5f), this.e);
        }
    }

    public final void e(CharSequence charSequence) {
        String trim = charSequence == null ? "" : charSequence.toString().trim();
        if (!this.g.equals(trim)) {
            this.g = trim;
            invalidateSelf();
        }
    }

    public int getLayoutDirection() {
        if (Build.VERSION.SDK_INT >= 23) {
            return super.getLayoutDirection();
        }
        return 0;
    }

    public boolean onLayoutDirectionChanged(int i2) {
        invalidateSelf();
        return true;
    }

    @SuppressLint({"NewApi"})
    public void setAlpha(int i2) {
        if (getAlpha() != i2) {
            this.d.setAlpha(i2);
            this.e.setAlpha(i2);
            super.setAlpha(i2);
        }
    }

    @SuppressLint({"NewApi"})
    public void setColorFilter(ColorFilter colorFilter) {
        if (getColorFilter() != colorFilter) {
            this.d.setColorFilter(colorFilter);
            this.e.setColorFilter(colorFilter);
            super.setColorFilter(colorFilter);
        }
    }
}
