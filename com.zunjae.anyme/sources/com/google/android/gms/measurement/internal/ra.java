package com.google.android.gms.measurement.internal;

final class ra {
    private qs0 a;
    private Long b;
    private long c;
    private final /* synthetic */ ma d;

    private ra(ma maVar) {
        this.d = maVar;
    }

    /* synthetic */ ra(ma maVar, pa paVar) {
        this(maVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.qs0 a(java.lang.String r18, defpackage.qs0 r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r8 = r19
            java.lang.String r9 = r19.U()
            java.util.List r10 = r19.B()
            com.google.android.gms.measurement.internal.ma r2 = r1.d
            com.google.android.gms.measurement.internal.ba r2 = r2.k()
            java.lang.String r3 = "_eid"
            java.lang.Object r2 = r2.U(r8, r3)
            r4 = r2
            java.lang.Long r4 = (java.lang.Long) r4
            r2 = 1
            r5 = 0
            if (r4 == 0) goto L_0x0023
            r6 = 1
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            if (r6 == 0) goto L_0x0030
            java.lang.String r7 = "_ep"
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0030
            r7 = 1
            goto L_0x0031
        L_0x0030:
            r7 = 0
        L_0x0031:
            r11 = 0
            if (r7 == 0) goto L_0x0147
            com.google.android.gms.measurement.internal.ma r6 = r1.d
            com.google.android.gms.measurement.internal.ba r6 = r6.k()
            java.lang.String r7 = "_en"
            java.lang.Object r6 = r6.U(r8, r7)
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r6 == 0) goto L_0x005b
            com.google.android.gms.measurement.internal.ma r0 = r1.d
            com.google.android.gms.measurement.internal.c4 r0 = r0.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.F()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.b(r2, r4)
            return r7
        L_0x005b:
            qs0 r6 = r1.a
            if (r6 == 0) goto L_0x0071
            java.lang.Long r6 = r1.b
            if (r6 == 0) goto L_0x0071
            long r13 = r4.longValue()
            java.lang.Long r6 = r1.b
            long r15 = r6.longValue()
            int r6 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x00a1
        L_0x0071:
            com.google.android.gms.measurement.internal.ma r6 = r1.d
            com.google.android.gms.measurement.internal.d r6 = r6.m()
            android.util.Pair r6 = r6.A(r0, r4)
            if (r6 == 0) goto L_0x0137
            java.lang.Object r13 = r6.first
            if (r13 != 0) goto L_0x0083
            goto L_0x0137
        L_0x0083:
            qs0 r13 = (defpackage.qs0) r13
            r1.a = r13
            java.lang.Object r6 = r6.second
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r1.c = r6
            com.google.android.gms.measurement.internal.ma r6 = r1.d
            com.google.android.gms.measurement.internal.ba r6 = r6.k()
            qs0 r7 = r1.a
            java.lang.Object r3 = r6.U(r7, r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r1.b = r3
        L_0x00a1:
            long r6 = r1.c
            r13 = 1
            long r6 = r6 - r13
            r1.c = r6
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x00df
            com.google.android.gms.measurement.internal.ma r3 = r1.d
            com.google.android.gms.measurement.internal.d r3 = r3.m()
            r3.b()
            com.google.android.gms.measurement.internal.c4 r4 = r3.h()
            com.google.android.gms.measurement.internal.e4 r4 = r4.M()
            java.lang.String r6 = "Clearing complex main event info. appId"
            r4.b(r6, r0)
            android.database.sqlite.SQLiteDatabase r4 = r3.v()     // Catch:{ SQLiteException -> 0x00d0 }
            java.lang.String r6 = "delete from main_event_params where app_id=?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x00d0 }
            r2[r5] = r0     // Catch:{ SQLiteException -> 0x00d0 }
            r4.execSQL(r6, r2)     // Catch:{ SQLiteException -> 0x00d0 }
            goto L_0x00ee
        L_0x00d0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.c4 r2 = r3.h()
            com.google.android.gms.measurement.internal.e4 r2 = r2.E()
            java.lang.String r3 = "Error clearing complex main event"
            r2.b(r3, r0)
            goto L_0x00ee
        L_0x00df:
            com.google.android.gms.measurement.internal.ma r2 = r1.d
            com.google.android.gms.measurement.internal.d r2 = r2.m()
            long r5 = r1.c
            qs0 r7 = r1.a
            r3 = r18
            r2.Y(r3, r4, r5, r7)
        L_0x00ee:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            qs0 r2 = r1.a
            java.util.List r2 = r2.B()
            java.util.Iterator r2 = r2.iterator()
        L_0x00fd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r2.next()
            ss0 r3 = (defpackage.ss0) r3
            com.google.android.gms.measurement.internal.ma r4 = r1.d
            r4.k()
            java.lang.String r4 = r3.N()
            ss0 r4 = com.google.android.gms.measurement.internal.ba.y(r8, r4)
            if (r4 != 0) goto L_0x00fd
            r0.add(r3)
            goto L_0x00fd
        L_0x011c:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0127
            r0.addAll(r10)
            r10 = r0
            goto L_0x0189
        L_0x0127:
            com.google.android.gms.measurement.internal.ma r0 = r1.d
            com.google.android.gms.measurement.internal.c4 r0 = r0.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.F()
            java.lang.String r2 = "No unique parameters in main event. eventName"
        L_0x0133:
            r0.b(r2, r9)
            goto L_0x0189
        L_0x0137:
            com.google.android.gms.measurement.internal.ma r0 = r1.d
            com.google.android.gms.measurement.internal.c4 r0 = r0.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.F()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.c(r2, r9, r4)
            return r7
        L_0x0147:
            if (r6 == 0) goto L_0x0189
            r1.b = r4
            r1.a = r8
            com.google.android.gms.measurement.internal.ma r2 = r1.d
            com.google.android.gms.measurement.internal.ba r2 = r2.k()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            java.lang.String r5 = "_epc"
            java.lang.Object r2 = r2.U(r8, r5)
            if (r2 != 0) goto L_0x0160
            goto L_0x0161
        L_0x0160:
            r3 = r2
        L_0x0161:
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            r1.c = r2
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x017a
            com.google.android.gms.measurement.internal.ma r0 = r1.d
            com.google.android.gms.measurement.internal.c4 r0 = r0.h()
            com.google.android.gms.measurement.internal.e4 r0 = r0.F()
            java.lang.String r2 = "Complex event with zero extra param count. eventName"
            goto L_0x0133
        L_0x017a:
            com.google.android.gms.measurement.internal.ma r2 = r1.d
            com.google.android.gms.measurement.internal.d r2 = r2.m()
            long r5 = r1.c
            r3 = r18
            r7 = r19
            r2.Y(r3, r4, r5, r7)
        L_0x0189:
            sy0$b r0 = r19.w()
            qs0$a r0 = (defpackage.qs0.a) r0
            r0.D(r9)
            r0.O()
            r0.C(r10)
            f01 r0 = r0.k()
            sy0 r0 = (defpackage.sy0) r0
            qs0 r0 = (defpackage.qs0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ra.a(java.lang.String, qs0):qs0");
    }
}
