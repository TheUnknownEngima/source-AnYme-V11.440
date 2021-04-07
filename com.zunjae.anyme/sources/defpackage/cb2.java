package defpackage;

import defpackage.sa2;
import java.io.Closeable;
import javax.annotation.Nullable;

/* renamed from: cb2  reason: default package */
public final class cb2 implements Closeable {
    final ab2 e;
    final ya2 f;
    final int g;
    final String h;
    @Nullable
    final ra2 i;
    final sa2 j;
    @Nullable
    final db2 k;
    @Nullable
    final cb2 l;
    @Nullable
    final cb2 m;
    @Nullable
    final cb2 n;
    final long o;
    final long p;
    @Nullable
    private volatile da2 q;

    /* renamed from: cb2$a */
    public static class a {
        @Nullable
        ab2 a;
        @Nullable
        ya2 b;
        int c;
        String d;
        @Nullable
        ra2 e;
        sa2.a f;
        @Nullable
        db2 g;
        @Nullable
        cb2 h;
        @Nullable
        cb2 i;
        @Nullable
        cb2 j;
        long k;
        long l;

        public a() {
            this.c = -1;
            this.f = new sa2.a();
        }

        a(cb2 cb2) {
            this.c = -1;
            this.a = cb2.e;
            this.b = cb2.f;
            this.c = cb2.g;
            this.d = cb2.h;
            this.e = cb2.i;
            this.f = cb2.j.f();
            this.g = cb2.k;
            this.h = cb2.l;
            this.i = cb2.m;
            this.j = cb2.n;
            this.k = cb2.o;
            this.l = cb2.p;
        }

        private void e(cb2 cb2) {
            if (cb2.k != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private void f(String str, cb2 cb2) {
            if (cb2.k != null) {
                throw new IllegalArgumentException(str + ".body != null");
            } else if (cb2.l != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            } else if (cb2.m != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            } else if (cb2.n != null) {
                throw new IllegalArgumentException(str + ".priorResponse != null");
            }
        }

        public a a(String str, String str2) {
            this.f.a(str, str2);
            return this;
        }

        public a b(@Nullable db2 db2) {
            this.g = db2;
            return this;
        }

        public cb2 c() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c < 0) {
                throw new IllegalStateException("code < 0: " + this.c);
            } else if (this.d != null) {
                return new cb2(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public a d(@Nullable cb2 cb2) {
            if (cb2 != null) {
                f("cacheResponse", cb2);
            }
            this.i = cb2;
            return this;
        }

        public a g(int i2) {
            this.c = i2;
            return this;
        }

        public a h(@Nullable ra2 ra2) {
            this.e = ra2;
            return this;
        }

        public a i(String str, String str2) {
            this.f.g(str, str2);
            return this;
        }

        public a j(sa2 sa2) {
            this.f = sa2.f();
            return this;
        }

        public a k(String str) {
            this.d = str;
            return this;
        }

        public a l(@Nullable cb2 cb2) {
            if (cb2 != null) {
                f("networkResponse", cb2);
            }
            this.h = cb2;
            return this;
        }

        public a m(@Nullable cb2 cb2) {
            if (cb2 != null) {
                e(cb2);
            }
            this.j = cb2;
            return this;
        }

        public a n(ya2 ya2) {
            this.b = ya2;
            return this;
        }

        public a o(long j2) {
            this.l = j2;
            return this;
        }

        public a p(ab2 ab2) {
            this.a = ab2;
            return this;
        }

        public a q(long j2) {
            this.k = j2;
            return this;
        }
    }

    cb2(a aVar) {
        this.e = aVar.a;
        this.f = aVar.b;
        this.g = aVar.c;
        this.h = aVar.d;
        this.i = aVar.e;
        this.j = aVar.f.d();
        this.k = aVar.g;
        this.l = aVar.h;
        this.m = aVar.i;
        this.n = aVar.j;
        this.o = aVar.k;
        this.p = aVar.l;
    }

    public a A() {
        return new a(this);
    }

    @Nullable
    public cb2 B() {
        return this.n;
    }

    public ya2 C() {
        return this.f;
    }

    public long E() {
        return this.p;
    }

    public ab2 F() {
        return this.e;
    }

    public long G() {
        return this.o;
    }

    @Nullable
    public db2 a() {
        return this.k;
    }

    public da2 b() {
        da2 da2 = this.q;
        if (da2 != null) {
            return da2;
        }
        da2 k2 = da2.k(this.j);
        this.q = k2;
        return k2;
    }

    public void close() {
        db2 db2 = this.k;
        if (db2 != null) {
            db2.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public int h() {
        return this.g;
    }

    @Nullable
    public ra2 i() {
        return this.i;
    }

    @Nullable
    public String k(String str) {
        return l(str, (String) null);
    }

    @Nullable
    public String l(String str, @Nullable String str2) {
        String c = this.j.c(str);
        return c != null ? c : str2;
    }

    public sa2 m() {
        return this.j;
    }

    public boolean r() {
        int i2 = this.g;
        return i2 >= 200 && i2 < 300;
    }

    public String t() {
        return this.h;
    }

    public String toString() {
        return "Response{protocol=" + this.f + ", code=" + this.g + ", message=" + this.h + ", url=" + this.e.j() + '}';
    }

    @Nullable
    public cb2 z() {
        return this.l;
    }
}
