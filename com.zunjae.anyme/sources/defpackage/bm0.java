package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bm0  reason: default package */
final class bm0 extends yl0 {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private bm0() {
        super();
    }

    private static <E> List<E> e(Object obj, long j) {
        return (List) bo0.G(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj, long j) {
        Object obj2;
        List list = (List) bo0.G(obj, j);
        if (list instanceof vl0) {
            obj2 = ((vl0) list).a0();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof ym0) || !(list instanceof ll0)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                ll0 ll0 = (ll0) list;
                if (ll0.T()) {
                    ll0.q();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        bo0.g(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: wl0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: wl0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: wl0} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void b(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.util.List r6 = e(r6, r7)
            int r0 = r6.size()
            java.util.List r1 = e(r5, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0035
            boolean r2 = r1 instanceof defpackage.vl0
            if (r2 == 0) goto L_0x001c
            wl0 r1 = new wl0
            r1.<init>((int) r0)
            goto L_0x0031
        L_0x001c:
            boolean r2 = r1 instanceof defpackage.ym0
            if (r2 == 0) goto L_0x002c
            boolean r2 = r1 instanceof defpackage.ll0
            if (r2 == 0) goto L_0x002c
            ll0 r1 = (defpackage.ll0) r1
            ll0 r0 = r1.l0(r0)
            r1 = r0
            goto L_0x0031
        L_0x002c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0031:
            defpackage.bo0.g(r5, r7, r1)
            goto L_0x0082
        L_0x0035:
            java.lang.Class<?> r2 = c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0053
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
        L_0x004e:
            defpackage.bo0.g(r5, r7, r2)
            r1 = r2
            goto L_0x0082
        L_0x0053:
            boolean r2 = r1 instanceof defpackage.ao0
            if (r2 == 0) goto L_0x0067
            wl0 r2 = new wl0
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            ao0 r1 = (defpackage.ao0) r1
            r2.addAll(r1)
            goto L_0x004e
        L_0x0067:
            boolean r2 = r1 instanceof defpackage.ym0
            if (r2 == 0) goto L_0x0082
            boolean r2 = r1 instanceof defpackage.ll0
            if (r2 == 0) goto L_0x0082
            r2 = r1
            ll0 r2 = (defpackage.ll0) r2
            boolean r3 = r2.T()
            if (r3 != 0) goto L_0x0082
            int r1 = r1.size()
            int r1 = r1 + r0
            ll0 r1 = r2.l0(r1)
            goto L_0x0031
        L_0x0082:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0091
            if (r2 <= 0) goto L_0x0091
            r1.addAll(r6)
        L_0x0091:
            if (r0 <= 0) goto L_0x0094
            r6 = r1
        L_0x0094:
            defpackage.bo0.g(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bm0.b(java.lang.Object, java.lang.Object, long):void");
    }
}
