package defpackage;

/* renamed from: jn  reason: default package */
final class jn extends pn {
    private final long a;

    jn(long j) {
        this.a = j;
    }

    public long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof pn) && this.a == ((pn) obj).a();
    }

    public int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
