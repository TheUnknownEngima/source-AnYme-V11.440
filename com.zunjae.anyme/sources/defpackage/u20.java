package defpackage;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: u20  reason: default package */
public final class u20 extends w20 {
    private final i50 g = new i50();
    private final h50 h = new h50();
    private final int i;
    private final a[] j;
    private a k;
    private List<h20> l;
    private List<h20> m;
    private b n;
    private int o;

    /* renamed from: u20$a */
    private static final class a {
        private static final int[] A = {0, 0, 0, 0, 0, 0, 2};
        private static final int[] B = {3, 3, 3, 3, 3, 3, 1};
        private static final boolean[] C = {false, false, false, true, true, true, false};
        private static final int[] D;
        private static final int[] E = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] F = {0, 0, 0, 0, 0, 3, 3};
        private static final int[] G;
        public static final int w = h(2, 2, 2, 0);
        public static final int x = h(0, 0, 0, 0);
        public static final int y;
        private static final int[] z = {0, 0, 0, 0, 0, 2, 0};
        private final List<SpannableString> a = new ArrayList();
        private final SpannableStringBuilder b = new SpannableStringBuilder();
        private boolean c;
        private boolean d;
        private int e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private int v;

        static {
            int h2 = h(0, 0, 0, 3);
            y = h2;
            int i2 = x;
            D = new int[]{i2, h2, i2, i2, h2, i2, i2};
            G = new int[]{i2, i2, i2, i2, i2, h2, h2};
        }

        public a() {
            l();
        }

