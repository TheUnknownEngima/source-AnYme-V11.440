package defpackage;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.v;

/* renamed from: x92  reason: default package */
public final class x92 {
    public static final long a = x.e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);
    public static final int b = x.d("kotlinx.coroutines.scheduler.offload.threshold", 96, 0, 128, 4, (Object) null);
    public static final int c = x.d("kotlinx.coroutines.scheduler.core.pool.size", w72.b(v.a(), 2), 1, 0, 8, (Object) null);
    public static final int d = x.d("kotlinx.coroutines.scheduler.max.pool.size", w72.g(v.a() * 128, c, 2097150), 0, 2097150, 4, (Object) null);
    public static final long e = TimeUnit.SECONDS.toNanos(x.e("kotlinx.coroutines.scheduler.keep.alive.sec", 5, 0, 0, 12, (Object) null));
    public static y92 f = r92.a;

    static {
        int unused = x.d("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, (Object) null);
    }
}
