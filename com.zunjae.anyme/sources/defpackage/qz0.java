package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: qz0  reason: default package */
final class qz0 extends oz0 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private qz0() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: mz0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: mz0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: mz0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> e(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = f(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof defpackage.lz0
            if (r1 == 0) goto L_0x0014
            mz0 r0 = new mz0
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof defpackage.r01
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof defpackage.bz0
            if (r1 == 0) goto L_0x0024
            bz0 r0 = (defpackage.bz0) r0
            bz0 r6 = r0.f(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            defpackage.s11.j(r3, r4, r0)
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
            defpackage.s11.j(r3, r4, r1)
            r0 = r1
            goto L_0x007a
        L_0x004b:
            boolean r1 = r0 instanceof defpackage.r11
            if (r1 == 0) goto L_0x005f
            mz0 r1 = new mz0
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            r11 r0 = (defpackage.r11) r0
            r1.addAll(r0)
            goto L_0x0046
        L_0x005f:
            boolean r1 = r0 instanceof defpackage.r01
            if (r1 == 0) goto L_0x007a
            boolean r1 = r0 instanceof defpackage.bz0
            if (r1 == 0) goto L_0x007a
            r1 = r0
            bz0 r1 = (defpackage.bz0) r1
            boolean r2 = r1.zza()
            if (r2 != 0) goto L_0x007a
            int r0 = r0.size()
            int r0 = r0 + r6
            bz0 r0 = r1.f(r0)
            goto L_0x0029
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.e(java.lang.Object, long, int):java.util.List");
    }

    private static <E> List<E> f(Object obj, long j) {
        return (List) s11.F(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final <E> void b(Object obj, Object obj2, long j) {
        List f = f(obj2, j);
        List e = e(obj, j, f.size());
        int size = e.size();
        int size2 = f.size();
        if (size > 0 && size2 > 0) {
            e.addAll(f);
        }
        if (size > 0) {
            f = e;
        }
        s11.j(obj, j, f);
    }

    /* access modifiers changed from: package-private */
    public final void d(Object obj, long j) {
        Object obj2;
        List list = (List) s11.F(obj, j);
        if (list instanceof lz0) {
            obj2 = ((lz0) list).v();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof r01) || !(list instanceof bz0)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                bz0 bz0 = (bz0) list;
                if (bz0.zza()) {
                    bz0.f0();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        s11.j(obj, j, obj2);
    }
}
