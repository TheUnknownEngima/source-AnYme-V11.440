package defpackage;

/* renamed from: vv1  reason: default package */
public final class vv1 {
    private final int a;
    private final int b;

    public vv1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        int i = this.b;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 4) {
            return i != 6 ? 0 : 2;
        }
        return 5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv1)) {
            return false;
        }
        vv1 vv1 = (vv1) obj;
        return this.a == vv1.a && this.b == vv1.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "MyShowCount(count=" + this.a + ", myStatus=" + this.b + ")";
    }
}
