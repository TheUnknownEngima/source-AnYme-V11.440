package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: h3  reason: default package */
public final class h3 {
    static final k3 d = l3.c;
    private static final String e = Character.toString(8206);
    private static final String f = Character.toString(8207);
    static final h3 g = new h3(false, 2, d);
    static final h3 h = new h3(true, 2, d);
    private final boolean a;
    private final int b;
    private final k3 c;

    /* renamed from: h3$a */
    public static final class a {
        private boolean a;
        private int b;
        private k3 c;

        public a() {
            c(h3.e(Locale.getDefault()));
        }

        private static h3 b(boolean z) {
            return z ? h3.h : h3.g;
        }

        private void c(boolean z) {
            this.a = z;
            this.c = h3.d;
            this.b = 2;
        }

        public h3 a() {
            return (this.b == 2 && this.c == h3.d) ? b(this.a) : new h3(this.a, this.b, this.c);
        }
    }

    /* renamed from: h3$b */
    private static class b {
        private static final byte[] f = new byte[1792];
        private final CharSequence a;
        private final boolean b;
        private final int c;
        private int d;
        private char e;

        static {
            for (int i = 0; i < 1792; i++) {
                f[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
            this.c = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? f[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char charAt;
            int i = this.d;
            do {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                charAt = charSequence.charAt(i3);
                this.e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.d = i;
            this.e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i = this.d;
                if (i >= this.c) {
                    return 12;
                }
                CharSequence charSequence = this.a;
                this.d = i + 1;
                charAt = charSequence.charAt(i);
                this.e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c2 = this.e;
                    do {
                        int i4 = this.d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.a;
                        int i5 = i4 - 1;
                        this.d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.e = charAt;
                    } while (charAt != c2);
                }
            }
            this.d = i;
            this.e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 < this.c) {
                    CharSequence charSequence = this.a;
                    this.d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char c2 = this.e;
                        do {
                            int i3 = this.d;
                            if (i3 >= this.c) {
                                break;
                            }
                            CharSequence charSequence2 = this.a;
                            this.d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.e = charAt;
                        } while (charAt != c2);
                    }
                } else {
                    this.d = i;
                    this.e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.a.charAt(this.d - 1);
            this.e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.d--;
            byte c2 = c(this.e);
            if (!this.b) {
                return c2;
            }
            char c3 = this.e;
            return c3 == '>' ? h() : c3 == ';' ? f() : c2;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.a.charAt(this.d);
            this.e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.a, this.d);
                this.d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.d++;
            byte c2 = c(this.e);
            if (!this.b) {
                return c2;
            }
            char c3 = this.e;
            return c3 == '<' ? i() : c3 == '&' ? g() : c2;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.d < this.c && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e() {
            /*
                r7 = this;
                int r0 = r7.c
                r7.d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.h3.b.e():int");
        }
    }

    h3(boolean z, int i, k3 k3Var) {
        this.a = z;
        this.b = i;
        this.c = k3Var;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static h3 c() {
        return new a().a();
    }

    static boolean e(Locale locale) {
        return m3.b(locale) == 1;
    }

    private String f(CharSequence charSequence, k3 k3Var) {
        boolean a2 = k3Var.a(charSequence, 0, charSequence.length());
        return (this.a || (!a2 && b(charSequence) != 1)) ? this.a ? (!a2 || b(charSequence) == -1) ? f : "" : "" : e;
    }

    private String g(CharSequence charSequence, k3 k3Var) {
        boolean a2 = k3Var.a(charSequence, 0, charSequence.length());
        return (this.a || (!a2 && a(charSequence) != 1)) ? this.a ? (!a2 || a(charSequence) == -1) ? f : "" : "" : e;
    }

    public boolean d() {
        return (this.b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.c, true);
    }

    public CharSequence i(CharSequence charSequence, k3 k3Var, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = k3Var.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append(g(charSequence, a2 ? l3.b : l3.a));
        }
        if (a2 != this.a) {
            spannableStringBuilder.append(a2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(f(charSequence, a2 ? l3.b : l3.a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.c, true);
    }

    public String k(String str, k3 k3Var, boolean z) {
        if (str == null) {
            return null;
        }
        return i(str, k3Var, z).toString();
    }
}
