package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: db1  reason: default package */
public interface db1<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
