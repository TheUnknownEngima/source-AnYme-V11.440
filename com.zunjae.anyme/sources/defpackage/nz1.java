package defpackage;

import java.util.List;

/* renamed from: nz1  reason: default package */
public final class nz1 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final List<pz1> e;

    public nz1(String str, String str2, String str3, String str4, List<pz1> list) {
        v62.e(str2, "title");
        v62.e(str3, "episodeNumber");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz1(String str, String str2, String str3, String str4, List list, int i, r62 r62) {
        this((i & 1) != 0 ? null : str, str2, str3, str4, (i & 16) != 0 ? null : list);
    }

    public final int a() {
        try {
            return Integer.parseInt((String) n32.z(g92.U(this.c, new String[]{"."}, false, 0, 6, (Object) null)));
        } catch (Exception unused) {
            return 0;
        }
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final List<pz1> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz1)) {
            return false;
        }
        nz1 nz1 = (nz1) obj;
        return v62.a(this.a, nz1.a) && v62.a(this.b, nz1.b) && v62.a(this.c, nz1.c) && v62.a(this.d, nz1.d) && v62.a(this.e, nz1.e);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<pz1> list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "StreamingSiteEpisode(id=" + this.a + ", title=" + this.b + ", episodeNumber=" + this.c + ", description=" + this.d + ", providers=" + this.e + ")";
    }
}
