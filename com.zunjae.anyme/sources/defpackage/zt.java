package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import defpackage.tt;
import defpackage.vt;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;

/* renamed from: zt  reason: default package */
public final class zt implements ht {
    private static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] q = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] r = v50.Z("#!AMR\n");
    private static final byte[] s = v50.Z("#!AMR-WB\n");
    private static final int t = q[8];
    private final byte[] a;
    private final int b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private long k;
    private jt l;
    private vt m;
    private tt n;
    private boolean o;

    static {
        yt ytVar = yt.a;
    }

    public zt() {
        this(0);
    }

    public zt(int i2) {
        this.b = i2;
        this.a = new byte[1];
        this.i = -1;
    }

    private static int b(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }

    private tt c(long j2) {
        return new dt(j2, this.h, b(this.i, 20000), this.i);
    }

    private int e(int i2) {
        if (j(i2)) {
            return this.c ? q[i2] : p[i2];
        }
        String str = this.c ? "WB" : "NB";
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("Illegal AMR ");
        sb.append(str);
        sb.append(" frame type ");
        sb.append(i2);
        throw new m0(sb.toString());
    }

    private boolean i(int i2) {
        return !this.c && (i2 < 12 || i2 > 14);
    }

    private boolean j(int i2) {
        return i2 >= 0 && i2 <= 15 && (k(i2) || i(i2));
    }

    private boolean k(int i2) {
        return this.c && (i2 < 10 || i2 > 13);
    }

    static /* synthetic */ ht[] l() {
        return new ht[]{new zt()};
    }

    private void m() {
        if (!this.o) {
            this.o = true;
            this.m.d(f0.o((String) null, this.c ? "audio/amr-wb" : "audio/3gpp", (String) null, -1, t, 1, this.c ? 16000 : 8000, -1, (List<byte[]>) null, (ns) null, 0, (String) null));
        }
    }

    private void n(long j2, int i2) {
        tt ttVar;
        int i3;
        if (!this.g) {
            if ((this.b & 1) == 0 || j2 == -1 || !((i3 = this.i) == -1 || i3 == this.e)) {
                ttVar = new tt.b(-9223372036854775807L);
            } else if (this.j >= 20 || i2 == -1) {
                ttVar = c(j2);
            } else {
                return;
            }
            this.n = ttVar;
            this.l.f(ttVar);
            this.g = true;
        }
    }

    private boolean o(it itVar, byte[] bArr) {
        itVar.i();
        byte[] bArr2 = new byte[bArr.length];
        itVar.l(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int p(it itVar) {
        itVar.i();
        itVar.l(this.a, 0, 1);
        byte b2 = this.a[0];
        if ((b2 & 131) <= 0) {
            return e((b2 >> 3) & 15);
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("Invalid padding bits for frame header ");
        sb.append(b2);
        throw new m0(sb.toString());
    }

    private boolean q(it itVar) {
        int length;
        if (o(itVar, r)) {
            this.c = false;
            length = r.length;
        } else if (!o(itVar, s)) {
            return false;
        } else {
            this.c = true;
            length = s.length;
        }
        itVar.j(length);
        return true;
    }

    private int r(it itVar) {
        if (this.f == 0) {
            try {
                int p2 = p(itVar);
                this.e = p2;
                this.f = p2;
                if (this.i == -1) {
                    this.h = itVar.m();
                    this.i = this.e;
                }
                if (this.i == this.e) {
                    this.j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a2 = this.m.a(itVar, this.f, true);
        if (a2 == -1) {
            return -1;
        }
        int i2 = this.f - a2;
        this.f = i2;
        if (i2 > 0) {
            return 0;
        }
        this.m.c(this.k + this.d, 1, this.e, 0, (vt.a) null);
        this.d += 20000;
        return 0;
    }

    public void a() {
    }

    public boolean d(it itVar) {
        return q(itVar);
    }

    public int f(it itVar, st stVar) {
        if (itVar.m() != 0 || q(itVar)) {
            m();
            int r2 = r(itVar);
            n(itVar.g(), r2);
            return r2;
        }
        throw new m0("Could not find AMR header.");
    }

    public void g(jt jtVar) {
        this.l = jtVar;
        this.m = jtVar.a(0, 1);
        jtVar.p();
    }

    public void h(long j2, long j3) {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        if (j2 != 0) {
            tt ttVar = this.n;
            if (ttVar instanceof dt) {
                this.k = ((dt) ttVar).d(j2);
                return;
            }
        }
        this.k = 0;
    }
}
