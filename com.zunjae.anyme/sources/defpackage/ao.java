package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: ao  reason: default package */
abstract class ao {
    static Executor a() {
        return new co(Executors.newSingleThreadExecutor());
    }
}
