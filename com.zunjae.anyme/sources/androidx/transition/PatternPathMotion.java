package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import org.xmlpull.v1.XmlPullParser;

public class PatternPathMotion extends PathMotion {
    private final Path a = new Path();
    private final Matrix b = new Matrix();

    public PatternPathMotion() {
        this.a.lineTo(1.0f, Utils.FLOAT_EPSILON);
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.i);
        try {
            String m = i2.m(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m != null) {
                c(l2.e(m));
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private static float b(float f, float f2) {
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public Path a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float b2 = b(f5, f6);
        double atan2 = Math.atan2((double) f6, (double) f5);
        this.b.setScale(b2, b2);
        this.b.postRotate((float) Math.toDegrees(atan2));
        this.b.postTranslate(f, f2);
        Path path = new Path();
        this.a.transform(this.b, path);
        return path;
    }

    public void c(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, (float[]) null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(Utils.FLOAT_EPSILON, fArr, (float[]) null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.b.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float b2 = 1.0f / b(f5, f6);
        this.b.postScale(b2, b2);
        this.b.postRotate((float) Math.toDegrees(-Math.atan2((double) f6, (double) f5)));
        path.transform(this.b, this.a);
    }
}
