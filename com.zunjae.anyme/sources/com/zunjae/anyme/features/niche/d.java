package com.zunjae.anyme.features.niche;

import android.content.SharedPreferences;

public final class d {
    private final String a = "ZC_";
    private final SharedPreferences b;

    public d(SharedPreferences sharedPreferences) {
        v62.e(sharedPreferences, "sharedPreferences");
        this.b = sharedPreferences;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean f(java.lang.String r4, com.zunjae.anyme.features.niche.c r5, boolean r6) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.a(r4)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            int r0 = r0.intValue()
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r6 == 0) goto L_0x0012
            r3.d(r4)
        L_0x0012:
            r4 = 1
            if (r0 != 0) goto L_0x001a
            boolean r6 = r5 instanceof com.zunjae.anyme.features.niche.c.a
            if (r6 == 0) goto L_0x001a
            return r4
        L_0x001a:
            boolean r6 = r5 instanceof com.zunjae.anyme.features.niche.c.b
            if (r6 == 0) goto L_0x0028
            com.zunjae.anyme.features.niche.c$b r5 = (com.zunjae.anyme.features.niche.c.b) r5
            int r5 = r5.a()
            if (r0 != r5) goto L_0x0081
        L_0x0026:
            r1 = 1
            goto L_0x0081
        L_0x0028:
            boolean r6 = r5 instanceof com.zunjae.anyme.features.niche.c.d
            if (r6 == 0) goto L_0x0035
            com.zunjae.anyme.features.niche.c$d r5 = (com.zunjae.anyme.features.niche.c.d) r5
            int r5 = r5.a()
            if (r0 >= r5) goto L_0x0081
            goto L_0x0026
        L_0x0035:
            boolean r6 = r5 instanceof com.zunjae.anyme.features.niche.c.C0199c
            if (r6 == 0) goto L_0x0042
            com.zunjae.anyme.features.niche.c$c r5 = (com.zunjae.anyme.features.niche.c.C0199c) r5
            int r5 = r5.a()
            if (r0 <= r5) goto L_0x0081
            goto L_0x0026
        L_0x0042:
            boolean r6 = r5 instanceof com.zunjae.anyme.features.niche.c.e
            if (r6 == 0) goto L_0x0066
            if (r0 <= 0) goto L_0x0081
            com.zunjae.anyme.features.niche.c$e r5 = (com.zunjae.anyme.features.niche.c.e) r5
            int r6 = r5.b()
            if (r6 > 0) goto L_0x0051
            goto L_0x0081
        L_0x0051:
            int r6 = r5.a()
            int r2 = r5.b()
            int r6 = r6 * r2
            if (r0 <= r6) goto L_0x005e
            goto L_0x0081
        L_0x005e:
            int r5 = r5.a()
            int r0 = r0 % r5
            if (r0 != 0) goto L_0x0081
            goto L_0x0026
        L_0x0066:
            boolean r6 = r5 instanceof com.zunjae.anyme.features.niche.c.a
            if (r6 == 0) goto L_0x0082
            com.zunjae.anyme.features.niche.c$a r5 = (com.zunjae.anyme.features.niche.c.a) r5
            int r6 = r5.a()
            int r2 = r5.b()
            int r6 = r6 * r2
            if (r0 <= r6) goto L_0x0079
            goto L_0x0081
        L_0x0079:
            int r5 = r5.a()
            int r0 = r0 % r5
            if (r0 != 0) goto L_0x0081
            goto L_0x0026
        L_0x0081:
            return r1
        L_0x0082:
            j22 r4 = new j22
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.niche.d.f(java.lang.String, com.zunjae.anyme.features.niche.c, boolean):boolean");
    }

    private final String g(String str) {
        return this.a + str;
    }

    public final Integer a(String str) {
        v62.e(str, "key");
        int i = this.b.getInt(g(str), Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(i);
    }

    public final void b(String str) {
        v62.e(str, "key");
        this.b.edit().putLong(g(str), System.currentTimeMillis()).apply();
    }

    public final boolean c(String str) {
        v62.e(str, "key");
        return this.b.getLong(g(str), Long.MIN_VALUE) > 0;
    }

    public final void d(String str) {
        v62.e(str, "key");
        this.b.edit().putInt(g(str), this.b.getInt(g(str), 0) + 1).apply();
    }

    public final boolean e(String str, c cVar) {
        v62.e(str, "key");
        v62.e(cVar, "amount");
        return f(str, cVar, true);
    }
}
