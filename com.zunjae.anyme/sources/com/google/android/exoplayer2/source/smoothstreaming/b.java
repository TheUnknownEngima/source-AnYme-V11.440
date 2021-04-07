package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.source.smoothstreaming.c;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.z0;
import defpackage.d20;
import java.io.IOException;
import java.util.List;

public class b implements c {
    private final v a;
    private final int b;
    private final w00[] c;
    private final i d;
    private h40 e;
    private d20 f;
    private int g;
    private IOException h;

    public static final class a implements c.a {
        private final i.a a;

        public a(i.a aVar) {
            this.a = aVar;
        }

        public c a(v vVar, d20 d20, int i, h40 h40, y yVar) {
            i a2 = this.a.a();
            if (yVar != null) {
                a2.b(yVar);
            }
            return new b(vVar, d20, i, h40, a2);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.b$b  reason: collision with other inner class name */
    private static final class C0083b extends t00 {
        public C0083b(d20.b bVar, int i, int i2) {
            super((long) i2, (long) (bVar.k - 1));
        }
    }

    public b(v vVar, d20 d20, int i, h40 h40, i iVar) {
        d20 d202 = d20;
        int i2 = i;
        h40 h402 = h40;
        this.a = vVar;
        this.f = d202;
        this.b = i2;
        this.e = h402;
        this.d = iVar;
        d20.b bVar = d202.f[i2];
        this.c = new w00[h40.length()];
        int i3 = 0;
        while (i3 < this.c.length) {
            int f2 = h402.f(i3);
            f0 f0Var = bVar.j[f2];
            int i4 = i3;
            lv lvVar = r7;
            lv lvVar2 = new lv(f2, bVar.a, bVar.c, -9223372036854775807L, d202.g, f0Var, 0, f0Var.p != null ? d202.e.c : null, bVar.a == 2 ? 4 : 0, (long[]) null, (long[]) null);
            this.c[i4] = new w00(new fv(3, (s50) null, lvVar), bVar.a, f0Var);
            i3 = i4 + 1;
        }
    }

    private static d10 j(f0 f0Var, i iVar, Uri uri, String str, int i, long j, long j2, long j3, int i2, Object obj, w00 w00) {
        i iVar2 = iVar;
        long j4 = j2;
        long j5 = j3;
        int i3 = i2;
        Object obj2 = obj;
        l lVar = r26;
        l lVar2 = new l(uri, 0, -1, str);
        return new a10(iVar2, lVar, f0Var, i3, obj2, j, j4, j5, -9223372036854775807L, (long) i, 1, j, w00);
    }

    private long k(long j) {
        d20 d20 = this.f;
        if (!d20.d) {
            return -9223372036854775807L;
        }
        d20.b bVar = d20.f[this.b];
        int i = bVar.k - 1;
        return (bVar.e(i) + bVar.c(i)) - j;
    }

    public void a() {
        IOException iOException = this.h;
        if (iOException == null) {
            this.a.a();
            return;
        }
        throw iOException;
    }

    public void b(h40 h40) {
        this.e = h40;
    }

    public void c(d20 d20) {
        d20.b[] bVarArr = this.f.f;
        int i = this.b;
        d20.b bVar = bVarArr[i];
        int i2 = bVar.k;
        d20.b bVar2 = d20.f[i];
        if (!(i2 == 0 || bVar2.k == 0)) {
            int i3 = i2 - 1;
            long e2 = bVar.e(i3) + bVar.c(i3);
            long e3 = bVar2.e(0);
            if (e2 > e3) {
                this.g += bVar.d(e3);
                this.f = d20;
            }
        }
        this.g += i2;
        this.f = d20;
    }

    public boolean d(v00 v00, boolean z, Exception exc, long j) {
        if (z && j != -9223372036854775807L) {
            h40 h40 = this.e;
            if (h40.c(h40.h(v00.c), j)) {
                return true;
            }
        }
        return false;
    }

    public long e(long j, z0 z0Var) {
        d20.b bVar = this.f.f[this.b];
        int d2 = bVar.d(j);
        long e2 = bVar.e(d2);
        return v50.v0(j, z0Var, e2, (e2 >= j || d2 >= bVar.k + -1) ? e2 : bVar.e(d2 + 1));
    }

    public int g(long j, List<? extends d10> list) {
        return (this.h != null || this.e.length() < 2) ? list.size() : this.e.g(j, list);
    }

    public void h(v00 v00) {
    }

    public final void i(long j, long j2, List<? extends d10> list, x00 x00) {
        int i;
        long j3 = j2;
        x00 x002 = x00;
        if (this.h == null) {
            d20 d20 = this.f;
            d20.b bVar = d20.f[this.b];
            if (bVar.k == 0) {
                x002.b = !d20.d;
                return;
            }
            if (list.isEmpty()) {
                i = bVar.d(j3);
                List<? extends d10> list2 = list;
            } else {
                i = (int) (((d10) list.get(list.size() - 1)).g() - ((long) this.g));
                if (i < 0) {
                    this.h = new vz();
                    return;
                }
            }
            if (i >= bVar.k) {
                x002.b = !this.f.d;
                return;
            }
            long j4 = j3 - j;
            long k = k(j);
            int length = this.e.length();
            e10[] e10Arr = new e10[length];
            for (int i2 = 0; i2 < length; i2++) {
                e10Arr[i2] = new C0083b(bVar, this.e.f(i2), i);
            }
            this.e.j(j, j4, k, list, e10Arr);
            long e2 = bVar.e(i);
            long c2 = e2 + bVar.c(i);
            if (!list.isEmpty()) {
                j3 = -9223372036854775807L;
            }
            long j5 = j3;
            int i3 = i + this.g;
            int b2 = this.e.b();
            w00 w00 = this.c[b2];
            Uri a2 = bVar.a(this.e.f(b2), i);
            x002.a = j(this.e.l(), this.d, a2, (String) null, i3, e2, c2, j5, this.e.m(), this.e.o(), w00);
        }
    }
}
