package defpackage;

import defpackage.tt;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: qv  reason: default package */
final class qv implements vv {
    private final uv a = new uv();
    /* access modifiers changed from: private */
    public final long b;
    /* access modifiers changed from: private */
    public final long c;
    /* access modifiers changed from: private */
    public final xv d;
    private int e;
    /* access modifiers changed from: private */
    public long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    /* renamed from: qv$b */
    private final class b implements tt {
        private b() {
        }

        public boolean e() {
            return true;
        }

        public tt.a i(long j) {
            return new tt.a(new ut(j, v50.p((qv.this.b + ((qv.this.d.b(j) * (qv.this.c - qv.this.b)) / qv.this.f)) - 30000, qv.this.b, qv.this.c - 1)));
        }

        public long j() {
            return qv.this.d.a(qv.this.f);
        }
    }

    public qv(xv xvVar, long j2, long j3, long j4, long j5, boolean z) {
        q40.a(j2 >= 0 && j3 > j2);
        this.d = xvVar;
        this.b = j2;
        this.c = j3;
        if (j4 == j3 - j2 || z) {
            this.f = j5;
            this.e = 4;
            return;
        }
        this.e = 0;
    }

    private long i(it itVar) {
        it itVar2 = itVar;
        if (this.i == this.j) {
            return -1;
        }
        long m = itVar.m();
        if (!l(itVar2, this.j)) {
            long j2 = this.i;
            if (j2 != m) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(itVar2, false);
        itVar.i();
        long j3 = this.h;
        uv uvVar = this.a;
        long j4 = j3 - uvVar.c;
        int i2 = uvVar.e + uvVar.f;
        if (0 <= j4 && j4 < 72000) {
            return -1;
        }
        int i3 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i3 < 0) {
            this.j = m;
            this.l = this.a.c;
        } else {
            this.i = itVar.m() + ((long) i2);
            this.k = this.a.c;
        }
        long j5 = this.j;
        long j6 = this.i;
        if (j5 - j6 < 100000) {
            this.j = j6;
            return j6;
        }
        long j7 = ((long) i2) * (i3 <= 0 ? 2 : 1);
        long j8 = this.j;
        long j9 = this.i;
        return v50.p((itVar.m() - j7) + ((j4 * (j8 - j9)) / (this.l - this.k)), j9, j8 - 1);
    }

    private boolean l(it itVar, long j2) {
        int i2;
        long min = Math.min(j2 + 3, this.c);
        int i3 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i4 = 0;
            if (itVar.m() + ((long) i3) <= min || (i3 = (int) (min - itVar.m())) >= 4) {
                itVar.c(bArr, 0, i3, false);
                while (true) {
                    i2 = i3 - 3;
                    if (i4 >= i2) {
                        break;
                    } else if (bArr[i4] == 79 && bArr[i4 + 1] == 103 && bArr[i4 + 2] == 103 && bArr[i4 + 3] == 83) {
                        itVar.j(i4);
                        return true;
                    } else {
                        i4++;
                    }
                }
            } else {
                return false;
            }
            itVar.j(i2);
        }
    }

    private void m(it itVar) {
        uv uvVar = this.a;
        while (true) {
            uvVar.a(itVar, false);
            uv uvVar2 = this.a;
            if (uvVar2.c <= this.h) {
                itVar.j(uvVar2.e + uvVar2.f);
                this.i = itVar.m();
                uvVar = this.a;
                this.k = uvVar.c;
            } else {
                itVar.i();
                return;
            }
        }
    }

    public long b(it itVar) {
        int i2 = this.e;
        if (i2 == 0) {
            long m = itVar.m();
            this.g = m;
            this.e = 1;
            long j2 = this.c - 65307;
            if (j2 > m) {
                return j2;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long i3 = i(itVar);
                if (i3 != -1) {
                    return i3;
                }
                this.e = 3;
            } else if (i2 != 3) {
                if (i2 == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            m(itVar);
            this.e = 4;
            return -(this.k + 2);
        }
        this.f = j(itVar);
        this.e = 4;
        return this.g;
    }

    public void c(long j2) {
        this.h = v50.p(j2, 0, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0;
        this.l = this.f;
    }

    /* renamed from: h */
    public b a() {
        if (this.f != 0) {
            return new b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public long j(it itVar) {
        k(itVar);
        this.a.b();
        while ((this.a.b & 4) != 4 && itVar.m() < this.c) {
            this.a.a(itVar, false);
            uv uvVar = this.a;
            itVar.j(uvVar.e + uvVar.f);
        }
        return this.a.c;
    }

    /* access modifiers changed from: package-private */
    public void k(it itVar) {
        if (!l(itVar, this.c)) {
            throw new EOFException();
        }
    }
}
