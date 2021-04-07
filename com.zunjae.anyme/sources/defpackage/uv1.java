package defpackage;

/* renamed from: uv1  reason: default package */
public final class uv1 {
    private final int a;
    private final int b;

    public uv1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv1)) {
            return false;
        }
        uv1 uv1 = (uv1) obj;
        return this.a == uv1.a && this.b == uv1.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "MyScoresWithCounter(count=" + this.a + ", myScore=" + this.b + ")";
    }
}
