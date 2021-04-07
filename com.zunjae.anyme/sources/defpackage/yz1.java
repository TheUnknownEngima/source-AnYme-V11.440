package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: yz1  reason: default package */
public final class yz1 {
    @SerializedName("data")
    private final List<String> a;
    @SerializedName("suggestions")
    private final List<String> b;

    public yz1() {
        this((List) null, (List) null, 3, (r62) null);
    }

    public yz1(List<String> list, List<String> list2) {
        v62.e(list, "data");
        v62.e(list2, "suggestions");
        this.a = list;
        this.b = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yz1(List list, List list2, int i, r62 r62) {
        this((i & 1) != 0 ? f32.f() : list, (i & 2) != 0 ? f32.f() : list2);
    }

    public final List<String> a() {
        return this.a;
    }

    public final List<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz1)) {
            return false;
        }
        yz1 yz1 = (yz1) obj;
        return v62.a(this.a, yz1.a) && v62.a(this.b, yz1.b);
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
        return "AnimeOneSearchResult(data=" + this.a + ", suggestions=" + this.b + ")";
    }
}
