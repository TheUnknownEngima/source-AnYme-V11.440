package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import androidx.core.R$styleable;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: f2  reason: default package */
final class f2 {

    /* renamed from: f2$a */
    static final class a {
        final int[] a;
        final float[] b;

        a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{Utils.FLOAT_EPSILON, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{Utils.FLOAT_EPSILON, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = list.get(i).intValue();
                this.b[i] = list2.get(i).floatValue();
            }
        }
    }

    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        a aVar2;
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return aVar2;
        }
        aVar2 = new a(i, i2);
        return aVar2;
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            Resources.Theme theme2 = theme;
            TypedArray s = i2.s(resources, theme2, attributeSet, R$styleable.GradientColor);
            float j = i2.j(s, xmlPullParser2, "startX", R$styleable.GradientColor_android_startX, Utils.FLOAT_EPSILON);
            float j2 = i2.j(s, xmlPullParser2, "startY", R$styleable.GradientColor_android_startY, Utils.FLOAT_EPSILON);
            float j3 = i2.j(s, xmlPullParser2, "endX", R$styleable.GradientColor_android_endX, Utils.FLOAT_EPSILON);
            float j4 = i2.j(s, xmlPullParser2, "endY", R$styleable.GradientColor_android_endY, Utils.FLOAT_EPSILON);
            float j5 = i2.j(s, xmlPullParser2, "centerX", R$styleable.GradientColor_android_centerX, Utils.FLOAT_EPSILON);
            float j6 = i2.j(s, xmlPullParser2, "centerY", R$styleable.GradientColor_android_centerY, Utils.FLOAT_EPSILON);
            int k = i2.k(s, xmlPullParser2, "type", R$styleable.GradientColor_android_type, 0);
            int f = i2.f(s, xmlPullParser2, "startColor", R$styleable.GradientColor_android_startColor, 0);
            boolean r = i2.r(xmlPullParser2, "centerColor");
            int f2 = i2.f(s, xmlPullParser2, "centerColor", R$styleable.GradientColor_android_centerColor, 0);
            int f3 = i2.f(s, xmlPullParser2, "endColor", R$styleable.GradientColor_android_endColor, 0);
            int k2 = i2.k(s, xmlPullParser2, "tileMode", R$styleable.GradientColor_android_tileMode, 0);
            float f4 = j5;
            float j7 = i2.j(s, xmlPullParser2, "gradientRadius", R$styleable.GradientColor_android_gradientRadius, Utils.FLOAT_EPSILON);
            s.recycle();
            a a2 = a(c(resources, xmlPullParser, attributeSet, theme), f, f3, r, f2);
            if (k == 1) {
                float f5 = f4;
                if (j7 > Utils.FLOAT_EPSILON) {
                    int[] iArr = a2.a;
                    return new RadialGradient(f5, j6, j7, iArr, a2.b, d(k2));
                }
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            } else if (k != 2) {
                return new LinearGradient(j, j2, j3, j4, a2.a, a2.b, d(k2));
            } else {
                return new SweepGradient(f4, j6, a2.a, a2.b);
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.f2.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L_0x0012:
            int r3 = r9.next()
            if (r3 == r1) goto L_0x0085
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L_0x0021
            r6 = 3
            if (r3 == r6) goto L_0x0085
        L_0x0021:
            r6 = 2
            if (r3 == r6) goto L_0x0025
            goto L_0x0012
        L_0x0025:
            if (r5 > r0) goto L_0x0012
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0034
            goto L_0x0012
        L_0x0034:
            int[] r3 = androidx.core.R$styleable.GradientColorItem
            android.content.res.TypedArray r3 = defpackage.i2.s(r8, r11, r10, r3)
            int r5 = androidx.core.R$styleable.GradientColorItem_android_color
            boolean r5 = r3.hasValue(r5)
            int r6 = androidx.core.R$styleable.GradientColorItem_android_offset
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L_0x006a
            if (r6 == 0) goto L_0x006a
            int r5 = androidx.core.R$styleable.GradientColorItem_android_color
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = androidx.core.R$styleable.GradientColorItem_android_offset
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L_0x0012
        L_0x006a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x0085:
            int r8 = r4.size()
            if (r8 <= 0) goto L_0x0091
            f2$a r8 = new f2$a
            r8.<init>((java.util.List<java.lang.Integer>) r4, (java.util.List<java.lang.Float>) r2)
            return r8
        L_0x0091:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):f2$a");
    }

    private static Shader.TileMode d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
