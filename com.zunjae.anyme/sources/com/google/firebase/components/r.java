package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class r implements rh1, qh1 {
    private final Map<Class<?>, ConcurrentHashMap<ph1<Object>, Executor>> a = new HashMap();
    private Queue<oh1<?>> b = new ArrayDeque();
    private final Executor c;

    r(Executor executor) {
        this.c = executor;
    }

    private synchronized Set<Map.Entry<ph1<Object>, Executor>> d(oh1<?> oh1) {
        Map map;
        map = this.a.get(oh1.b());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    public <T> void a(Class<T> cls, ph1<? super T> ph1) {
        b(cls, this.c, ph1);
    }

    public synchronized <T> void b(Class<T> cls, Executor executor, ph1<? super T> ph1) {
        u.b(cls);
        u.b(ph1);
        u.b(executor);
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, new ConcurrentHashMap());
        }
        this.a.get(cls).put(ph1, executor);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        Queue<oh1<?>> queue;
        synchronized (this) {
            queue = null;
            if (this.b != null) {
                Queue<oh1<?>> queue2 = this.b;
                this.b = null;
                queue = queue2;
            }
        }
        if (queue != null) {
            for (oh1 f : queue) {
                f(f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r1 = r0.next();
        ((java.util.concurrent.Executor) r1.getValue()).execute(com.google.firebase.components.q.a(r1, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r0 = d(r4).iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(defpackage.oh1<?> r4) {
        /*
            r3 = this;
            com.google.firebase.components.u.b(r4)
            monitor-enter(r3)
            java.util.Queue<oh1<?>> r0 = r3.b     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            java.util.Queue<oh1<?>> r0 = r3.b     // Catch:{ all -> 0x0033 }
            r0.add(r4)     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            java.util.Set r0 = r3.d(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Runnable r1 = com.google.firebase.components.q.a(r1, r4)
            r2.execute(r1)
            goto L_0x0018
        L_0x0032:
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.r.f(oh1):void");
    }
}
