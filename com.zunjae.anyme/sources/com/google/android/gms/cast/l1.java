package com.google.android.gms.cast;

import android.os.Parcelable;

public final class l1 implements Parcelable.Creator<q> {
    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.os.Parcelable] */
    /* JADX WARNING: type inference failed for: r2v7, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r36) {
        /*
            r35 = this;
            r0 = r36
            int r1 = defpackage.n80.A(r36)
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r13 = r2
            r21 = r13
            r10 = r4
            r17 = r10
            r19 = r17
            r9 = r7
            r24 = r9
            r27 = r24
            r29 = r27
            r31 = r29
            r32 = r31
            r33 = r32
            r34 = r33
            r12 = 0
            r15 = 0
            r16 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
        L_0x0031:
            int r2 = r36.dataPosition()
            if (r2 >= r1) goto L_0x00d3
            int r2 = defpackage.n80.s(r36)
            int r3 = defpackage.n80.l(r2)
            switch(r3) {
                case 2: goto L_0x00c8;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00b6;
                case 6: goto L_0x00b0;
                case 7: goto L_0x00ab;
                case 8: goto L_0x00a6;
                case 9: goto L_0x00a1;
                case 10: goto L_0x009c;
                case 11: goto L_0x0097;
                case 12: goto L_0x0092;
                case 13: goto L_0x008d;
                case 14: goto L_0x0088;
                case 15: goto L_0x0083;
                case 16: goto L_0x007e;
                case 17: goto L_0x0077;
                case 18: goto L_0x0072;
                case 19: goto L_0x0067;
                case 20: goto L_0x005c;
                case 21: goto L_0x0051;
                case 22: goto L_0x0046;
                default: goto L_0x0042;
            }
        L_0x0042:
            defpackage.n80.z(r0, r2)
            goto L_0x0031
        L_0x0046:
            android.os.Parcelable$Creator<com.google.android.gms.cast.n> r3 = com.google.android.gms.cast.n.CREATOR
            android.os.Parcelable r2 = defpackage.n80.e(r0, r2, r3)
            r34 = r2
            com.google.android.gms.cast.n r34 = (com.google.android.gms.cast.n) r34
            goto L_0x0031
        L_0x0051:
            android.os.Parcelable$Creator<com.google.android.gms.cast.k> r3 = com.google.android.gms.cast.k.CREATOR
            android.os.Parcelable r2 = defpackage.n80.e(r0, r2, r3)
            r33 = r2
            com.google.android.gms.cast.k r33 = (com.google.android.gms.cast.k) r33
            goto L_0x0031
        L_0x005c:
            android.os.Parcelable$Creator<com.google.android.gms.cast.t> r3 = com.google.android.gms.cast.t.CREATOR
            android.os.Parcelable r2 = defpackage.n80.e(r0, r2, r3)
            r32 = r2
            com.google.android.gms.cast.t r32 = (com.google.android.gms.cast.t) r32
            goto L_0x0031
        L_0x0067:
            android.os.Parcelable$Creator<com.google.android.gms.cast.c> r3 = com.google.android.gms.cast.c.CREATOR
            android.os.Parcelable r2 = defpackage.n80.e(r0, r2, r3)
            r31 = r2
            com.google.android.gms.cast.c r31 = (com.google.android.gms.cast.c) r31
            goto L_0x0031
        L_0x0072:
            boolean r30 = defpackage.n80.m(r0, r2)
            goto L_0x0031
        L_0x0077:
            android.os.Parcelable$Creator<com.google.android.gms.cast.o> r3 = com.google.android.gms.cast.o.CREATOR
            java.util.ArrayList r29 = defpackage.n80.j(r0, r2, r3)
            goto L_0x0031
        L_0x007e:
            int r28 = defpackage.n80.u(r0, r2)
            goto L_0x0031
        L_0x0083:
            java.lang.String r27 = defpackage.n80.f(r0, r2)
            goto L_0x0031
        L_0x0088:
            int r26 = defpackage.n80.u(r0, r2)
            goto L_0x0031
        L_0x008d:
            int r25 = defpackage.n80.u(r0, r2)
            goto L_0x0031
        L_0x0092:
            long[] r24 = defpackage.n80.d(r0, r2)
            goto L_0x0031
        L_0x0097:
            boolean r23 = defpackage.n80.m(r0, r2)
            goto L_0x0031
        L_0x009c:
            double r21 = defpackage.n80.o(r0, r2)
            goto L_0x0031
        L_0x00a1:
            long r19 = defpackage.n80.w(r0, r2)
            goto L_0x0031
        L_0x00a6:
            long r17 = defpackage.n80.w(r0, r2)
            goto L_0x0031
        L_0x00ab:
            int r16 = defpackage.n80.u(r0, r2)
            goto L_0x0031
        L_0x00b0:
            int r15 = defpackage.n80.u(r0, r2)
            goto L_0x0031
        L_0x00b6:
            double r13 = defpackage.n80.o(r0, r2)
            goto L_0x0031
        L_0x00bc:
            int r12 = defpackage.n80.u(r0, r2)
            goto L_0x0031
        L_0x00c2:
            long r10 = defpackage.n80.w(r0, r2)
            goto L_0x0031
        L_0x00c8:
            android.os.Parcelable$Creator<com.google.android.gms.cast.MediaInfo> r3 = com.google.android.gms.cast.MediaInfo.CREATOR
            android.os.Parcelable r2 = defpackage.n80.e(r0, r2, r3)
            r9 = r2
            com.google.android.gms.cast.MediaInfo r9 = (com.google.android.gms.cast.MediaInfo) r9
            goto L_0x0031
        L_0x00d3:
            defpackage.n80.k(r0, r1)
            com.google.android.gms.cast.q r0 = new com.google.android.gms.cast.q
            r8 = r0
            r8.<init>(r9, r10, r12, r13, r15, r16, r17, r19, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.l1.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new q[i];
    }
}
