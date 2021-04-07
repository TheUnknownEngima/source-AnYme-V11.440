package io.github.inflationx.viewpump;

import java.util.ArrayList;
import java.util.List;

public final class e {
    /* access modifiers changed from: private */
    public static e f;
    public static final c g = new c((r62) null);
    private final List<d> a;
    private final List<d> b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public static final class a {
        private final List<d> a = new ArrayList();
        private boolean b = true;
        private boolean c = true;
        private boolean d;

        public final a a(d dVar) {
            v62.f(dVar, "interceptor");
            this.a.add(dVar);
            return this;
        }

        public final e b() {
            return new e(n32.a0(this.a), this.b, this.c, this.d, (r62) null);
        }
    }

    static final class b extends w62 implements o52<w02> {
        public static final b f = new b();

        b() {
            super(0);
        }

        /* renamed from: a */
        public final w02 invoke() {
            return new w02();
        }
    }

    public static final class c {
        static {
            f72.f(new c72(f72.b(c.class), "reflectiveFallbackViewCreator", "getReflectiveFallbackViewCreator()Lio/github/inflationx/viewpump/FallbackViewCreator;"));
        }

        private c() {
        }

        public /* synthetic */ c(r62 r62) {
            this();
        }

        public final a a() {
            return new a();
        }

        public final e b() {
            e a = e.f;
            if (a != null) {
                return a;
            }
            e b = a().b();
            e.f = b;
            return b;
        }

        public final void c(e eVar) {
            e.f = eVar;
        }
    }

    static {
        d22<T> unused = g22.b(b.f);
    }

    private e(List<? extends d> list, boolean z, boolean z2, boolean z3) {
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.a = n32.d0(n32.P(list, new t02()));
    }

    public /* synthetic */ e(List list, boolean z, boolean z2, boolean z3, r62 r62) {
        this(list, z, z2, z3);
    }

    public final c c(b bVar) {
        v62.f(bVar, "originalRequest");
        return new u02(this.a, 0, bVar).j(bVar);
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean f() {
        return this.e;
    }
}
