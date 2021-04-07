package defpackage;

/* renamed from: ut  reason: default package */
public final class ut {
    public static final ut c = new ut(0, 0);
    public final long a;
    public final long b;

    public ut(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ut.class != obj.getClass()) {
            return false;
        }
        ut utVar = (ut) obj;
        return this.a == utVar.a && this.b == utVar.b;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public String toString() {
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
