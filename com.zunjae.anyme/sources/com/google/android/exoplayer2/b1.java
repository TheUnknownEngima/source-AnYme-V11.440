package com.google.android.exoplayer2;

import android.util.Pair;
import defpackage.r00;

public abstract class b1 {
    public static final b1 a = new a();

    class a extends b1 {
        a() {
        }

        public int b(Object obj) {
            return -1;
        }

        public b g(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        public int i() {
            return 0;
        }

        public Object m(int i) {
            throw new IndexOutOfBoundsException();
        }

        public c o(int i, c cVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        public int p() {
            return 0;
        }
    }

    public static final class b {
        public Object a;
        public Object b;
        public int c;
        public long d;
        private long e;
        private r00 f = r00.f;

        public int a(int i) {
            return this.f.c[i].a;
        }

        public long b(int i, int i2) {
            r00.a aVar = this.f.c[i];
            if (aVar.a != -1) {
                return aVar.d[i2];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f.a;
        }

        public int d(long j) {
            return this.f.a(j, this.d);
        }

        public int e(long j) {
            return this.f.b(j, this.d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return v50.b(this.a, bVar.a) && v50.b(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && v50.b(this.f, bVar.f);
        }

        public long f(int i) {
            return this.f.b[i];
        }

        public long g() {
            return this.f.d;
        }

        public long h() {
            return this.d;
        }

        public int hashCode() {
            Object obj = this.a;
            int i = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int hashCode2 = obj2 == null ? 0 : obj2.hashCode();
            long j = this.d;
            long j2 = this.e;
            int i2 = (((((((hashCode + hashCode2) * 31) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            r00 r00 = this.f;
            if (r00 != null) {
                i = r00.hashCode();
            }
            return i2 + i;
        }

        public int i(int i) {
            return this.f.c[i].a();
        }

        public int j(int i, int i2) {
            return this.f.c[i].b(i2);
        }

        public long k() {
            return v.b(this.e);
        }

        public long l() {
            return this.e;
        }

        public boolean m(int i) {
            return !this.f.c[i].c();
        }

        public boolean n(int i, int i2) {
            r00.a aVar = this.f.c[i];
            return (aVar.a == -1 || aVar.c[i2] == 0) ? false : true;
        }

        public b o(Object obj, Object obj2, int i, long j, long j2) {
            p(obj, obj2, i, j, j2, r00.f);
            return this;
        }

        public b p(Object obj, Object obj2, int i, long j, long j2, r00 r00) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.f = r00;
            return this;
        }
    }

    public static final class c {
        public static final Object n = new Object();
        public Object a = n;
        public Object b;
        public Object c;
        public long d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public long k;
        public long l;
        public long m;

        public long a() {
            return v.b(this.k);
        }

        public long b() {
            return this.k;
        }

        public long c() {
            return v.b(this.l);
        }

        public long d() {
            return this.m;
        }

        public c e(Object obj, Object obj2, Object obj3, long j2, long j3, boolean z, boolean z2, boolean z3, long j4, long j5, int i2, int i3, long j6) {
            this.a = obj;
            this.b = obj2;
            this.c = obj3;
            this.d = j2;
            this.e = j3;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.k = j4;
            this.l = j5;
            this.i = i2;
            this.j = i3;
            this.m = j6;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return v50.b(this.a, cVar.a) && v50.b(this.b, cVar.b) && v50.b(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.k == cVar.k && this.l == cVar.l && this.i == cVar.i && this.j == cVar.j && this.m == cVar.m;
        }

        public int hashCode() {
            int hashCode = (217 + this.a.hashCode()) * 31;
            Object obj = this.b;
            int i2 = 0;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.c;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            long j2 = this.d;
            long j3 = this.e;
            long j4 = this.k;
            long j5 = this.l;
            long j6 = this.m;
            return ((((((((((((((((((((hashCode2 + i2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.i) * 31) + this.j) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    public int a(boolean z) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i, b bVar, c cVar, int i2, boolean z) {
        int i3 = f(i, bVar).c;
        if (n(i3, cVar).j != i) {
            return i + 1;
        }
        int e = e(i3, i2, z);
        if (e == -1) {
            return -1;
        }
        return n(e, cVar).i;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == c(z) ? a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (b1Var.p() != p() || b1Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i = 0; i < p(); i++) {
            if (!n(i, cVar).equals(b1Var.n(i, cVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < i(); i2++) {
            if (!g(i2, bVar, true).equals(b1Var.g(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public final b f(int i, b bVar) {
        return g(i, bVar, false);
    }

    public abstract b g(int i, b bVar, boolean z);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        int i;
        c cVar = new c();
        b bVar = new b();
        int p = 217 + p();
        int i2 = 0;
        while (true) {
            i = p * 31;
            if (i2 >= p()) {
                break;
            }
            p = i + n(i2, cVar).hashCode();
            i2++;
        }
        int i3 = i + i();
        for (int i4 = 0; i4 < i(); i4++) {
            i3 = (i3 * 31) + g(i4, bVar, true).hashCode();
        }
        return i3;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i, long j) {
        Pair<Object, Long> k = k(cVar, bVar, i, j, 0);
        q40.e(k);
        return k;
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i, long j, long j2) {
        q40.c(i, 0, p());
        o(i, cVar, j2);
        if (j == -9223372036854775807L) {
            j = cVar.b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = cVar.i;
        long d = cVar.d() + j;
        while (true) {
            long h = g(i2, bVar, true).h();
            if (h == -9223372036854775807L || d < h || i2 >= cVar.j) {
                Object obj = bVar.b;
                q40.e(obj);
            } else {
                d -= h;
                i2++;
            }
        }
        Object obj2 = bVar.b;
        q40.e(obj2);
        return Pair.create(obj2, Long.valueOf(d));
    }

    public int l(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == a(z) ? c(z) : i - 1;
            }
            throw new IllegalStateException();
        } else if (i == a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object m(int i);

    public final c n(int i, c cVar) {
        return o(i, cVar, 0);
    }

    public abstract c o(int i, c cVar, long j);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }

    public final boolean r(int i, b bVar, c cVar, int i2, boolean z) {
        return d(i, bVar, cVar, i2, z) == -1;
    }
}