        public static int g(int i2, int i3, int i4) {
            return h(i2, i3, i4, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                defpackage.q40.c(r4, r0, r1)
                defpackage.q40.c(r5, r0, r1)
                defpackage.q40.c(r6, r0, r1)
                defpackage.q40.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.u20.a.h(int, int, int, int):int");
        }

        public void a(char c2) {
            if (c2 == 10) {
                this.a.add(d());
                this.b.clear();
                if (this.p != -1) {
                    this.p = 0;
                }
                if (this.q != -1) {
                    this.q = 0;
                }
                if (this.r != -1) {
                    this.r = 0;
                }
                if (this.t != -1) {
                    this.t = 0;
                }
                while (true) {
                    if ((this.k && this.a.size() >= this.j) || this.a.size() >= 15) {
                        this.a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.b.append(c2);
            }
        }

        public void b() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public defpackage.t20 c() {
            /*
                r15 = this;
                boolean r0 = r15.j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.d()
                r2.append(r1)
                int r1 = r15.l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x0060
                if (r1 == r5) goto L_0x005d
                if (r1 == r3) goto L_0x005a
                if (r1 != r4) goto L_0x003f
                goto L_0x0060
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                int r1 = r15.l
                r2 = 43
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected justification value: "
                r3.append(r2)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r0.<init>(r1)
                throw r0
            L_0x005a:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0062
            L_0x005d:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0062
            L_0x0060:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0062:
                r6 = r1
                boolean r1 = r15.f
                if (r1 == 0) goto L_0x0072
                int r1 = r15.h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007f
            L_0x0072:
                int r1 = r15.h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007f:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.i
                int r8 = r1 % 3
                if (r8 != 0) goto L_0x0095
                r8 = 0
                goto L_0x009b
            L_0x0095:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x009a
                r8 = 1
                goto L_0x009b
            L_0x009a:
                r8 = 2
            L_0x009b:
                int r1 = r15.i
                int r9 = r1 / 3
                if (r9 != 0) goto L_0x00a3
                r9 = 0
                goto L_0x00a9
            L_0x00a3:
                int r1 = r1 / r4
                if (r1 != r5) goto L_0x00a8
                r9 = 1
                goto L_0x00a9
            L_0x00a8:
                r9 = 2
            L_0x00a9:
                int r1 = r15.o
                int r3 = x
                if (r1 == r3) goto L_0x00b0
                r0 = 1
            L_0x00b0:
                t20 r13 = new t20
                r5 = 0
                r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r12 = r15.o
                int r14 = r15.e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.u20.a.c():t20");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public void f(boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            boolean z6 = z3;
            int i10 = i8;
            int i11 = i9;
            this.c = true;
            this.d = z2;
            this.k = z6;
            this.e = i2;
            this.f = z5;
            this.g = i3;
            this.h = i4;
            this.i = i7;
            int i12 = i5 + 1;
            if (this.j != i12) {
                this.j = i12;
                while (true) {
                    if ((!z6 || this.a.size() < this.j) && this.a.size() < 15) {
                        break;
                    }
                    this.a.remove(0);
                }
            }
            if (!(i10 == 0 || this.m == i10)) {
                this.m = i10;
                int i13 = i10 - 1;
                q(D[i13], y, C[i13], 0, A[i13], B[i13], z[i13]);
            }
            if (i11 != 0 && this.n != i11) {
                this.n = i11;
                int i14 = i11 - 1;
                m(0, 1, 1, false, false, F[i14], E[i14]);
                n(w, G[i14], x);
            }
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            return !i() || (this.a.isEmpty() && this.b.length() == 0);
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i2 = x;
            this.o = i2;
            this.s = w;
            this.u = i2;
        }

        public void m(int i2, int i3, int i4, boolean z2, boolean z3, int i5, int i6) {
            if (this.p != -1) {
                if (!z2) {
                    this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.b.length();
            }
            if (this.q != -1) {
                if (!z3) {
                    this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
                    this.q = -1;
                }
            } else if (z3) {
                this.q = this.b.length();
            }
        }

        public void n(int i2, int i3, int i4) {
            if (!(this.r == -1 || this.s == i2)) {
                this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (i2 != w) {
                this.r = this.b.length();
                this.s = i2;
            }
            if (!(this.t == -1 || this.u == i3)) {
                this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (i3 != x) {
                this.t = this.b.length();
                this.u = i3;
            }
        }

        public void o(int i2, int i3) {
            if (this.v != i2) {
                a(10);
            }
            this.v = i2;
        }

        public void p(boolean z2) {
            this.d = z2;
        }

        public void q(int i2, int i3, boolean z2, int i4, int i5, int i6, int i7) {
            this.o = i2;
            this.l = i7;
        }
    }

    /* renamed from: u20$b */
    private static final class b {
        public final int a;
        public final int b;
        public final byte[] c;
        int d = 0;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[((i2 * 2) - 1)];
        }
    }

    public u20(int i2, List<byte[]> list) {
        this.i = i2 == -1 ? 1 : i2;
        this.j = new a[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.j[i3] = new a();
        }
        this.k = this.j[0];
        D();
    }

    private void A() {
        this.h.q(4);
        int h2 = this.h.h(4);
        this.h.q(2);
        this.k.o(h2, this.h.h(6));
    }

    private void B() {
        int h2 = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int h3 = this.h.h(2);
        int g2 = a.g(this.h.h(2), this.h.h(2), this.h.h(2));
        if (this.h.g()) {
            h3 |= 4;
        }
        boolean g3 = this.h.g();
        int h4 = this.h.h(2);
        int h5 = this.h.h(2);
        int h6 = this.h.h(2);
        this.h.q(8);
        this.k.q(h2, g2, g3, h3, h4, h5, h6);
    }

    private void C() {
        StringBuilder sb;
        String str;
        b bVar = this.n;
        int i2 = bVar.d;
        int i3 = bVar.b;
        if (i2 != (i3 * 2) - 1) {
            int i4 = bVar.a;
            StringBuilder sb2 = new StringBuilder(131);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((i3 * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(i2);
            sb2.append(" (sequence number ");
            sb2.append(i4);
            sb2.append("); ignoring packet");
            b50.h("Cea708Decoder", sb2.toString());
            return;
        }
        this.h.n(bVar.c, i2);
        int h2 = this.h.h(3);
        int h3 = this.h.h(5);
        if (h2 == 7) {
            this.h.q(2);
            h2 = this.h.h(6);
            if (h2 < 7) {
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Invalid extended service number: ");
                sb3.append(h2);
                b50.h("Cea708Decoder", sb3.toString());
            }
        }
        if (h3 == 0) {
            if (h2 != 0) {
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("serviceNumber is non-zero (");
                sb4.append(h2);
                sb4.append(") when blockSize is 0");
                b50.h("Cea708Decoder", sb4.toString());
            }
        } else if (h2 == this.i) {
            boolean z = false;
            while (this.h.b() > 0) {
                int h4 = this.h.h(8);
                if (h4 == 16) {
                    h4 = this.h.h(8);
                    if (h4 <= 31) {
                        r(h4);
                    } else if (h4 <= 127) {
                        w(h4);
                    } else if (h4 <= 159) {
                        s(h4);
                    } else if (h4 <= 255) {
                        x(h4);
                    } else {
                        sb = new StringBuilder(37);
                        str = "Invalid extended command: ";
                        sb.append(str);
                        sb.append(h4);
                        b50.h("Cea708Decoder", sb.toString());
                    }
                } else if (h4 <= 31) {
                    p(h4);
                } else if (h4 <= 127) {
                    u(h4);
                } else if (h4 <= 159) {
                    q(h4);
                } else if (h4 <= 255) {
                    v(h4);
                } else {
                    sb = new StringBuilder(33);
                    str = "Invalid base command: ";
                    sb.append(str);
                    sb.append(h4);
                    b50.h("Cea708Decoder", sb.toString());
                }
                z = true;
            }
            if (z) {
                this.l = o();
            }
        }
    }

    private void D() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.j[i2].l();
        }
    }

    private void n() {
        if (this.n != null) {
            C();
            this.n = null;
        }
    }

    private List<h20> o() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.j[i2].j() && this.j[i2].k()) {
                arrayList.add(this.j[i2].c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    private void p(int i2) {
        h50 h50;
        if (i2 == 0) {
            return;
        }
        if (i2 != 3) {
            int i3 = 8;
            if (i2 != 8) {
                switch (i2) {
                    case 12:
                        D();
                        return;
                    case 13:
                        this.k.a(10);
                        return;
                    case 14:
                        return;
                    default:
                        if (i2 >= 17 && i2 <= 23) {
                            StringBuilder sb = new StringBuilder(55);
                            sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                            sb.append(i2);
                            b50.h("Cea708Decoder", sb.toString());
                            h50 = this.h;
                        } else if (i2 < 24 || i2 > 31) {
                            StringBuilder sb2 = new StringBuilder(31);
                            sb2.append("Invalid C0 command: ");
                            sb2.append(i2);
                            b50.h("Cea708Decoder", sb2.toString());
                            return;
                        } else {
                            StringBuilder sb3 = new StringBuilder(54);
                            sb3.append("Currently unsupported COMMAND_P16 Command: ");
                            sb3.append(i2);
                            b50.h("Cea708Decoder", sb3.toString());
                            h50 = this.h;
                            i3 = 16;
                        }
                        h50.q(i3);
                        return;
                }
            } else {
                this.k.b();
            }
        } else {
            this.l = o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        r5 = r4.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        r5.q(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (r2 > 8) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (r4.h.g() == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008f, code lost:
        r4.j[8 - r2].l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        if (r2 > 8) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
        if (r4.h.g() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r4.j[8 - r2].p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        if (r2 > 8) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ed, code lost:
        if (r4.h.g() == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ef, code lost:
        r4.j[8 - r2].e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f8, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0107, code lost:
        r4.k = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x00fb;
                case 129: goto L_0x00fb;
                case 130: goto L_0x00fb;
                case 131: goto L_0x00fb;
                case 132: goto L_0x00fb;
                case 133: goto L_0x00fb;
                case 134: goto L_0x00fb;
                case 135: goto L_0x00fb;
                case 136: goto L_0x00e5;
                case 137: goto L_0x00ce;
                case 138: goto L_0x00b7;
                case 139: goto L_0x009b;
                case 140: goto L_0x0085;
                case 141: goto L_0x007e;
                case 142: goto L_0x0109;
                case 143: goto L_0x0079;
                case 144: goto L_0x0065;
                case 145: goto L_0x0053;
                case 146: goto L_0x0045;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0033;
                case 152: goto L_0x0022;
                case 153: goto L_0x0022;
                case 154: goto L_0x0022;
                case 155: goto L_0x0022;
                case 156: goto L_0x0022;
                case 157: goto L_0x0022;
                case 158: goto L_0x0022;
                case 159: goto L_0x0022;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = 31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Invalid C1 command: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r0 = "Cea708Decoder"
            defpackage.b50.h(r0, r5)
            goto L_0x0109
        L_0x0022:
            int r5 = r5 + -152
            r4.t(r5)
            int r0 = r4.o
            if (r0 == r5) goto L_0x0109
            r4.o = r5
            u20$a[] r0 = r4.j
            r5 = r0[r5]
            goto L_0x0107
        L_0x0033:
            u20$a r5 = r4.k
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0040
            h50 r5 = r4.h
            r0 = 32
            goto L_0x006f
        L_0x0040:
            r4.B()
            goto L_0x0109
        L_0x0045:
            u20$a r5 = r4.k
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x004e
            goto L_0x006d
        L_0x004e:
            r4.A()
            goto L_0x0109
        L_0x0053:
            u20$a r5 = r4.k
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0060
            h50 r5 = r4.h
            r0 = 24
            goto L_0x006f
        L_0x0060:
            r4.z()
            goto L_0x0109
        L_0x0065:
            u20$a r5 = r4.k
            boolean r5 = r5.i()
            if (r5 != 0) goto L_0x0074
        L_0x006d:
            h50 r5 = r4.h
        L_0x006f:
            r5.q(r0)
            goto L_0x0109
        L_0x0074:
            r4.y()
            goto L_0x0109
        L_0x0079:
            r4.D()
            goto L_0x0109
        L_0x007e:
            h50 r5 = r4.h
            r5.q(r1)
            goto L_0x0109
        L_0x0085:
            if (r2 > r1) goto L_0x0109
            h50 r5 = r4.h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0098
            u20$a[] r5 = r4.j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.l()
        L_0x0098:
            int r2 = r2 + 1
            goto L_0x0085
        L_0x009b:
            r5 = 1
        L_0x009c:
            if (r5 > r1) goto L_0x0109
            h50 r0 = r4.h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00b4
            u20$a[] r0 = r4.j
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.k()
            r3 = r3 ^ r2
            r0.p(r3)
        L_0x00b4:
            int r5 = r5 + 1
            goto L_0x009c
        L_0x00b7:
            if (r2 > r1) goto L_0x0109
            h50 r5 = r4.h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00cb
            u20$a[] r5 = r4.j
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.p(r0)
        L_0x00cb:
            int r2 = r2 + 1
            goto L_0x00b7
        L_0x00ce:
            r5 = 1
        L_0x00cf:
            if (r5 > r1) goto L_0x0109
            h50 r0 = r4.h
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x00e2
            u20$a[] r0 = r4.j
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.p(r2)
        L_0x00e2:
            int r5 = r5 + 1
            goto L_0x00cf
        L_0x00e5:
            if (r2 > r1) goto L_0x0109
            h50 r5 = r4.h
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x00f8
            u20$a[] r5 = r4.j
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.e()
        L_0x00f8:
            int r2 = r2 + 1
            goto L_0x00e5
        L_0x00fb:
            int r5 = r5 + -128
            int r0 = r4.o
            if (r0 == r5) goto L_0x0109
            r4.o = r5
            u20$a[] r0 = r4.j
            r5 = r0[r5]
        L_0x0107:
            r4.k = r5
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u20.q(int):void");
    }

    private void r(int i2) {
        h50 h50;
        int i3;
        if (i2 > 7) {
            if (i2 <= 15) {
                h50 = this.h;
                i3 = 8;
            } else if (i2 <= 23) {
                h50 = this.h;
                i3 = 16;
            } else if (i2 <= 31) {
                h50 = this.h;
                i3 = 24;
            } else {
                return;
            }
            h50.q(i3);
        }
    }

    private void s(int i2) {
        h50 h50;
        int i3;
        if (i2 <= 135) {
            h50 = this.h;
            i3 = 32;
        } else if (i2 <= 143) {
            h50 = this.h;
            i3 = 40;
        } else if (i2 <= 159) {
            this.h.q(2);
            this.h.q(this.h.h(6) * 8);
            return;
        } else {
            return;
        }
        h50.q(i3);
    }

    private void t(int i2) {
        a aVar = this.j[i2];
        this.h.q(2);
        boolean g2 = this.h.g();
        boolean g3 = this.h.g();
        boolean g4 = this.h.g();
        int h2 = this.h.h(3);
        boolean g5 = this.h.g();
        int h3 = this.h.h(7);
        int h4 = this.h.h(8);
        int h5 = this.h.h(4);
        int h6 = this.h.h(4);
        this.h.q(2);
        int h7 = this.h.h(6);
        this.h.q(2);
        aVar.f(g2, g3, g4, h2, g5, h3, h4, h6, h7, h5, this.h.h(3), this.h.h(3));
    }

    private void u(int i2) {
        if (i2 == 127) {
            this.k.a(9835);
        } else {
            this.k.a((char) (i2 & 255));
        }
    }

    private void v(int i2) {
        this.k.a((char) (i2 & 255));
    }

    private void w(int i2) {
        a aVar;
        char c = ' ';
        if (i2 == 32) {
            aVar = this.k;
        } else if (i2 == 33) {
            aVar = this.k;
            c = 160;
        } else if (i2 == 37) {
            aVar = this.k;
            c = 8230;
        } else if (i2 == 42) {
            aVar = this.k;
            c = 352;
        } else if (i2 == 44) {
            aVar = this.k;
            c = 338;
        } else if (i2 == 63) {
            aVar = this.k;
            c = 376;
        } else if (i2 == 57) {
            aVar = this.k;
            c = 8482;
        } else if (i2 == 58) {
            aVar = this.k;
            c = 353;
        } else if (i2 == 60) {
            aVar = this.k;
            c = 339;
        } else if (i2 != 61) {
            switch (i2) {
                case 48:
                    aVar = this.k;
                    c = 9608;
                    break;
                case 49:
                    aVar = this.k;
                    c = 8216;
                    break;
                case 50:
                    aVar = this.k;
                    c = 8217;
                    break;
                case 51:
                    aVar = this.k;
                    c = 8220;
                    break;
                case 52:
                    aVar = this.k;
                    c = 8221;
                    break;
                case 53:
                    aVar = this.k;
                    c = 8226;
                    break;
                default:
                    switch (i2) {
                        case 118:
                            aVar = this.k;
                            c = 8539;
                            break;
                        case 119:
                            aVar = this.k;
                            c = 8540;
                            break;
                        case 120:
                            aVar = this.k;
                            c = 8541;
                            break;
                        case 121:
                            aVar = this.k;
                            c = 8542;
                            break;
                        case 122:
                            aVar = this.k;
                            c = 9474;
                            break;
                        case 123:
                            aVar = this.k;
                            c = 9488;
                            break;
                        case 124:
                            aVar = this.k;
                            c = 9492;
                            break;
                        case 125:
                            aVar = this.k;
                            c = 9472;
                            break;
                        case 126:
                            aVar = this.k;
                            c = 9496;
                            break;
                        case 127:
                            aVar = this.k;
                            c = 9484;
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(33);
                            sb.append("Invalid G2 character: ");
                            sb.append(i2);
                            b50.h("Cea708Decoder", sb.toString());
                            return;
                    }
            }
        } else {
            aVar = this.k;
            c = 8480;
        }
        aVar.a(c);
    }

    private void x(int i2) {
        a aVar;
        char c;
        if (i2 == 160) {
            aVar = this.k;
            c = 13252;
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid G3 character: ");
            sb.append(i2);
            b50.h("Cea708Decoder", sb.toString());
            aVar = this.k;
            c = '_';
        }
        aVar.a(c);
    }

    private void y() {
        this.k.m(this.h.h(4), this.h.h(2), this.h.h(2), this.h.g(), this.h.g(), this.h.h(3), this.h.h(3));
    }

    private void z() {
        int h2 = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int h3 = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        this.h.q(2);
        this.k.n(h2, h3, a.g(this.h.h(2), this.h.h(2), this.h.h(2)));
    }

    /* access modifiers changed from: protected */
    public k20 f() {
        List<h20> list = this.l;
        this.m = list;
        return new x20(list);
    }

    public void flush() {
        super.flush();
        this.l = null;
        this.m = null;
        this.o = 0;
        this.k = this.j[0];
        D();
        this.n = null;
    }

    /* access modifiers changed from: protected */
    public void g(o20 o20) {
        this.g.K(o20.f.array(), o20.f.limit());
        while (this.g.a() >= 3) {
            int z = this.g.z() & 7;
            int i2 = z & 3;
            boolean z2 = false;
            boolean z3 = (z & 4) == 4;
            byte z4 = (byte) this.g.z();
            byte z5 = (byte) this.g.z();
            if ((i2 == 2 || i2 == 3) && z3) {
                if (i2 == 3) {
                    n();
                    int i3 = (z4 & 192) >> 6;
                    byte b2 = z4 & 63;
                    if (b2 == 0) {
                        b2 = 64;
                    }
                    b bVar = new b(i3, b2);
                    this.n = bVar;
                    byte[] bArr = bVar.c;
                    int i4 = bVar.d;
                    bVar.d = i4 + 1;
                    bArr[i4] = z5;
                } else {
                    if (i2 == 2) {
                        z2 = true;
                    }
                    q40.a(z2);
                    b bVar2 = this.n;
                    if (bVar2 == null) {
                        b50.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = bVar2.c;
                        int i5 = bVar2.d;
                        int i6 = i5 + 1;
                        bVar2.d = i6;
                        bArr2[i5] = z4;
                        bVar2.d = i6 + 1;
                        bArr2[i6] = z5;
                    }
                }
                b bVar3 = this.n;
                if (bVar3.d == (bVar3.b * 2) - 1) {
                    n();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        return this.l != this.m;
    }
}
