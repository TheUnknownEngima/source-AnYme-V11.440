package com.zunjae.anyme.features.browsers.native_streaming;

public final class h {
    private final String a;
    private final int b;

    public h(String str, int i) {
        v62.e(str, "identifier");
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return v62.a(this.a, hVar.a) && this.b == hVar.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        return "SearchHistoryEpisodes(identifier=" + this.a + ", pageNumber=" + this.b + ")";
    }
}
