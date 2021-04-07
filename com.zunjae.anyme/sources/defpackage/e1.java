package defpackage;

import com.github.mikephil.charting.utils.Utils;
import defpackage.d1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: e1  reason: default package */
public class e1 {
    public static float B0 = 0.5f;
    public d1 A = new d1(this, d1.b.LEFT);
    e1 A0;
    public d1 B = new d1(this, d1.b.TOP);
    public d1 C = new d1(this, d1.b.RIGHT);
    public d1 D = new d1(this, d1.b.BOTTOM);
    d1 E = new d1(this, d1.b.BASELINE);
    d1 F = new d1(this, d1.b.CENTER_X);
    d1 G = new d1(this, d1.b.CENTER_Y);
    d1 H;
    public d1[] I;
    protected ArrayList<d1> J;
    public b[] K;
    public e1 L;
    int M;
    int N;
    public float O;
    protected int P;
    protected int Q;
    protected int R;
    int S;
    int T;
    protected int U;
    protected int V;
    int W;
    protected int X;
    protected int Y;
    float Z;
    public boolean a = false;
    float a0;
    public p1 b;
    private Object b0;
    public p1 c;
    private int c0;
    public w1 d = new w1(this);
    private int d0;
    public y1 e = new y1(this);
    private String e0;
    public boolean[] f = {true, true};
    private String f0;
    public int[] g = {0, 0};
    int g0;
    public int h = -1;
    int h0;
    public int i = -1;
    int i0;
    public int j = 0;
    int j0;
    public int k = 0;
    boolean k0;
    public int[] l = new int[2];
    boolean l0;
    public int m = 0;
    boolean m0;
    public int n = 0;
    boolean n0;
    public float o = 1.0f;
    boolean o0;
    public int p = 0;
    boolean p0;
    public int q = 0;
    boolean q0;
    public float r = 1.0f;
    boolean r0;
    public boolean s;
    int s0;
    public boolean t;
    int t0;
    int u = -1;
    boolean u0;
    float v = 1.0f;
    boolean v0;
    private int[] w = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float[] w0;
    private float x = Utils.FLOAT_EPSILON;
    protected e1[] x0;
    private boolean y = false;
    protected e1[] y0;
    private boolean z;
    e1 z0;

