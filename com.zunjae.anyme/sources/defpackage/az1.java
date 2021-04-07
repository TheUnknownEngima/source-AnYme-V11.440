package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: az1  reason: default package */
public class az1 {
    private int a;
    @SerializedName("Id")
    private Integer b;
    @SerializedName("Title")
    private String c;
    @SerializedName("Type")
    private String d;
    @SerializedName("Episodes")
    private Integer e;
    @SerializedName("Picture")
    private String f;
    private long g;

    public Integer a() {
        return this.e;
    }

    public long b() {
        return this.g;
    }

    public String c() {
        return "https://cdn.myanimelist.net/images/anime" + this.f;
    }

    public int d() {
        return this.a;
    }

    public String e() {
        return this.f;
    }

    public Integer f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public String h() {
        return this.d;
    }

    public void i(Integer num) {
        this.e = num;
    }

    public void j(long j) {
        this.g = j;
    }

    public void k(int i) {
        this.a = i;
    }

    public void l(String str) {
        this.f = str;
    }

    public void m(Integer num) {
        this.b = num;
    }

    public void n(String str) {
        this.c = str;
    }

    public void o(String str) {
        this.d = str;
    }

    public String toString() {
        return String.format("%s (%s)", new Object[]{g(), h()});
    }
}
