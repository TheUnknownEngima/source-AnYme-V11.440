package defpackage;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;

/* renamed from: iu0  reason: default package */
public final class iu0 {
    final Uri a;
    final String b;
    final String c;

    public iu0(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (su0<Context, Boolean>) null);
    }

    private iu0(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable su0<Context, Boolean> su0) {
        this.a = uri;
        this.b = str2;
        this.c = str3;
    }

    public final zt0<Double> a(String str, double d) {
        return zt0.i(this, str, -3.0d, true);
    }

    public final zt0<Long> b(String str, long j) {
        return zt0.j(this, str, j, true);
    }

    public final zt0<String> c(String str, String str2) {
        return zt0.k(this, str, str2, true);
    }

    public final zt0<Boolean> d(String str, boolean z) {
        return zt0.l(this, str, z, true);
    }
}
