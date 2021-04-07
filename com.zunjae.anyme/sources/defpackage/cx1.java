package defpackage;

import com.zunjae.dynsourcegen.d;
import com.zunjae.extensions.c;
import java.util.List;

/* renamed from: cx1  reason: default package */
public final class cx1 {
    public static final cx1 a = new cx1();

    private cx1() {
    }

    private final String c(String str, String str2) {
        if (f92.s(str, str2 + ':', false, 2, (Object) null)) {
            List U = g92.U(str, new String[]{str2 + ':'}, false, 0, 6, (Object) null);
            if (U.size() == 2) {
                return (String) U.get(1);
            }
        }
        return null;
    }

    public final Integer a(d dVar, String str) {
        String str2;
        v62.e(dVar, "instruction");
        v62.e(str, "compareAgainst");
        try {
            List U = g92.U(str, new String[]{dVar.a()}, false, 0, 6, (Object) null);
            String c = dVar.c();
            if (c == null) {
                str2 = (String) U.get(dVar.b());
            } else {
                int hashCode = c.hashCode();
                if (hashCode != 3314326) {
                    if (hashCode == 97440432) {
                        if (c.equals("first")) {
                            str2 = (String) n32.B(U);
                            if (str2 == null) {
                                return null;
                            }
                        }
                    }
                    str2 = (String) U.get(dVar.b());
                } else {
                    if (c.equals("last")) {
                        str2 = (String) n32.J(U);
                        if (str2 == null) {
                            return null;
                        }
                    }
                    str2 = (String) U.get(dVar.b());
                }
            }
            return c.c(str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean b(String str, String str2) {
        v62.e(str, "query");
        v62.e(str2, "compareAgainst");
        List<String> U = g92.U(str, new String[]{"♥"}, false, 0, 6, (Object) null);
        if (U.isEmpty()) {
            return false;
        }
        int i = 0;
        for (String str3 : U) {
            String c = a.c(str3, "SW");
            if (c != null && f92.s(str2, c, false, 2, (Object) null)) {
                i++;
            }
            String c2 = a.c(str3, "CT");
            if (c2 != null && g92.v(str2, c2, false, 2, (Object) null)) {
                i++;
            }
            String c3 = a.c(str3, "EW");
            if (c3 != null && f92.l(str2, c3, false, 2, (Object) null)) {
                i++;
            }
            String c4 = a.c(str3, "DNC");
            if (c4 != null && !g92.v(str2, c4, false, 2, (Object) null)) {
                i++;
            }
        }
        return i == U.size();
    }
}
