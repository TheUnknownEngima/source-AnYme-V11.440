package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

/* renamed from: pq1  reason: default package */
public class pq1 {
    private final ConcurrentMap<Class<?>, Set<rq1>> a;
    private final ConcurrentMap<Class<?>, sq1> b;
    private final String c;
    private final wq1 d;
    private final tq1 e;
    private final ThreadLocal<ConcurrentLinkedQueue<c>> f;
    private final ThreadLocal<Boolean> g;
    private final ConcurrentMap<Class<?>, Set<Class<?>>> h;

    /* renamed from: pq1$a */
    class a extends ThreadLocal<ConcurrentLinkedQueue<c>> {
        a(pq1 pq1) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ConcurrentLinkedQueue<c> initialValue() {
            return new ConcurrentLinkedQueue<>();
        }
    }

    /* renamed from: pq1$b */
    class b extends ThreadLocal<Boolean> {
        b(pq1 pq1) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: pq1$c */
    static class c {
        final Object a;
        final rq1 b;

        public c(Object obj, rq1 rq1) {
            this.a = obj;
            this.b = rq1;
        }
    }

    public pq1() {
        this("default");
    }

    public pq1(String str) {
        this(wq1.a, str);
    }

    public pq1(wq1 wq1, String str) {
        this(wq1, str, tq1.a);
    }

    pq1(wq1 wq1, String str, tq1 tq1) {
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.f = new a(this);
        this.g = new b(this);
        this.h = new ConcurrentHashMap();
        this.d = wq1;
        this.c = str;
        this.e = tq1;
    }

    private void b(rq1 rq1, sq1 sq1) {
        try {
            Object c2 = sq1.c();
            if (c2 != null) {
                a(c2, rq1);
            }
        } catch (InvocationTargetException e2) {
            k("Producer " + sq1 + " threw an exception.", e2);
            throw null;
        }
    }

    private Set<Class<?>> f(Class<?> cls) {
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        while (true) {
            linkedList.add(cls);
            while (true) {
                if (linkedList.isEmpty()) {
                    return hashSet;
                }
                Class cls2 = (Class) linkedList.remove(0);
                hashSet.add(cls2);
                cls = cls2.getSuperclass();
                if (cls != null) {
                }
            }
        }
    }

    private static void k(String str, InvocationTargetException invocationTargetException) {
        Throwable cause = invocationTargetException.getCause();
        if (cause != null) {
            throw new RuntimeException(str + ": " + cause.getMessage(), cause);
        }
        throw new RuntimeException(str + ": " + invocationTargetException.getMessage(), invocationTargetException);
    }

