package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.y;
import defpackage.y10;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class h {
    private final j a;
    private final i b;
    private final i c;
    private final r d;
    private final Uri[] e;
    private final f0[] f;
    private final c20 g;
    private final o00 h;
    private final List<f0> i;
    private final g j = new g(4);
    private boolean k;
    private byte[] l = v50.f;
    private IOException m;
    private Uri n;
    private boolean o;
    private h40 p;
    private long q = -9223372036854775807L;
    private boolean r;

    private static final class a extends b10 {
        private byte[] k;

        public a(i iVar, l lVar, f0 f0Var, int i, Object obj, byte[] bArr) {
            super(iVar, lVar, 3, f0Var, i, obj, bArr);
        }

        /* access modifiers changed from: protected */
        public void g(byte[] bArr, int i) {
            this.k = Arrays.copyOf(bArr, i);
        }

        public byte[] j() {
            return this.k;
        }
    }

    public static final class b {
        public v00 a;
        public boolean b;
        public Uri c;

        public b() {
            a();
        }

        public void a() {
            this.a = null;
            this.b = false;
            this.c = null;
        }
    }

    private static final class c extends t00 {
        public c(y10 y10, long j, int i) {
            super((long) i, (long) (y10.o.size() - 1));
        }
    }

    private static final class d extends c40 {
        private int g;

        public d(o00 o00, int[] iArr) {
            super(o00, iArr);
            this.g = h(o00.a(0));
        }

        public int b() {
            return this.g;
        }

        public void j(long j, long j2, long j3, List<? extends d10> list, e10[] e10Arr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (r(this.g, elapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!r(i, elapsedRealtime)) {
                        this.g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        public int m() {
            return 0;
        }

        public Object o() {
            return null;
        }
    }

    public h(j jVar, c20 c20, Uri[] uriArr, f0[] f0VarArr, i iVar, y yVar, r rVar, List<f0> list) {
        this.a = jVar;
        this.g = c20;
        this.e = uriArr;
        this.f = f0VarArr;
        this.d = rVar;
        this.i = list;
        i a2 = iVar.a(1);
        this.b = a2;
        if (yVar != null) {
            a2.b(yVar);
        }
        this.c = iVar.a(3);
        this.h = new o00(f0VarArr);
        int[] iArr = new int[uriArr.length];
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            iArr[i2] = i2;
        }
        this.p = new d(this.h, iArr);
    }

    private long b(l lVar, boolean z, y10 y10, long j2, long j3) {
        long e2;
        long j4;
        if (lVar != null && !z) {
            return lVar.g();
        }
        long j5 = y10.p + j2;
        if (lVar != null && !this.o) {
            j3 = lVar.f;
        }
        if (y10.l || j3 < j5) {
            e2 = (long) v50.e(y10.o, Long.valueOf(j3 - j2), true, !this.g.e() || lVar == null);
            j4 = y10.i;
        } else {
            e2 = y10.i;
            j4 = (long) y10.o.size();
        }
        return e2 + j4;
    }

    private static Uri c(y10 y10, y10.a aVar) {
        String str;
        if (aVar == null || (str = aVar.k) == null) {
            return null;
        }
        return u50.d(y10.a, str);
    }

    private v00 h(Uri uri, int i2) {
        if (uri == null) {
            return null;
        }
        byte[] c2 = this.j.c(uri);
        if (c2 != null) {
            this.j.b(uri, c2);
            return null;
        }
        return new a(this.c, new l(uri, 0, -1, (String) null, 1), this.f[i2], this.p.m(), this.p.o(), this.l);
    }

    private long m(long j2) {
        if (this.q != -9223372036854775807L) {
            return this.q - j2;
        }
        return -9223372036854775807L;
    }

    private void p(y10 y10) {
        this.q = y10.l ? -9223372036854775807L : y10.e() - this.g.d();
    }

    public e10[] a(l lVar, long j2) {
        l lVar2 = lVar;
        int b2 = lVar2 == null ? -1 : this.h.b(lVar2.c);
        int length = this.p.length();
        e10[] e10Arr = new e10[length];
        for (int i2 = 0; i2 < length; i2++) {
            int f2 = this.p.f(i2);
            Uri uri = this.e[f2];
            if (!this.g.a(uri)) {
                e10Arr[i2] = e10.a;
            } else {
                y10 k2 = this.g.k(uri, false);
                q40.e(k2);
                long d2 = k2.f - this.g.d();
                long j3 = d2;
                long b3 = b(lVar, f2 != b2, k2, d2, j2);
                long j4 = k2.i;
                if (b3 < j4) {
                    e10Arr[i2] = e10.a;
                } else {
                    e10Arr[i2] = new c(k2, j3, (int) (b3 - j4));
                }
            }
        }
        return e10Arr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(long r29, long r31, java.util.List<com.google.android.exoplayer2.source.hls.l> r33, boolean r34, com.google.android.exoplayer2.source.hls.h.b r35) {
        /*
            r28 = this;
            r8 = r28
            r6 = r31
            r9 = r35
            boolean r0 = r33.isEmpty()
            r11 = 1
            if (r0 == 0) goto L_0x0011
            r1 = r33
            r4 = 0
            goto L_0x001f
        L_0x0011:
            int r0 = r33.size()
            int r0 = r0 - r11
            r1 = r33
            java.lang.Object r0 = r1.get(r0)
            com.google.android.exoplayer2.source.hls.l r0 = (com.google.android.exoplayer2.source.hls.l) r0
            r4 = r0
        L_0x001f:
            if (r4 != 0) goto L_0x0024
            r0 = -1
            r5 = -1
            goto L_0x002d
        L_0x0024:
            o00 r0 = r8.h
            com.google.android.exoplayer2.f0 r2 = r4.c
            int r0 = r0.b(r2)
            r5 = r0
        L_0x002d:
            long r2 = r6 - r29
            long r12 = r28.m(r29)
            if (r4 == 0) goto L_0x0056
            boolean r0 = r8.o
            if (r0 != 0) goto L_0x0056
            long r14 = r4.d()
            long r2 = r2 - r14
            r10 = 0
            long r2 = java.lang.Math.max(r10, r2)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0056
            long r12 = r12 - r14
            long r10 = java.lang.Math.max(r10, r12)
            r15 = r2
            r17 = r10
            goto L_0x0059
        L_0x0056:
            r15 = r2
            r17 = r12
        L_0x0059:
            e10[] r20 = r8.a(r4, r6)
            h40 r12 = r8.p
            r13 = r29
            r19 = r33
            r12.j(r13, r15, r17, r19, r20)
            h40 r0 = r8.p
            int r10 = r0.k()
            r11 = 0
            if (r5 == r10) goto L_0x0071
            r12 = 1
            goto L_0x0072
        L_0x0071:
            r12 = 0
        L_0x0072:
            android.net.Uri[] r0 = r8.e
            r13 = r0[r10]
            c20 r0 = r8.g
            boolean r0 = r0.a(r13)
            if (r0 != 0) goto L_0x008e
            r9.c = r13
            boolean r0 = r8.r
            android.net.Uri r1 = r8.n
            boolean r1 = r13.equals(r1)
            r0 = r0 & r1
            r8.r = r0
            r8.n = r13
            return
        L_0x008e:
            c20 r0 = r8.g
            r1 = 1
            y10 r14 = r0.k(r13, r1)
            defpackage.q40.e(r14)
            boolean r0 = r14.c
            r8.o = r0
            r8.p(r14)
            long r0 = r14.f
            c20 r2 = r8.g
            long r2 = r2.d()
            long r15 = r0 - r2
            r0 = r28
            r1 = r4
            r2 = r12
            r3 = r14
            r25 = r4
            r17 = r5
            r4 = r15
            r6 = r31
            long r0 = r0.b(r1, r2, r3, r4, r6)
            long r2 = r14.i
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x00e5
            if (r25 == 0) goto L_0x00e5
            if (r12 == 0) goto L_0x00e5
            android.net.Uri[] r0 = r8.e
            r0 = r0[r17]
            c20 r1 = r8.g
            r2 = 1
            y10 r1 = r1.k(r0, r2)
            defpackage.q40.e(r1)
            long r2 = r1.f
            c20 r4 = r8.g
            long r4 = r4.d()
            long r2 = r2 - r4
            long r4 = r25.g()
            r15 = r2
            r3 = r0
            r2 = r1
            r0 = r4
            r5 = r17
            goto L_0x00e8
        L_0x00e5:
            r5 = r10
            r3 = r13
            r2 = r14
        L_0x00e8:
            long r6 = r2.i
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x00f6
            vz r0 = new vz
            r0.<init>()
            r8.m = r0
            return
        L_0x00f6:
            long r0 = r0 - r6
            int r1 = (int) r0
            java.util.List<y10$a> r0 = r2.o
            int r0 = r0.size()
            if (r1 < r0) goto L_0x0120
            boolean r1 = r2.l
            if (r1 == 0) goto L_0x0110
            if (r34 != 0) goto L_0x010c
            if (r0 != 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r1 = 1
            int r0 = r0 - r1
            goto L_0x0121
        L_0x010c:
            r1 = 1
            r9.b = r1
            return
        L_0x0110:
            r9.c = r3
            boolean r0 = r8.r
            android.net.Uri r1 = r8.n
            boolean r1 = r3.equals(r1)
            r0 = r0 & r1
            r8.r = r0
            r8.n = r3
            return
        L_0x0120:
            r0 = r1
        L_0x0121:
            r8.r = r11
            r1 = 0
            r8.n = r1
            java.util.List<y10$a> r1 = r2.o
            java.lang.Object r1 = r1.get(r0)
            y10$a r1 = (defpackage.y10.a) r1
            y10$a r4 = r1.f
            android.net.Uri r4 = c(r2, r4)
            v00 r6 = r8.h(r4, r5)
            r9.a = r6
            if (r6 == 0) goto L_0x013d
            return
        L_0x013d:
            android.net.Uri r1 = c(r2, r1)
            v00 r6 = r8.h(r1, r5)
            r9.a = r6
            if (r6 == 0) goto L_0x014a
            return
        L_0x014a:
            com.google.android.exoplayer2.source.hls.j r12 = r8.a
            com.google.android.exoplayer2.upstream.i r13 = r8.b
            com.google.android.exoplayer2.f0[] r6 = r8.f
            r14 = r6[r5]
            java.util.List<com.google.android.exoplayer2.f0> r5 = r8.i
            h40 r6 = r8.p
            int r21 = r6.m()
            h40 r6 = r8.p
            java.lang.Object r22 = r6.o()
            boolean r6 = r8.k
            com.google.android.exoplayer2.source.hls.r r7 = r8.d
            com.google.android.exoplayer2.source.hls.g r10 = r8.j
            byte[] r26 = r10.a(r1)
            com.google.android.exoplayer2.source.hls.g r1 = r8.j
            byte[] r27 = r1.a(r4)
            r17 = r2
            r18 = r0
            r19 = r3
            r20 = r5
            r23 = r6
            r24 = r7
            com.google.android.exoplayer2.source.hls.l r0 = com.google.android.exoplayer2.source.hls.l.j(r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.h.d(long, long, java.util.List, boolean, com.google.android.exoplayer2.source.hls.h$b):void");
    }

    public o00 e() {
        return this.h;
    }

    public h40 f() {
        return this.p;
    }

    public boolean g(v00 v00, long j2) {
        h40 h40 = this.p;
        return h40.c(h40.q(this.h.b(v00.c)), j2);
    }

    public void i() {
        IOException iOException = this.m;
        if (iOException == null) {
            Uri uri = this.n;
            if (uri != null && this.r) {
                this.g.c(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void j(v00 v00) {
        if (v00 instanceof a) {
            a aVar = (a) v00;
            this.l = aVar.h();
            g gVar = this.j;
            Uri uri = aVar.a.a;
            byte[] j2 = aVar.j();
            q40.e(j2);
            gVar.b(uri, j2);
        }
    }

    public boolean k(Uri uri, long j2) {
        int q2;
        int i2 = 0;
        while (true) {
            Uri[] uriArr = this.e;
            if (i2 >= uriArr.length) {
                i2 = -1;
                break;
            } else if (uriArr[i2].equals(uri)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || (q2 = this.p.q(i2)) == -1) {
            return true;
        }
        this.r = uri.equals(this.n) | this.r;
        return j2 == -9223372036854775807L || this.p.c(q2, j2);
    }

    public void l() {
        this.m = null;
    }

    public void n(boolean z) {
        this.k = z;
    }

    public void o(h40 h40) {
        this.p = h40;
    }
}
