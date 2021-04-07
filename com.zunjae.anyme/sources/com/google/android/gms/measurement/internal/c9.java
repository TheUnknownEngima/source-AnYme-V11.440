package com.google.android.gms.measurement.internal;

import android.util.Pair;
import defpackage.c60;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class c9 extends u9 {
    private String d;
    private boolean e;
    private long f;

    c9(x9 x9Var) {
        super(x9Var);
    }

    @Deprecated
    private final Pair<String, Boolean> w(String str) {
        b();
        long a = l().a();
        if (this.d != null && a < this.f) {
            return new Pair<>(this.d, Boolean.valueOf(this.e));
        }
        this.f = a + j().A(str);
        c60.d(true);
        try {
            c60.a b = c60.b(n());
            if (b != null) {
                this.d = b.a();
                this.e = b.b();
            }
            if (this.d == null) {
                this.d = "";
            }
        } catch (Exception e2) {
            h().L().b("Unable to get advertising id", e2);
            this.d = "";
        }
        c60.d(false);
        return new Pair<>(this.d, Boolean.valueOf(this.e));
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> u(String str, e eVar) {
        return (!c31.a() || !j().s(u.Q0) || eVar.o()) ? w(str) : new Pair<>("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final String v(String str) {
        b();
        String str2 = (String) w(str).first;
        MessageDigest J0 = fa.J0();
        if (J0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, J0.digest(str2.getBytes()))});
    }
}
