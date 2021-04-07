package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: g3  reason: default package */
public class g3 {
    private final Object a = new Object();
    private HandlerThread b;
    private Handler c;
    private int d;
    private Handler.Callback e = new a();
    private final int f;
    private final int g;
    private final String h;

    /* renamed from: g3$a */
    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                g3.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                g3.this.b((Runnable) message.obj);
                return true;
            }
        }
    }

    /* renamed from: g3$b */
    class b implements Runnable {
        final /* synthetic */ Callable e;
        final /* synthetic */ Handler f;
        final /* synthetic */ d g;

        /* renamed from: g3$b$a */
        class a implements Runnable {
            final /* synthetic */ Object e;

            a(Object obj) {
                this.e = obj;
            }

            public void run() {
                b.this.g.a(this.e);
            }
        }

        b(g3 g3Var, Callable callable, Handler handler, d dVar) {
            this.e = callable;
            this.f = handler;
            this.g = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.e.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f.post(new a(obj));
        }
    }

    /* renamed from: g3$c */
    class c implements Runnable {
        final /* synthetic */ AtomicReference e;
        final /* synthetic */ Callable f;
        final /* synthetic */ ReentrantLock g;
        final /* synthetic */ AtomicBoolean h;
        final /* synthetic */ Condition i;

        c(g3 g3Var, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.e = atomicReference;
            this.f = callable;
            this.g = reentrantLock;
            this.h = atomicBoolean;
            this.i = condition;
        }

        public void run() {
            try {
                this.e.set(this.f.call());
            } catch (Exception unused) {
            }
            this.g.lock();
            try {
                this.h.set(false);
                this.i.signal();
            } finally {
                this.g.unlock();
            }
        }
    }

    /* renamed from: g3$d */
    public interface d<T> {
        void a(T t);
    }

    public g3(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f = i2;
        this.d = 0;
    }

    private void c(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.b = handlerThread;
                handlerThread.start();
                this.c = new Handler(this.b.getLooper(), this.e);
                this.d++;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.a) {
            if (!this.c.hasMessages(1)) {
                this.b.quit();
                this.b = null;
                this.c = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.c.removeMessages(0);
            this.c.sendMessageDelayed(this.c.obtainMessage(0), (long) this.f);
        }
    }

    public <T> void d(Callable<T> callable, d<T> dVar) {
        c(new b(this, callable, new Handler(), dVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T e(java.util.concurrent.Callable<T> r13, int r14) {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            g3$c r11 = new g3$c
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.c(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005c }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005c }
            long r0 = (long) r14     // Catch:{ all -> 0x005c }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005c }
        L_0x003b:
            long r13 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x003f }
        L_0x003f:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005c }
            if (r0 != 0) goto L_0x004d
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005c }
            r7.unlock()
            return r13
        L_0x004d:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0054
            goto L_0x003b
        L_0x0054:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005c }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005c }
            throw r13     // Catch:{ all -> 0x005c }
        L_0x005c:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g3.e(java.util.concurrent.Callable, int):java.lang.Object");
    }
}
