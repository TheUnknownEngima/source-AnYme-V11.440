package defpackage;

import java.util.Iterator;

/* renamed from: k82  reason: default package */
class k82 extends j82 {

    /* renamed from: k82$a */
    public static final class a implements g82<T> {
        final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        public Iterator<T> iterator() {
            return this.a;
        }
    }

    public static <T> g82<T> a(Iterator<? extends T> it) {
        v62.e(it, "$this$asSequence");
        return b(new a(it));
    }

    public static final <T> g82<T> b(g82<? extends T> g82) {
        v62.e(g82, "$this$constrainOnce");
        return g82 instanceof e82 ? (e82) g82 : new e82(g82);
    }

    public static <T> g82<T> c() {
        return f82.a;
    }
}
