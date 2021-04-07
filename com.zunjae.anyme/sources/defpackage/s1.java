package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: s1  reason: default package */
public class s1 implements q1 {
    public q1 a = null;
    public boolean b = false;
    public boolean c = false;
    z1 d;
    a e = a.UNKNOWN;
    int f;
    public int g;
    int h = 1;
    t1 i = null;
    public boolean j = false;
    List<q1> k = new ArrayList();
    List<s1> l = new ArrayList();

    /* renamed from: s1$a */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public s1(z1 z1Var) {
        this.d = z1Var;
    }

    public void a(q1 q1Var) {
        for (s1 s1Var : this.l) {
            if (!s1Var.j) {
                return;
            }
        }
        this.c = true;
        q1 q1Var2 = this.a;
        if (q1Var2 != null) {
            q1Var2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        s1 s1Var2 = null;
        int i2 = 0;
        for (s1 next : this.l) {
            if (!(next instanceof t1)) {
                i2++;
                s1Var2 = next;
            }
        }
        if (s1Var2 != null && i2 == 1 && s1Var2.j) {
            t1 t1Var = this.i;
            if (t1Var != null) {
                if (t1Var.j) {
                    this.f = this.h * t1Var.g;
                } else {
                    return;
                }
            }
            d(s1Var2.g + this.f);
        }
        q1 q1Var3 = this.a;
        if (q1Var3 != null) {
            q1Var3.a(this);
        }
    }

    public void b(q1 q1Var) {
        this.k.add(q1Var);
        if (this.j) {
            q1Var.a(q1Var);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i2) {
        if (!this.j) {
            this.j = true;
            this.g = i2;
            for (q1 next : this.k) {
                next.a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.r());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
