package defpackage;

import defpackage.m22;

/* renamed from: n22  reason: default package */
public final class n22 {
    public static final Object a(Throwable th) {
        v62.e(th, "exception");
        return new m22.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof m22.b) {
            throw ((m22.b) obj).e;
        }
    }
}
