package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class m0 extends a1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    private static final long j;
    public static final m0 k;

    static {
        Long l;
        m0 m0Var = new m0();
        k = m0Var;
        z0.d0(m0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        v62.b(l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        j = timeUnit.toNanos(l.longValue());
    }

    private m0() {
    }

    private final synchronized void O0() {
        if (Q0()) {
            debugStatus = 3;
            G0();
            notifyAll();
        }
    }

    private final synchronized Thread P0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean Q0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    private final synchronized boolean R0() {
        if (Q0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* access modifiers changed from: protected */
    public Thread j0() {
        Thread thread = _thread;
        return thread != null ? thread : P0();
    }

    public void run() {
        boolean B0;
        long j2;
        k2.b.c(this);
        l2 a = m2.a();
        if (a != null) {
            a.c();
        }
        if (!R0()) {
            _thread = null;
            O0();
            l2 a2 = m2.a();
            if (a2 != null) {
                a2.g();
            }
            if (!B0()) {
                j0();
                return;
            }
            return;
        }
        long j3 = Long.MAX_VALUE;
        while (true) {
            try {
                Thread.interrupted();
                long D0 = D0();
                if (D0 == Long.MAX_VALUE) {
                    int i = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
                    if (i == 0) {
                        l2 a3 = m2.a();
                        long b = a3 != null ? a3.b() : System.nanoTime();
                        if (i == 0) {
                            j3 = j + b;
                        }
                        j2 = j3 - b;
                        if (j2 <= 0) {
                            _thread = null;
                            O0();
                            l2 a4 = m2.a();
                            if (a4 != null) {
                                a4.g();
                            }
                            if (!B0()) {
                                j0();
                                return;
                            }
                            return;
                        }
                    } else {
                        j2 = j;
                    }
                    D0 = w72.f(D0, j2);
                }
                if (D0 > 0) {
                    if (!Q0()) {
                        l2 a5 = m2.a();
                        if (a5 != null) {
                            a5.f(this, D0);
                        } else {
                            LockSupport.parkNanos(this, D0);
                        }
                    } else if (B0) {
                        return;
                    } else {
                        return;
                    }
                }
            } finally {
                _thread = null;
                O0();
                l2 a6 = m2.a();
                if (a6 != null) {
                    a6.g();
                }
                if (!B0()) {
                    j0();
                }
            }
        }
    }
}
