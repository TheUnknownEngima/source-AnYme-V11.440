package defpackage;

/* renamed from: n42  reason: default package */
public interface n42 {

    /* renamed from: n42$a */
    public static final class a {

        /* renamed from: n42$a$a  reason: collision with other inner class name */
        static final class C0252a extends w62 implements d62<n42, b, n42> {
            public static final C0252a f = new C0252a();

            C0252a() {
                super(2);
            }

            /* renamed from: a */
            public final n42 G(n42 n42, b bVar) {
                v62.e(n42, "acc");
                v62.e(bVar, "element");
                n42 minusKey = n42.minusKey(bVar.getKey());
                if (minusKey == o42.e) {
                    return bVar;
                }
                l42 l42 = (l42) minusKey.get(l42.b);
                if (l42 == null) {
                    return new j42(minusKey, bVar);
                }
                n42 minusKey2 = minusKey.minusKey(l42.b);
                return minusKey2 == o42.e ? new j42(bVar, l42) : new j42(new j42(minusKey2, bVar), l42);
            }
        }

        public static n42 a(n42 n42, n42 n422) {
            v62.e(n422, "context");
            return n422 == o42.e ? n42 : (n42) n422.fold(n42, C0252a.f);
        }
    }

    /* renamed from: n42$b */
    public interface b extends n42 {

        /* renamed from: n42$b$a */
        public static final class a {
            public static <R> R a(b bVar, R r, d62<? super R, ? super b, ? extends R> d62) {
                v62.e(d62, "operation");
                return d62.G(r, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                v62.e(cVar, "key");
                if (!v62.a(bVar.getKey(), cVar)) {
                    return null;
                }
                if (bVar != null) {
                    return bVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type E");
            }

            public static n42 c(b bVar, c<?> cVar) {
                v62.e(cVar, "key");
                return v62.a(bVar.getKey(), cVar) ? o42.e : bVar;
            }

            public static n42 d(b bVar, n42 n42) {
                v62.e(n42, "context");
                return a.a(bVar, n42);
            }
        }

        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* renamed from: n42$c */
    public interface c<E extends b> {
    }

    <R> R fold(R r, d62<? super R, ? super b, ? extends R> d62);

    <E extends b> E get(c<E> cVar);

    n42 minusKey(c<?> cVar);

    n42 plus(n42 n42);
}
