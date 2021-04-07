package com.google.android.exoplayer2.upstream;

import java.util.Arrays;

public final class m implements e {
    private final boolean a;
    private final int b;
    private final byte[] c;
    private final d[] d;
    private int e;
    private int f;
    private int g;
    private d[] h;

    public m(boolean z, int i) {
        this(z, i, 0);
    }

    public m(boolean z, int i, int i2) {
        q40.a(i > 0);
        q40.a(i2 >= 0);
        this.a = z;
        this.b = i;
        this.g = i2;
        this.h = new d[(i2 + 100)];
        if (i2 > 0) {
            this.c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.h[i3] = new d(this.c, i3 * i);
            }
        } else {
            this.c = null;
        }
        this.d = new d[1];
    }

    public synchronized void a(d dVar) {
        this.d[0] = dVar;
        d(this.d);
    }

    public synchronized d b() {
        d dVar;
        this.f++;
        if (this.g > 0) {
            d[] dVarArr = this.h;
            int i = this.g - 1;
            this.g = i;
            dVar = dVarArr[i];
            this.h[i] = null;
        } else {
            dVar = new d(new byte[this.b], 0);
        }
        return dVar;
    }

    public synchronized void c() {
        int i = 0;
        int max = Math.max(0, v50.i(this.e, this.b) - this.f);
        if (max < this.g) {
            if (this.c != null) {
                int i2 = this.g - 1;
                while (i <= i2) {
                    d dVar = this.h[i];
                    if (dVar.a == this.c) {
                        i++;
                    } else {
                        d dVar2 = this.h[i2];
                        if (dVar2.a != this.c) {
                            i2--;
                        } else {
                            this.h[i] = dVar2;
                            this.h[i2] = dVar;
                            i2--;
                            i++;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.g) {
                    return;
                }
            }
            Arrays.fill(this.h, max, this.g, (Object) null);
            this.g = max;
        }
    }

    public synchronized void d(d[] dVarArr) {
        if (this.g + dVarArr.length >= this.h.length) {
            this.h = (d[]) Arrays.copyOf(this.h, Math.max(this.h.length * 2, this.g + dVarArr.length));
        }
        for (d dVar : dVarArr) {
            d[] dVarArr2 = this.h;
            int i = this.g;
            this.g = i + 1;
            dVarArr2[i] = dVar;
        }
        this.f -= dVarArr.length;
        notifyAll();
    }

    public int e() {
        return this.b;
    }

    public synchronized int f() {
        return this.f * this.b;
    }

    public synchronized void g() {
        if (this.a) {
            h(0);
        }
    }

    public synchronized void h(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            c();
        }
    }
}
