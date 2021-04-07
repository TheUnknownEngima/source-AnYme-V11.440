package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class d {
    private final a a;
    private boolean[] b;
    int[] c;
    long[] d;
    private long[] e;

    static class b {
        List<c> a;
        int b;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.a = null;
            this.b = 0;
        }
    }

    private static class c implements Comparable<c> {
        int e;
        int f;

        private c() {
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            int i = this.f;
            int i2 = cVar.f;
            return i != i2 ? i - i2 : this.e - cVar.e;
        }

        public String toString() {
            return "Order{order=" + this.f + ", index=" + this.e + '}';
        }
    }

    d(a aVar) {
        this.a = aVar;
    }

    private int A(int i, b bVar, int i2) {
        int G;
        a aVar = this.a;
        int e2 = aVar.e(i, aVar.getPaddingLeft() + this.a.getPaddingRight() + bVar.P() + bVar.s0() + i2, bVar.getWidth());
        int size = View.MeasureSpec.getSize(e2);
        if (size > bVar.L0()) {
            G = bVar.L0();
        } else if (size >= bVar.G()) {
            return e2;
        } else {
            G = bVar.G();
        }
        return View.MeasureSpec.makeMeasureSpec(G, View.MeasureSpec.getMode(e2));
    }

    private int B(b bVar, boolean z) {
        return z ? bVar.L() : bVar.s0();
    }

    private int C(b bVar, boolean z) {
        return z ? bVar.s0() : bVar.L();
    }

    private int D(b bVar, boolean z) {
        return z ? bVar.V() : bVar.P();
    }

    private int E(b bVar, boolean z) {
        return z ? bVar.P() : bVar.V();
    }

    private int F(b bVar, boolean z) {
        return z ? bVar.getHeight() : bVar.getWidth();
    }

    private int G(b bVar, boolean z) {
        return z ? bVar.getWidth() : bVar.getHeight();
    }

    private int H(boolean z) {
        return z ? this.a.getPaddingBottom() : this.a.getPaddingEnd();
    }

    private int I(boolean z) {
        return z ? this.a.getPaddingEnd() : this.a.getPaddingBottom();
    }

    private int J(boolean z) {
        return z ? this.a.getPaddingTop() : this.a.getPaddingStart();
    }

    private int K(boolean z) {
        return z ? this.a.getPaddingStart() : this.a.getPaddingTop();
    }

    private int L(View view, boolean z) {
        return z ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int M(View view, boolean z) {
        return z ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean N(int i, int i2, c cVar) {
        return i == i2 - 1 && cVar.c() != 0;
    }

    private boolean P(View view, int i, int i2, int i3, int i4, b bVar, int i5, int i6, int i7) {
        if (this.a.getFlexWrap() == 0) {
            return false;
        }
        if (bVar.z0()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.a.getMaxLine();
        if (maxLine != -1 && maxLine <= i7 + 1) {
            return false;
        }
        int h = this.a.h(view, i5, i6);
        if (h > 0) {
            i4 += h;
        }
        return i2 < i3 + i4;
    }

    private void T(int i, int i2, c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        c cVar2 = cVar;
        int i9 = i3;
        int i10 = cVar2.e;
        float f = cVar2.k;
        float f2 = Utils.FLOAT_EPSILON;
        if (f > Utils.FLOAT_EPSILON && i9 <= i10) {
            float f3 = ((float) (i10 - i9)) / f;
            cVar2.e = i4 + cVar2.f;
            if (!z) {
                cVar2.g = Integer.MIN_VALUE;
            }
            int i11 = 0;
            boolean z2 = false;
            int i12 = 0;
            float f4 = Utils.FLOAT_EPSILON;
            while (i11 < cVar2.h) {
                int i13 = cVar2.o + i11;
                View d2 = this.a.d(i13);
                if (d2 == null || d2.getVisibility() == 8) {
                    int i14 = i2;
                    i6 = i10;
                    i5 = i11;
                } else {
                    b bVar = (b) d2.getLayoutParams();
                    int flexDirection = this.a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i6 = i10;
                        int i15 = i11;
                        int i16 = i;
                        int measuredWidth = d2.getMeasuredWidth();
                        long[] jArr = this.e;
                        if (jArr != null) {
                            measuredWidth = y(jArr[i13]);
                        }
                        int measuredHeight = d2.getMeasuredHeight();
                        long[] jArr2 = this.e;
                        int i17 = i15;
                        if (jArr2 != null) {
                            measuredHeight = x(jArr2[i13]);
                        }
                        if (this.b[i13] || bVar.B() <= Utils.FLOAT_EPSILON) {
                            int i18 = i2;
                            i8 = i17;
                        } else {
                            float B = ((float) measuredWidth) - (bVar.B() * f3);
                            i8 = i17;
                            if (i8 == cVar2.h - 1) {
                                B += f4;
                                f4 = Utils.FLOAT_EPSILON;
                            }
                            int round = Math.round(B);
                            if (round < bVar.G()) {
                                round = bVar.G();
                                this.b[i13] = true;
                                cVar2.k -= bVar.B();
                                z2 = true;
                            } else {
                                f4 += B - ((float) round);
                                double d3 = (double) f4;
                                if (d3 > 1.0d) {
                                    round++;
                                    f4 -= 1.0f;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    f4 += 1.0f;
                                }
                            }
                            int z3 = z(i2, bVar, cVar2.m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            d2.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = d2.getMeasuredWidth();
                            int measuredHeight2 = d2.getMeasuredHeight();
                            Z(i13, makeMeasureSpec, z3, d2);
                            this.a.f(i13, d2);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i12, measuredHeight + bVar.V() + bVar.L() + this.a.k(d2));
                        cVar2.e += measuredWidth + bVar.P() + bVar.s0();
                        i7 = max;
                    } else {
                        int measuredHeight3 = d2.getMeasuredHeight();
                        long[] jArr3 = this.e;
                        if (jArr3 != null) {
                            measuredHeight3 = x(jArr3[i13]);
                        }
                        int measuredWidth3 = d2.getMeasuredWidth();
                        long[] jArr4 = this.e;
                        if (jArr4 != null) {
                            measuredWidth3 = y(jArr4[i13]);
                        }
                        if (this.b[i13] || bVar.B() <= f2) {
                            i6 = i10;
                            i5 = i11;
                            int i19 = i;
                        } else {
                            float B2 = ((float) measuredHeight3) - (bVar.B() * f3);
                            if (i11 == cVar2.h - 1) {
                                B2 += f4;
                                f4 = Utils.FLOAT_EPSILON;
                            }
                            int round2 = Math.round(B2);
                            if (round2 < bVar.v0()) {
                                round2 = bVar.v0();
                                this.b[i13] = true;
                                cVar2.k -= bVar.B();
                                i6 = i10;
                                i5 = i11;
                                z2 = true;
                            } else {
                                f4 += B2 - ((float) round2);
                                i6 = i10;
                                i5 = i11;
                                double d4 = (double) f4;
                                if (d4 > 1.0d) {
                                    round2++;
                                    f4 -= 1.0f;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    f4 += 1.0f;
                                }
                            }
                            int A = A(i, bVar, cVar2.m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            d2.measure(A, makeMeasureSpec2);
                            measuredWidth3 = d2.getMeasuredWidth();
                            int measuredHeight4 = d2.getMeasuredHeight();
                            Z(i13, A, makeMeasureSpec2, d2);
                            this.a.f(i13, d2);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i12, measuredWidth3 + bVar.P() + bVar.s0() + this.a.k(d2));
                        cVar2.e += measuredHeight3 + bVar.V() + bVar.L();
                        int i20 = i2;
                    }
                    cVar2.g = Math.max(cVar2.g, i7);
                    i12 = i7;
                }
                i11 = i5 + 1;
                i10 = i6;
                f2 = Utils.FLOAT_EPSILON;
            }
            int i21 = i2;
            int i22 = i10;
            if (z2 && i22 != cVar2.e) {
                T(i, i2, cVar, i3, i4, true);
            }
        }
    }

    private int[] U(int i, List<c> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (c next : list) {
            int i3 = next.e;
            iArr[i2] = i3;
            sparseIntArray.append(i3, next.f);
            i2++;
        }
        return iArr;
    }

    private void V(View view, int i, int i2) {
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.P()) - bVar.s0()) - this.a.k(view), bVar.G()), bVar.L0());
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? x(jArr[i2]) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Z(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.a.f(i2, view);
    }

    private void W(View view, int i, int i2) {
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i - bVar.V()) - bVar.L()) - this.a.k(view), bVar.v0()), bVar.D0());
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? y(jArr[i2]) : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Z(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.a.f(i2, view);
    }

    private void Z(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = S(i2, i3);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = S(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<c> list, c cVar, int i, int i2) {
        cVar.m = i2;
        this.a.c(cVar);
        cVar.p = i;
        list.add(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.G()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.G()
        L_0x0019:
            r3 = 1
            goto L_0x0027
        L_0x001b:
            int r3 = r0.L0()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.L0()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.v0()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.v0()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.D0()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.D0()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Z(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.a
            r0.f(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.d.i(android.view.View, int):void");
    }

    private List<c> k(List<c> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        cVar.g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private List<c> l(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            c cVar = new c();
            cVar.f = ((b) this.a.g(i2).getLayoutParams()).getOrder();
            cVar.e = i2;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private void r(int i) {
        boolean[] zArr = this.b;
        if (zArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.b = new boolean[i];
        } else if (zArr.length < i) {
            int length = zArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.b = new boolean[i];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void v(CompoundButton compoundButton) {
        b bVar = (b) compoundButton.getLayoutParams();
        int G = bVar.G();
        int v0 = bVar.v0();
        Drawable a2 = androidx.core.widget.c.a(compoundButton);
        int i = 0;
        int minimumWidth = a2 == null ? 0 : a2.getMinimumWidth();
        if (a2 != null) {
            i = a2.getMinimumHeight();
        }
        if (G == -1) {
            G = minimumWidth;
        }
        bVar.K(G);
        if (v0 == -1) {
            v0 = i;
        }
        bVar.Z(v0);
    }

    private void w(int i, int i2, c cVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d2;
        int i8;
        double d3;
        c cVar2 = cVar;
        int i9 = i3;
        float f = cVar2.j;
        float f2 = Utils.FLOAT_EPSILON;
        if (f > Utils.FLOAT_EPSILON && i9 >= (i5 = cVar2.e)) {
            float f3 = ((float) (i9 - i5)) / f;
            cVar2.e = i4 + cVar2.f;
            if (!z) {
                cVar2.g = Integer.MIN_VALUE;
            }
            int i10 = 0;
            boolean z2 = false;
            int i11 = 0;
            float f4 = Utils.FLOAT_EPSILON;
            while (i10 < cVar2.h) {
                int i12 = cVar2.o + i10;
                View d4 = this.a.d(i12);
                if (d4 == null || d4.getVisibility() == 8) {
                    int i13 = i2;
                    i6 = i5;
                } else {
                    b bVar = (b) d4.getLayoutParams();
                    int flexDirection = this.a.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        int i14 = i5;
                        int i15 = i;
                        int measuredWidth = d4.getMeasuredWidth();
                        long[] jArr = this.e;
                        if (jArr != null) {
                            measuredWidth = y(jArr[i12]);
                        }
                        int measuredHeight = d4.getMeasuredHeight();
                        long[] jArr2 = this.e;
                        i6 = i14;
                        if (jArr2 != null) {
                            measuredHeight = x(jArr2[i12]);
                        }
                        if (this.b[i12] || bVar.c0() <= Utils.FLOAT_EPSILON) {
                            int i16 = i2;
                        } else {
                            float c0 = ((float) measuredWidth) + (bVar.c0() * f3);
                            if (i10 == cVar2.h - 1) {
                                c0 += f4;
                                f4 = Utils.FLOAT_EPSILON;
                            }
                            int round = Math.round(c0);
                            if (round > bVar.L0()) {
                                round = bVar.L0();
                                this.b[i12] = true;
                                cVar2.j -= bVar.c0();
                                z2 = true;
                            } else {
                                f4 += c0 - ((float) round);
                                double d5 = (double) f4;
                                if (d5 > 1.0d) {
                                    round++;
                                    d2 = d5 - 1.0d;
                                } else if (d5 < -1.0d) {
                                    round--;
                                    d2 = d5 + 1.0d;
                                }
                                f4 = (float) d2;
                            }
                            int z3 = z(i2, bVar, cVar2.m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            d4.measure(makeMeasureSpec, z3);
                            int measuredWidth2 = d4.getMeasuredWidth();
                            int measuredHeight2 = d4.getMeasuredHeight();
                            Z(i12, makeMeasureSpec, z3, d4);
                            this.a.f(i12, d4);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i11, measuredHeight + bVar.V() + bVar.L() + this.a.k(d4));
                        cVar2.e += measuredWidth + bVar.P() + bVar.s0();
                        i7 = max;
                    } else {
                        int measuredHeight3 = d4.getMeasuredHeight();
                        long[] jArr3 = this.e;
                        if (jArr3 != null) {
                            measuredHeight3 = x(jArr3[i12]);
                        }
                        int measuredWidth3 = d4.getMeasuredWidth();
                        long[] jArr4 = this.e;
                        if (jArr4 != null) {
                            measuredWidth3 = y(jArr4[i12]);
                        }
                        if (this.b[i12] || bVar.c0() <= f2) {
                            i8 = i5;
                            int i17 = i;
                        } else {
                            float c02 = ((float) measuredHeight3) + (bVar.c0() * f3);
                            if (i10 == cVar2.h - 1) {
                                c02 += f4;
                                f4 = Utils.FLOAT_EPSILON;
                            }
                            int round2 = Math.round(c02);
                            if (round2 > bVar.D0()) {
                                round2 = bVar.D0();
                                this.b[i12] = true;
                                cVar2.j -= bVar.c0();
                                i8 = i5;
                                z2 = true;
                            } else {
                                f4 += c02 - ((float) round2);
                                i8 = i5;
                                double d6 = (double) f4;
                                if (d6 > 1.0d) {
                                    round2++;
                                    d3 = d6 - 1.0d;
                                } else if (d6 < -1.0d) {
                                    round2--;
                                    d3 = d6 + 1.0d;
                                }
                                f4 = (float) d3;
                            }
                            int A = A(i, bVar, cVar2.m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            d4.measure(A, makeMeasureSpec2);
                            measuredWidth3 = d4.getMeasuredWidth();
                            int measuredHeight4 = d4.getMeasuredHeight();
                            Z(i12, A, makeMeasureSpec2, d4);
                            this.a.f(i12, d4);
                            measuredHeight3 = measuredHeight4;
                        }
                        i7 = Math.max(i11, measuredWidth3 + bVar.P() + bVar.s0() + this.a.k(d4));
                        cVar2.e += measuredHeight3 + bVar.V() + bVar.L();
                        int i18 = i2;
                        i6 = i8;
                    }
                    cVar2.g = Math.max(cVar2.g, i7);
                    i11 = i7;
                }
                i10++;
                i5 = i6;
                f2 = Utils.FLOAT_EPSILON;
            }
            int i19 = i2;
            int i20 = i5;
            if (z2 && i20 != cVar2.e) {
                w(i, i2, cVar, i3, i4, true);
            }
        }
    }

    private int z(int i, b bVar, int i2) {
        int v0;
        a aVar = this.a;
        int i3 = aVar.i(i, aVar.getPaddingTop() + this.a.getPaddingBottom() + bVar.V() + bVar.L() + i2, bVar.getHeight());
        int size = View.MeasureSpec.getSize(i3);
        if (size > bVar.D0()) {
            v0 = bVar.D0();
        } else if (size >= bVar.v0()) {
            return i3;
        } else {
            v0 = bVar.v0();
        }
        return View.MeasureSpec.makeMeasureSpec(v0, View.MeasureSpec.getMode(i3));
    }

    /* access modifiers changed from: package-private */
    public boolean O(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View g = this.a.g(i);
            if (g != null && ((b) g.getLayoutParams()).getOrder() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void Q(View view, c cVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int L;
        b bVar = (b) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (bVar.A() != -1) {
            alignItems = bVar.A();
        }
        int i9 = cVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int measuredHeight = (((i9 - view.getMeasuredHeight()) + bVar.V()) - bVar.L()) / 2;
                    int i10 = this.a.getFlexWrap() != 2 ? i2 + measuredHeight : i2 - measuredHeight;
                    view.layout(i, i10, i3, view.getMeasuredHeight() + i10);
                    return;
                } else if (alignItems == 3) {
                    int flexWrap = this.a.getFlexWrap();
                    int i11 = cVar.l;
                    if (flexWrap != 2) {
                        i8 = Math.max(i11 - view.getBaseline(), bVar.V());
                        i6 = i2 + i8;
                        i5 = i4 + i8;
                        view.layout(i, i6, i3, i5);
                    }
                    i7 = Math.max((i11 - view.getMeasuredHeight()) + view.getBaseline(), bVar.L());
                    L = i2 - i7;
                    i5 = i4 - i7;
                    view.layout(i, i6, i3, i5);
                } else if (alignItems != 4) {
                    return;
                }
            } else if (this.a.getFlexWrap() != 2) {
                int i12 = i2 + i9;
                view.layout(i, (i12 - view.getMeasuredHeight()) - bVar.L(), i3, i12 - bVar.L());
                return;
            } else {
                i6 = (i2 - i9) + view.getMeasuredHeight() + bVar.V();
                i4 = (i4 - i9) + view.getMeasuredHeight();
                i8 = bVar.V();
                i5 = i4 + i8;
                view.layout(i, i6, i3, i5);
            }
        }
        if (this.a.getFlexWrap() != 2) {
            i6 = i2 + bVar.V();
            i8 = bVar.V();
            i5 = i4 + i8;
            view.layout(i, i6, i3, i5);
        }
        L = i2 - bVar.L();
        i7 = bVar.L();
        i5 = i4 - i7;
        view.layout(i, i6, i3, i5);
    }

    /* access modifiers changed from: package-private */
    public void R(View view, c cVar, boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        b bVar = (b) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (bVar.A() != -1) {
            alignItems = bVar.A();
        }
        int i9 = cVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    i7 = (((i9 - view.getMeasuredWidth()) + b4.b(marginLayoutParams)) - b4.a(marginLayoutParams)) / 2;
                    if (!z) {
                        i6 = i + i7;
                        i5 = i3 + i7;
                        view.layout(i6, i2, i5, i4);
                    }
                    i8 = i - i7;
                    i5 = i3 - i7;
                    view.layout(i6, i2, i5, i4);
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                i8 = ((i + i9) - view.getMeasuredWidth()) - bVar.s0();
                i3 = (i3 + i9) - view.getMeasuredWidth();
                i7 = bVar.s0();
                i5 = i3 - i7;
                view.layout(i6, i2, i5, i4);
            } else {
                i6 = (i - i9) + view.getMeasuredWidth() + bVar.P();
                i3 = (i3 - i9) + view.getMeasuredWidth();
                i7 = bVar.P();
                i5 = i3 + i7;
                view.layout(i6, i2, i5, i4);
            }
        }
        if (!z) {
            i6 = i + bVar.P();
            i7 = bVar.P();
            i5 = i3 + i7;
            view.layout(i6, i2, i5, i4);
        }
        i8 = i - bVar.s0();
        i7 = bVar.s0();
        i5 = i3 - i7;
        view.layout(i6, i2, i5, i4);
    }

    /* access modifiers changed from: package-private */
    public long S(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* access modifiers changed from: package-private */
    public void X() {
        Y(0);
    }

    /* access modifiers changed from: package-private */
    public void Y(int i) {
        View d2;
        int i2 = i;
        if (i2 < this.a.getFlexItemCount()) {
            int flexDirection = this.a.getFlexDirection();
            if (this.a.getAlignItems() == 4) {
                int[] iArr = this.c;
                List<c> flexLinesInternal = this.a.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                for (int i3 = iArr != null ? iArr[i2] : 0; i3 < size; i3++) {
                    c cVar = flexLinesInternal.get(i3);
                    int i4 = cVar.h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        int i6 = cVar.o + i5;
                        if (!(i5 >= this.a.getFlexItemCount() || (d2 = this.a.d(i6)) == null || d2.getVisibility() == 8)) {
                            b bVar = (b) d2.getLayoutParams();
                            if (bVar.A() == -1 || bVar.A() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    W(d2, cVar.g, i6);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    V(d2, cVar.g, i6);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (c next : this.a.getFlexLinesInternal()) {
                Iterator<Integer> it = next.n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next2 = it.next();
                        View d3 = this.a.d(next2.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            W(d3, next.g, next2.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            V(d3, next.g, next2.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        if (N(r6, r1, r3) != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        if (N(r6, r1, r3) != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.google.android.flexbox.d.b r32, int r33, int r34, int r35, int r36, int r37, java.util.List<com.google.android.flexbox.c> r38) {
        /*
            r31 = this;
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r37
            com.google.android.flexbox.a r0 = r10.a
            boolean r15 = r0.j()
            int r9 = android.view.View.MeasureSpec.getMode(r33)
            int r8 = android.view.View.MeasureSpec.getSize(r33)
            if (r38 != 0) goto L_0x0021
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = r0
            goto L_0x0023
        L_0x0021:
            r7 = r38
        L_0x0023:
            r11.a = r7
            r6 = -1
            if (r14 != r6) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            int r1 = r10.K(r15)
            int r2 = r10.I(r15)
            int r16 = r10.J(r15)
            int r17 = r10.H(r15)
            com.google.android.flexbox.c r3 = new com.google.android.flexbox.c
            r3.<init>()
            r6 = r36
            r3.o = r6
            int r2 = r2 + r1
            r3.e = r2
            com.google.android.flexbox.a r1 = r10.a
            int r1 = r1.getFlexItemCount()
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = r0
            r0 = 0
            r20 = 0
            r21 = 0
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0058:
            if (r6 >= r1) goto L_0x0345
            com.google.android.flexbox.a r5 = r10.a
            android.view.View r5 = r5.d(r6)
            if (r5 != 0) goto L_0x006c
            boolean r5 = r10.N(r6, r1, r3)
            if (r5 == 0) goto L_0x0086
        L_0x0068:
            r10.a(r7, r3, r6, r0)
            goto L_0x0086
        L_0x006c:
            int r4 = r5.getVisibility()
            r11 = 8
            if (r4 != r11) goto L_0x0097
            int r4 = r3.i
            r5 = 1
            int r4 = r4 + r5
            r3.i = r4
            int r4 = r3.h
            int r4 = r4 + r5
            r3.h = r4
            boolean r4 = r10.N(r6, r1, r3)
            if (r4 == 0) goto L_0x0086
            goto L_0x0068
        L_0x0086:
            r11 = r35
            r24 = r8
            r26 = r9
            r5 = r13
            r8 = r14
            r9 = -1
            r12 = 1
            r27 = 0
            r14 = r7
            r7 = r2
            r2 = r1
            goto L_0x0334
        L_0x0097:
            boolean r4 = r5 instanceof android.widget.CompoundButton
            if (r4 == 0) goto L_0x00a1
            r4 = r5
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            r10.v(r4)
        L_0x00a1:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            r11 = r4
            com.google.android.flexbox.b r11 = (com.google.android.flexbox.b) r11
            int r4 = r11.A()
            r25 = r1
            r1 = 4
            if (r4 != r1) goto L_0x00ba
            java.util.List<java.lang.Integer> r1 = r3.n
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r1.add(r4)
        L_0x00ba:
            int r1 = r10.G(r11, r15)
            float r4 = r11.h0()
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r26 ? 1 : (r4 == r26 ? 0 : -1))
            if (r4 == 0) goto L_0x00d7
            r4 = 1073741824(0x40000000, float:2.0)
            if (r9 != r4) goto L_0x00d7
            float r1 = (float) r8
            float r4 = r11.h0()
            float r1 = r1 * r4
            int r1 = java.lang.Math.round(r1)
        L_0x00d7:
            if (r15 == 0) goto L_0x0113
            com.google.android.flexbox.a r4 = r10.a
            r14 = 1
            int r24 = r10.E(r11, r14)
            int r24 = r2 + r24
            int r26 = r10.C(r11, r14)
            int r14 = r24 + r26
            int r1 = r4.e(r12, r14, r1)
            com.google.android.flexbox.a r4 = r10.a
            int r14 = r16 + r17
            r24 = r8
            r8 = 1
            int r26 = r10.D(r11, r8)
            int r14 = r14 + r26
            int r26 = r10.B(r11, r8)
            int r14 = r14 + r26
            int r14 = r14 + r0
            r26 = r9
            int r9 = r10.F(r11, r8)
            int r4 = r4.i(r13, r14, r9)
            r5.measure(r1, r4)
            r10.Z(r6, r1, r4, r5)
            r9 = r1
            r14 = 0
            goto L_0x014a
        L_0x0113:
            r24 = r8
            r26 = r9
            r8 = 1
            com.google.android.flexbox.a r4 = r10.a
            int r9 = r16 + r17
            r14 = 0
            int r23 = r10.D(r11, r14)
            int r9 = r9 + r23
            int r23 = r10.B(r11, r14)
            int r9 = r9 + r23
            int r9 = r9 + r0
            int r8 = r10.F(r11, r14)
            int r4 = r4.e(r13, r9, r8)
            com.google.android.flexbox.a r8 = r10.a
            int r9 = r10.E(r11, r14)
            int r9 = r9 + r2
            int r23 = r10.C(r11, r14)
            int r9 = r9 + r23
            int r1 = r8.i(r12, r9, r1)
            r5.measure(r4, r1)
            r10.Z(r6, r4, r1, r5)
            r9 = r1
        L_0x014a:
            com.google.android.flexbox.a r1 = r10.a
            r1.f(r6, r5)
            r10.i(r5, r6)
            int r1 = r5.getMeasuredState()
            r4 = r20
            int r20 = android.view.View.combineMeasuredStates(r4, r1)
            int r4 = r3.e
            int r1 = r10.M(r5, r15)
            int r8 = r10.E(r11, r15)
            int r1 = r1 + r8
            int r8 = r10.C(r11, r15)
            int r8 = r8 + r1
            int r23 = r7.size()
            r1 = r0
            r0 = r31
            r12 = r1
            r14 = r25
            r1 = r5
            r14 = r2
            r2 = r26
            r28 = r3
            r3 = r24
            r29 = r14
            r14 = 1
            r14 = r5
            r27 = 0
            r5 = r8
            r8 = r6
            r38 = r14
            r14 = -1
            r6 = r11
            r14 = r7
            r7 = r8
            r13 = r8
            r8 = r21
            r30 = r9
            r9 = r23
            boolean r0 = r0.P(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0231
            int r0 = r28.c()
            if (r0 <= 0) goto L_0x01b0
            if (r13 <= 0) goto L_0x01a6
            int r5 = r13 + -1
            r3 = r28
            goto L_0x01a9
        L_0x01a6:
            r3 = r28
            r5 = 0
        L_0x01a9:
            r10.a(r14, r3, r5, r12)
            int r0 = r3.g
            int r0 = r0 + r12
            goto L_0x01b1
        L_0x01b0:
            r0 = r12
        L_0x01b1:
            if (r15 == 0) goto L_0x01eb
            int r1 = r11.getHeight()
            r2 = -1
            if (r1 != r2) goto L_0x01e5
            com.google.android.flexbox.a r1 = r10.a
            int r2 = r1.getPaddingTop()
            com.google.android.flexbox.a r3 = r10.a
            int r3 = r3.getPaddingBottom()
            int r2 = r2 + r3
            int r3 = r11.V()
            int r2 = r2 + r3
            int r3 = r11.L()
            int r2 = r2 + r3
            int r2 = r2 + r0
            int r3 = r11.getHeight()
            r5 = r34
            r6 = r13
            int r1 = r1.i(r5, r2, r3)
            r2 = r38
            r3 = r30
            r2.measure(r3, r1)
            goto L_0x021c
        L_0x01e5:
            r5 = r34
            r2 = r38
            r6 = r13
            goto L_0x021f
        L_0x01eb:
            r5 = r34
            r2 = r38
            r6 = r13
            r3 = r30
            int r1 = r11.getWidth()
            r4 = -1
            if (r1 != r4) goto L_0x021f
            com.google.android.flexbox.a r1 = r10.a
            int r4 = r1.getPaddingLeft()
            com.google.android.flexbox.a r7 = r10.a
            int r7 = r7.getPaddingRight()
            int r4 = r4 + r7
            int r7 = r11.P()
            int r4 = r4 + r7
            int r7 = r11.s0()
            int r4 = r4 + r7
            int r4 = r4 + r0
            int r7 = r11.getWidth()
            int r1 = r1.e(r5, r4, r7)
            r2.measure(r1, r3)
        L_0x021c:
            r10.i(r2, r6)
        L_0x021f:
            com.google.android.flexbox.c r3 = new com.google.android.flexbox.c
            r3.<init>()
            r1 = 1
            r3.h = r1
            r7 = r29
            r3.e = r7
            r3.o = r6
            r1 = 0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0246
        L_0x0231:
            r5 = r34
            r2 = r38
            r6 = r13
            r3 = r28
            r7 = r29
            r1 = 1
            int r0 = r3.h
            int r0 = r0 + r1
            r3.h = r0
            int r0 = r21 + 1
            r1 = r0
            r0 = r12
            r4 = r22
        L_0x0246:
            boolean r8 = r3.q
            float r9 = r11.c0()
            r12 = 0
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0253
            r9 = 1
            goto L_0x0254
        L_0x0253:
            r9 = 0
        L_0x0254:
            r8 = r8 | r9
            r3.q = r8
            boolean r8 = r3.r
            float r9 = r11.B()
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0263
            r9 = 1
            goto L_0x0264
        L_0x0263:
            r9 = 0
        L_0x0264:
            r8 = r8 | r9
            r3.r = r8
            int[] r8 = r10.c
            if (r8 == 0) goto L_0x0271
            int r9 = r14.size()
            r8[r6] = r9
        L_0x0271:
            int r8 = r3.e
            int r9 = r10.M(r2, r15)
            int r12 = r10.E(r11, r15)
            int r9 = r9 + r12
            int r12 = r10.C(r11, r15)
            int r9 = r9 + r12
            int r8 = r8 + r9
            r3.e = r8
            float r8 = r3.j
            float r9 = r11.c0()
            float r8 = r8 + r9
            r3.j = r8
            float r8 = r3.k
            float r9 = r11.B()
            float r8 = r8 + r9
            r3.k = r8
            com.google.android.flexbox.a r8 = r10.a
            r8.b(r2, r6, r1, r3)
            int r8 = r10.L(r2, r15)
            int r9 = r10.D(r11, r15)
            int r8 = r8 + r9
            int r9 = r10.B(r11, r15)
            int r8 = r8 + r9
            com.google.android.flexbox.a r9 = r10.a
            int r9 = r9.k(r2)
            int r8 = r8 + r9
            int r4 = java.lang.Math.max(r4, r8)
            int r8 = r3.g
            int r8 = java.lang.Math.max(r8, r4)
            r3.g = r8
            if (r15 == 0) goto L_0x02ed
            com.google.android.flexbox.a r8 = r10.a
            int r8 = r8.getFlexWrap()
            r9 = 2
            if (r8 == r9) goto L_0x02d7
            int r8 = r3.l
            int r2 = r2.getBaseline()
            int r9 = r11.V()
            int r2 = r2 + r9
            int r2 = java.lang.Math.max(r8, r2)
            goto L_0x02eb
        L_0x02d7:
            int r8 = r3.l
            int r9 = r2.getMeasuredHeight()
            int r2 = r2.getBaseline()
            int r9 = r9 - r2
            int r2 = r11.L()
            int r9 = r9 + r2
            int r2 = java.lang.Math.max(r8, r9)
        L_0x02eb:
            r3.l = r2
        L_0x02ed:
            r2 = r25
            boolean r8 = r10.N(r6, r2, r3)
            if (r8 == 0) goto L_0x02fb
            r10.a(r14, r3, r6, r0)
            int r8 = r3.g
            int r0 = r0 + r8
        L_0x02fb:
            r8 = r37
            r9 = -1
            if (r8 == r9) goto L_0x0324
            int r11 = r14.size()
            if (r11 <= 0) goto L_0x0324
            int r11 = r14.size()
            r12 = 1
            int r11 = r11 - r12
            java.lang.Object r11 = r14.get(r11)
            com.google.android.flexbox.c r11 = (com.google.android.flexbox.c) r11
            int r11 = r11.p
            if (r11 < r8) goto L_0x0325
            if (r6 < r8) goto L_0x0325
            if (r19 != 0) goto L_0x0325
            int r0 = r3.a()
            int r0 = -r0
            r11 = r35
            r19 = 1
            goto L_0x0327
        L_0x0324:
            r12 = 1
        L_0x0325:
            r11 = r35
        L_0x0327:
            if (r0 <= r11) goto L_0x0330
            if (r19 == 0) goto L_0x0330
            r0 = r32
            r4 = r20
            goto L_0x0349
        L_0x0330:
            r21 = r1
            r22 = r4
        L_0x0334:
            int r6 = r6 + 1
            r11 = r32
            r12 = r33
            r1 = r2
            r13 = r5
            r2 = r7
            r7 = r14
            r9 = r26
            r14 = r8
            r8 = r24
            goto L_0x0058
        L_0x0345:
            r4 = r20
            r0 = r32
        L_0x0349:
            r0.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.d.b(com.google.android.flexbox.d$b, int, int, int, int, int, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    public void c(b bVar, int i, int i2) {
        b(bVar, i, i2, Integer.MAX_VALUE, 0, -1, (List<c>) null);
    }

    /* access modifiers changed from: package-private */
    public void d(b bVar, int i, int i2, int i3, int i4, List<c> list) {
        b(bVar, i, i2, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    public void e(b bVar, int i, int i2, int i3, int i4, List<c> list) {
        b(bVar, i, i2, i3, 0, i4, list);
    }

    /* access modifiers changed from: package-private */
    public void f(b bVar, int i, int i2) {
        b(bVar, i2, i, Integer.MAX_VALUE, 0, -1, (List<c>) null);
    }

    /* access modifiers changed from: package-private */
    public void g(b bVar, int i, int i2, int i3, int i4, List<c> list) {
        b(bVar, i2, i, i3, i4, -1, list);
    }

    /* access modifiers changed from: package-private */
    public void h(b bVar, int i, int i2, int i3, int i4, List<c> list) {
        b(bVar, i2, i, i3, 0, i4, list);
    }

    /* access modifiers changed from: package-private */
    public void j(List<c> list, int i) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public int[] m(SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        return U(flexItemCount, l(flexItemCount), sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    public int[] n(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.a.getFlexItemCount();
        List<c> l = l(flexItemCount);
        c cVar = new c();
        if (view == null || !(layoutParams instanceof b)) {
            cVar.f = 1;
        } else {
            cVar.f = ((b) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount || i >= this.a.getFlexItemCount()) {
            cVar.e = flexItemCount;
        } else {
            cVar.e = i;
            while (i < flexItemCount) {
                l.get(i).e++;
                i++;
            }
        }
        l.add(cVar);
        return U(flexItemCount + 1, l, sparseIntArray);
    }

    /* access modifiers changed from: package-private */
    public void o(int i, int i2, int i3) {
        int i4;
        int i5;
        ArrayList arrayList;
        int flexDirection = this.a.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection == 2 || flexDirection == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
        }
        List<c> flexLinesInternal = this.a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.a.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < i5) {
                                    float size2 = ((float) (i5 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                                    int size3 = flexLinesInternal.size();
                                    float f = Utils.FLOAT_EPSILON;
                                    while (i6 < size3) {
                                        c cVar = flexLinesInternal.get(i6);
                                        float f2 = ((float) cVar.g) + size2;
                                        if (i6 == flexLinesInternal.size() - 1) {
                                            f2 += f;
                                            f = Utils.FLOAT_EPSILON;
                                        }
                                        int round = Math.round(f2);
                                        f += f2 - ((float) round);
                                        if (f > 1.0f) {
                                            round++;
                                            f -= 1.0f;
                                        } else if (f < -1.0f) {
                                            round--;
                                            f += 1.0f;
                                        }
                                        cVar.g = round;
                                        i6++;
                                    }
                                    return;
                                }
                                return;
                            } else if (sumOfCrossSize < i5) {
                                int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                                arrayList = new ArrayList();
                                c cVar2 = new c();
                                cVar2.g = size4;
                                for (c add : flexLinesInternal) {
                                    arrayList.add(cVar2);
                                    arrayList.add(add);
                                    arrayList.add(cVar2);
                                }
                            }
                        } else if (sumOfCrossSize < i5) {
                            float size5 = ((float) (i5 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                            arrayList = new ArrayList();
                            int size6 = flexLinesInternal.size();
                            float f3 = Utils.FLOAT_EPSILON;
                            while (i6 < size6) {
                                arrayList.add(flexLinesInternal.get(i6));
                                if (i6 != flexLinesInternal.size() - 1) {
                                    c cVar3 = new c();
                                    if (i6 == flexLinesInternal.size() - 2) {
                                        cVar3.g = Math.round(f3 + size5);
                                        f3 = Utils.FLOAT_EPSILON;
                                    } else {
                                        cVar3.g = Math.round(size5);
                                    }
                                    int i7 = cVar3.g;
                                    f3 += size5 - ((float) i7);
                                    if (f3 > 1.0f) {
                                        cVar3.g = i7 + 1;
                                        f3 -= 1.0f;
                                    } else if (f3 < -1.0f) {
                                        cVar3.g = i7 - 1;
                                        f3 += 1.0f;
                                    }
                                    arrayList.add(cVar3);
                                }
                                i6++;
                            }
                        } else {
                            return;
                        }
                        this.a.setFlexLines(arrayList);
                        return;
                    }
                    this.a.setFlexLines(k(flexLinesInternal, i5, sumOfCrossSize));
                    return;
                }
                int i8 = i5 - sumOfCrossSize;
                c cVar4 = new c();
                cVar4.g = i8;
                flexLinesInternal.add(0, cVar4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p(int i, int i2) {
        q(i, i2, 0);
    }

    /* access modifiers changed from: package-private */
    public void q(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        r(this.a.getFlexItemCount());
        if (i3 < this.a.getFlexItemCount()) {
            int flexDirection = this.a.getFlexDirection();
            int flexDirection2 = this.a.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int largestMainSize = this.a.getLargestMainSize();
                if (mode != 1073741824 && largestMainSize <= size) {
                    size = largestMainSize;
                }
                i6 = this.a.getPaddingLeft();
                i4 = this.a.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i5 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i5 = this.a.getLargestMainSize();
                }
                i6 = this.a.getPaddingTop();
                i4 = this.a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + flexDirection);
            }
            int i7 = i6 + i4;
            int i8 = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                i8 = iArr[i3];
            }
            List<c> flexLinesInternal = this.a.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            for (int i9 = i8; i9 < size2; i9++) {
                c cVar = flexLinesInternal.get(i9);
                if (cVar.e < i5 && cVar.q) {
                    w(i, i2, cVar, i5, i7, false);
                } else if (cVar.e > i5 && cVar.r) {
                    T(i, i2, cVar, i5, i7, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.c = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.d = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.e = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.e = Arrays.copyOf(this.e, i);
        }
    }

    /* access modifiers changed from: package-private */
    public int x(long j) {
        return (int) (j >> 32);
    }

    /* access modifiers changed from: package-private */
    public int y(long j) {
        return (int) j;
    }
}
