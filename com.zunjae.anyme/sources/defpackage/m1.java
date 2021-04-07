package defpackage;

import java.util.ArrayList;

/* renamed from: m1  reason: default package */
public class m1 extends e1 {
    public ArrayList<e1> C0 = new ArrayList<>();

    public ArrayList<e1> I0() {
        return this.C0;
    }

    public void J0() {
        ArrayList<e1> arrayList = this.C0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                e1 e1Var = this.C0.get(i);
                if (e1Var instanceof m1) {
                    ((m1) e1Var).J0();
                }
            }
        }
    }

    public void K0(e1 e1Var) {
        this.C0.remove(e1Var);
        e1Var.u0((e1) null);
    }

    public void L0() {
        this.C0.clear();
    }

    public void X() {
        this.C0.clear();
        super.X();
    }

    public void Z(t0 t0Var) {
        super.Z(t0Var);
        int size = this.C0.size();
        for (int i = 0; i < size; i++) {
            this.C0.get(i).Z(t0Var);
        }
    }

    public void a(e1 e1Var) {
        this.C0.add(e1Var);
        if (e1Var.G() != null) {
            ((m1) e1Var.G()).K0(e1Var);
        }
        e1Var.u0(this);
    }
}
