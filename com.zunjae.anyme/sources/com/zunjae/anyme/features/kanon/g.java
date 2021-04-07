package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;

public final class g {
    @SerializedName("HostId")
    private final int a;
    @SerializedName("Count")
    private final int b;

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "PopularHost(hostId=" + this.a + ", count=" + this.b + ")";
    }
}
