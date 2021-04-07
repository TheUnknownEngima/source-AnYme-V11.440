package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: wu0  reason: default package */
final class wu0<T> extends uu0<T> {
    private final T e;

    wu0(T t) {
        this.e = t;
    }

    public final boolean b() {
        return true;
    }

    public final T c() {
        return this.e;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof wu0) {
            return this.e.equals(((wu0) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
