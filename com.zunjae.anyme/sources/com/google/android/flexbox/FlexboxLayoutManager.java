package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.n;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.o implements a, RecyclerView.y.b {
    private static final Rect W = new Rect();
    private int A = -1;
    /* access modifiers changed from: private */
    public boolean B;
    private boolean C;
    /* access modifiers changed from: private */
    public List<c> D = new ArrayList();
    /* access modifiers changed from: private */
    public final d E = new d(this);
    private RecyclerView.u F;
    private RecyclerView.z G;
    private c H;
    private b I = new b();
    /* access modifiers changed from: private */
    public n J;
    /* access modifiers changed from: private */
    public n K;
    private d L;
    private int M = -1;
    private int N = Integer.MIN_VALUE;
    private int O = Integer.MIN_VALUE;
    private int P = Integer.MIN_VALUE;
    private boolean Q;
    private SparseArray<View> R = new SparseArray<>();
    private final Context S;
    private View T;
    private int U = -1;
    private d.b V = new d.b();
    /* access modifiers changed from: private */
    public int w;
    /* access modifiers changed from: private */
    public int x;
    private int y;
    private int z;

    public static class LayoutParams extends RecyclerView.LayoutParams implements b {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private float i = Utils.FLOAT_EPSILON;
        private float j = 1.0f;
        private int k = -1;
        private float l = -1.0f;
        private int m;
        private int n;
        private int o = 16777215;
        private int p = 16777215;
        private boolean q;

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

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.i = parcel.readFloat();
            this.j = parcel.readFloat();
            this.k = parcel.readInt();
            this.l = parcel.readFloat();
            this.m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = parcel.readInt();
            this.p = parcel.readInt();
            this.q = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public int A() {
            return this.k;
        }

        public float B() {
            return this.j;
        }

        public int D0() {
            return this.p;
        }

        public int G() {
            return this.m;
        }

        public void K(int i2) {
            this.m = i2;
        }

        public int L() {
            return this.bottomMargin;
        }

        public int L0() {
            return this.o;
        }

        public int P() {
            return this.leftMargin;
        }

        public int V() {
            return this.topMargin;
        }

        public void Z(int i2) {
            this.n = i2;
        }

        public float c0() {
            return this.i;
        }

        public int describeContents() {
            return 0;
        }

        public int getHeight() {
            return this.height;
        }

        public int getOrder() {
            return 1;
        }

        public int getWidth() {
            return this.width;
        }

        public float h0() {
            return this.l;
        }

        public int s0() {
            return this.rightMargin;
        }

        public int v0() {
            return this.n;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeFloat(this.i);
            parcel.writeFloat(this.j);
            parcel.writeInt(this.k);
            parcel.writeFloat(this.l);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.o);
            parcel.writeInt(this.p);
            parcel.writeByte(this.q ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public boolean z0() {
            return this.q;
        }
    }

    private class b {
        /* access modifiers changed from: private */
        public int a;
        /* access modifiers changed from: private */
        public int b;
        /* access modifiers changed from: private */
        public int c;
        /* access modifiers changed from: private */
        public int d;
        /* access modifiers changed from: private */
        public boolean e;
        /* access modifiers changed from: private */
        public boolean f;
        /* access modifiers changed from: private */
        public boolean g;

        private b() {
            this.d = 0;
        }

        /* access modifiers changed from: private */
        public void q() {
            int i;
            if (FlexboxLayoutManager.this.j() || !FlexboxLayoutManager.this.B) {
                if (!this.e) {
                    i = FlexboxLayoutManager.this.J.m();
                    this.c = i;
                }
            } else if (!this.e) {
                i = FlexboxLayoutManager.this.u0() - FlexboxLayoutManager.this.J.m();
                this.c = i;
            }
            i = FlexboxLayoutManager.this.J.i();
            this.c = i;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void r(android.view.View r4) {
            /*
                r3 = this;
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                int r0 = r0.x
                if (r0 != 0) goto L_0x000f
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.n r0 = r0.K
                goto L_0x0015
            L_0x000f:
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                androidx.recyclerview.widget.n r0 = r0.J
            L_0x0015:
                com.google.android.flexbox.FlexboxLayoutManager r1 = com.google.android.flexbox.FlexboxLayoutManager.this
                boolean r1 = r1.j()
                if (r1 != 0) goto L_0x0033
                com.google.android.flexbox.FlexboxLayoutManager r1 = com.google.android.flexbox.FlexboxLayoutManager.this
                boolean r1 = r1.B
                if (r1 == 0) goto L_0x0033
                boolean r1 = r3.e
                if (r1 == 0) goto L_0x002e
                int r1 = r0.g(r4)
                goto L_0x003b
            L_0x002e:
                int r0 = r0.d(r4)
                goto L_0x0047
            L_0x0033:
                boolean r1 = r3.e
                if (r1 == 0) goto L_0x0043
                int r1 = r0.d(r4)
            L_0x003b:
                int r0 = r0.o()
                int r1 = r1 + r0
                r3.c = r1
                goto L_0x0049
            L_0x0043:
                int r0 = r0.g(r4)
            L_0x0047:
                r3.c = r0
            L_0x0049:
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                int r4 = r0.n0(r4)
                r3.a = r4
                r4 = 0
                r3.g = r4
                com.google.android.flexbox.FlexboxLayoutManager r0 = com.google.android.flexbox.FlexboxLayoutManager.this
                com.google.android.flexbox.d r0 = r0.E
                int[] r0 = r0.c
                int r1 = r3.a
                r2 = -1
                if (r1 == r2) goto L_0x0062
                goto L_0x0063
            L_0x0062:
                r1 = 0
            L_0x0063:
                r0 = r0[r1]
                if (r0 == r2) goto L_0x0068
                r4 = r0
            L_0x0068:
                r3.b = r4
                com.google.android.flexbox.FlexboxLayoutManager r4 = com.google.android.flexbox.FlexboxLayoutManager.this
                java.util.List r4 = r4.D
                int r4 = r4.size()
                int r0 = r3.b
                if (r4 <= r0) goto L_0x008a
                com.google.android.flexbox.FlexboxLayoutManager r4 = com.google.android.flexbox.FlexboxLayoutManager.this
                java.util.List r4 = r4.D
                int r0 = r3.b
                java.lang.Object r4 = r4.get(r0)
                com.google.android.flexbox.c r4 = (com.google.android.flexbox.c) r4
                int r4 = r4.o
                r3.a = r4
            L_0x008a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.b.r(android.view.View):void");
        }

        /* access modifiers changed from: private */
        public void s() {
            this.a = -1;
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            boolean z = false;
            this.f = false;
            this.g = false;
            if (!FlexboxLayoutManager.this.j() ? !(FlexboxLayoutManager.this.x != 0 ? FlexboxLayoutManager.this.x != 2 : FlexboxLayoutManager.this.w != 3) : !(FlexboxLayoutManager.this.x != 0 ? FlexboxLayoutManager.this.x != 2 : FlexboxLayoutManager.this.w != 1)) {
                z = true;
            }
            this.e = z;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
        }
    }

    private static class c {
        /* access modifiers changed from: private */
        public int a;
        /* access modifiers changed from: private */
        public boolean b;
        /* access modifiers changed from: private */
        public int c;
        /* access modifiers changed from: private */
        public int d;
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public int f;
        /* access modifiers changed from: private */
        public int g;
        /* access modifiers changed from: private */
        public int h;
        /* access modifiers changed from: private */
        public int i;
        /* access modifiers changed from: private */
        public boolean j;

        private c() {
            this.h = 1;
            this.i = 1;
        }

        static /* synthetic */ int i(c cVar) {
            int i2 = cVar.c;
            cVar.c = i2 + 1;
            return i2;
        }

        static /* synthetic */ int j(c cVar) {
            int i2 = cVar.c;
            cVar.c = i2 - 1;
            return i2;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r2 = r1.c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean w(androidx.recyclerview.widget.RecyclerView.z r2, java.util.List<com.google.android.flexbox.c> r3) {
            /*
                r1 = this;
                int r0 = r1.d
                if (r0 < 0) goto L_0x0016
                int r2 = r2.b()
                if (r0 >= r2) goto L_0x0016
                int r2 = r1.c
                if (r2 < 0) goto L_0x0016
                int r3 = r3.size()
                if (r2 >= r3) goto L_0x0016
                r2 = 1
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c.w(androidx.recyclerview.widget.RecyclerView$z, java.util.List):boolean");
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.a + ", mFlexLinePosition=" + this.c + ", mPosition=" + this.d + ", mOffset=" + this.e + ", mScrollingOffset=" + this.f + ", mLastScrollDelta=" + this.g + ", mItemDirection=" + this.h + ", mLayoutDirection=" + this.i + '}';
        }
    }

    private static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public int f;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        d() {
        }

        private d(Parcel parcel) {
            this.e = parcel.readInt();
            this.f = parcel.readInt();
        }

        private d(d dVar) {
            this.e = dVar.e;
            this.f = dVar.f;
        }

        /* access modifiers changed from: private */
        public boolean g(int i) {
            int i2 = this.e;
            return i2 >= 0 && i2 < i;
        }

        /* access modifiers changed from: private */
        public void h() {
            this.e = -1;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.e + ", mAnchorOffset=" + this.f + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        RecyclerView.o.d o0 = RecyclerView.o.o0(context, attributeSet, i, i2);
        int i4 = o0.a;
        if (i4 != 0) {
            i3 = i4 == 1 ? o0.c ? 3 : 2 : i3;
            O2(1);
            M2(4);
            H1(true);
            this.S = context;
        } else if (o0.c) {
            N2(1);
            O2(1);
            M2(4);
            H1(true);
            this.S = context;
        } else {
            i3 = 0;
        }
        N2(i3);
        O2(1);
        M2(4);
        H1(true);
        this.S = context;
    }

    private int A2(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (T() == 0 || i == 0) {
            return 0;
        }
        j2();
        int i2 = 1;
        boolean unused = this.H.j = true;
        boolean z2 = !j() && this.B;
        if (!z2 ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        U2(i2, abs);
        int k = this.H.f + k2(uVar, zVar, this.H);
        if (k < 0) {
            return 0;
        }
        if (z2) {
            if (abs > k) {
                i = (-i2) * k;
            }
        } else if (abs > k) {
            i = i2 * k;
        }
        this.J.r(-i);
        int unused2 = this.H.g = i;
        return i;
    }

    private int B2(int i) {
        int i2;
        boolean z2 = false;
        if (T() == 0 || i == 0) {
            return 0;
        }
        j2();
        boolean j = j();
        View view = this.T;
        int width = j ? view.getWidth() : view.getHeight();
        int u0 = j ? u0() : g0();
        if (j0() == 1) {
            z2 = true;
        }
        if (z2) {
            int abs = Math.abs(i);
            if (i < 0) {
                i2 = Math.min((u0 + this.I.d) - width, abs);
                return -i2;
            } else if (this.I.d + i <= 0) {
                return i;
            }
        } else if (i > 0) {
            return Math.min((u0 - this.I.d) - width, i);
        } else {
            if (this.I.d + i >= 0) {
                return i;
            }
        }
        i2 = this.I.d;
        return -i2;
    }

    private boolean C2(View view, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int u0 = u0() - getPaddingRight();
        int g0 = g0() - getPaddingBottom();
        int x2 = x2(view);
        int z22 = z2(view);
        int y2 = y2(view);
        int v2 = v2(view);
        return z2 ? (paddingLeft <= x2 && u0 >= y2) && (paddingTop <= z22 && g0 >= v2) : (x2 >= u0 || y2 >= paddingLeft) && (z22 >= g0 || v2 >= paddingTop);
    }

    private static boolean D0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private int D2(c cVar, c cVar2) {
        return j() ? E2(cVar, cVar2) : F2(cVar, cVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int E2(com.google.android.flexbox.c r22, com.google.android.flexbox.FlexboxLayoutManager.c r23) {
        /*
            r21 = this;
            r0 = r21
            r8 = r22
            int r1 = r21.getPaddingLeft()
            int r2 = r21.getPaddingRight()
            int r3 = r21.u0()
            int r4 = r23.e
            int r5 = r23.i
            r6 = -1
            if (r5 != r6) goto L_0x001e
            int r5 = r8.g
            int r4 = r4 - r5
        L_0x001e:
            r9 = r4
            int r10 = r23.d
            int r4 = r0.y
            r5 = 0
            r11 = 1
            if (r4 == 0) goto L_0x00ac
            if (r4 == r11) goto L_0x009e
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x008e
            r6 = 3
            if (r4 == r6) goto L_0x007b
            r6 = 4
            if (r4 == r6) goto L_0x0066
            r6 = 5
            if (r4 != r6) goto L_0x004d
            int r4 = r8.h
            if (r4 == 0) goto L_0x0046
            int r6 = r8.e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r11
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b0
        L_0x004d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.y
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0066:
            int r4 = r8.h
            if (r4 == 0) goto L_0x0072
            int r6 = r8.e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b0
        L_0x007b:
            float r1 = (float) r1
            int r4 = r8.h
            if (r4 == r11) goto L_0x0083
            int r4 = r4 - r11
            float r4 = (float) r4
            goto L_0x0085
        L_0x0083:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0085:
            int r6 = r8.e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b0
        L_0x008e:
            float r1 = (float) r1
            int r4 = r8.e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00af
        L_0x009e:
            int r4 = r8.e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = 0
            r20 = r2
            r2 = r1
            r1 = r20
            goto L_0x00b0
        L_0x00ac:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00af:
            r6 = 0
        L_0x00b0:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.I
            int r3 = r3.d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.I
            int r3 = r3.d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r12 = java.lang.Math.max(r6, r5)
            r3 = 0
            int r13 = r22.b()
            r14 = r10
        L_0x00ca:
            int r4 = r10 + r13
            if (r14 >= r4) goto L_0x0194
            android.view.View r15 = r0.g(r14)
            if (r15 != 0) goto L_0x00d6
            goto L_0x018f
        L_0x00d6:
            int r4 = r23.i
            if (r4 != r11) goto L_0x00e5
            android.graphics.Rect r4 = W
            r0.t(r15, r4)
            r0.n(r15)
            goto L_0x00ef
        L_0x00e5:
            android.graphics.Rect r4 = W
            r0.t(r15, r4)
            r0.o(r15, r3)
            int r3 = r3 + 1
        L_0x00ef:
            r16 = r3
            com.google.android.flexbox.d r3 = r0.E
            long[] r4 = r3.d
            r5 = r4[r14]
            int r3 = r3.y(r5)
            com.google.android.flexbox.d r4 = r0.E
            int r4 = r4.x(r5)
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            r7 = r5
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r7 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r7
            boolean r5 = r0.O1(r15, r3, r4, r7)
            if (r5 == 0) goto L_0x0111
            r15.measure(r3, r4)
        L_0x0111:
            int r3 = r7.leftMargin
            int r4 = r0.k0(r15)
            int r3 = r3 + r4
            float r3 = (float) r3
            float r17 = r1 + r3
            int r1 = r7.rightMargin
            int r3 = r0.p0(r15)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r0.s0(r15)
            int r5 = r9 + r1
            boolean r1 = r0.B
            if (r1 == 0) goto L_0x014c
            com.google.android.flexbox.d r1 = r0.E
            int r2 = java.lang.Math.round(r18)
            int r3 = r15.getMeasuredWidth()
            int r4 = r2 - r3
            int r6 = java.lang.Math.round(r18)
            int r2 = r15.getMeasuredHeight()
            int r19 = r5 + r2
            r2 = r15
            r3 = r22
            r11 = r7
            r7 = r19
            goto L_0x0166
        L_0x014c:
            r11 = r7
            com.google.android.flexbox.d r1 = r0.E
            int r4 = java.lang.Math.round(r17)
            int r2 = java.lang.Math.round(r17)
            int r3 = r15.getMeasuredWidth()
            int r6 = r2 + r3
            int r2 = r15.getMeasuredHeight()
            int r7 = r5 + r2
            r2 = r15
            r3 = r22
        L_0x0166:
            r1.Q(r2, r3, r4, r5, r6, r7)
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r2 = r0.p0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r17 = r17 + r1
            int r1 = r15.getMeasuredWidth()
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r0.k0(r15)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r12
            float r18 = r18 - r1
            r3 = r16
            r1 = r17
            r2 = r18
        L_0x018f:
            int r14 = r14 + 1
            r11 = 1
            goto L_0x00ca
        L_0x0194:
            int r1 = r23.c
            com.google.android.flexbox.FlexboxLayoutManager$c r2 = r0.H
            int r2 = r2.i
            int r1 = r1 + r2
            r2 = r23
            int unused = r2.c = r1
            int r1 = r22.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.E2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int F2(com.google.android.flexbox.c r26, com.google.android.flexbox.FlexboxLayoutManager.c r27) {
        /*
            r25 = this;
            r0 = r25
            r9 = r26
            int r1 = r25.getPaddingTop()
            int r2 = r25.getPaddingBottom()
            int r3 = r25.g0()
            int r4 = r27.e
            int r5 = r27.e
            int r6 = r27.i
            r7 = -1
            if (r6 != r7) goto L_0x0023
            int r6 = r9.g
            int r4 = r4 - r6
            int r5 = r5 + r6
        L_0x0023:
            r10 = r4
            r11 = r5
            int r12 = r27.d
            int r4 = r0.y
            r5 = 0
            r13 = 1
            if (r4 == 0) goto L_0x00b2
            if (r4 == r13) goto L_0x00a4
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r4 == r6) goto L_0x0094
            r6 = 3
            if (r4 == r6) goto L_0x0081
            r6 = 4
            if (r4 == r6) goto L_0x006c
            r6 = 5
            if (r4 != r6) goto L_0x0053
            int r4 = r9.h
            if (r4 == 0) goto L_0x004c
            int r6 = r9.e
            int r6 = r3 - r6
            float r6 = (float) r6
            int r4 = r4 + r13
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            float r1 = (float) r1
            float r1 = r1 + r6
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r6
            goto L_0x00b6
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid justifyContent is set: "
            r2.append(r3)
            int r3 = r0.y
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x006c:
            int r4 = r9.h
            if (r4 == 0) goto L_0x0078
            int r6 = r9.e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r4 = (float) r4
            float r6 = r6 / r4
            goto L_0x0079
        L_0x0078:
            r6 = 0
        L_0x0079:
            float r1 = (float) r1
            float r4 = r6 / r7
            float r1 = r1 + r4
            int r3 = r3 - r2
            float r2 = (float) r3
            float r2 = r2 - r4
            goto L_0x00b6
        L_0x0081:
            float r1 = (float) r1
            int r4 = r9.h
            if (r4 == r13) goto L_0x0089
            int r4 = r4 - r13
            float r4 = (float) r4
            goto L_0x008b
        L_0x0089:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x008b:
            int r6 = r9.e
            int r6 = r3 - r6
            float r6 = (float) r6
            float r6 = r6 / r4
            int r3 = r3 - r2
            float r2 = (float) r3
            goto L_0x00b6
        L_0x0094:
            float r1 = (float) r1
            int r4 = r9.e
            int r6 = r3 - r4
            float r6 = (float) r6
            float r6 = r6 / r7
            float r1 = r1 + r6
            int r2 = r3 - r2
            float r2 = (float) r2
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 / r7
            float r2 = r2 - r3
            goto L_0x00b5
        L_0x00a4:
            int r4 = r9.e
            int r3 = r3 - r4
            int r3 = r3 + r2
            float r2 = (float) r3
            int r4 = r4 - r1
            float r1 = (float) r4
            r6 = 0
            r24 = r2
            r2 = r1
            r1 = r24
            goto L_0x00b6
        L_0x00b2:
            float r1 = (float) r1
            int r3 = r3 - r2
            float r2 = (float) r3
        L_0x00b5:
            r6 = 0
        L_0x00b6:
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.I
            int r3 = r3.d
            float r3 = (float) r3
            float r1 = r1 - r3
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r0.I
            int r3 = r3.d
            float r3 = (float) r3
            float r2 = r2 - r3
            float r14 = java.lang.Math.max(r6, r5)
            r3 = 0
            int r15 = r26.b()
            r8 = r12
        L_0x00d0:
            int r4 = r12 + r15
            if (r8 >= r4) goto L_0x01fe
            android.view.View r7 = r0.g(r8)
            if (r7 != 0) goto L_0x00e2
            r23 = r8
            r17 = r14
            r22 = 1
            goto L_0x01f7
        L_0x00e2:
            com.google.android.flexbox.d r4 = r0.E
            long[] r5 = r4.d
            r17 = r14
            r13 = r5[r8]
            int r4 = r4.y(r13)
            com.google.android.flexbox.d r5 = r0.E
            int r5 = r5.x(r13)
            android.view.ViewGroup$LayoutParams r6 = r7.getLayoutParams()
            r13 = r6
            com.google.android.flexbox.FlexboxLayoutManager$LayoutParams r13 = (com.google.android.flexbox.FlexboxLayoutManager.LayoutParams) r13
            boolean r6 = r0.O1(r7, r4, r5, r13)
            if (r6 == 0) goto L_0x0104
            r7.measure(r4, r5)
        L_0x0104:
            int r4 = r13.topMargin
            int r5 = r0.s0(r7)
            int r4 = r4 + r5
            float r4 = (float) r4
            float r14 = r1 + r4
            int r1 = r13.rightMargin
            int r4 = r0.R(r7)
            int r1 = r1 + r4
            float r1 = (float) r1
            float r18 = r2 - r1
            int r1 = r27.i
            r6 = 1
            if (r1 != r6) goto L_0x0128
            android.graphics.Rect r1 = W
            r0.t(r7, r1)
            r0.n(r7)
            goto L_0x0132
        L_0x0128:
            android.graphics.Rect r1 = W
            r0.t(r7, r1)
            r0.o(r7, r3)
            int r3 = r3 + 1
        L_0x0132:
            r16 = r3
            int r1 = r0.k0(r7)
            int r5 = r10 + r1
            int r1 = r0.p0(r7)
            int r19 = r11 - r1
            boolean r4 = r0.B
            if (r4 == 0) goto L_0x0191
            boolean r1 = r0.C
            if (r1 == 0) goto L_0x016e
            com.google.android.flexbox.d r1 = r0.E
            int r2 = r7.getMeasuredWidth()
            int r5 = r19 - r2
            int r2 = java.lang.Math.round(r18)
            int r3 = r7.getMeasuredHeight()
            int r20 = r2 - r3
            int r21 = java.lang.Math.round(r18)
            r2 = r7
            r3 = r26
            r22 = 1
            r6 = r20
            r20 = r7
            r7 = r19
            r23 = r8
            r8 = r21
            goto L_0x01cc
        L_0x016e:
            r20 = r7
            r23 = r8
            r22 = 1
            com.google.android.flexbox.d r1 = r0.E
            int r2 = r20.getMeasuredWidth()
            int r5 = r19 - r2
            int r6 = java.lang.Math.round(r14)
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
            r2 = r20
            r3 = r26
            r7 = r19
            goto L_0x01cc
        L_0x0191:
            r20 = r7
            r23 = r8
            r22 = 1
            boolean r1 = r0.C
            if (r1 == 0) goto L_0x01b2
            com.google.android.flexbox.d r1 = r0.E
            int r2 = java.lang.Math.round(r18)
            int r3 = r20.getMeasuredHeight()
            int r6 = r2 - r3
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r8 = java.lang.Math.round(r18)
            goto L_0x01c8
        L_0x01b2:
            com.google.android.flexbox.d r1 = r0.E
            int r6 = java.lang.Math.round(r14)
            int r2 = r20.getMeasuredWidth()
            int r7 = r5 + r2
            int r2 = java.lang.Math.round(r14)
            int r3 = r20.getMeasuredHeight()
            int r8 = r2 + r3
        L_0x01c8:
            r2 = r20
            r3 = r26
        L_0x01cc:
            r1.R(r2, r3, r4, r5, r6, r7, r8)
            int r1 = r20.getMeasuredHeight()
            int r2 = r13.topMargin
            int r1 = r1 + r2
            r2 = r20
            int r3 = r0.R(r2)
            int r1 = r1 + r3
            float r1 = (float) r1
            float r1 = r1 + r17
            float r14 = r14 + r1
            int r1 = r2.getMeasuredHeight()
            int r3 = r13.bottomMargin
            int r1 = r1 + r3
            int r2 = r0.s0(r2)
            int r1 = r1 + r2
            float r1 = (float) r1
            float r1 = r1 + r17
            float r18 = r18 - r1
            r1 = r14
            r3 = r16
            r2 = r18
        L_0x01f7:
            int r8 = r23 + 1
            r14 = r17
            r13 = 1
            goto L_0x00d0
        L_0x01fe:
            int r1 = r27.c
            com.google.android.flexbox.FlexboxLayoutManager$c r2 = r0.H
            int r2 = r2.i
            int r1 = r1 + r2
            r2 = r27
            int unused = r2.c = r1
            int r1 = r26.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.F2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    private void G2(RecyclerView.u uVar, c cVar) {
        if (cVar.j) {
            if (cVar.i == -1) {
                I2(uVar, cVar);
            } else {
                J2(uVar, cVar);
            }
        }
    }

    private void H2(RecyclerView.u uVar, int i, int i2) {
        while (i2 >= i) {
            v1(i2, uVar);
            i2--;
        }
    }

    private void I2(RecyclerView.u uVar, c cVar) {
        if (cVar.f >= 0) {
            this.J.h();
            int unused = cVar.f;
            int T2 = T();
            if (T2 != 0) {
                int i = T2 - 1;
                int i2 = this.E.c[n0(S(i))];
                if (i2 != -1) {
                    c cVar2 = this.D.get(i2);
                    int i3 = i;
                    while (true) {
                        if (i3 < 0) {
                            break;
                        }
                        View S2 = S(i3);
                        if (!c2(S2, cVar.f)) {
                            break;
                        }
                        if (cVar2.o == n0(S2)) {
                            if (i2 <= 0) {
                                T2 = i3;
                                break;
                            }
                            i2 += cVar.i;
                            cVar2 = this.D.get(i2);
                            T2 = i3;
                        }
                        i3--;
                    }
                    H2(uVar, T2, i);
                }
            }
        }
    }

    private void J2(RecyclerView.u uVar, c cVar) {
        int T2;
        if (cVar.f >= 0 && (T2 = T()) != 0) {
            int i = this.E.c[n0(S(0))];
            int i2 = -1;
            if (i != -1) {
                c cVar2 = this.D.get(i);
                int i3 = 0;
                while (true) {
                    if (i3 >= T2) {
                        break;
                    }
                    View S2 = S(i3);
                    if (!d2(S2, cVar.f)) {
                        break;
                    }
                    if (cVar2.p == n0(S2)) {
                        if (i >= this.D.size() - 1) {
                            i2 = i3;
                            break;
                        }
                        i += cVar.i;
                        cVar2 = this.D.get(i);
                        i2 = i3;
                    }
                    i3++;
                }
                H2(uVar, 0, i2);
            }
        }
    }

    private void K2() {
        int h0 = j() ? h0() : v0();
        boolean unused = this.H.b = h0 == 0 || h0 == Integer.MIN_VALUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r6.x == 2) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (r6.x == 2) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void L2() {
        /*
            r6 = this;
            int r0 = r6.j0()
            int r1 = r6.w
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 == r4) goto L_0x0036
            if (r1 == r2) goto L_0x0027
            r5 = 3
            if (r1 == r5) goto L_0x0017
            r6.B = r3
        L_0x0014:
            r6.C = r3
            goto L_0x004f
        L_0x0017:
            if (r0 != r4) goto L_0x001a
            r3 = 1
        L_0x001a:
            r6.B = r3
            int r0 = r6.x
            if (r0 != r2) goto L_0x0024
            r0 = r3 ^ 1
            r6.B = r0
        L_0x0024:
            r6.C = r4
            goto L_0x004f
        L_0x0027:
            if (r0 != r4) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r6.B = r0
            int r1 = r6.x
            if (r1 != r2) goto L_0x0014
            r0 = r0 ^ r4
            r6.B = r0
            goto L_0x0014
        L_0x0036:
            if (r0 == r4) goto L_0x003a
            r0 = 1
            goto L_0x003b
        L_0x003a:
            r0 = 0
        L_0x003b:
            r6.B = r0
            int r0 = r6.x
            if (r0 != r2) goto L_0x0014
        L_0x0041:
            r3 = 1
            goto L_0x0014
        L_0x0043:
            if (r0 != r4) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r6.B = r0
            int r0 = r6.x
            if (r0 != r2) goto L_0x0014
            goto L_0x0041
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.L2():void");
    }

    private boolean O1(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return view.isLayoutRequested() || !C0() || !D0(view.getWidth(), i, layoutParams.width) || !D0(view.getHeight(), i2, layoutParams.height);
    }

    private boolean P2(RecyclerView.z zVar, b bVar) {
        boolean z2 = false;
        if (T() == 0) {
            return false;
        }
        View o2 = bVar.e ? o2(zVar.b()) : l2(zVar.b());
        if (o2 == null) {
            return false;
        }
        bVar.r(o2);
        if (!zVar.e() && U1()) {
            if (this.J.g(o2) >= this.J.i() || this.J.d(o2) < this.J.m()) {
                z2 = true;
            }
            if (z2) {
                int unused = bVar.c = bVar.e ? this.J.i() : this.J.m();
            }
        }
        return true;
    }

    private boolean Q2(RecyclerView.z zVar, b bVar, d dVar) {
        int i;
        boolean z2 = false;
        if (!zVar.e() && (i = this.M) != -1) {
            if (i < 0 || i >= zVar.b()) {
                this.M = -1;
                this.N = Integer.MIN_VALUE;
            } else {
                int unused = bVar.a = this.M;
                int unused2 = bVar.b = this.E.c[bVar.a];
                d dVar2 = this.L;
                if (dVar2 != null && dVar2.g(zVar.b())) {
                    int unused3 = bVar.c = this.J.m() + dVar.f;
                    boolean unused4 = bVar.g = true;
                    int unused5 = bVar.b = -1;
                    return true;
                } else if (this.N == Integer.MIN_VALUE) {
                    View M2 = M(this.M);
                    if (M2 == null) {
                        if (T() > 0) {
                            if (this.M < n0(S(0))) {
                                z2 = true;
                            }
                            boolean unused6 = bVar.e = z2;
                        }
                        bVar.q();
                    } else if (this.J.e(M2) > this.J.n()) {
                        bVar.q();
                        return true;
                    } else if (this.J.g(M2) - this.J.m() < 0) {
                        int unused7 = bVar.c = this.J.m();
                        boolean unused8 = bVar.e = false;
                        return true;
                    } else if (this.J.i() - this.J.d(M2) < 0) {
                        int unused9 = bVar.c = this.J.i();
                        boolean unused10 = bVar.e = true;
                        return true;
                    } else {
                        int unused11 = bVar.c = bVar.e ? this.J.d(M2) + this.J.o() : this.J.g(M2);
                    }
                    return true;
                } else {
                    int unused12 = bVar.c = (j() || !this.B) ? this.J.m() + this.N : this.N - this.J.j();
                    return true;
                }
            }
        }
        return false;
    }

    private void R2(RecyclerView.z zVar, b bVar) {
        if (!Q2(zVar, bVar, this.L) && !P2(zVar, bVar)) {
            bVar.q();
            int unused = bVar.a = 0;
            int unused2 = bVar.b = 0;
        }
    }

    private void S2(int i) {
        if (i < q2()) {
            int T2 = T();
            this.E.t(T2);
            this.E.u(T2);
            this.E.s(T2);
            if (i < this.E.c.length) {
                this.U = i;
                View w2 = w2();
                if (w2 != null) {
                    this.M = n0(w2);
                    this.N = (j() || !this.B) ? this.J.g(w2) - this.J.m() : this.J.d(w2) + this.J.j();
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void T2(int r12) {
        /*
            r11 = this;
            int r0 = r11.u0()
            int r1 = r11.v0()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r1 = r11.g0()
            int r2 = r11.h0()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            int r2 = r11.u0()
            int r3 = r11.g0()
            boolean r4 = r11.j()
            r5 = 1
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L_0x0047
            int r4 = r11.O
            if (r4 == r7) goto L_0x0031
            if (r4 == r2) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r11.H
            boolean r4 = r4.b
            if (r4 == 0) goto L_0x0064
            android.content.Context r4 = r11.S
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.heightPixels
            goto L_0x006a
        L_0x0047:
            int r4 = r11.P
            if (r4 == r7) goto L_0x004e
            if (r4 == r3) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r11.H
            boolean r4 = r4.b
            if (r4 == 0) goto L_0x0064
            android.content.Context r4 = r11.S
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
            goto L_0x006a
        L_0x0064:
            com.google.android.flexbox.FlexboxLayoutManager$c r4 = r11.H
            int r4 = r4.a
        L_0x006a:
            r6 = r4
            r11.O = r2
            r11.P = r3
            int r2 = r11.U
            r3 = -1
            if (r2 != r3) goto L_0x00de
            int r2 = r11.M
            if (r2 != r3) goto L_0x007a
            if (r5 == 0) goto L_0x00de
        L_0x007a:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.I
            boolean r12 = r12.e
            if (r12 == 0) goto L_0x0083
            return
        L_0x0083:
            java.util.List<com.google.android.flexbox.c> r12 = r11.D
            r12.clear()
            com.google.android.flexbox.d$b r12 = r11.V
            r12.a()
            boolean r12 = r11.j()
            com.google.android.flexbox.d r2 = r11.E
            com.google.android.flexbox.d$b r3 = r11.V
            if (r12 == 0) goto L_0x00a5
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.I
            int r7 = r12.a
            java.util.List<com.google.android.flexbox.c> r8 = r11.D
            r4 = r0
            r5 = r1
            r2.e(r3, r4, r5, r6, r7, r8)
            goto L_0x00b2
        L_0x00a5:
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.I
            int r7 = r12.a
            java.util.List<com.google.android.flexbox.c> r8 = r11.D
            r4 = r0
            r5 = r1
            r2.h(r3, r4, r5, r6, r7, r8)
        L_0x00b2:
            com.google.android.flexbox.d$b r12 = r11.V
            java.util.List<com.google.android.flexbox.c> r12 = r12.a
            r11.D = r12
            com.google.android.flexbox.d r12 = r11.E
            r12.p(r0, r1)
            com.google.android.flexbox.d r12 = r11.E
            r12.X()
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.I
            com.google.android.flexbox.d r0 = r11.E
            int[] r0 = r0.c
            int r1 = r12.a
            r0 = r0[r1]
            int unused = r12.b = r0
            com.google.android.flexbox.FlexboxLayoutManager$c r12 = r11.H
            com.google.android.flexbox.FlexboxLayoutManager$b r0 = r11.I
            int r0 = r0.b
            int unused = r12.c = r0
            goto L_0x0172
        L_0x00de:
            int r2 = r11.U
            if (r2 == r3) goto L_0x00ed
            com.google.android.flexbox.FlexboxLayoutManager$b r3 = r11.I
            int r3 = r3.a
            int r2 = java.lang.Math.min(r2, r3)
            goto L_0x00f3
        L_0x00ed:
            com.google.android.flexbox.FlexboxLayoutManager$b r2 = r11.I
            int r2 = r2.a
        L_0x00f3:
            r10 = r2
            com.google.android.flexbox.d$b r2 = r11.V
            r2.a()
            boolean r2 = r11.j()
            if (r2 == 0) goto L_0x012f
            java.util.List<com.google.android.flexbox.c> r2 = r11.D
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x011d
            com.google.android.flexbox.d r12 = r11.E
            java.util.List<com.google.android.flexbox.c> r2 = r11.D
            r12.j(r2, r10)
            com.google.android.flexbox.d r2 = r11.E
            com.google.android.flexbox.d$b r3 = r11.V
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.I
            int r8 = r12.a
            java.util.List<com.google.android.flexbox.c> r9 = r11.D
            r4 = r0
            r5 = r1
            goto L_0x014c
        L_0x011d:
            com.google.android.flexbox.d r2 = r11.E
            r2.s(r12)
            com.google.android.flexbox.d r2 = r11.E
            com.google.android.flexbox.d$b r3 = r11.V
            r7 = 0
            java.util.List<com.google.android.flexbox.c> r8 = r11.D
            r4 = r0
            r5 = r1
            r2.d(r3, r4, r5, r6, r7, r8)
            goto L_0x0162
        L_0x012f:
            java.util.List<com.google.android.flexbox.c> r2 = r11.D
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0151
            com.google.android.flexbox.d r12 = r11.E
            java.util.List<com.google.android.flexbox.c> r2 = r11.D
            r12.j(r2, r10)
            com.google.android.flexbox.d r2 = r11.E
            com.google.android.flexbox.d$b r3 = r11.V
            com.google.android.flexbox.FlexboxLayoutManager$b r12 = r11.I
            int r8 = r12.a
            java.util.List<com.google.android.flexbox.c> r9 = r11.D
            r4 = r1
            r5 = r0
        L_0x014c:
            r7 = r10
            r2.b(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0162
        L_0x0151:
            com.google.android.flexbox.d r2 = r11.E
            r2.s(r12)
            com.google.android.flexbox.d r2 = r11.E
            com.google.android.flexbox.d$b r3 = r11.V
            r7 = 0
            java.util.List<com.google.android.flexbox.c> r8 = r11.D
            r4 = r0
            r5 = r1
            r2.g(r3, r4, r5, r6, r7, r8)
        L_0x0162:
            com.google.android.flexbox.d$b r12 = r11.V
            java.util.List<com.google.android.flexbox.c> r12 = r12.a
            r11.D = r12
            com.google.android.flexbox.d r12 = r11.E
            r12.q(r0, r1, r10)
            com.google.android.flexbox.d r12 = r11.E
            r12.Y(r10)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.T2(int):void");
    }

    private void U2(int i, int i2) {
        int unused = this.H.i = i;
        boolean j = j();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(u0(), v0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0(), h0());
        int i3 = 0;
        boolean z2 = !j && this.B;
        if (i == 1) {
            View S2 = S(T() - 1);
            int unused2 = this.H.e = this.J.d(S2);
            int n0 = n0(S2);
            View p2 = p2(S2, this.D.get(this.E.c[n0]));
            int unused3 = this.H.h = 1;
            c cVar = this.H;
            int unused4 = cVar.d = n0 + cVar.h;
            if (this.E.c.length <= this.H.d) {
                int unused5 = this.H.c = -1;
            } else {
                c cVar2 = this.H;
                int unused6 = cVar2.c = this.E.c[cVar2.d];
            }
            if (z2) {
                int unused7 = this.H.e = this.J.g(p2);
                int unused8 = this.H.f = (-this.J.g(p2)) + this.J.m();
                c cVar3 = this.H;
                if (cVar3.f >= 0) {
                    i3 = this.H.f;
                }
                int unused9 = cVar3.f = i3;
            } else {
                int unused10 = this.H.e = this.J.d(p2);
                int unused11 = this.H.f = this.J.d(p2) - this.J.i();
            }
            if ((this.H.c == -1 || this.H.c > this.D.size() - 1) && this.H.d <= getFlexItemCount()) {
                int k = i2 - this.H.f;
                this.V.a();
                if (k > 0) {
                    d dVar = this.E;
                    d.b bVar = this.V;
                    int n = this.H.d;
                    List<c> list = this.D;
                    int i4 = makeMeasureSpec;
                    int i5 = makeMeasureSpec2;
                    if (j) {
                        dVar.d(bVar, i4, i5, k, n, list);
                    } else {
                        dVar.g(bVar, i4, i5, k, n, list);
                    }
                    this.E.q(makeMeasureSpec, makeMeasureSpec2, this.H.d);
                    this.E.Y(this.H.d);
                }
            }
        } else {
            View S3 = S(0);
            int unused12 = this.H.e = this.J.g(S3);
            int n02 = n0(S3);
            View m2 = m2(S3, this.D.get(this.E.c[n02]));
            int unused13 = this.H.h = 1;
            int i6 = this.E.c[n02];
            if (i6 == -1) {
                i6 = 0;
            }
            if (i6 > 0) {
                int unused14 = this.H.d = n02 - this.D.get(i6 - 1).b();
            } else {
                int unused15 = this.H.d = -1;
            }
            int unused16 = this.H.c = i6 > 0 ? i6 - 1 : 0;
            c cVar4 = this.H;
            n nVar = this.J;
            if (z2) {
                int unused17 = cVar4.e = nVar.d(m2);
                int unused18 = this.H.f = this.J.d(m2) - this.J.i();
                c cVar5 = this.H;
                if (cVar5.f >= 0) {
                    i3 = this.H.f;
                }
                int unused19 = cVar5.f = i3;
            } else {
                int unused20 = cVar4.e = nVar.g(m2);
                int unused21 = this.H.f = (-this.J.g(m2)) + this.J.m();
            }
        }
        c cVar6 = this.H;
        int unused22 = cVar6.a = i2 - cVar6.f;
    }

    private void V2(b bVar, boolean z2, boolean z3) {
        c cVar;
        int i;
        int i2;
        if (z3) {
            K2();
        } else {
            boolean unused = this.H.b = false;
        }
        if (j() || !this.B) {
            cVar = this.H;
            i2 = this.J.i();
            i = bVar.c;
        } else {
            cVar = this.H;
            i2 = bVar.c;
            i = getPaddingRight();
        }
        int unused2 = cVar.a = i2 - i;
        int unused3 = this.H.d = bVar.a;
        int unused4 = this.H.h = 1;
        int unused5 = this.H.i = 1;
        int unused6 = this.H.e = bVar.c;
        int unused7 = this.H.f = Integer.MIN_VALUE;
        int unused8 = this.H.c = bVar.b;
        if (z2 && this.D.size() > 1 && bVar.b >= 0 && bVar.b < this.D.size() - 1) {
            c.i(this.H);
            c cVar2 = this.H;
            int unused9 = cVar2.d = cVar2.d + this.D.get(bVar.b).b();
        }
    }

    private void W2(b bVar, boolean z2, boolean z3) {
        c cVar;
        int i;
        if (z3) {
            K2();
        } else {
            boolean unused = this.H.b = false;
        }
        if (j() || !this.B) {
            cVar = this.H;
            i = bVar.c;
        } else {
            cVar = this.H;
            i = this.T.getWidth() - bVar.c;
        }
        int unused2 = cVar.a = i - this.J.m();
        int unused3 = this.H.d = bVar.a;
        int unused4 = this.H.h = 1;
        int unused5 = this.H.i = -1;
        int unused6 = this.H.e = bVar.c;
        int unused7 = this.H.f = Integer.MIN_VALUE;
        int unused8 = this.H.c = bVar.b;
        if (z2 && bVar.b > 0 && this.D.size() > bVar.b) {
            c.j(this.H);
            c cVar2 = this.H;
            int unused9 = cVar2.d = cVar2.d - this.D.get(bVar.b).b();
        }
    }

    private boolean c2(View view, int i) {
        return (j() || !this.B) ? this.J.g(view) >= this.J.h() - i : this.J.d(view) <= i;
    }

    private boolean d2(View view, int i) {
        return (j() || !this.B) ? this.J.d(view) <= i : this.J.h() - this.J.g(view) <= i;
    }

    private void e2() {
        this.D.clear();
        this.I.s();
        int unused = this.I.d = 0;
    }

    private int f2(RecyclerView.z zVar) {
        if (T() == 0) {
            return 0;
        }
        int b2 = zVar.b();
        j2();
        View l2 = l2(b2);
        View o2 = o2(b2);
        if (zVar.b() == 0 || l2 == null || o2 == null) {
            return 0;
        }
        return Math.min(this.J.n(), this.J.d(o2) - this.J.g(l2));
    }

    private int g2(RecyclerView.z zVar) {
        if (T() == 0) {
            return 0;
        }
        int b2 = zVar.b();
        View l2 = l2(b2);
        View o2 = o2(b2);
        if (!(zVar.b() == 0 || l2 == null || o2 == null)) {
            int n0 = n0(l2);
            int n02 = n0(o2);
            int abs = Math.abs(this.J.d(o2) - this.J.g(l2));
            int[] iArr = this.E.c;
            int i = iArr[n0];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[n02] - i) + 1)))) + ((float) (this.J.m() - this.J.g(l2))));
            }
        }
        return 0;
    }

    private int h2(RecyclerView.z zVar) {
        if (T() == 0) {
            return 0;
        }
        int b2 = zVar.b();
        View l2 = l2(b2);
        View o2 = o2(b2);
        if (zVar.b() == 0 || l2 == null || o2 == null) {
            return 0;
        }
        int n2 = n2();
        return (int) ((((float) Math.abs(this.J.d(o2) - this.J.g(l2))) / ((float) ((q2() - n2) + 1))) * ((float) zVar.b()));
    }

    private void i2() {
        if (this.H == null) {
            this.H = new c();
        }
    }

    private void j2() {
        n nVar;
        if (this.J == null) {
            if (!j() ? this.x != 0 : this.x == 0) {
                this.J = n.a(this);
                nVar = n.c(this);
            } else {
                this.J = n.c(this);
                nVar = n.a(this);
            }
            this.K = nVar;
        }
    }

    private int k2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar) {
        if (cVar.f != Integer.MIN_VALUE) {
            if (cVar.a < 0) {
                int unused = cVar.f = cVar.f + cVar.a;
            }
            G2(uVar, cVar);
        }
        int e = cVar.a;
        int e2 = cVar.a;
        int i = 0;
        boolean j = j();
        while (true) {
            if ((e2 > 0 || this.H.b) && cVar.w(zVar, this.D)) {
                c cVar2 = this.D.get(cVar.c);
                int unused2 = cVar.d = cVar2.o;
                i += D2(cVar2, cVar);
                int unused3 = cVar.e = (j || !this.B) ? cVar.e + (cVar2.a() * cVar.i) : cVar.e - (cVar2.a() * cVar.i);
                e2 -= cVar2.a();
            }
        }
        int unused4 = cVar.a = cVar.a - i;
        if (cVar.f != Integer.MIN_VALUE) {
            int unused5 = cVar.f = cVar.f + i;
            if (cVar.a < 0) {
                int unused6 = cVar.f = cVar.f + cVar.a;
            }
            G2(uVar, cVar);
        }
        return e - cVar.a;
    }

    private View l2(int i) {
        int i2;
        View s2 = s2(0, T(), i);
        if (s2 == null || (i2 = this.E.c[n0(s2)]) == -1) {
            return null;
        }
        return m2(s2, this.D.get(i2));
    }

    private View m2(View view, c cVar) {
        boolean j = j();
        int i = cVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View S2 = S(i2);
            if (!(S2 == null || S2.getVisibility() == 8)) {
                if (!this.B || j) {
                    if (this.J.g(view) <= this.J.g(S2)) {
                    }
                } else if (this.J.d(view) >= this.J.d(S2)) {
                }
                view = S2;
            }
        }
        return view;
    }

    private View o2(int i) {
        View s2 = s2(T() - 1, -1, i);
        if (s2 == null) {
            return null;
        }
        return p2(s2, this.D.get(this.E.c[n0(s2)]));
    }

    private View p2(View view, c cVar) {
        boolean j = j();
        int T2 = (T() - cVar.h) - 1;
        for (int T3 = T() - 2; T3 > T2; T3--) {
            View S2 = S(T3);
            if (!(S2 == null || S2.getVisibility() == 8)) {
                if (!this.B || j) {
                    if (this.J.d(view) >= this.J.d(S2)) {
                    }
                } else if (this.J.g(view) <= this.J.g(S2)) {
                }
                view = S2;
            }
        }
        return view;
    }

    private View r2(int i, int i2, boolean z2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View S2 = S(i);
            if (C2(S2, z2)) {
                return S2;
            }
            i += i3;
        }
        return null;
    }

    private View s2(int i, int i2, int i3) {
        j2();
        i2();
        int m = this.J.m();
        int i4 = this.J.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View S2 = S(i);
            int n0 = n0(S2);
            if (n0 >= 0 && n0 < i3) {
                if (((RecyclerView.LayoutParams) S2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = S2;
                    }
                } else if (this.J.g(S2) >= m && this.J.d(S2) <= i4) {
                    return S2;
                } else {
                    if (view == null) {
                        view = S2;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    private int t2(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z2) {
        int i2;
        int i3;
        if (!j() && this.B) {
            int m = i - this.J.m();
            if (m <= 0) {
                return 0;
            }
            i2 = A2(m, uVar, zVar);
        } else {
            int i4 = this.J.i() - i;
            if (i4 <= 0) {
                return 0;
            }
            i2 = -A2(-i4, uVar, zVar);
        }
        int i5 = i + i2;
        if (!z2 || (i3 = this.J.i() - i5) <= 0) {
            return i2;
        }
        this.J.r(i3);
        return i3 + i2;
    }

    private int u2(int i, RecyclerView.u uVar, RecyclerView.z zVar, boolean z2) {
        int i2;
        int m;
        if (j() || !this.B) {
            int m2 = i - this.J.m();
            if (m2 <= 0) {
                return 0;
            }
            i2 = -A2(m2, uVar, zVar);
        } else {
            int i3 = this.J.i() - i;
            if (i3 <= 0) {
                return 0;
            }
            i2 = A2(-i3, uVar, zVar);
        }
        int i4 = i + i2;
        if (!z2 || (m = i4 - this.J.m()) <= 0) {
            return i2;
        }
        this.J.r(-m);
        return i2 - m;
    }

    private int v2(View view) {
        return Y(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    private View w2() {
        return S(0);
    }

    private int x2(View view) {
        return a0(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
    }

    private int y2(View view) {
        return d0(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
    }

    private int z2(View view) {
        return e0(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
    }

    public int A(RecyclerView.z zVar) {
        return f2(zVar);
    }

    public int B(RecyclerView.z zVar) {
        return g2(zVar);
    }

    public int C(RecyclerView.z zVar) {
        return h2(zVar);
    }

    public int D(RecyclerView.z zVar) {
        return f2(zVar);
    }

    public int E(RecyclerView.z zVar) {
        return g2(zVar);
    }

    public int E1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (!j() || (this.x == 0 && j())) {
            int A2 = A2(i, uVar, zVar);
            this.R.clear();
            return A2;
        }
        int B2 = B2(i);
        b bVar = this.I;
        int unused = bVar.d = bVar.d + B2;
        this.K.r(-B2);
        return B2;
    }

    public int F(RecyclerView.z zVar) {
        return h2(zVar);
    }

    public void F1(int i) {
        this.M = i;
        this.N = Integer.MIN_VALUE;
        d dVar = this.L;
        if (dVar != null) {
            dVar.h();
        }
        B1();
    }

    public int G1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (j() || (this.x == 0 && !j())) {
            int A2 = A2(i, uVar, zVar);
            this.R.clear();
            return A2;
        }
        int B2 = B2(i);
        b bVar = this.I;
        int unused = bVar.d = bVar.d + B2;
        this.K.r(-B2);
        return B2;
    }

    public void L0(RecyclerView.g gVar, RecyclerView.g gVar2) {
        r1();
    }

    public void M2(int i) {
        int i2 = this.z;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                r1();
                e2();
            }
            this.z = i;
            B1();
        }
    }

    public RecyclerView.LayoutParams N() {
        return new LayoutParams(-2, -2);
    }

    public void N0(RecyclerView recyclerView) {
        super.N0(recyclerView);
        this.T = (View) recyclerView.getParent();
    }

    public void N2(int i) {
        if (this.w != i) {
            r1();
            this.w = i;
            this.J = null;
            this.K = null;
            e2();
            B1();
        }
    }

    public RecyclerView.LayoutParams O(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public void O2(int i) {
        if (i != 2) {
            int i2 = this.x;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    r1();
                    e2();
                }
                this.x = i;
                this.J = null;
                this.K = null;
                B1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    public void P0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.P0(recyclerView, uVar);
        if (this.Q) {
            s1(uVar);
            uVar.c();
        }
    }

    public void R1(RecyclerView recyclerView, RecyclerView.z zVar, int i) {
        j jVar = new j(recyclerView.getContext());
        jVar.p(i);
        S1(jVar);
    }

    public void Y0(RecyclerView recyclerView, int i, int i2) {
        super.Y0(recyclerView, i, i2);
        S2(i);
    }

    public PointF a(int i) {
        if (T() == 0) {
            return null;
        }
        int i2 = i < n0(S(0)) ? -1 : 1;
        return j() ? new PointF(Utils.FLOAT_EPSILON, (float) i2) : new PointF((float) i2, Utils.FLOAT_EPSILON);
    }

    public void a1(RecyclerView recyclerView, int i, int i2, int i3) {
        super.a1(recyclerView, i, i2, i3);
        S2(Math.min(i, i2));
    }

    public void b(View view, int i, int i2, c cVar) {
        int i3;
        int i4;
        t(view, W);
        if (j()) {
            i3 = k0(view);
            i4 = p0(view);
        } else {
            i3 = s0(view);
            i4 = R(view);
        }
        int i5 = i3 + i4;
        cVar.e += i5;
        cVar.f += i5;
    }

    public void b1(RecyclerView recyclerView, int i, int i2) {
        super.b1(recyclerView, i, i2);
        S2(i);
    }

    public void c(c cVar) {
    }

    public void c1(RecyclerView recyclerView, int i, int i2) {
        super.c1(recyclerView, i, i2);
        S2(i);
    }

    public View d(int i) {
        return g(i);
    }

    public void d1(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.d1(recyclerView, i, i2, obj);
        S2(i);
    }

    public int e(int i, int i2, int i3) {
        return RecyclerView.o.U(u0(), v0(), i2, i3, u());
    }

    public void e1(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i;
        int i2;
        this.F = uVar;
        this.G = zVar;
        int b2 = zVar.b();
        if (b2 != 0 || !zVar.e()) {
            L2();
            j2();
            i2();
            this.E.t(b2);
            this.E.u(b2);
            this.E.s(b2);
            boolean unused = this.H.j = false;
            d dVar = this.L;
            if (dVar != null && dVar.g(b2)) {
                this.M = this.L.e;
            }
            if (!(this.I.f && this.M == -1 && this.L == null)) {
                this.I.s();
                R2(zVar, this.I);
                boolean unused2 = this.I.f = true;
            }
            G(uVar);
            if (this.I.e) {
                W2(this.I, false, true);
            } else {
                V2(this.I, false, true);
            }
            T2(b2);
            if (this.I.e) {
                k2(uVar, zVar, this.H);
                i2 = this.H.e;
                V2(this.I, true, false);
                k2(uVar, zVar, this.H);
                i = this.H.e;
            } else {
                k2(uVar, zVar, this.H);
                i = this.H.e;
                W2(this.I, true, false);
                k2(uVar, zVar, this.H);
                i2 = this.H.e;
            }
            if (T() <= 0) {
                return;
            }
            if (this.I.e) {
                u2(i2 + t2(i, uVar, zVar, true), uVar, zVar, false);
            } else {
                t2(i + u2(i2, uVar, zVar, true), uVar, zVar, false);
            }
        }
    }

    public void f(int i, View view) {
        this.R.put(i, view);
    }

    public void f1(RecyclerView.z zVar) {
        super.f1(zVar);
        this.L = null;
        this.M = -1;
        this.N = Integer.MIN_VALUE;
        this.U = -1;
        this.I.s();
        this.R.clear();
    }

    public View g(int i) {
        View view = this.R.get(i);
        return view != null ? view : this.F.o(i);
    }

    public int getAlignContent() {
        return 5;
    }

    public int getAlignItems() {
        return this.z;
    }

    public int getFlexDirection() {
        return this.w;
    }

    public int getFlexItemCount() {
        return this.G.b();
    }

    public List<c> getFlexLinesInternal() {
        return this.D;
    }

    public int getFlexWrap() {
        return this.x;
    }

    public int getLargestMainSize() {
        if (this.D.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.D.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.D.get(i2).e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.A;
    }

    public int getSumOfCrossSize() {
        int size = this.D.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.D.get(i2).g;
        }
        return i;
    }

    public int h(View view, int i, int i2) {
        int s0;
        int R2;
        if (j()) {
            s0 = k0(view);
            R2 = p0(view);
        } else {
            s0 = s0(view);
            R2 = R(view);
        }
        return s0 + R2;
    }

    public int i(int i, int i2, int i3) {
        return RecyclerView.o.U(g0(), h0(), i2, i3, v());
    }

    public boolean j() {
        int i = this.w;
        return i == 0 || i == 1;
    }

    public void j1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.L = (d) parcelable;
            B1();
        }
    }

    public int k(View view) {
        int k0;
        int p0;
        if (j()) {
            k0 = s0(view);
            p0 = R(view);
        } else {
            k0 = k0(view);
            p0 = p0(view);
        }
        return k0 + p0;
    }

    public Parcelable k1() {
        if (this.L != null) {
            return new d(this.L);
        }
        d dVar = new d();
        if (T() > 0) {
            View w2 = w2();
            int unused = dVar.e = n0(w2);
            int unused2 = dVar.f = this.J.g(w2) - this.J.m();
        } else {
            dVar.h();
        }
        return dVar;
    }

    public int n2() {
        View r2 = r2(0, T(), false);
        if (r2 == null) {
            return -1;
        }
        return n0(r2);
    }

    public int q2() {
        View r2 = r2(T() - 1, -1, false);
        if (r2 == null) {
            return -1;
        }
        return n0(r2);
    }

    public void setFlexLines(List<c> list) {
        this.D = list;
    }

    public boolean u() {
        if (this.x == 0) {
            return j();
        }
        if (j()) {
            int u0 = u0();
            View view = this.T;
            return u0 > (view != null ? view.getWidth() : 0);
        }
    }

    public boolean v() {
        if (this.x == 0) {
            return !j();
        }
        if (j()) {
            return true;
        }
        int g0 = g0();
        View view = this.T;
        return g0 > (view != null ? view.getHeight() : 0);
    }

    public boolean w(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }
}
