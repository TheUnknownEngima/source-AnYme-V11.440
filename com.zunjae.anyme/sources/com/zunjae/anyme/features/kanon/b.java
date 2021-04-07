package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;

public final class b {
    @SerializedName("Id")
    private final int a;
    @SerializedName("Title")
    private final String b;
    @SerializedName("Amount")
    private final int c;

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && v62.a(this.b, bVar.b) && this.c == bVar.c;
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.c;
    }

    public String toString() {
        return "AnimeKitsuCategory(id=" + this.a + ", title=" + this.b + ", amount=" + this.c + ")";
    }
}
