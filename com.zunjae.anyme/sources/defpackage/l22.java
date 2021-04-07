package defpackage;

import java.io.Serializable;

/* renamed from: l22  reason: default package */
public final class l22<A, B> implements Serializable {
    private final A e;
    private final B f;

    public l22(A a, B b) {
        this.e = a;
        this.f = b;
    }

    public final A a() {
        return this.e;
    }

    public final B b() {
        return this.f;
    }

    public final A c() {
        return this.e;
    }

    public final B d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l22)) {
            return false;
        }
        l22 l22 = (l22) obj;
        return v62.a(this.e, l22.e) && v62.a(this.f, l22.f);
    }

    public int hashCode() {
        A a = this.e;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return '(' + this.e + ", " + this.f + ')';
    }
}
