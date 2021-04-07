package com.google.android.exoplayer2;

import com.github.mikephil.charting.utils.Utils;

public final class o0 {
    public static final o0 e = new o0(1.0f);
    public final float a;
    public final float b;
    public final boolean c;
    private final int d;

    public o0(float f) {
        this(f, 1.0f, false);
    }

    public o0(float f, float f2, boolean z) {
        boolean z2 = true;
        q40.a(f > Utils.FLOAT_EPSILON);
        q40.a(f2 <= Utils.FLOAT_EPSILON ? false : z2);
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = Math.round(f * 1000.0f);
    }

    public long a(long j) {
        return j * ((long) this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.a == o0Var.a && this.b == o0Var.b && this.c == o0Var.c;
    }

    public int hashCode() {
        return ((((527 + Float.floatToRawIntBits(this.a)) * 31) + Float.floatToRawIntBits(this.b)) * 31) + (this.c ? 1 : 0);
    }
}
