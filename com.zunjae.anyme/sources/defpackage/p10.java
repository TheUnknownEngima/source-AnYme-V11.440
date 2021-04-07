package defpackage;

import com.google.android.exoplayer2.f0;
import java.util.List;

/* renamed from: p10  reason: default package */
public abstract class p10 {
    final n10 a;
    final long b;
    final long c;

    /* renamed from: p10$a */
    public static abstract class a extends p10 {
        final long d;
        final long e;
        final List<d> f;

        public a(n10 n10, long j, long j2, long j3, long j4, List<d> list) {
            super(n10, j, j2);
            this.d = j3;
            this.e = j4;
            this.f = list;
        }

        public long c() {
            return this.d;
        }

        public abstract int d(long j);

        public final long e(long j, long j2) {
            List<d> list = this.f;
            if (list != null) {
                return (list.get((int) (j - this.d)).b * 1000000) / this.b;
            }
            int d2 = d(j2);
            return (d2 == -1 || j != (c() + ((long) d2)) - 1) ? (this.e * 1000000) / this.b : j2 - g(j);
        }

        public long f(long j, long j2) {
            long c = c();
            long d2 = (long) d(j2);
            if (d2 == 0) {
                return c;
            }
            if (this.f == null) {
                long j3 = this.d + (j / ((this.e * 1000000) / this.b));
                return j3 < c ? c : d2 == -1 ? j3 : Math.min(j3, (c + d2) - 1);
            }
            long j4 = (d2 + c) - 1;
            long j5 = c;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                int i = (g(j6) > j ? 1 : (g(j6) == j ? 0 : -1));
                if (i < 0) {
                    j5 = j6 + 1;
                } else if (i <= 0) {
                    return j6;
                } else {
                    j4 = j6 - 1;
                }
            }
            return j5 == c ? j5 : j4;
        }

        public final long g(long j) {
            List<d> list = this.f;
            return v50.w0(list != null ? list.get((int) (j - this.d)).a - this.c : (j - this.d) * this.e, 1000000, this.b);
        }

        public abstract n10 h(o10 o10, long j);

        public boolean i() {
            return this.f != null;
        }
    }

    /* renamed from: p10$b */
    public static class b extends a {
        final List<n10> g;

        public b(n10 n10, long j, long j2, long j3, long j4, List<d> list, List<n10> list2) {
            super(n10, j, j2, j3, j4, list);
            this.g = list2;
        }

        public int d(long j) {
            return this.g.size();
        }

        public n10 h(o10 o10, long j) {
            return this.g.get((int) (j - this.d));
        }

        public boolean i() {
            return true;
        }
    }

    /* renamed from: p10$c */
    public static class c extends a {
        final r10 g;
        final r10 h;
        final long i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(n10 n10, long j, long j2, long j3, long j4, long j5, List<d> list, r10 r10, r10 r102) {
            super(n10, j, j2, j3, j5, list);
            this.g = r10;
            this.h = r102;
            this.i = j4;
        }

        public n10 a(o10 o10) {
            r10 r10 = this.g;
            if (r10 == null) {
                return p10.super.a(o10);
            }
            f0 f0Var = o10.a;
            return new n10(r10.a(f0Var.e, 0, f0Var.i, 0), 0, -1);
        }

        public int d(long j) {
            List<d> list = this.f;
            if (list != null) {
                return list.size();
            }
            long j2 = this.i;
            if (j2 != -1) {
                return (int) ((j2 - this.d) + 1);
            }
            if (j != -9223372036854775807L) {
                return (int) v50.j(j, (this.e * 1000000) / this.b);
            }
            return -1;
        }

        public n10 h(o10 o10, long j) {
            List<d> list = this.f;
            long j2 = list != null ? list.get((int) (j - this.d)).a : (j - this.d) * this.e;
            r10 r10 = this.h;
            f0 f0Var = o10.a;
            return new n10(r10.a(f0Var.e, j, f0Var.i, j2), 0, -1);
        }
    }

    /* renamed from: p10$d */
    public static class d {
        final long a;
        final long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    /* renamed from: p10$e */
    public static class e extends p10 {
        final long d;
        final long e;

        public e() {
            this((n10) null, 1, 0, 0, 0);
        }

        public e(n10 n10, long j, long j2, long j3, long j4) {
            super(n10, j, j2);
            this.d = j3;
            this.e = j4;
        }

        public n10 c() {
            long j = this.e;
            if (j <= 0) {
                return null;
            }
            return new n10((String) null, this.d, j);
        }
    }

    public p10(n10 n10, long j, long j2) {
        this.a = n10;
        this.b = j;
        this.c = j2;
    }

    public n10 a(o10 o10) {
        return this.a;
    }

    public long b() {
        return v50.w0(this.c, 1000000, this.b);
    }
}
