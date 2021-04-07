package defpackage;

/* renamed from: bm  reason: default package */
public final class bm<K, V> extends b0<K, V> {
    private int m;

    public void clear() {
        this.m = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.m == 0) {
            this.m = super.hashCode();
        }
        return this.m;
    }

    public void j(h0<? extends K, ? extends V> h0Var) {
        this.m = 0;
        super.j(h0Var);
    }

    public V k(int i) {
        this.m = 0;
        return super.k(i);
    }

    public V l(int i, V v) {
        this.m = 0;
        return super.l(i, v);
    }

    public V put(K k, V v) {
        this.m = 0;
        return super.put(k, v);
    }
}
