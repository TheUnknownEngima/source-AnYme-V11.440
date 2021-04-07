package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;
import com.zunjae.extensions.c;

public final class n {
    @SerializedName("Duration")
    private final long a;
    @SerializedName("Note")
    private final String b;
    @SerializedName("DateCreated")
    private final long c;

    public final long a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return c.e(this.a / ((long) 1000)).d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && v62.a(this.b, nVar.b) && this.c == nVar.c;
    }

    public int hashCode() {
        int a2 = c.a(this.a) * 31;
        String str = this.b;
        return ((a2 + (str != null ? str.hashCode() : 0)) * 31) + c.a(this.c);
    }

    public String toString() {
        return "VydiaSnapshot(duration=" + this.a + ", note=" + this.b + ", dateCreated=" + this.c + ")";
    }
}
