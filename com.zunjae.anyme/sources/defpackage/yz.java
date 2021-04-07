package defpackage;

/* renamed from: yz  reason: default package */
public class yz implements m00 {
    protected final m00[] e;

    public yz(m00[] m00Arr) {
        this.e = m00Arr;
    }

    public final long b() {
        long j = Long.MAX_VALUE;
        for (m00 b : this.e) {
            long b2 = b.b();
            if (b2 != Long.MIN_VALUE) {
                j = Math.min(j, b2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public boolean c(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long b = b();
            if (b != Long.MIN_VALUE) {
                boolean z2 = false;
                for (m00 m00 : this.e) {
                    long b2 = m00.b();
                    boolean z3 = b2 != Long.MIN_VALUE && b2 <= j2;
                    if (b2 == b || z3) {
                        z2 |= m00.c(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    public boolean d() {
        for (m00 d : this.e) {
            if (d.d()) {
                return true;
            }
        }
        return false;
    }

    public final long g() {
        long j = Long.MAX_VALUE;
        for (m00 g : this.e) {
            long g2 = g.g();
            if (g2 != Long.MIN_VALUE) {
                j = Math.min(j, g2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void h(long j) {
        for (m00 h : this.e) {
            h.h(j);
        }
    }
}
