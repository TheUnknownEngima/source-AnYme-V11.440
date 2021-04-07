package defpackage;

/* renamed from: m10  reason: default package */
public class m10 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public m10(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m10.class != obj.getClass()) {
            return false;
        }
        m10 m10 = (m10) obj;
        return v50.b(this.a, m10.a) && v50.b(this.b, m10.b) && v50.b(this.c, m10.c) && v50.b(this.d, m10.d) && v50.b(this.e, m10.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
