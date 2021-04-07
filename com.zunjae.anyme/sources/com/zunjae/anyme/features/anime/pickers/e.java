package com.zunjae.anyme.features.anime.pickers;

public final class e {
    private final String a;
    private final int b;

    public e(String str, int i) {
        v62.e(str, "name");
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return v62.a(this.a, eVar.a) && this.b == eVar.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        return "PickableStatus(name=" + this.a + ", code=" + this.b + ")";
    }
}
