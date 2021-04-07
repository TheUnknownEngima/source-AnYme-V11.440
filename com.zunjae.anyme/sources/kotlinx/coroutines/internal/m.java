package kotlinx.coroutines.internal;

import kotlinx.coroutines.z1;

public final class m {
    private static final boolean a = v.e("kotlinx.coroutines.fast.service.loader", true);
    public static final z1 b;

    static {
        m mVar = new m();
        b = mVar.a();
    }

    private m() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r2 = kotlinx.coroutines.internal.n.a(r4, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.z1 a() {
        /*
            r8 = this;
            r0 = 2
            r1 = 0
            boolean r2 = a     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0018
            java.lang.Class<kotlinx.coroutines.internal.MainDispatcherFactory> r2 = kotlinx.coroutines.internal.MainDispatcherFactory.class
            kotlinx.coroutines.internal.g r3 = kotlinx.coroutines.internal.g.a     // Catch:{ all -> 0x006d }
            java.lang.ClassLoader r4 = r2.getClassLoader()     // Catch:{ all -> 0x006d }
            java.lang.String r5 = "clz.classLoader"
            defpackage.v62.b(r4, r5)     // Catch:{ all -> 0x006d }
            java.util.List r2 = r3.b(r2, r4)     // Catch:{ all -> 0x006d }
            goto L_0x0029
        L_0x0018:
            java.util.Iterator r2 = defpackage.a.b()     // Catch:{ all -> 0x006d }
            java.lang.String r3 = "ServiceLoader.load(\n    …             ).iterator()"
            defpackage.v62.b(r2, r3)     // Catch:{ all -> 0x006d }
            g82 r2 = defpackage.k82.a(r2)     // Catch:{ all -> 0x006d }
            java.util.List r2 = defpackage.m82.j(r2)     // Catch:{ all -> 0x006d }
        L_0x0029:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x006d }
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x006d }
            if (r4 != 0) goto L_0x0035
            r4 = r1
            goto L_0x005c
        L_0x0035:
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x006d }
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x006d }
            if (r5 != 0) goto L_0x0040
            goto L_0x005c
        L_0x0040:
            r5 = r4
            kotlinx.coroutines.internal.MainDispatcherFactory r5 = (kotlinx.coroutines.internal.MainDispatcherFactory) r5     // Catch:{ all -> 0x006d }
            int r5 = r5.c()     // Catch:{ all -> 0x006d }
        L_0x0047:
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x006d }
            r7 = r6
            kotlinx.coroutines.internal.MainDispatcherFactory r7 = (kotlinx.coroutines.internal.MainDispatcherFactory) r7     // Catch:{ all -> 0x006d }
            int r7 = r7.c()     // Catch:{ all -> 0x006d }
            if (r5 >= r7) goto L_0x0056
            r4 = r6
            r5 = r7
        L_0x0056:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x006d }
            if (r6 != 0) goto L_0x0047
        L_0x005c:
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0067
            kotlinx.coroutines.z1 r2 = kotlinx.coroutines.internal.n.a(r4, r2)     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x0067
            goto L_0x0074
        L_0x0067:
            kotlinx.coroutines.internal.o r2 = new kotlinx.coroutines.internal.o     // Catch:{ all -> 0x006d }
            r2.<init>(r1, r1, r0, r1)     // Catch:{ all -> 0x006d }
            goto L_0x0074
        L_0x006d:
            r2 = move-exception
            kotlinx.coroutines.internal.o r3 = new kotlinx.coroutines.internal.o
            r3.<init>(r2, r1, r0, r1)
            r2 = r3
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.m.a():kotlinx.coroutines.z1");
    }
}
