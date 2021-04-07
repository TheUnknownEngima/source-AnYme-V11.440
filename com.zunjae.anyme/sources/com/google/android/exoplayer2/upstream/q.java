package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.upstream.s;
import com.google.android.exoplayer2.upstream.u;
import java.io.FileNotFoundException;
import java.io.IOException;

public class q implements t {
    private final int a;

    public q() {
        this(-1);
    }

    public q(int i) {
        this.a = i;
    }

    public long a(int i, long j, IOException iOException, int i2) {
        if ((iOException instanceof m0) || (iOException instanceof FileNotFoundException) || (iOException instanceof u.h)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i2 - 1) * 1000, 5000);
    }

    public long b(int i, long j, IOException iOException, int i2) {
        if (!(iOException instanceof s.d)) {
            return -9223372036854775807L;
        }
        int i3 = ((s.d) iOException).e;
        return (i3 == 404 || i3 == 410 || i3 == 416) ? 60000 : -9223372036854775807L;
    }

    public int c(int i) {
        int i2 = this.a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }
}
