package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: yx1  reason: default package */
public final class yx1 {
    @SerializedName("KanonStats")
    private final List<cy1> a;
    @SerializedName("TopGenres")
    private final List<dy1> b;
    @SerializedName("TopProducers")
    private final List<ey1> c;
    private gy1 d;

    public final List<cy1> a() {
        return this.a;
    }

    public final gy1 b() {
        return this.d;
    }

    public final List<dy1> c() {
        return this.b;
    }

    public final List<ey1> d() {
        return this.c;
    }

    public final void e(gy1 gy1) {
        this.d = gy1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yx1)) {
            return false;
        }
        yx1 yx1 = (yx1) obj;
        return v62.a(this.a, yx1.a) && v62.a(this.b, yx1.b) && v62.a(this.c, yx1.c) && v62.a(this.d, yx1.d);
    }

    public int hashCode() {
        List<cy1> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<dy1> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ey1> list3 = this.c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        gy1 gy1 = this.d;
        if (gy1 != null) {
            i = gy1.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "BaseUserStats(kanonUserStats=" + this.a + ", topGenres=" + this.b + ", topProducers=" + this.c + ", level=" + this.d + ")";
    }
}
