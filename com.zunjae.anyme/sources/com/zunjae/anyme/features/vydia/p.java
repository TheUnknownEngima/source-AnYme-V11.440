package com.zunjae.anyme.features.vydia;

public final class p {
    private final long a;

    public p(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof p) && this.a == ((p) obj).a;
        }
        return true;
    }

    public int hashCode() {
        return c.a(this.a);
    }

    public String toString() {
        return "NavigationBus(toDuration=" + this.a + ")";
    }
}
