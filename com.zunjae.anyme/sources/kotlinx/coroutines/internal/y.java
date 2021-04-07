package kotlinx.coroutines.internal;

import defpackage.n42;
import kotlinx.coroutines.j2;

public final class y {
    private static final u a = new u("ZERO");
    private static final d62<Object, n42.b, Object> b = a.f;
    private static final d62<j2<?>, n42.b, j2<?>> c = b.f;
    private static final d62<b0, n42.b, b0> d = d.f;
    private static final d62<b0, n42.b, b0> e = c.f;

    static final class a extends w62 implements d62<Object, n42.b, Object> {
        public static final a f = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object G(Object obj, n42.b bVar) {
            v62.f(bVar, "element");
            if (!(bVar instanceof j2)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends w62 implements d62<j2<?>, n42.b, j2<?>> {
        public static final b f = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final j2<?> G(j2<?> j2Var, n42.b bVar) {
            v62.f(bVar, "element");
            if (j2Var != null) {
                return j2Var;
            }
            if (!(bVar instanceof j2)) {
                bVar = null;
            }
            return (j2) bVar;
        }
    }

    static final class c extends w62 implements d62<b0, n42.b, b0> {
        public static final c f = new c();

        c() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            b0 b0Var = (b0) obj;
            a(b0Var, (n42.b) obj2);
            return b0Var;
        }

        public final b0 a(b0 b0Var, n42.b bVar) {
            v62.f(b0Var, "state");
            v62.f(bVar, "element");
            if (bVar instanceof j2) {
                ((j2) bVar).F(b0Var.b(), b0Var.d());
            }
            return b0Var;
        }
    }

    static final class d extends w62 implements d62<b0, n42.b, b0> {
        public static final d f = new d();

        d() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object G(Object obj, Object obj2) {
            b0 b0Var = (b0) obj;
            a(b0Var, (n42.b) obj2);
            return b0Var;
        }

        public final b0 a(b0 b0Var, n42.b bVar) {
            v62.f(b0Var, "state");
            v62.f(bVar, "element");
            if (bVar instanceof j2) {
                b0Var.a(((j2) bVar).L(b0Var.b()));
            }
            return b0Var;
        }
    }

    public static final void a(n42 n42, Object obj) {
        v62.f(n42, "context");
        if (obj != a) {
            if (obj instanceof b0) {
                ((b0) obj).c();
                n42.fold(obj, e);
                return;
            }
            Object fold = n42.fold(null, c);
            if (fold != null) {
                ((j2) fold).F(n42, obj);
                return;
            }
            throw new r22("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object b(n42 n42) {
        v62.f(n42, "context");
        Object fold = n42.fold(0, b);
        if (fold != null) {
            return fold;
        }
        v62.l();
        throw null;
    }

    public static final Object c(n42 n42, Object obj) {
        v62.f(n42, "context");
        if (obj == null) {
            obj = b(n42);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return n42.fold(new b0(n42, ((Number) obj).intValue()), d);
        }
        if (obj != null) {
            return ((j2) obj).L(n42);
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }
}
