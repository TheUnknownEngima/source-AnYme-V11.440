package com.zunjae.anyme.features.bookmarks;

import com.google.gson.annotations.SerializedName;

public final class c {
    @SerializedName("Id")
    private final String a;
    @SerializedName("Name")
    private final String b;
    @SerializedName("ia")
    private final int c;
    private boolean d;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final int d() {
        return this.c;
    }

    public final void e(boolean z) {
        this.d = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return v62.a(this.a, cVar.a) && v62.a(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (((hashCode + i) * 31) + this.c) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        return this.b;
    }
}
