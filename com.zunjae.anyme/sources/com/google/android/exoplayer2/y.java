package com.google.android.exoplayer2;

import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.m;

public class y implements i0 {
    private final m a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final int g;
    private final boolean h;
    private final long i;
    private final boolean j;
    private int k;
    private boolean l;
    private boolean m;

    public y() {
        this(new m(true, 65536));
    }

    @Deprecated
    public y(m mVar) {
        this(mVar, 15000, 50000, 50000, 2500, 5000, -1, true, 0, false);
    }

    protected y(m mVar, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, boolean z2) {
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        int i12 = i6;
        int i13 = i8;
        j(i11, 0, "bufferForPlaybackMs", "0");
        j(i12, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i2, i11, "minBufferAudioMs", "bufferForPlaybackMs");
        j(i9, i11, "minBufferVideoMs", "bufferForPlaybackMs");
        j(i2, i12, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        j(i9, i12, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        j(i10, i2, "maxBufferMs", "minBufferAudioMs");
        j(i10, i9, "maxBufferMs", "minBufferVideoMs");
        j(i13, 0, "backBufferDurationMs", "0");
        this.a = mVar;
        this.b = v.a((long) i2);
        this.c = v.a((long) i9);
        this.d = v.a((long) i10);
        this.e = v.a((long) i11);
        this.f = v.a((long) i12);
        this.g = i7;
        this.h = z;
        this.i = v.a((long) i13);
        this.j = z2;
    }

    private static void j(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        q40.b(z, sb.toString());
    }

    private static int l(int i2) {
        switch (i2) {
            case 0:
                return 36438016;
            case 1:
                return 3538944;
            case 2:
                return 32768000;
            case 3:
            case 4:
            case 5:
                return 131072;
            case 6:
                return 0;
            default:
                throw new IllegalArgumentException();
        }
    }

    private static boolean m(u0[] u0VarArr, i40 i40) {
        for (int i2 = 0; i2 < u0VarArr.length; i2++) {
            if (u0VarArr[i2].j() == 2 && i40.a(i2) != null) {
                return true;
            }
        }
        return false;
    }

    private void n(boolean z) {
        this.k = 0;
        this.l = false;
        if (z) {
            this.a.g();
        }
    }

    public void a() {
        n(false);
    }

    public boolean b() {
        return this.j;
    }

    public long c() {
        return this.i;
    }

    public boolean d(long j2, float f2, boolean z) {
        long R = v50.R(j2, f2);
        long j3 = z ? this.f : this.e;
        return j3 <= 0 || R >= j3 || (!this.h && this.a.f() >= this.k);
    }

    public boolean e(long j2, float f2) {
        boolean z = true;
        boolean z2 = this.a.f() >= this.k;
        long j3 = this.m ? this.c : this.b;
        if (f2 > 1.0f) {
            j3 = Math.min(v50.M(j3, f2), this.d);
        }
        if (j2 < j3) {
            if (!this.h && z2) {
                z = false;
            }
            this.l = z;
        } else if (j2 >= this.d || z2) {
            this.l = false;
        }
        return this.l;
    }

    public void f(u0[] u0VarArr, p00 p00, i40 i40) {
        this.m = m(u0VarArr, i40);
        int i2 = this.g;
        if (i2 == -1) {
            i2 = k(u0VarArr, i40);
        }
        this.k = i2;
        this.a.h(i2);
    }

    public void g() {
        n(true);
    }

    public e h() {
        return this.a;
    }

    public void i() {
        n(true);
    }

    /* access modifiers changed from: protected */
    public int k(u0[] u0VarArr, i40 i40) {
        int i2 = 0;
        for (int i3 = 0; i3 < u0VarArr.length; i3++) {
            if (i40.a(i3) != null) {
                i2 += l(u0VarArr[i3].j());
            }
        }
        return i2;
    }
}
