package defpackage;

import java.io.Closeable;

/* renamed from: k52  reason: default package */
public final class k52 {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                z12.a(th, th2);
            }
        }
    }
}
