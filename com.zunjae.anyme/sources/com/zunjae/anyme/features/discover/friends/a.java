package com.zunjae.anyme.features.discover.friends;

public final class a {
    private final String a;
    private final String b;
    private final String c;

    public a(String str, String str2, String str3) {
        v62.e(str, "name");
        v62.e(str2, "image");
        v62.e(str3, "lastActive");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c);
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
        return "MALFriend(name=" + this.a + ", image=" + this.b + ", lastActive=" + this.c + ")";
    }
}
