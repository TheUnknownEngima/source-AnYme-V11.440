package defpackage;

import java.nio.charset.Charset;

/* renamed from: pa  reason: default package */
public class pa {
    private static final int a = (bc.h - 1024);

    private static int a(String str) {
        return str.getBytes().length;
    }

    private static String b(String str, int i) {
        int round = (int) Math.round(((double) (((long) str.length()) * ((long) i))) / ((double) str.getBytes().length));
        while (true) {
            str = str.substring(0, round);
            if (str.getBytes().length <= i) {
                return str;
            }
            round = str.length() - 1;
        }
    }

    private static String c(String str, int i) {
        return Charset.defaultCharset().displayName().equals("UTF-8") ? f(str, i) : b(str, i);
    }

    public static boolean d(String str) {
        return a(str) > a;
    }

    public static String e(String str) {
        int a2 = a("…");
        return c(str, a - a2) + "…";
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[LOOP:0: B:1:0x0003->B:20:0x0033, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String f(java.lang.String r6, int r7) {
        /*
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0003:
            int r3 = r6.length()
            if (r1 >= r3) goto L_0x0036
            char r3 = r6.charAt(r1)
            r4 = 127(0x7f, float:1.78E-43)
            r5 = 1
            if (r3 > r4) goto L_0x0015
            r3 = 1
        L_0x0013:
            r4 = 0
            goto L_0x002b
        L_0x0015:
            r4 = 2047(0x7ff, float:2.868E-42)
            if (r3 > r4) goto L_0x001b
            r3 = 2
            goto L_0x0013
        L_0x001b:
            r4 = 55295(0xd7ff, float:7.7485E-41)
            if (r3 > r4) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            r4 = 57343(0xdfff, float:8.0355E-41)
            if (r3 > r4) goto L_0x0029
            r3 = 4
            r4 = 1
            goto L_0x002b
        L_0x0029:
            r3 = 3
            goto L_0x0013
        L_0x002b:
            int r2 = r2 + r3
            if (r2 <= r7) goto L_0x0033
            java.lang.String r6 = r6.substring(r0, r1)
            return r6
        L_0x0033:
            int r1 = r1 + r4
            int r1 = r1 + r5
            goto L_0x0003
        L_0x0036:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa.f(java.lang.String, int):java.lang.String");
    }
}
