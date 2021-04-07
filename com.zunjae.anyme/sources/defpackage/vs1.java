package defpackage;

/* renamed from: vs1  reason: default package */
public final class vs1 {
    private int a;
    private String b;
    private final String c;
    private final String d;
    private final String e;

    public vs1(int i, String str, String str2, String str3, String str4) {
        v62.e(str, "title");
        v62.e(str2, "imageUrl");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs1)) {
            return false;
        }
        vs1 vs1 = (vs1) obj;
        return this.a == vs1.a && v62.a(this.b, vs1.b) && v62.a(this.c, vs1.c) && v62.a(this.d, vs1.d) && v62.a(this.e, vs1.e);
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "AnimeShowcaseEntry(id=" + this.a + ", title=" + this.b + ", imageUrl=" + this.c + ", bottomText=" + this.d + ", onscreenText=" + this.e + ")";
    }
}
