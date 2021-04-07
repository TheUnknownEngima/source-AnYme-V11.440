package com.zunjae.anyme.features.bookmarks;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class j {
    @SerializedName("ShowsToAdd")
    private List<Integer> a;
    @SerializedName("ShowsToDelete")
    private List<Integer> b;

    public j(List<Integer> list, List<Integer> list2) {
        v62.e(list, "showsToAdd");
        v62.e(list2, "ShowsToDelete");
        this.a = list;
        this.b = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return v62.a(this.a, jVar.a) && v62.a(this.b, jVar.b);
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
        return "UpdateBookmarkEntry(showsToAdd=" + this.a + ", ShowsToDelete=" + this.b + ")";
    }
}
