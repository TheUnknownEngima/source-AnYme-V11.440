package defpackage;

/* renamed from: rw0  reason: default package */
final class rw0<E> extends dw0<E> {
    private final transient E g;
    private transient int h;

    rw0(E e) {
        tu0.b(e);
        this.g = e;
    }

    rw0(E e, int i) {
        this.g = e;
        this.h = i;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.g;
        return i + 1;
    }

    /* renamed from: c */
    public final qw0<E> iterator() {
        return new ew0(this.g);
    }

    public final boolean contains(Object obj) {
        return this.g.equals(obj);
    }

    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int hashCode = this.g.hashCode();
        this.h = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final tv0<E> l() {
        return tv0.k(this.g);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final boolean zza() {
        return this.h != 0;
    }
}
