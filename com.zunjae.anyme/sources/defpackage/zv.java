package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import defpackage.tt;
import defpackage.vt;
import java.io.IOException;

/* renamed from: zv  reason: default package */
public final class zv implements ht {
    private final f0 a;
    private final i50 b = new i50(9);
    private vt c;
    private int d = 0;
    private int e;
    private long f;
    private int g;
    private int h;

    public zv(f0 f0Var) {
        this.a = f0Var;
    }

    private boolean b(it itVar) {
        this.b.H();
        if (!itVar.b(this.b.a, 0, 8, true)) {
            return false;
        }
        if (this.b.k() == 1380139777) {
            this.e = this.b.z();
            return true;
        }
        throw new IOException("Input not RawCC");
    }

    private void c(it itVar) {
        while (this.g > 0) {
            this.b.H();
            itVar.readFully(this.b.a, 0, 3);
            this.c.b(this.b, 3);
            this.h += 3;
            this.g--;
        }
        int i = this.h;
        if (i > 0) {
            this.c.c(this.f, 1, i, 0, (vt.a) null);
        }
    }

    private boolean e(it itVar) {
        long s;
        this.b.H();
        int i = this.e;
        if (i == 0) {
            if (!itVar.b(this.b.a, 0, 5, true)) {
                return false;
            }
            s = (this.b.B() * 1000) / 45;
        } else if (i != 1) {
            int i2 = this.e;
            StringBuilder sb = new StringBuilder(39);
            sb.append("Unsupported version number: ");
            sb.append(i2);
            throw new m0(sb.toString());
        } else if (!itVar.b(this.b.a, 0, 9, true)) {
            return false;
        } else {
            s = this.b.s();
        }
        this.f = s;
        this.g = this.b.z();
        this.h = 0;
        return true;
    }

    public void a() {
    }

    public boolean d(it itVar) {
        this.b.H();
        itVar.l(this.b.a, 0, 8);
        return this.b.k() == 1380139777;
    }

    public int f(it itVar, st stVar) {
        while (true) {
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c(itVar);
                        this.d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (e(itVar)) {
                    this.d = 2;
                } else {
                    this.d = 0;
                    return -1;
                }
            } else if (!b(itVar)) {
                return -1;
            } else {
                this.d = 1;
            }
        }
    }

    public void g(jt jtVar) {
        jtVar.f(new tt.b(-9223372036854775807L));
        this.c = jtVar.a(0, 3);
        jtVar.p();
        this.c.d(this.a);
    }

    public void h(long j, long j2) {
        this.d = 0;
    }
}
