package defpackage;

/* renamed from: iy1  reason: default package */
public final class iy1 {
    private final String a;
    private final String b;
    private final String c;

    public iy1(String str, String str2, String str3) {
        v62.e(str, "csrfToken");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy1)) {
            return false;
        }
        iy1 iy1 = (iy1) obj;
        return v62.a(this.a, iy1.a) && v62.a(this.b, iy1.b) && v62.a(this.c, iy1.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "LoginToken(csrfToken=" + this.a + ", malSessionId=" + this.b + ", malHLogSession=" + this.c + ")";
    }
}
