package com.zunjae.anyme.features.bookmarks;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class h {
    @SerializedName("BookmarkIdsToAdd")
    private final List<String> a;
    @SerializedName("BookmarkIdsToDelete")
    private final List<String> b;

    public h(List<String> list, List<String> list2) {
        v62.e(list, "toAdd");
        v62.e(list2, "toDelete");
        this.a = list;
        this.b = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return v62.a(this.a, hVar.a) && v62.a(this.b, hVar.b);
    }

    public int hashCode() {
        List<String> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "BulkBookmarkUpdate(toAdd=" + this.a + ", toDelete=" + this.b + ")";
    }
}
