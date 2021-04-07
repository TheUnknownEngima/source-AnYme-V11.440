package com.google.android.exoplayer2.upstream;

import java.io.InputStream;

public final class k extends InputStream {
    private final i e;
    private final l f;
    private final byte[] g;
    private boolean h = false;
    private boolean i = false;
    private long j;

    public k(i iVar, l lVar) {
        this.e = iVar;
        this.f = lVar;
        this.g = new byte[1];
    }

    private void a() {
        if (!this.h) {
            this.e.c(this.f);
            this.h = true;
        }
    }

    public void b() {
        a();
    }

    public void close() {
        if (!this.i) {
            this.e.close();
            this.i = true;
        }
    }

    public int read() {
        if (read(this.g) == -1) {
            return -1;
        }
        return this.g[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i2, int i3) {
        q40.f(!this.i);
        a();
        int a = this.e.a(bArr, i2, i3);
        if (a == -1) {
            return -1;
        }
        this.j += (long) a;
        return a;
    }
}
