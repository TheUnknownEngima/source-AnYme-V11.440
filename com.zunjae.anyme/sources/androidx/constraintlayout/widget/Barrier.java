package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;

public class Barrier extends ConstraintHelper {
    private int m;
    private int n;
    private a1 o;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r7 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r7 == 6) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v(defpackage.e1 r6, int r7, boolean r8) {
        /*
            r5 = this;
            r5.n = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 1
            r1 = 0
            r2 = 6
            r3 = 5
            r4 = 17
            if (r7 >= r4) goto L_0x0016
            int r7 = r5.m
            if (r7 != r3) goto L_0x0013
        L_0x0010:
            r5.n = r1
            goto L_0x0028
        L_0x0013:
            if (r7 != r2) goto L_0x0028
        L_0x0015:
            goto L_0x001c
        L_0x0016:
            int r7 = r5.m
            if (r8 == 0) goto L_0x0022
            if (r7 != r3) goto L_0x001f
        L_0x001c:
            r5.n = r0
            goto L_0x0028
        L_0x001f:
            if (r7 != r2) goto L_0x0028
            goto L_0x0010
        L_0x0022:
            if (r7 != r3) goto L_0x0025
            goto L_0x0010
        L_0x0025:
            if (r7 != r2) goto L_0x0028
            goto L_0x0015
        L_0x0028:
            boolean r7 = r6 instanceof defpackage.a1
            if (r7 == 0) goto L_0x0033
            a1 r6 = (defpackage.a1) r6
            int r7 = r5.n
            r6.M0(r7)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.v(e1, int, boolean):void");
    }

    public int getMargin() {
        return this.o.K0();
    }

    public int getType() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.o = new a1();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.o.L0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.o.N0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.h = this.o;
        t();
    }

    public void m(c.a aVar, j1 j1Var, ConstraintLayout.LayoutParams layoutParams, SparseArray<e1> sparseArray) {
        super.m(aVar, j1Var, layoutParams, sparseArray);
        if (j1Var instanceof a1) {
            a1 a1Var = (a1) j1Var;
            v(a1Var, aVar.d.b0, ((f1) j1Var.G()).Z0());
            a1Var.L0(aVar.d.j0);
            a1Var.N0(aVar.d.c0);
        }
    }

    public void n(e1 e1Var, boolean z) {
        v(e1Var, this.m, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.o.L0(z);
    }

    public void setDpMargin(int i) {
        a1 a1Var = this.o;
        a1Var.N0((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.o.N0(i);
    }

    public void setType(int i) {
        this.m = i;
    }

    public boolean u() {
        return this.o.I0();
    }
}
