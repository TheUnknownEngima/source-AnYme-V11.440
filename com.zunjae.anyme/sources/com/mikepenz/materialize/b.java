package com.mikepenz.materialize;

import android.app.Activity;
import android.view.ViewGroup;
import com.mikepenz.materialize.view.a;

public class b {
    protected Activity a;
    protected ViewGroup b;
    protected ViewGroup c;
    protected a d;
    protected boolean e = true;
    protected int f = 0;
    protected int g = -1;
    protected boolean h = false;
    protected boolean i = false;
    protected boolean j = false;
    protected boolean k = true;
    protected boolean l = false;
    protected boolean m = false;
    protected boolean n = false;
    protected boolean o = false;
    protected boolean p = false;
    protected boolean q = false;
    protected ViewGroup r = null;
    protected ViewGroup.LayoutParams s = null;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.mikepenz.materialize.a a() {
        /*
            r8 = this;
            android.app.Activity r0 = r8.a
            if (r0 == 0) goto L_0x01bb
            boolean r1 = r8.e
            r2 = 1
            r3 = -1
            r4 = 0
            if (r1 == 0) goto L_0x00d0
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            int r1 = com.mikepenz.materialize.R$layout.materialize
            android.view.ViewGroup r5 = r8.b
            android.view.View r0 = r0.inflate(r1, r5, r4)
            com.mikepenz.materialize.view.ScrimInsetsFrameLayout r0 = (com.mikepenz.materialize.view.ScrimInsetsFrameLayout) r0
            r8.d = r0
            android.view.ViewGroup r0 = r8.b
            if (r0 == 0) goto L_0x00c8
            int r0 = r0.getChildCount()
            if (r0 == 0) goto L_0x00c8
            android.view.ViewGroup r0 = r8.b
            android.view.View r0 = r0.getChildAt(r4)
            int r1 = r0.getId()
            int r5 = com.mikepenz.materialize.R$id.materialize_root
            if (r1 != r5) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            int r5 = r8.f
            if (r5 != 0) goto L_0x0045
            int r5 = r8.g
            if (r5 == r3) goto L_0x0045
            android.app.Activity r6 = r8.a
            int r5 = androidx.core.content.a.d(r6, r5)
            goto L_0x0053
        L_0x0045:
            int r5 = r8.f
            if (r5 != 0) goto L_0x0055
            android.app.Activity r5 = r8.a
            int r6 = com.mikepenz.materialize.R$attr.colorPrimaryDark
            int r7 = com.mikepenz.materialize.R$color.materialize_primary_dark
            int r5 = defpackage.to1.m(r5, r6, r7)
        L_0x0053:
            r8.f = r5
        L_0x0055:
            com.mikepenz.materialize.view.a r5 = r8.d
            int r6 = r8.f
            r5.setInsetForeground(r6)
            com.mikepenz.materialize.view.a r5 = r8.d
            boolean r6 = r8.k
            r5.setTintStatusBar(r6)
            com.mikepenz.materialize.view.a r5 = r8.d
            boolean r6 = r8.o
            r5.setTintNavigationBar(r6)
            com.mikepenz.materialize.view.a r5 = r8.d
            boolean r6 = r8.p
            if (r6 != 0) goto L_0x0076
            boolean r6 = r8.q
            if (r6 != 0) goto L_0x0076
            r6 = 1
            goto L_0x0077
        L_0x0076:
            r6 = 0
        L_0x0077:
            r5.setSystemUIVisible(r6)
            if (r1 != 0) goto L_0x0082
            android.view.ViewGroup r1 = r8.b
            r1.removeView(r0)
            goto L_0x0087
        L_0x0082:
            android.view.ViewGroup r1 = r8.b
            r1.removeAllViews()
        L_0x0087:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r3, r3)
            com.mikepenz.materialize.view.a r5 = r8.d
            android.view.ViewGroup r5 = r5.getView()
            r5.addView(r0, r1)
            com.mikepenz.materialize.view.a r0 = r8.d
            android.view.ViewGroup r0 = r0.getView()
            r8.c = r0
            android.view.ViewGroup r0 = r8.r
            if (r0 == 0) goto L_0x00b1
            r8.c = r0
            com.mikepenz.materialize.view.a r1 = r8.d
            android.view.ViewGroup r1 = r1.getView()
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r5.<init>(r3, r3)
            r0.addView(r1, r5)
        L_0x00b1:
            android.view.ViewGroup r0 = r8.c
            int r1 = com.mikepenz.materialize.R$id.materialize_root
            r0.setId(r1)
            android.view.ViewGroup$LayoutParams r0 = r8.s
            if (r0 != 0) goto L_0x00c3
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r3, r3)
            r8.s = r0
        L_0x00c3:
            android.view.ViewGroup r0 = r8.b
            android.view.ViewGroup r1 = r8.c
            goto L_0x00f8
        L_0x00c8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "You have to set your layout for this activity with setContentView() first. Or you build the drawer on your own with .buildView()"
            r0.<init>(r1)
            throw r0
        L_0x00d0:
            android.view.ViewGroup r0 = r8.r
            if (r0 == 0) goto L_0x01b3
            android.view.ViewGroup r0 = r8.b
            android.view.View r0 = r0.getChildAt(r4)
            android.view.ViewGroup r1 = r8.b
            r1.removeView(r0)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r3, r3)
            android.view.ViewGroup r5 = r8.r
            r5.addView(r0, r1)
            android.view.ViewGroup$LayoutParams r0 = r8.s
            if (r0 != 0) goto L_0x00f4
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r3, r3)
            r8.s = r0
        L_0x00f4:
            android.view.ViewGroup r0 = r8.b
            android.view.ViewGroup r1 = r8.r
        L_0x00f8:
            android.view.ViewGroup$LayoutParams r3 = r8.s
            r0.addView(r1, r3)
            boolean r0 = r8.q
            if (r0 == 0) goto L_0x0116
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0116
            android.app.Activity r0 = r8.a
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 5894(0x1706, float:8.259E-42)
            r0.setSystemUiVisibility(r1)
        L_0x0116:
            boolean r0 = r8.i
            r1 = 21
            if (r0 == 0) goto L_0x0125
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x0125
            android.app.Activity r0 = r8.a
            defpackage.to1.r(r0, r4)
        L_0x0125:
            boolean r0 = r8.l
            if (r0 == 0) goto L_0x0132
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x0132
            android.app.Activity r0 = r8.a
            defpackage.to1.q(r0, r2)
        L_0x0132:
            boolean r0 = r8.h
            if (r0 != 0) goto L_0x013a
            boolean r0 = r8.m
            if (r0 == 0) goto L_0x0149
        L_0x013a:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x0149
            android.app.Activity r0 = r8.a
            android.view.Window r0 = r0.getWindow()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r3)
        L_0x0149:
            boolean r0 = r8.h
            if (r0 == 0) goto L_0x015f
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x015f
            android.app.Activity r0 = r8.a
            defpackage.to1.r(r0, r4)
            android.app.Activity r0 = r8.a
            android.view.Window r0 = r0.getWindow()
            r0.setStatusBarColor(r4)
        L_0x015f:
            boolean r0 = r8.m
            if (r0 == 0) goto L_0x0175
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x0175
            android.app.Activity r0 = r8.a
            defpackage.to1.q(r0, r2)
            android.app.Activity r0 = r8.a
            android.view.Window r0 = r0.getWindow()
            r0.setNavigationBarColor(r4)
        L_0x0175:
            boolean r0 = r8.j
            if (r0 == 0) goto L_0x0184
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r1) goto L_0x0184
            android.app.Activity r0 = r8.a
            int r0 = defpackage.to1.i(r0)
            goto L_0x0185
        L_0x0184:
            r0 = 0
        L_0x0185:
            boolean r2 = r8.n
            if (r2 == 0) goto L_0x0194
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r1) goto L_0x0194
            android.app.Activity r2 = r8.a
            int r2 = defpackage.to1.d(r2)
            goto L_0x0195
        L_0x0194:
            r2 = 0
        L_0x0195:
            boolean r3 = r8.j
            if (r3 != 0) goto L_0x01a1
            boolean r3 = r8.n
            if (r3 == 0) goto L_0x01aa
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L_0x01aa
        L_0x01a1:
            com.mikepenz.materialize.view.a r1 = r8.d
            android.view.ViewGroup r1 = r1.getView()
            r1.setPadding(r4, r0, r4, r2)
        L_0x01aa:
            r0 = 0
            r8.a = r0
            com.mikepenz.materialize.a r0 = new com.mikepenz.materialize.a
            r0.<init>(r8)
            return r0
        L_0x01b3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "please pass a container"
            r0.<init>(r1)
            throw r0
        L_0x01bb:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "please pass an activity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikepenz.materialize.b.a():com.mikepenz.materialize.a");
    }

    public b b(Activity activity) {
        this.b = (ViewGroup) activity.findViewById(16908290);
        this.a = activity;
        return this;
    }

    public b c(ViewGroup viewGroup) {
        this.r = viewGroup;
        return this;
    }

    public b d(boolean z) {
        this.p = z;
        if (z) {
            i(true);
            h(false);
            g(false);
        }
        return this;
    }

    public b e(ViewGroup viewGroup) {
        this.b = viewGroup;
        return this;
    }

    public b f(boolean z) {
        this.q = z;
        if (z) {
            d(z);
        }
        return this;
    }

    public b g(boolean z) {
        this.o = z;
        if (z) {
            i(true);
        }
        return this;
    }

    public b h(boolean z) {
        this.k = z;
        return this;
    }

    public b i(boolean z) {
        this.l = z;
        return this;
    }

    public b j(boolean z) {
        this.h = z;
        return this;
    }

    public b k(boolean z) {
        this.e = z;
        return this;
    }
}
