package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a5;

public class GridLayoutManager extends LinearLayoutManager {
    boolean M = false;
    int N = -1;
    int[] O;
    View[] P;
    final SparseIntArray Q = new SparseIntArray();
    final SparseIntArray R = new SparseIntArray();
    b S = new a();
    final Rect T = new Rect();
    private boolean U;

    public static class LayoutParams extends RecyclerView.LayoutParams {
        int i = -1;
        int j = 0;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public int e() {
            return this.i;
        }

        public int f() {
            return this.j;
        }
    }

    public static final class a extends b {
        public int e(int i, int i2) {
            return i % i2;
        }

        public int f(int i) {
            return 1;
        }
    }

    public static abstract class b {
        final SparseIntArray a = new SparseIntArray();
        final SparseIntArray b = new SparseIntArray();
        private boolean c = false;
        private boolean d = false;

        static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        public int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            int i3 = this.b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d2 = d(i, i2);
            this.b.put(i, d2);
            return d2;
        }

        /* access modifiers changed from: package-private */
        public int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = e(i, i2);
            this.a.put(i, e);
            return e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b.d(int, int):int");
        }

        public abstract int e(int i, int i2);

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        o3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        o3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        o3(RecyclerView.o.o0(context, attributeSet, i, i2).b);
    }

    private void X2(RecyclerView.u uVar, RecyclerView.z zVar, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.P[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int k3 = k3(uVar, zVar, n0(view));
            layoutParams.j = k3;
            layoutParams.i = i4;
            i4 += k3;
            i3 += i2;
        }
    }

    private void Y2() {
        int T2 = T();
        for (int i = 0; i < T2; i++) {
            LayoutParams layoutParams = (LayoutParams) S(i).getLayoutParams();
            int a2 = layoutParams.a();
            this.Q.put(a2, layoutParams.f());
            this.R.put(a2, layoutParams.e());
        }
    }

    private void Z2(int i) {
        this.O = a3(this.O, this.N, i);
    }

    static int[] a3(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private void b3() {
        this.Q.clear();
        this.R.clear();
    }

    private int c3(RecyclerView.z zVar) {
        if (!(T() == 0 || zVar.b() == 0)) {
            c2();
            boolean B2 = B2();
            View i2 = i2(!B2, true);
            View h2 = h2(!B2, true);
            if (!(i2 == null || h2 == null)) {
                int b2 = this.S.b(n0(i2), this.N);
                int b3 = this.S.b(n0(h2), this.N);
                int min = Math.min(b2, b3);
                int max = this.B ? Math.max(0, ((this.S.b(zVar.b() - 1, this.N) + 1) - Math.max(b2, b3)) - 1) : Math.max(0, min);
                if (!B2) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.y.d(h2) - this.y.g(i2))) / ((float) ((this.S.b(n0(h2), this.N) - this.S.b(n0(i2), this.N)) + 1)))) + ((float) (this.y.m() - this.y.g(i2))));
            }
        }
        return 0;
    }

    private int d3(RecyclerView.z zVar) {
        if (!(T() == 0 || zVar.b() == 0)) {
            c2();
            View i2 = i2(!B2(), true);
            View h2 = h2(!B2(), true);
            if (!(i2 == null || h2 == null)) {
                if (!B2()) {
                    return this.S.b(zVar.b() - 1, this.N) + 1;
                }
                int d = this.y.d(h2) - this.y.g(i2);
                int b2 = this.S.b(n0(i2), this.N);
                return (int) ((((float) d) / ((float) ((this.S.b(n0(h2), this.N) - b2) + 1))) * ((float) (this.S.b(zVar.b() - 1, this.N) + 1)));
            }
        }
        return 0;
    }

    private void e3(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int j3 = j3(uVar, zVar, aVar.b);
        if (z) {
            while (j3 > 0) {
                int i2 = aVar.b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    j3 = j3(uVar, zVar, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int b2 = zVar.b() - 1;
        int i4 = aVar.b;
        while (i4 < b2) {
            int i5 = i4 + 1;
            int j32 = j3(uVar, zVar, i5);
            if (j32 <= j3) {
                break;
            }
            i4 = i5;
            j3 = j32;
        }
        aVar.b = i4;
    }

    private void f3() {
        View[] viewArr = this.P;
        if (viewArr == null || viewArr.length != this.N) {
            this.P = new View[this.N];
        }
    }

    private int i3(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        if (!zVar.e()) {
            return this.S.b(i, this.N);
        }
        int f = uVar.f(i);
        if (f != -1) {
            return this.S.b(f, this.N);
        }
        "Cannot find span size for pre layout position. " + i;
        return 0;
    }

    private int j3(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        if (!zVar.e()) {
            return this.S.c(i, this.N);
        }
        int i2 = this.R.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = uVar.f(i);
        if (f != -1) {
            return this.S.c(f, this.N);
        }
        "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
        return 0;
    }

    private int k3(RecyclerView.u uVar, RecyclerView.z zVar, int i) {
        if (!zVar.e()) {
            return this.S.f(i);
        }
        int i2 = this.Q.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = uVar.f(i);
        if (f != -1) {
            return this.S.f(f);
        }
        "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i;
        return 1;
    }

    private void l3(float f, int i) {
        Z2(Math.max(Math.round(f * ((float) this.N)), i));
    }

    private void m3(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int g3 = g3(layoutParams.i, layoutParams.j);
        if (this.w == 1) {
            i2 = RecyclerView.o.U(g3, i, i5, layoutParams.width, false);
            i3 = RecyclerView.o.U(this.y.n(), h0(), i4, layoutParams.height, true);
        } else {
            int U2 = RecyclerView.o.U(g3, i, i4, layoutParams.height, false);
            int U3 = RecyclerView.o.U(this.y.n(), v0(), i5, layoutParams.width, true);
            i3 = U2;
            i2 = U3;
        }
        n3(view, i2, i3, z);
    }

    private void n3(View view, int i, int i2, boolean z) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? Q1(view, i, i2, layoutParams) : O1(view, i, i2, layoutParams)) {
            view.measure(i, i2);
        }
    }

    private void p3() {
        int i;
        int i2;
        if (z2() == 1) {
            i2 = u0() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = g0() - getPaddingBottom();
            i = getPaddingTop();
        }
        Z2(i2 - i);
    }

    public int B(RecyclerView.z zVar) {
        return this.U ? c3(zVar) : super.B(zVar);
    }

    public int C(RecyclerView.z zVar) {
        return this.U ? d3(zVar) : super.C(zVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0219  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C2(androidx.recyclerview.widget.RecyclerView.u r18, androidx.recyclerview.widget.RecyclerView.z r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.n r3 = r6.y
            int r3 = r3.l()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r17.T()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.O
            int r11 = r6.N
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r17.p3()
        L_0x002c:
            int r11 = r2.e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.N
            if (r11 != 0) goto L_0x0044
            int r12 = r2.d
            int r12 = r6.j3(r0, r1, r12)
            int r13 = r2.d
            int r13 = r6.k3(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.N
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.c(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.d
            int r15 = r6.k3(r0, r1, r14)
            int r4 = r6.N
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.d(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.P
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.N
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.b = r8
            return
        L_0x00a2:
            r4 = 0
            r6.X2(r0, r1, r13, r11)
            r0 = 0
            r1 = 0
        L_0x00a8:
            if (r0 >= r13) goto L_0x00f4
            android.view.View[] r12 = r6.P
            r12 = r12[r0]
            java.util.List<androidx.recyclerview.widget.RecyclerView$c0> r14 = r2.l
            if (r14 != 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00b8
            r6.n(r12)
            goto L_0x00c5
        L_0x00b8:
            r6.o(r12, r5)
            goto L_0x00c5
        L_0x00bc:
            if (r11 == 0) goto L_0x00c2
            r6.l(r12)
            goto L_0x00c5
        L_0x00c2:
            r6.m(r12, r5)
        L_0x00c5:
            android.graphics.Rect r14 = r6.T
            r6.t(r12, r14)
            r6.m3(r12, r3, r5)
            androidx.recyclerview.widget.n r14 = r6.y
            int r14 = r14.e(r12)
            if (r14 <= r1) goto L_0x00d6
            r1 = r14
        L_0x00d6:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r14 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r14
            r15 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.n r5 = r6.y
            int r5 = r5.f(r12)
            float r5 = (float) r5
            float r5 = r5 * r15
            int r12 = r14.j
            float r12 = (float) r12
            float r5 = r5 / r12
            int r12 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00f0
            r4 = r5
        L_0x00f0:
            int r0 = r0 + 1
            r5 = 0
            goto L_0x00a8
        L_0x00f4:
            if (r9 == 0) goto L_0x0112
            r6.l3(r4, r10)
            r0 = 0
            r1 = 0
        L_0x00fb:
            if (r0 >= r13) goto L_0x0112
            android.view.View[] r3 = r6.P
            r3 = r3[r0]
            r4 = 1073741824(0x40000000, float:2.0)
            r6.m3(r3, r4, r8)
            androidx.recyclerview.widget.n r4 = r6.y
            int r3 = r4.e(r3)
            if (r3 <= r1) goto L_0x010f
            r1 = r3
        L_0x010f:
            int r0 = r0 + 1
            goto L_0x00fb
        L_0x0112:
            r0 = 0
        L_0x0113:
            if (r0 >= r13) goto L_0x0175
            android.view.View[] r3 = r6.P
            r3 = r3[r0]
            androidx.recyclerview.widget.n r4 = r6.y
            int r4 = r4.e(r3)
            if (r4 == r1) goto L_0x016f
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r4 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r4
            android.graphics.Rect r5 = r4.f
            int r9 = r5.top
            int r10 = r5.bottom
            int r9 = r9 + r10
            int r10 = r4.topMargin
            int r9 = r9 + r10
            int r10 = r4.bottomMargin
            int r9 = r9 + r10
            int r10 = r5.left
            int r5 = r5.right
            int r10 = r10 + r5
            int r5 = r4.leftMargin
            int r10 = r10 + r5
            int r5 = r4.rightMargin
            int r10 = r10 + r5
            int r5 = r4.i
            int r11 = r4.j
            int r5 = r6.g3(r5, r11)
            int r11 = r6.w
            if (r11 != r8) goto L_0x015b
            int r4 = r4.width
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.o.U(r5, r11, r10, r4, r12)
            int r5 = r1 - r9
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
            goto L_0x016b
        L_0x015b:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
            int r10 = r1 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r4 = r4.height
            int r5 = androidx.recyclerview.widget.RecyclerView.o.U(r5, r11, r9, r4, r12)
            r4 = r10
        L_0x016b:
            r6.n3(r3, r4, r5, r8)
            goto L_0x0172
        L_0x016f:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 0
        L_0x0172:
            int r0 = r0 + 1
            goto L_0x0113
        L_0x0175:
            r12 = 0
            r7.a = r1
            int r0 = r6.w
            r3 = -1
            if (r0 != r8) goto L_0x018f
            int r0 = r2.f
            if (r0 != r3) goto L_0x0187
            int r0 = r2.b
            int r1 = r0 - r1
            r2 = r1
            goto L_0x018c
        L_0x0187:
            int r0 = r2.b
            int r1 = r1 + r0
            r2 = r0
            r0 = r1
        L_0x018c:
            r1 = 0
            r3 = 0
            goto L_0x01a2
        L_0x018f:
            int r0 = r2.f
            if (r0 != r3) goto L_0x019c
            int r0 = r2.b
            int r1 = r0 - r1
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
            goto L_0x01a2
        L_0x019c:
            int r0 = r2.b
            int r1 = r1 + r0
            r3 = r0
            r0 = 0
            r2 = 0
        L_0x01a2:
            if (r12 >= r13) goto L_0x022d
            android.view.View[] r4 = r6.P
            r9 = r4[r12]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r10 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r10
            int r4 = r6.w
            if (r4 != r8) goto L_0x01eb
            boolean r1 = r17.A2()
            if (r1 == 0) goto L_0x01d3
            int r1 = r17.getPaddingLeft()
            int[] r3 = r6.O
            int r4 = r6.N
            int r5 = r10.i
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.n r3 = r6.y
            int r3 = r3.f(r9)
            int r3 = r1 - r3
            r11 = r0
            r14 = r1
            r15 = r2
            goto L_0x0200
        L_0x01d3:
            int r1 = r17.getPaddingLeft()
            int[] r3 = r6.O
            int r4 = r10.i
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.n r3 = r6.y
            int r3 = r3.f(r9)
            int r3 = r3 + r1
            r11 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L_0x0202
        L_0x01eb:
            int r0 = r17.getPaddingTop()
            int[] r2 = r6.O
            int r4 = r10.i
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.n r2 = r6.y
            int r2 = r2.f(r9)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r11 = r2
        L_0x0200:
            r16 = r3
        L_0x0202:
            r0 = r17
            r1 = r9
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r11
            r0.G0(r1, r2, r3, r4, r5)
            boolean r0 = r10.c()
            if (r0 != 0) goto L_0x0219
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x021b
        L_0x0219:
            r7.c = r8
        L_0x021b:
            boolean r0 = r7.d
            boolean r1 = r9.hasFocusable()
            r0 = r0 | r1
            r7.d = r0
            int r12 = r12 + 1
            r0 = r11
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x01a2
        L_0x022d:
            android.view.View[] r0 = r6.P
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    public int E(RecyclerView.z zVar) {
        return this.U ? c3(zVar) : super.E(zVar);
    }

    public int E1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        p3();
        f3();
        return super.E1(i, uVar, zVar);
    }

    /* access modifiers changed from: package-private */
    public void E2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i) {
        super.E2(uVar, zVar, aVar, i);
        p3();
        if (zVar.b() > 0 && !zVar.e()) {
            e3(uVar, zVar, aVar, i);
        }
        f3();
    }

    public int F(RecyclerView.z zVar) {
        return this.U ? d3(zVar) : super.F(zVar);
    }

    public int G1(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        p3();
        f3();
        return super.G1(i, uVar, zVar);
    }

    public void L1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.O == null) {
            super.L1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.w == 1) {
            i4 = RecyclerView.o.x(i2, rect.height() + paddingTop, l0());
            int[] iArr = this.O;
            i3 = RecyclerView.o.x(i, iArr[iArr.length - 1] + paddingLeft, m0());
        } else {
            i3 = RecyclerView.o.x(i, rect.width() + paddingLeft, m0());
            int[] iArr2 = this.O;
            i4 = RecyclerView.o.x(i2, iArr2[iArr2.length - 1] + paddingTop, l0());
        }
        K1(i3, i4);
    }

    public RecyclerView.LayoutParams N() {
        return this.w == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public RecyclerView.LayoutParams O(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public void O2(boolean z) {
        if (!z) {
            super.O2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public RecyclerView.LayoutParams P(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View Q0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.L(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.i
            int r5 = r5.j
            int r5 = r5 + r6
            android.view.View r7 = super.Q0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.a2(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.B
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.T()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.T()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.w
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.A2()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.i3(r1, r2, r7)
            r10 = r7
            r8 = 0
            r15 = -1
            r16 = -1
            r17 = 0
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.i3(r1, r2, r10)
            android.view.View r1 = r0.S(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.i
            r18 = r3
            int r3 = r9.j
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.F0(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.i
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.i
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.Q0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    public boolean U1() {
        return this.H == null && !this.M;
    }

    public void W0(RecyclerView.u uVar, RecyclerView.z zVar, View view, a5 a5Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.V0(view, a5Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int i32 = i3(uVar, zVar, layoutParams2.a());
        if (this.w == 0) {
            i4 = layoutParams2.e();
            i3 = layoutParams2.f();
            i = 1;
            z2 = false;
            z = false;
            i2 = i32;
        } else {
            i3 = 1;
            i2 = layoutParams2.e();
            i = layoutParams2.f();
            z2 = false;
            z = false;
            i4 = i32;
        }
        a5Var.g0(a5.c.f(i4, i3, i2, i, z2, z));
    }

    /* access modifiers changed from: package-private */
    public void W1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i = this.N;
        for (int i2 = 0; i2 < this.N && cVar.c(zVar) && i > 0; i2++) {
            int i3 = cVar.d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.S.f(i3);
            cVar.d += cVar.e;
        }
    }

    public int X(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.w == 1) {
            return this.N;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return i3(uVar, zVar, zVar.b() - 1) + 1;
    }

    public void Y0(RecyclerView recyclerView, int i, int i2) {
        this.S.h();
        this.S.g();
    }

    public void Z0(RecyclerView recyclerView) {
        this.S.h();
        this.S.g();
    }

    public void a1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.S.h();
        this.S.g();
    }

    public void b1(RecyclerView recyclerView, int i, int i2) {
        this.S.h();
        this.S.g();
    }

    public void d1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.S.h();
        this.S.g();
    }

    public void e1(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            Y2();
        }
        super.e1(uVar, zVar);
        b3();
    }

    public void f1(RecyclerView.z zVar) {
        super.f1(zVar);
        this.M = false;
    }

    /* access modifiers changed from: package-private */
    public int g3(int i, int i2) {
        if (this.w != 1 || !A2()) {
            int[] iArr = this.O;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.O;
        int i3 = this.N;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public int h3() {
        return this.N;
    }

    public void o3(int i) {
        if (i != this.N) {
            this.M = true;
            if (i >= 1) {
                this.N = i;
                this.S.h();
                B1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    public int q0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.w == 0) {
            return this.N;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return i3(uVar, zVar, zVar.b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    public View r2(RecyclerView.u uVar, RecyclerView.z zVar, int i, int i2, int i3) {
        c2();
        int m = this.y.m();
        int i4 = this.y.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View S2 = S(i);
            int n0 = n0(S2);
            if (n0 >= 0 && n0 < i3 && j3(uVar, zVar, n0) == 0) {
                if (((RecyclerView.LayoutParams) S2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = S2;
                    }
                } else if (this.y.g(S2) < i4 && this.y.d(S2) >= m) {
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

    public boolean w(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }
}
