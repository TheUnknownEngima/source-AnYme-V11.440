package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: ld2  reason: default package */
public class ld2 extends ee2 {
    private static final long h = TimeUnit.SECONDS.toMillis(60);
    private static final long i = TimeUnit.MILLISECONDS.toNanos(h);
    @Nullable
    static ld2 j;
    private boolean e;
    @Nullable
    private ld2 f;
    private long g;

    /* renamed from: ld2$a */
    class a implements ce2 {
        final /* synthetic */ ce2 e;

        a(ce2 ce2) {
            this.e = ce2;
        }

        public void X(nd2 nd2, long j) {
            fe2.b(nd2.f, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    zd2 zd2 = nd2.e;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (zd2.c - zd2.b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        zd2 = zd2.f;
                    }
                    ld2.this.k();
                    try {
                        this.e.X(nd2, j2);
                        j -= j2;
                        ld2.this.m(true);
                    } catch (IOException e2) {
                        throw ld2.this.l(e2);
                    } catch (Throwable th) {
                        ld2.this.m(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        public ee2 c() {
            return ld2.this;
        }

        public void close() {
            ld2.this.k();
            try {
                this.e.close();
                ld2.this.m(true);
            } catch (IOException e2) {
                throw ld2.this.l(e2);
            } catch (Throwable th) {
                ld2.this.m(false);
                throw th;
            }
        }

        public void flush() {
            ld2.this.k();
            try {
                this.e.flush();
                ld2.this.m(true);
            } catch (IOException e2) {
                throw ld2.this.l(e2);
            } catch (Throwable th) {
                ld2.this.m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.e + ")";
        }
    }

    /* renamed from: ld2$b */
    class b implements de2 {
        final /* synthetic */ de2 e;

        b(de2 de2) {
            this.e = de2;
        }

        public ee2 c() {
            return ld2.this;
        }

        public void close() {
            try {
                this.e.close();
                ld2.this.m(true);
            } catch (IOException e2) {
                throw ld2.this.l(e2);
            } catch (Throwable th) {
                ld2.this.m(false);
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.e + ")";
        }

        public long y0(nd2 nd2, long j) {
            ld2.this.k();
            try {
                long y0 = this.e.y0(nd2, j);
                ld2.this.m(true);
                return y0;
            } catch (IOException e2) {
                throw ld2.this.l(e2);
            } catch (Throwable th) {
                ld2.this.m(false);
                throw th;
            }
        }
    }

    /* renamed from: ld2$c */
    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.t();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<ld2> r0 = defpackage.ld2.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                ld2 r1 = defpackage.ld2.i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                ld2 r2 = defpackage.ld2.j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                defpackage.ld2.j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.t()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ld2.c.run():void");
        }
    }

    @Nullable
    static ld2 i() {
        Class<ld2> cls = ld2.class;
        ld2 ld2 = j.f;
        long nanoTime = System.nanoTime();
        if (ld2 == null) {
            cls.wait(h);
            if (j.f != null || System.nanoTime() - nanoTime < i) {
                return null;
            }
            return j;
        }
        long p = ld2.p(nanoTime);
        if (p > 0) {
            long j2 = p / 1000000;
            cls.wait(j2, (int) (p - (1000000 * j2)));
            return null;
        }
        j.f = ld2.f;
        ld2.f = null;
        return ld2;
    }

    private static synchronized boolean j(ld2 ld2) {
        boolean z;
        synchronized (ld2.class) {
            ld2 ld22 = j;
            while (true) {
                if (ld22 == null) {
                    z = true;
                    break;
                } else if (ld22.f == ld2) {
                    ld22.f = ld2.f;
                    ld2.f = null;
                    z = false;
                    break;
                } else {
                    ld22 = ld22.f;
                }
            }
        }
        return z;
    }

    private long p(long j2) {
        return this.g - j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0052 A[EDGE_INSN: B:33:0x0052->B:22:0x0052 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void q(defpackage.ld2 r6, long r7, boolean r9) {
        /*
            java.lang.Class<ld2> r0 = defpackage.ld2.class
            monitor-enter(r0)
            ld2 r1 = j     // Catch:{ all -> 0x0067 }
            if (r1 != 0) goto L_0x0016
            ld2 r1 = new ld2     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            j = r1     // Catch:{ all -> 0x0067 }
            ld2$c r1 = new ld2$c     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            r1.start()     // Catch:{ all -> 0x0067 }
        L_0x0016:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0067 }
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            if (r9 == 0) goto L_0x002f
            long r3 = r6.c()     // Catch:{ all -> 0x0067 }
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch:{ all -> 0x0067 }
        L_0x002b:
            long r7 = r7 + r1
            r6.g = r7     // Catch:{ all -> 0x0067 }
            goto L_0x003a
        L_0x002f:
            if (r5 == 0) goto L_0x0032
            goto L_0x002b
        L_0x0032:
            if (r9 == 0) goto L_0x0061
            long r7 = r6.c()     // Catch:{ all -> 0x0067 }
            r6.g = r7     // Catch:{ all -> 0x0067 }
        L_0x003a:
            long r7 = r6.p(r1)     // Catch:{ all -> 0x0067 }
            ld2 r9 = j     // Catch:{ all -> 0x0067 }
        L_0x0040:
            ld2 r3 = r9.f     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0052
            ld2 r3 = r9.f     // Catch:{ all -> 0x0067 }
            long r3 = r3.p(r1)     // Catch:{ all -> 0x0067 }
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x004f
            goto L_0x0052
        L_0x004f:
            ld2 r9 = r9.f     // Catch:{ all -> 0x0067 }
            goto L_0x0040
        L_0x0052:
            ld2 r7 = r9.f     // Catch:{ all -> 0x0067 }
            r6.f = r7     // Catch:{ all -> 0x0067 }
            r9.f = r6     // Catch:{ all -> 0x0067 }
            ld2 r6 = j     // Catch:{ all -> 0x0067 }
            if (r9 != r6) goto L_0x005f
            r0.notify()     // Catch:{ all -> 0x0067 }
        L_0x005f:
            monitor-exit(r0)
            return
        L_0x0061:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch:{ all -> 0x0067 }
            r6.<init>()     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld2.q(ld2, long, boolean):void");
    }

    public final void k() {
        if (!this.e) {
            long h2 = h();
            boolean e2 = e();
            if (h2 != 0 || e2) {
                this.e = true;
                q(this, h2, e2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: package-private */
    public final IOException l(IOException iOException) {
        return !n() ? iOException : o(iOException);
    }

    /* access modifiers changed from: package-private */
    public final void m(boolean z) {
        if (n() && z) {
            throw o((IOException) null);
        }
    }

    public final boolean n() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return j(this);
    }

    /* access modifiers changed from: protected */
    public IOException o(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final ce2 r(ce2 ce2) {
        return new a(ce2);
    }

    public final de2 s(de2 de2) {
        return new b(de2);
    }

    /* access modifiers changed from: protected */
    public void t() {
    }
}
