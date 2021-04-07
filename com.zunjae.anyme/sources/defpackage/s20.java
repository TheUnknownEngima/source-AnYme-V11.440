package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s20  reason: default package */
public final class s20 extends w20 {
    private static final int[] A = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] B = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] C = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] D = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private static final int[] w = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] x = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */
    public static final int[] y = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] z = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private final i50 g = new i50();
    private final int h;
    private final int i;
    private final int j;
    private final ArrayList<a> k = new ArrayList<>();
    private a l = new a(0, 4);
    private List<h20> m;
    private List<h20> n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private byte s;
    private byte t;
    private int u = 0;
    private boolean v;

    /* renamed from: s20$a */
    private static class a {
        private final List<C0140a> a = new ArrayList();
        private final List<SpannableString> b = new ArrayList();
        private final StringBuilder c = new StringBuilder();
        /* access modifiers changed from: private */
        public int d;
        /* access modifiers changed from: private */
        public int e;
        /* access modifiers changed from: private */
        public int f;
        private int g;
        private int h;

        /* renamed from: s20$a$a  reason: collision with other inner class name */
        private static class C0140a {
            public final int a;
            public final boolean b;
            public int c;

            public C0140a(int i, boolean z, int i2) {
                this.a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            j(i);
            m(i2);
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.a.size()) {
                C0140a aVar = this.a.get(i);
                boolean z2 = aVar.b;
                int i7 = aVar.a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = s20.y[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.c;
                i++;
                if (i8 != (i < this.a.size() ? this.a.get(i).c : length)) {
                    if (i2 != -1 && !z2) {
                        q(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        o(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        n(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                q(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                o(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                n(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void e(char c2) {
            this.c.append(c2);
        }

        public void f() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                int size = this.a.size() - 1;
                while (size >= 0) {
                    C0140a aVar = this.a.get(size);
                    int i = aVar.c;
                    if (i == length) {
                        aVar.c = i - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public h20 g(int i) {
            float f2;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                spannableStringBuilder.append(this.b.get(i4));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.e + this.f;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.g != 2 || (Math.abs(i6) >= 3 && length >= 0)) ? (this.g != 2 || i6 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i5 = 32 - length;
                }
                f2 = ((((float) i5) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            if (this.g == 1 || (i3 = this.d) > 7) {
                i3 = (this.d - 15) - 2;
                i2 = 2;
            } else {
                i2 = 0;
            }
            return new h20(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (float) i3, 1, i2, f2, i, -3.4028235E38f);
        }

        public boolean i() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void j(int i) {
            this.g = i;
            this.a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public void k() {
            this.b.add(h());
            this.c.setLength(0);
            this.a.clear();
            int min = Math.min(this.h, this.d);
            while (this.b.size() >= min) {
                this.b.remove(0);
            }
        }

        public void l(int i) {
            this.g = i;
        }

        public void m(int i) {
            this.h = i;
        }

        public void p(int i, boolean z) {
            this.a.add(new C0140a(i, z, this.c.length()));
        }
    }

    public s20(String str, int i2) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.j = 0;
                } else if (i2 != 4) {
                    b50.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                } else {
                    this.j = 1;
                }
                this.i = 1;
                L(0);
                K();
                this.v = true;
            }
            this.j = 1;
            this.i = 0;
            L(0);
            K();
            this.v = true;
        }
        this.j = 0;
        this.i = 0;
        L(0);
        K();
        this.v = true;
    }

    private static boolean A(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    private static boolean B(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean C(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    private static boolean D(byte b) {
        return (b & 240) == 16;
    }

    private boolean E(boolean z2, byte b, byte b2) {
        if (!z2 || !D(b)) {
            this.r = false;
        } else if (this.r && this.s == b && this.t == b2) {
            this.r = false;
            return true;
        } else {
            this.r = true;
            this.s = b;
            this.t = b2;
        }
        return false;
    }

    private static boolean F(byte b) {
        return (b & 247) == 20;
    }

    private static boolean G(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    private static boolean H(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private static boolean I(byte b) {
        return 1 <= b && b <= 15;
    }

    private void J(byte b, byte b2) {
        if (!I(b)) {
            if (F(b)) {
                if (!(b2 == 32 || b2 == 47)) {
                    switch (b2) {
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (b2) {
                                case 41:
                                    break;
                                case 42:
                                case 43:
                                    break;
                                default:
                                    return;
                            }
                    }
                }
                this.v = true;
                return;
            }
            return;
        }
        this.v = false;
    }

    private void K() {
        this.l.j(this.o);
        this.k.clear();
        this.k.add(this.l);
    }

    private void L(int i2) {
        int i3 = this.o;
        if (i3 != i2) {
            this.o = i2;
            if (i2 == 3) {
                for (int i4 = 0; i4 < this.k.size(); i4++) {
                    this.k.get(i4).l(i2);
                }
                return;
            }
            K();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.m = Collections.emptyList();
            }
        }
    }

    private void M(int i2) {
        this.p = i2;
        this.l.m(i2);
    }

    private boolean N(byte b) {
        if (y(b)) {
            this.u = p(b);
        }
        return this.u == this.j;
    }

    private static char o(byte b) {
        return (char) z[(b & Byte.MAX_VALUE) - 32];
    }

    private static int p(byte b) {
        return (b >> 3) & 1;
    }

    private List<h20> q() {
        int size = this.k.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            h20 g2 = this.k.get(i3).g(Integer.MIN_VALUE);
            arrayList.add(g2);
            if (g2 != null) {
                i2 = Math.min(i2, g2.l);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            h20 h20 = (h20) arrayList.get(i4);
            if (h20 != null) {
                if (h20.l != i2) {
                    h20 = this.k.get(i4).g(i2);
                }
                arrayList2.add(h20);
            }
        }
        return arrayList2;
    }

    private static char r(byte b) {
        return (char) B[b & 31];
    }

    private static char s(byte b) {
        return (char) C[b & 31];
    }

    private static char t(byte b, byte b2) {
        return (b & 1) == 0 ? r(b2) : s(b2);
    }

    private static char u(byte b) {
        return (char) A[b & 15];
    }

    private void v(byte b) {
        this.l.e(' ');
        this.l.p((b >> 1) & 7, (b & 1) == 1);
    }

    private void w(byte b) {
        if (b == 32) {
            L(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    L(1);
                    M(2);
                    return;
                case 38:
                    L(1);
                    M(3);
                    return;
                case 39:
                    L(1);
                    M(4);
                    return;
                default:
                    int i2 = this.o;
                    if (i2 != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.m = Collections.emptyList();
                                    int i3 = this.o;
                                    if (!(i3 == 1 || i3 == 3)) {
                                        return;
                                    }
                                case 45:
                                    if (i2 == 1 && !this.l.i()) {
                                        this.l.k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    break;
                                case 47:
                                    this.m = q();
                                    break;
                                default:
                                    return;
                            }
                            K();
                            return;
                        }
                        this.l.f();
                        return;
                    }
                    return;
            }
        } else {
            L(3);
        }
    }

    private void x(byte b, byte b2) {
        int i2 = w[b & 7];
        boolean z2 = false;
        if ((b2 & 32) != 0) {
            i2++;
        }
        if (i2 != this.l.d) {
            if (this.o != 1 && !this.l.i()) {
                a aVar = new a(this.o, this.p);
                this.l = aVar;
                this.k.add(aVar);
            }
            int unused = this.l.d = i2;
        }
        boolean z3 = (b2 & 16) == 16;
        if ((b2 & 1) == 1) {
            z2 = true;
        }
        int i3 = (b2 >> 1) & 7;
        this.l.p(z3 ? 8 : i3, z2);
        if (z3) {
            int unused2 = this.l.e = x[i3];
        }
    }

    private static boolean y(byte b) {
        return (b & 224) == 0;
    }

    private static boolean z(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    public void a() {
    }

    /* access modifiers changed from: protected */
    public k20 f() {
        List<h20> list = this.m;
        this.n = list;
        return new x20(list);
    }

    public void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        L(0);
        M(4);
        K();
        this.q = false;
        this.r = false;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0014 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(defpackage.o20 r10) {
        /*
            r9 = this;
            i50 r0 = r9.g
            java.nio.ByteBuffer r1 = r10.f
            byte[] r1 = r1.array()
            java.nio.ByteBuffer r10 = r10.f
            int r10 = r10.limit()
            r0.K(r1, r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L_0x0014:
            i50 r2 = r9.g
            int r2 = r2.a()
            int r3 = r9.h
            if (r2 < r3) goto L_0x00ec
            r2 = 2
            if (r3 != r2) goto L_0x0023
            r2 = -4
            goto L_0x002a
        L_0x0023:
            i50 r2 = r9.g
            int r2 = r2.z()
            byte r2 = (byte) r2
        L_0x002a:
            i50 r3 = r9.g
            int r3 = r3.z()
            i50 r4 = r9.g
            int r4 = r4.z()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003b
            goto L_0x0014
        L_0x003b:
            r5 = r2 & 1
            int r6 = r9.i
            if (r5 == r6) goto L_0x0042
            goto L_0x0014
        L_0x0042:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x004d
            if (r6 != 0) goto L_0x004d
            goto L_0x0014
        L_0x004d:
            boolean r7 = r9.q
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0060
            boolean[] r2 = D
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0060
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            r9.q = r2
            boolean r2 = r9.E(r2, r5, r6)
            if (r2 == 0) goto L_0x006a
            goto L_0x0014
        L_0x006a:
            boolean r2 = r9.q
            if (r2 != 0) goto L_0x0075
            if (r7 == 0) goto L_0x0014
            r9.K()
        L_0x0073:
            r1 = 1
            goto L_0x0014
        L_0x0075:
            r9.J(r5, r6)
            boolean r2 = r9.v
            if (r2 != 0) goto L_0x007d
            goto L_0x0014
        L_0x007d:
            boolean r2 = r9.N(r5)
            if (r2 != 0) goto L_0x0084
            goto L_0x0014
        L_0x0084:
            boolean r1 = y(r5)
            if (r1 == 0) goto L_0x00d5
            boolean r1 = G(r5, r6)
            if (r1 == 0) goto L_0x0097
            s20$a r1 = r9.l
            char r2 = u(r6)
            goto L_0x00e8
        L_0x0097:
            boolean r1 = z(r5, r6)
            if (r1 == 0) goto L_0x00a9
            s20$a r1 = r9.l
            r1.f()
            s20$a r1 = r9.l
            char r2 = t(r5, r6)
            goto L_0x00e8
        L_0x00a9:
            boolean r1 = A(r5, r6)
            if (r1 == 0) goto L_0x00b3
            r9.v(r6)
            goto L_0x0073
        L_0x00b3:
            boolean r1 = C(r5, r6)
            if (r1 == 0) goto L_0x00bd
            r9.x(r5, r6)
            goto L_0x0073
        L_0x00bd:
            boolean r1 = H(r5, r6)
            if (r1 == 0) goto L_0x00cb
            s20$a r1 = r9.l
            int r6 = r6 + -32
            int unused = r1.f = r6
            goto L_0x0073
        L_0x00cb:
            boolean r1 = B(r5, r6)
            if (r1 == 0) goto L_0x0073
            r9.w(r6)
            goto L_0x0073
        L_0x00d5:
            s20$a r1 = r9.l
            char r2 = o(r5)
            r1.e(r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0073
            s20$a r1 = r9.l
            char r2 = o(r6)
        L_0x00e8:
            r1.e(r2)
            goto L_0x0073
        L_0x00ec:
            if (r1 == 0) goto L_0x00fb
            int r10 = r9.o
            if (r10 == r0) goto L_0x00f5
            r0 = 3
            if (r10 != r0) goto L_0x00fb
        L_0x00f5:
            java.util.List r10 = r9.q()
            r9.m = r10
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s20.g(o20):void");
    }

    /* access modifiers changed from: protected */
    public boolean j() {
        return this.m != this.n;
    }
}
