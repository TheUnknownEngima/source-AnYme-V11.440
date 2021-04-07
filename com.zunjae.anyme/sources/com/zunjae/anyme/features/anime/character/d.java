package com.zunjae.anyme.features.anime.character;

public final class d {
    private String a;
    private String b;
    private String c = "";
    private long d;
    private boolean e = false;
    public long f;

    public d(String str) {
        this.a = str;
    }

    public d(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public long a() {
        return this.d;
    }

    public String b() {
        try {
            String str = e().split("/images")[1].split("\\?s")[0];
            if (!str.contains("characters") || !str.contains(".jpg")) {
                return e();
            }
            return "https://cdn.myanimelist.net/images" + str;
        } catch (Exception unused) {
            return e();
        }
    }

    public int c() {
        try {
            return Integer.parseInt(d().split("/")[4]);
        } catch (Exception unused) {
            return -1;
        }
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.a;
    }

    public String g() {
        String[] split = f().split(", ");
        if (split.length != 2) {
            return f();
        }
        return String.format("%s %s", new Object[]{split[1], split[0]});
    }

    public boolean h() {
        return this.e;
    }

    public void i(boolean z) {
        this.e = z;
    }

    public void j(long j) {
        this.d = j;
    }

    public void k(String str) {
        this.b = str;
    }

    public void l(String str) {
        this.c = str;
    }
}
