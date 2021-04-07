package defpackage;

import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* renamed from: x1  reason: default package */
class x1 {
    public static int d;
    public boolean a;
    z1 b = null;
    ArrayList<z1> c = new ArrayList<>();

    public x1(z1 z1Var, int i) {
        d++;
        this.b = z1Var;
    }

    private long c(s1 s1Var, long j) {
        z1 z1Var = s1Var.d;
        if (z1Var instanceof v1) {
            return j;
        }
        int size = s1Var.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            q1 q1Var = s1Var.k.get(i);
            if (q1Var instanceof s1) {
                s1 s1Var2 = (s1) q1Var;
                if (s1Var2.d != z1Var) {
                    j2 = Math.min(j2, c(s1Var2, ((long) s1Var2.f) + j));
                }
            }
        }
        if (s1Var != z1Var.i) {
            return j2;
        }
        long j3 = j - z1Var.j();
        return Math.min(Math.min(j2, c(z1Var.h, j3)), j3 - ((long) z1Var.h.f));
    }

    private long d(s1 s1Var, long j) {
        z1 z1Var = s1Var.d;
        if (z1Var instanceof v1) {
            return j;
        }
        int size = s1Var.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            q1 q1Var = s1Var.k.get(i);
            if (q1Var instanceof s1) {
                s1 s1Var2 = (s1) q1Var;
                if (s1Var2.d != z1Var) {
                    j2 = Math.max(j2, d(s1Var2, ((long) s1Var2.f) + j));
                }
            }
        }
        if (s1Var != z1Var.h) {
            return j2;
        }
        long j3 = j + z1Var.j();
        return Math.max(Math.max(j2, d(z1Var.i, j3)), j3 - ((long) z1Var.i.f));
    }

    public void a(z1 z1Var) {
        this.c.add(z1Var);
    }

    public long b(f1 f1Var, int i) {
        z1 z1Var;
        long j;
        long j2;
        long j3;
        z1 z1Var2 = this.b;
        long j4 = 0;
        if (z1Var2 instanceof p1) {
            if (((p1) z1Var2).f != i) {
                return 0;
            }
        } else if (i == 0) {
            if (!(z1Var2 instanceof w1)) {
                return 0;
            }
        } else if (!(z1Var2 instanceof y1)) {
            return 0;
        }
        s1 s1Var = (i == 0 ? f1Var.d : f1Var.e).h;
        s1 s1Var2 = (i == 0 ? f1Var.d : f1Var.e).i;
        boolean contains = this.b.h.l.contains(s1Var);
        boolean contains2 = this.b.i.l.contains(s1Var2);
        long j5 = this.b.j();
        if (!contains || !contains2) {
            if (contains) {
                s1 s1Var3 = this.b.h;
                j3 = d(s1Var3, (long) s1Var3.f);
                j2 = ((long) this.b.h.f) + j5;
            } else if (contains2) {
                s1 s1Var4 = this.b.i;
                long c2 = c(s1Var4, (long) s1Var4.f);
                j2 = ((long) (-this.b.i.f)) + j5;
                j3 = -c2;
            } else {
                z1 z1Var3 = this.b;
                j = ((long) z1Var3.h.f) + z1Var3.j();
                z1Var = this.b;
            }
            return Math.max(j3, j2);
        }
        long d2 = d(this.b.h, 0);
        long c3 = c(this.b.i, 0);
        long j6 = d2 - j5;
        int i2 = this.b.i.f;
        if (j6 >= ((long) (-i2))) {
            j6 += (long) i2;
        }
        int i3 = this.b.h.f;
        long j7 = ((-c3) - j5) - ((long) i3);
        if (j7 >= ((long) i3)) {
            j7 -= (long) i3;
        }
        float o = this.b.b.o(i);
        if (o > Utils.FLOAT_EPSILON) {
            j4 = (long) ((((float) j7) / o) + (((float) j6) / (1.0f - o)));
        }
        float f = (float) j4;
        long j8 = ((long) ((f * o) + 0.5f)) + j5 + ((long) ((f * (1.0f - o)) + 0.5f));
        z1Var = this.b;
        j = ((long) z1Var.h.f) + j8;
        return j - ((long) z1Var.i.f);
    }
}
