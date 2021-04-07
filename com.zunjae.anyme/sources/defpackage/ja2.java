package defpackage;

import defpackage.wb2;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: ja2  reason: default package */
public final class ja2 {
    private static final Executor g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), ib2.G("OkHttp ConnectionPool", true));
    private final int a;
    private final long b;
    private final Runnable c;
    private final Deque<sb2> d;
    final tb2 e;
    boolean f;

    /* renamed from: ja2$a */
    class a implements Runnable {
        a() {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x002b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
            L_0x0000:
                ja2 r0 = defpackage.ja2.this
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.a(r1)
                r2 = -1
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L_0x0011
                return
            L_0x0011:
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0000
                r2 = 1000000(0xf4240, double:4.940656E-318)
                long r4 = r0 / r2
                long r2 = r2 * r4
                long r0 = r0 - r2
                ja2 r2 = defpackage.ja2.this
                monitor-enter(r2)
                ja2 r3 = defpackage.ja2.this     // Catch:{ InterruptedException -> 0x002b }
                int r1 = (int) r0     // Catch:{ InterruptedException -> 0x002b }
                r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x002b }
                goto L_0x002b
            L_0x0029:
                r0 = move-exception
                goto L_0x002d
            L_0x002b:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x0000
            L_0x002d:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ja2.a.run():void");
        }
    }

    public ja2() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public ja2(int i, long j, TimeUnit timeUnit) {
        this.c = new a();
        this.d = new ArrayDeque();
        this.e = new tb2();
        this.a = i;
        this.b = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    private int e(sb2 sb2, long j) {
        List<Reference<wb2>> list = sb2.n;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                dd2.j().r("A connection to " + sb2.q().a().l() + " was leaked. Did you forget to close a response body?", ((wb2.a) reference).a);
                list.remove(i);
                sb2.k = true;
                if (list.isEmpty()) {
                    sb2.o = j - this.b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public long a(long j) {
        synchronized (this) {
            sb2 sb2 = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (sb2 next : this.d) {
                if (e(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.o;
                    if (j3 > j2) {
                        sb2 = next;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.b) {
                if (i <= this.a) {
                    if (i > 0) {
                        long j4 = this.b - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.b;
                        return j5;
                    } else {
                        this.f = false;
                        return -1;
                    }
                }
            }
            this.d.remove(sb2);
            ib2.h(sb2.r());
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(sb2 sb2) {
        if (sb2.k || this.a == 0) {
            this.d.remove(sb2);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public Socket c(aa2 aa2, wb2 wb2) {
        for (sb2 next : this.d) {
            if (next.m(aa2, (eb2) null) && next.o() && next != wb2.d()) {
                return wb2.m(next);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public sb2 d(aa2 aa2, wb2 wb2, eb2 eb2) {
        for (sb2 next : this.d) {
            if (next.m(aa2, eb2)) {
                wb2.a(next, true);
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void f(sb2 sb2) {
        if (!this.f) {
            this.f = true;
            g.execute(this.c);
        }
        this.d.add(sb2);
    }
}
