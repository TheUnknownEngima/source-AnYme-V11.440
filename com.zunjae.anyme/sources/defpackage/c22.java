package defpackage;

/* renamed from: c22  reason: default package */
public final class c22 implements Comparable<c22> {
    public static final c22 i = new c22(1, 4, 0);
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public c22(int i2, int i3, int i4) {
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.e = e(i2, i3, i4);
    }

    private final int e(int i2, int i3, int i4) {
        if (i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3 && i4 >= 0 && 255 >= i4) {
            return (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    /* renamed from: a */
    public int compareTo(c22 c22) {
        v62.e(c22, "other");
        return this.e - c22.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c22)) {
            obj = null;
        }
        c22 c22 = (c22) obj;
        return c22 != null && this.e == c22.e;
    }

    public int hashCode() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('.');
        sb.append(this.g);
        sb.append('.');
        sb.append(this.h);
        return sb.toString();
    }
}
