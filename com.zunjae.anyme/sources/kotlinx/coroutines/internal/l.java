package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.k0;

public final class l<E> {
    private static final AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final u g = new u("REMOVE_FROZEN");
    public static final a h = new a((r62) null);
    private volatile Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;
    /* access modifiers changed from: private */
    public final int a;
    public /* synthetic */ AtomicReferenceArray b = new AtomicReferenceArray(this.c);
    private final int c;
    /* access modifiers changed from: private */
    public final boolean d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final int a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j, int i) {
            return d(j, 1073741823) | (((long) i) << 0);
        }

        public final long c(long j, int i) {
            return d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        public final long d(long j, long j2) {
            return j & (~j2);
        }
    }

    public static final class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    static {
        Class<l> cls = l.class;
        e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f = AtomicLongFieldUpdater.newUpdater(cls, "_state$internal");
    }

    public l(int i, boolean z) {
        this.c = i;
        this.d = z;
        boolean z2 = true;
        this.a = i - 1;
        if (this.a <= 1073741823) {
            if (!((this.c & this.a) != 0 ? false : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final l<E> e(long j) {
        l<E> lVar = new l<>(this.c * 2, this.d);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.a;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.b.get(i3 & i);
                if (obj == null) {
                    obj = new b(i);
                }
                lVar.b.set(lVar.a & i, obj);
                i++;
            } else {
                lVar._state$internal = h.d(j, 1152921504606846976L);
                return lVar;
            }
        }
    }

    private final l<E> f(long j) {
        while (true) {
            l<E> lVar = (l) this._next;
            if (lVar != null) {
                return lVar;
            }
            e.compareAndSet(this, (Object) null, e(j));
        }
    }

    private final l<E> h(int i, E e2) {
        Object obj = this.b.get(this.a & i);
        if (!(obj instanceof b) || ((b) obj).a != i) {
            return null;
        }
        this.b.set(i & this.a, e2);
        return this;
    }

    private final long k() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f.compareAndSet(this, j, j2));
        return j2;
    }

    /* access modifiers changed from: private */
    public final l<E> n(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state$internal;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (k0.a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return l();
            }
        } while (!f.compareAndSet(this, j, h.b(j, i2)));
        this.b.set(this.a & i3, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c A[LOOP:1: B:20:0x006c->B:23:0x007e, LOOP_START, PHI: r1 
      PHI: (r1v7 kotlinx.coroutines.internal.l) = (r1v6 kotlinx.coroutines.internal.l), (r1v9 kotlinx.coroutines.internal.l) binds: [B:19:0x0064, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(E r13) {
        /*
            r12 = this;
            java.lang.String r0 = "element"
            defpackage.v62.f(r13, r0)
        L_0x0005:
            long r3 = r12._state$internal
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r3
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0017
            kotlinx.coroutines.internal.l$a r13 = h
            int r13 = r13.a(r3)
            return r13
        L_0x0017:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r3
            r9 = 0
            long r0 = r0 >> r9
            int r1 = (int) r0
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r0 = 30
            long r5 = r5 >> r0
            int r0 = (int) r5
            int r10 = r12.a
            int r2 = r0 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L_0x0033
            return r6
        L_0x0033:
            boolean r2 = r12.d
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.b
            r11 = r0 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x0051
            int r2 = r12.c
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0050
            int r0 = r0 - r1
            r0 = r0 & r5
            int r1 = r2 >> 1
            if (r0 <= r1) goto L_0x0005
        L_0x0050:
            return r6
        L_0x0051:
            int r1 = r0 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f
            kotlinx.coroutines.internal.l$a r5 = h
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0005
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r12.b
            r2 = r0 & r10
            r1.set(r2, r13)
            r1 = r12
        L_0x006c:
            long r2 = r1._state$internal
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            kotlinx.coroutines.internal.l r1 = r1.l()
            kotlinx.coroutines.internal.l r1 = r1.h(r0, r13)
            if (r1 == 0) goto L_0x0081
            goto L_0x006c
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.l.d(java.lang.Object):int");
    }

    public final boolean g() {
        long j;
        do {
            j = this._state$internal;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final int i() {
        long j = this._state$internal;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    public final boolean j() {
        long j = this._state$internal;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final l<E> l() {
        return f(k());
    }

    public final Object m() {
        Object obj;
        while (true) {
            long j = this._state$internal;
            if ((1152921504606846976L & j) == 0) {
                int i = (int) ((1073741823 & j) >> 0);
                if ((this.a & ((int) ((1152921503533105152L & j) >> 30))) != (this.a & i)) {
                    obj = this.b.get(this.a & i);
                    if (obj != null) {
                        if (!(obj instanceof b)) {
                            int i2 = (i + 1) & 1073741823;
                            if (!f.compareAndSet(this, j, h.b(j, i2))) {
                                if (this.d) {
                                    l lVar = this;
                                    do {
                                        lVar = lVar.n(i, i2);
                                    } while (lVar != null);
                                    break;
                                }
                            } else {
                                this.b.set(this.a & i, (Object) null);
                                break;
                            }
                        } else {
                            return null;
                        }
                    } else if (this.d) {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return g;
            }
        }
        return obj;
    }
}
