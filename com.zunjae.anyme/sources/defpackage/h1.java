package defpackage;

import defpackage.d1;
import defpackage.e1;
import java.util.HashMap;

/* renamed from: h1  reason: default package */
public class h1 extends e1 {
    protected float C0 = -1.0f;
    protected int D0 = -1;
    protected int E0 = -1;
    private d1 F0 = this.B;
    private int G0;

    /* renamed from: h1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d1$b[] r0 = defpackage.d1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                d1$b r1 = defpackage.d1.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                d1$b r1 = defpackage.d1.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d1$b r1 = defpackage.d1.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d1$b r1 = defpackage.d1.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                d1$b r1 = defpackage.d1.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                d1$b r1 = defpackage.d1.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0054 }
                d1$b r1 = defpackage.d1.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0060 }
                d1$b r1 = defpackage.d1.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006c }
                d1$b r1 = defpackage.d1.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.h1.a.<clinit>():void");
        }
    }

    public h1() {
        this.G0 = 0;
        this.J.clear();
        this.J.add(this.F0);
        int length = this.I.length;
        for (int i = 0; i < length; i++) {
            this.I[i] = this.F0;
        }
    }

    public void H0(u0 u0Var) {
        if (G() != null) {
            int x = u0Var.x(this.F0);
            if (this.G0 == 1) {
                D0(x);
                E0(0);
                g0(G().v());
                C0(0);
                return;
            }
            D0(0);
            E0(x);
            C0(G().P());
            g0(0);
        }
    }

    public int I0() {
        return this.G0;
    }

    public int J0() {
        return this.D0;
    }

    public int K0() {
        return this.E0;
    }

    public float L0() {
        return this.C0;
    }

    public void M0(int i) {
        if (i > -1) {
            this.C0 = -1.0f;
            this.D0 = i;
            this.E0 = -1;
        }
    }

    public void N0(int i) {
        if (i > -1) {
            this.C0 = -1.0f;
            this.D0 = -1;
            this.E0 = i;
        }
    }

    public void O0(float f) {
        if (f > -1.0f) {
            this.C0 = f;
            this.D0 = -1;
            this.E0 = -1;
        }
    }

    public void P0(int i) {
        if (this.G0 != i) {
            this.G0 = i;
            this.J.clear();
            this.F0 = this.G0 == 1 ? this.A : this.B;
            this.J.add(this.F0);
            int length = this.I.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.I[i2] = this.F0;
            }
        }
    }

    public void e(u0 u0Var) {
        f1 f1Var = (f1) G();
        if (f1Var != null) {
            d1 m = f1Var.m(d1.b.LEFT);
            d1 m2 = f1Var.m(d1.b.RIGHT);
            e1 e1Var = this.L;
            boolean z = true;
            boolean z2 = e1Var != null && e1Var.K[0] == e1.b.WRAP_CONTENT;
            if (this.G0 == 0) {
                m = f1Var.m(d1.b.TOP);
                m2 = f1Var.m(d1.b.BOTTOM);
                e1 e1Var2 = this.L;
                if (e1Var2 == null || e1Var2.K[1] != e1.b.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.D0 != -1) {
                z0 q = u0Var.q(this.F0);
                u0Var.e(q, u0Var.q(m), this.D0, 7);
                if (z2) {
                    u0Var.h(u0Var.q(m2), q, 0, 5);
                }
            } else if (this.E0 != -1) {
                z0 q2 = u0Var.q(this.F0);
                z0 q3 = u0Var.q(m2);
                u0Var.e(q2, q3, -this.E0, 7);
                if (z2) {
                    u0Var.h(q2, u0Var.q(m), 0, 5);
                    u0Var.h(q3, q2, 0, 5);
                }
            } else if (this.C0 != -1.0f) {
                u0Var.d(u0.s(u0Var, u0Var.q(this.F0), u0Var.q(m2), this.C0));
            }
        }
    }

    public boolean f() {
        return true;
    }

    public void k(e1 e1Var, HashMap<e1, e1> hashMap) {
        super.k(e1Var, hashMap);
        h1 h1Var = (h1) e1Var;
        this.C0 = h1Var.C0;
        this.D0 = h1Var.D0;
        this.E0 = h1Var.E0;
        P0(h1Var.G0);
    }

    public d1 m(d1.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.G0 == 1) {
                    return this.F0;
                }
                break;
            case 3:
            case 4:
                if (this.G0 == 0) {
                    return this.F0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
