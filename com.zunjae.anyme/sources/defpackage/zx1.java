package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: zx1  reason: default package */
public final class zx1 {
    @SerializedName("Shows")
    private final List<Integer> a;

    public zx1(List<Integer> list) {
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof zx1) && v62.a(this.a, ((zx1) obj).a);
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
        return "BaseUserStatsPostData(idsShows=" + this.a + ")";
    }
}
