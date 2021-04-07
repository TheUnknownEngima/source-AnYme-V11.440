package defpackage;

/* renamed from: pu  reason: default package */
final class pu {
    private final i50 a = new i50(8);
    private int b;

    private long a(it itVar) {
        int i = 0;
        itVar.l(this.a.a, 0, 1);
        byte b2 = this.a.a[0] & 255;
        if (b2 == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b2 & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b2 & (~i2);
        itVar.l(this.a.a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.a.a[i] & 255) + (i4 << 8);
        }
        this.b += i3 + 1;
        return (long) i4;
    }

    public boolean b(it itVar) {
        long a2;
        int i;
        it itVar2 = itVar;
        long g = itVar.g();
        long j = 1024;
        int i2 = (g > -1 ? 1 : (g == -1 ? 0 : -1));
        if (i2 != 0 && g <= 1024) {
            j = g;
        }
        int i3 = (int) j;
        itVar2.l(this.a.a, 0, 4);
        this.b = 4;
        for (long B = this.a.B(); B != 440786851; B = ((B << 8) & -256) | ((long) (this.a.a[0] & 255))) {
            int i4 = this.b + 1;
            this.b = i4;
            if (i4 == i3) {
                return false;
            }
            itVar2.l(this.a.a, 0, 1);
        }
        long a3 = a(itVar);
        long j2 = (long) this.b;
        if (a3 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + a3 >= g) {
            return false;
        }
        while (true) {
            int i5 = this.b;
            long j3 = j2 + a3;
            if (((long) i5) >= j3) {
                return ((long) i5) == j3;
            }
            if (a(itVar) != Long.MIN_VALUE && a2 >= 0 && a2 <= 2147483647L) {
                if (i != 0) {
                    int a4 = (int) (a2 = a(itVar));
                    itVar2.e(a4);
                    this.b += a4;
                }
            }
        }
        return false;
    }
}
