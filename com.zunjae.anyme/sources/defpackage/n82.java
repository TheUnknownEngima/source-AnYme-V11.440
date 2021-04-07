package defpackage;

import java.util.Iterator;

/* renamed from: n82  reason: default package */
public final class n82<T, R> implements g82<R> {
    /* access modifiers changed from: private */
    public final g82<T> a;
    /* access modifiers changed from: private */
    public final z52<T, R> b;

    /* renamed from: n82$a */
    public static final class a implements Iterator<R>, j72 {
        private final Iterator<T> e;
        final /* synthetic */ n82 f;

        a(n82 n82) {
            this.f = n82;
            this.e = n82.a.iterator();
        }

        public boolean hasNext() {
            return this.e.hasNext();
        }

        public R next() {
            return this.f.b.r(this.e.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n82(g82<? extends T> g82, z52<? super T, ? extends R> z52) {
        v62.e(g82, "sequence");
        v62.e(z52, "transformer");
        this.a = g82;
        this.b = z52;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
