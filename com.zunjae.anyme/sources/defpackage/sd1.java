package defpackage;

import defpackage.ge1;

/* renamed from: sd1  reason: default package */
final class sd1 extends ge1.d.a.b {
    private final String a;

    public String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ge1.d.a.b) {
            return this.a.equals(((ge1.d.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.a + "}";
    }
}
