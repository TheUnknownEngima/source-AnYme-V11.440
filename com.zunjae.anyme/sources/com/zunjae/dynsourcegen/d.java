package com.zunjae.dynsourcegen;

import com.google.gson.annotations.SerializedName;

public final class d {
    @SerializedName("delim")
    private final String a;
    @SerializedName("index")
    private final int b;
    @SerializedName("s_p")
    private final String c;

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return v62.a(this.a, dVar.a) && this.b == dVar.b && v62.a(this.c, dVar.c);
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
        return "SplitterInstruction(delim=" + this.a + ", index=" + this.b + ", specificPosition=" + this.c + ")";
    }
}
