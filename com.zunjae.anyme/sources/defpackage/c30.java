package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: c30  reason: default package */
public final class c30 extends i20 {
    private final i50 n = new i50();
    private final i50 o = new i50();
    private final a p = new a();
    private Inflater q;

    /* renamed from: c30$a */
    private static final class a {
        private final i50 a = new i50();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        /* access modifiers changed from: private */
        public void e(i50 i50, int i2) {
            int C;
            if (i2 >= 4) {
                i50.N(3);
                int i3 = i2 - 4;
                if ((i50.z() & 128) != 0) {
                    if (i3 >= 7 && (C = i50.C()) >= 4) {
                        this.h = i50.F();
                        this.i = i50.F();
                        this.a.I(C - 4);
                        i3 -= 7;
                    } else {
                        return;
                    }
                }
                int c2 = this.a.c();
                int d2 = this.a.d();
                if (c2 < d2 && i3 > 0) {
                    int min = Math.min(i3, d2 - c2);
                    i50.h(this.a.a, c2, min);
                    this.a.M(c2 + min);
                }
            }
        }

        /* access modifiers changed from: private */
        public void f(i50 i50, int i2) {
            if (i2 >= 19) {
                this.d = i50.F();
                this.e = i50.F();
                i50.N(11);
                this.f = i50.F();
                this.g = i50.F();
            }
        }

        /* access modifiers changed from: private */
        public void g(i50 i50, int i2) {
            if (i2 % 5 == 2) {
                i50.N(2);
                Arrays.fill(this.b, 0);
                int i3 = i2 / 5;
                int i4 = 0;
                while (i4 < i3) {
                    int z = i50.z();
                    int z2 = i50.z();
                    int z3 = i50.z();
                    int z4 = i50.z();
                    int z5 = i50.z();
                    double d2 = (double) z2;
                    double d3 = (double) (z3 - 128);
                    int i5 = i4;
                    double d4 = (double) (z4 - 128);
                    int[] iArr = this.b;
                    int o = v50.o((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255) << 8;
                    iArr[z] = v50.o((int) (d2 + (d4 * 1.772d)), 0, 255) | o | (z5 << 24) | (v50.o((int) ((1.402d * d3) + d2), 0, 255) << 16);
                    i4 = i5 + 1;
                }
                this.c = true;
            }
        }

        public h20 d() {
            int z;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.d() == 0 || this.a.c() != this.a.d() || !this.c) {
                return null;
            }
            this.a.M(0);
            int i2 = this.h * this.i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int z2 = this.a.z();
                if (z2 != 0) {
                    z = i3 + 1;
                    iArr[i3] = this.b[z2];
                } else {
                    int z3 = this.a.z();
                    if (z3 != 0) {
                        z = ((z3 & 64) == 0 ? z3 & 63 : ((z3 & 63) << 8) | this.a.z()) + i3;
                        Arrays.fill(iArr, i3, z, (z3 & 128) == 0 ? 0 : this.b[this.a.z()]);
                    }
                }
                i3 = z;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888);
            int i4 = this.d;
            float f2 = ((float) this.f) / ((float) i4);
            int i5 = this.e;
            return new h20(createBitmap, f2, 0, ((float) this.g) / ((float) i5), 0, ((float) this.h) / ((float) i4), ((float) this.i) / ((float) i5));
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.I(0);
            this.c = false;
        }
    }

    public c30() {
        super("PgsDecoder");
    }

    private void C(i50 i50) {
        if (i50.a() > 0 && i50.f() == 120) {
            if (this.q == null) {
                this.q = new Inflater();
            }
            if (v50.d0(i50, this.o, this.q)) {
                i50 i502 = this.o;
                i50.K(i502.a, i502.d());
            }
        }
    }

    private static h20 D(i50 i50, a aVar) {
        int d = i50.d();
        int z = i50.z();
        int F = i50.F();
        int c = i50.c() + F;
        h20 h20 = null;
        if (c > d) {
            i50.M(d);
            return null;
        }
        if (z != 128) {
            switch (z) {
                case 20:
                    aVar.g(i50, F);
                    break;
                case 21:
                    aVar.e(i50, F);
                    break;
                case 22:
                    aVar.f(i50, F);
                    break;
            }
        } else {
            h20 = aVar.d();
            aVar.h();
        }
        i50.M(c);
        return h20;
    }

    /* access modifiers changed from: protected */
    public k20 z(byte[] bArr, int i, boolean z) {
        this.n.K(bArr, i);
        C(this.n);
        this.p.h();
        ArrayList arrayList = new ArrayList();
        while (this.n.a() >= 3) {
            h20 D = D(this.n, this.p);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new d30(Collections.unmodifiableList(arrayList));
    }
}
