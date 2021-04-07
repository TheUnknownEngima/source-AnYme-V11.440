package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: pw0  reason: default package */
final class pw0<E> extends dw0<E> {
    static final pw0<Object> l = new pw0(new Object[0], 0, (Object[]) null, 0, 0);
    private final transient Object[] g;
    private final transient Object[] h;
    private final transient int i;
    private final transient int j;
    private final transient int k;

    pw0(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.g = objArr;
        this.h = objArr2;
        this.i = i3;
        this.j = i2;
        this.k = i4;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.g, 0, objArr, i2, this.k);
        return i2 + this.k;
    }

    /* renamed from: c */
    public final qw0<E> iterator() {
        return (qw0) k().iterator();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.h;
        if (obj == null || objArr == null) {
            return false;
        }
        int b = rv0.b(obj);
        while (true) {
            int i2 = b & this.i;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final Object[] d() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        return this.k;
    }

    public final int hashCode() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final tv0<E> l() {
        return tv0.m(this.g, this.k);
    }

    public final int size() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza() {
        return true;
    }
}
