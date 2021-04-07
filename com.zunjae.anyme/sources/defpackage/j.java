package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$style;
import androidx.appcompat.R$styleable;
import androidx.core.graphics.drawable.a;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: j  reason: default package */
public class j extends Drawable {
    private static final float m = ((float) Math.toRadians(45.0d));
    private final Paint a = new Paint();
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private final Path g = new Path();
    private final int h;
    private boolean i = false;
    private float j;
    private float k;
    private int l = 2;

    public j(Context context) {
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeJoin(Paint.Join.MITER);
        this.a.setStrokeCap(Paint.Cap.BUTT);
        this.a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, R$styleable.DrawerArrowToggle, R$attr.drawerArrowStyle, R$style.Base_Widget_AppCompat_DrawerArrowToggle);
        c(obtainStyledAttributes.getColor(R$styleable.DrawerArrowToggle_color, 0));
        b(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_thickness, Utils.FLOAT_EPSILON));
        f(obtainStyledAttributes.getBoolean(R$styleable.DrawerArrowToggle_spinBars, true));
        d((float) Math.round(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_gapBetweenBars, Utils.FLOAT_EPSILON)));
        this.h = obtainStyledAttributes.getDimensionPixelSize(R$styleable.DrawerArrowToggle_drawableSize, 0);
        this.c = (float) Math.round(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_barLength, Utils.FLOAT_EPSILON));
        this.b = (float) Math.round(obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_arrowHeadLength, Utils.FLOAT_EPSILON));
        this.d = obtainStyledAttributes.getDimension(R$styleable.DrawerArrowToggle_arrowShaftLength, Utils.FLOAT_EPSILON);
        obtainStyledAttributes.recycle();
    }

    private static float a(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public void b(float f2) {
        if (this.a.getStrokeWidth() != f2) {
            this.a.setStrokeWidth(f2);
            this.k = (float) (((double) (f2 / 2.0f)) * Math.cos((double) m));
            invalidateSelf();
        }
    }

    public void c(int i2) {
        if (i2 != this.a.getColor()) {
            this.a.setColor(i2);
            invalidateSelf();
        }
    }

    public void d(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i2 = this.l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? a.f(this) == 0 : a.f(this) == 1))) {
            z = true;
        }
        float f2 = this.b;
        float a2 = a(this.c, (float) Math.sqrt((double) (f2 * f2 * 2.0f)), this.j);
        float a3 = a(this.c, this.d, this.j);
        float round = (float) Math.round(a(Utils.FLOAT_EPSILON, this.k, this.j));
        float a4 = a(Utils.FLOAT_EPSILON, m, this.j);
        double d2 = (double) a2;
        float a5 = a(z ? Utils.FLOAT_EPSILON : -180.0f, z ? 180.0f : Utils.FLOAT_EPSILON, this.j);
        double d3 = (double) a4;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d3) * d2);
        float round3 = (float) Math.round(d2 * Math.sin(d3));
        this.g.rewind();
        float a6 = a(this.e + this.a.getStrokeWidth(), -this.k, this.j);
        float f3 = (-a3) / 2.0f;
        this.g.moveTo(f3 + round, Utils.FLOAT_EPSILON);
        this.g.rLineTo(a3 - (round * 2.0f), Utils.FLOAT_EPSILON);
        this.g.moveTo(f3, a6);
        this.g.rLineTo(round2, round3);
        this.g.moveTo(f3, -a6);
        this.g.rLineTo(round2, -round3);
        this.g.close();
        canvas.save();
        float strokeWidth = this.a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f4 = this.e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f4))) / 4) * 2)) + (strokeWidth * 1.5f) + f4);
        if (this.f) {
            canvas2.rotate(a5 * ((float) (this.i ^ z2 ? -1 : 1)));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.g, this.a);
        canvas.restore();
    }

    public void e(float f2) {
        if (this.j != f2) {
            this.j = f2;
            invalidateSelf();
        }
    }

    public void f(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
    }

    public void g(boolean z) {
        if (this.i != z) {
            this.i = z;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.h;
    }

    public int getIntrinsicWidth() {
        return this.h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i2) {
        if (i2 != this.a.getAlpha()) {
            this.a.setAlpha(i2);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
