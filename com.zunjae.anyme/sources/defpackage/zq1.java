package defpackage;

/* renamed from: zq1  reason: default package */
public final class zq1 {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;

    public zq1(String str, String str2, int i, String str3, String str4) {
        v62.e(str, "name");
        v62.e(str3, "Status");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq1)) {
            return false;
        }
        zq1 zq1 = (zq1) obj;
        return v62.a(this.a, zq1.a) && v62.a(this.b, zq1.b) && this.c == zq1.c && v62.a(this.d, zq1.d) && v62.a(this.e, zq1.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb;
        String str = this.d;
        int hashCode = str.hashCode();
        if (hashCode != -266931775) {
            if (hashCode == 601036331 && str.equals("Completed")) {
                sb = new StringBuilder();
                sb.append(this.d);
                sb.append(" (");
                sb.append(this.c);
                sb.append(')');
                return sb.toString();
            }
        } else if (str.equals("Plan to Watch")) {
            return this.d;
        }
        sb = new StringBuilder();
        sb.append(this.d);
        sb.append(" (");
        sb.append(this.c);
        sb.append(")\n");
        String str2 = this.e;
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }
}
