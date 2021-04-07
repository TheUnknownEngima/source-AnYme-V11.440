package defpackage;

import java.util.concurrent.Callable;

/* renamed from: c51  reason: default package */
final class c51 implements b41 {
    c51() {
    }

    public final <V> Callable<V> a(Callable<V> callable) {
        return callable;
    }

    public final Runnable b(Runnable runnable) {
        return runnable;
    }
}
