package com.zunjae.anyme.features.vydia;

public final class u {
    private final String a;
    private final String b;

    public u(String str, String str2) {
        v62.e(str, "title");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return v62.a(this.a, uVar.a) && v62.a(this.b, uVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TitleSubtitle(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
