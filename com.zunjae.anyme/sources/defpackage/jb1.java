package defpackage;

import android.util.Log;

/* renamed from: jb1  reason: default package */
public class jb1 {
    static final jb1 c = new jb1("FirebaseCrashlytics");
    private final String a;
    private int b = 4;

    public jb1(String str) {
        this.a = str;
    }

    private boolean a(int i) {
        return this.b <= i || Log.isLoggable(this.a, i);
    }

    public static jb1 f() {
        return c;
    }

    public void b(String str) {
        c(str, (Throwable) null);
    }

    public void c(String str, Throwable th) {
        boolean a2 = a(3);
    }

    public void d(String str) {
        e(str, (Throwable) null);
    }

    public void e(String str, Throwable th) {
        boolean a2 = a(6);
    }

    public void g(String str) {
        h(str, (Throwable) null);
    }

    public void h(String str, Throwable th) {
        boolean a2 = a(4);
    }

    public void i(String str) {
        j(str, (Throwable) null);
    }

    public void j(String str, Throwable th) {
        boolean a2 = a(5);
    }
}
