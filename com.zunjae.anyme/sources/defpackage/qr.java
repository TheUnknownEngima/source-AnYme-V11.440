package defpackage;

import defpackage.er;

/* renamed from: qr  reason: default package */
final class qr extends kr {
    qr() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8 A[LOOP:4: B:27:0x00a8->B:28:0x00aa, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:12:0x0037, B:28:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r0 = r10.position()
            int r1 = r10.limit()
            int r2 = r1 - r0
            er$a r3 = r9.b
            int r3 = r3.c
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = 4
            r8 = 3
            if (r3 == r8) goto L_0x002d
            if (r3 == r7) goto L_0x002a
            if (r3 == r6) goto L_0x002f
            if (r3 == r5) goto L_0x0027
            if (r3 != r4) goto L_0x0021
            goto L_0x002a
        L_0x0021:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x0027:
            int r2 = r2 / 3
            goto L_0x002d
        L_0x002a:
            int r2 = r2 / 2
            goto L_0x002f
        L_0x002d:
            int r2 = r2 * 2
        L_0x002f:
            java.nio.ByteBuffer r2 = r9.m(r2)
            er$a r3 = r9.b
            int r3 = r3.c
            if (r3 == r8) goto L_0x00a8
            if (r3 == r7) goto L_0x008a
            if (r3 == r6) goto L_0x0075
            if (r3 == r5) goto L_0x005e
            if (r3 != r4) goto L_0x0058
        L_0x0041:
            if (r0 >= r1) goto L_0x00bd
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0041
        L_0x0058:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x005e:
            if (r0 >= r1) goto L_0x00bd
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x005e
        L_0x0075:
            if (r0 >= r1) goto L_0x00bd
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            byte r3 = r10.get(r0)
            r2.put(r3)
            int r0 = r0 + 2
            goto L_0x0075
        L_0x008a:
            if (r0 >= r1) goto L_0x00bd
            float r3 = r10.getFloat(r0)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x008a
        L_0x00a8:
            if (r0 >= r1) goto L_0x00bd
            r3 = 0
            r2.put(r3)
            byte r3 = r10.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x00a8
        L_0x00bd:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr.e(java.nio.ByteBuffer):void");
    }

    public er.a i(er.a aVar) {
        int i = aVar.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new er.a(aVar.a, aVar.b, 2) : er.a.e;
        }
        throw new er.b(aVar);
    }
}
