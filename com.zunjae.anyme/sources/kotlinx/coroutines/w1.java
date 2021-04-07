package kotlinx.coroutines;

import defpackage.n42;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.d;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.o1;

public class w1 implements o1, p, d2 {
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(w1.class, Object.class, "_state");
    private volatile Object _state;
    public volatile n parentHandle;

    private static final class a extends v1<o1> {
        private final w1 i;
        private final b j;
        private final o k;
        private final Object l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(w1 w1Var, b bVar, o oVar, Object obj) {
            super(oVar.i);
            v62.f(w1Var, "parent");
            v62.f(bVar, "state");
            v62.f(oVar, "child");
            this.i = w1Var;
            this.j = bVar;
            this.k = oVar;
            this.l = obj;
        }

        public /* bridge */ /* synthetic */ Object r(Object obj) {
            y((Throwable) obj);
            return u22.a;
        }

        public String toString() {
            return "ChildCompletion[" + this.k + ", " + this.l + ']';
        }

        public void y(Throwable th) {
            this.i.u(this.j, this.k, this.l);
        }
    }

    private static final class b implements j1 {
        private volatile Object _exceptionsHolder;
        private final a2 e;
        public volatile boolean isCompleting;
        public volatile Throwable rootCause;

        public b(a2 a2Var, boolean z, Throwable th) {
            v62.f(a2Var, "list");
            this.e = a2Var;
            this.isCompleting = z;
            this.rootCause = th;
        }

        private final ArrayList<Throwable> d() {
            return new ArrayList<>(4);
        }

        public a2 a() {
            return this.e;
        }

        public boolean b() {
            return this.rootCause == null;
        }

        public final void c(Throwable th) {
            v62.f(th, "exception");
            Throwable th2 = this.rootCause;
            if (th2 == null) {
                this.rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> d = d();
                        d.add(obj);
                        d.add(th);
                        this._exceptionsHolder = d;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        public final boolean e() {
            return this.rootCause != null;
        }

        public final boolean f() {
            return this._exceptionsHolder == x1.a;
        }

        public final List<Throwable> g(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = d();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> d = d();
                d.add(obj);
                arrayList = d;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th2 = this.rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && (!v62.a(th, th2))) {
                arrayList.add(th);
            }
            this._exceptionsHolder = x1.a;
            return arrayList;
        }

        public String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + this.isCompleting + ", rootCause=" + this.rootCause + ", exceptions=" + this._exceptionsHolder + ", list=" + a() + ']';
        }
    }

    public static final class c extends j.a {
        final /* synthetic */ w1 d;
        final /* synthetic */ Object e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(j jVar, j jVar2, w1 w1Var, Object obj) {
            super(jVar2);
            this.d = w1Var;
            this.e = obj;
        }

        /* renamed from: g */
        public Object d(j jVar) {
            v62.f(jVar, "affected");
            if (this.d.H() == this.e) {
                return null;
            }
            return i.a();
        }
    }

    public w1(boolean z) {
        this._state = z ? x1.c : x1.b;
    }

