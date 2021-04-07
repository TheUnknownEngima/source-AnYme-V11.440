package com.zunjae.extensions;

public final class a {
    private final int a;
    private final int b;
    private final int c;

    public a(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String d() {
        String O = g92.O(String.valueOf(this.a), 2, '0');
        String O2 = g92.O(String.valueOf(this.b), 2, '0');
        String O3 = g92.O(String.valueOf(this.c), 2, '0');
        return O + ':' + O2 + ':' + O3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return "HoursMinutesSeconds(hours=" + this.a + ", minutes=" + this.b + ", seconds=" + this.c + ")";
    }
}
