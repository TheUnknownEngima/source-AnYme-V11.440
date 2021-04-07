package com.google.android.gms.cast;

import android.content.Context;
import com.google.android.gms.common.api.a;

public final class g {
    private static final a.C0087a<fb0, a> a;
    @Deprecated
    public static final com.google.android.gms.common.api.a<a> b;

    @Deprecated
    public static final class a implements a.d {
        final CastDevice a;
        final b b;
        final int c;
    }

    @Deprecated
    public interface b {
    }

    static {
        x1 x1Var = new x1();
        a = x1Var;
        b = new com.google.android.gms.common.api.a<>("CastRemoteDisplay.API", x1Var, g70.c);
        new db0(b);
    }

    public static h a(Context context) {
        return new h(context);
    }
}
