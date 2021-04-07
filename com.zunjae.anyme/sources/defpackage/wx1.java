package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wx1  reason: default package */
public final class wx1 {
    @SerializedName("GoodShows")
    private final List<Integer> a;
    @SerializedName("AllShows")
    private final List<Integer> b;
    @SerializedName("ExcludedGenres")
    private final ArrayList<Integer> c;

    public wx1(List<Integer> list, List<Integer> list2, ArrayList<Integer> arrayList) {
        v62.e(list, "goodShows");
        v62.e(list2, "allShows");
        v62.e(arrayList, "excludedGenres");
        this.a = list;
        this.b = list2;
        this.c = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx1)) {
            return false;
        }
        wx1 wx1 = (wx1) obj;
        return v62.a(this.a, wx1.a) && v62.a(this.b, wx1.b) && v62.a(this.c, wx1.c);
    }

    public int hashCode() {
        List<Integer> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        ArrayList<Integer> arrayList = this.c;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "UserRecommendationRequest(goodShows=" + this.a + ", allShows=" + this.b + ", excludedGenres=" + this.c + ")";
    }
}
