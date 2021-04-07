package defpackage;

import android.graphics.Insets;

/* renamed from: k2  reason: default package */
public final class k2 {
    public static final k2 e = new k2(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    private k2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static k2 a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new k2(i, i2, i3, i4);
    }

    public static k2 b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k2.class != obj.getClass()) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return this.d == k2Var.d && this.a == k2Var.a && this.c == k2Var.c && this.b == k2Var.b;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