    /* access modifiers changed from: protected */
    public void a(Object obj, rq1 rq1) {
        try {
            rq1.a(obj);
        } catch (InvocationTargetException e2) {
            k("Could not dispatch event: " + obj.getClass() + " to handler " + rq1, e2);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void c() {
        if (!this.g.get().booleanValue()) {
            this.g.set(Boolean.TRUE);
            while (true) {
                try {
                    c cVar = (c) this.f.get().poll();
                    if (cVar != null) {
                        if (cVar.b.c()) {
                            a(cVar.a, cVar.b);
                        }
                    } else {
                        return;
                    }
                } finally {
                    this.g.set(Boolean.FALSE);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void d(Object obj, rq1 rq1) {
        this.f.get().offer(new c(obj, rq1));
    }

    /* access modifiers changed from: package-private */
    public Set<Class<?>> e(Class<?> cls) {
        Set<Class<?>> set = (Set) this.h.get(cls);
        if (set != null) {
            return set;
        }
        Set<Class<?>> f2 = f(cls);
        Set<Class<?>> putIfAbsent = this.h.putIfAbsent(cls, f2);
        return putIfAbsent == null ? f2 : putIfAbsent;
    }

    /* access modifiers changed from: package-private */
    public Set<rq1> g(Class<?> cls) {
        return (Set) this.a.get(cls);
    }

    /* access modifiers changed from: package-private */
    public sq1 h(Class<?> cls) {
        return (sq1) this.b.get(cls);
    }

    public void i(Object obj) {
        if (obj != null) {
            this.d.a(this);
            boolean z = false;
            for (Class<?> g2 : e(obj.getClass())) {
                Set<rq1> g3 = g(g2);
                if (g3 != null && !g3.isEmpty()) {
                    z = true;
                    for (rq1 d2 : g3) {
                        d(obj, d2);
                    }
                }
            }
            if (!z && !(obj instanceof qq1)) {
                i(new qq1(this, obj));
            }
            c();
            return;
        }
        throw new NullPointerException("Event to post must not be null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b1, code lost:
        r2 = new java.util.concurrent.CopyOnWriteArraySet();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(java.lang.Object r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0129
            wq1 r0 = r5.d
            r0.a(r5)
            tq1 r0 = r5.e
            java.util.Map r0 = r0.b(r6)
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r1.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r3 = r0.get(r2)
            sq1 r3 = (defpackage.sq1) r3
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, sq1> r4 = r5.b
            java.lang.Object r4 = r4.putIfAbsent(r2, r3)
            sq1 r4 = (defpackage.sq1) r4
            if (r4 != 0) goto L_0x0055
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<rq1>> r4 = r5.a
            java.lang.Object r2 = r4.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 == 0) goto L_0x0015
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0015
            java.util.Iterator r2 = r2.iterator()
        L_0x0045:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0015
            java.lang.Object r4 = r2.next()
            rq1 r4 = (defpackage.rq1) r4
            r5.b(r4, r3)
            goto L_0x0045
        L_0x0055:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Producer method for type "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " found on type "
            r0.append(r1)
            java.lang.Object r1 = r3.a
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = ", but already registered by type "
            r0.append(r1)
            java.lang.Object r1 = r4.a
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x008d:
            tq1 r0 = r5.e
            java.util.Map r6 = r0.a(r6)
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d7
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<rq1>> r2 = r5.a
            java.lang.Object r2 = r2.get(r1)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x00c2
            java.util.concurrent.CopyOnWriteArraySet r2 = new java.util.concurrent.CopyOnWriteArraySet
            r2.<init>()
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<rq1>> r3 = r5.a
            java.lang.Object r3 = r3.putIfAbsent(r1, r2)
            java.util.Set r3 = (java.util.Set) r3
            if (r3 != 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r2 = r3
        L_0x00c2:
            java.lang.Object r1 = r6.get(r1)
            java.util.Set r1 = (java.util.Set) r1
            boolean r1 = r2.addAll(r1)
            if (r1 == 0) goto L_0x00cf
            goto L_0x009b
        L_0x00cf:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Object already registered."
            r6.<init>(r0)
            throw r6
        L_0x00d7:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x00df:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0128
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, sq1> r2 = r5.b
            java.lang.Object r1 = r2.get(r1)
            sq1 r1 = (defpackage.sq1) r1
            if (r1 == 0) goto L_0x00df
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x00df
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x010b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00df
            java.lang.Object r2 = r0.next()
            rq1 r2 = (defpackage.rq1) r2
            boolean r3 = r1.b()
            if (r3 != 0) goto L_0x011e
            goto L_0x00df
        L_0x011e:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x010b
            r5.b(r2, r1)
            goto L_0x010b
        L_0x0128:
            return
        L_0x0129:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "Object to register must not be null."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq1.j(java.lang.Object):void");
    }

    public void l(Object obj) {
        if (obj != null) {
            this.d.a(this);
            for (Map.Entry next : this.e.b(obj).entrySet()) {
                Class cls = (Class) next.getKey();
                sq1 h2 = h(cls);
                sq1 sq1 = (sq1) next.getValue();
                if (sq1 == null || !sq1.equals(h2)) {
                    throw new IllegalArgumentException("Missing event producer for an annotated method. Is " + obj.getClass() + " registered?");
                }
                ((sq1) this.b.remove(cls)).a();
            }
            for (Map.Entry next2 : this.e.a(obj).entrySet()) {
                Set<rq1> g2 = g((Class) next2.getKey());
                Collection collection = (Collection) next2.getValue();
                if (g2 == null || !g2.containsAll(collection)) {
                    throw new IllegalArgumentException("Missing event handler for an annotated method. Is " + obj.getClass() + " registered?");
                }
                for (rq1 next3 : g2) {
                    if (collection.contains(next3)) {
                        next3.b();
                    }
                }
                g2.removeAll(collection);
            }
            return;
        }
        throw new NullPointerException("Object to unregister must not be null.");
    }

    public String toString() {
        return "[Bus \"" + this.c + "\"]";
    }
}
