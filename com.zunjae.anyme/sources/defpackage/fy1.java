package defpackage;

/* renamed from: fy1  reason: default package */
public final class fy1 {
    private final int a;
    private final int b;
    private final int c;

    public fy1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy1)) {
            return false;
        }
        fy1 fy1 = (fy1) obj;
        return this.a == fy1.a && this.b == fy1.b && this.c == fy1.c;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return "UserLevel(level=" + this.a + ", xpRequired=" + this.b + ", maximumXPPerLevel=" + this.c + ")";
    }
}
