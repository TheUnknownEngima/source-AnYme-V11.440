package defpackage;

import androidx.lifecycle.e0;
import androidx.lifecycle.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: x5  reason: default package */
public abstract class x5 {
    public static <T extends n & e0> x5 b(T t) {
        return new y5(t, ((e0) t).h());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
