package defpackage;

/* renamed from: ay1  reason: default package */
public final class ay1 {
    private final by1 a;
    private final String b;

    public ay1(by1 by1, String str) {
        v62.e(by1, "type");
        v62.e(str, "subtitle");
        this.a = by1;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final by1 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay1)) {
            return false;
        }
        ay1 ay1 = (ay1) obj;
        return v62.a(this.a, ay1.a) && v62.a(this.b, ay1.b);
    }

    public int hashCode() {
        by1 by1 = this.a;
        int i = 0;
        int hashCode = (by1 != null ? by1.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "KanonUserStatKV(type=" + this.a + ", subtitle=" + this.b + ")";
    }
}