    /* renamed from: e1$a */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                e1$b[] r0 = defpackage.e1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                e1$b r2 = defpackage.e1.b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                e1$b r3 = defpackage.e1.b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                e1$b r4 = defpackage.e1.b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                e1$b r5 = defpackage.e1.b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                d1$b[] r4 = defpackage.d1.b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                d1$b r5 = defpackage.d1.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x004e }
                d1$b r4 = defpackage.d1.b.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0058 }
                d1$b r1 = defpackage.d1.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0062 }
                d1$b r1 = defpackage.d1.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006d }
                d1$b r1 = defpackage.d1.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                d1$b r1 = defpackage.d1.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0083 }
                d1$b r1 = defpackage.d1.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008f }
                d1$b r1 = defpackage.d1.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x009b }
                d1$b r1 = defpackage.d1.b.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.e1.a.<clinit>():void");
        }
    }

    /* renamed from: e1$b */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e1() {
        d1 d1Var = new d1(this, d1.b.CENTER);
        this.H = d1Var;
        this.I = new d1[]{this.A, this.C, this.B, this.D, this.E, d1Var};
        this.J = new ArrayList<>();
        b bVar = b.FIXED;
        this.K = new b[]{bVar, bVar};
        this.L = null;
        this.M = 0;
        this.N = 0;
        this.O = Utils.FLOAT_EPSILON;
        this.P = -1;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        float f2 = B0;
        this.Z = f2;
        this.a0 = f2;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = null;
        this.f0 = null;
        this.q0 = false;
        this.r0 = false;
        this.s0 = 0;
        this.t0 = 0;
        this.w0 = new float[]{-1.0f, -1.0f};
        this.x0 = new e1[]{null, null};
        this.y0 = new e1[]{null, null};
        this.z0 = null;
        this.A0 = null;
        d();
    }

    private boolean U(int i2) {
        int i3 = i2 * 2;
        d1[] d1VarArr = this.I;
        if (!(d1VarArr[i3].c == null || d1VarArr[i3].c.c == d1VarArr[i3])) {
            int i4 = i3 + 1;
            return d1VarArr[i4].c != null && d1VarArr[i4].c.c == d1VarArr[i4];
        }
    }

    private void d() {
        this.J.add(this.A);
        this.J.add(this.B);
        this.J.add(this.C);
        this.J.add(this.D);
        this.J.add(this.F);
        this.J.add(this.G);
        this.J.add(this.H);
        this.J.add(this.E);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x039f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03c2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:269:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(defpackage.u0 r27, boolean r28, boolean r29, boolean r30, boolean r31, defpackage.z0 r32, defpackage.z0 r33, defpackage.e1.b r34, boolean r35, defpackage.d1 r36, defpackage.d1 r37, int r38, int r39, int r40, int r41, float r42, boolean r43, boolean r44, boolean r45, int r46, int r47, int r48, int r49, float r50, boolean r51) {
        /*
            r26 = this;
            r0 = r26
            r10 = r27
            r11 = r32
            r12 = r33
            r13 = r36
            r14 = r37
            r15 = r40
            r1 = r41
            r2 = r47
            r3 = r48
            r4 = r49
            z0 r9 = r10.q(r13)
            z0 r8 = r10.q(r14)
            d1 r5 = r36.g()
            z0 r7 = r10.q(r5)
            d1 r5 = r37.g()
            z0 r6 = r10.q(r5)
            v0 r5 = defpackage.u0.w()
            if (r5 == 0) goto L_0x0040
            v0 r5 = defpackage.u0.w()
            long r12 = r5.u
            r16 = 1
            long r12 = r12 + r16
            r5.u = r12
        L_0x0040:
            boolean r12 = r36.i()
            boolean r13 = r37.i()
            d1 r5 = r0.H
            boolean r16 = r5.i()
            if (r12 == 0) goto L_0x0053
            r18 = 1
            goto L_0x0055
        L_0x0053:
            r18 = 0
        L_0x0055:
            if (r13 == 0) goto L_0x0059
            int r18 = r18 + 1
        L_0x0059:
            if (r16 == 0) goto L_0x005d
            int r18 = r18 + 1
        L_0x005d:
            r19 = r18
            if (r43 == 0) goto L_0x0064
            r20 = 3
            goto L_0x0066
        L_0x0064:
            r20 = r46
        L_0x0066:
            int[] r21 = defpackage.e1.a.b
            int r22 = r34.ordinal()
            r5 = r21[r22]
            r2 = 2
            r14 = 1
            if (r5 == r14) goto L_0x007a
            if (r5 == r2) goto L_0x007a
            r14 = 3
            if (r5 == r14) goto L_0x007a
            r14 = 4
            if (r5 == r14) goto L_0x007f
        L_0x007a:
            r5 = r20
        L_0x007c:
            r20 = 0
            goto L_0x0086
        L_0x007f:
            r5 = r20
            if (r5 != r14) goto L_0x0084
            goto L_0x007c
        L_0x0084:
            r20 = 1
        L_0x0086:
            int r14 = r0.d0
            r2 = 8
            if (r14 != r2) goto L_0x0090
            r2 = 0
            r20 = 0
            goto L_0x0092
        L_0x0090:
            r2 = r39
        L_0x0092:
            if (r51 == 0) goto L_0x00af
            if (r12 != 0) goto L_0x00a0
            if (r13 != 0) goto L_0x00a0
            if (r16 != 0) goto L_0x00a0
            r14 = r38
            r10.f(r9, r14)
            goto L_0x00af
        L_0x00a0:
            if (r12 == 0) goto L_0x00af
            if (r13 != 0) goto L_0x00af
            int r14 = r36.c()
            r21 = r6
            r6 = 7
            r10.e(r9, r7, r14, r6)
            goto L_0x00b2
        L_0x00af:
            r21 = r6
            r6 = 7
        L_0x00b2:
            if (r20 != 0) goto L_0x00dd
            if (r35 == 0) goto L_0x00ca
            r6 = 3
            r14 = 0
            r10.e(r8, r9, r14, r6)
            r2 = 7
            if (r15 <= 0) goto L_0x00c1
            r10.h(r8, r9, r15, r2)
        L_0x00c1:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00cf
            r10.j(r8, r9, r1, r2)
            goto L_0x00cf
        L_0x00ca:
            r1 = 7
            r14 = 0
            r10.e(r8, r9, r2, r1)
        L_0x00cf:
            r18 = r31
            r24 = r5
            r2 = r7
            r14 = r8
            r22 = r19
            r15 = r21
            r19 = r3
            goto L_0x01d6
        L_0x00dd:
            r1 = r19
            r6 = 2
            r14 = 0
            if (r1 == r6) goto L_0x0108
            if (r43 != 0) goto L_0x0108
            r6 = 1
            if (r5 == r6) goto L_0x00ea
            if (r5 != 0) goto L_0x0108
        L_0x00ea:
            int r2 = java.lang.Math.max(r3, r2)
            if (r4 <= 0) goto L_0x00f4
            int r2 = java.lang.Math.min(r4, r2)
        L_0x00f4:
            r6 = 7
            r10.e(r8, r9, r2, r6)
            r18 = r31
            r22 = r1
            r19 = r3
            r24 = r5
            r2 = r7
            r14 = r8
            r15 = r21
            r20 = 0
            goto L_0x01d6
        L_0x0108:
            r6 = -2
            if (r3 != r6) goto L_0x010c
            r3 = r2
        L_0x010c:
            if (r4 != r6) goto L_0x0110
            r6 = r2
            goto L_0x0111
        L_0x0110:
            r6 = r4
        L_0x0111:
            if (r2 <= 0) goto L_0x0117
            r4 = 1
            if (r5 == r4) goto L_0x0117
            r2 = 0
        L_0x0117:
            if (r3 <= 0) goto L_0x0121
            r4 = 7
            r10.h(r8, r9, r3, r4)
            int r2 = java.lang.Math.max(r2, r3)
        L_0x0121:
            if (r6 <= 0) goto L_0x0138
            if (r29 == 0) goto L_0x012a
            r4 = 1
            if (r5 != r4) goto L_0x012a
            r4 = 0
            goto L_0x012b
        L_0x012a:
            r4 = 1
        L_0x012b:
            if (r4 == 0) goto L_0x0132
            r4 = 7
            r10.j(r8, r9, r6, r4)
            goto L_0x0133
        L_0x0132:
            r4 = 7
        L_0x0133:
            int r2 = java.lang.Math.min(r2, r6)
            goto L_0x0139
        L_0x0138:
            r4 = 7
        L_0x0139:
            r14 = 1
            if (r5 != r14) goto L_0x0158
            if (r29 == 0) goto L_0x0142
            r10.e(r8, r9, r2, r4)
            goto L_0x0149
        L_0x0142:
            r14 = 5
            r10.e(r8, r9, r2, r14)
            r10.j(r8, r9, r2, r4)
        L_0x0149:
            r18 = r31
            r22 = r1
            r19 = r3
            r24 = r5
            r4 = r6
            r2 = r7
            r14 = r8
            r15 = r21
            goto L_0x01d6
        L_0x0158:
            r2 = 2
            if (r5 != r2) goto L_0x01c6
            d1$b r4 = r36.h()
            d1$b r14 = defpackage.d1.b.TOP
            if (r4 == r14) goto L_0x0186
            d1$b r4 = r36.h()
            d1$b r14 = defpackage.d1.b.BOTTOM
            if (r4 != r14) goto L_0x016c
            goto L_0x0186
        L_0x016c:
            e1 r4 = r0.L
            d1$b r14 = defpackage.d1.b.LEFT
            d1 r4 = r4.m(r14)
            z0 r4 = r10.q(r4)
            e1 r14 = r0.L
            d1$b r2 = defpackage.d1.b.RIGHT
            d1 r2 = r14.m(r2)
            z0 r2 = r10.q(r2)
            r14 = r4
            goto L_0x01a0
        L_0x0186:
            e1 r2 = r0.L
            d1$b r4 = defpackage.d1.b.TOP
            d1 r2 = r2.m(r4)
            z0 r2 = r10.q(r2)
            e1 r4 = r0.L
            d1$b r14 = defpackage.d1.b.BOTTOM
            d1 r4 = r4.m(r14)
            z0 r4 = r10.q(r4)
            r14 = r2
            r2 = r4
        L_0x01a0:
            s0 r4 = r27.r()
            r19 = r3
            r3 = r4
            r22 = r1
            r1 = r4
            r4 = r8
            r24 = r5
            r15 = 0
            r5 = r9
            r18 = r6
            r15 = r21
            r6 = r2
            r2 = r7
            r7 = r14
            r14 = r8
            r8 = r50
            r3.j(r4, r5, r6, r7, r8)
            r10.d(r1)
            r4 = r18
            r20 = 0
            r18 = r31
            goto L_0x01d6
        L_0x01c6:
            r22 = r1
            r19 = r3
            r24 = r5
            r18 = r6
            r2 = r7
            r14 = r8
            r15 = r21
            r4 = r18
            r18 = 1
        L_0x01d6:
            if (r51 == 0) goto L_0x03b8
            if (r44 == 0) goto L_0x01e4
            r3 = r33
            r0 = r9
            r1 = r11
            r4 = r22
            r2 = 0
            r8 = 2
            goto L_0x03c0
        L_0x01e4:
            if (r12 != 0) goto L_0x01ec
            if (r13 != 0) goto L_0x01ec
            if (r16 != 0) goto L_0x01ec
            goto L_0x039c
        L_0x01ec:
            if (r12 == 0) goto L_0x01f2
            if (r13 != 0) goto L_0x01f2
            goto L_0x039c
        L_0x01f2:
            if (r12 != 0) goto L_0x0208
            if (r13 == 0) goto L_0x0208
            int r1 = r37.c()
            int r1 = -r1
            r2 = 7
            r10.e(r14, r15, r1, r2)
            if (r29 == 0) goto L_0x039c
            r1 = 5
            r8 = 0
            r10.h(r9, r11, r8, r1)
            goto L_0x039c
        L_0x0208:
            r8 = 0
            if (r12 == 0) goto L_0x039c
            if (r13 == 0) goto L_0x039c
            r12 = r36
            d1 r1 = r12.c
            e1 r13 = r1.a
            r7 = r37
            r1 = 4
            d1 r3 = r7.c
            e1 r6 = r3.a
            e1 r5 = r26.G()
            r3 = r24
            if (r20 == 0) goto L_0x02ba
            if (r3 != 0) goto L_0x0257
            if (r4 != 0) goto L_0x0230
            if (r19 != 0) goto L_0x0230
            r4 = 7
            r16 = 0
            r17 = 1
            r21 = 7
            goto L_0x0237
        L_0x0230:
            r4 = 5
            r16 = 1
            r17 = 0
            r21 = 5
        L_0x0237:
            boolean r1 = r13 instanceof defpackage.a1
            if (r1 != 0) goto L_0x024c
            boolean r1 = r6 instanceof defpackage.a1
            if (r1 == 0) goto L_0x0240
            goto L_0x024c
        L_0x0240:
            r1 = r16
            r22 = 5
            r16 = r4
            r4 = r21
            r21 = r17
            goto L_0x02c3
        L_0x024c:
            r1 = r16
            r21 = r17
            r22 = 5
            r16 = r4
            r4 = 4
            goto L_0x02c3
        L_0x0257:
            r1 = 1
            if (r3 != r1) goto L_0x0260
            r4 = 4
            r8 = 1
            r16 = 7
            goto L_0x02bf
        L_0x0260:
            r1 = 3
            if (r3 != r1) goto L_0x02b6
            int r1 = r0.u
            r8 = -1
            if (r1 != r8) goto L_0x027a
            r1 = 1
            r4 = 5
            r8 = 1
            r16 = 7
            r21 = 1
            if (r45 == 0) goto L_0x0277
            if (r29 == 0) goto L_0x0274
            goto L_0x02c1
        L_0x0274:
            r22 = 4
            goto L_0x02c3
        L_0x0277:
            r22 = 7
            goto L_0x02c3
        L_0x027a:
            if (r43 == 0) goto L_0x0294
            r1 = r47
            r8 = 2
            if (r1 == r8) goto L_0x0287
            r4 = 1
            if (r1 != r4) goto L_0x0285
            goto L_0x0287
        L_0x0285:
            r1 = 0
            goto L_0x0288
        L_0x0287:
            r1 = 1
        L_0x0288:
            if (r1 != 0) goto L_0x028d
            r1 = 7
            r4 = 5
            goto L_0x028f
        L_0x028d:
            r1 = 5
            r4 = 4
        L_0x028f:
            r16 = r1
            r1 = 1
        L_0x0292:
            r8 = 1
            goto L_0x02b3
        L_0x0294:
            if (r4 <= 0) goto L_0x0299
            r1 = 1
            r4 = 5
            goto L_0x02b0
        L_0x0299:
            if (r4 != 0) goto L_0x02ae
            if (r19 != 0) goto L_0x02ae
            if (r45 != 0) goto L_0x02a2
            r1 = 1
            r4 = 7
            goto L_0x02b0
        L_0x02a2:
            if (r13 == r5) goto L_0x02a8
            if (r6 == r5) goto L_0x02a8
            r1 = 4
            goto L_0x02a9
        L_0x02a8:
            r1 = 5
        L_0x02a9:
            r16 = r1
            r1 = 1
            r4 = 4
            goto L_0x0292
        L_0x02ae:
            r1 = 1
            r4 = 4
        L_0x02b0:
            r8 = 1
            r16 = 5
        L_0x02b3:
            r21 = 1
            goto L_0x02c1
        L_0x02b6:
            r1 = 0
            r4 = 4
            r8 = 0
            goto L_0x02bd
        L_0x02ba:
            r1 = 1
            r4 = 4
            r8 = 1
        L_0x02bd:
            r16 = 5
        L_0x02bf:
            r21 = 0
        L_0x02c1:
            r22 = 5
        L_0x02c3:
            if (r8 == 0) goto L_0x02ce
            if (r2 != r15) goto L_0x02ce
            if (r13 == r5) goto L_0x02ce
            r23 = 0
            r25 = 0
            goto L_0x02d2
        L_0x02ce:
            r23 = r8
            r25 = 1
        L_0x02d2:
            if (r1 == 0) goto L_0x02fd
            int r8 = r36.c()
            int r24 = r37.c()
            r12 = 3
            r1 = r27
            r28 = r2
            r2 = r9
            r12 = r3
            r3 = r28
            r0 = r4
            r4 = r8
            r8 = r5
            r5 = r42
            r31 = r12
            r12 = r6
            r6 = r15
            r7 = r14
            r11 = r8
            r17 = 0
            r8 = r24
            r24 = r0
            r0 = r9
            r9 = r22
            r1.c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0308
        L_0x02fd:
            r28 = r2
            r31 = r3
            r24 = r4
            r11 = r5
            r12 = r6
            r0 = r9
            r17 = 0
        L_0x0308:
            r1 = 6
            r2 = r28
            if (r23 == 0) goto L_0x032f
            if (r29 == 0) goto L_0x031d
            if (r2 == r15) goto L_0x031d
            if (r20 != 0) goto L_0x031d
            boolean r3 = r13 instanceof defpackage.a1
            if (r3 != 0) goto L_0x031b
            boolean r3 = r12 instanceof defpackage.a1
            if (r3 == 0) goto L_0x031d
        L_0x031b:
            r3 = 6
            goto L_0x031f
        L_0x031d:
            r3 = r16
        L_0x031f:
            int r4 = r36.c()
            r10.h(r0, r2, r4, r3)
            int r4 = r37.c()
            int r4 = -r4
            r10.j(r14, r15, r4, r3)
            goto L_0x0331
        L_0x032f:
            r3 = r16
        L_0x0331:
            if (r25 == 0) goto L_0x0373
            if (r21 == 0) goto L_0x035c
            if (r45 == 0) goto L_0x0339
            if (r30 == 0) goto L_0x035c
        L_0x0339:
            if (r13 == r11) goto L_0x0340
            if (r12 != r11) goto L_0x033e
            goto L_0x0340
        L_0x033e:
            r1 = r24
        L_0x0340:
            boolean r4 = r13 instanceof defpackage.h1
            if (r4 != 0) goto L_0x0348
            boolean r4 = r12 instanceof defpackage.h1
            if (r4 == 0) goto L_0x0349
        L_0x0348:
            r1 = 5
        L_0x0349:
            boolean r4 = r13 instanceof defpackage.a1
            if (r4 != 0) goto L_0x0351
            boolean r4 = r12 instanceof defpackage.a1
            if (r4 == 0) goto L_0x0352
        L_0x0351:
            r1 = 5
        L_0x0352:
            r4 = r24
            if (r45 == 0) goto L_0x0357
            r1 = 5
        L_0x0357:
            int r4 = java.lang.Math.max(r1, r4)
            goto L_0x035e
        L_0x035c:
            r4 = r24
        L_0x035e:
            if (r29 == 0) goto L_0x0364
            int r4 = java.lang.Math.min(r3, r4)
        L_0x0364:
            int r1 = r36.c()
            r10.e(r0, r2, r1, r4)
            int r1 = r37.c()
            int r1 = -r1
            r10.e(r14, r15, r1, r4)
        L_0x0373:
            if (r29 == 0) goto L_0x0385
            r1 = r32
            if (r1 != r2) goto L_0x037e
            int r5 = r36.c()
            goto L_0x037f
        L_0x037e:
            r5 = 0
        L_0x037f:
            if (r2 == r1) goto L_0x0385
            r2 = 5
            r10.h(r0, r1, r5, r2)
        L_0x0385:
            if (r29 == 0) goto L_0x039c
            if (r20 == 0) goto L_0x039c
            r2 = 0
            if (r40 != 0) goto L_0x039d
            if (r19 != 0) goto L_0x039d
            if (r20 == 0) goto L_0x0397
            r5 = r31
            r1 = 3
            if (r5 != r1) goto L_0x0397
            r1 = 7
            goto L_0x0398
        L_0x0397:
            r1 = 5
        L_0x0398:
            r10.h(r14, r0, r2, r1)
            goto L_0x039d
        L_0x039c:
            r2 = 0
        L_0x039d:
            if (r29 == 0) goto L_0x03b7
            if (r18 == 0) goto L_0x03b7
            r0 = r37
            d1 r1 = r0.c
            if (r1 == 0) goto L_0x03ae
            int r5 = r37.c()
            r3 = r33
            goto L_0x03b1
        L_0x03ae:
            r3 = r33
            r5 = 0
        L_0x03b1:
            if (r15 == r3) goto L_0x03b7
            r0 = 5
            r10.h(r3, r14, r5, r0)
        L_0x03b7:
            return
        L_0x03b8:
            r3 = r33
            r0 = r9
            r1 = r11
            r2 = 0
            r8 = 2
            r4 = r22
        L_0x03c0:
            if (r4 >= r8) goto L_0x0400
            if (r29 == 0) goto L_0x0400
            if (r18 == 0) goto L_0x0400
            r4 = 7
            r10.h(r0, r1, r2, r4)
            r0 = r26
            if (r28 != 0) goto L_0x03d7
            d1 r1 = r0.E
            d1 r1 = r1.c
            if (r1 != 0) goto L_0x03d5
            goto L_0x03d7
        L_0x03d5:
            r5 = 0
            goto L_0x03d8
        L_0x03d7:
            r5 = 1
        L_0x03d8:
            if (r28 != 0) goto L_0x03f9
            d1 r1 = r0.E
            d1 r1 = r1.c
            if (r1 == 0) goto L_0x03f9
            e1 r1 = r1.a
            float r4 = r1.O
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x03f8
            e1$b[] r1 = r1.K
            r4 = r1[r2]
            e1$b r5 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r4 != r5) goto L_0x03f8
            r4 = 1
            r1 = r1[r4]
            if (r1 != r5) goto L_0x03f8
            r5 = 1
            goto L_0x03f9
        L_0x03f8:
            r5 = 0
        L_0x03f9:
            if (r5 == 0) goto L_0x0402
            r1 = 7
            r10.h(r3, r14, r2, r1)
            goto L_0x0402
        L_0x0400:
            r0 = r26
        L_0x0402:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1.g(u0, boolean, boolean, boolean, boolean, z0, z0, e1$b, boolean, d1, d1, int, int, int, int, float, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public int A(int i2) {
        if (i2 == 0) {
            return P();
        }
        if (i2 == 1) {
            return v();
        }
        return 0;
    }

    public void A0(float f2) {
        this.w0[1] = f2;
    }

    public int B() {
        return this.w[1];
    }

    public void B0(int i2) {
        this.d0 = i2;
    }

    public int C() {
        return this.w[0];
    }

    public void C0(int i2) {
        this.M = i2;
        int i3 = this.X;
        if (i2 < i3) {
            this.M = i3;
        }
    }

    public int D() {
        return this.Y;
    }

    public void D0(int i2) {
        this.Q = i2;
    }

    public int E() {
        return this.X;
    }

    public void E0(int i2) {
        this.R = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.e1 F(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            d1 r3 = r2.C
            d1 r0 = r3.c
            if (r0 == 0) goto L_0x001f
            d1 r1 = r0.c
            if (r1 != r3) goto L_0x001f
            e1 r3 = r0.a
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            d1 r3 = r2.D
            d1 r0 = r3.c
            if (r0 == 0) goto L_0x001f
            d1 r1 = r0.c
            if (r1 != r3) goto L_0x001f
            e1 r3 = r0.a
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1.F(int):e1");
    }

    public void F0(boolean z2, boolean z3, boolean z4, boolean z5) {
        if (this.u == -1) {
            if (z4 && !z5) {
                this.u = 0;
            } else if (!z4 && z5) {
                this.u = 1;
                if (this.P == -1) {
                    this.v = 1.0f / this.v;
                }
            }
        }
        if (this.u == 0 && (!this.B.i() || !this.D.i())) {
            this.u = 1;
        } else if (this.u == 1 && (!this.A.i() || !this.C.i())) {
            this.u = 0;
        }
        if (this.u == -1 && (!this.B.i() || !this.D.i() || !this.A.i() || !this.C.i())) {
            if (this.B.i() && this.D.i()) {
                this.u = 0;
            } else if (this.A.i() && this.C.i()) {
                this.v = 1.0f / this.v;
                this.u = 1;
            }
        }
        if (this.u != -1) {
            return;
        }
        if (this.m > 0 && this.p == 0) {
            this.u = 0;
        } else if (this.m == 0 && this.p > 0) {
            this.v = 1.0f / this.v;
            this.u = 1;
        }
    }

    public e1 G() {
        return this.L;
    }

    public void G0(boolean z2, boolean z3) {
        int i2;
        int i3;
        boolean k2 = z2 & this.d.k();
        boolean k3 = z3 & this.e.k();
        w1 w1Var = this.d;
        int i4 = w1Var.h.g;
        y1 y1Var = this.e;
        int i5 = y1Var.h.g;
        int i6 = w1Var.i.g;
        int i7 = y1Var.i.g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i4 = 0;
            i7 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (k2) {
            this.Q = i4;
        }
        if (k3) {
            this.R = i5;
        }
        if (this.d0 == 8) {
            this.M = 0;
            this.N = 0;
            return;
        }
        if (k2) {
            if (this.K[0] == b.FIXED && i9 < (i3 = this.M)) {
                i9 = i3;
            }
            this.M = i9;
            int i11 = this.X;
            if (i9 < i11) {
                this.M = i11;
            }
        }
        if (k3) {
            if (this.K[1] == b.FIXED && i10 < (i2 = this.N)) {
                i10 = i2;
            }
            this.N = i10;
            int i12 = this.Y;
            if (i10 < i12) {
                this.N = i12;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.e1 H(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            d1 r3 = r2.A
            d1 r0 = r3.c
            if (r0 == 0) goto L_0x001f
            d1 r1 = r0.c
            if (r1 != r3) goto L_0x001f
            e1 r3 = r0.a
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            d1 r3 = r2.B
            d1 r0 = r3.c
            if (r0 == 0) goto L_0x001f
            d1 r1 = r0.c
            if (r1 != r3) goto L_0x001f
            e1 r3 = r0.a
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1.H(int):e1");
    }

    public void H0(u0 u0Var) {
        int x2 = u0Var.x(this.A);
        int x3 = u0Var.x(this.B);
        int x4 = u0Var.x(this.C);
        int x5 = u0Var.x(this.D);
        w1 w1Var = this.d;
        s1 s1Var = w1Var.h;
        if (s1Var.j) {
            s1 s1Var2 = w1Var.i;
            if (s1Var2.j) {
                x2 = s1Var.g;
                x4 = s1Var2.g;
            }
        }
        y1 y1Var = this.e;
        s1 s1Var3 = y1Var.h;
        if (s1Var3.j) {
            s1 s1Var4 = y1Var.i;
            if (s1Var4.j) {
                x3 = s1Var3.g;
                x5 = s1Var4.g;
            }
        }
        int i2 = x5 - x3;
        if (x4 - x2 < 0 || i2 < 0 || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE || x5 == Integer.MIN_VALUE || x5 == Integer.MAX_VALUE) {
            x5 = 0;
            x2 = 0;
            x3 = 0;
            x4 = 0;
        }
        e0(x2, x3, x4, x5);
    }

    public int I() {
        return Q() + this.M;
    }

    public z1 J(int i2) {
        if (i2 == 0) {
            return this.d;
        }
        if (i2 == 1) {
            return this.e;
        }
        return null;
    }

    public float K() {
        return this.a0;
    }

    public int L() {
        return this.t0;
    }

    public b M() {
        return this.K[1];
    }

    public int N() {
        int i2 = 0;
        if (this.A != null) {
            i2 = 0 + this.B.d;
        }
        return this.C != null ? i2 + this.D.d : i2;
    }

    public int O() {
        return this.d0;
    }

    public int P() {
        if (this.d0 == 8) {
            return 0;
        }
        return this.M;
    }

    public int Q() {
        e1 e1Var = this.L;
        return (e1Var == null || !(e1Var instanceof f1)) ? this.Q : ((f1) e1Var).I0 + this.Q;
    }

    public int R() {
        e1 e1Var = this.L;
        return (e1Var == null || !(e1Var instanceof f1)) ? this.R : ((f1) e1Var).J0 + this.R;
    }

    public boolean S() {
        return this.y;
    }

    public void T(d1.b bVar, e1 e1Var, d1.b bVar2, int i2, int i3) {
        m(bVar).b(e1Var.m(bVar2), i2, i3, true);
    }

    public boolean V() {
        d1 d1Var = this.A;
        d1 d1Var2 = d1Var.c;
        if (d1Var2 != null && d1Var2.c == d1Var) {
            return true;
        }
        d1 d1Var3 = this.C;
        d1 d1Var4 = d1Var3.c;
        return d1Var4 != null && d1Var4.c == d1Var3;
    }

    public boolean W() {
        d1 d1Var = this.B;
        d1 d1Var2 = d1Var.c;
        if (d1Var2 != null && d1Var2.c == d1Var) {
            return true;
        }
        d1 d1Var3 = this.D;
        d1 d1Var4 = d1Var3.c;
        return d1Var4 != null && d1Var4.c == d1Var3;
    }

    public void X() {
        this.A.k();
        this.B.k();
        this.C.k();
        this.D.k();
        this.E.k();
        this.F.k();
        this.G.k();
        this.H.k();
        this.L = null;
        this.x = Utils.FLOAT_EPSILON;
        this.M = 0;
        this.N = 0;
        this.O = Utils.FLOAT_EPSILON;
        this.P = -1;
        this.Q = 0;
        this.R = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = 0;
        float f2 = B0;
        this.Z = f2;
        this.a0 = f2;
        b[] bVarArr = this.K;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.b0 = null;
        this.c0 = 0;
        this.d0 = 0;
        this.f0 = null;
        this.o0 = false;
        this.p0 = false;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = false;
        this.v0 = false;
        float[] fArr = this.w0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.h = -1;
        this.i = -1;
        int[] iArr = this.w;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.j = 0;
        this.k = 0;
        this.o = 1.0f;
        this.r = 1.0f;
        this.n = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.m = 0;
        this.p = 0;
        this.u = -1;
        this.v = 1.0f;
        this.q0 = false;
        this.r0 = false;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
    }

    public void Y() {
        e1 G2 = G();
        if (G2 == null || !(G2 instanceof f1) || !((f1) G()).V0()) {
            int size = this.J.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.J.get(i2).k();
            }
        }
    }

    public void Z(t0 t0Var) {
        this.A.l(t0Var);
        this.B.l(t0Var);
        this.C.l(t0Var);
        this.D.l(t0Var);
        this.E.l(t0Var);
        this.H.l(t0Var);
        this.F.l(t0Var);
        this.G.l(t0Var);
    }

    public void a0(int i2) {
        this.W = i2;
        this.y = i2 > 0;
    }

    public void b0(Object obj) {
        this.b0 = obj;
    }

    public void c0(String str) {
        this.e0 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = 0
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = 1
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.O = r9
            r8.P = r1
        L_0x008d:
            return
        L_0x008e:
            r8.O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1.d0(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:228:0x042d, code lost:
        if (r13.d0 == 8) goto L_0x0432;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04ad  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(defpackage.u0 r43) {
        /*
            r42 = this;
            r13 = r42
            r9 = r43
            d1 r0 = r13.A
            z0 r7 = r9.q(r0)
            d1 r0 = r13.C
            z0 r6 = r9.q(r0)
            d1 r0 = r13.B
            z0 r4 = r9.q(r0)
            d1 r0 = r13.D
            z0 r3 = r9.q(r0)
            d1 r0 = r13.E
            z0 r1 = r9.q(r0)
            v0 r0 = defpackage.u0.r
            r10 = 1
            if (r0 == 0) goto L_0x002d
            long r14 = r0.w
            long r14 = r14 + r10
            r0.w = r14
        L_0x002d:
            w1 r0 = r13.d
            s1 r2 = r0.h
            boolean r2 = r2.j
            r12 = 0
            if (r2 == 0) goto L_0x00d7
            s1 r0 = r0.i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x00d7
            y1 r0 = r13.e
            s1 r2 = r0.h
            boolean r2 = r2.j
            if (r2 == 0) goto L_0x00d7
            s1 r0 = r0.i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x00d7
            v0 r0 = defpackage.u0.r
            if (r0 == 0) goto L_0x0053
            long r14 = r0.p
            long r14 = r14 + r10
            r0.p = r14
        L_0x0053:
            w1 r0 = r13.d
            s1 r0 = r0.h
            int r0 = r0.g
            r9.f(r7, r0)
            w1 r0 = r13.d
            s1 r0 = r0.i
            int r0 = r0.g
            r9.f(r6, r0)
            y1 r0 = r13.e
            s1 r0 = r0.h
            int r0 = r0.g
            r9.f(r4, r0)
            y1 r0 = r13.e
            s1 r0 = r0.i
            int r0 = r0.g
            r9.f(r3, r0)
            y1 r0 = r13.e
            s1 r0 = r0.k
            int r0 = r0.g
            r9.f(r1, r0)
            e1 r0 = r13.L
            if (r0 == 0) goto L_0x00d6
            if (r0 == 0) goto L_0x0090
            e1$b[] r0 = r0.K
            r0 = r0[r12]
            e1$b r1 = defpackage.e1.b.WRAP_CONTENT
            if (r0 != r1) goto L_0x0090
            r0 = 1
            goto L_0x0091
        L_0x0090:
            r0 = 0
        L_0x0091:
            e1 r1 = r13.L
            if (r1 == 0) goto L_0x00a0
            e1$b[] r1 = r1.K
            r2 = 1
            r1 = r1[r2]
            e1$b r2 = defpackage.e1.b.WRAP_CONTENT
            if (r1 != r2) goto L_0x00a0
            r1 = 1
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r0 == 0) goto L_0x00bb
            boolean[] r0 = r13.f
            boolean r0 = r0[r12]
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r42.V()
            if (r0 != 0) goto L_0x00bb
            e1 r0 = r13.L
            d1 r0 = r0.C
            z0 r0 = r9.q(r0)
            r2 = 7
            r9.h(r0, r6, r12, r2)
        L_0x00bb:
            if (r1 == 0) goto L_0x00d6
            boolean[] r0 = r13.f
            r1 = 1
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x00d6
            boolean r0 = r42.W()
            if (r0 != 0) goto L_0x00d6
            e1 r0 = r13.L
            d1 r0 = r0.D
            z0 r0 = r9.q(r0)
            r1 = 7
            r9.h(r0, r3, r12, r1)
        L_0x00d6:
            return
        L_0x00d7:
            v0 r0 = defpackage.u0.r
            if (r0 == 0) goto L_0x00e0
            long r14 = r0.q
            long r14 = r14 + r10
            r0.q = r14
        L_0x00e0:
            e1 r0 = r13.L
            r15 = 8
            if (r0 == 0) goto L_0x0175
            if (r0 == 0) goto L_0x00f2
            e1$b[] r0 = r0.K
            r0 = r0[r12]
            e1$b r2 = defpackage.e1.b.WRAP_CONTENT
            if (r0 != r2) goto L_0x00f2
            r0 = 1
            goto L_0x00f3
        L_0x00f2:
            r0 = 0
        L_0x00f3:
            e1 r2 = r13.L
            if (r2 == 0) goto L_0x0102
            e1$b[] r2 = r2.K
            r5 = 1
            r2 = r2[r5]
            e1$b r5 = defpackage.e1.b.WRAP_CONTENT
            if (r2 != r5) goto L_0x0102
            r2 = 1
            goto L_0x0103
        L_0x0102:
            r2 = 0
        L_0x0103:
            boolean r5 = r13.U(r12)
            if (r5 == 0) goto L_0x0112
            e1 r5 = r13.L
            f1 r5 = (defpackage.f1) r5
            r5.M0(r13, r12)
            r5 = 1
            goto L_0x0116
        L_0x0112:
            boolean r5 = r42.V()
        L_0x0116:
            r8 = 1
            boolean r10 = r13.U(r8)
            if (r10 == 0) goto L_0x0126
            e1 r10 = r13.L
            f1 r10 = (defpackage.f1) r10
            r10.M0(r13, r8)
            r8 = 1
            goto L_0x012a
        L_0x0126:
            boolean r8 = r42.W()
        L_0x012a:
            if (r5 != 0) goto L_0x014a
            if (r0 == 0) goto L_0x014a
            int r10 = r13.d0
            if (r10 == r15) goto L_0x014a
            d1 r10 = r13.A
            d1 r10 = r10.c
            if (r10 != 0) goto L_0x014a
            d1 r10 = r13.C
            d1 r10 = r10.c
            if (r10 != 0) goto L_0x014a
            e1 r10 = r13.L
            d1 r10 = r10.C
            z0 r10 = r9.q(r10)
            r11 = 1
            r9.h(r10, r6, r12, r11)
        L_0x014a:
            if (r8 != 0) goto L_0x016e
            if (r2 == 0) goto L_0x016e
            int r10 = r13.d0
            if (r10 == r15) goto L_0x016e
            d1 r10 = r13.B
            d1 r10 = r10.c
            if (r10 != 0) goto L_0x016e
            d1 r10 = r13.D
            d1 r10 = r10.c
            if (r10 != 0) goto L_0x016e
            d1 r10 = r13.E
            if (r10 != 0) goto L_0x016e
            e1 r10 = r13.L
            d1 r10 = r10.D
            z0 r10 = r9.q(r10)
            r11 = 1
            r9.h(r10, r3, r12, r11)
        L_0x016e:
            r14 = r0
            r0 = r2
            r27 = r5
            r26 = r8
            goto L_0x017b
        L_0x0175:
            r0 = 0
            r14 = 0
            r26 = 0
            r27 = 0
        L_0x017b:
            int r2 = r13.M
            int r5 = r13.X
            if (r2 >= r5) goto L_0x0182
            r2 = r5
        L_0x0182:
            int r5 = r13.N
            int r8 = r13.Y
            if (r5 >= r8) goto L_0x0189
            r5 = r8
        L_0x0189:
            e1$b[] r8 = r13.K
            r8 = r8[r12]
            e1$b r10 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r8 == r10) goto L_0x0193
            r8 = 1
            goto L_0x0194
        L_0x0193:
            r8 = 0
        L_0x0194:
            e1$b[] r10 = r13.K
            r11 = 1
            r10 = r10[r11]
            e1$b r11 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r10 == r11) goto L_0x019f
            r10 = 1
            goto L_0x01a0
        L_0x019f:
            r10 = 0
        L_0x01a0:
            int r11 = r13.P
            r13.u = r11
            float r11 = r13.O
            r13.v = r11
            int r12 = r13.j
            int r15 = r13.k
            r20 = 0
            r21 = 4
            r22 = r2
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 <= 0) goto L_0x025c
            int r11 = r13.d0
            r2 = 8
            if (r11 == r2) goto L_0x025c
            e1$b[] r11 = r13.K
            r18 = 0
            r11 = r11[r18]
            e1$b r2 = defpackage.e1.b.MATCH_CONSTRAINT
            r25 = r1
            if (r11 != r2) goto L_0x01cb
            if (r12 != 0) goto L_0x01cb
            r12 = 3
        L_0x01cb:
            e1$b[] r2 = r13.K
            r11 = 1
            r2 = r2[r11]
            e1$b r11 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r2 != r11) goto L_0x01d7
            if (r15 != 0) goto L_0x01d7
            r15 = 3
        L_0x01d7:
            e1$b[] r2 = r13.K
            r11 = 0
            r1 = r2[r11]
            e1$b r11 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r1 != r11) goto L_0x01ee
            r1 = 1
            r2 = r2[r1]
            if (r2 != r11) goto L_0x01ee
            r1 = 3
            if (r12 != r1) goto L_0x01ef
            if (r15 != r1) goto L_0x01ef
            r13.F0(r14, r0, r8, r10)
            goto L_0x0251
        L_0x01ee:
            r1 = 3
        L_0x01ef:
            e1$b[] r2 = r13.K
            r8 = 0
            r10 = r2[r8]
            e1$b r11 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r10 != r11) goto L_0x021b
            if (r12 != r1) goto L_0x021b
            r13.u = r8
            float r1 = r13.v
            int r8 = r13.N
            float r8 = (float) r8
            float r1 = r1 * r8
            int r1 = (int) r1
            r8 = 1
            r2 = r2[r8]
            if (r2 == r11) goto L_0x0213
            r2 = r1
            r29 = r5
            r30 = r15
            r28 = 0
            r31 = 4
            goto L_0x0268
        L_0x0213:
            r2 = r1
            r29 = r5
            r31 = r12
            r30 = r15
            goto L_0x0259
        L_0x021b:
            r8 = 1
            e1$b[] r1 = r13.K
            r1 = r1[r8]
            e1$b r2 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r1 != r2) goto L_0x0251
            r1 = 3
            if (r15 != r1) goto L_0x0251
            r13.u = r8
            int r1 = r13.P
            r2 = -1
            if (r1 != r2) goto L_0x0235
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r13.v
            float r1 = r1 / r2
            r13.v = r1
        L_0x0235:
            float r1 = r13.v
            int r2 = r13.M
            float r2 = (float) r2
            float r1 = r1 * r2
            int r5 = (int) r1
            e1$b[] r1 = r13.K
            r2 = 0
            r1 = r1[r2]
            e1$b r2 = defpackage.e1.b.MATCH_CONSTRAINT
            if (r1 == r2) goto L_0x0251
            r29 = r5
            r31 = r12
            r2 = r22
            r28 = 0
            r30 = 4
            goto L_0x0268
        L_0x0251:
            r29 = r5
            r31 = r12
            r30 = r15
            r2 = r22
        L_0x0259:
            r28 = 1
            goto L_0x0268
        L_0x025c:
            r25 = r1
            r29 = r5
            r31 = r12
            r30 = r15
            r2 = r22
            r28 = 0
        L_0x0268:
            int[] r1 = r13.l
            r5 = 0
            r1[r5] = r31
            r5 = 1
            r1[r5] = r30
            if (r28 == 0) goto L_0x027c
            int r1 = r13.u
            r5 = -1
            if (r1 == 0) goto L_0x0279
            if (r1 != r5) goto L_0x027d
        L_0x0279:
            r20 = 1
            goto L_0x027f
        L_0x027c:
            r5 = -1
        L_0x027d:
            r20 = 0
        L_0x027f:
            e1$b[] r1 = r13.K
            r8 = 0
            r1 = r1[r8]
            e1$b r8 = defpackage.e1.b.WRAP_CONTENT
            if (r1 != r8) goto L_0x028f
            boolean r1 = r13 instanceof defpackage.f1
            if (r1 == 0) goto L_0x028f
            r21 = 1
            goto L_0x0291
        L_0x028f:
            r21 = 0
        L_0x0291:
            if (r21 == 0) goto L_0x0296
            r32 = 0
            goto L_0x0298
        L_0x0296:
            r32 = r2
        L_0x0298:
            d1 r1 = r13.H
            boolean r1 = r1.i()
            r15 = 1
            r33 = r1 ^ 1
            int r1 = r13.h
            r12 = 2
            r34 = 0
            if (r1 == r12) goto L_0x0373
            w1 r1 = r13.d
            s1 r2 = r1.h
            boolean r8 = r2.j
            if (r8 == 0) goto L_0x02f4
            s1 r1 = r1.i
            boolean r1 = r1.j
            if (r1 != 0) goto L_0x02b7
            goto L_0x02f4
        L_0x02b7:
            int r1 = r2.g
            r9.f(r7, r1)
            w1 r1 = r13.d
            s1 r1 = r1.i
            int r1 = r1.g
            r9.f(r6, r1)
            e1 r1 = r13.L
            if (r1 == 0) goto L_0x02e4
            if (r14 == 0) goto L_0x02e4
            boolean[] r1 = r13.f
            r2 = 0
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x02e4
            boolean r1 = r42.V()
            if (r1 != 0) goto L_0x02e4
            e1 r1 = r13.L
            d1 r1 = r1.C
            z0 r1 = r9.q(r1)
            r11 = 7
            r9.h(r1, r6, r2, r11)
        L_0x02e4:
            r37 = r0
            r39 = r3
            r40 = r4
            r41 = r6
            r35 = r7
            r36 = r14
            r38 = r25
            goto L_0x0383
        L_0x02f4:
            r11 = 7
            e1 r1 = r13.L
            if (r1 == 0) goto L_0x0302
            d1 r1 = r1.C
            z0 r1 = r9.q(r1)
            r17 = r1
            goto L_0x0304
        L_0x0302:
            r17 = r34
        L_0x0304:
            e1 r1 = r13.L
            if (r1 == 0) goto L_0x0311
            d1 r1 = r1.A
            z0 r1 = r9.q(r1)
            r35 = r1
            goto L_0x0313
        L_0x0311:
            r35 = r34
        L_0x0313:
            r2 = 1
            r1 = -1
            r16 = 8
            boolean[] r5 = r13.f
            r18 = 0
            boolean r5 = r5[r18]
            e1$b[] r8 = r13.K
            r8 = r8[r18]
            d1 r10 = r13.A
            d1 r1 = r13.C
            r22 = 7
            r11 = r1
            int r1 = r13.Q
            r2 = 0
            r12 = r1
            int r1 = r13.X
            r36 = r14
            r14 = r1
            int[] r1 = r13.w
            r1 = r1[r2]
            r15 = r1
            float r1 = r13.Z
            r16 = r1
            int r1 = r13.m
            r22 = r1
            int r1 = r13.n
            r23 = r1
            float r1 = r13.o
            r24 = r1
            r37 = r0
            r0 = r42
            r38 = r25
            r1 = r43
            r39 = r3
            r3 = r36
            r40 = r4
            r4 = r37
            r41 = r6
            r6 = r35
            r35 = r7
            r7 = r17
            r9 = r21
            r13 = r32
            r17 = r20
            r18 = r27
            r19 = r26
            r20 = r31
            r21 = r30
            r25 = r33
            r2 = 1
            r0.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x0381
        L_0x0373:
            r37 = r0
            r39 = r3
            r40 = r4
            r41 = r6
            r35 = r7
            r36 = r14
            r38 = r25
        L_0x0381:
            r13 = r42
        L_0x0383:
            y1 r0 = r13.e
            s1 r1 = r0.h
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x03d3
            s1 r0 = r0.i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x03d3
            int r0 = r1.g
            r9 = r43
            r7 = r40
            r9.f(r7, r0)
            y1 r0 = r13.e
            s1 r0 = r0.i
            int r0 = r0.g
            r6 = r39
            r9.f(r6, r0)
            y1 r0 = r13.e
            s1 r0 = r0.k
            int r0 = r0.g
            r1 = r38
            r9.f(r1, r0)
            e1 r0 = r13.L
            if (r0 == 0) goto L_0x03ce
            if (r26 != 0) goto L_0x03ce
            if (r37 == 0) goto L_0x03ce
            boolean[] r2 = r13.f
            r4 = 1
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x03cb
            d1 r0 = r0.D
            z0 r0 = r9.q(r0)
            r2 = 7
            r3 = 0
            r9.h(r0, r6, r3, r2)
            goto L_0x03d1
        L_0x03cb:
            r2 = 7
            r3 = 0
            goto L_0x03d1
        L_0x03ce:
            r2 = 7
            r3 = 0
            r4 = 1
        L_0x03d1:
            r14 = 0
            goto L_0x03df
        L_0x03d3:
            r9 = r43
            r1 = r38
            r6 = r39
            r7 = r40
            r2 = 7
            r3 = 0
            r4 = 1
            r14 = 1
        L_0x03df:
            int r0 = r13.i
            r5 = 2
            if (r0 != r5) goto L_0x03e6
            r12 = 0
            goto L_0x03e7
        L_0x03e6:
            r12 = r14
        L_0x03e7:
            if (r12 == 0) goto L_0x04a7
            e1$b[] r0 = r13.K
            r0 = r0[r4]
            e1$b r5 = defpackage.e1.b.WRAP_CONTENT
            if (r0 != r5) goto L_0x03f8
            boolean r0 = r13 instanceof defpackage.f1
            if (r0 == 0) goto L_0x03f8
            r17 = 1
            goto L_0x03fa
        L_0x03f8:
            r17 = 0
        L_0x03fa:
            if (r17 == 0) goto L_0x03fe
            r29 = 0
        L_0x03fe:
            if (r28 == 0) goto L_0x040a
            int r0 = r13.u
            if (r0 == r4) goto L_0x0407
            r5 = -1
            if (r0 != r5) goto L_0x040a
        L_0x0407:
            r18 = 1
            goto L_0x040c
        L_0x040a:
            r18 = 0
        L_0x040c:
            e1 r0 = r13.L
            if (r0 == 0) goto L_0x0417
            d1 r0 = r0.D
            z0 r0 = r9.q(r0)
            goto L_0x0419
        L_0x0417:
            r0 = r34
        L_0x0419:
            e1 r5 = r13.L
            if (r5 == 0) goto L_0x0425
            d1 r5 = r5.B
            z0 r5 = r9.q(r5)
            r34 = r5
        L_0x0425:
            int r5 = r13.W
            if (r5 > 0) goto L_0x0430
            int r5 = r13.d0
            r8 = 8
            if (r5 != r8) goto L_0x045c
            goto L_0x0432
        L_0x0430:
            r8 = 8
        L_0x0432:
            int r5 = r42.n()
            r9.e(r1, r7, r5, r2)
            d1 r5 = r13.E
            d1 r5 = r5.c
            if (r5 == 0) goto L_0x0455
            z0 r5 = r9.q(r5)
            r9.e(r1, r5, r3, r2)
            if (r37 == 0) goto L_0x0452
            d1 r1 = r13.D
            z0 r1 = r9.q(r1)
            r2 = 5
            r9.h(r0, r1, r3, r2)
        L_0x0452:
            r25 = 0
            goto L_0x045e
        L_0x0455:
            int r5 = r13.d0
            if (r5 != r8) goto L_0x045c
            r9.e(r1, r7, r3, r2)
        L_0x045c:
            r25 = r33
        L_0x045e:
            r2 = 0
            boolean[] r1 = r13.f
            boolean r5 = r1[r4]
            e1$b[] r1 = r13.K
            r8 = r1[r4]
            d1 r10 = r13.B
            d1 r11 = r13.D
            int r12 = r13.R
            int r14 = r13.Y
            int[] r1 = r13.w
            r15 = r1[r4]
            float r1 = r13.a0
            r16 = r1
            int r1 = r13.p
            r22 = r1
            int r1 = r13.q
            r23 = r1
            float r1 = r13.r
            r24 = r1
            r19 = r0
            r0 = r42
            r1 = r43
            r3 = r37
            r4 = r36
            r32 = r6
            r6 = r34
            r33 = r7
            r7 = r19
            r9 = r17
            r13 = r29
            r17 = r18
            r18 = r26
            r19 = r27
            r20 = r30
            r21 = r31
            r0.g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x04ab
        L_0x04a7:
            r32 = r6
            r33 = r7
        L_0x04ab:
            if (r28 == 0) goto L_0x04d1
            r6 = 7
            r7 = r42
            int r0 = r7.u
            r1 = 1
            float r5 = r7.v
            if (r0 != r1) goto L_0x04c2
            r0 = r43
            r1 = r32
            r2 = r33
            r3 = r41
            r4 = r35
            goto L_0x04cd
        L_0x04c2:
            r6 = 7
            r0 = r43
            r1 = r41
            r2 = r35
            r3 = r32
            r4 = r33
        L_0x04cd:
            r0.k(r1, r2, r3, r4, r5, r6)
            goto L_0x04d3
        L_0x04d1:
            r7 = r42
        L_0x04d3:
            d1 r0 = r7.H
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x04fb
            d1 r0 = r7.H
            d1 r0 = r0.g()
            e1 r0 = r0.e()
            float r1 = r7.x
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            d1 r2 = r7.H
            int r2 = r2.c()
            r3 = r43
            r3.b(r7, r0, r1, r2)
        L_0x04fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1.e(u0):void");
    }

    public void e0(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i4 - i2;
        int i9 = i5 - i3;
        this.Q = i2;
        this.R = i3;
        if (this.d0 == 8) {
            this.M = 0;
            this.N = 0;
            return;
        }
        if (this.K[0] == b.FIXED && i8 < (i7 = this.M)) {
            i8 = i7;
        }
        if (this.K[1] == b.FIXED && i9 < (i6 = this.N)) {
            i9 = i6;
        }
        this.M = i8;
        this.N = i9;
        int i10 = this.Y;
        if (i9 < i10) {
            this.N = i10;
        }
        int i11 = this.M;
        int i12 = this.X;
        if (i11 < i12) {
            this.M = i12;
        }
    }

    public boolean f() {
        return this.d0 != 8;
    }

    public void f0(boolean z2) {
        this.y = z2;
    }

    public void g0(int i2) {
        this.N = i2;
        int i3 = this.Y;
        if (i2 < i3) {
            this.N = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01b1, code lost:
        if (r6.i() != false) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e0, code lost:
        if (r6.i() != false) goto L_0x01e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(defpackage.d1.b r4, defpackage.e1 r5, defpackage.d1.b r6, int r7) {
        /*
            r3 = this;
            d1$b r0 = defpackage.d1.b.CENTER
            r1 = 0
            if (r4 != r0) goto L_0x00ab
            d1$b r4 = defpackage.d1.b.LEFT
            if (r6 != r0) goto L_0x007c
            d1 r4 = r3.m(r4)
            d1$b r6 = defpackage.d1.b.RIGHT
            d1 r6 = r3.m(r6)
            d1$b r7 = defpackage.d1.b.TOP
            d1 r7 = r3.m(r7)
            d1$b r0 = defpackage.d1.b.BOTTOM
            d1 r0 = r3.m(r0)
            r2 = 1
            if (r4 == 0) goto L_0x0028
            boolean r4 = r4.i()
            if (r4 != 0) goto L_0x0030
        L_0x0028:
            if (r6 == 0) goto L_0x0032
            boolean r4 = r6.i()
            if (r4 == 0) goto L_0x0032
        L_0x0030:
            r4 = 0
            goto L_0x003d
        L_0x0032:
            d1$b r4 = defpackage.d1.b.LEFT
            r3.h(r4, r5, r4, r1)
            d1$b r4 = defpackage.d1.b.RIGHT
            r3.h(r4, r5, r4, r1)
            r4 = 1
        L_0x003d:
            if (r7 == 0) goto L_0x0045
            boolean r6 = r7.i()
            if (r6 != 0) goto L_0x004d
        L_0x0045:
            if (r0 == 0) goto L_0x004f
            boolean r6 = r0.i()
            if (r6 == 0) goto L_0x004f
        L_0x004d:
            r2 = 0
            goto L_0x0059
        L_0x004f:
            d1$b r6 = defpackage.d1.b.TOP
            r3.h(r6, r5, r6, r1)
            d1$b r6 = defpackage.d1.b.BOTTOM
            r3.h(r6, r5, r6, r1)
        L_0x0059:
            if (r4 == 0) goto L_0x0066
            if (r2 == 0) goto L_0x0066
            d1$b r4 = defpackage.d1.b.CENTER
            d1 r4 = r3.m(r4)
            d1$b r6 = defpackage.d1.b.CENTER
            goto L_0x00a6
        L_0x0066:
            if (r4 == 0) goto L_0x0071
            d1$b r4 = defpackage.d1.b.CENTER_X
            d1 r4 = r3.m(r4)
            d1$b r6 = defpackage.d1.b.CENTER_X
            goto L_0x00a6
        L_0x0071:
            if (r2 == 0) goto L_0x01eb
            d1$b r4 = defpackage.d1.b.CENTER_Y
            d1 r4 = r3.m(r4)
            d1$b r6 = defpackage.d1.b.CENTER_Y
            goto L_0x00a6
        L_0x007c:
            if (r6 == r4) goto L_0x0096
            d1$b r4 = defpackage.d1.b.RIGHT
            if (r6 != r4) goto L_0x0083
            goto L_0x0096
        L_0x0083:
            d1$b r4 = defpackage.d1.b.TOP
            if (r6 == r4) goto L_0x008b
            d1$b r4 = defpackage.d1.b.BOTTOM
            if (r6 != r4) goto L_0x01eb
        L_0x008b:
            d1$b r4 = defpackage.d1.b.TOP
            r3.h(r4, r5, r6, r1)
            d1$b r4 = defpackage.d1.b.BOTTOM
            r3.h(r4, r5, r6, r1)
            goto L_0x00a0
        L_0x0096:
            d1$b r4 = defpackage.d1.b.LEFT
            r3.h(r4, r5, r6, r1)
            d1$b r4 = defpackage.d1.b.RIGHT
            r3.h(r4, r5, r6, r1)     // Catch:{ all -> 0x01ec }
        L_0x00a0:
            d1$b r4 = defpackage.d1.b.CENTER
        L_0x00a2:
            d1 r4 = r3.m(r4)
        L_0x00a6:
            d1 r5 = r5.m(r6)
            goto L_0x00d3
        L_0x00ab:
            d1$b r0 = defpackage.d1.b.CENTER_X
            if (r4 != r0) goto L_0x00d8
            d1$b r0 = defpackage.d1.b.LEFT
            if (r6 == r0) goto L_0x00b7
            d1$b r0 = defpackage.d1.b.RIGHT
            if (r6 != r0) goto L_0x00d8
        L_0x00b7:
            d1$b r4 = defpackage.d1.b.LEFT
            d1 r4 = r3.m(r4)
            d1 r5 = r5.m(r6)
            d1$b r6 = defpackage.d1.b.RIGHT
            d1 r6 = r3.m(r6)
            r4.a(r5, r1)
            r6.a(r5, r1)
            d1$b r4 = defpackage.d1.b.CENTER_X
            d1 r4 = r3.m(r4)
        L_0x00d3:
            r4.a(r5, r1)
            goto L_0x01eb
        L_0x00d8:
            d1$b r0 = defpackage.d1.b.CENTER_Y
            if (r4 != r0) goto L_0x0105
            d1$b r0 = defpackage.d1.b.TOP
            if (r6 == r0) goto L_0x00e4
            d1$b r0 = defpackage.d1.b.BOTTOM
            if (r6 != r0) goto L_0x0105
        L_0x00e4:
            d1 r4 = r5.m(r6)
            d1$b r5 = defpackage.d1.b.TOP
            d1 r5 = r3.m(r5)
            r5.a(r4, r1)
            d1$b r5 = defpackage.d1.b.BOTTOM
            d1 r5 = r3.m(r5)
            r5.a(r4, r1)
            d1$b r5 = defpackage.d1.b.CENTER_Y
            d1 r5 = r3.m(r5)
            r5.a(r4, r1)
            goto L_0x01eb
        L_0x0105:
            d1$b r0 = defpackage.d1.b.CENTER_X
            if (r4 != r0) goto L_0x012d
            if (r6 != r0) goto L_0x012d
            d1$b r4 = defpackage.d1.b.LEFT
            d1 r4 = r3.m(r4)
            d1$b r7 = defpackage.d1.b.LEFT
            d1 r7 = r5.m(r7)
            r4.a(r7, r1)
            d1$b r4 = defpackage.d1.b.RIGHT
            d1 r4 = r3.m(r4)
            d1$b r7 = defpackage.d1.b.RIGHT
            d1 r7 = r5.m(r7)
            r4.a(r7, r1)
            d1$b r4 = defpackage.d1.b.CENTER_X
            goto L_0x00a2
        L_0x012d:
            d1$b r0 = defpackage.d1.b.CENTER_Y
            if (r4 != r0) goto L_0x0155
            if (r6 != r0) goto L_0x0155
            d1$b r4 = defpackage.d1.b.TOP
            d1 r4 = r3.m(r4)
            d1$b r7 = defpackage.d1.b.TOP
            d1 r7 = r5.m(r7)
            r4.a(r7, r1)
            d1$b r4 = defpackage.d1.b.BOTTOM
            d1 r4 = r3.m(r4)
            d1$b r7 = defpackage.d1.b.BOTTOM
            d1 r7 = r5.m(r7)
            r4.a(r7, r1)
            d1$b r4 = defpackage.d1.b.CENTER_Y
            goto L_0x00a2
        L_0x0155:
            d1 r0 = r3.m(r4)
            d1 r5 = r5.m(r6)
            boolean r6 = r0.j(r5)
            if (r6 == 0) goto L_0x01eb
            d1$b r6 = defpackage.d1.b.BASELINE
            if (r4 != r6) goto L_0x017f
            d1$b r4 = defpackage.d1.b.TOP
            d1 r4 = r3.m(r4)
            d1$b r6 = defpackage.d1.b.BOTTOM
            d1 r6 = r3.m(r6)
            if (r4 == 0) goto L_0x0178
            r4.k()
        L_0x0178:
            if (r6 == 0) goto L_0x017d
            r6.k()
        L_0x017d:
            r7 = 0
            goto L_0x01e8
        L_0x017f:
            d1$b r6 = defpackage.d1.b.TOP
            if (r4 == r6) goto L_0x01b4
            d1$b r6 = defpackage.d1.b.BOTTOM
            if (r4 != r6) goto L_0x0188
            goto L_0x01b4
        L_0x0188:
            d1$b r6 = defpackage.d1.b.LEFT
            if (r4 == r6) goto L_0x0190
            d1$b r6 = defpackage.d1.b.RIGHT
            if (r4 != r6) goto L_0x01e8
        L_0x0190:
            d1$b r6 = defpackage.d1.b.CENTER
            d1 r6 = r3.m(r6)
            d1 r1 = r6.g()
            if (r1 == r5) goto L_0x019f
            r6.k()
        L_0x019f:
            d1 r4 = r3.m(r4)
            d1 r4 = r4.d()
            d1$b r6 = defpackage.d1.b.CENTER_X
            d1 r6 = r3.m(r6)
            boolean r1 = r6.i()
            if (r1 == 0) goto L_0x01e8
            goto L_0x01e2
        L_0x01b4:
            d1$b r6 = defpackage.d1.b.BASELINE
            d1 r6 = r3.m(r6)
            if (r6 == 0) goto L_0x01bf
            r6.k()
        L_0x01bf:
            d1$b r6 = defpackage.d1.b.CENTER
            d1 r6 = r3.m(r6)
            d1 r1 = r6.g()
            if (r1 == r5) goto L_0x01ce
            r6.k()
        L_0x01ce:
            d1 r4 = r3.m(r4)
            d1 r4 = r4.d()
            d1$b r6 = defpackage.d1.b.CENTER_Y
            d1 r6 = r3.m(r6)
            boolean r1 = r6.i()
            if (r1 == 0) goto L_0x01e8
        L_0x01e2:
            r4.k()
            r6.k()
        L_0x01e8:
            r0.a(r5, r7)
        L_0x01eb:
            return
        L_0x01ec:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e1.h(d1$b, e1, d1$b, int):void");
    }

    public void h0(float f2) {
        this.Z = f2;
    }

    public void i(d1 d1Var, d1 d1Var2, int i2) {
        if (d1Var.e() == this) {
            h(d1Var.h(), d1Var2.e(), d1Var2.h(), i2);
        }
    }

    public void i0(int i2) {
        this.s0 = i2;
    }

    public void j(e1 e1Var, float f2, int i2) {
        d1.b bVar = d1.b.CENTER;
        T(bVar, e1Var, bVar, i2, 0);
        this.x = f2;
    }

    public void j0(int i2, int i3) {
        this.Q = i2;
        int i4 = i3 - i2;
        this.M = i4;
        int i5 = this.X;
        if (i4 < i5) {
            this.M = i5;
        }
    }

    public void k(e1 e1Var, HashMap<e1, e1> hashMap) {
        this.h = e1Var.h;
        this.i = e1Var.i;
        this.j = e1Var.j;
        this.k = e1Var.k;
        int[] iArr = this.l;
        int[] iArr2 = e1Var.l;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.m = e1Var.m;
        this.n = e1Var.n;
        this.p = e1Var.p;
        this.q = e1Var.q;
        this.r = e1Var.r;
        this.s = e1Var.s;
        this.t = e1Var.t;
        this.u = e1Var.u;
        this.v = e1Var.v;
        int[] iArr3 = e1Var.w;
        this.w = Arrays.copyOf(iArr3, iArr3.length);
        this.x = e1Var.x;
        this.y = e1Var.y;
        this.z = e1Var.z;
        this.A.k();
        this.B.k();
        this.C.k();
        this.D.k();
        this.E.k();
        this.F.k();
        this.G.k();
        this.H.k();
        this.K = (b[]) Arrays.copyOf(this.K, 2);
        e1 e1Var2 = null;
        this.L = this.L == null ? null : hashMap.get(e1Var.L);
        this.M = e1Var.M;
        this.N = e1Var.N;
        this.O = e1Var.O;
        this.P = e1Var.P;
        this.Q = e1Var.Q;
        this.R = e1Var.R;
        this.S = e1Var.S;
        this.T = e1Var.T;
        this.U = e1Var.U;
        this.V = e1Var.V;
        this.W = e1Var.W;
        this.X = e1Var.X;
        this.Y = e1Var.Y;
        this.Z = e1Var.Z;
        this.a0 = e1Var.a0;
        this.b0 = e1Var.b0;
        this.c0 = e1Var.c0;
        this.d0 = e1Var.d0;
        this.e0 = e1Var.e0;
        this.f0 = e1Var.f0;
        this.g0 = e1Var.g0;
        this.h0 = e1Var.h0;
        this.i0 = e1Var.i0;
        this.j0 = e1Var.j0;
        this.k0 = e1Var.k0;
        this.l0 = e1Var.l0;
        this.m0 = e1Var.m0;
        this.n0 = e1Var.n0;
        this.o0 = e1Var.o0;
        this.p0 = e1Var.p0;
        this.q0 = e1Var.q0;
        this.r0 = e1Var.r0;
        this.s0 = e1Var.s0;
        this.t0 = e1Var.t0;
        this.u0 = e1Var.u0;
        this.v0 = e1Var.v0;
        float[] fArr = this.w0;
        float[] fArr2 = e1Var.w0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        e1[] e1VarArr = this.x0;
        e1[] e1VarArr2 = e1Var.x0;
        e1VarArr[0] = e1VarArr2[0];
        e1VarArr[1] = e1VarArr2[1];
        e1[] e1VarArr3 = this.y0;
        e1[] e1VarArr4 = e1Var.y0;
        e1VarArr3[0] = e1VarArr4[0];
        e1VarArr3[1] = e1VarArr4[1];
        e1 e1Var3 = e1Var.z0;
        this.z0 = e1Var3 == null ? null : hashMap.get(e1Var3);
        e1 e1Var4 = e1Var.A0;
        if (e1Var4 != null) {
            e1Var2 = hashMap.get(e1Var4);
        }
        this.A0 = e1Var2;
    }

    public void k0(b bVar) {
        this.K[0] = bVar;
    }

    public void l(u0 u0Var) {
        u0Var.q(this.A);
        u0Var.q(this.B);
        u0Var.q(this.C);
        u0Var.q(this.D);
        if (this.W > 0) {
            u0Var.q(this.E);
        }
    }

    public void l0(int i2, int i3, int i4, float f2) {
        this.j = i2;
        this.m = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.n = i4;
        this.o = f2;
        if (f2 > Utils.FLOAT_EPSILON && f2 < 1.0f && this.j == 0) {
            this.j = 2;
        }
    }

    public d1 m(d1.b bVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return this.A;
            case 2:
                return this.B;
            case 3:
                return this.C;
            case 4:
                return this.D;
            case 5:
                return this.E;
            case 6:
                return this.H;
            case 7:
                return this.F;
            case 8:
                return this.G;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public void m0(float f2) {
        this.w0[0] = f2;
    }

    public int n() {
        return this.W;
    }

    public void n0(boolean z2) {
        this.z = z2;
    }

    public float o(int i2) {
        if (i2 == 0) {
            return this.Z;
        }
        if (i2 == 1) {
            return this.a0;
        }
        return -1.0f;
    }

    public void o0(boolean z2) {
    }

    public int p() {
        return R() + this.N;
    }

    public void p0(int i2) {
        this.w[1] = i2;
    }

    public Object q() {
        return this.b0;
    }

    public void q0(int i2) {
        this.w[0] = i2;
    }

    public String r() {
        return this.e0;
    }

    public void r0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.Y = i2;
    }

    public b s(int i2) {
        if (i2 == 0) {
            return y();
        }
        if (i2 == 1) {
            return M();
        }
        return null;
    }

    public void s0(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.X = i2;
    }

    public float t() {
        return this.O;
    }

    public void t0(int i2, int i3) {
        this.Q = i2;
        this.R = i3;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f0 != null) {
            str = "type: " + this.f0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.e0 != null) {
            str2 = "id: " + this.e0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.Q);
        sb.append(", ");
        sb.append(this.R);
        sb.append(") - (");
        sb.append(this.M);
        sb.append(" x ");
        sb.append(this.N);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.P;
    }

    public void u0(e1 e1Var) {
        this.L = e1Var;
    }

    public int v() {
        if (this.d0 == 8) {
            return 0;
        }
        return this.N;
    }

    public void v0(float f2) {
        this.a0 = f2;
    }

    public float w() {
        return this.Z;
    }

    public void w0(int i2) {
        this.t0 = i2;
    }

    public int x() {
        return this.s0;
    }

    public void x0(int i2, int i3) {
        this.R = i2;
        int i4 = i3 - i2;
        this.N = i4;
        int i5 = this.Y;
        if (i4 < i5) {
            this.N = i5;
        }
    }

    public b y() {
        return this.K[0];
    }

    public void y0(b bVar) {
        this.K[1] = bVar;
    }

    public int z() {
        d1 d1Var = this.A;
        int i2 = 0;
        if (d1Var != null) {
            i2 = 0 + d1Var.d;
        }
        d1 d1Var2 = this.C;
        return d1Var2 != null ? i2 + d1Var2.d : i2;
    }

    public void z0(int i2, int i3, int i4, float f2) {
        this.k = i2;
        this.p = i3;
        if (i4 == Integer.MAX_VALUE) {
            i4 = 0;
        }
        this.q = i4;
        this.r = f2;
        if (f2 > Utils.FLOAT_EPSILON && f2 < 1.0f && this.k == 0) {
            this.k = 2;
        }
    }
}
