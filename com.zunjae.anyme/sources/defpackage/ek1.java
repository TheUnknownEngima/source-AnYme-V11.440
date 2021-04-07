package defpackage;

import defpackage.xj1;
import java.util.Collections;
import java.util.List;

/* renamed from: ek1  reason: default package */
abstract class ek1 {
    private static final ek1 a = new b();
    private static final ek1 b = new c();

    /* renamed from: ek1$b */
    private static final class b extends ek1 {
        private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j) {
            return (List) pl1.A(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: ck1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: ck1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: ck1} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof defpackage.dk1
                if (r1 == 0) goto L_0x0014
                ck1 r0 = new ck1
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof defpackage.yk1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof defpackage.xj1.i
                if (r1 == 0) goto L_0x0024
                xj1$i r0 = (defpackage.xj1.i) r0
                xj1$i r6 = r0.w(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                defpackage.pl1.P(r3, r4, r0)
                goto L_0x007a
            L_0x002d:
                java.lang.Class<?> r1 = c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0046:
                defpackage.pl1.P(r3, r4, r1)
                r0 = r1
                goto L_0x007a
            L_0x004b:
                boolean r1 = r0 instanceof defpackage.ol1
                if (r1 == 0) goto L_0x005f
                ck1 r1 = new ck1
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                ol1 r0 = (defpackage.ol1) r0
                r1.addAll(r0)
                goto L_0x0046
            L_0x005f:
                boolean r1 = r0 instanceof defpackage.yk1
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof defpackage.xj1.i
                if (r1 == 0) goto L_0x007a
                r1 = r0
                xj1$i r1 = (defpackage.xj1.i) r1
                boolean r2 = r1.t0()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r6
                xj1$i r0 = r1.w(r0)
                goto L_0x0029
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ek1.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j) {
            Object obj2;
            List list = (List) pl1.A(obj, j);
            if (list instanceof dk1) {
                obj2 = ((dk1) list).b0();
            } else if (!c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof yk1) || !(list instanceof xj1.i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    xj1.i iVar = (xj1.i) list;
                    if (iVar.t0()) {
                        iVar.s();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            pl1.P(obj, j, obj2);
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j) {
            List f = f(obj2, j);
            List g = g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            pl1.P(obj, j, f);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j) {
            return g(obj, j, 10);
        }
    }

    /* renamed from: ek1$c */
    private static final class c extends ek1 {
        private c() {
            super();
        }

        static <E> xj1.i<E> f(Object obj, long j) {
            return (xj1.i) pl1.A(obj, j);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j) {
            f(obj, j).s();
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j) {
            xj1.i f = f(obj, j);
            xj1.i f2 = f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.t0()) {
                    f = f.w(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            pl1.P(obj, j, f2);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j) {
            xj1.i f = f(obj, j);
            if (f.t0()) {
                return f;
            }
            int size = f.size();
            xj1.i w = f.w(size == 0 ? 10 : size * 2);
            pl1.P(obj, j, w);
            return w;
        }
    }

    private ek1() {
    }

    static ek1 a() {
        return a;
    }

    static ek1 b() {
        return b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j);
}
