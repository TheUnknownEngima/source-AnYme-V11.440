package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.m0;
import defpackage.f50;
import java.util.ArrayList;
import java.util.List;

public final class h {
    public final List<byte[]> a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    private h(List<byte[]> list, int i, int i2, int i3, float f) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
    }

    private static byte[] a(i50 i50) {
        int F = i50.F();
        int c2 = i50.c();
        i50.N(F);
        return s40.d(i50.a, c2, F);
    }

    public static h b(i50 i50) {
        float f;
        int i;
        int i2;
        try {
            i50.N(4);
            int z = (i50.z() & 3) + 1;
            if (z != 3) {
                ArrayList arrayList = new ArrayList();
                int z2 = i50.z() & 31;
                for (int i3 = 0; i3 < z2; i3++) {
                    arrayList.add(a(i50));
                }
                int z3 = i50.z();
                for (int i4 = 0; i4 < z3; i4++) {
                    arrayList.add(a(i50));
                }
                if (z2 > 0) {
                    f50.b i5 = f50.i((byte[]) arrayList.get(0), z, ((byte[]) arrayList.get(0)).length);
                    int i6 = i5.e;
                    int i7 = i5.f;
                    f = i5.g;
                    i2 = i6;
                    i = i7;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new h(arrayList, z, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new m0("Error parsing AVC config", e2);
        }
    }
}
