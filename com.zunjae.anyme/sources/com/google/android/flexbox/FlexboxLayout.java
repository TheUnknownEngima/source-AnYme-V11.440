package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayout extends ViewGroup implements a {
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private Drawable k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int[] q;
    private SparseIntArray r;
    private d s;
    private List<c> t;
    private d.b u;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private int e = 1;
        private float f = Utils.FLOAT_EPSILON;
        private float g = 1.0f;
        private int h = -1;
        private float i = -1.0f;
        private int j = -1;
        private int k = -1;
        private int l = 16777215;
        private int m = 16777215;
        private boolean n;

        static class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            /* renamed from: a */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* renamed from: b */
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlexboxLayout_Layout);
            this.e = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_Layout_layout_order, 1);
            this.f = obtainStyledAttributes.getFloat(R$styleable.FlexboxLayout_Layout_layout_flexGrow, Utils.FLOAT_EPSILON);
            this.g = obtainStyledAttributes.getFloat(R$styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.h = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.i = obtainStyledAttributes.getFraction(R$styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.j = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.k = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.l = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.m = obtainStyledAttributes.getDimensionPixelSize(R$styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.n = obtainStyledAttributes.getBoolean(R$styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.e = parcel.readInt();
            this.f = parcel.readFloat();
            this.g = parcel.readFloat();
            this.h = parcel.readInt();
            this.i = parcel.readFloat();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readInt();
            this.n = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
            this.k = layoutParams.k;
            this.l = layoutParams.l;
            this.m = layoutParams.m;
            this.n = layoutParams.n;
        }

        public int A() {
            return this.h;
        }

        public float B() {
            return this.g;
        }

        public int D0() {
            return this.m;
        }

        public int G() {
            return this.j;
        }

        public void K(int i2) {
            this.j = i2;
        }

        public int L() {
            return this.bottomMargin;
        }

        public int L0() {
            return this.l;
        }

        public int P() {
            return this.leftMargin;
        }

        public int V() {
            return this.topMargin;
        }

        public void Z(int i2) {
            this.k = i2;
        }

        public float c0() {
            return this.f;
        }

        public int describeContents() {
            return 0;
        }

        public int getHeight() {
            return this.height;
        }

        public int getOrder() {
            return this.e;
        }

        public int getWidth() {
            return this.width;
        }

        public float h0() {
            return this.i;
        }

        public int s0() {
            return this.rightMargin;
        }

        public int v0() {
            return this.k;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.e);
            parcel.writeFloat(this.f);
            parcel.writeFloat(this.g);
            parcel.writeInt(this.h);
            parcel.writeFloat(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            parcel.writeByte(this.n ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public boolean z0() {
            return this.n;
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = -1;
        this.s = new d(this);
        this.t = new ArrayList();
        this.u = new d.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FlexboxLayout, i2, 0);
        this.e = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexDirection, 0);
        this.f = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_flexWrap, 0);
        this.g = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_justifyContent, 0);
        this.h = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignItems, 0);
        this.i = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_alignContent, 0);
        this.j = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(R$styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i3 = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDivider, 0);
        if (i3 != 0) {
            this.n = i3;
            this.m = i3;
        }
        int i4 = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerVertical, 0);
        if (i4 != 0) {
            this.n = i4;
        }
        int i5 = obtainStyledAttributes.getInt(R$styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i5 != 0) {
            this.m = i5;
        }
        obtainStyledAttributes.recycle();
    }

    private void A() {
        setWillNotDraw(this.k == null && this.l == null);
    }

    private boolean a(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.t.get(i3).c() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean l(int i2, int i3) {
        for (int i4 = 1; i4 <= i3; i4++) {
            View r2 = r(i2 - i4);
            if (r2 != null && r2.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void m(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.t.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.t.get(i2);
            for (int i3 = 0; i3 < cVar.h; i3++) {
                int i4 = cVar.o + i3;
                View r2 = r(i4);
                if (!(r2 == null || r2.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) r2.getLayoutParams();
                    if (s(i4, i3)) {
                        p(canvas, z ? r2.getRight() + layoutParams.rightMargin : (r2.getLeft() - layoutParams.leftMargin) - this.p, cVar.b, cVar.g);
                    }
                    if (i3 == cVar.h - 1 && (this.n & 4) > 0) {
                        p(canvas, z ? (r2.getLeft() - layoutParams.leftMargin) - this.p : r2.getRight() + layoutParams.rightMargin, cVar.b, cVar.g);
                    }
                }
            }
            if (t(i2)) {
                o(canvas, paddingLeft, z2 ? cVar.d : cVar.b - this.o, max);
            }
            if (u(i2) && (this.m & 4) > 0) {
                o(canvas, paddingLeft, z2 ? cVar.b - this.o : cVar.d, max);
            }
        }
    }

    private void n(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.t.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.t.get(i2);
            for (int i3 = 0; i3 < cVar.h; i3++) {
                int i4 = cVar.o + i3;
                View r2 = r(i4);
                if (!(r2 == null || r2.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) r2.getLayoutParams();
                    if (s(i4, i3)) {
                        o(canvas, cVar.a, z2 ? r2.getBottom() + layoutParams.bottomMargin : (r2.getTop() - layoutParams.topMargin) - this.o, cVar.g);
                    }
                    if (i3 == cVar.h - 1 && (this.m & 4) > 0) {
                        o(canvas, cVar.a, z2 ? (r2.getTop() - layoutParams.topMargin) - this.o : r2.getBottom() + layoutParams.bottomMargin, cVar.g);
                    }
                }
            }
            if (t(i2)) {
                p(canvas, z ? cVar.c : cVar.a - this.p, paddingTop, max);
            }
            if (u(i2) && (this.n & 4) > 0) {
                p(canvas, z ? cVar.a - this.p : cVar.c, paddingTop, max);
            }
        }
    }

    private void o(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setBounds(i2, i3, i4 + i2, this.o + i3);
            this.k.draw(canvas);
        }
    }

    private void p(Canvas canvas, int i2, int i3, int i4) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setBounds(i2, i3, this.p + i2, i4 + i3);
            this.l.draw(canvas);
        }
    }

    private boolean s(int i2, int i3) {
        return l(i2, i3) ? j() ? (this.n & 1) != 0 : (this.m & 1) != 0 : j() ? (this.n & 2) != 0 : (this.m & 2) != 0;
    }

    private boolean t(int i2) {
        if (i2 < 0 || i2 >= this.t.size()) {
            return false;
        }
        return a(i2) ? j() ? (this.m & 1) != 0 : (this.n & 1) != 0 : j() ? (this.m & 2) != 0 : (this.n & 2) != 0;
    }

    private boolean u(int i2) {
        if (i2 < 0 || i2 >= this.t.size()) {
            return false;
        }
        for (int i3 = i2 + 1; i3 < this.t.size(); i3++) {
            if (this.t.get(i3).c() > 0) {
                return false;
            }
        }
        return j() ? (this.m & 4) != 0 : (this.n & 4) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v(boolean r29, int r30, int r31, int r32, int r33) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r28.getPaddingLeft()
            int r2 = r28.getPaddingRight()
            int r3 = r33 - r31
            int r4 = r32 - r30
            int r5 = r28.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r28.getPaddingTop()
            java.util.List<com.google.android.flexbox.c> r6 = r0.t
            int r6 = r6.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r6) goto L_0x01ff
            java.util.List<com.google.android.flexbox.c> r9 = r0.t
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.c r9 = (com.google.android.flexbox.c) r9
            boolean r10 = r0.t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.o
            int r3 = r3 - r10
            int r5 = r5 + r10
        L_0x0032:
            int r10 = r0.g
            r15 = 4
            r14 = 2
            r11 = 0
            r13 = 1
            if (r10 == 0) goto L_0x00c6
            if (r10 == r13) goto L_0x00bc
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L_0x00aa
            r7 = 3
            if (r10 == r7) goto L_0x0092
            if (r10 == r15) goto L_0x0079
            r7 = 5
            if (r10 != r7) goto L_0x0060
            int r7 = r9.c()
            if (r7 == 0) goto L_0x0058
            int r10 = r9.e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r7 = r7 + 1
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0059
        L_0x0058:
            r10 = 0
        L_0x0059:
            float r7 = (float) r1
            float r7 = r7 + r10
            int r12 = r4 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00cb
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0079:
            int r7 = r9.c()
            if (r7 == 0) goto L_0x0087
            int r10 = r9.e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r7 = (float) r7
            float r10 = r10 / r7
            goto L_0x0088
        L_0x0087:
            r10 = 0
        L_0x0088:
            float r7 = (float) r1
            float r12 = r10 / r12
            float r7 = r7 + r12
            int r14 = r4 - r2
            float r14 = (float) r14
            float r12 = r14 - r12
            goto L_0x00cb
        L_0x0092:
            float r7 = (float) r1
            int r10 = r9.c()
            if (r10 == r13) goto L_0x009d
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x009f
        L_0x009d:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x009f:
            int r12 = r9.e
            int r12 = r4 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r4 - r2
            float r12 = (float) r12
            goto L_0x00cb
        L_0x00aa:
            float r7 = (float) r1
            int r10 = r9.e
            int r14 = r4 - r10
            float r14 = (float) r14
            float r14 = r14 / r12
            float r7 = r7 + r14
            int r14 = r4 - r2
            float r14 = (float) r14
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r12
            float r12 = r14 - r10
            goto L_0x00ca
        L_0x00bc:
            int r7 = r9.e
            int r10 = r4 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            float r12 = (float) r7
            r7 = r10
            goto L_0x00ca
        L_0x00c6:
            float r7 = (float) r1
            int r10 = r4 - r2
            float r12 = (float) r10
        L_0x00ca:
            r10 = 0
        L_0x00cb:
            float r17 = java.lang.Math.max(r10, r11)
            r14 = 0
        L_0x00d0:
            int r10 = r9.h
            if (r14 >= r10) goto L_0x01f3
            int r10 = r9.o
            int r10 = r10 + r14
            android.view.View r18 = r0.r(r10)
            if (r18 == 0) goto L_0x01e1
            int r11 = r18.getVisibility()
            r15 = 8
            if (r11 != r15) goto L_0x00e7
            goto L_0x01e1
        L_0x00e7:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r15 = r11
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r11 = r15.leftMargin
            float r11 = (float) r11
            float r7 = r7 + r11
            int r11 = r15.rightMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.s(r10, r14)
            if (r10 == 0) goto L_0x0106
            int r10 = r0.p
            float r11 = (float) r10
            float r7 = r7 + r11
            float r12 = r12 - r11
            r20 = r10
            r19 = r12
            goto L_0x010a
        L_0x0106:
            r19 = r12
            r20 = 0
        L_0x010a:
            int r10 = r9.h
            int r10 = r10 - r13
            if (r14 != r10) goto L_0x011c
            int r10 = r0.n
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x011e
            int r10 = r0.p
            r21 = r10
            goto L_0x0120
        L_0x011c:
            r16 = 4
        L_0x011e:
            r21 = 0
        L_0x0120:
            int r10 = r0.f
            r12 = 2
            if (r10 != r12) goto L_0x0179
            if (r29 == 0) goto L_0x0152
            com.google.android.flexbox.d r10 = r0.s
            int r11 = java.lang.Math.round(r19)
            int r22 = r18.getMeasuredWidth()
            int r22 = r11 - r22
            int r11 = r18.getMeasuredHeight()
            int r23 = r3 - r11
            int r24 = java.lang.Math.round(r19)
            r11 = r18
            r25 = 2
            r12 = r9
            r26 = 1
            r13 = r22
            r22 = r14
            r14 = r23
            r23 = r1
            r1 = r15
            r27 = 4
            r15 = r24
            goto L_0x0176
        L_0x0152:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            com.google.android.flexbox.d r10 = r0.s
            int r13 = java.lang.Math.round(r7)
            int r11 = r18.getMeasuredHeight()
            int r14 = r3 - r11
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
            r11 = r18
            r12 = r9
        L_0x0176:
            r16 = r3
            goto L_0x01af
        L_0x0179:
            r23 = r1
            r22 = r14
            r1 = r15
            r25 = 2
            r26 = 1
            r27 = 4
            com.google.android.flexbox.d r10 = r0.s
            if (r29 == 0) goto L_0x0197
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredWidth()
            int r13 = r11 - r12
            int r15 = java.lang.Math.round(r19)
            goto L_0x01a5
        L_0x0197:
            int r13 = java.lang.Math.round(r7)
            int r11 = java.lang.Math.round(r7)
            int r12 = r18.getMeasuredWidth()
            int r15 = r11 + r12
        L_0x01a5:
            int r11 = r18.getMeasuredHeight()
            int r16 = r5 + r11
            r11 = r18
            r12 = r9
            r14 = r5
        L_0x01af:
            r10.Q(r11, r12, r13, r14, r15, r16)
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r11 = r1.rightMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r7 = r7 + r10
            int r10 = r18.getMeasuredWidth()
            float r10 = (float) r10
            float r10 = r10 + r17
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r10 = r10 + r1
            float r19 = r19 - r10
            r13 = 0
            r15 = 0
            r10 = r9
            r11 = r18
            if (r29 == 0) goto L_0x01d7
            r12 = r21
            r14 = r20
            goto L_0x01db
        L_0x01d7:
            r12 = r20
            r14 = r21
        L_0x01db:
            r10.d(r11, r12, r13, r14, r15)
            r12 = r19
            goto L_0x01eb
        L_0x01e1:
            r23 = r1
            r22 = r14
            r25 = 2
            r26 = 1
            r27 = 4
        L_0x01eb:
            int r14 = r22 + 1
            r1 = r23
            r13 = 1
            r15 = 4
            goto L_0x00d0
        L_0x01f3:
            r23 = r1
            int r1 = r9.g
            int r5 = r5 + r1
            int r3 = r3 - r1
            int r8 = r8 + 1
            r1 = r23
            goto L_0x001e
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.v(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void w(boolean r30, boolean r31, int r32, int r33, int r34, int r35) {
        /*
            r29 = this;
            r0 = r29
            int r1 = r29.getPaddingTop()
            int r2 = r29.getPaddingBottom()
            int r3 = r29.getPaddingRight()
            int r4 = r29.getPaddingLeft()
            int r5 = r34 - r32
            int r6 = r35 - r33
            int r5 = r5 - r3
            java.util.List<com.google.android.flexbox.c> r3 = r0.t
            int r3 = r3.size()
            r8 = 0
        L_0x001e:
            if (r8 >= r3) goto L_0x01fa
            java.util.List<com.google.android.flexbox.c> r9 = r0.t
            java.lang.Object r9 = r9.get(r8)
            com.google.android.flexbox.c r9 = (com.google.android.flexbox.c) r9
            boolean r10 = r0.t(r8)
            if (r10 == 0) goto L_0x0032
            int r10 = r0.p
            int r4 = r4 + r10
            int r5 = r5 - r10
        L_0x0032:
            int r10 = r0.g
            r15 = 4
            r11 = 0
            r14 = 1
            if (r10 == 0) goto L_0x00c4
            if (r10 == r14) goto L_0x00bc
            r12 = 2
            r13 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x00a9
            r12 = 3
            if (r10 == r12) goto L_0x0092
            if (r10 == r15) goto L_0x0079
            r12 = 5
            if (r10 != r12) goto L_0x0060
            int r10 = r9.c()
            if (r10 == 0) goto L_0x0058
            int r12 = r9.e
            int r12 = r6 - r12
            float r12 = (float) r12
            int r10 = r10 + 1
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0059
        L_0x0058:
            r12 = 0
        L_0x0059:
            float r10 = (float) r1
            float r10 = r10 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r13 = r13 - r12
            goto L_0x00c9
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0079:
            int r10 = r9.c()
            if (r10 == 0) goto L_0x0087
            int r12 = r9.e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = (float) r10
            float r12 = r12 / r10
            goto L_0x0088
        L_0x0087:
            r12 = 0
        L_0x0088:
            float r10 = (float) r1
            float r13 = r12 / r13
            float r10 = r10 + r13
            int r7 = r6 - r2
            float r7 = (float) r7
            float r13 = r7 - r13
            goto L_0x00c9
        L_0x0092:
            float r10 = (float) r1
            int r7 = r9.c()
            if (r7 == r14) goto L_0x009d
            int r7 = r7 + -1
            float r7 = (float) r7
            goto L_0x009f
        L_0x009d:
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x009f:
            int r12 = r9.e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r12 = r12 / r7
            int r7 = r6 - r2
            float r13 = (float) r7
            goto L_0x00c9
        L_0x00a9:
            float r7 = (float) r1
            int r10 = r9.e
            int r12 = r6 - r10
            float r12 = (float) r12
            float r12 = r12 / r13
            float r7 = r7 + r12
            int r12 = r6 - r2
            float r12 = (float) r12
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r13
            float r13 = r12 - r10
            r10 = r7
            goto L_0x00c8
        L_0x00bc:
            int r7 = r9.e
            int r10 = r6 - r7
            int r10 = r10 + r2
            float r10 = (float) r10
            int r7 = r7 - r1
            goto L_0x00c7
        L_0x00c4:
            float r10 = (float) r1
            int r7 = r6 - r2
        L_0x00c7:
            float r13 = (float) r7
        L_0x00c8:
            r12 = 0
        L_0x00c9:
            float r7 = java.lang.Math.max(r12, r11)
            r12 = 0
        L_0x00ce:
            int r11 = r9.h
            if (r12 >= r11) goto L_0x01f2
            int r11 = r9.o
            int r11 = r11 + r12
            android.view.View r18 = r0.r(r11)
            if (r18 == 0) goto L_0x01e6
            int r15 = r18.getVisibility()
            r14 = 8
            if (r15 != r14) goto L_0x00e5
            goto L_0x01e6
        L_0x00e5:
            android.view.ViewGroup$LayoutParams r14 = r18.getLayoutParams()
            r15 = r14
            com.google.android.flexbox.FlexboxLayout$LayoutParams r15 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r15
            int r14 = r15.topMargin
            float r14 = (float) r14
            float r10 = r10 + r14
            int r14 = r15.bottomMargin
            float r14 = (float) r14
            float r13 = r13 - r14
            boolean r11 = r0.s(r11, r12)
            if (r11 == 0) goto L_0x0106
            int r11 = r0.o
            float r14 = (float) r11
            float r10 = r10 + r14
            float r13 = r13 - r14
            r19 = r10
            r21 = r11
            r20 = r13
            goto L_0x010c
        L_0x0106:
            r19 = r10
            r20 = r13
            r21 = 0
        L_0x010c:
            int r10 = r9.h
            r14 = 1
            int r10 = r10 - r14
            if (r12 != r10) goto L_0x011f
            int r10 = r0.m
            r16 = 4
            r10 = r10 & 4
            if (r10 <= 0) goto L_0x0121
            int r10 = r0.o
            r22 = r10
            goto L_0x0123
        L_0x011f:
            r16 = 4
        L_0x0121:
            r22 = 0
        L_0x0123:
            if (r30 == 0) goto L_0x0177
            if (r31 == 0) goto L_0x0152
            com.google.android.flexbox.d r10 = r0.s
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r17 = r5 - r11
            int r11 = java.lang.Math.round(r20)
            int r23 = r18.getMeasuredHeight()
            int r23 = r11 - r23
            int r24 = java.lang.Math.round(r20)
            r11 = r18
            r25 = r12
            r12 = r9
            r26 = 1
            r14 = r17
            r27 = r15
            r28 = 4
            r15 = r23
            r16 = r5
            r17 = r24
            goto L_0x01b1
        L_0x0152:
            r25 = r12
            r27 = r15
            r26 = 1
            r28 = 4
            com.google.android.flexbox.d r10 = r0.s
            r13 = 1
            int r11 = r18.getMeasuredWidth()
            int r14 = r5 - r11
            int r15 = java.lang.Math.round(r19)
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
            r11 = r18
            r12 = r9
            r16 = r5
            goto L_0x01b1
        L_0x0177:
            r25 = r12
            r27 = r15
            r26 = 1
            r28 = 4
            com.google.android.flexbox.d r10 = r0.s
            r13 = 0
            if (r31 == 0) goto L_0x0199
            int r11 = java.lang.Math.round(r20)
            int r12 = r18.getMeasuredHeight()
            int r15 = r11 - r12
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r17 = java.lang.Math.round(r20)
            goto L_0x01ad
        L_0x0199:
            int r15 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredWidth()
            int r16 = r4 + r11
            int r11 = java.lang.Math.round(r19)
            int r12 = r18.getMeasuredHeight()
            int r17 = r11 + r12
        L_0x01ad:
            r11 = r18
            r12 = r9
            r14 = r4
        L_0x01b1:
            r10.R(r11, r12, r13, r14, r15, r16, r17)
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            r14 = r27
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r19 = r19 + r10
            int r10 = r18.getMeasuredHeight()
            float r10 = (float) r10
            float r10 = r10 + r7
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r10 = r10 + r11
            float r20 = r20 - r10
            r12 = 0
            r14 = 0
            r10 = r9
            r11 = r18
            if (r31 == 0) goto L_0x01da
            r13 = r22
            r15 = r21
            goto L_0x01de
        L_0x01da:
            r13 = r21
            r15 = r22
        L_0x01de:
            r10.d(r11, r12, r13, r14, r15)
            r10 = r19
            r13 = r20
            goto L_0x01ec
        L_0x01e6:
            r25 = r12
            r26 = 1
            r28 = 4
        L_0x01ec:
            int r12 = r25 + 1
            r14 = 1
            r15 = 4
            goto L_0x00ce
        L_0x01f2:
            int r7 = r9.g
            int r4 = r4 + r7
            int r5 = r5 - r7
            int r8 = r8 + 1
            goto L_0x001e
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.w(boolean, boolean, int, int, int, int):void");
    }

    private void x(int i2, int i3) {
        int i4;
        this.t.clear();
        this.u.a();
        this.s.c(this.u, i2, i3);
        this.t = this.u.a;
        this.s.p(i2, i3);
        if (this.h == 3) {
            for (c next : this.t) {
                int i5 = Integer.MIN_VALUE;
                for (int i6 = 0; i6 < next.h; i6++) {
                    View r2 = r(next.o + i6);
                    if (!(r2 == null || r2.getVisibility() == 8)) {
                        LayoutParams layoutParams = (LayoutParams) r2.getLayoutParams();
                        if (this.f != 2) {
                            i4 = r2.getMeasuredHeight() + Math.max(next.l - r2.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin;
                        } else {
                            i4 = r2.getMeasuredHeight() + layoutParams.topMargin + Math.max((next.l - r2.getMeasuredHeight()) + r2.getBaseline(), layoutParams.bottomMargin);
                        }
                        i5 = Math.max(i5, i4);
                    }
                }
                next.g = i5;
            }
        }
        this.s.o(i2, i3, getPaddingTop() + getPaddingBottom());
        this.s.X();
        z(this.e, i2, i3, this.u.b);
    }

    private void y(int i2, int i3) {
        this.t.clear();
        this.u.a();
        this.s.f(this.u, i2, i3);
        this.t = this.u.a;
        this.s.p(i2, i3);
        this.s.o(i2, i3, getPaddingLeft() + getPaddingRight());
        this.s.X();
        z(this.e, i2, i3, this.u.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (r1 < r4) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        if (r3 < r9) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void z(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r10)
            int r1 = android.view.View.MeasureSpec.getSize(r10)
            int r2 = android.view.View.MeasureSpec.getMode(r11)
            int r3 = android.view.View.MeasureSpec.getSize(r11)
            if (r9 == 0) goto L_0x0046
            r4 = 1
            if (r9 == r4) goto L_0x0046
            r4 = 2
            if (r9 == r4) goto L_0x0033
            r4 = 3
            if (r9 != r4) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid flex direction: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x0033:
            int r9 = r8.getLargestMainSize()
            int r4 = r8.getSumOfCrossSize()
            int r5 = r8.getPaddingLeft()
            int r4 = r4 + r5
            int r5 = r8.getPaddingRight()
            int r4 = r4 + r5
            goto L_0x0058
        L_0x0046:
            int r9 = r8.getSumOfCrossSize()
            int r4 = r8.getPaddingTop()
            int r9 = r9 + r4
            int r4 = r8.getPaddingBottom()
            int r9 = r9 + r4
            int r4 = r8.getLargestMainSize()
        L_0x0058:
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r7) goto L_0x008b
            if (r0 == 0) goto L_0x0086
            if (r0 != r6) goto L_0x006f
            if (r1 >= r4) goto L_0x006a
        L_0x0066:
            int r12 = android.view.View.combineMeasuredStates(r12, r5)
        L_0x006a:
            int r10 = android.view.View.resolveSizeAndState(r1, r10, r12)
            goto L_0x0090
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unknown width mode is set: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0086:
            int r10 = android.view.View.resolveSizeAndState(r4, r10, r12)
            goto L_0x0090
        L_0x008b:
            if (r1 >= r4) goto L_0x008e
            goto L_0x0066
        L_0x008e:
            r1 = r4
            goto L_0x006a
        L_0x0090:
            r0 = 256(0x100, float:3.59E-43)
            if (r2 == r7) goto L_0x00bf
            if (r2 == 0) goto L_0x00ba
            if (r2 != r6) goto L_0x00a3
            if (r3 >= r9) goto L_0x009e
        L_0x009a:
            int r12 = android.view.View.combineMeasuredStates(r12, r0)
        L_0x009e:
            int r9 = android.view.View.resolveSizeAndState(r3, r11, r12)
            goto L_0x00c4
        L_0x00a3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unknown height mode is set: "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00ba:
            int r9 = android.view.View.resolveSizeAndState(r9, r11, r12)
            goto L_0x00c4
        L_0x00bf:
            if (r3 >= r9) goto L_0x00c2
            goto L_0x009a
        L_0x00c2:
            r3 = r9
            goto L_0x009e
        L_0x00c4:
            r8.setMeasuredDimension(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.z(int, int, int, int):void");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (this.r == null) {
            this.r = new SparseIntArray(getChildCount());
        }
        this.q = this.s.n(view, i2, layoutParams, this.r);
        super.addView(view, i2, layoutParams);
    }

    public void b(View view, int i2, int i3, c cVar) {
        int i4;
        int i5;
        if (s(i2, i3)) {
            if (j()) {
                i5 = cVar.e;
                i4 = this.p;
            } else {
                i5 = cVar.e;
                i4 = this.o;
            }
            cVar.e = i5 + i4;
            cVar.f += i4;
        }
    }

    public void c(c cVar) {
        int i2;
        int i3;
        if (j()) {
            if ((this.n & 4) > 0) {
                i3 = cVar.e;
                i2 = this.p;
            } else {
                return;
            }
        } else if ((this.m & 4) > 0) {
            i3 = cVar.e;
            i2 = this.o;
        } else {
            return;
        }
        cVar.e = i3 + i2;
        cVar.f += i2;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public View d(int i2) {
        return r(i2);
    }

    public int e(int i2, int i3, int i4) {
        return ViewGroup.getChildMeasureSpec(i2, i3, i4);
    }

    public void f(int i2, View view) {
    }

    public View g(int i2) {
        return getChildAt(i2);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getAlignContent() {
        return this.i;
    }

    public int getAlignItems() {
        return this.h;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.k;
    }

    public Drawable getDividerDrawableVertical() {
        return this.l;
    }

    public int getFlexDirection() {
        return this.e;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.t.size());
        for (c next : this.t) {
            if (next.c() != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<c> getFlexLinesInternal() {
        return this.t;
    }

    public int getFlexWrap() {
        return this.f;
    }

    public int getJustifyContent() {
        return this.g;
    }

    public int getLargestMainSize() {
        int i2 = Integer.MIN_VALUE;
        for (c cVar : this.t) {
            i2 = Math.max(i2, cVar.e);
        }
        return i2;
    }

    public int getMaxLine() {
        return this.j;
    }

    public int getShowDividerHorizontal() {
        return this.m;
    }

    public int getShowDividerVertical() {
        return this.n;
    }

    public int getSumOfCrossSize() {
        int size = this.t.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            c cVar = this.t.get(i3);
            if (t(i3)) {
                i2 += j() ? this.o : this.p;
            }
            if (u(i3)) {
                i2 += j() ? this.o : this.p;
            }
            i2 += cVar.g;
        }
        return i2;
    }

    public int h(View view, int i2, int i3) {
        int i4;
        int i5 = 0;
        if (j()) {
            if (s(i2, i3)) {
                i5 = 0 + this.p;
            }
            if ((this.n & 4) <= 0) {
                return i5;
            }
            i4 = this.p;
        } else {
            if (s(i2, i3)) {
                i5 = 0 + this.o;
            }
            if ((this.m & 4) <= 0) {
                return i5;
            }
            i4 = this.o;
        }
        return i5 + i4;
    }

    public int i(int i2, int i3, int i4) {
        return ViewGroup.getChildMeasureSpec(i2, i3, i4);
    }

    public boolean j() {
        int i2 = this.e;
        return i2 == 0 || i2 == 1;
    }

    public int k(View view) {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
        if (r6.f == 2) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0051, code lost:
        if (r6.f == 2) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.l
            if (r0 != 0) goto L_0x0009
            android.graphics.drawable.Drawable r0 = r6.k
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r6.m
            if (r0 != 0) goto L_0x0012
            int r0 = r6.n
            if (r0 != 0) goto L_0x0012
            return
        L_0x0012:
            int r0 = defpackage.o4.y(r6)
            int r1 = r6.e
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x004a
            if (r1 == r4) goto L_0x0040
            if (r1 == r2) goto L_0x0032
            r5 = 3
            if (r1 == r5) goto L_0x0025
            goto L_0x0057
        L_0x0025:
            if (r0 != r4) goto L_0x0028
            r3 = 1
        L_0x0028:
            int r0 = r6.f
            if (r0 != r2) goto L_0x002e
            r3 = r3 ^ 1
        L_0x002e:
            r6.n(r7, r3, r4)
            goto L_0x0057
        L_0x0032:
            if (r0 != r4) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r4 = 0
        L_0x0036:
            int r0 = r6.f
            if (r0 != r2) goto L_0x003c
            r4 = r4 ^ 1
        L_0x003c:
            r6.n(r7, r4, r3)
            goto L_0x0057
        L_0x0040:
            if (r0 == r4) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            int r1 = r6.f
            if (r1 != r2) goto L_0x0054
            goto L_0x0053
        L_0x004a:
            if (r0 != r4) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            int r1 = r6.f
            if (r1 != r2) goto L_0x0054
        L_0x0053:
            r3 = 1
        L_0x0054:
            r6.m(r7, r0, r3)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onDraw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        if (r0 != 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r0 == 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            int r0 = defpackage.o4.y(r7)
            int r1 = r7.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0052
            if (r1 == r3) goto L_0x004f
            r4 = 2
            if (r1 == r4) goto L_0x0039
            r5 = 3
            if (r1 != r5) goto L_0x0020
            if (r0 != r3) goto L_0x0015
            r2 = 1
        L_0x0015:
            int r0 = r7.f
            if (r0 != r4) goto L_0x001d
            r0 = r2 ^ 1
            r1 = r0
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            r2 = 1
            goto L_0x0046
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid flex direction is set: "
            r1.append(r2)
            int r2 = r7.e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0039:
            if (r0 != r3) goto L_0x003c
            r2 = 1
        L_0x003c:
            int r0 = r7.f
            if (r0 != r4) goto L_0x0044
            r0 = r2 ^ 1
            r1 = r0
            goto L_0x0045
        L_0x0044:
            r1 = r2
        L_0x0045:
            r2 = 0
        L_0x0046:
            r0 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.w(r1, r2, r3, r4, r5, r6)
            goto L_0x005f
        L_0x004f:
            if (r0 == r3) goto L_0x0056
            goto L_0x0054
        L_0x0052:
            if (r0 != r3) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.v(r1, r2, r3, r4, r5)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        if (this.r == null) {
            this.r = new SparseIntArray(getChildCount());
        }
        if (this.s.O(this.r)) {
            this.q = this.s.m(this.r);
        }
        int i4 = this.e;
        if (i4 == 0 || i4 == 1) {
            x(i2, i3);
        } else if (i4 == 2 || i4 == 3) {
            y(i2, i3);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.e);
        }
    }

    /* renamed from: q */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public View r(int i2) {
        if (i2 < 0) {
            return null;
        }
        int[] iArr = this.q;
        if (i2 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i2]);
    }

    public void setAlignContent(int i2) {
        if (this.i != i2) {
            this.i = i2;
            requestLayout();
        }
    }

    public void setAlignItems(int i2) {
        if (this.h != i2) {
            this.h = i2;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.k) {
            this.k = drawable;
            this.o = drawable != null ? drawable.getIntrinsicHeight() : 0;
            A();
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.l) {
            this.l = drawable;
            this.p = drawable != null ? drawable.getIntrinsicWidth() : 0;
            A();
            requestLayout();
        }
    }

    public void setFlexDirection(int i2) {
        if (this.e != i2) {
            this.e = i2;
            requestLayout();
        }
    }

    public void setFlexLines(List<c> list) {
        this.t = list;
    }

    public void setFlexWrap(int i2) {
        if (this.f != i2) {
            this.f = i2;
            requestLayout();
        }
    }

    public void setJustifyContent(int i2) {
        if (this.g != i2) {
            this.g = i2;
            requestLayout();
        }
    }

    public void setMaxLine(int i2) {
        if (this.j != i2) {
            this.j = i2;
            requestLayout();
        }
    }

    public void setShowDivider(int i2) {
        setShowDividerVertical(i2);
        setShowDividerHorizontal(i2);
    }

    public void setShowDividerHorizontal(int i2) {
        if (i2 != this.m) {
            this.m = i2;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i2) {
        if (i2 != this.n) {
            this.n = i2;
            requestLayout();
        }
    }
}
