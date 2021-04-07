package com.google.android.exoplayer2;

import android.os.SystemClock;
import java.io.IOException;

public final class b0 extends Exception {
    public final int e;
    public final int f;
    public final f0 g;
    public final int h;

    private b0(int i, Throwable th) {
        this(i, th, -1, (f0) null, 4);
    }

    private b0(int i, Throwable th, int i2, f0 f0Var, int i3) {
        super(th);
        this.e = i;
        this.f = i2;
        this.g = f0Var;
        this.h = i3;
        SystemClock.elapsedRealtime();
    }

    public static b0 a(OutOfMemoryError outOfMemoryError) {
        return new b0(4, outOfMemoryError);
    }

    public static b0 b(Exception exc, int i, f0 f0Var, int i2) {
        return new b0(1, exc, i, f0Var, f0Var == null ? 4 : i2);
    }

    public static b0 c(IOException iOException) {
        return new b0(0, iOException);
    }

    public static b0 d(RuntimeException runtimeException) {
        return new b0(2, runtimeException);
    }
}
