package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.source.hls.j;
import com.google.android.exoplayer2.upstream.i;
import defpackage.y10;
import defpackage.yx;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class l extends d10 {
    private static final st H = new st();
    private static final AtomicInteger I = new AtomicInteger();
    private ht A;
    private boolean B;
    private o C;
    private int D;
    private boolean E;
    private volatile boolean F;
    private boolean G;
    public final int j;
    public final int k;
    public final Uri l;
    private final i m;
    private final com.google.android.exoplayer2.upstream.l n;
    private final ht o;
    private final boolean p;
    private final boolean q;
    private final s50 r;
    private final boolean s;
    private final j t;
    private final List<f0> u;
    private final ns v;
    private final uy w;
    private final i50 x;
    private final boolean y;
    private final boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private l(j jVar, i iVar, com.google.android.exoplayer2.upstream.l lVar, f0 f0Var, boolean z2, i iVar2, com.google.android.exoplayer2.upstream.l lVar2, boolean z3, Uri uri, List<f0> list, int i, Object obj, long j2, long j3, long j4, int i2, boolean z4, boolean z5, s50 s50, ns nsVar, ht htVar, uy uyVar, i50 i50, boolean z6) {
        super(iVar, lVar, f0Var, i, obj, j2, j3, j4);
        com.google.android.exoplayer2.upstream.l lVar3 = lVar2;
        this.y = z2;
        this.k = i2;
        this.n = lVar3;
        this.m = iVar2;
        this.E = lVar3 != null;
        this.z = z3;
        this.l = uri;
        this.p = z5;
        this.r = s50;
        this.q = z4;
        this.t = jVar;
        this.u = list;
        this.v = nsVar;
        this.o = htVar;
        this.w = uyVar;
        this.x = i50;
        this.s = z6;
        this.j = I.getAndIncrement();
    }

    private static i i(i iVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return iVar;
        }
        q40.e(bArr2);
        return new d(iVar, bArr, bArr2);
    }

    public static l j(j jVar, i iVar, f0 f0Var, long j2, y10 y10, int i, Uri uri, List<f0> list, int i2, Object obj, boolean z2, r rVar, l lVar, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        i iVar2;
        boolean z3;
        com.google.android.exoplayer2.upstream.l lVar2;
        boolean z4;
        i50 i50;
        uy uyVar;
        ht htVar;
        byte[] bArr4;
        i iVar3 = iVar;
        y10 y102 = y10;
        int i3 = i;
        l lVar3 = lVar;
        byte[] bArr5 = bArr;
        byte[] bArr6 = bArr2;
        y10.a aVar = y102.o.get(i3);
        com.google.android.exoplayer2.upstream.l lVar4 = new com.google.android.exoplayer2.upstream.l(u50.d(y102.a, aVar.e), aVar.m, aVar.n, (String) null);
        boolean z5 = bArr5 != null;
        if (z5) {
            String str = aVar.l;
            q40.e(str);
            bArr3 = l(str);
        } else {
            bArr3 = null;
        }
        i i4 = i(iVar3, bArr5, bArr3);
        y10.a aVar2 = aVar.f;
        if (aVar2 != null) {
            boolean z6 = bArr6 != null;
            if (z6) {
                String str2 = aVar2.l;
                q40.e(str2);
                bArr4 = l(str2);
            } else {
                bArr4 = null;
            }
            com.google.android.exoplayer2.upstream.l lVar5 = new com.google.android.exoplayer2.upstream.l(u50.d(y102.a, aVar2.e), aVar2.m, aVar2.n, (String) null);
            i i5 = i(iVar3, bArr6, bArr4);
            z3 = z6;
            iVar2 = i5;
            lVar2 = lVar5;
        } else {
            lVar2 = null;
            z3 = false;
            iVar2 = null;
        }
        long j3 = j2 + aVar.i;
        long j4 = j3 + aVar.g;
        int i6 = y102.h + aVar.h;
        if (lVar3 != null) {
            uy uyVar2 = lVar3.w;
            i50 i502 = lVar3.x;
            boolean z7 = !uri.equals(lVar3.l) || !lVar3.G;
            uyVar = uyVar2;
            i50 = i502;
            htVar = (!lVar3.B || lVar3.k != i6 || z7) ? null : lVar3.A;
            z4 = z7;
        } else {
            Uri uri2 = uri;
            uyVar = new uy();
            i50 = new i50(10);
            htVar = null;
            z4 = false;
        }
        return new l(jVar, i4, lVar4, f0Var, z5, iVar2, lVar2, z3, uri, list, i2, obj, j3, j4, y102.i + ((long) i3), i6, aVar.o, z2, rVar.a(i6), aVar.j, htVar, uyVar, i50, z4);
    }

    @RequiresNonNull({"output"})
    private void k(i iVar, com.google.android.exoplayer2.upstream.l lVar, boolean z2) {
        com.google.android.exoplayer2.upstream.l lVar2;
        boolean z3;
        et q2;
        int i = 0;
        if (z2) {
            z3 = this.D != 0;
            lVar2 = lVar;
        } else {
            lVar2 = lVar.e((long) this.D);
            z3 = false;
        }
        try {
            q2 = q(iVar, lVar2);
            if (z3) {
                q2.j(this.D);
            }
            while (i == 0) {
                if (this.F) {
                    break;
                }
                i = this.A.f(q2, H);
            }
            this.D = (int) (q2.m() - lVar.e);
            v50.k(iVar);
        } catch (Throwable th) {
            v50.k(iVar);
            throw th;
        }
    }

    private static byte[] l(String str) {
        if (v50.G0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @RequiresNonNull({"output"})
    private void n() {
        if (!this.p) {
            this.r.j();
        } else if (this.r.c() == Long.MAX_VALUE) {
            this.r.h(this.f);
        }
        k(this.h, this.a, this.y);
    }

    @RequiresNonNull({"output"})
    private void o() {
        if (this.E) {
            q40.e(this.m);
            q40.e(this.n);
            k(this.m, this.n, this.z);
            this.D = 0;
            this.E = false;
        }
    }

    private long p(it itVar) {
        itVar.i();
        try {
            itVar.l(this.x.a, 0, 10);
            this.x.I(10);
            if (this.x.C() != 4801587) {
                return -9223372036854775807L;
            }
            this.x.N(3);
            int y2 = this.x.y();
            int i = y2 + 10;
            if (i > this.x.b()) {
                i50 i50 = this.x;
                byte[] bArr = i50.a;
                i50.I(i);
                System.arraycopy(bArr, 0, this.x.a, 0, 10);
            }
            itVar.l(this.x.a, 10, y2);
            yx c = this.w.c(this.x.a, y2);
            if (c == null) {
                return -9223372036854775807L;
            }
            int d = c.d();
            for (int i2 = 0; i2 < d; i2++) {
                yx.b c2 = c.c(i2);
                if (c2 instanceof yy) {
                    yy yyVar = (yy) c2;
                    if ("com.apple.streaming.transportStreamTimestamp".equals(yyVar.f)) {
                        System.arraycopy(yyVar.g, 0, this.x.a, 0, 8);
                        this.x.I(8);
                        return this.x.s() & 8589934591L;
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException unused) {
        }
    }

    @RequiresNonNull({"output"})
    @EnsuresNonNull({"extractor"})
    private et q(i iVar, com.google.android.exoplayer2.upstream.l lVar) {
        et etVar;
        com.google.android.exoplayer2.upstream.l lVar2 = lVar;
        et etVar2 = new et(iVar, lVar2.e, iVar.c(lVar));
        if (this.A == null) {
            long p2 = p(etVar2);
            etVar2.i();
            etVar = etVar2;
            j.a a = this.t.a(this.o, lVar2.a, this.c, this.u, this.r, iVar.d(), etVar2);
            this.A = a.a;
            this.B = a.c;
            if (a.b) {
                this.C.i0(p2 != -9223372036854775807L ? this.r.b(p2) : this.f);
            } else {
                this.C.i0(0);
            }
            this.C.V();
            this.A.g(this.C);
        } else {
            etVar = etVar2;
        }
        this.C.f0(this.v);
        return etVar;
    }

    public void a() {
        ht htVar;
        q40.e(this.C);
        if (this.A == null && (htVar = this.o) != null) {
            this.A = htVar;
            this.B = true;
            this.E = false;
        }
        o();
        if (!this.F) {
            if (!this.q) {
                n();
            }
            this.G = true;
        }
    }

    public void c() {
        this.F = true;
    }

    public boolean h() {
        return this.G;
    }

    public void m(o oVar) {
        this.C = oVar;
        oVar.I(this.j, this.s);
    }
}
