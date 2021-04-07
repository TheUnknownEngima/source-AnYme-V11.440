package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

class m extends BaseAdapter {
    static final int i = s.l().getMaximum(4);
    final l e;
    final d<?> f;
    c g;
    final a h;

    m(l lVar, d<?> dVar, a aVar) {
        this.e = lVar;
        this.f = dVar;
        this.h = aVar;
    }

    private void e(Context context) {
        if (this.g == null) {
            this.g = new c(context);
        }
    }

    /* access modifiers changed from: package-private */
    public int a(int i2) {
        return b() + (i2 - 1);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.e.i();
    }

    /* renamed from: c */
    public Long getItem(int i2) {
        if (i2 < this.e.i() || i2 > h()) {
            return null;
        }
        return Long.valueOf(this.e.k(i(i2)));
    }

    /* JADX WARNING: type inference failed for: r7v20, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R$layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L_0x005e
            com.google.android.material.datepicker.l r2 = r5.e
            int r3 = r2.j
            if (r7 < r3) goto L_0x002e
            goto L_0x005e
        L_0x002e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.l r2 = r5.e
            long r2 = r2.k(r7)
            com.google.android.material.datepicker.l r7 = r5.e
            int r7 = r7.h
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.h()
            int r4 = r4.h
            if (r7 != r4) goto L_0x0050
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r2)
            goto L_0x0054
        L_0x0050:
            java.lang.String r7 = com.google.android.material.datepicker.e.c(r2)
        L_0x0054:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L_0x0066
        L_0x005e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x0066:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x006d
            return r0
        L_0x006d:
            com.google.android.material.datepicker.a r7 = r5.h
            com.google.android.material.datepicker.a$c r7 = r7.f()
            long r2 = r6.longValue()
            boolean r7 = r7.g0(r2)
            if (r7 == 0) goto L_0x00cc
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f
            java.util.Collection r7 = r7.p0()
            java.util.Iterator r7 = r7.iterator()
        L_0x008a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.s.a(r3)
            long r1 = com.google.android.material.datepicker.s.a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L_0x008a
            com.google.android.material.datepicker.c r6 = r5.g
            com.google.android.material.datepicker.b r6 = r6.b
        L_0x00ae:
            r6.d(r0)
            return r0
        L_0x00b2:
            java.util.Calendar r7 = com.google.android.material.datepicker.s.j()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x00c7
            com.google.android.material.datepicker.c r6 = r5.g
            com.google.android.material.datepicker.b r6 = r6.c
            goto L_0x00ae
        L_0x00c7:
            com.google.android.material.datepicker.c r6 = r5.g
            com.google.android.material.datepicker.b r6 = r6.a
            goto L_0x00ae
        L_0x00cc:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.g
            com.google.android.material.datepicker.b r6 = r6.g
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    public boolean f(int i2) {
        return i2 % this.e.i == 0;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i2) {
        return (i2 + 1) % this.e.i == 0;
    }

    public int getCount() {
        return this.e.j + b();
    }

    public long getItemId(int i2) {
        return (long) (i2 / this.e.i);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return (this.e.i() + this.e.j) - 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int i(int i2) {
        return (i2 - this.e.i()) + 1;
    }

    /* access modifiers changed from: package-private */
    public boolean j(int i2) {
        return i2 >= b() && i2 <= h();
    }
}
