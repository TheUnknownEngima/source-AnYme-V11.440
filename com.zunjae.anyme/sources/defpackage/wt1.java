package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: wt1  reason: default package */
public final class wt1 {
    @SerializedName("ids")
    private final List<Integer> a;

    public wt1() {
        this((List) null, 1, (r62) null);
    }

    public wt1(List<Integer> list) {
        this.a = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt1(List list, int i, r62 r62) {
        this((i & 1) != 0 ? null : list);
    }

    public final List<Integer> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof wt1) && v62.a(this.a, ((wt1) obj).a);
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
        return "NSFWIds(urls=" + this.a + ")";
    }
}
