package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: cn1  reason: default package */
public class cn1 extends TypefaceSpan {
    private final Typeface e;

    public cn1(String str, Typeface typeface) {
        super(str);
        this.e = typeface;
    }

    private static void a(Paint paint, Typeface typeface) {
        Typeface typeface2 = paint.getTypeface();
        int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.e);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.e);
    }
}
