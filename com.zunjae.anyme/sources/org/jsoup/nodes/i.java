package org.jsoup.nodes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;

public class i {
    private static final HashMap<String, String> a = new HashMap<>();
    private static final char[] b = {',', ';'};

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.jsoup.nodes.i$b[] r0 = org.jsoup.nodes.i.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                org.jsoup.nodes.i$b r1 = org.jsoup.nodes.i.b.ascii     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jsoup.nodes.i$b r1 = org.jsoup.nodes.i.b.utf     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.i.a.<clinit>():void");
        }
    }

    private enum b {
        ascii,
        utf,
        fallback;

        /* access modifiers changed from: private */
        public static b byName(String str) {
            return str.equals("US-ASCII") ? ascii : str.startsWith("UTF-") ? utf : fallback;
        }
    }

    public enum c {
        xhtml("entities-xhtml.properties", 4),
        base("entities-base.properties", 106),
        extended("entities-full.properties", 2125);
        
        /* access modifiers changed from: private */
        public int[] codeKeys;
        /* access modifiers changed from: private */
        public int[] codeVals;
        /* access modifiers changed from: private */
        public String[] nameKeys;
        /* access modifiers changed from: private */
        public String[] nameVals;

        private c(String str, int i) {
            i.h(this, str, i);
        }

        private int size() {
            return this.nameKeys.length;
        }

        /* access modifiers changed from: package-private */
        public int codepointForName(String str) {
            int binarySearch = Arrays.binarySearch(this.nameKeys, str);
            if (binarySearch >= 0) {
                return this.codeVals[binarySearch];
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public String nameForCodepoint(int i) {
            int binarySearch = Arrays.binarySearch(this.codeKeys, i);
            if (binarySearch < 0) {
                return "";
            }
            String[] strArr = this.nameVals;
            if (binarySearch < strArr.length - 1) {
                int i2 = binarySearch + 1;
                if (this.codeKeys[i2] == i) {
                    return strArr[i2];
                }
            }
            return this.nameVals[binarySearch];
        }
    }

    private i() {
    }

    private static void b(Appendable appendable, c cVar, int i) {
        Appendable appendable2;
        String nameForCodepoint = cVar.nameForCodepoint(i);
        if (nameForCodepoint != "") {
            appendable2 = appendable.append('&');
        } else {
            appendable2 = appendable.append("&#x");
            nameForCodepoint = Integer.toHexString(i);
        }
        appendable2.append(nameForCodepoint).append(';');
    }

    private static boolean c(b bVar, char c2, CharsetEncoder charsetEncoder) {
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            return c2 < 128;
        }
        if (i != 2) {
            return charsetEncoder.canEncode(c2);
        }
        return true;
    }

    public static int d(String str, int[] iArr) {
        String str2 = a.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int codepointForName = c.extended.codepointForName(str);
        if (codepointForName == -1) {
            return 0;
        }
        iArr[0] = codepointForName;
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (c(r1, r8, r12) != false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0095, code lost:
        if (r12.canEncode(r8) != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(java.lang.Appendable r10, java.lang.String r11, org.jsoup.nodes.f.a r12, boolean r13, boolean r14, boolean r15) {
        /*
            org.jsoup.nodes.i$c r0 = r12.g()
            java.nio.charset.CharsetEncoder r12 = r12.f()
            java.nio.charset.Charset r1 = r12.charset()
            java.lang.String r1 = r1.name()
            org.jsoup.nodes.i$b r1 = org.jsoup.nodes.i.b.byName(r1)
            int r2 = r11.length()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x001c:
            if (r4 >= r2) goto L_0x009f
            int r7 = r11.codePointAt(r4)
            r8 = 1
            if (r14 == 0) goto L_0x003d
            boolean r9 = defpackage.if2.f(r7)
            if (r9 == 0) goto L_0x003b
            if (r15 == 0) goto L_0x002f
            if (r5 == 0) goto L_0x0098
        L_0x002f:
            if (r6 == 0) goto L_0x0033
            goto L_0x0098
        L_0x0033:
            r6 = 32
            r10.append(r6)
            r6 = 1
            goto L_0x0098
        L_0x003b:
            r5 = 1
            r6 = 0
        L_0x003d:
            r8 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r8) goto L_0x0088
            char r8 = (char) r7
            r9 = 34
            if (r8 == r9) goto L_0x007f
            r9 = 38
            if (r8 == r9) goto L_0x0079
            r9 = 60
            if (r8 == r9) goto L_0x0070
            r9 = 62
            if (r8 == r9) goto L_0x006b
            r9 = 160(0xa0, float:2.24E-43)
            if (r8 == r9) goto L_0x0061
            boolean r9 = c(r1, r8, r12)
            if (r9 == 0) goto L_0x005d
            goto L_0x0084
        L_0x005d:
            b(r10, r0, r7)
            goto L_0x0098
        L_0x0061:
            org.jsoup.nodes.i$c r8 = org.jsoup.nodes.i.c.xhtml
            if (r0 == r8) goto L_0x0068
            java.lang.String r8 = "&nbsp;"
            goto L_0x007b
        L_0x0068:
            java.lang.String r8 = "&#xa0;"
            goto L_0x007b
        L_0x006b:
            if (r13 != 0) goto L_0x0084
            java.lang.String r8 = "&gt;"
            goto L_0x007b
        L_0x0070:
            if (r13 == 0) goto L_0x0076
            org.jsoup.nodes.i$c r9 = org.jsoup.nodes.i.c.xhtml
            if (r0 != r9) goto L_0x0084
        L_0x0076:
            java.lang.String r8 = "&lt;"
            goto L_0x007b
        L_0x0079:
            java.lang.String r8 = "&amp;"
        L_0x007b:
            r10.append(r8)
            goto L_0x0098
        L_0x007f:
            if (r13 == 0) goto L_0x0084
            java.lang.String r8 = "&quot;"
            goto L_0x007b
        L_0x0084:
            r10.append(r8)
            goto L_0x0098
        L_0x0088:
            java.lang.String r8 = new java.lang.String
            char[] r9 = java.lang.Character.toChars(r7)
            r8.<init>(r9)
            boolean r9 = r12.canEncode(r8)
            if (r9 == 0) goto L_0x005d
            goto L_0x007b
        L_0x0098:
            int r7 = java.lang.Character.charCount(r7)
            int r4 = r4 + r7
            goto L_0x001c
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.i.e(java.lang.Appendable, java.lang.String, org.jsoup.nodes.f$a, boolean, boolean, boolean):void");
    }

    public static boolean f(String str) {
        return c.base.codepointForName(str) != -1;
    }

    public static boolean g(String str) {
        return c.extended.codepointForName(str) != -1;
    }

    /* access modifiers changed from: private */
    public static void h(c cVar, String str, int i) {
        int i2;
        Class<i> cls = i.class;
        String[] unused = cVar.nameKeys = new String[i];
        int[] unused2 = cVar.codeVals = new int[i];
        int[] unused3 = cVar.codeKeys = new int[i];
        String[] unused4 = cVar.nameVals = new String[i];
        InputStream resourceAsStream = cls.getResourceAsStream(str);
        if (resourceAsStream != null) {
            try {
                kf2 kf2 = new kf2(Charset.forName("ascii").decode(gf2.g(resourceAsStream, 0)).toString());
                int i3 = 0;
                while (!kf2.q()) {
                    String j = kf2.j('=');
                    kf2.a();
                    int parseInt = Integer.parseInt(kf2.l(b), 36);
                    char p = kf2.p();
                    kf2.a();
                    if (p == ',') {
                        i2 = Integer.parseInt(kf2.j(';'), 36);
                        kf2.a();
                    } else {
                        i2 = -1;
                    }
                    String j2 = kf2.j(10);
                    if (j2.charAt(j2.length() - 1) == 13) {
                        j2 = j2.substring(0, j2.length() - 1);
                    }
                    int parseInt2 = Integer.parseInt(j2, 36);
                    kf2.a();
                    cVar.nameKeys[i3] = j;
                    cVar.codeVals[i3] = parseInt;
                    cVar.codeKeys[parseInt2] = parseInt;
                    cVar.nameVals[parseInt2] = j;
                    if (i2 != -1) {
                        a.put(j, new String(new int[]{parseInt, i2}, 0, 2));
                    }
                    i3++;
                }
            } catch (IOException unused5) {
                throw new IllegalStateException("Error reading resource " + str);
            }
        } else {
            throw new IllegalStateException("Could not read resource " + str + ". Make sure you copy resources for " + cls.getCanonicalName());
        }
    }
}
