package androidx.lifecycle;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.f0;

public final class b implements Closeable, f0 {
    private final n42 e;

    public b(n42 n42) {
        v62.f(n42, "context");
        this.e = n42;
    }

    public void close() {
        u1.f(i(), (CancellationException) null, 1, (Object) null);
    }

    public n42 i() {
        return this.e;
    }
}
