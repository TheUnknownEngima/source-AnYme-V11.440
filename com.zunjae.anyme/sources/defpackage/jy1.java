package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: jy1  reason: default package */
public final class jy1 {
    @SerializedName("anime_id")
    private int a;
    @SerializedName("status")
    private int b;
    @SerializedName("score")
    private int c;
    @SerializedName("num_watched_episodes")
    private int d;
    @SerializedName("csrf_token")
    private String e;

    public jy1(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
    }
}
