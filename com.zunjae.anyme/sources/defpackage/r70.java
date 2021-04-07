package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.cast.a0;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.q;

/* renamed from: r70  reason: default package */
public final class r70 extends e<a.d.c> {
    private static final a.g<x70> i = new a.g<>();
    private static final a.C0087a<x70, a.d.c> j;
    private static final a<a.d.c> k;

    static {
        v70 v70 = new v70();
        j = v70;
        k = new a<>("CastApi.API", v70, i);
    }

    public r70(Context context) {
        super(context, k, null, e.a.c);
    }

    public final e81<Bundle> x(String[] strArr) {
        q.a a = q.a();
        a.b(new u70(this, strArr));
        a.d(a0.d);
        a.c(false);
        return d(a.a());
    }

    public final e81<Bundle> y(String[] strArr) {
        q.a a = q.a();
        a.b(new t70(this, strArr));
        a.d(a0.g);
        a.c(false);
        return d(a.a());
    }
}
