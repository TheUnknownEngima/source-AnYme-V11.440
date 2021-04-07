package defpackage;

import defpackage.sa2;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: bc2  reason: default package */
public final class bc2 {
    static {
        qd2.m("\"\\");
        qd2.m("\t ,=");
    }

    public static long a(sa2 sa2) {
        return j(sa2.c("Content-Length"));
    }

    public static long b(cb2 cb2) {
        return a(cb2.m());
    }

    public static boolean c(cb2 cb2) {
        if (cb2.F().g().equals("HEAD")) {
            return false;
        }
        int h = cb2.h();
        return (((h >= 100 && h < 200) || h == 204 || h == 304) && b(cb2) == -1 && !"chunked".equalsIgnoreCase(cb2.k("Transfer-Encoding"))) ? false : true;
    }

    public static boolean d(sa2 sa2) {
        return k(sa2).contains("*");
    }

    public static boolean e(cb2 cb2) {
        return d(cb2.m());
    }

    public static int f(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static void g(ma2 ma2, ta2 ta2, sa2 sa2) {
        if (ma2 != ma2.a) {
            List<la2> f = la2.f(ta2, sa2);
            if (!f.isEmpty()) {
                ma2.a(ta2, f);
            }
        }
    }

    public static int h(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int i(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == 9)) {
            i++;
        }
        return i;
    }

    private static long j(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static Set<String> k(sa2 sa2) {
        Set<String> emptySet = Collections.emptySet();
        int h = sa2.h();
        for (int i = 0; i < h; i++) {
            if ("Vary".equalsIgnoreCase(sa2.e(i))) {
                String i2 = sa2.i(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : i2.split(",")) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    private static Set<String> l(cb2 cb2) {
        return k(cb2.m());
    }

    public static sa2 m(sa2 sa2, sa2 sa22) {
        Set<String> k = k(sa22);
        if (k.isEmpty()) {
            return new sa2.a().d();
        }
        sa2.a aVar = new sa2.a();
        int h = sa2.h();
        for (int i = 0; i < h; i++) {
            String e = sa2.e(i);
            if (k.contains(e)) {
                aVar.a(e, sa2.i(i));
            }
        }
        return aVar.d();
    }

    public static sa2 n(cb2 cb2) {
        return m(cb2.z().F().e(), cb2.m());
    }

    public static boolean o(cb2 cb2, sa2 sa2, ab2 ab2) {
        for (String next : l(cb2)) {
            if (!ib2.q(sa2.j(next), ab2.d(next))) {
                return false;
            }
        }
        return true;
    }
}
