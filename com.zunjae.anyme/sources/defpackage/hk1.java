package defpackage;

import defpackage.rl1;

/* renamed from: hk1  reason: default package */
public class hk1<K, V> {
    private final a<K, V> a;

    /* renamed from: hk1$a */
    static class a<K, V> {
        public final rl1.b a;
        public final K b;
        public final rl1.b c;
        public final V d;
    }

    static <K, V> int b(a<K, V> aVar, K k, V v) {
        return rj1.d(aVar.a, 1, k) + rj1.d(aVar.c, 2, v);
    }

    static <K, V> void d(hj1 hj1, a<K, V> aVar, K k, V v) {
        rj1.z(hj1, aVar.a, 1, k);
        rj1.z(hj1, aVar.c, 2, v);
    }

    public int a(int i, K k, V v) {
        return hj1.U(i) + hj1.C(b(this.a, k, v));
    }

    /* access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.a;
    }
}
