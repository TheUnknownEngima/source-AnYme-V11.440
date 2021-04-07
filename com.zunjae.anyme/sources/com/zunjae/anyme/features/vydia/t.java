package com.zunjae.anyme.features.vydia;

import com.google.gson.annotations.SerializedName;

public final class t {
    @SerializedName("key")
    private final String a;
    @SerializedName("value")
    private final String b;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return v62.a(this.a, tVar.a) && v62.a(this.b, tVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RedirecterHeader(key=" + this.a + ", value=" + this.b + ")";
    }
}
