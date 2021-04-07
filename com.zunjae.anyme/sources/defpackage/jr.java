package defpackage;

/* renamed from: jr  reason: default package */
public final class jr {
    public final int a;
    public final float b;

    public jr(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jr.class != obj.getClass()) {
            return false;
        }
        jr jrVar = (jr) obj;
        return this.a == jrVar.a && Float.compare(jrVar.b, this.b) == 0;
    }

    public int hashCode() {
        return ((527 + this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
