package defpackage;

import com.google.gson.annotations.SerializedName;

/* renamed from: ey1  reason: default package */
public final class ey1 extends xq1 {
    @SerializedName("Name")
    private final String a;
    @SerializedName("ProducerId")
    private final int b;
    @SerializedName("NumberOfShowsByProducer")
    private final int c;

    public String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey1)) {
            return false;
        }
        ey1 ey1 = (ey1) obj;
        return v62.a(this.a, ey1.a) && this.b == ey1.b && this.c == ey1.c;
    }

    public int hashCode() {
        String str = this.a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return "TopProducer(producerName=" + this.a + ", producerId=" + this.b + ", numberOfShows=" + this.c + ")";
    }
}
