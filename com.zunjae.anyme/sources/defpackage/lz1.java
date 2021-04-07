package defpackage;

import java.util.List;

/* renamed from: lz1  reason: default package */
public final class lz1 {
    private final String a;
    private final String b;
    private final Integer c;
    private final List<nz1> d;

    public lz1(String str, String str2, Integer num, List<nz1> list) {
        v62.e(str, "id");
        v62.e(str2, "title");
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz1(String str, String str2, Integer num, List list, int i, r62 r62) {
        this(str, str2, (i & 4) != 0 ? null : num, list);
    }

    public final List<nz1> a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz1)) {
            return false;
        }
        lz1 lz1 = (lz1) obj;
        return v62.a(this.a, lz1.a) && v62.a(this.b, lz1.b) && v62.a(this.c, lz1.c) && v62.a(this.d, lz1.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        List<nz1> list = this.d;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(" (");
        List<nz1> list = this.d;
        sb.append(list != null ? list.size() : 0);
        sb.append(" episodes)");
        return sb.toString();
    }
}
