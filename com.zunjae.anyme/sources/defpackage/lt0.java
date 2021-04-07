package defpackage;

import android.content.Context;
import javax.annotation.Nullable;

/* renamed from: lt0  reason: default package */
final class lt0 extends hu0 {
    private final Context a;
    private final yu0<uu0<ut0>> b;

    lt0(Context context, @Nullable yu0<uu0<ut0>> yu0) {
        if (context != null) {
            this.a = context;
            this.b = yu0;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final yu0<uu0<ut0>> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hu0) {
            hu0 hu0 = (hu0) obj;
            if (this.a.equals(hu0.a())) {
                yu0<uu0<ut0>> yu0 = this.b;
                yu0<uu0<ut0>> b2 = hu0.b();
                return yu0 != null ? yu0.equals(b2) : b2 == null;
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        yu0<uu0<ut0>> yu0 = this.b;
        return hashCode ^ (yu0 == null ? 0 : yu0.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