    private final Throwable B(b bVar, List<? extends Throwable> list) {
        T t = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    t = next;
                    break;
                }
            }
            Throwable th = (Throwable) t;
            return th != null ? th : (Throwable) list.get(0);
        } else if (bVar.e()) {
            return w();
        } else {
            return null;
        }
    }

    private final a2 G(j1 j1Var) {
        a2 a2 = j1Var.a();
        if (a2 != null) {
            return a2;
        }
        if (j1Var instanceof y0) {
            return new a2();
        }
        if (j1Var instanceof v1) {
            c0((v1) j1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + j1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        W(((kotlinx.coroutines.w1.b) r2).a(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean R(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r7.H()
            boolean r3 = r2 instanceof kotlinx.coroutines.w1.b
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x004a
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.w1$b r3 = (kotlinx.coroutines.w1.b) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.f()     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)
            return r4
        L_0x0018:
            r3 = r2
            kotlinx.coroutines.w1$b r3 = (kotlinx.coroutines.w1.b) r3     // Catch:{ all -> 0x0047 }
            boolean r3 = r3.e()     // Catch:{ all -> 0x0047 }
            if (r8 != 0) goto L_0x0023
            if (r3 != 0) goto L_0x0030
        L_0x0023:
            if (r1 == 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            java.lang.Throwable r1 = r7.v(r8)     // Catch:{ all -> 0x0047 }
        L_0x002a:
            r8 = r2
            kotlinx.coroutines.w1$b r8 = (kotlinx.coroutines.w1.b) r8     // Catch:{ all -> 0x0047 }
            r8.c(r1)     // Catch:{ all -> 0x0047 }
        L_0x0030:
            r8 = r2
            kotlinx.coroutines.w1$b r8 = (kotlinx.coroutines.w1.b) r8     // Catch:{ all -> 0x0047 }
            java.lang.Throwable r8 = r8.rootCause     // Catch:{ all -> 0x0047 }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003a
            r0 = r8
        L_0x003a:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0046
            kotlinx.coroutines.w1$b r2 = (kotlinx.coroutines.w1.b) r2
            kotlinx.coroutines.a2 r8 = r2.a()
            r7.W(r8, r0)
        L_0x0046:
            return r5
        L_0x0047:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x004a:
            boolean r3 = r2 instanceof kotlinx.coroutines.j1
            if (r3 == 0) goto L_0x00a1
            if (r1 == 0) goto L_0x0051
            goto L_0x0055
        L_0x0051:
            java.lang.Throwable r1 = r7.v(r8)
        L_0x0055:
            r3 = r2
            kotlinx.coroutines.j1 r3 = (kotlinx.coroutines.j1) r3
            boolean r6 = r3.b()
            if (r6 == 0) goto L_0x0065
            boolean r2 = r7.l0(r3, r1)
            if (r2 == 0) goto L_0x0002
            return r5
        L_0x0065:
            kotlinx.coroutines.s r3 = new kotlinx.coroutines.s
            r6 = 2
            r3.<init>(r1, r4, r6, r0)
            int r3 = r7.m0(r2, r3, r4)
            if (r3 == 0) goto L_0x0086
            if (r3 == r5) goto L_0x0085
            if (r3 == r6) goto L_0x0085
            r2 = 3
            if (r3 != r2) goto L_0x0079
            goto L_0x0002
        L_0x0079:
            java.lang.String r8 = "unexpected result"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x0085:
            return r5
        L_0x0086:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Cannot happen in "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L_0x00a1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.w1.R(java.lang.Object):boolean");
    }

    private final v1<?> T(z52<? super Throwable, u22> z52, boolean z) {
        boolean z2 = true;
        q1 q1Var = null;
        if (z) {
            if (z52 instanceof q1) {
                q1Var = z52;
            }
            q1 q1Var2 = q1Var;
            if (q1Var2 != null) {
                if (q1Var2.h != this) {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                } else if (q1Var2 != null) {
                    return q1Var2;
                }
            }
            return new m1(this, z52);
        }
        if (z52 instanceof v1) {
            q1Var = z52;
        }
        v1<?> v1Var = q1Var;
        if (v1Var != null) {
            if (v1Var.h != this || (v1Var instanceof q1)) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (v1Var != null) {
                return v1Var;
            }
        }
        return new n1(this, z52);
    }

    private final o V(j jVar) {
        while (jVar.t()) {
            jVar = jVar.q();
        }
        while (true) {
            jVar = jVar.o();
            if (!jVar.t()) {
                if (jVar instanceof o) {
                    return (o) jVar;
                }
                if (jVar instanceof a2) {
                    return null;
                }
            }
        }
    }

    private final void W(a2 a2Var, Throwable th) {
        Y(th);
        Object n = a2Var.n();
        if (n != null) {
            x xVar = null;
            for (j jVar = (j) n; !v62.a(jVar, a2Var); jVar = jVar.o()) {
                if (jVar instanceof q1) {
                    v1 v1Var = (v1) jVar;
                    try {
                        v1Var.y(th);
                    } catch (Throwable th2) {
                        if (xVar != null) {
                            z12.a(xVar, th2);
                            if (xVar != null) {
                            }
                        }
                        xVar = new x("Exception in completion handler " + v1Var + " for " + this, th2);
                        u22 u22 = u22.a;
                    }
                }
            }
            if (xVar != null) {
                N(xVar);
            }
            r(th);
            return;
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final void X(a2 a2Var, Throwable th) {
        Object n = a2Var.n();
        if (n != null) {
            x xVar = null;
            for (j jVar = (j) n; !v62.a(jVar, a2Var); jVar = jVar.o()) {
                if (jVar instanceof v1) {
                    v1 v1Var = (v1) jVar;
                    try {
                        v1Var.y(th);
                    } catch (Throwable th2) {
                        if (xVar != null) {
                            z12.a(xVar, th2);
                            if (xVar != null) {
                            }
                        }
                        xVar = new x("Exception in completion handler " + v1Var + " for " + this, th2);
                        u22 u22 = u22.a;
                    }
                }
            }
            if (xVar != null) {
                N(xVar);
                return;
            }
            return;
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.i1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b0(kotlinx.coroutines.y0 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.a2 r0 = new kotlinx.coroutines.a2
            r0.<init>()
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.i1 r1 = new kotlinx.coroutines.i1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = e
            r1.compareAndSet(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.w1.b0(kotlinx.coroutines.y0):void");
    }

    private final void c0(v1<?> v1Var) {
        v1Var.d(new a2());
        e.compareAndSet(this, v1Var, v1Var.o());
    }

    private final int e0(Object obj) {
        if (obj instanceof y0) {
            if (((y0) obj).b()) {
                return 0;
            }
            if (!e.compareAndSet(this, obj, x1.c)) {
                return -1;
            }
            a0();
            return 1;
        } else if (!(obj instanceof i1)) {
            return 0;
        } else {
            if (!e.compareAndSet(this, obj, ((i1) obj).a())) {
                return -1;
            }
            a0();
            return 1;
        }
    }

    private final String f0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof j1 ? ((j1) obj).b() ? "Active" : "New" : obj instanceof s ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.e() ? "Cancelling" : bVar.isCompleting ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException h0(w1 w1Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return w1Var.g0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean j0(b bVar, Object obj, int i) {
        boolean e2;
        Throwable B;
        boolean z = false;
        if (!(H() == bVar)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(!bVar.f())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (bVar.isCompleting) {
            s sVar = (s) (!(obj instanceof s) ? null : obj);
            Throwable th = sVar != null ? sVar.a : null;
            synchronized (bVar) {
                e2 = bVar.e();
                List<Throwable> g = bVar.g(th);
                B = B(bVar, g);
                if (B != null) {
                    m(B, g);
                }
            }
            if (!(B == null || B == th)) {
                obj = new s(B, false, 2, (r62) null);
            }
            if (B != null) {
                if (r(B) || I(B)) {
                    z = true;
                }
                if (z) {
                    if (obj != null) {
                        ((s) obj).b();
                    } else {
                        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            if (!e2) {
                Y(B);
            }
            Z(obj);
            if (e.compareAndSet(this, bVar, x1.d(obj))) {
                t(bVar, obj, i);
                return true;
            }
            throw new IllegalArgumentException(("Unexpected state: " + this._state + ", expected: " + bVar + ", update: " + obj).toString());
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final boolean k0(j1 j1Var, Object obj, int i) {
        if (k0.a()) {
            if (!((j1Var instanceof y0) || (j1Var instanceof v1))) {
                throw new AssertionError();
            }
        }
        if (k0.a() && !(!(obj instanceof s))) {
            throw new AssertionError();
        } else if (!e.compareAndSet(this, j1Var, x1.d(obj))) {
            return false;
        } else {
            Y((Throwable) null);
            Z(obj);
            t(j1Var, obj, i);
            return true;
        }
    }

    private final boolean l(Object obj, a2 a2Var, v1<?> v1Var) {
        int x;
        c cVar = new c(v1Var, v1Var, this, obj);
        do {
            Object p = a2Var.p();
            if (p != null) {
                x = ((j) p).x(v1Var, a2Var, cVar);
                if (x == 1) {
                    return true;
                }
            } else {
                throw new r22("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (x != 2);
        return false;
    }

    private final boolean l0(j1 j1Var, Throwable th) {
        if (k0.a() && !(!(j1Var instanceof b))) {
            throw new AssertionError();
        } else if (!k0.a() || j1Var.b()) {
            a2 G = G(j1Var);
            if (G == null) {
                return false;
            }
            if (!e.compareAndSet(this, j1Var, new b(G, false, th))) {
                return false;
            }
            W(G, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    private final void m(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set a2 = d.a(list.size());
            Throwable k = t.k(th);
            for (Throwable k2 : list) {
                Throwable k3 = t.k(k2);
                if (k3 != th && k3 != k && !(k3 instanceof CancellationException) && a2.add(k3)) {
                    z12.a(th, k3);
                }
            }
        }
    }

    private final int m0(Object obj, Object obj2, int i) {
        if (!(obj instanceof j1)) {
            return 0;
        }
        return (((obj instanceof y0) || (obj instanceof v1)) && !(obj instanceof o) && !(obj2 instanceof s)) ? !k0((j1) obj, obj2, i) ? 3 : 1 : n0((j1) obj, obj2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        if (r3 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        W(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0059, code lost:
        r8 = x(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005d, code lost:
        if (r8 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0063, code lost:
        if (o0(r2, r8, r9) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0065, code lost:
        return 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006b, code lost:
        if (j0(r2, r9, r10) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006d, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006e, code lost:
        return 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int n0(kotlinx.coroutines.j1 r8, java.lang.Object r9, int r10) {
        /*
            r7 = this;
            kotlinx.coroutines.a2 r0 = r7.G(r8)
            r1 = 3
            if (r0 == 0) goto L_0x007e
            boolean r2 = r8 instanceof kotlinx.coroutines.w1.b
            r3 = 0
            if (r2 != 0) goto L_0x000e
            r2 = r3
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            kotlinx.coroutines.w1$b r2 = (kotlinx.coroutines.w1.b) r2
            r4 = 0
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            kotlinx.coroutines.w1$b r2 = new kotlinx.coroutines.w1$b
            r2.<init>(r0, r4, r3)
        L_0x001a:
            monitor-enter(r2)
            boolean r5 = r2.isCompleting     // Catch:{ all -> 0x007b }
            if (r5 == 0) goto L_0x0021
            monitor-exit(r2)
            return r4
        L_0x0021:
            r4 = 1
            r2.isCompleting = r4     // Catch:{ all -> 0x007b }
            if (r2 == r8) goto L_0x0030
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = e     // Catch:{ all -> 0x007b }
            boolean r5 = r5.compareAndSet(r7, r8, r2)     // Catch:{ all -> 0x007b }
            if (r5 != 0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            boolean r5 = r2.f()     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x006f
            boolean r5 = r2.e()     // Catch:{ all -> 0x007b }
            boolean r6 = r9 instanceof kotlinx.coroutines.s     // Catch:{ all -> 0x007b }
            if (r6 != 0) goto L_0x0041
            r6 = r3
            goto L_0x0042
        L_0x0041:
            r6 = r9
        L_0x0042:
            kotlinx.coroutines.s r6 = (kotlinx.coroutines.s) r6     // Catch:{ all -> 0x007b }
            if (r6 == 0) goto L_0x004b
            java.lang.Throwable r6 = r6.a     // Catch:{ all -> 0x007b }
            r2.c(r6)     // Catch:{ all -> 0x007b }
        L_0x004b:
            java.lang.Throwable r6 = r2.rootCause     // Catch:{ all -> 0x007b }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x0051
            r3 = r6
        L_0x0051:
            u22 r5 = defpackage.u22.a     // Catch:{ all -> 0x007b }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0059
            r7.W(r0, r3)
        L_0x0059:
            kotlinx.coroutines.o r8 = r7.x(r8)
            if (r8 == 0) goto L_0x0067
            boolean r8 = r7.o0(r2, r8, r9)
            if (r8 == 0) goto L_0x0067
            r8 = 2
            return r8
        L_0x0067:
            boolean r8 = r7.j0(r2, r9, r10)
            if (r8 == 0) goto L_0x006e
            return r4
        L_0x006e:
            return r1
        L_0x006f:
            java.lang.String r8 = "Failed requirement."
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x007b }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x007b }
            r9.<init>(r8)     // Catch:{ all -> 0x007b }
            throw r9     // Catch:{ all -> 0x007b }
        L_0x007b:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.w1.n0(kotlinx.coroutines.j1, java.lang.Object, int):int");
    }

    private final boolean o0(b bVar, o oVar, Object obj) {
        while (o1.a.e(oVar.i, false, false, new a(this, bVar, oVar, obj), 1, (Object) null) == b2.e) {
            oVar = V(oVar);
            if (oVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean q(Object obj) {
        int m0;
        do {
            Object H = H();
            if (!(H instanceof j1) || (((H instanceof b) && ((b) H).isCompleting) || (m0 = m0(H, new s(v(obj), false, 2, (r62) null), 0)) == 0)) {
                return false;
            }
            if (m0 == 1 || m0 == 2) {
                return true;
            }
        } while (m0 == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    private final boolean r(Throwable th) {
        if (Q()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        n nVar = this.parentHandle;
        return (nVar == null || nVar == b2.e) ? z : nVar.e(th) || z;
    }

    private final void t(j1 j1Var, Object obj, int i) {
        n nVar = this.parentHandle;
        if (nVar != null) {
            nVar.k();
            this.parentHandle = b2.e;
        }
        Throwable th = null;
        s sVar = (s) (!(obj instanceof s) ? null : obj);
        if (sVar != null) {
            th = sVar.a;
        }
        if (j1Var instanceof v1) {
            try {
                ((v1) j1Var).y(th);
            } catch (Throwable th2) {
                N(new x("Exception in completion handler " + j1Var + " for " + this, th2));
            }
        } else {
            a2 a2 = j1Var.a();
            if (a2 != null) {
                X(a2, th);
            }
        }
        n(obj, i);
    }

    /* access modifiers changed from: private */
    public final void u(b bVar, o oVar, Object obj) {
        if (H() == bVar) {
            o V = V(oVar);
            if (V == null || !o0(bVar, V, obj)) {
                boolean j0 = j0(bVar, obj, 0);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final Throwable v(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : w();
        }
        if (obj != null) {
            return ((d2) obj).J();
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
    }

    private final p1 w() {
        return new p1("Job was cancelled", (Throwable) null, this);
    }

    private final o x(j1 j1Var) {
        o oVar = (o) (!(j1Var instanceof o) ? null : j1Var);
        if (oVar != null) {
            return oVar;
        }
        a2 a2 = j1Var.a();
        if (a2 != null) {
            return V(a2);
        }
        return null;
    }

    private final Throwable y(Object obj) {
        if (!(obj instanceof s)) {
            obj = null;
        }
        s sVar = (s) obj;
        if (sVar != null) {
            return sVar.a;
        }
        return null;
    }

    public final CancellationException A() {
        Object H = H();
        if (H instanceof b) {
            Throwable th = ((b) H).rootCause;
            if (th != null) {
                CancellationException g0 = g0(th, l0.a(this) + " is cancelling");
                if (g0 != null) {
                    return g0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (H instanceof j1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (H instanceof s) {
            return h0(this, ((s) H).a, (String) null, 1, (Object) null);
        } else {
            return new p1(l0.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public final void C(d2 d2Var) {
        v62.f(d2Var, "parentJob");
        o(d2Var);
    }

    public boolean D() {
        return true;
    }

    public boolean E() {
        return false;
    }

    public final Object H() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean I(Throwable th) {
        v62.f(th, "exception");
        return false;
    }

    public CancellationException J() {
        Throwable th;
        Object H = H();
        CancellationException cancellationException = null;
        if (H instanceof b) {
            th = ((b) H).rootCause;
        } else if (H instanceof s) {
            th = ((s) H).a;
        } else if (!(H instanceof j1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + H).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new p1("Parent job is " + f0(H), th, this);
    }

    public void K(CancellationException cancellationException) {
        p(cancellationException);
    }

    public final n M(p pVar) {
        v62.f(pVar, "child");
        w0 e2 = o1.a.e(this, true, false, new o(this, pVar), 2, (Object) null);
        if (e2 != null) {
            return (n) e2;
        }
        throw new r22("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    public void N(Throwable th) {
        v62.f(th, "exception");
        throw th;
    }

    public final void O(o1 o1Var) {
        if (k0.a()) {
            if (!(this.parentHandle == null)) {
                throw new AssertionError();
            }
        }
        if (o1Var == null) {
            this.parentHandle = b2.e;
            return;
        }
        o1Var.start();
        n M = o1Var.M(this);
        this.parentHandle = M;
        if (P()) {
            M.k();
            this.parentHandle = b2.e;
        }
    }

    public final boolean P() {
        return !(H() instanceof j1);
    }

    /* access modifiers changed from: protected */
    public boolean Q() {
        return false;
    }

    public final boolean S(Object obj, int i) {
        int m0;
        do {
            m0 = m0(H(), obj, i);
            if (m0 == 0) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, " + "but is being completed with " + obj, y(obj));
            } else if (m0 == 1) {
                return true;
            } else {
                if (m0 == 2) {
                    return false;
                }
            }
        } while (m0 == 3);
        throw new IllegalStateException("unexpected result".toString());
    }

    public String U() {
        return l0.a(this);
    }

    /* access modifiers changed from: protected */
    public void Y(Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void Z(Object obj) {
    }

    public void a0() {
    }

    public boolean b() {
        Object H = H();
        return (H instanceof j1) && ((j1) H).b();
    }

    public /* synthetic */ void cancel() {
        K((CancellationException) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000d A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d0(kotlinx.coroutines.v1<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "node"
            defpackage.v62.f(r4, r0)
        L_0x0005:
            java.lang.Object r0 = r3.H()
            boolean r1 = r0 instanceof kotlinx.coroutines.v1
            if (r1 == 0) goto L_0x001d
            if (r0 == r4) goto L_0x0010
            return
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = e
            kotlinx.coroutines.y0 r2 = kotlinx.coroutines.x1.c
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L_0x0005
            return
        L_0x001d:
            boolean r1 = r0 instanceof kotlinx.coroutines.j1
            if (r1 == 0) goto L_0x002c
            kotlinx.coroutines.j1 r0 = (kotlinx.coroutines.j1) r0
            kotlinx.coroutines.a2 r0 = r0.a()
            if (r0 == 0) goto L_0x002c
            r4.v()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.w1.d0(kotlinx.coroutines.v1):void");
    }

    public <R> R fold(R r, d62<? super R, ? super n42.b, ? extends R> d62) {
        v62.f(d62, "operation");
        return o1.a.c(this, r, d62);
    }

    /* access modifiers changed from: protected */
    public final CancellationException g0(Throwable th, String str) {
        v62.f(th, "$this$toCancellationException");
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException == null) {
            if (str == null) {
                str = l0.a(th) + " was cancelled";
            }
            cancellationException = new p1(str, th, this);
        }
        return cancellationException;
    }

    public <E extends n42.b> E get(n42.c<E> cVar) {
        v62.f(cVar, "key");
        return o1.a.d(this, cVar);
    }

    public final n42.c<?> getKey() {
        return o1.d;
    }

    public final String i0() {
        return U() + '{' + f0(H()) + '}';
    }

    public n42 minusKey(n42.c<?> cVar) {
        v62.f(cVar, "key");
        return o1.a.f(this, cVar);
    }

    /* access modifiers changed from: protected */
    public void n(Object obj, int i) {
    }

    public final boolean o(Object obj) {
        if (!E() || !q(obj)) {
            return R(obj);
        }
        return true;
    }

    public boolean p(Throwable th) {
        return o(th) && D();
    }

    public n42 plus(n42 n42) {
        v62.f(n42, "context");
        return o1.a.g(this, n42);
    }

    public boolean s(Throwable th) {
        v62.f(th, "cause");
        if (th instanceof CancellationException) {
            return true;
        }
        return o(th) && D();
    }

    public final boolean start() {
        int e0;
        do {
            e0 = e0(H());
            if (e0 == 0) {
                return false;
            }
        } while (e0 != 1);
        return true;
    }

    public String toString() {
        return i0() + '@' + l0.b(this);
    }

    public final w0 z(boolean z, boolean z2, z52<? super Throwable, u22> z52) {
        Throwable th;
        v62.f(z52, "handler");
        Throwable th2 = null;
        v1<?> v1Var = null;
        while (true) {
            Object H = H();
            if (H instanceof y0) {
                y0 y0Var = (y0) H;
                if (y0Var.b()) {
                    if (v1Var == null) {
                        v1Var = T(z52, z);
                    }
                    if (e.compareAndSet(this, H, v1Var)) {
                        return v1Var;
                    }
                } else {
                    b0(y0Var);
                }
            } else if (H instanceof j1) {
                a2 a2 = ((j1) H).a();
                if (a2 != null) {
                    w0 w0Var = b2.e;
                    if (!z || !(H instanceof b)) {
                        th = null;
                    } else {
                        synchronized (H) {
                            th = ((b) H).rootCause;
                            if (th == null || ((z52 instanceof o) && !((b) H).isCompleting)) {
                                if (v1Var == null) {
                                    v1Var = T(z52, z);
                                }
                                if (l(H, a2, v1Var)) {
                                    if (th == null) {
                                        return v1Var;
                                    }
                                    w0Var = v1Var;
                                }
                            }
                            u22 u22 = u22.a;
                        }
                    }
                    if (th != null) {
                        if (z2) {
                            z52.r(th);
                        }
                        return w0Var;
                    }
                    if (v1Var == null) {
                        v1Var = T(z52, z);
                    }
                    if (l(H, a2, v1Var)) {
                        return v1Var;
                    }
                } else if (H != null) {
                    c0((v1) H);
                } else {
                    throw new r22("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                }
            } else {
                if (z2) {
                    if (!(H instanceof s)) {
                        H = null;
                    }
                    s sVar = (s) H;
                    if (sVar != null) {
                        th2 = sVar.a;
                    }
                    z52.r(th2);
                }
                return b2.e;
            }
        }
    }
}
