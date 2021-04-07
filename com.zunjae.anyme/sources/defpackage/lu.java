package defpackage;

import com.google.android.exoplayer2.m0;
import java.util.ArrayDeque;

/* renamed from: lu  reason: default package */
final class lu implements nu {
    private final byte[] a = new byte[8];
    private final ArrayDeque<b> b = new ArrayDeque<>();
    private final qu c = new qu();
    private mu d;
    private int e;
    private int f;
    private long g;

    /* renamed from: lu$b */
    private static final class b {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    private long d(it itVar) {
        itVar.i();
        while (true) {
            itVar.l(this.a, 0, 4);
            int c2 = qu.c(this.a[0]);
            if (c2 != -1 && c2 <= 4) {
                int a2 = (int) qu.a(this.a, c2, false);
                if (this.d.c(a2)) {
                    itVar.j(c2);
                    return (long) a2;
                }
            }
            itVar.j(1);
        }
    }

    private double e(it itVar, int i) {
        long f2 = f(itVar, i);
        return i == 4 ? (double) Float.intBitsToFloat((int) f2) : Double.longBitsToDouble(f2);
    }

    private long f(it itVar, int i) {
        itVar.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
        }
        return j;
    }

    private String g(it itVar, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        itVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    public void a() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }

    public boolean b(it itVar) {
        q40.e(this.d);
        while (true) {
            if (this.b.isEmpty() || itVar.m() < this.b.peek().b) {
                if (this.e == 0) {
                    long d2 = this.c.d(itVar, true, false, 4);
                    if (d2 == -2) {
                        d2 = d(itVar);
                    }
                    if (d2 == -1) {
                        return false;
                    }
                    this.f = (int) d2;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.d(itVar, false, true, 8);
                    this.e = 2;
                }
                int b2 = this.d.b(this.f);
                if (b2 == 0) {
                    itVar.j((int) this.g);
                    this.e = 0;
                } else if (b2 == 1) {
                    long m = itVar.m();
                    this.b.push(new b(this.f, this.g + m));
                    this.d.g(this.f, m, this.g);
                    this.e = 0;
                    return true;
                } else if (b2 == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        this.d.h(this.f, f(itVar, (int) j));
                        this.e = 0;
                        return true;
                    }
                    long j2 = this.g;
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw new m0(sb.toString());
                } else if (b2 == 3) {
                    long j3 = this.g;
                    if (j3 <= 2147483647L) {
                        this.d.e(this.f, g(itVar, (int) j3));
                        this.e = 0;
                        return true;
                    }
                    long j4 = this.g;
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j4);
                    throw new m0(sb2.toString());
                } else if (b2 == 4) {
                    this.d.d(this.f, (int) this.g, itVar);
                    this.e = 0;
                    return true;
                } else if (b2 == 5) {
                    long j5 = this.g;
                    if (j5 == 4 || j5 == 8) {
                        this.d.f(this.f, e(itVar, (int) this.g));
                        this.e = 0;
                        return true;
                    }
                    long j6 = this.g;
                    StringBuilder sb3 = new StringBuilder(40);
                    sb3.append("Invalid float size: ");
                    sb3.append(j6);
                    throw new m0(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(b2);
                    throw new m0(sb4.toString());
                }
            } else {
                this.d.a(this.b.pop().a);
                return true;
            }
        }
    }

    public void c(mu muVar) {
        this.d = muVar;
    }
}
