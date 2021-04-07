package com.google.android.gms.measurement.internal;

final class sa extends ta {
    private cs0 g;
    private final /* synthetic */ ma h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    sa(ma maVar, String str, int i, cs0 cs0) {
        super(str, i);
        this.h = maVar;
        this.g = cs0;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.g.D();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r11, java.lang.Long r12, defpackage.ys0 r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = defpackage.t31.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.ma r0 = r10.h
            com.google.android.gms.measurement.internal.wa r0 = r0.j()
            java.lang.String r3 = r10.a
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.u.b0
            boolean r0 = r0.z(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            cs0 r3 = r10.g
            boolean r3 = r3.H()
            cs0 r4 = r10.g
            boolean r4 = r4.I()
            cs0 r5 = r10.g
            boolean r5 = r5.L()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = 0
            goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.ma r11 = r10.h
            com.google.android.gms.measurement.internal.c4 r11 = r11.h()
            com.google.android.gms.measurement.internal.e4 r11 = r11.M()
            int r12 = r10.b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            cs0 r13 = r10.g
            boolean r13 = r13.C()
            if (r13 == 0) goto L_0x005e
            cs0 r13 = r10.g
            int r13 = r13.D()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.c(r13, r12, r4)
            return r2
        L_0x0064:
            cs0 r6 = r10.g
            as0 r6 = r6.G()
            boolean r7 = r6.I()
            boolean r8 = r13.U()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.F()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.ma r6 = r10.h
            com.google.android.gms.measurement.internal.c4 r6 = r6.h()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.h
            com.google.android.gms.measurement.internal.a4 r7 = r7.d()
            java.lang.String r8 = r13.Q()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = "No number filter for long property. property"
        L_0x0094:
            r6.b(r8, r7)
            goto L_0x0175
        L_0x0099:
            long r8 = r13.V()
            bs0 r4 = r6.G()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.c(r8, r4)
        L_0x00a5:
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.d(r4, r7)
            goto L_0x0175
        L_0x00ab:
            boolean r8 = r13.W()
            if (r8 == 0) goto L_0x00df
            boolean r8 = r6.F()
            if (r8 != 0) goto L_0x00d2
            com.google.android.gms.measurement.internal.ma r6 = r10.h
            com.google.android.gms.measurement.internal.c4 r6 = r6.h()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.h
            com.google.android.gms.measurement.internal.a4 r7 = r7.d()
            java.lang.String r8 = r13.Q()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L_0x0094
        L_0x00d2:
            double r8 = r13.X()
            bs0 r4 = r6.G()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.b(r8, r4)
            goto L_0x00a5
        L_0x00df:
            boolean r8 = r13.S()
            if (r8 == 0) goto L_0x0159
            boolean r8 = r6.C()
            if (r8 != 0) goto L_0x0145
            boolean r8 = r6.F()
            if (r8 != 0) goto L_0x010c
            com.google.android.gms.measurement.internal.ma r6 = r10.h
            com.google.android.gms.measurement.internal.c4 r6 = r6.h()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.h
            com.google.android.gms.measurement.internal.a4 r7 = r7.d()
            java.lang.String r8 = r13.Q()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L_0x0094
        L_0x010c:
            java.lang.String r8 = r13.T()
            boolean r8 = com.google.android.gms.measurement.internal.ba.S(r8)
            if (r8 == 0) goto L_0x0123
            java.lang.String r4 = r13.T()
            bs0 r6 = r6.G()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.e(r4, r6)
            goto L_0x00a5
        L_0x0123:
            com.google.android.gms.measurement.internal.ma r6 = r10.h
            com.google.android.gms.measurement.internal.c4 r6 = r6.h()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.h
            com.google.android.gms.measurement.internal.a4 r7 = r7.d()
            java.lang.String r8 = r13.Q()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = r13.T()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x0175
        L_0x0145:
            java.lang.String r4 = r13.T()
            ds0 r6 = r6.D()
            com.google.android.gms.measurement.internal.ma r8 = r10.h
            com.google.android.gms.measurement.internal.c4 r8 = r8.h()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.ta.g(r4, r6, r8)
            goto L_0x00a5
        L_0x0159:
            com.google.android.gms.measurement.internal.ma r6 = r10.h
            com.google.android.gms.measurement.internal.c4 r6 = r6.h()
            com.google.android.gms.measurement.internal.e4 r6 = r6.H()
            com.google.android.gms.measurement.internal.ma r7 = r10.h
            com.google.android.gms.measurement.internal.a4 r7 = r7.d()
            java.lang.String r8 = r13.Q()
            java.lang.String r7 = r7.z(r8)
            java.lang.String r8 = "User property has no value, property"
            goto L_0x0094
        L_0x0175:
            com.google.android.gms.measurement.internal.ma r6 = r10.h
            com.google.android.gms.measurement.internal.c4 r6 = r6.h()
            com.google.android.gms.measurement.internal.e4 r6 = r6.M()
            if (r4 != 0) goto L_0x0184
            java.lang.String r7 = "null"
            goto L_0x0185
        L_0x0184:
            r7 = r4
        L_0x0185:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r4 != 0) goto L_0x018d
            return r1
        L_0x018d:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.c = r1
            if (r5 == 0) goto L_0x019a
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x019a
            return r2
        L_0x019a:
            if (r14 == 0) goto L_0x01a4
            cs0 r14 = r10.g
            boolean r14 = r14.H()
            if (r14 == 0) goto L_0x01a6
        L_0x01a4:
            r10.d = r4
        L_0x01a6:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01eb
            if (r3 == 0) goto L_0x01eb
            boolean r14 = r13.I()
            if (r14 == 0) goto L_0x01eb
            long r13 = r13.K()
            if (r11 == 0) goto L_0x01be
            long r13 = r11.longValue()
        L_0x01be:
            if (r0 == 0) goto L_0x01d6
            cs0 r11 = r10.g
            boolean r11 = r11.H()
            if (r11 == 0) goto L_0x01d6
            cs0 r11 = r10.g
            boolean r11 = r11.I()
            if (r11 != 0) goto L_0x01d6
            if (r12 == 0) goto L_0x01d6
            long r13 = r12.longValue()
        L_0x01d6:
            cs0 r11 = r10.g
            boolean r11 = r11.I()
            if (r11 == 0) goto L_0x01e5
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f = r11
            goto L_0x01eb
        L_0x01e5:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.e = r11
        L_0x01eb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.sa.k(java.lang.Long, java.lang.Long, ys0, boolean):boolean");
    }
}
