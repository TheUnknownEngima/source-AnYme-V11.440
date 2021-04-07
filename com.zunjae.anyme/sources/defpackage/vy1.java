package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: vy1  reason: default package */
public final class vy1 {
    @SerializedName("MALId")
    private final int a;
    @SerializedName("Score")
    private final double b;
    @SerializedName("Type")
    private final String c;
    @SerializedName("ImageURL")
    private final String d;
    @SerializedName("Title")
    private final String e;
    @SerializedName("Episodes")
    private final int f;
    @SerializedName("AdditionalInformation")
    private final String g;
    private String h;
    private boolean i;

    public vy1(int i2, double d2, String str, String str2, String str3, int i3, String str4, String str5, boolean z) {
        v62.e(str3, "title");
        this.a = i2;
        this.b = d2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i3;
        this.g = str4;
        this.h = str5;
        this.i = z;
    }

    public final xy1 a() {
        return new xy1((long) this.a, this.e, d());
    }

    public final String b() {
        return this.g;
    }

    public final boolean c() {
        return this.i;
    }

    public final String d() {
        String str = this.d;
        return str != null ? str : "";
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy1)) {
            return false;
        }
        vy1 vy1 = (vy1) obj;
        return this.a == vy1.a && Double.compare(this.b, vy1.b) == 0 && v62.a(this.c, vy1.c) && v62.a(this.d, vy1.d) && v62.a(this.e, vy1.e) && this.f == vy1.f && v62.a(this.g, vy1.g) && v62.a(this.h, vy1.h) && this.i == vy1.i;
    }

    public final double f() {
        return this.b;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        int i2 = ((this.a * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        String str = this.c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.h;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        int i4 = (hashCode4 + i3) * 31;
        boolean z = this.i;
        if (z) {
            z = true;
        }
        return i4 + (z ? 1 : 0);
    }

    public final String i() {
        return this.c;
    }

    public final void j(String str) {
        this.h = str;
    }

    public String toString() {
        String str;
        StringBuilder sb;
        if (this.c != null) {
            sb = new StringBuilder();
            sb.append(this.c);
            sb.append(" (");
            sb.append(this.f);
            str = "Eps)";
        } else {
            sb = new StringBuilder();
            sb.append(this.f);
            str = "Eps";
        }
        sb.append(str);
        return sb.toString();
    }
}
