package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class m {
    @SerializedName("Shows")
    private final List<Integer> a;

    public m(List<Integer> list) {
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && v62.a(this.a, ((m) obj).a);
        }
        return true;
    }

    public int hashCode() {
        List<Integer> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "UserWatchedShows(idsShows=" + this.a + ")";
    }
}
