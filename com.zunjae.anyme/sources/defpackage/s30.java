package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: s30  reason: default package */
final class s30 {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private final i50 a = new i50();
    private final StringBuilder b = new StringBuilder();

    private void a(v30 v30, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    v30.v(matcher.group(1));
                }
                str = str.substring(0, indexOf);
            }
            String[] z0 = v50.z0(str, "\\.");
            String str2 = z0[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                v30.u(str2.substring(0, indexOf2));
                v30.t(str2.substring(indexOf2 + 1));
            } else {
                v30.u(str2);
            }
            if (z0.length > 1) {
                v30.s((String[]) v50.q0(z0, 1, z0.length));
            }
        }
    }

    private static boolean b(i50 i50) {
        int c2 = i50.c();
        int d = i50.d();
        byte[] bArr = i50.a;
        if (c2 + 2 > d) {
            return false;
        }
        int i = c2 + 1;
        if (bArr[c2] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (bArr[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= d) {
                i50.N(d - i50.c());
                return true;
            } else if (((char) bArr[i2]) == '*' && ((char) bArr[i3]) == '/') {
                i2 = i3 + 1;
                d = i2;
            } else {
                i2 = i3;
            }
        }
    }

    private static boolean c(i50 i50) {
        char j = j(i50, i50.c());
        if (j != 9 && j != 10 && j != 12 && j != 13 && j != ' ') {
            return false;
        }
        i50.N(1);
        return true;
    }

    private static String e(i50 i50, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int c2 = i50.c();
        int d = i50.d();
        while (c2 < d && !z) {
            char c3 = (char) i50.a[c2];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z = true;
            } else {
                c2++;
                sb.append(c3);
            }
        }
        i50.N(c2 - i50.c());
        return sb.toString();
    }

    static String f(i50 i50, StringBuilder sb) {
        m(i50);
        if (i50.a() == 0) {
            return null;
        }
        String e = e(i50, sb);
        if (!"".equals(e)) {
            return e;
        }
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) i50.z());
        return sb2.toString();
    }

    private static String g(i50 i50, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int c2 = i50.c();
            String f = f(i50, sb);
            if (f == null) {
                return null;
            }
            if ("}".equals(f) || ";".equals(f)) {
                i50.M(c2);
                z = true;
            } else {
                sb2.append(f);
            }
        }
        return sb2.toString();
    }

    private static String h(i50 i50, StringBuilder sb) {
        m(i50);
        if (i50.a() < 5 || !"::cue".equals(i50.w(5))) {
            return null;
        }
        int c2 = i50.c();
        String f = f(i50, sb);
        if (f == null) {
            return null;
        }
        if ("{".equals(f)) {
            i50.M(c2);
            return "";
        }
        String k = "(".equals(f) ? k(i50) : null;
        if (!")".equals(f(i50, sb))) {
            return null;
        }
        return k;
    }

    private static void i(i50 i50, v30 v30, StringBuilder sb) {
        m(i50);
        String e = e(i50, sb);
        if (!"".equals(e) && ":".equals(f(i50, sb))) {
            m(i50);
            String g = g(i50, sb);
            if (g != null && !"".equals(g)) {
                int c2 = i50.c();
                String f = f(i50, sb);
                if (!";".equals(f)) {
                    if ("}".equals(f)) {
                        i50.M(c2);
                    } else {
                        return;
                    }
                }
                if ("color".equals(e)) {
                    v30.p(t40.c(g));
                } else if ("background-color".equals(e)) {
                    v30.n(t40.c(g));
                } else if ("text-decoration".equals(e)) {
                    if ("underline".equals(g)) {
                        v30.w(true);
                    }
                } else if ("font-family".equals(e)) {
                    v30.q(g);
                } else if ("font-weight".equals(e)) {
                    if ("bold".equals(g)) {
                        v30.o(true);
                    }
                } else if ("font-style".equals(e) && "italic".equals(g)) {
                    v30.r(true);
                }
            }
        }
    }

    private static char j(i50 i50, int i) {
        return (char) i50.a[i];
    }

    private static String k(i50 i50) {
        int c2 = i50.c();
        int d = i50.d();
        boolean z = false;
        while (c2 < d && !z) {
            int i = c2 + 1;
            z = ((char) i50.a[c2]) == ')';
            c2 = i;
        }
        return i50.w((c2 - 1) - i50.c()).trim();
    }

    static void l(i50 i50) {
        do {
        } while (!TextUtils.isEmpty(i50.m()));
    }

    static void m(i50 i50) {
        while (true) {
            boolean z = true;
            while (i50.a() > 0 && z) {
                if (!c(i50) && !b(i50)) {
                    z = false;
                }
            }
            return;
        }
    }

    public List<v30> d(i50 i50) {
        this.b.setLength(0);
        int c2 = i50.c();
        l(i50);
        this.a.K(i50.a, i50.c());
        this.a.M(c2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String h = h(this.a, this.b);
            if (h == null || !"{".equals(f(this.a, this.b))) {
                return arrayList;
            }
            v30 v30 = new v30();
            a(v30, h);
            String str = null;
            boolean z = false;
            while (!z) {
                int c3 = this.a.c();
                String f = f(this.a, this.b);
                boolean z2 = f == null || "}".equals(f);
                if (!z2) {
                    this.a.M(c3);
                    i(this.a, v30, this.b);
                }
                str = f;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(v30);
            }
        }
    }
}
