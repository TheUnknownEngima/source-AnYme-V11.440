package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.j;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.s;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class h implements c {
    private final v a;
    private final int[] b;
    private final int c;
    private final i d;
    private final long e;
    private final int f;
    private final j.c g;
    protected final b[] h;
    private h40 i;
    private h10 j;
    private int k;
    private IOException l;
    private boolean m;
    private long n = -9223372036854775807L;

    public static final class a implements c.a {
        private final i.a a;
        private final int b;

        public a(i.a aVar) {
            this(aVar, 1);
        }

        public a(i.a aVar, int i) {
            this.a = aVar;
            this.b = i;
        }

        public c a(v vVar, h10 h10, int i, int[] iArr, h40 h40, int i2, long j, boolean z, List<f0> list, j.c cVar, y yVar) {
            y yVar2 = yVar;
            i a2 = this.a.a();
            if (yVar2 != null) {
                a2.b(yVar2);
            }
            return new h(vVar, h10, i, iArr, h40, i2, a2, j, this.b, z, list, cVar);
        }
    }

    protected static final class b {
        final w00 a;
        public final o10 b;
        public final f c;
        /* access modifiers changed from: private */
        public final long d;
        private final long e;

        b(long j, int i, o10 o10, boolean z, List<f0> list, vt vtVar) {
            this(j, o10, d(i, o10, z, list, vtVar), 0, o10.i());
        }

        private b(long j, o10 o10, w00 w00, long j2, f fVar) {
            this.d = j;
            this.b = o10;
            this.e = j2;
            this.a = w00;
            this.c = fVar;
        }

        /* JADX WARNING: type inference failed for: r9v3, types: [ou] */
        /* JADX WARNING: type inference failed for: r9v4, types: [zv] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static defpackage.w00 d(int r7, defpackage.o10 r8, boolean r9, java.util.List<com.google.android.exoplayer2.f0> r10, defpackage.vt r11) {
            /*
                com.google.android.exoplayer2.f0 r0 = r8.a
                java.lang.String r0 = r0.l
                boolean r1 = m(r0)
                if (r1 == 0) goto L_0x000c
                r7 = 0
                return r7
            L_0x000c:
                java.lang.String r1 = "application/x-rawcc"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L_0x001c
                zv r9 = new zv
                com.google.android.exoplayer2.f0 r10 = r8.a
                r9.<init>(r10)
                goto L_0x003a
            L_0x001c:
                boolean r0 = n(r0)
                if (r0 == 0) goto L_0x0029
                ou r9 = new ou
                r10 = 1
                r9.<init>(r10)
                goto L_0x003a
            L_0x0029:
                r0 = 0
                if (r9 == 0) goto L_0x002f
                r0 = 4
                r2 = 4
                goto L_0x0030
            L_0x002f:
                r2 = 0
            L_0x0030:
                fv r9 = new fv
                r3 = 0
                r4 = 0
                r1 = r9
                r5 = r10
                r6 = r11
                r1.<init>(r2, r3, r4, r5, r6)
            L_0x003a:
                w00 r10 = new w00
                com.google.android.exoplayer2.f0 r8 = r8.a
                r10.<init>(r9, r7, r8)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.h.b.d(int, o10, boolean, java.util.List, vt):w00");
        }

        private static boolean m(String str) {
            return e50.m(str) || "application/ttml+xml".equals(str);
        }

        private static boolean n(String str) {
            return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm");
        }

        /* access modifiers changed from: package-private */
        public b b(long j, o10 o10) {
            long j2;
            long j3 = j;
            f i = this.b.i();
            f i2 = o10.i();
            if (i == null) {
                return new b(j, o10, this.a, this.e, i);
            } else if (!i.e()) {
                return new b(j, o10, this.a, this.e, i2);
            } else {
                int g = i.g(j3);
                if (g == 0) {
                    return new b(j, o10, this.a, this.e, i2);
                }
                long f = i.f();
                long b2 = i.b(f);
                long j4 = (((long) g) + f) - 1;
                long f2 = i2.f();
                long j5 = f;
                long b3 = i2.b(f2);
                long j6 = this.e;
                int i3 = ((i.b(j4) + i.a(j4, j3)) > b3 ? 1 : ((i.b(j4) + i.a(j4, j3)) == b3 ? 0 : -1));
                if (i3 == 0) {
                    j2 = j6 + ((j4 + 1) - f2);
                    long j7 = j;
                } else if (i3 >= 0) {
                    long j8 = j6;
                    j2 = b3 < b2 ? j8 - (i2.d(b2, j) - j5) : (i.d(b3, j) - f2) + j8;
                } else {
                    throw new vz();
                }
                return new b(j, o10, this.a, j2, i2);
            }
        }

        /* access modifiers changed from: package-private */
        public b c(f fVar) {
            return new b(this.d, this.b, this.a, this.e, fVar);
        }

        public long e(h10 h10, int i, long j) {
            if (h() != -1 || h10.f == -9223372036854775807L) {
                return f();
            }
            return Math.max(f(), j(((j - com.google.android.exoplayer2.v.a(h10.a)) - com.google.android.exoplayer2.v.a(h10.d(i).b)) - com.google.android.exoplayer2.v.a(h10.f)));
        }

        public long f() {
            return this.c.f() + this.e;
        }

        public long g(h10 h10, int i, long j) {
            int h = h();
            return (h == -1 ? j((j - com.google.android.exoplayer2.v.a(h10.a)) - com.google.android.exoplayer2.v.a(h10.d(i).b)) : f() + ((long) h)) - 1;
        }

        public int h() {
            return this.c.g(this.d);
        }

        public long i(long j) {
            return k(j) + this.c.a(j - this.e, this.d);
        }

        public long j(long j) {
            return this.c.d(j, this.d) + this.e;
        }

        public long k(long j) {
            return this.c.b(j - this.e);
        }

        public n10 l(long j) {
            return this.c.c(j - this.e);
        }
    }

    protected static final class c extends t00 {
        public c(b bVar, long j, long j2) {
            super(j, j2);
        }
    }

    public h(v vVar, h10 h10, int i2, int[] iArr, h40 h40, int i3, i iVar, long j2, int i4, boolean z, List<f0> list, j.c cVar) {
        h40 h402 = h40;
        this.a = vVar;
        this.j = h10;
        this.b = iArr;
        this.i = h402;
        this.c = i3;
        this.d = iVar;
        this.k = i2;
        this.e = j2;
        this.f = i4;
        this.g = cVar;
        long g2 = h10.g(i2);
        ArrayList<o10> k2 = k();
        this.h = new b[h40.length()];
        for (int i5 = 0; i5 < this.h.length; i5++) {
            this.h[i5] = new b(g2, i3, k2.get(h402.f(i5)), z, list, cVar);
        }
    }

    private long j() {
        return (this.e != 0 ? SystemClock.elapsedRealtime() + this.e : System.currentTimeMillis()) * 1000;
    }

    private ArrayList<o10> k() {
        List<g10> list = this.j.d(this.k).c;
        ArrayList<o10> arrayList = new ArrayList<>();
        for (int i2 : this.b) {
            arrayList.addAll(list.get(i2).c);
        }
        return arrayList;
    }

    private long l(b bVar, d10 d10, long j2, long j3, long j4) {
        return d10 != null ? d10.g() : v50.p(bVar.j(j2), j3, j4);
    }

    private long o(long j2) {
        if (this.j.d && this.n != -9223372036854775807L) {
            return this.n - j2;
        }
        return -9223372036854775807L;
    }

    private void p(b bVar, long j2) {
        this.n = this.j.d ? bVar.i(j2) : -9223372036854775807L;
    }

    public void a() {
        IOException iOException = this.l;
        if (iOException == null) {
            this.a.a();
            return;
        }
        throw iOException;
    }

    public void b(h40 h40) {
        this.i = h40;
    }

    public boolean d(v00 v00, boolean z, Exception exc, long j2) {
        b bVar;
        int h2;
        if (!z) {
            return false;
        }
        j.c cVar = this.g;
        if (cVar != null && cVar.g(v00)) {
            return true;
        }
        if (!this.j.d && (v00 instanceof d10) && (exc instanceof s.d) && ((s.d) exc).e == 404 && (h2 = bVar.h()) != -1 && h2 != 0) {
            if (((d10) v00).g() > ((bVar = this.h[this.i.h(v00.c)]).f() + ((long) h2)) - 1) {
                this.m = true;
                return true;
            }
        }
        if (j2 == -9223372036854775807L) {
            return false;
        }
        h40 h40 = this.i;
        return h40.c(h40.h(v00.c), j2);
    }

    public long e(long j2, z0 z0Var) {
        for (b bVar : this.h) {
            if (bVar.c != null) {
                long j3 = bVar.j(j2);
                long k2 = bVar.k(j3);
                return v50.v0(j2, z0Var, k2, (k2 >= j2 || j3 >= ((long) (bVar.h() + -1))) ? k2 : bVar.k(j3 + 1));
            }
        }
        return j2;
    }

    public void f(h10 h10, int i2) {
        try {
            this.j = h10;
            this.k = i2;
            long g2 = h10.g(i2);
            ArrayList<o10> k2 = k();
            for (int i3 = 0; i3 < this.h.length; i3++) {
                this.h[i3] = this.h[i3].b(g2, k2.get(this.i.f(i3)));
            }
        } catch (vz e2) {
            this.l = e2;
        }
    }

    public int g(long j2, List<? extends d10> list) {
        return (this.l != null || this.i.length() < 2) ? list.size() : this.i.g(j2, list);
    }

    public void h(v00 v00) {
        tt c2;
        if (v00 instanceof c10) {
            int h2 = this.i.h(((c10) v00).c);
            b bVar = this.h[h2];
            if (bVar.c == null && (c2 = bVar.a.c()) != null) {
                this.h[h2] = bVar.c(new g((ct) c2, bVar.b.c));
            }
        }
        j.c cVar = this.g;
        if (cVar != null) {
            cVar.h(v00);
        }
    }

    public void i(long j2, long j3, List<? extends d10> list, x00 x00) {
        d10 d10;
        long j4;
        e10[] e10Arr;
        int i2;
        int i3;
        x00 x002 = x00;
        if (this.l == null) {
            long j5 = j3 - j2;
            long o = o(j2);
            long a2 = com.google.android.exoplayer2.v.a(this.j.a) + com.google.android.exoplayer2.v.a(this.j.d(this.k).b) + j3;
            j.c cVar = this.g;
            if (cVar == null || !cVar.f(a2)) {
                long j6 = j();
                if (list.isEmpty()) {
                    List<? extends d10> list2 = list;
                    d10 = null;
                } else {
                    d10 = (d10) list.get(list.size() - 1);
                }
                int length = this.i.length();
                e10[] e10Arr2 = new e10[length];
                int i4 = 0;
                while (i4 < length) {
                    b bVar = this.h[i4];
                    if (bVar.c == null) {
                        e10Arr2[i4] = e10.a;
                        i3 = i4;
                        i2 = length;
                        e10Arr = e10Arr2;
                        j4 = j6;
                    } else {
                        long e2 = bVar.e(this.j, this.k, j6);
                        long g2 = bVar.g(this.j, this.k, j6);
                        b bVar2 = bVar;
                        i3 = i4;
                        i2 = length;
                        e10Arr = e10Arr2;
                        j4 = j6;
                        long l2 = l(bVar, d10, j3, e2, g2);
                        if (l2 < e2) {
                            e10Arr[i3] = e10.a;
                        } else {
                            e10Arr[i3] = new c(bVar2, l2, g2);
                        }
                    }
                    i4 = i3 + 1;
                    List<? extends d10> list3 = list;
                    length = i2;
                    e10Arr2 = e10Arr;
                    j6 = j4;
                }
                long j7 = j6;
                this.i.j(j2, j5, o, list, e10Arr2);
                b bVar3 = this.h[this.i.b()];
                w00 w00 = bVar3.a;
                if (w00 != null) {
                    o10 o10 = bVar3.b;
                    n10 k2 = w00.b() == null ? o10.k() : null;
                    n10 j8 = bVar3.c == null ? o10.j() : null;
                    if (!(k2 == null && j8 == null)) {
                        x002.a = m(bVar3, this.d, this.i.l(), this.i.m(), this.i.o(), k2, j8);
                        return;
                    }
                }
                long a3 = bVar3.d;
                long j9 = -9223372036854775807L;
                int i5 = (a3 > -9223372036854775807L ? 1 : (a3 == -9223372036854775807L ? 0 : -1));
                boolean z = i5 != 0;
                if (bVar3.h() == 0) {
                    x002.b = z;
                    return;
                }
                long j10 = j7;
                long e3 = bVar3.e(this.j, this.k, j10);
                long g3 = bVar3.g(this.j, this.k, j10);
                p(bVar3, g3);
                long j11 = g3;
                boolean z2 = z;
                long l3 = l(bVar3, d10, j3, e3, j11);
                if (l3 < e3) {
                    this.l = new vz();
                    return;
                }
                int i6 = (l3 > j11 ? 1 : (l3 == j11 ? 0 : -1));
                if (i6 > 0 || (this.m && i6 >= 0)) {
                    x002.b = z2;
                } else if (!z2 || bVar3.k(l3) < a3) {
                    int min = (int) Math.min((long) this.f, (j11 - l3) + 1);
                    if (i5 != 0) {
                        while (min > 1 && bVar3.k((((long) min) + l3) - 1) >= a3) {
                            min--;
                        }
                    }
                    int i7 = min;
                    if (list.isEmpty()) {
                        j9 = j3;
                    }
                    x002.a = n(bVar3, this.d, this.c, this.i.l(), this.i.m(), this.i.o(), l3, i7, j9);
                } else {
                    x002.b = true;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public v00 m(b bVar, i iVar, f0 f0Var, int i2, Object obj, n10 n10, n10 n102) {
        String str = bVar.b.b;
        if (n10 == null || (n102 = n10.a(n102, str)) != null) {
            n10 = n102;
        }
        return new c10(iVar, new l(n10.b(str), n10.a, n10.b, bVar.b.h()), f0Var, i2, obj, bVar.a);
    }

    /* access modifiers changed from: protected */
    public v00 n(b bVar, i iVar, int i2, f0 f0Var, int i3, Object obj, long j2, int i4, long j3) {
        b bVar2 = bVar;
        long j4 = j2;
        o10 o10 = bVar2.b;
        long k2 = bVar2.k(j4);
        n10 l2 = bVar2.l(j4);
        String str = o10.b;
        if (bVar2.a == null) {
            return new f10(iVar, new l(l2.b(str), l2.a, l2.b, o10.h()), f0Var, i3, obj, k2, bVar2.i(j4), j2, i2, f0Var);
        }
        int i5 = 1;
        int i6 = i4;
        int i7 = 1;
        while (i5 < i6) {
            n10 a2 = l2.a(bVar2.l(((long) i5) + j4), str);
            if (a2 == null) {
                break;
            }
            i7++;
            i5++;
            l2 = a2;
        }
        long i8 = bVar2.i((((long) i7) + j4) - 1);
        long a3 = bVar.d;
        long j5 = (a3 == -9223372036854775807L || a3 > i8) ? -9223372036854775807L : a3;
        l lVar = r18;
        l lVar2 = new l(l2.b(str), l2.a, l2.b, o10.h());
        w00 w00 = bVar2.a;
        return new a10(iVar, lVar, f0Var, i3, obj, k2, i8, j3, j5, j2, i7, -o10.c, w00);
    }
}
