package com.zunjae.anyme.features.bookmarks;

import com.google.gson.annotations.SerializedName;

public final class b {
    @SerializedName("BookmarkId")
    private final String a;
    @SerializedName("Entries")
    private int b;
    @SerializedName("BookmarkName")
    private String c;

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final void d(String str) {
        v62.e(str, "<set-?>");
        this.c = str;
    }

    public final void e(int i) {
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return v62.a(this.a, bVar.a) && this.b == bVar.b && v62.a(this.c, bVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.c;
    }
}
