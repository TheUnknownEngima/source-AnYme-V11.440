package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

final class ma extends u9 {
    private String d;
    private Set<Integer> e;
    private Map<Integer, oa> f;
    private Long g;
    private Long h;

    ma(x9 x9Var) {
        super(x9Var);
    }

    private final oa u(int i) {
        if (this.f.containsKey(Integer.valueOf(i))) {
            return this.f.get(Integer.valueOf(i));
        }
        oa oaVar = new oa(this, this.d, (pa) null);
        this.f.put(Integer.valueOf(i), oaVar);
        return oaVar;
    }

    private final boolean w(int i, int i2) {
        if (this.f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return this.f.get(Integer.valueOf(i)).d.get(i2);
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0624, code lost:
        if (r8.C() == false) goto L_0x062f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0626, code lost:
        r8 = java.lang.Integer.valueOf(r8.D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x062f, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0630, code lost:
        r7.c("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
        r8 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x02cc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<defpackage.os0> v(java.lang.String r47, java.util.List<defpackage.qs0> r48, java.util.List<defpackage.ys0> r49, java.lang.Long r50, java.lang.Long r51) {
        /*
            r46 = this;
            r10 = r46
            com.google.android.gms.common.internal.r.f(r47)
            com.google.android.gms.common.internal.r.j(r48)
            com.google.android.gms.common.internal.r.j(r49)
            r0 = r47
            r10.d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.e = r0
            b0 r0 = new b0
            r0.<init>()
            r10.f = r0
            r0 = r50
            r10.g = r0
            r0 = r51
            r10.h = r0
            java.util.Iterator r0 = r48.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            r11 = 0
            r12 = 1
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r0.next()
            qs0 r1 = (defpackage.qs0) r1
            java.lang.String r1 = r1.U()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            boolean r0 = defpackage.t31.a()
            if (r0 == 0) goto L_0x005c
            com.google.android.gms.measurement.internal.wa r0 = r46.j()
            java.lang.String r2 = r10.d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.d0
            boolean r0 = r0.z(r2, r3)
            if (r0 == 0) goto L_0x005c
            r13 = 1
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            boolean r0 = defpackage.t31.a()
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.wa r0 = r46.j()
            java.lang.String r2 = r10.d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.c0
            boolean r0 = r0.z(r2, r3)
            if (r0 == 0) goto L_0x0073
            r14 = 1
            goto L_0x0074
        L_0x0073:
            r14 = 0
        L_0x0074:
            if (r1 == 0) goto L_0x00b5
            com.google.android.gms.measurement.internal.d r2 = r46.m()
            java.lang.String r3 = r10.d
            r2.r()
            r2.b()
            com.google.android.gms.common.internal.r.f(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.v()     // Catch:{ SQLiteException -> 0x00a3 }
            java.lang.String r5 = "events"
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r7 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x00a3 }
            r7[r11] = r3     // Catch:{ SQLiteException -> 0x00a3 }
            r4.update(r5, r0, r6, r7)     // Catch:{ SQLiteException -> 0x00a3 }
            goto L_0x00b5
        L_0x00a3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r2 = r2.h()
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.c4.w(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.c(r4, r3, r0)
        L_0x00b5:
            java.util.Map r0 = java.util.Collections.emptyMap()
            if (r14 == 0) goto L_0x00c7
            if (r13 == 0) goto L_0x00c7
            com.google.android.gms.measurement.internal.d r0 = r46.m()
            java.lang.String r2 = r10.d
            java.util.Map r0 = r0.s0(r2)
        L_0x00c7:
            com.google.android.gms.measurement.internal.d r2 = r46.m()
            java.lang.String r3 = r10.d
            java.util.Map r15 = r2.w0(r3)
            boolean r2 = defpackage.z31.a()
            if (r2 == 0) goto L_0x00e5
            com.google.android.gms.measurement.internal.wa r2 = r46.j()
            java.lang.String r3 = r10.d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.u.N0
            boolean r2 = r2.z(r3, r4)
            if (r2 != 0) goto L_0x00e7
        L_0x00e5:
            if (r15 == 0) goto L_0x0367
        L_0x00e7:
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x00ef
            goto L_0x0367
        L_0x00ef:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r3 = r15.keySet()
            r2.<init>(r3)
            if (r1 == 0) goto L_0x01d2
            java.lang.String r1 = r10.d
            com.google.android.gms.common.internal.r.f(r1)
            com.google.android.gms.common.internal.r.j(r15)
            b0 r3 = new b0
            r3.<init>()
            boolean r4 = r15.isEmpty()
            if (r4 != 0) goto L_0x01d0
            com.google.android.gms.measurement.internal.d r4 = r46.m()
            java.util.Map r1 = r4.u0(r1)
            java.util.Set r4 = r15.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x011d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01d0
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r15.get(r6)
            ws0 r6 = (defpackage.ws0) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r1.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x01c6
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x014b
            goto L_0x01c6
        L_0x014b:
            com.google.android.gms.measurement.internal.ba r8 = r46.k()
            java.util.List r9 = r6.O()
            java.util.List r8 = r8.F(r9, r7)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x011d
            sy0$b r9 = r6.w()
            ws0$a r9 = (defpackage.ws0.a) r9
            r9.A()
            r9.C(r8)
            com.google.android.gms.measurement.internal.ba r8 = r46.k()
            java.util.List r11 = r6.B()
            java.util.List r8 = r8.F(r11, r7)
            r9.w()
            r9.y(r8)
            r8 = 0
        L_0x017c:
            int r11 = r6.X()
            if (r8 >= r11) goto L_0x019a
            ps0 r11 = r6.A(r8)
            int r11 = r11.G()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x0197
            r9.x(r8)
        L_0x0197:
            int r8 = r8 + 1
            goto L_0x017c
        L_0x019a:
            r8 = 0
        L_0x019b:
            int r11 = r6.Z()
            if (r8 >= r11) goto L_0x01b9
            xs0 r11 = r6.I(r8)
            int r11 = r11.G()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x01b6
            r9.B(r8)
        L_0x01b6:
            int r8 = r8 + 1
            goto L_0x019b
        L_0x01b9:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            f01 r6 = r9.k()
            sy0 r6 = (defpackage.sy0) r6
            ws0 r6 = (defpackage.ws0) r6
            goto L_0x01ca
        L_0x01c6:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x01ca:
            r3.put(r5, r6)
            r11 = 0
            goto L_0x011d
        L_0x01d0:
            r11 = r3
            goto L_0x01d3
        L_0x01d2:
            r11 = r15
        L_0x01d3:
            java.util.Iterator r16 = r2.iterator()
        L_0x01d7:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0367
            java.lang.Object r1 = r16.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r17 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r11.get(r1)
            ws0 r1 = (defpackage.ws0) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            b0 r7 = new b0
            r7.<init>()
            if (r1 == 0) goto L_0x023f
            int r2 = r1.X()
            if (r2 != 0) goto L_0x0209
            goto L_0x023f
        L_0x0209:
            java.util.List r2 = r1.V()
            java.util.Iterator r2 = r2.iterator()
        L_0x0211:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x023f
            java.lang.Object r3 = r2.next()
            ps0 r3 = (defpackage.ps0) r3
            boolean r4 = r3.F()
            if (r4 == 0) goto L_0x0211
            int r4 = r3.G()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.H()
            if (r8 == 0) goto L_0x023a
            long r8 = r3.I()
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x023b
        L_0x023a:
            r3 = 0
        L_0x023b:
            r7.put(r4, r3)
            goto L_0x0211
        L_0x023f:
            b0 r8 = new b0
            r8.<init>()
            if (r1 == 0) goto L_0x0286
            int r2 = r1.Z()
            if (r2 != 0) goto L_0x024d
            goto L_0x0286
        L_0x024d:
            java.util.List r2 = r1.Y()
            java.util.Iterator r2 = r2.iterator()
        L_0x0255:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0286
            java.lang.Object r3 = r2.next()
            xs0 r3 = (defpackage.xs0) r3
            boolean r4 = r3.F()
            if (r4 == 0) goto L_0x0255
            int r4 = r3.K()
            if (r4 <= 0) goto L_0x0255
            int r4 = r3.G()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r9 = r3.K()
            int r9 = r9 - r12
            long r18 = r3.A(r9)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r4, r3)
            goto L_0x0255
        L_0x0286:
            if (r1 == 0) goto L_0x02d0
            r2 = 0
        L_0x0289:
            int r3 = r1.H()
            int r3 = r3 << 6
            if (r2 >= r3) goto L_0x02d0
            java.util.List r3 = r1.B()
            boolean r3 = com.google.android.gms.measurement.internal.ba.T(r3, r2)
            if (r3 == 0) goto L_0x02c2
            com.google.android.gms.measurement.internal.c4 r3 = r46.h()
            com.google.android.gms.measurement.internal.e4 r3 = r3.M()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.String r12 = "Filter already evaluated. audience ID, filter ID"
            r3.c(r12, r4, r9)
            r6.set(r2)
            java.util.List r3 = r1.O()
            boolean r3 = com.google.android.gms.measurement.internal.ba.T(r3, r2)
            if (r3 == 0) goto L_0x02c2
            r5.set(r2)
            r3 = 1
            goto L_0x02c3
        L_0x02c2:
            r3 = 0
        L_0x02c3:
            if (r3 != 0) goto L_0x02cc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.remove(r3)
        L_0x02cc:
            int r2 = r2 + 1
            r12 = 1
            goto L_0x0289
        L_0x02d0:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r15.get(r1)
            r4 = r1
            ws0 r4 = (defpackage.ws0) r4
            if (r14 == 0) goto L_0x034b
            if (r13 == 0) goto L_0x034b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x034b
            java.lang.Long r2 = r10.h
            if (r2 == 0) goto L_0x034b
            java.lang.Long r2 = r10.g
            if (r2 != 0) goto L_0x02f4
            goto L_0x034b
        L_0x02f4:
            java.util.Iterator r1 = r1.iterator()
        L_0x02f8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x034b
            java.lang.Object r2 = r1.next()
            zr0 r2 = (defpackage.zr0) r2
            int r3 = r2.H()
            java.lang.Long r9 = r10.h
            long r18 = r9.longValue()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r20
            boolean r2 = r2.P()
            if (r2 == 0) goto L_0x0320
            java.lang.Long r2 = r10.g
            long r18 = r2.longValue()
            long r18 = r18 / r20
        L_0x0320:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x0335
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r9 = java.lang.Long.valueOf(r18)
            r7.put(r2, r9)
        L_0x0335:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L_0x02f8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r2, r3)
            goto L_0x02f8
        L_0x034b:
            com.google.android.gms.measurement.internal.oa r12 = new com.google.android.gms.measurement.internal.oa
            java.lang.String r3 = r10.d
            r9 = 0
            r1 = r12
            r2 = r46
            r18 = r11
            r11 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.oa> r1 = r10.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            r1.put(r2, r12)
            r11 = r18
            r12 = 1
            goto L_0x01d7
        L_0x0367:
            r11 = 0
            boolean r0 = r48.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 != 0) goto L_0x04ec
            com.google.android.gms.measurement.internal.ra r0 = new com.google.android.gms.measurement.internal.ra
            r0.<init>(r10, r11)
            b0 r2 = new b0
            r2.<init>()
            java.util.Iterator r3 = r48.iterator()
        L_0x037e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04ec
            java.lang.Object r4 = r3.next()
            qs0 r4 = (defpackage.qs0) r4
            java.lang.String r5 = r10.d
            qs0 r5 = r0.a(r5, r4)
            if (r5 == 0) goto L_0x037e
            com.google.android.gms.measurement.internal.d r6 = r46.m()
            java.lang.String r13 = r10.d
            java.lang.String r7 = r5.U()
            java.lang.String r8 = r4.U()
            com.google.android.gms.measurement.internal.o r8 = r6.D(r13, r8)
            if (r8 != 0) goto L_0x03de
            com.google.android.gms.measurement.internal.c4 r8 = r6.h()
            com.google.android.gms.measurement.internal.e4 r8 = r8.H()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r13)
            com.google.android.gms.measurement.internal.a4 r6 = r6.d()
            java.lang.String r6 = r6.v(r7)
            java.lang.String r7 = "Event aggregate wasn't created during raw event logging. appId, event"
            r8.c(r7, r9, r6)
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o
            r12 = r6
            java.lang.String r14 = r4.U()
            r15 = 1
            r17 = 1
            r19 = 1
            long r21 = r4.W()
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r12.<init>(r13, r14, r15, r17, r19, r21, r23, r25, r26, r27, r28)
            goto L_0x0413
        L_0x03de:
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o
            r29 = r6
            java.lang.String r4 = r8.a
            r30 = r4
            java.lang.String r4 = r8.b
            r31 = r4
            long r12 = r8.c
            r14 = 1
            long r32 = r12 + r14
            long r12 = r8.d
            long r34 = r12 + r14
            long r12 = r8.e
            long r36 = r12 + r14
            long r12 = r8.f
            r38 = r12
            long r12 = r8.g
            r40 = r12
            java.lang.Long r4 = r8.h
            r42 = r4
            java.lang.Long r4 = r8.i
            r43 = r4
            java.lang.Long r4 = r8.j
            r44 = r4
            java.lang.Boolean r4 = r8.k
            r45 = r4
            r29.<init>(r30, r31, r32, r34, r36, r38, r40, r42, r43, r44, r45)
        L_0x0413:
            com.google.android.gms.measurement.internal.d r4 = r46.m()
            r4.N(r6)
            long r7 = r6.c
            java.lang.String r4 = r5.U()
            java.lang.Object r9 = r2.get(r4)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x0450
            com.google.android.gms.measurement.internal.d r9 = r46.m()
            java.lang.String r12 = r10.d
            java.util.Map r9 = r9.v0(r12, r4)
            boolean r12 = defpackage.z31.a()
            if (r12 == 0) goto L_0x0446
            com.google.android.gms.measurement.internal.wa r12 = r46.j()
            java.lang.String r13 = r10.d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.u.N0
            boolean r12 = r12.z(r13, r14)
            if (r12 != 0) goto L_0x044d
        L_0x0446:
            if (r9 != 0) goto L_0x044d
            b0 r9 = new b0
            r9.<init>()
        L_0x044d:
            r2.put(r4, r9)
        L_0x0450:
            java.util.Set r4 = r9.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0458:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x037e
            java.lang.Object r12 = r4.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r15 = r12.intValue()
            java.util.Set<java.lang.Integer> r12 = r10.e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            boolean r12 = r12.contains(r13)
            if (r12 == 0) goto L_0x0484
            com.google.android.gms.measurement.internal.c4 r12 = r46.h()
            com.google.android.gms.measurement.internal.e4 r12 = r12.M()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
            r12.b(r1, r13)
            goto L_0x0458
        L_0x0484:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            java.lang.Object r12 = r9.get(r12)
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r20 = r12.iterator()
            r12 = 1
        L_0x0493:
            boolean r13 = r20.hasNext()
            if (r13 == 0) goto L_0x04d9
            java.lang.Object r12 = r20.next()
            zr0 r12 = (defpackage.zr0) r12
            com.google.android.gms.measurement.internal.qa r14 = new com.google.android.gms.measurement.internal.qa
            java.lang.String r13 = r10.d
            r14.<init>(r10, r13, r15, r12)
            java.lang.Long r13 = r10.g
            java.lang.Long r11 = r10.h
            int r12 = r12.H()
            boolean r19 = r10.w(r15, r12)
            r12 = r14
            r21 = r0
            r0 = r14
            r14 = r11
            r11 = r15
            r15 = r5
            r16 = r7
            r18 = r6
            boolean r12 = r12.k(r13, r14, r15, r16, r18, r19)
            if (r12 == 0) goto L_0x04cf
            com.google.android.gms.measurement.internal.oa r13 = r10.u(r11)
            r13.c(r0)
            r15 = r11
            r0 = r21
            r11 = 0
            goto L_0x0493
        L_0x04cf:
            java.util.Set<java.lang.Integer> r0 = r10.e
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r0.add(r13)
            goto L_0x04dc
        L_0x04d9:
            r21 = r0
            r11 = r15
        L_0x04dc:
            if (r12 != 0) goto L_0x04e7
            java.util.Set<java.lang.Integer> r0 = r10.e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0.add(r11)
        L_0x04e7:
            r0 = r21
            r11 = 0
            goto L_0x0458
        L_0x04ec:
            boolean r0 = r49.isEmpty()
            if (r0 != 0) goto L_0x0647
            b0 r0 = new b0
            r0.<init>()
            java.util.Iterator r2 = r49.iterator()
        L_0x04fb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0647
            java.lang.Object r3 = r2.next()
            ys0 r3 = (defpackage.ys0) r3
            java.lang.String r4 = r3.Q()
            java.lang.Object r5 = r0.get(r4)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x053b
            com.google.android.gms.measurement.internal.d r5 = r46.m()
            java.lang.String r6 = r10.d
            java.util.Map r5 = r5.x0(r6, r4)
            boolean r6 = defpackage.z31.a()
            if (r6 == 0) goto L_0x0531
            com.google.android.gms.measurement.internal.wa r6 = r46.j()
            java.lang.String r7 = r10.d
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r8 = com.google.android.gms.measurement.internal.u.N0
            boolean r6 = r6.z(r7, r8)
            if (r6 != 0) goto L_0x0538
        L_0x0531:
            if (r5 != 0) goto L_0x0538
            b0 r5 = new b0
            r5.<init>()
        L_0x0538:
            r0.put(r4, r5)
        L_0x053b:
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0543:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04fb
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Set<java.lang.Integer> r7 = r10.e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.contains(r8)
            if (r7 == 0) goto L_0x056f
            com.google.android.gms.measurement.internal.c4 r3 = r46.h()
            com.google.android.gms.measurement.internal.e4 r3 = r3.M()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.b(r1, r4)
            goto L_0x04fb
        L_0x056f:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r5.get(r7)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 1
        L_0x057e:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x063a
            java.lang.Object r8 = r7.next()
            cs0 r8 = (defpackage.cs0) r8
            com.google.android.gms.measurement.internal.c4 r9 = r46.h()
            r11 = 2
            boolean r9 = r9.B(r11)
            if (r9 == 0) goto L_0x05d7
            com.google.android.gms.measurement.internal.c4 r9 = r46.h()
            com.google.android.gms.measurement.internal.e4 r9 = r9.M()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r12 = r8.C()
            if (r12 == 0) goto L_0x05b0
            int r12 = r8.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x05b1
        L_0x05b0:
            r12 = 0
        L_0x05b1:
            com.google.android.gms.measurement.internal.a4 r13 = r46.d()
            java.lang.String r14 = r8.F()
            java.lang.String r13 = r13.z(r14)
            java.lang.String r14 = "Evaluating filter. audience, filter, property"
            r9.d(r14, r11, r12, r13)
            com.google.android.gms.measurement.internal.c4 r9 = r46.h()
            com.google.android.gms.measurement.internal.e4 r9 = r9.M()
            com.google.android.gms.measurement.internal.ba r11 = r46.k()
            java.lang.String r11 = r11.B(r8)
            java.lang.String r12 = "Filter definition"
            r9.b(r12, r11)
        L_0x05d7:
            boolean r9 = r8.C()
            if (r9 == 0) goto L_0x0612
            int r9 = r8.D()
            r11 = 256(0x100, float:3.59E-43)
            if (r9 <= r11) goto L_0x05e6
            goto L_0x0612
        L_0x05e6:
            com.google.android.gms.measurement.internal.sa r9 = new com.google.android.gms.measurement.internal.sa
            java.lang.String r11 = r10.d
            r9.<init>(r10, r11, r6, r8)
            java.lang.Long r11 = r10.g
            java.lang.Long r12 = r10.h
            int r8 = r8.D()
            boolean r8 = r10.w(r6, r8)
            boolean r8 = r9.k(r11, r12, r3, r8)
            if (r8 == 0) goto L_0x0608
            com.google.android.gms.measurement.internal.oa r11 = r10.u(r6)
            r11.c(r9)
            goto L_0x057e
        L_0x0608:
            java.util.Set<java.lang.Integer> r7 = r10.e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.add(r9)
            goto L_0x063a
        L_0x0612:
            com.google.android.gms.measurement.internal.c4 r7 = r46.h()
            com.google.android.gms.measurement.internal.e4 r7 = r7.H()
            java.lang.String r9 = r10.d
            java.lang.Object r9 = com.google.android.gms.measurement.internal.c4.w(r9)
            boolean r11 = r8.C()
            if (r11 == 0) goto L_0x062f
            int r8 = r8.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0630
        L_0x062f:
            r8 = 0
        L_0x0630:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r7.c(r11, r9, r8)
            r8 = 0
        L_0x063a:
            if (r8 != 0) goto L_0x0543
            java.util.Set<java.lang.Integer> r7 = r10.e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.add(r6)
            goto L_0x0543
        L_0x0647:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.oa> r0 = r10.f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r10.e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x065b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06eb
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.oa> r3 = r10.f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.oa r3 = (com.google.android.gms.measurement.internal.oa) r3
            os0 r3 = r3.a(r0)
            r1.add(r3)
            com.google.android.gms.measurement.internal.d r4 = r46.m()
            java.lang.String r5 = r10.d
            ws0 r3 = r3.M()
            r4.r()
            r4.b()
            com.google.android.gms.common.internal.r.f(r5)
            com.google.android.gms.common.internal.r.j(r3)
            byte[] r3 = r3.h()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "audience_id"
            r6.put(r7, r0)
            java.lang.String r0 = "current_results"
            r6.put(r0, r3)
            android.database.sqlite.SQLiteDatabase r0 = r4.v()     // Catch:{ SQLiteException -> 0x06d6 }
            java.lang.String r3 = "audience_filter_values"
            r7 = 5
            r8 = 0
            long r6 = r0.insertWithOnConflict(r3, r8, r6, r7)     // Catch:{ SQLiteException -> 0x06d4 }
            r11 = -1
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x065b
            com.google.android.gms.measurement.internal.c4 r0 = r4.h()     // Catch:{ SQLiteException -> 0x06d4 }
            com.google.android.gms.measurement.internal.e4 r0 = r0.E()     // Catch:{ SQLiteException -> 0x06d4 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.c4.w(r5)     // Catch:{ SQLiteException -> 0x06d4 }
            r0.b(r3, r6)     // Catch:{ SQLiteException -> 0x06d4 }
            goto L_0x065b
        L_0x06d4:
            r0 = move-exception
            goto L_0x06d8
        L_0x06d6:
            r0 = move-exception
            r8 = 0
        L_0x06d8:
            com.google.android.gms.measurement.internal.c4 r3 = r4.h()
            com.google.android.gms.measurement.internal.e4 r3 = r3.E()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.c4.w(r5)
            java.lang.String r5 = "Error storing filter results. appId"
            r3.c(r5, r4, r0)
            goto L_0x065b
        L_0x06eb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ma.v(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
