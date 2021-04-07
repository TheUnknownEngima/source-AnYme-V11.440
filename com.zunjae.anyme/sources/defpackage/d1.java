package defpackage;

import defpackage.z0;

/* renamed from: d1  reason: default package */
public class d1 {
    public final e1 a;
    public final b b;
    public d1 c;
    public int d = 0;
    int e = -1;
    z0 f;

    /* renamed from: d1$a */
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
                d1$b r1 = defpackage.d1.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                d1$b r1 = defpackage.d1.b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d1$b r1 = defpackage.d1.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d1$b r1 = defpackage.d1.b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                d1$b r1 = defpackage.d1.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                d1$b r1 = defpackage.d1.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.d1.a.<clinit>():void");
        }
    }

    /* renamed from: d1$b */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d1(e1 e1Var, b bVar) {
        this.a = e1Var;
        this.b = bVar;
    }

    public boolean a(d1 d1Var, int i) {
        return b(d1Var, i, -1, false);
    }

    public boolean b(d1 d1Var, int i, int i2, boolean z) {
        if (d1Var == null) {
            this.c = null;
            this.d = 0;
            this.e = -1;
            return true;
        } else if (!z && !j(d1Var)) {
            return false;
        } else {
            this.c = d1Var;
            if (i > 0) {
                this.d = i;
            } else {
                this.d = 0;
            }
            this.e = i2;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r3.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r3 = this;
            e1 r0 = r3.a
            int r0 = r0.O()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.e
            r2 = -1
            if (r0 <= r2) goto L_0x0020
            d1 r0 = r3.c
            if (r0 == 0) goto L_0x0020
            e1 r0 = r0.a
            int r0 = r0.O()
            if (r0 != r1) goto L_0x0020
            int r0 = r3.e
            return r0
        L_0x0020:
            int r0 = r3.d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1.c():int");
    }

    public final d1 d() {
        switch (a.a[this.b.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.a.C;
            case 3:
                return this.a.A;
            case 4:
                return this.a.D;
            case 5:
                return this.a.B;
            default:
                throw new AssertionError(this.b.name());
        }
    }

    public e1 e() {
        return this.a;
    }

    public z0 f() {
        return this.f;
    }

    public d1 g() {
        return this.c;
    }

    public b h() {
        return this.b;
    }

    public boolean i() {
        return this.c != null;
    }

    public boolean j(d1 d1Var) {
        boolean z = false;
        if (d1Var == null) {
            return false;
        }
        b h = d1Var.h();
        b bVar = this.b;
        if (h == bVar) {
            return bVar != b.BASELINE || (d1Var.e().S() && e().S());
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return (h == b.BASELINE || h == b.CENTER_X || h == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = h == b.LEFT || h == b.RIGHT;
                if (!(d1Var.e() instanceof h1)) {
                    return z2;
                }
                if (z2 || h == b.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = h == b.TOP || h == b.BOTTOM;
                if (!(d1Var.e() instanceof h1)) {
                    return z3;
                }
                if (z3 || h == b.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.b.name());
        }
    }

    public void k() {
        this.c = null;
        this.d = 0;
        this.e = -1;
    }

    public void l(t0 t0Var) {
        z0 z0Var = this.f;
        if (z0Var == null) {
            this.f = new z0(z0.a.UNRESTRICTED, (String) null);
        } else {
            z0Var.d();
        }
    }

    public void m(int i) {
        if (i()) {
            this.e = i;
        }
    }

    public String toString() {
        return this.a.r() + ":" + this.b.toString();
    }
}
