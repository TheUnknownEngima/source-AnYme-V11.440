package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class k {
    @SerializedName("GoodShows")
    private final List<Integer> a;
    @SerializedName("AllShows")
    private final List<Integer> b;

    public k(List<Integer> list, List<Integer> list2) {
        this.a = list;
        this.b = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return v62.a(this.a, kVar.a) && v62.a(this.b, kVar.b);
    }

    public int hashCode() {
        List<Integer> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "UserContinueWatching(goodShows=" + this.a + ", allShows=" + this.b + ")";
    }
}
