package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: cv0  reason: default package */
final class cv0<T> implements yu0<T>, Serializable {
    @NullableDecl
    private final T e;

    cv0(@NullableDecl T t) {
        this.e = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof cv0) {
            return ru0.a(this.e, ((cv0) obj).e);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final T zza() {
        return this.e;
    }
}
