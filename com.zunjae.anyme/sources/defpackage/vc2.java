package defpackage;

import java.util.Arrays;

/* renamed from: vc2  reason: default package */
public final class vc2 {
    private int a;
    private final int[] b = new int[10];

    /* access modifiers changed from: package-private */
    public void a() {
        this.a = 0;
        Arrays.fill(this.b, 0);
    }

    /* access modifiers changed from: package-private */
    public int b(int i) {
        return this.b[i];
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    public int e(int i) {
        return (this.a & 16) != 0 ? this.b[4] : i;
    }

    /* access modifiers changed from: package-private */
    public int f(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    /* access modifiers changed from: package-private */
    public boolean g(int i) {
        return ((1 << i) & this.a) != 0;
    }

    /* access modifiers changed from: package-private */
    public void h(vc2 vc2) {
        for (int i = 0; i < 10; i++) {
            if (vc2.g(i)) {
                i(i, vc2.b(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public vc2 i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return Integer.bitCount(this.a);
    }
}
