package defpackage;

/* renamed from: lc2  reason: default package */
public final class lc2 {
    public static final qd2 d = qd2.m(":");
    public static final qd2 e = qd2.m(":status");
    public static final qd2 f = qd2.m(":method");
    public static final qd2 g = qd2.m(":path");
    public static final qd2 h = qd2.m(":scheme");
    public static final qd2 i = qd2.m(":authority");
    public final qd2 a;
    public final qd2 b;
    final int c;

    /* renamed from: lc2$a */
    interface a {
        void a(sa2 sa2);
    }

    public lc2(String str, String str2) {
        this(qd2.m(str), qd2.m(str2));
    }

    public lc2(qd2 qd2, String str) {
        this(qd2, qd2.m(str));
    }

    public lc2(qd2 qd2, qd2 qd22) {
        this.a = qd2;
        this.b = qd22;
        this.c = qd2.A() + 32 + qd22.A();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lc2)) {
            return false;
        }
        lc2 lc2 = (lc2) obj;
        return this.a.equals(lc2.a) && this.b.equals(lc2.b);
    }

    public int hashCode() {
        return ((527 + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return ib2.r("%s: %s", this.a.G(), this.b.G());
    }
}
