package com.zunjae.anyme.features.niche.au;

import com.google.gson.annotations.SerializedName;
import com.zunjae.anyme.features.vydia.s;
import java.util.List;

public final class a {
    @SerializedName("version")
    private final Double a;
    @SerializedName("beta_version")
    private final String b;
    @SerializedName("actual_link")
    private final String c;
    @SerializedName("link")
    private final String d;
    @SerializedName("short_description")
    private final String e;
    @SerializedName("adblock_version")
    private final int f;
    @SerializedName("changelog_url")
    private final String g;
    @SerializedName("force_update")
    private final boolean h;
    @SerializedName("login_completed_endpoint")
    private final String i;
    @SerializedName("pagination_genre")
    private final int j;
    @SerializedName("default_source")
    private final int k = jz1.AnimeKisa.getId();
    @SerializedName("ks")
    private final String l;
    @SerializedName("manually_play")
    private final List<String> m = f32.f();
    @SerializedName("redirector")
    private final List<s> n = f32.f();
    @SerializedName("dyn_vid_helper")
    private final List<String> o = f32.f();
    @SerializedName("dyn_vid_helper_no_vid")
    private final List<String> p = f32.f();
    @SerializedName("dyn_vid_helper_navigate_back")
    private final List<String> q = f32.f();
    @SerializedName("login_instructions")
    private final py1 r;

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.f;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.g;
    }

    public final int e() {
        return this.k;
    }

    public final List<String> f() {
        return this.o;
    }

    public final List<String> g() {
        return this.q;
    }

    public final List<String> h() {
        return this.p;
    }

    public final String i() {
        return this.l;
    }

    public final String j() {
        return this.d;
    }

    public final py1 k() {
        return this.r;
    }

    public final String l() {
        return this.i;
    }

    public final List<String> m() {
        return this.m;
    }

    public final int n() {
        return this.j;
    }

    public final List<s> o() {
        return this.n;
    }

    public final String p() {
        return this.e;
    }

    public final Double q() {
        return this.a;
    }

    public final boolean r() {
        return this.h;
    }
}
