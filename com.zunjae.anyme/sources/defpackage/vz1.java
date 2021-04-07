package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: vz1  reason: default package */
public final class vz1 {
    @SerializedName("file")
    private final String a;
    @SerializedName("id")
    private final String b;
    @SerializedName("lang")
    private final String c;
    @SerializedName("provider")
    private final String d;
    @SerializedName("resolution")
    private final String e;
    @SerializedName("type")
    private final String f;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz1)) {
            return false;
        }
        vz1 vz1 = (vz1) obj;
        return v62.a(this.a, vz1.a) && v62.a(this.b, vz1.b) && v62.a(this.c, vz1.c) && v62.a(this.d, vz1.d) && v62.a(this.e, vz1.e) && v62.a(this.f, vz1.f);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "AnimeFlixSelectableHost(file=" + this.a + ", id=" + this.b + ", lang=" + this.c + ", provider=" + this.d + ", resolution=" + this.e + ", type=" + this.f + ")";
    }
}
