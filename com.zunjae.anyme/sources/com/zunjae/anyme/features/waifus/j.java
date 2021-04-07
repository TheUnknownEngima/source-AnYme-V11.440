package com.zunjae.anyme.features.waifus;

import android.annotation.SuppressLint;
import com.google.gson.annotations.SerializedName;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class j {
    @SerializedName("WaifuId")
    private int a;
    @SerializedName("AnimeId")
    private int b;
    @SerializedName("WaifuName")
    private String c;
    @SerializedName("ImageURL")
    private String d;
    @SerializedName("DateCreated")
    private long e = (System.currentTimeMillis() / 1000);
    @SerializedName("TotalFavoriteCount")
    private int f;

    public j(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    private static Comparator<j> a() {
        return f.e;
    }

    private static Comparator<j> b() {
        return e.e;
    }

    private static Comparator<j> c() {
        return g.e;
    }

    static /* synthetic */ int k(j jVar, j jVar2) {
        return (int) (jVar2.e() - jVar.e());
    }

    static /* synthetic */ int m(j jVar, j jVar2) {
        return jVar2.d() - jVar.d();
    }

    public static void o(List<j> list, int i) {
        Collections.sort(list, i != 0 ? (i == 1 || i != 2) ? b() : c() : a());
    }

    public int d() {
        return this.b;
    }

    public long e() {
        return this.e;
    }

    public String f() {
        String str = this.d;
        if (str != null && !str.isEmpty()) {
            return this.d;
        }
        return null;
    }

    @SuppressLint({"DefaultLocale"})
    public String g() {
        return String.format("https://myanimelist.net/character/%d", new Object[]{Integer.valueOf(i())});
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.a;
    }

    public String j() {
        return this.c;
    }

    public void n(long j) {
        this.e = j;
    }
}
