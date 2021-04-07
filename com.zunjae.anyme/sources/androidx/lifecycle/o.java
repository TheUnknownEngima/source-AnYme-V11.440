package androidx.lifecycle;

import androidx.lifecycle.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class o extends h {
    private y<m, b> a = new y<>();
    private h.b b;
    private final WeakReference<n> c;
    private int d = 0;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<h.b> g = new ArrayList<>();

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                androidx.lifecycle.h$b[] r0 = androidx.lifecycle.h.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                androidx.lifecycle.h$b r2 = androidx.lifecycle.h.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.h$b r3 = androidx.lifecycle.h.b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.h$b r4 = androidx.lifecycle.h.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.h$b r5 = androidx.lifecycle.h.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.h$b r6 = androidx.lifecycle.h.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.lifecycle.h$a[] r5 = androidx.lifecycle.h.a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                a = r5
                androidx.lifecycle.h$a r6 = androidx.lifecycle.h.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.h$a r5 = androidx.lifecycle.h.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.h$a r1 = androidx.lifecycle.h.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.o.a.<clinit>():void");
        }
    }

    static class b {
        h.b a;
        l b;

        b(m mVar, h.b bVar) {
            this.b = q.f(mVar);
            this.a = bVar;
        }

        /* access modifiers changed from: package-private */
        public void a(n nVar, h.a aVar) {
            h.b h = o.h(aVar);
            this.a = o.l(this.a, h);
            this.b.c(nVar, aVar);
            this.a = h;
        }
    }

    public o(n nVar) {
        this.c = new WeakReference<>(nVar);
        this.b = h.b.INITIALIZED;
    }

    private void d(n nVar) {
        Iterator<Map.Entry<m, b>> a2 = this.a.a();
        while (a2.hasNext() && !this.f) {
            Map.Entry next = a2.next();
            b bVar = (b) next.getValue();
            while (bVar.a.compareTo(this.b) > 0 && !this.f && this.a.contains(next.getKey())) {
                h.a f2 = f(bVar.a);
                o(h(f2));
                bVar.a(nVar, f2);
                n();
            }
        }
    }

    private h.b e(m mVar) {
        Map.Entry<m, b> l = this.a.l(mVar);
        h.b bVar = null;
        h.b bVar2 = l != null ? l.getValue().a : null;
        if (!this.g.isEmpty()) {
            ArrayList<h.b> arrayList = this.g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return l(l(this.b, bVar2), bVar);
    }

    private static h.a f(h.b bVar) {
        int i = a.b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return h.a.ON_DESTROY;
        } else {
            if (i == 3) {
                return h.a.ON_STOP;
            }
            if (i == 4) {
                return h.a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    private void g(n nVar) {
        z<K, V>.d g2 = this.a.g();
        while (g2.hasNext() && !this.f) {
            Map.Entry entry = (Map.Entry) g2.next();
            b bVar = (b) entry.getValue();
            while (bVar.a.compareTo(this.b) < 0 && !this.f && this.a.contains(entry.getKey())) {
                o(bVar.a);
                bVar.a(nVar, r(bVar.a));
                n();
            }
        }
    }

    static h.b h(h.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
            case 2:
                return h.b.CREATED;
            case 3:
            case 4:
                return h.b.STARTED;
            case 5:
                return h.b.RESUMED;
            case 6:
                return h.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    private boolean j() {
        if (this.a.size() == 0) {
            return true;
        }
        h.b bVar = this.a.c().getValue().a;
        h.b bVar2 = this.a.h().getValue().a;
        return bVar == bVar2 && this.b == bVar2;
    }

    static h.b l(h.b bVar, h.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    private void m(h.b bVar) {
        if (this.b != bVar) {
            this.b = bVar;
            if (this.e || this.d != 0) {
                this.f = true;
                return;
            }
            this.e = true;
            q();
            this.e = false;
        }
    }

    private void n() {
        ArrayList<h.b> arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void o(h.b bVar) {
        this.g.add(bVar);
    }

    private void q() {
        n nVar = (n) this.c.get();
        if (nVar != null) {
            while (true) {
                boolean j = j();
                this.f = false;
                if (!j) {
                    if (this.b.compareTo(this.a.c().getValue().a) < 0) {
                        d(nVar);
                    }
                    Map.Entry<m, b> h = this.a.h();
                    if (!this.f && h != null && this.b.compareTo(h.getValue().a) > 0) {
                        g(nVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    private static h.a r(h.b bVar) {
        int i = a.b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return h.a.ON_START;
            }
            if (i == 3) {
                return h.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return h.a.ON_CREATE;
    }

    public void a(m mVar) {
        n nVar;
        h.b bVar = this.b;
        h.b bVar2 = h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = h.b.INITIALIZED;
        }
        b bVar3 = new b(mVar, bVar2);
        if (this.a.j(mVar, bVar3) == null && (nVar = (n) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            h.b e2 = e(mVar);
            this.d++;
            while (bVar3.a.compareTo(e2) < 0 && this.a.contains(mVar)) {
                o(bVar3.a);
                bVar3.a(nVar, r(bVar3.a));
                n();
                e2 = e(mVar);
            }
            if (!z) {
                q();
            }
            this.d--;
        }
    }

    public h.b b() {
        return this.b;
    }

    public void c(m mVar) {
        this.a.k(mVar);
    }

    public void i(h.a aVar) {
        m(h(aVar));
    }

    @Deprecated
    public void k(h.b bVar) {
        p(bVar);
    }

    public void p(h.b bVar) {
        m(bVar);
    }
}
