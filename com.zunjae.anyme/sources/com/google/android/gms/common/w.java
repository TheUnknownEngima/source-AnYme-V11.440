package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.j;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
class w {
    private static final w d = new w(true, (String) null, (Throwable) null);
    final boolean a;
    private final String b;
    private final Throwable c;

    w(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.a = z;
        this.b = str;
        this.c = th;
    }

    static w b(String str, Throwable th) {
        return new w(false, str, th);
    }

    static w c(Callable<String> callable) {
        return new y(callable);
    }

    static w d(String str) {
        return new w(false, str, (Throwable) null);
    }

    static String e(String str, o oVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, j.a(a.b("SHA-1").digest(oVar.r3())), Boolean.valueOf(z), "12451009.false"});
    }

    static w f() {
        return d;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public String a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (!this.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th = this.c;
            a();
            if (th != null) {
            }
        }
    }
}
