package defpackage;

/* renamed from: ms1  reason: default package */
public final class ms1 {
    private final String a;
    private final String b;
    private final int c;

    public ms1(String str, String str2, int i) {
        v62.e(str, "name");
        v62.e(str2, "address");
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final String a() {
        return "http://" + this.b + ':' + this.c + '/';
    }

    public final int b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms1)) {
            return false;
        }
        ms1 ms1 = (ms1) obj;
        return v62.a(this.a, ms1.a) && v62.a(this.b, ms1.b) && this.c == ms1.c;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.c;
    }

    public String toString() {
        return "UPnPDevice(name=" + this.a + ", address=" + this.b + ", port=" + this.c + ")";
    }
}
