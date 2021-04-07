package defpackage;

import defpackage.n42;

/* renamed from: l42  reason: default package */
public interface l42 extends n42.b {
    public static final b b = b.a;

    /* renamed from: l42$a */
    public static final class a {
        public static <E extends n42.b> E a(l42 l42, n42.c<E> cVar) {
            v62.e(cVar, "key");
            if (cVar instanceof i42) {
                i42 i42 = (i42) cVar;
                if (!i42.a(l42.getKey())) {
                    return null;
                }
                E b = i42.b(l42);
                if (!(b instanceof n42.b)) {
                    return null;
                }
                return b;
            } else if (l42.b != cVar) {
                return null;
            } else {
                if (l42 != null) {
                    return l42;
                }
                throw new NullPointerException("null cannot be cast to non-null type E");
            }
        }

        public static n42 b(l42 l42, n42.c<?> cVar) {
            v62.e(cVar, "key");
            if (!(cVar instanceof i42)) {
                return l42.b == cVar ? o42.e : l42;
            }
            i42 i42 = (i42) cVar;
            return (!i42.a(l42.getKey()) || i42.b(l42) == null) ? l42 : o42.e;
        }

        public static void c(l42 l42, k42<?> k42) {
            v62.e(k42, "continuation");
        }
    }

    /* renamed from: l42$b */
    public static final class b implements n42.c<l42> {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    void a(k42<?> k42);

    <T> k42<T> h(k42<? super T> k42);
}
