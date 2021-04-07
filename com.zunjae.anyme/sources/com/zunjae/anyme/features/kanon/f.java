package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;

public final class f {
    @SerializedName("duration")
    private final long a;
    @SerializedName("note")
    private final String b;

    public f(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && v62.a(this.b, fVar.b);
    }

    public int hashCode() {
        int a2 = c.a(this.a) * 31;
        String str = this.b;
        return a2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NewSnapshot(duration=" + this.a + ", note=" + this.b + ")";
    }
}
