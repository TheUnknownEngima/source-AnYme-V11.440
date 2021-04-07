package com.zunjae.anyme.features.anime.info_screen;

public final class b {
    private a a;
    private String b;
    public String c;
    public CharSequence d;
    private int e;
    private xy1 f;

    public enum a {
        YOUTUBE,
        ANIME,
        NOTHING,
        MANGA,
        BROADCAST,
        STUDIO,
        GENRE
    }

    public b() {
        this.a = a.NOTHING;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(String str, double d2) {
        this();
        v62.e(str, "title");
        this.c = str;
        this.d = String.valueOf(d2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(String str, int i) {
        this();
        v62.e(str, "title");
        this.c = str;
        this.d = String.valueOf(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(String str, CharSequence charSequence) {
        this();
        v62.e(str, "title");
        v62.e(charSequence, "content");
        this.c = str;
        this.d = charSequence;
    }

    public final CharSequence a() {
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            return charSequence;
        }
        v62.p("content");
        throw null;
    }

    public final xy1 b() {
        return this.f;
    }

    public final int c() {
        return this.e;
    }

    public final String d() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        v62.p("title");
        throw null;
    }

    public final a e() {
        return this.a;
    }

    public final String f() {
        return this.b;
    }

    public final void g(xy1 xy1) {
        this.f = xy1;
    }

    public final void h(int i) {
        this.e = i;
    }

    public final void i(a aVar) {
        v62.e(aVar, "<set-?>");
        this.a = aVar;
    }

    public final void j(String str) {
        this.b = str;
    }

    public final boolean k() {
        a aVar = this.a;
        return aVar == a.ANIME || aVar == a.MANGA || aVar == a.GENRE || aVar == a.STUDIO;
    }
}
