package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public final class a {
    @SerializedName("MALId")
    private final int a;
    @SerializedName("Genres")
    private final String b;

    public final List<Integer> a() {
        try {
            List<String> U = g92.U(this.b, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(g32.l(U, 10));
            for (String g : U) {
                Integer g2 = e92.g(g);
                arrayList.add(Integer.valueOf(g2 != null ? g2.intValue() : 0));
            }
            return arrayList;
        } catch (Exception unused) {
            return f32.f();
        }
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && v62.a(this.b, aVar.b);
    }

    public int hashCode() {
        int i = this.a * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AnimeConcatGenres(malid=" + this.a + ", genres=" + this.b + ")";
    }
}
