package com.zunjae.anyme.features.notes;

import com.google.gson.annotations.SerializedName;

public final class d {
    @SerializedName("AnimeId")
    private final int a;
    @SerializedName("EpisodeNumber")
    private final int b;
    @SerializedName("Note")
    private String c;
    @SerializedName("DateCreated")
    private long d;
    public String e;

    public d(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public long a() {
        return this.d;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        if (b() == 0) {
            return "Summary";
        }
        return "Episode " + b();
    }

    public String d() {
        return this.c;
    }

    public void e(long j) {
        this.d = j;
    }

    public void f(String str) {
        this.c = str;
    }
}
