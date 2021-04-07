package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class u implements v {
    public static final c d = new c(2, -9223372036854775807L);
    public static final c e = new c(3, -9223372036854775807L);
    /* access modifiers changed from: private */
    public final ExecutorService a;
    /* access modifiers changed from: private */
    public d<? extends e> b;
    /* access modifiers changed from: private */
    public IOException c;

    public interface b<T extends e> {
        void l(T t, long j, long j2, boolean z);

        void m(T t, long j, long j2);

        c t(T t, long j, long j2, IOException iOException, int i);
    }

    public static final class c {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final long b;

        private c(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public boolean c() {
            int i = this.a;
            return i == 0 || i == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class d<T extends e> extends Handler implements Runnable {
        public final int e;
        private final T f;
        private final long g;
        private b<T> h;
        private IOException i;
        private int j;
        private Thread k;
        private boolean l;
        private volatile boolean m;

        public d(Looper looper, T t, b<T> bVar, int i2, long j2) {
            super(looper);
            this.f = t;
            this.h = bVar;
            this.e = i2;
            this.g = j2;
        }

        private void b() {
            this.i = null;
            ExecutorService e2 = u.this.a;
            d b = u.this.b;
            q40.e(b);
            e2.execute(b);
        }

        private void c() {
            d unused = u.this.b = null;
        }

        private long d() {
            return (long) Math.min((this.j - 1) * 1000, 5000);
        }

        public void a(boolean z) {
            this.m = z;
            this.i = null;
            if (hasMessages(0)) {
                this.l = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.l = true;
                    this.f.c();
                    Thread thread = this.k;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b<T> bVar = this.h;
                q40.e(bVar);
                bVar.l(this.f, elapsedRealtime, elapsedRealtime - this.g, true);
                this.h = null;
            }
        }

        public void e(int i2) {
            IOException iOException = this.i;
            if (iOException != null && this.j > i2) {
                throw iOException;
            }
        }

        public void f(long j2) {
            q40.f(u.this.b == null);
            d unused = u.this.b = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                b();
            }
        }

        public void handleMessage(Message message) {
            if (!this.m) {
                int i2 = message.what;
                if (i2 == 0) {
                    b();
                } else if (i2 != 3) {
                    c();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.g;
                    b<T> bVar = this.h;
                    q40.e(bVar);
                    b bVar2 = bVar;
                    if (this.l) {
                        bVar2.l(this.f, elapsedRealtime, j2, false);
                        return;
                    }
                    int i3 = message.what;
                    if (i3 == 1) {
                        try {
                            bVar2.m(this.f, elapsedRealtime, j2);
                        } catch (RuntimeException e2) {
                            b50.d("LoadTask", "Unexpected exception handling load completed", e2);
                            IOException unused = u.this.c = new h(e2);
                        }
                    } else if (i3 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.i = iOException;
                        int i4 = this.j + 1;
                        this.j = i4;
                        c t = bVar2.t(this.f, elapsedRealtime, j2, iOException, i4);
                        if (t.a == 3) {
                            IOException unused2 = u.this.c = this.i;
                        } else if (t.a != 2) {
                            if (t.a == 1) {
                                this.j = 1;
                            }
                            f(t.b != -9223372036854775807L ? t.b : d());
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0085, code lost:
            r0.sendToTarget();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                r0 = 1
                r1 = 2
                monitor-enter(r5)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                boolean r2 = r5.l     // Catch:{ all -> 0x0058 }
                if (r2 != 0) goto L_0x0009
                r2 = 1
                goto L_0x000a
            L_0x0009:
                r2 = 0
            L_0x000a:
                java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0058 }
                r5.k = r3     // Catch:{ all -> 0x0058 }
                monitor-exit(r5)     // Catch:{ all -> 0x0058 }
                if (r2 == 0) goto L_0x0045
                java.lang.String r2 = "load:"
                T r3 = r5.f     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                java.lang.Class r3 = r3.getClass()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                java.lang.String r3 = r3.getSimpleName()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                int r4 = r3.length()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                if (r4 == 0) goto L_0x002e
                java.lang.String r2 = r2.concat(r3)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                goto L_0x0034
            L_0x002e:
                java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                r3.<init>(r2)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                r2 = r3
            L_0x0034:
                defpackage.t50.a(r2)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                T r2 = r5.f     // Catch:{ all -> 0x0040 }
                r2.a()     // Catch:{ all -> 0x0040 }
                defpackage.t50.c()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                goto L_0x0045
            L_0x0040:
                r2 = move-exception
                defpackage.t50.c()     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                throw r2     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
            L_0x0045:
                monitor-enter(r5)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                r2 = 0
                r5.k = r2     // Catch:{ all -> 0x0055 }
                java.lang.Thread.interrupted()     // Catch:{ all -> 0x0055 }
                monitor-exit(r5)     // Catch:{ all -> 0x0055 }
                boolean r2 = r5.m     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                if (r2 != 0) goto L_0x00b3
                r5.sendEmptyMessage(r0)     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
                goto L_0x00b3
            L_0x0055:
                r2 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0055 }
                throw r2     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
            L_0x0058:
                r2 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0058 }
                throw r2     // Catch:{ IOException -> 0x00a9, InterruptedException -> 0x009b, Exception -> 0x0089, OutOfMemoryError -> 0x0070, Error -> 0x005b }
            L_0x005b:
                r0 = move-exception
                java.lang.String r1 = "LoadTask"
                java.lang.String r2 = "Unexpected error loading stream"
                defpackage.b50.d(r1, r2, r0)
                boolean r1 = r5.m
                if (r1 != 0) goto L_0x006f
                r1 = 3
                android.os.Message r1 = r5.obtainMessage(r1, r0)
                r1.sendToTarget()
            L_0x006f:
                throw r0
            L_0x0070:
                r0 = move-exception
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "OutOfMemory error loading stream"
                defpackage.b50.d(r2, r3, r0)
                boolean r2 = r5.m
                if (r2 != 0) goto L_0x00b3
                com.google.android.exoplayer2.upstream.u$h r2 = new com.google.android.exoplayer2.upstream.u$h
                r2.<init>(r0)
            L_0x0081:
                android.os.Message r0 = r5.obtainMessage(r1, r2)
            L_0x0085:
                r0.sendToTarget()
                goto L_0x00b3
            L_0x0089:
                r0 = move-exception
                java.lang.String r2 = "LoadTask"
                java.lang.String r3 = "Unexpected exception loading stream"
                defpackage.b50.d(r2, r3, r0)
                boolean r2 = r5.m
                if (r2 != 0) goto L_0x00b3
                com.google.android.exoplayer2.upstream.u$h r2 = new com.google.android.exoplayer2.upstream.u$h
                r2.<init>(r0)
                goto L_0x0081
            L_0x009b:
                boolean r1 = r5.l
                defpackage.q40.f(r1)
                boolean r1 = r5.m
                if (r1 != 0) goto L_0x00b3
                r5.sendEmptyMessage(r0)
                goto L_0x00b3
            L_0x00a9:
                r0 = move-exception
                boolean r2 = r5.m
                if (r2 != 0) goto L_0x00b3
                android.os.Message r0 = r5.obtainMessage(r1, r0)
                goto L_0x0085
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.u.d.run():void");
        }
    }

    public interface e {
        void a();

        void c();
    }

    public interface f {
        void i();
    }

    private static final class g implements Runnable {
        private final f e;

        public g(f fVar) {
            this.e = fVar;
        }

        public void run() {
            this.e.i();
        }
    }

    public static final class h extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public h(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                int r2 = r2 + 13
                java.lang.String r3 = java.lang.String.valueOf(r1)
                int r3 = r3.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.u.h.<init>(java.lang.Throwable):void");
        }
    }

    static {
        h(false, -9223372036854775807L);
        h(true, -9223372036854775807L);
    }

    public u(String str) {
        this.a = v50.l0(str);
    }

    public static c h(boolean z, long j) {
        return new c(z ? 1 : 0, j);
    }

    public void a() {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        d<? extends e> dVar = this.b;
        q40.h(dVar);
        dVar.a(false);
    }

    public void g() {
        this.c = null;
    }

    public boolean i() {
        return this.c != null;
    }

    public boolean j() {
        return this.b != null;
    }

    public void k(int i) {
        IOException iOException = this.c;
        if (iOException == null) {
            d<? extends e> dVar = this.b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.e;
                }
                dVar.e(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void l() {
        m((f) null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.a.execute(new g(fVar));
        }
        this.a.shutdown();
    }

    public <T extends e> long n(T t, b<T> bVar, int i) {
        Looper myLooper = Looper.myLooper();
        q40.h(myLooper);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(myLooper, t, bVar, i, elapsedRealtime).f(0);
        return elapsedRealtime;
    }
}
