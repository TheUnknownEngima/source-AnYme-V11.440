package defpackage;

/* renamed from: tf2  reason: default package */
public class tf2 {
    private String a;
    private int b = 0;

    public tf2(String str) {
        jf2.j(str);
        this.a = str;
    }

    private int r() {
        return this.a.length() - this.b;
    }

    public static String s(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        char c = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '\\' || (c != 0 && c == '\\')) {
                sb.append(c2);
            }
            i++;
            c = c2;
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068 A[EDGE_INSN: B:32:0x0068->B:28:0x0068 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(char r9, char r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = 0
            r4 = -1
            r5 = -1
        L_0x0006:
            boolean r6 = r8.j()
            if (r6 == 0) goto L_0x000d
            goto L_0x0068
        L_0x000d:
            char r6 = r8.c()
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            if (r0 == 0) goto L_0x001b
            r7 = 92
            if (r0 == r7) goto L_0x005b
        L_0x001b:
            r7 = 39
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0033
            r7 = 34
            java.lang.Character r7 = java.lang.Character.valueOf(r7)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x003b
        L_0x0033:
            char r7 = r6.charValue()
            if (r7 == r9) goto L_0x003b
            r2 = r2 ^ 1
        L_0x003b:
            if (r2 == 0) goto L_0x003e
            goto L_0x0066
        L_0x003e:
            java.lang.Character r7 = java.lang.Character.valueOf(r9)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x004f
            int r3 = r3 + 1
            if (r4 != r1) goto L_0x005b
            int r4 = r8.b
            goto L_0x005b
        L_0x004f:
            java.lang.Character r7 = java.lang.Character.valueOf(r10)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x005b
            int r3 = r3 + -1
        L_0x005b:
            if (r3 <= 0) goto L_0x0062
            if (r0 == 0) goto L_0x0062
            int r0 = r8.b
            r5 = r0
        L_0x0062:
            char r0 = r6.charValue()
        L_0x0066:
            if (r3 > 0) goto L_0x0006
        L_0x0068:
            if (r5 < 0) goto L_0x0071
            java.lang.String r9 = r8.a
            java.lang.String r9 = r9.substring(r4, r5)
            goto L_0x0073
        L_0x0071:
            java.lang.String r9 = ""
        L_0x0073:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf2.a(char, char):java.lang.String");
    }

    public String b(String str) {
        String g = g(str);
        k(str);
        return g;
    }

    public char c() {
        String str = this.a;
        int i = this.b;
        this.b = i + 1;
        return str.charAt(i);
    }

    public void d(String str) {
        if (l(str)) {
            int length = str.length();
            if (length <= r()) {
                this.b += length;
                return;
            }
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        throw new IllegalStateException("Queue did not match expected sequence");
    }

    public String e() {
        int i = this.b;
        while (!j() && (p() || m('-', '_'))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String f() {
        int i = this.b;
        while (!j() && (p() || n("*|", "|", "_", "-"))) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public String g(String str) {
        int indexOf = this.a.indexOf(str, this.b);
        if (indexOf == -1) {
            return q();
        }
        String substring = this.a.substring(this.b, indexOf);
        this.b += substring.length();
        return substring;
    }

    public String h(String... strArr) {
        int i = this.b;
        while (!j() && !n(strArr)) {
            this.b++;
        }
        return this.a.substring(i, this.b);
    }

    public boolean i() {
        boolean z = false;
        while (o()) {
            this.b++;
            z = true;
        }
        return z;
    }

    public boolean j() {
        return r() == 0;
    }

    public boolean k(String str) {
        if (!l(str)) {
            return false;
        }
        this.b += str.length();
        return true;
    }

    public boolean l(String str) {
        return this.a.regionMatches(true, this.b, str, 0, str.length());
    }

    public boolean m(char... cArr) {
        if (j()) {
            return false;
        }
        for (char c : cArr) {
            if (this.a.charAt(this.b) == c) {
                return true;
            }
        }
        return false;
    }

    public boolean n(String... strArr) {
        for (String l : strArr) {
            if (l(l)) {
                return true;
            }
        }
        return false;
    }

    public boolean o() {
        return !j() && if2.f(this.a.charAt(this.b));
    }

    public boolean p() {
        return !j() && Character.isLetterOrDigit(this.a.charAt(this.b));
    }

    public String q() {
        String str = this.a;
        String substring = str.substring(this.b, str.length());
        this.b = this.a.length();
        return substring;
    }

    public String toString() {
        return this.a.substring(this.b);
    }
}
