package defpackage;

/* renamed from: j10  reason: default package */
public final class j10 {
    public final String a;
    public final String b;
    public final String c;

    public j10(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j10.class != obj.getClass()) {
            return false;
        }
        j10 j10 = (j10) obj;
        return v50.b(this.a, j10.a) && v50.b(this.b, j10.b) && v50.b(this.c, j10.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
