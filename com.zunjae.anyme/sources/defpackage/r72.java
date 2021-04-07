package defpackage;

/* renamed from: r72  reason: default package */
public class r72 implements Iterable<Integer>, j72 {
    public static final a h = new a((r62) null);
    private final int e;
    private final int f;
    private final int g;

    /* renamed from: r72$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final r72 a(int i, int i2, int i3) {
            return new r72(i, i2, i3);
        }
    }

    public r72(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.e = i;
            this.f = g52.b(i, i2, i3);
            this.g = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final int a() {
        return this.e;
    }

    public final int c() {
        return this.f;
    }

    public final int d() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r72) {
            if (!isEmpty() || !((r72) obj).isEmpty()) {
                r72 r72 = (r72) obj;
                if (!(this.e == r72.e && this.f == r72.f && this.g == r72.g)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public s32 iterator() {
        return new s72(this.e, this.f, this.g);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.e * 31) + this.f) * 31) + this.g;
    }

    public boolean isEmpty() {
        if (this.g > 0) {
            if (this.e > this.f) {
                return true;
            }
        } else if (this.e < this.f) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.g > 0) {
            sb = new StringBuilder();
            sb.append(this.e);
            sb.append("..");
            sb.append(this.f);
            sb.append(" step ");
            i = this.g;
        } else {
            sb = new StringBuilder();
            sb.append(this.e);
            sb.append(" downTo ");
            sb.append(this.f);
            sb.append(" step ");
            i = -this.g;
        }
        sb.append(i);
        return sb.toString();
    }
}
