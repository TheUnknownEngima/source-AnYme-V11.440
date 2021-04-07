package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: bs1  reason: default package */
public final class bs1 {
    @SerializedName("malid")
    public Integer a;
    @SerializedName("timestamp")
    public long b;
    @SerializedName("series_cover")
    public String c;
    @SerializedName("tags")
    public String d;
    @SerializedName("title")
    public String e;
    @SerializedName("episode")
    public int f;
    public boolean g;
    public int h;

    public ky1 a() {
        return new ky1(this.a.intValue(), this.b, this.f);
    }

    public String b() {
        ex1 a2 = fx1.a.a(this.b);
        int i = a2.a;
        String format = i > 0 ? String.format("%dw", new Object[]{Integer.valueOf(i)}) : "";
        if (a2.b > 0) {
            format = format + String.format(" %dd", new Object[]{Integer.valueOf(a2.b % 7)});
        }
        if (a2.c > 0) {
            format = format + String.format(" %dh", new Object[]{Integer.valueOf(a2.c % 24)});
        }
        if (a2.d > 0) {
            format = format + String.format(" %dm", new Object[]{Integer.valueOf(a2.d % 60)});
        }
        return c() ? (a2.a > 0 || a2.b > 0 || a2.c > 0 || a2.d > 0) ? format.concat(" ago") : format : format;
    }

    public boolean c() {
        return this.b < System.currentTimeMillis() / 1000;
    }

    public String d() {
        ex1 a2 = fx1.a.a(this.b);
        int i = a2.b;
        if (i > 0) {
            return String.format(" %dd ago", new Object[]{Integer.valueOf(i % 7)});
        }
        int i2 = a2.c;
        if (i2 > 0) {
            return String.format(" %dh ago", new Object[]{Integer.valueOf(i2 % 24)});
        }
        int i3 = a2.d;
        if (i3 <= 0) {
            return null;
        }
        return String.format(" %dm ago", new Object[]{Integer.valueOf(i3 % 60)});
    }
}
