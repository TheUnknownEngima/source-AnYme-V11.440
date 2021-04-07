package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.m0;
import java.util.Collections;
import java.util.List;

public final class l {
    public final List<byte[]> a;
    public final int b;

    private l(List<byte[]> list, int i) {
        this.a = list;
        this.b = i;
    }

    public static l a(i50 i50) {
        try {
            i50.N(21);
            int z = i50.z() & 3;
            int z2 = i50.z();
            int c = i50.c();
            int i = 0;
            for (int i2 = 0; i2 < z2; i2++) {
                i50.N(1);
                int F = i50.F();
                for (int i3 = 0; i3 < F; i3++) {
                    int F2 = i50.F();
                    i += F2 + 4;
                    i50.N(F2);
                }
            }
            i50.M(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < z2; i5++) {
                i50.N(1);
                int F3 = i50.F();
                for (int i6 = 0; i6 < F3; i6++) {
                    int F4 = i50.F();
                    System.arraycopy(f50.a, 0, bArr, i4, f50.a.length);
                    int length = i4 + f50.a.length;
                    System.arraycopy(i50.a, i50.c(), bArr, length, F4);
                    i4 = length + F4;
                    i50.N(F4);
                }
            }
            return new l(i == 0 ? null : Collections.singletonList(bArr), z + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new m0("Error parsing HEVC config", e);
        }
    }
}
