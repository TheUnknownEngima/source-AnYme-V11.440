package com.zunjae.dynsourcegen;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class a {
    @SerializedName("a")
    private final List<b> a;
    @SerializedName("nsfw")
    private final List<c> b;
    @SerializedName("b")
    private final List<String> c;

    public final List<b> a() {
        return this.a;
    }

    public final List<c> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c);
    }

    public int hashCode() {
        List<b> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<c> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.c;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "DynamicBrowsers(browsers=" + this.a + ", nsfwSites=" + this.b + ", videoLinksInstructions=" + this.c + ")";
    }
}
