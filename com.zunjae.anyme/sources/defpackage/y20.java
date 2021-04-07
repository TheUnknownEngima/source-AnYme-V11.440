package defpackage;

import defpackage.vt;

/* renamed from: y20  reason: default package */
public final class y20 {
    public static void a(long j, i50 i50, vt[] vtVarArr) {
        while (true) {
            boolean z = true;
            if (i50.a() > 1) {
                int c = c(i50);
                int c2 = c(i50);
                int c3 = i50.c() + c2;
                if (c2 == -1 || c2 > i50.a()) {
                    b50.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    c3 = i50.d();
                } else if (c == 4 && c2 >= 8) {
                    int z2 = i50.z();
                    int F = i50.F();
                    int k = F == 49 ? i50.k() : 0;
                    int z3 = i50.z();
                    if (F == 47) {
                        i50.N(1);
                    }
                    boolean z4 = z2 == 181 && (F == 49 || F == 47) && z3 == 3;
                    if (F == 49) {
                        if (k != 1195456820) {
                            z = false;
                        }
                        z4 &= z;
                    }
                    if (z4) {
                        b(j, i50, vtVarArr);
                    }
                }
                i50.M(c3);
            } else {
                return;
            }
        }
    }

    public static void b(long j, i50 i50, vt[] vtVarArr) {
        int z = i50.z();
        if ((z & 64) != 0) {
            i50.N(1);
            int i = (z & 31) * 3;
            int c = i50.c();
            for (vt vtVar : vtVarArr) {
                i50.M(c);
                vtVar.b(i50, i);
                vtVar.c(j, 1, i, 0, (vt.a) null);
            }
        }
    }

    private static int c(i50 i50) {
        int i = 0;
        while (i50.a() != 0) {
            int z = i50.z();
            i += z;
            if (z != 255) {
                return i;
            }
        }
        return -1;
    }
}
