package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: ta2  reason: default package */
public final class ta2 {
    private static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;
    private final String b;
    private final String c;
    final String d;
    final int e;
    private final List<String> f;
    @Nullable
    private final List<String> g;
    @Nullable
    private final String h;
    private final String i;

    /* renamed from: ta2$a */
    public static final class a {
        @Nullable
        String a;
        String b = "";
        String c = "";
        @Nullable
        String d;
        int e = -1;
        final List<String> f;
        @Nullable
        List<String> g;
        @Nullable
        String h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        private static String d(String str, int i, int i2) {
            return ib2.d(ta2.u(str, i, i2, false));
        }

        private boolean h(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean i(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int k(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(ta2.a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        private void m() {
            List<String> list = this.f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f.isEmpty()) {
                this.f.add("");
                return;
            }
            List<String> list2 = this.f;
            list2.set(list2.size() - 1, "");
        }

        private static int o(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        private void p(String str, int i, int i2, boolean z, boolean z2) {
            String a2 = ta2.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!h(a2)) {
                if (i(a2)) {
                    m();
                    return;
                }
                List<String> list = this.f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f;
                    list2.set(list2.size() - 1, a2);
                } else {
                    this.f.add(a2);
                }
                if (z) {
                    this.f.add("");
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private void r(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = defpackage.ib2.o(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.p(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ta2.a.r(java.lang.String, int, int):void");
        }

        private static int t(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        private static int u(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        public a a(String str, @Nullable String str2) {
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(ta2.b(str, " \"'<>#&=", true, false, true, true));
                this.g.add(str2 != null ? ta2.b(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public a b(String str, @Nullable String str2) {
            if (str != null) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                this.g.add(ta2.b(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                this.g.add(str2 != null ? ta2.b(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("name == null");
        }

        public ta2 c() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.d != null) {
                return new ta2(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        public int e() {
            int i = this.e;
            return i != -1 ? i : ta2.e(this.a);
        }

        public a f(@Nullable String str) {
            this.g = str != null ? ta2.B(ta2.b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public a g(String str) {
            if (str != null) {
                String d2 = d(str, 0, str.length());
                if (d2 != null) {
                    this.d = d2;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        /* access modifiers changed from: package-private */
        public a j(@Nullable ta2 ta2, String str) {
            int o;
            int i;
            ta2 ta22 = ta2;
            String str2 = str;
            int E = ib2.E(str2, 0, str.length());
            int F = ib2.F(str2, E, str.length());
            int t = t(str2, E, F);
            if (t != -1) {
                if (str.regionMatches(true, E, "https:", 0, 6)) {
                    this.a = "https";
                    E += 6;
                } else if (str.regionMatches(true, E, "http:", 0, 5)) {
                    this.a = "http";
                    E += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, t) + "'");
                }
            } else if (ta22 != null) {
                this.a = ta22.a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int u = u(str2, E, F);
            char c2 = '?';
            char c3 = '#';
            if (u >= 2 || ta22 == null || !ta22.a.equals(this.a)) {
                int i2 = E + u;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    o = ib2.o(str2, i2, F, "@/\\?#");
                    char charAt = o != F ? str2.charAt(o) : 65535;
                    if (charAt == 65535 || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        int i3 = o;
                        int o2 = o(str2, i2, i3);
                        int i4 = o2 + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int n = ib2.n(str2, i2, o, ':');
                                int i5 = n;
                                String str3 = "%40";
                                i = o;
                                String a2 = ta2.a(str, i2, n, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a2 = this.b + str3 + a2;
                                }
                                this.b = a2;
                                if (i5 != i) {
                                    this.c = ta2.a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = o;
                                this.c += "%40" + ta2.a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c2 = '?';
                        c3 = '#';
                    }
                }
                int i32 = o;
                int o22 = o(str2, i2, i32);
                int i42 = o22 + 1;
                if (i42 < i32) {
                    this.d = d(str2, i2, o22);
                    int k = k(str2, i42, i32);
                    this.e = k;
                    if (k == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i42, i32) + '\"');
                    }
                } else {
                    this.d = d(str2, i2, o22);
                    this.e = ta2.e(this.a);
                }
                if (this.d != null) {
                    E = i32;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i2, o22) + '\"');
                }
            } else {
                this.b = ta2.k();
                this.c = ta2.g();
                this.d = ta22.d;
                this.e = ta22.e;
                this.f.clear();
                this.f.addAll(ta2.i());
                if (E == F || str2.charAt(E) == '#') {
                    f(ta2.j());
                }
            }
            int o3 = ib2.o(str2, E, F, "?#");
            r(str2, E, o3);
            if (o3 < F && str2.charAt(o3) == '?') {
                int n2 = ib2.n(str2, o3, F, '#');
                this.g = ta2.B(ta2.a(str, o3 + 1, n2, " \"'<>#", true, false, true, true, (Charset) null));
                o3 = n2;
            }
            if (o3 < F && str2.charAt(o3) == '#') {
                this.h = ta2.a(str, 1 + o3, F, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        public a l(String str) {
            if (str != null) {
                this.c = ta2.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        public a n(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.e = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        public a q() {
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.set(i, ta2.b(this.f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.g.get(i2);
                    if (str != null) {
                        this.g.set(i2, ta2.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.h;
            if (str2 != null) {
                this.h = ta2.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a s(String str) {
            if (str != null) {
                String str2 = "http";
                if (!str.equalsIgnoreCase(str2)) {
                    str2 = "https";
                    if (!str.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("unexpected scheme: " + str);
                    }
                }
                this.a = str2;
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            String str2 = this.a;
            if (str2 != null) {
                sb.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb.append(str);
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str3 = this.d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            if (!(this.e == -1 && this.a == null)) {
                int e2 = e();
                String str4 = this.a;
                if (str4 == null || e2 != ta2.e(str4)) {
                    sb.append(':');
                    sb.append(e2);
                }
            }
            ta2.t(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                ta2.o(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        public a v(String str) {
            if (str != null) {
                this.b = ta2.b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }
    }

    ta2(a aVar) {
        this.a = aVar.a;
        this.b = v(aVar.b, false);
        this.c = v(aVar.c, false);
        this.d = aVar.d;
        this.e = aVar.e();
        this.f = w(aVar.f, false);
        List<String> list = aVar.g;
        String str = null;
        this.g = list != null ? w(list, true) : null;
        String str2 = aVar.h;
        this.h = str2 != null ? v(str2, false) : str;
        this.i = aVar.toString();
    }

    static List<String> B(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i4 = i3;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str.codePointAt(i5);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || y(str, i5, i3)))) && (codePointAt != 43 || !z3))) {
                    i5 += Character.charCount(codePointAt);
                }
            }
            nd2 nd2 = new nd2();
            int i6 = i2;
            nd2.Q0(str, i2, i5);
            d(nd2, str, i5, i3, str2, z, z2, z3, z4, charset);
            return nd2.c0();
        }
        int i7 = i2;
        return str.substring(i2, i3);
    }

    static String b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    static String c(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    static void d(nd2 nd2, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        nd2 nd22 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    nd2.P0(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !y(str, i2, i3)))))) {
                    if (nd22 == null) {
                        nd22 = new nd2();
                    }
                    if (charset == null || charset.equals(ib2.i)) {
                        nd22.R0(codePointAt);
                    } else {
                        nd22.O0(str, i2, Character.charCount(codePointAt) + i2, charset);
                    }
                    while (!nd22.v()) {
                        byte readByte = nd22.readByte() & 255;
                        nd2.F0(37);
                        nd2.F0(j[(readByte >> 4) & 15]);
                        nd2.F0(j[readByte & 15]);
                    }
                } else {
                    nd2.R0(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    public static int e(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static ta2 l(String str) {
        a aVar = new a();
        aVar.j((ta2) null, str);
        return aVar.c();
    }

    static void o(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    @Nullable
    public static ta2 r(String str) {
        try {
            return l(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    static void t(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    static String u(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                nd2 nd2 = new nd2();
                nd2.Q0(str, i2, i4);
                x(nd2, str, i4, i3, z);
                return nd2.c0();
            }
        }
        return str.substring(i2, i3);
    }

    static String v(String str, boolean z) {
        return u(str, 0, str.length(), z);
    }

    private List<String> w(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? v(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static void x(nd2 nd2, String str, int i2, int i3, boolean z) {
        int i4;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37 && (i4 = i2 + 2) < i3) {
                int k = ib2.k(str.charAt(i2 + 1));
                int k2 = ib2.k(str.charAt(i4));
                if (!(k == -1 || k2 == -1)) {
                    nd2.F0((k << 4) + k2);
                    i2 = i4;
                    i2 += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                nd2.F0(32);
                i2 += Character.charCount(codePointAt);
            }
            nd2.R0(codePointAt);
            i2 += Character.charCount(codePointAt);
        }
    }

    static boolean y(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && ib2.k(str.charAt(i2 + 1)) != -1 && ib2.k(str.charAt(i4)) != -1;
    }

    @Nullable
    public String A() {
        if (this.g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        o(sb, this.g);
        return sb.toString();
    }

    public String C() {
        a q = q("/...");
        q.v("");
        q.l("");
        return q.c().toString();
    }

    @Nullable
    public ta2 D(String str) {
        a q = q(str);
        if (q != null) {
            return q.c();
        }
        return null;
    }

    public String E() {
        return this.a;
    }

    public URI F() {
        a p = p();
        p.q();
        String aVar = p.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ta2) && ((ta2) obj).i.equals(this.i);
    }

    @Nullable
    public String f() {
        if (this.h == null) {
            return null;
        }
        return this.i.substring(this.i.indexOf(35) + 1);
    }

    public String g() {
        if (this.c.isEmpty()) {
            return "";
        }
        int indexOf = this.i.indexOf(64);
        return this.i.substring(this.i.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public String h() {
        int indexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        return this.i.substring(indexOf, ib2.o(str, indexOf, str.length(), "?#"));
    }

    public int hashCode() {
        return this.i.hashCode();
    }

    public List<String> i() {
        int indexOf = this.i.indexOf(47, this.a.length() + 3);
        String str = this.i;
        int o = ib2.o(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < o) {
            int i2 = indexOf + 1;
            int n = ib2.n(this.i, i2, o, '/');
            arrayList.add(this.i.substring(i2, n));
            indexOf = n;
        }
        return arrayList;
    }

    @Nullable
    public String j() {
        if (this.g == null) {
            return null;
        }
        int indexOf = this.i.indexOf(63) + 1;
        String str = this.i;
        return this.i.substring(indexOf, ib2.n(str, indexOf, str.length(), '#'));
    }

    public String k() {
        if (this.b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return this.i.substring(length, ib2.o(str, length, str.length(), ":@"));
    }

    public String m() {
        return this.d;
    }

    public boolean n() {
        return this.a.equals("https");
    }

    public a p() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = k();
        aVar.c = g();
        aVar.d = this.d;
        aVar.e = this.e != e(this.a) ? this.e : -1;
        aVar.f.clear();
        aVar.f.addAll(i());
        aVar.f(j());
        aVar.h = f();
        return aVar;
    }

    @Nullable
    public a q(String str) {
        try {
            a aVar = new a();
            aVar.j(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public List<String> s() {
        return this.f;
    }

    public String toString() {
        return this.i;
    }

    public int z() {
        return this.e;
    }
}
