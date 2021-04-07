package defpackage;

/* renamed from: yb1  reason: default package */
final class yb1 extends lc1 {
    private final ge1 a;
    private final String b;

    yb1(ge1 ge1, String str) {
        if (ge1 != null) {
            this.a = ge1;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public ge1 b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lc1)) {
            return false;
        }
        lc1 lc1 = (lc1) obj;
        return this.a.equals(lc1.b()) && this.b.equals(lc1.c());
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + "}";
    }
}
