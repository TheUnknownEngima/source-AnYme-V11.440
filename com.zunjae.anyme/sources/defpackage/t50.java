package defpackage;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: t50  reason: default package */
public final class t50 {
    public static void a(String str) {
        if (v50.a >= 18) {
            b(str);
        }
    }

    @TargetApi(18)
    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (v50.a >= 18) {
            d();
        }
    }

    @TargetApi(18)
    private static void d() {
        Trace.endSection();
    }
}
