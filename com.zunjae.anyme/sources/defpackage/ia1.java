package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ia1  reason: default package */
public class ia1 {
    private static final int[] i = new int[3];
    private static final float[] j = {Utils.FLOAT_EPSILON, 0.5f, 1.0f};
    private static final int[] k = new int[4];
    private static final float[] l = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0.5f, 1.0f};
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private int d;
    private int e;
    private int f;
    private final Path g;
    private Paint h;

    public ia1() {
        this(-16777216);
    }

    public ia1(int i2) {
        this.g = new Path();
        this.h = new Paint();
        this.a = new Paint();
        d(i2);
        this.h.setColor(0);
        Paint paint = new Paint(4);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = new Paint(this.b);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i2, float f2, float f3) {
        Canvas canvas2 = canvas;
        RectF rectF2 = rectF;
        int i3 = i2;
        float f4 = f3;
        boolean z = f4 < Utils.FLOAT_EPSILON;
        Path path = this.g;
        if (z) {
            int[] iArr = k;
            iArr[0] = 0;
            iArr[1] = this.f;
            iArr[2] = this.e;
            iArr[3] = this.d;
            float f5 = f2;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f2, f4);
            path.close();
            float f6 = (float) (-i3);
            rectF2.inset(f6, f6);
            int[] iArr2 = k;
            iArr2[0] = 0;
            iArr2[1] = this.d;
            iArr2[2] = this.e;
            iArr2[3] = this.f;
        }
        float width = rectF.width() / 2.0f;
        if (width > Utils.FLOAT_EPSILON) {
            float f7 = 1.0f - (((float) i3) / width);
            float[] fArr = l;
            fArr[1] = f7;
            fArr[2] = ((1.0f - f7) / 2.0f) + f7;
            this.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, k, l, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, this.h);
            }
            canvas.drawArc(rectF, f2, f3, true, this.b);
            canvas.restore();
        }
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i2) {
        rectF.bottom += (float) i2;
        rectF.offset(Utils.FLOAT_EPSILON, (float) (-i2));
        int[] iArr = i;
        iArr[0] = this.f;
        iArr[1] = this.e;
        iArr[2] = this.d;
        Paint paint = this.c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, i, j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.c);
        canvas.restore();
    }

    public Paint c() {
        return this.a;
    }

    public void d(int i2) {
        this.d = j2.m(i2, 68);
        this.e = j2.m(i2, 20);
        this.f = j2.m(i2, 0);
        this.a.setColor(this.d);
    }
}
