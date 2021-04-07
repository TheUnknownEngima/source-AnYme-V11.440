package defpackage;

import defpackage.as;
import defpackage.bs;
import java.lang.Exception;
import java.util.ArrayDeque;

/* renamed from: cs  reason: default package */
public abstract class cs<I extends as, O extends bs, E extends Exception> implements yr<I, O, E> {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque<I> c = new ArrayDeque<>();
    private final ArrayDeque<O> d = new ArrayDeque<>();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    /* renamed from: cs$a */
    class a extends Thread {
        a() {
        }

        public void run() {
            cs.this.u();
        }
    }

    protected cs(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.e[i2] = h();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i3 = 0; i3 < this.h; i3++) {
            this.f[i3] = i();
        }
        a aVar = new a();
        this.a = aVar;
        aVar.start();
    }

    private boolean g() {
        return !this.c.isEmpty() && this.h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.isEndOfStream() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.addFlag(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.isDecodeOnly() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.addFlag(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = k(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r0 = j(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean l() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.l     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.g()     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.b     // Catch:{ all -> 0x0089 }
            r1.wait()     // Catch:{ all -> 0x0089 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.l     // Catch:{ all -> 0x0089 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.c     // Catch:{ all -> 0x0089 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0089 }
            as r1 = (defpackage.as) r1     // Catch:{ all -> 0x0089 }
            O[] r3 = r6.f     // Catch:{ all -> 0x0089 }
            int r4 = r6.h     // Catch:{ all -> 0x0089 }
            r5 = 1
            int r4 = r4 - r5
            r6.h = r4     // Catch:{ all -> 0x0089 }
            r3 = r3[r4]     // Catch:{ all -> 0x0089 }
            boolean r4 = r6.k     // Catch:{ all -> 0x0089 }
            r6.k = r2     // Catch:{ all -> 0x0089 }
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            boolean r0 = r1.isEndOfStream()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.addFlag(r0)
            goto L_0x005f
        L_0x003c:
            boolean r0 = r1.isDecodeOnly()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.addFlag(r0)
        L_0x0047:
            java.lang.Exception r0 = r6.k(r1, r3, r4)     // Catch:{ RuntimeException -> 0x004e, OutOfMemoryError -> 0x004c }
            goto L_0x0053
        L_0x004c:
            r0 = move-exception
            goto L_0x004f
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            java.lang.Exception r0 = r6.j(r0)
        L_0x0053:
            if (r0 == 0) goto L_0x005f
            java.lang.Object r4 = r6.b
            monitor-enter(r4)
            r6.j = r0     // Catch:{ all -> 0x005c }
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            return r2
        L_0x005c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005c }
            throw r0
        L_0x005f:
            java.lang.Object r4 = r6.b
            monitor-enter(r4)
            boolean r0 = r6.k     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x006a
        L_0x0066:
            r3.release()     // Catch:{ all -> 0x0086 }
            goto L_0x0081
        L_0x006a:
            boolean r0 = r3.isDecodeOnly()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0076
            int r0 = r6.m     // Catch:{ all -> 0x0086 }
            int r0 = r0 + r5
            r6.m = r0     // Catch:{ all -> 0x0086 }
            goto L_0x0066
        L_0x0076:
            int r0 = r6.m     // Catch:{ all -> 0x0086 }
            r3.skippedOutputBufferCount = r0     // Catch:{ all -> 0x0086 }
            r6.m = r2     // Catch:{ all -> 0x0086 }
            java.util.ArrayDeque<O> r0 = r6.d     // Catch:{ all -> 0x0086 }
            r0.addLast(r3)     // Catch:{ all -> 0x0086 }
        L_0x0081:
            r6.r(r1)     // Catch:{ all -> 0x0086 }
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            return r5
        L_0x0086:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0086 }
            throw r0
        L_0x0089:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0089 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs.l():boolean");
    }

    private void o() {
        if (g()) {
            this.b.notify();
        }
    }

    private void p() {
        E e2 = this.j;
        if (e2 != null) {
            throw e2;
        }
    }

    private void r(I i2) {
        i2.clear();
        I[] iArr = this.e;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr[i3] = i2;
    }

    private void t(O o) {
        o.clear();
        O[] oArr = this.f;
        int i2 = this.h;
        this.h = i2 + 1;
        oArr[i2] = o;
    }

    /* access modifiers changed from: private */
    public void u() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (l());
    }

    public void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            if (this.i != null) {
                r(this.i);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                r((as) this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                ((bs) this.d.removeFirst()).release();
            }
            this.j = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract I h();

    /* access modifiers changed from: protected */
    public abstract O i();

    /* access modifiers changed from: protected */
    public abstract E j(Throwable th);

    /* access modifiers changed from: protected */
    public abstract E k(I i2, O o, boolean z);

    /* renamed from: m */
    public final I d() {
        I i2;
        synchronized (this.b) {
            p();
            q40.f(this.i == null);
            if (this.g == 0) {
                i2 = null;
            } else {
                I[] iArr = this.e;
                int i3 = this.g - 1;
                this.g = i3;
                i2 = iArr[i3];
            }
            this.i = i2;
        }
        return i2;
    }

    /* renamed from: n */
    public final O c() {
        synchronized (this.b) {
            p();
            if (this.d.isEmpty()) {
                return null;
            }
            O o = (bs) this.d.removeFirst();
            return o;
        }
    }

    /* renamed from: q */
    public final void e(I i2) {
        synchronized (this.b) {
            p();
            q40.a(i2 == this.i);
            this.c.addLast(i2);
            o();
            this.i = null;
        }
    }

    /* access modifiers changed from: protected */
    public void s(O o) {
        synchronized (this.b) {
            t(o);
            o();
        }
    }

    /* access modifiers changed from: protected */
    public final void v(int i2) {
        q40.f(this.g == this.e.length);
        for (I k2 : this.e) {
            k2.k(i2);
        }
    }
}
