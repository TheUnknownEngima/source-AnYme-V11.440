package defpackage;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: zu0  reason: default package */
final class zu0<T> implements yu0<T> {
    private volatile yu0<T> e;
    private volatile boolean f;
    @NullableDecl
    private T g;

    zu0(yu0<T> yu0) {
        tu0.b(yu0);
        this.e = yu0;
    }

    public final String toString() {
        Object obj = this.e;
        if (obj == null) {
            String valueOf = String.valueOf(this.g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    public final T zza() {
        if (!this.f) {
            synchronized (this) {
                if (!this.f) {
                    T zza = this.e.zza();
                    this.g = zza;
                    this.f = true;
                    this.e = null;
                    return zza;
                }
            }
        }
        return this.g;
    }
}
