package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: c2  reason: default package */
public final class c2 {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return d(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static ColorStateList c(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i), theme);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList d(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) {
        /*
            r0 = r19
            int r1 = r18.getDepth()
            r2 = 1
            int r1 = r1 + r2
            r3 = 20
            int[][] r4 = new int[r3][]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = 0
        L_0x0010:
            int r7 = r18.next()
            if (r7 == r2) goto L_0x00ae
            int r8 = r18.getDepth()
            if (r8 >= r1) goto L_0x001f
            r9 = 3
            if (r7 == r9) goto L_0x00ae
        L_0x001f:
            r9 = 2
            if (r7 != r9) goto L_0x00a7
            if (r8 > r1) goto L_0x00a7
            java.lang.String r7 = r18.getName()
            java.lang.String r8 = "item"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0032
            goto L_0x00a7
        L_0x0032:
            int[] r7 = androidx.core.R$styleable.ColorStateListItem
            r8 = r17
            r9 = r20
            android.content.res.TypedArray r7 = f(r8, r9, r0, r7)
            int r10 = androidx.core.R$styleable.ColorStateListItem_android_color
            r11 = -65281(0xffffffffffff00ff, float:NaN)
            int r10 = r7.getColor(r10, r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            int r12 = androidx.core.R$styleable.ColorStateListItem_android_alpha
            boolean r12 = r7.hasValue(r12)
            if (r12 == 0) goto L_0x0056
            int r12 = androidx.core.R$styleable.ColorStateListItem_android_alpha
        L_0x0051:
            float r11 = r7.getFloat(r12, r11)
            goto L_0x0061
        L_0x0056:
            int r12 = androidx.core.R$styleable.ColorStateListItem_alpha
            boolean r12 = r7.hasValue(r12)
            if (r12 == 0) goto L_0x0061
            int r12 = androidx.core.R$styleable.ColorStateListItem_alpha
            goto L_0x0051
        L_0x0061:
            r7.recycle()
            int r7 = r19.getAttributeCount()
            int[] r12 = new int[r7]
            r13 = 0
            r14 = 0
        L_0x006c:
            if (r13 >= r7) goto L_0x0091
            int r15 = r0.getAttributeNameResource(r13)
            r2 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r15 == r2) goto L_0x008d
            r2 = 16843551(0x101031f, float:2.3695797E-38)
            if (r15 == r2) goto L_0x008d
            int r2 = androidx.core.R$attr.alpha
            if (r15 == r2) goto L_0x008d
            int r2 = r14 + 1
            boolean r16 = r0.getAttributeBooleanValue(r13, r5)
            if (r16 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            int r15 = -r15
        L_0x008a:
            r12[r14] = r15
            r14 = r2
        L_0x008d:
            int r13 = r13 + 1
            r2 = 1
            goto L_0x006c
        L_0x0091:
            int[] r2 = android.util.StateSet.trimStateSet(r12, r14)
            int r7 = e(r10, r11)
            int[] r3 = defpackage.g2.a(r3, r6, r7)
            java.lang.Object[] r2 = defpackage.g2.b(r4, r6, r2)
            r4 = r2
            int[][] r4 = (int[][]) r4
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x00a7:
            r8 = r17
            r9 = r20
        L_0x00ab:
            r2 = 1
            goto L_0x0010
        L_0x00ae:
            int[] r0 = new int[r6]
            int[][] r1 = new int[r6][]
            java.lang.System.arraycopy(r3, r5, r0, r5, r6)
            java.lang.System.arraycopy(r4, r5, r1, r5, r6)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c2.d(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    private static int e(int i, float f) {
        return (i & 16777215) | (Math.round(((float) Color.alpha(i)) * f) << 24);
    }

    private static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
