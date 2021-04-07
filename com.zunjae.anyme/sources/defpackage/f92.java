package defpackage;

/* renamed from: f92  reason: default package */
class f92 extends e92 {
    public static final boolean k(String str, String str2, boolean z) {
        v62.e(str, "$this$endsWith");
        v62.e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return o(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean l(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return k(str, str2, z);
    }

    public static boolean m(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            defpackage.v62.e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            t72 r0 = defpackage.g92.x(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            s32 r3 = (defpackage.s32) r3
            int r3 = r3.b()
            char r3 = r4.charAt(r3)
            boolean r3 = defpackage.o82.c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f92.n(java.lang.CharSequence):boolean");
    }

    public static final boolean o(String str, int i, String str2, int i2, int i3, boolean z) {
        v62.e(str, "$this$regionMatches");
        v62.e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String p(String str, String str2, String str3, boolean z) {
        v62.e(str, "$this$replace");
        v62.e(str2, "oldValue");
        v62.e(str3, "newValue");
        return m82.g(g92.W(str, new String[]{str2}, z, 0, 4, (Object) null), str3, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 62, (Object) null);
    }

    public static /* synthetic */ String q(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return p(str, str2, str3, z);
    }

    public static final boolean r(String str, String str2, boolean z) {
        v62.e(str, "$this$startsWith");
        v62.e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return o(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean s(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return r(str, str2, z);
    }
}
