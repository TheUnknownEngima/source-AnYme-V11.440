package com.zunjae.anyme.features.vydia;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class s {
    @SerializedName("site")
    private final String a;
    @SerializedName("headers")
    private final List<t> b;

    public final List<t> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return v62.a(this.a, sVar.a) && v62.a(this.b, sVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<t> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Redirecter(site=" + this.a + ", headers=" + this.b + ")";
    }
}
