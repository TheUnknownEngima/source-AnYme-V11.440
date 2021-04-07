package defpackage;

/* renamed from: pz1  reason: default package */
public final class pz1 {
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;

    public pz1(Integer num, String str, String str2, String str3) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz1)) {
            return false;
        }
        pz1 pz1 = (pz1) obj;
        return v62.a(this.a, pz1.a) && v62.a(this.b, pz1.b) && v62.a(this.c, pz1.c) && v62.a(this.d, pz1.d);
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        if (this.d != null) {
            StringBuilder sb = new StringBuilder();
            String str = this.b;
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(" (");
            sb.append(this.d);
            sb.append(')');
            return sb.toString();
        }
        String str2 = this.b;
        return str2 != null ? str2 : "-";
    }
}
