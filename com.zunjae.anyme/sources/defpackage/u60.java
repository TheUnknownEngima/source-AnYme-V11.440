package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import java.util.Locale;

/* renamed from: u60  reason: default package */
public class u60 {
    private final String a;
    private final boolean b;
    private boolean c;
    private String d;

    public u60(String str) {
        this(str, false);
    }

    private u60(String str, boolean z) {
        r.g(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.b = str.length() <= 23;
        this.c = false;
    }

    private final String h(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (TextUtils.isEmpty(this.d)) {
            return str;
        }
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final boolean j() {
        if (!this.c) {
            return this.b && Log.isLoggable(this.a, 3);
        }
        return true;
    }

    public void a(String str, Object... objArr) {
        if (j()) {
            h(str, objArr);
        }
    }

    public void b(Throwable th, String str, Object... objArr) {
        if (j()) {
            h(str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        h(str, objArr);
    }

    public void d(Throwable th, String str, Object... objArr) {
        h(str, objArr);
    }

    public void e(String str, Object... objArr) {
        h(str, objArr);
    }

    public void f(String str, Object... objArr) {
    }

    public void g(String str, Object... objArr) {
        h(str, objArr);
    }

    public final void i(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = String.format("[%s] ", new Object[]{str});
        }
        this.d = str2;
    }
}
