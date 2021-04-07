package com.google.android.exoplayer2;

public final class x0 {
    public static final x0 b = new x0(0);
    public final int a;

    public x0(int i) {
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x0.class == obj.getClass() && this.a == ((x0) obj).a;
    }

    public int hashCode() {
        return this.a;
    }
}
