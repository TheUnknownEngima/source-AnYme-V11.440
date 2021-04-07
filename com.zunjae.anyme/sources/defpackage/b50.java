package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: b50  reason: default package */
public final class b50 {
    private static int a = 0;
    private static boolean b = true;

    private static String a(String str, Throwable th) {
        String e = e(th);
        if (TextUtils.isEmpty(e)) {
            return str;
        }
        String valueOf = String.valueOf(str);
        String replace = e.replace("\n", "\n  ");
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(replace).length());
        sb.append(valueOf);
        sb.append("\n  ");
        sb.append(replace);
        sb.append(10);
        return sb.toString();
    }

    public static void b(String str, String str2) {
        int i = a;
    }

    public static void c(String str, String str2) {
        int i = a;
    }

    public static void d(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        return g(th) ? "UnknownHostException (no network)" : !b ? th.getMessage() : Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void f(String str, String str2) {
        int i = a;
    }

    private static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        int i = a;
    }

    public static void i(String str, String str2, Throwable th) {
        h(str, a(str2, th));
    }
}
