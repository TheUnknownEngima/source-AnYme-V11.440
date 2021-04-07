package defpackage;

import defpackage.tt;

/* renamed from: at  reason: default package */
public abstract class at {
    protected final a a;
    protected final f b;
    protected c c;
    private final int d;

    /* renamed from: at$a */
    public static class a implements tt {
        private final d a;
        private final long b;
        /* access modifiers changed from: private */
        public final long c;
        /* access modifiers changed from: private */
        public final long d;
        /* access modifiers changed from: private */
        public final long e;
        /* access modifiers changed from: private */
        public final long f;
        /* access modifiers changed from: private */
        public final long g;

        public a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        public boolean e() {
            return true;
        }

        public tt.a i(long j) {
            return new tt.a(new ut(j, c.h(this.a.a(j), this.c, this.d, this.e, this.f, this.g)));
        }

        public long j() {
            return this.b;
        }

        public long k(long j) {
            return this.a.a(j);
        }
    }

    /* renamed from: at$b */
    public static final class b implements d {
        public long a(long j) {
            return j;
        }
    }

    /* renamed from: at$c */
    protected static class c {
        private final long a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = h(j2, j3, j4, j5, j6, j7);
        }

        protected static long h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return v50.p(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* access modifiers changed from: private */
        public long i() {
            return this.g;
        }

        /* access modifiers changed from: private */
        public long j() {
            return this.f;
        }

        /* access modifiers changed from: private */
        public long k() {
            return this.h;
        }

        /* access modifiers changed from: private */
        public long l() {
            return this.a;
        }

        /* access modifiers changed from: private */
        public long m() {
            return this.b;
        }

        private void n() {
            this.h = h(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        /* access modifiers changed from: private */
        public void o(long j, long j2) {
            this.e = j;
            this.g = j2;
            n();
        }

        /* access modifiers changed from: private */
        public void p(long j, long j2) {
            this.d = j;
            this.f = j2;
            n();
        }
    }

    /* renamed from: at$d */
    protected interface d {
        long a(long j);
    }

    /* renamed from: at$e */
    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final long b;
        /* access modifiers changed from: private */
        public final long c;

        private e(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public static e d(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e e(long j) {
            return new e(0, -9223372036854775807L, j);
        }

        public static e f(long j, long j2) {
            return new e(-2, j, j2);
        }
    }

    /* renamed from: at$f */
    protected interface f {
        void a();

        e b(it itVar, long j);
    }

    protected at(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5, j6);
    }

    /* access modifiers changed from: protected */
    public c a(long j) {
        long j2 = j;
        return new c(j2, this.a.k(j2), this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
    }

    public final tt b() {
        return this.a;
    }

    public int c(it itVar, st stVar) {
        f fVar = this.b;
        q40.e(fVar);
        f fVar2 = fVar;
        while (true) {
            c cVar = this.c;
            q40.e(cVar);
            c cVar2 = cVar;
            long b2 = cVar2.j();
            long c2 = cVar2.i();
            long d2 = cVar2.k();
            if (c2 - b2 <= ((long) this.d)) {
                e(false, b2);
                return g(itVar, b2, stVar);
            } else if (!i(itVar, d2)) {
                return g(itVar, d2, stVar);
            } else {
                itVar.i();
                e b3 = fVar2.b(itVar, cVar2.m());
                int a2 = b3.a;
                if (a2 == -3) {
                    e(false, d2);
                    return g(itVar, d2, stVar);
                } else if (a2 == -2) {
                    cVar2.p(b3.b, b3.c);
                } else if (a2 == -1) {
                    cVar2.o(b3.b, b3.c);
                } else if (a2 == 0) {
                    e(true, b3.c);
                    i(itVar, b3.c);
                    return g(itVar, b3.c, stVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean d() {
        return this.c != null;
    }

    /* access modifiers changed from: protected */
    public final void e(boolean z, long j) {
        this.c = null;
        this.b.a();
        f(z, j);
    }

    /* access modifiers changed from: protected */
    public void f(boolean z, long j) {
    }

    /* access modifiers changed from: protected */
    public final int g(it itVar, long j, st stVar) {
        if (j == itVar.m()) {
            return 0;
        }
        stVar.a = j;
        return 1;
    }

    public final void h(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.l() != j) {
            this.c = a(j);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean i(it itVar, long j) {
        long m = j - itVar.m();
        if (m < 0 || m > 262144) {
            return false;
        }
        itVar.j((int) m);
        return true;
    }
}
