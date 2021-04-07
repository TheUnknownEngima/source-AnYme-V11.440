package defpackage;

import defpackage.za2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: na2  reason: default package */
public final class na2 {
    private int a = 64;
    private int b = 5;
    @Nullable
    private Runnable c;
    @Nullable
    private ExecutorService d;
    private final Deque<za2.b> e = new ArrayDeque();
    private final Deque<za2.b> f = new ArrayDeque();
    private final Deque<za2> g = new ArrayDeque();

    private <T> void d(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!g() && runnable != null) {
            runnable.run();
        }
    }

    private boolean g() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<za2.b> it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                za2.b next = it.next();
                if (this.f.size() >= this.a) {
                    break;
                } else if (i(next) < this.b) {
                    it.remove();
                    arrayList.add(next);
                    this.f.add(next);
                }
            }
            z = h() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((za2.b) arrayList.get(i)).l(c());
        }
        return z;
    }

    private int i(za2.b bVar) {
        int i = 0;
        for (za2.b next : this.f) {
            if (!next.m().j && next.n().equals(bVar.n())) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void a(za2.b bVar) {
        synchronized (this) {
            this.e.add(bVar);
        }
        g();
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(za2 za2) {
        this.g.add(za2);
    }

    public synchronized ExecutorService c() {
        if (this.d == null) {
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), ib2.G("OkHttp Dispatcher", false));
        }
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public void e(za2.b bVar) {
        d(this.f, bVar);
    }

    /* access modifiers changed from: package-private */
    public void f(za2 za2) {
        d(this.g, za2);
    }

    public synchronized int h() {
        return this.f.size() + this.g.size();
    }
}
