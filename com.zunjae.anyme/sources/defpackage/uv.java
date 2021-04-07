package defpackage;

import com.google.android.exoplayer2.m0;
import java.io.EOFException;

/* renamed from: uv  reason: default package */
final class uv {
    public int a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public final int[] g = new int[255];
    private final i50 h = new i50(255);

    uv() {
    }

    public boolean a(it itVar, boolean z) {
        this.h.H();
        b();
        if (!(itVar.g() == -1 || itVar.g() - itVar.d() >= 27) || !itVar.c(this.h.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.h.B() == 1332176723) {
            int z2 = this.h.z();
            this.a = z2;
            if (z2 == 0) {
                this.b = this.h.z();
                this.c = this.h.o();
                this.h.p();
                this.h.p();
                this.h.p();
                int z3 = this.h.z();
                this.d = z3;
                this.e = z3 + 27;
                this.h.H();
                itVar.l(this.h.a, 0, this.d);
                for (int i = 0; i < this.d; i++) {
                    this.g[i] = this.h.z();
                    this.f += this.g[i];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new m0("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new m0("expected OggS capture pattern at begin of page");
        }
    }

    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }
}
