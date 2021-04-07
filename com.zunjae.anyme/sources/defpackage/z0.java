package defpackage;

import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: z0  reason: default package */
public class z0 {
    private static int m = 1;
    public boolean a;
    private String b;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public float f;
    float[] g = new float[8];
    float[] h = new float[8];
    a i;
    s0[] j = new s0[8];
    int k = 0;
    public int l = 0;

    /* renamed from: z0$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public z0(a aVar, String str) {
        this.i = aVar;
    }

    static void b() {
        m++;
    }

    public final void a(s0 s0Var) {
        int i2 = 0;
        while (true) {
            int i3 = this.k;
            if (i2 >= i3) {
                s0[] s0VarArr = this.j;
                if (i3 >= s0VarArr.length) {
                    this.j = (s0[]) Arrays.copyOf(s0VarArr, s0VarArr.length * 2);
                }
                s0[] s0VarArr2 = this.j;
                int i4 = this.k;
                s0VarArr2[i4] = s0Var;
                this.k = i4 + 1;
                return;
            } else if (this.j[i2] != s0Var) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void c(s0 s0Var) {
        int i2 = this.k;
        int i3 = 0;
        while (i3 < i2) {
            if (this.j[i3] == s0Var) {
                while (i3 < i2 - 1) {
                    s0[] s0VarArr = this.j;
                    int i4 = i3 + 1;
                    s0VarArr[i3] = s0VarArr[i4];
                    i3 = i4;
                }
                this.k--;
                return;
            }
            i3++;
        }
    }

    public void d() {
        this.b = null;
        this.i = a.UNKNOWN;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = Utils.FLOAT_EPSILON;
        this.k = 0;
        this.l = 0;
        this.a = false;
        Arrays.fill(this.h, Utils.FLOAT_EPSILON);
    }

    public void e(a aVar, String str) {
        this.i = aVar;
    }

    public final void f(s0 s0Var) {
        int i2 = this.k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.j[i3].y(s0Var, false);
        }
        this.k = 0;
    }

    public String toString() {
        return "" + this.b;
    }
}
