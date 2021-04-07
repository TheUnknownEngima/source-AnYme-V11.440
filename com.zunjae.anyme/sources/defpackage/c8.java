package defpackage;

/* renamed from: c8  reason: default package */
public class c8 {
    public final String a;
    public final int b;

    public c8(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c8.class != obj.getClass()) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.b != c8Var.b) {
            return false;
        }
        return this.a.equals(c8Var.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
