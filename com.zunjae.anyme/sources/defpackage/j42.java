package defpackage;

import defpackage.n42;
import java.io.Serializable;

/* renamed from: j42  reason: default package */
public final class j42 implements n42, Serializable {
    private final n42 e;
    private final n42.b f;

    /* renamed from: j42$a */
    static final class a extends w62 implements d62<String, n42.b, String> {
        public static final a f = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final String G(String str, n42.b bVar) {
            v62.e(str, "acc");
            v62.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public j42(n42 n42, n42.b bVar) {
        v62.e(n42, "left");
        v62.e(bVar, "element");
        this.e = n42;
        this.f = bVar;
    }

    private final boolean c(n42.b bVar) {
        return v62.a(get(bVar.getKey()), bVar);
    }

    private final boolean d(j42 j42) {
        while (c(j42.f)) {
            n42 n42 = j42.e;
            if (n42 instanceof j42) {
                j42 = (j42) n42;
            } else if (n42 != null) {
                return c((n42.b) n42);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            }
        }
        return false;
    }

    private final int e() {
        int i = 2;
        j42 j42 = this;
        while (true) {
            n42 n42 = j42.e;
            if (!(n42 instanceof j42)) {
                n42 = null;
            }
            j42 = (j42) n42;
            if (j42 == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j42) {
                j42 j42 = (j42) obj;
                if (j42.e() != e() || !j42.d(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, d62<? super R, ? super n42.b, ? extends R> d62) {
        v62.e(d62, "operation");
        return d62.G(this.e.fold(r, d62), this.f);
    }

    public <E extends n42.b> E get(n42.c<E> cVar) {
        v62.e(cVar, "key");
        j42 j42 = this;
        while (true) {
            E e2 = j42.f.get(cVar);
            if (e2 != null) {
                return e2;
            }
            n42 n42 = j42.e;
            if (!(n42 instanceof j42)) {
                return n42.get(cVar);
            }
            j42 = (j42) n42;
        }
    }

    public int hashCode() {
        return this.e.hashCode() + this.f.hashCode();
    }

    public n42 minusKey(n42.c<?> cVar) {
        v62.e(cVar, "key");
        if (this.f.get(cVar) != null) {
            return this.e;
        }
        n42 minusKey = this.e.minusKey(cVar);
        return minusKey == this.e ? this : minusKey == o42.e ? this.f : new j42(minusKey, this.f);
    }

    public n42 plus(n42 n42) {
        v62.e(n42, "context");
        return n42.a.a(this, n42);
    }

    public String toString() {
        return "[" + ((String) fold("", a.f)) + "]";
    }
}
