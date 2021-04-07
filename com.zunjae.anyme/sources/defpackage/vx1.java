package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: vx1  reason: default package */
public final class vx1 {
    @SerializedName("Title")
    private String a;
    @SerializedName("ImageURL")
    private String b;
    @SerializedName("MALId")
    private int c;
    @SerializedName("Score")
    private Float d;
    @SerializedName("Episodes")
    private int e;

    public final xy1 a() {
        String str = this.a;
        v62.c(str);
        String str2 = this.b;
        v62.c(str2);
        return new xy1((long) this.c, str, str2);
    }

    public final int b() {
        return this.e;
    }

    public final String c() {
        return this.b;
    }

    public final Float d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }
}
