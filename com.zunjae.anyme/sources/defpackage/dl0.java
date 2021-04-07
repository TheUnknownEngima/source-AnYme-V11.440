package defpackage;

/* renamed from: dl0  reason: default package */
final class dl0 implements mm0 {
    private static final dl0 a = new dl0();

    private dl0() {
    }

    public static dl0 a() {
        return a;
    }

    public final boolean b(Class<?> cls) {
        return cl0.class.isAssignableFrom(cls);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.nm0 c(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<cl0> r0 = defpackage.cl0.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0028
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001f
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0024
        L_0x001f:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0024:
            r0.<init>(r5)
            throw r0
        L_0x0028:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x003a }
            cl0 r0 = defpackage.cl0.k(r0)     // Catch:{ Exception -> 0x003a }
            int r1 = defpackage.cl0.e.c     // Catch:{ Exception -> 0x003a }
            r2 = 0
            java.lang.Object r0 = r0.l(r1, r2, r2)     // Catch:{ Exception -> 0x003a }
            nm0 r0 = (defpackage.nm0) r0     // Catch:{ Exception -> 0x003a }
            return r0
        L_0x003a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.String r5 = r5.getName()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0052
            java.lang.String r5 = r2.concat(r5)
            goto L_0x0057
        L_0x0052:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x0057:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl0.c(java.lang.Class):nm0");
    }
}
