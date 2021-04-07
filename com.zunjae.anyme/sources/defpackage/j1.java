package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: j1  reason: default package */
public class j1 extends e1 implements i1 {
    public e1[] C0 = new e1[4];
    public int D0 = 0;

    public void a(e1 e1Var) {
        int i = this.D0 + 1;
        e1[] e1VarArr = this.C0;
        if (i > e1VarArr.length) {
            this.C0 = (e1[]) Arrays.copyOf(e1VarArr, e1VarArr.length * 2);
        }
        e1[] e1VarArr2 = this.C0;
        int i2 = this.D0;
        e1VarArr2[i2] = e1Var;
        this.D0 = i2 + 1;
    }

    public void b() {
        this.D0 = 0;
        Arrays.fill(this.C0, (Object) null);
    }

    public void c(f1 f1Var) {
    }

    public void k(e1 e1Var, HashMap<e1, e1> hashMap) {
        super.k(e1Var, hashMap);
        j1 j1Var = (j1) e1Var;
        this.D0 = 0;
        int i = j1Var.D0;
        for (int i2 = 0; i2 < i; i2++) {
            a(hashMap.get(j1Var.C0[i2]));
        }
        this.D0 = j1Var.D0;
    }
}
