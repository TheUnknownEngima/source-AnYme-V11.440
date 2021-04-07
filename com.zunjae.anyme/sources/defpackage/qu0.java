package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: qu0  reason: default package */
final class qu0<T> extends uu0<T> {
    static final qu0<Object> e = new qu0<>();

    private qu0() {
    }

    public final boolean b() {
        return false;
    }

    public final T c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
