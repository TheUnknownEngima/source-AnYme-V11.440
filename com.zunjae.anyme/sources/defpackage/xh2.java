package defpackage;

import java.util.HashSet;

/* renamed from: xh2  reason: default package */
public final class xh2 {
    private final HashSet<sg2<?>> a;
    private final oh2 b;

    public final uh2 a() {
        uh2 uh2 = new uh2(this.b);
        uh2.a().addAll(this.a);
        return uh2;
    }

    public final HashSet<sg2<?>> b() {
        return this.a;
    }

    public final oh2 c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof xh2) && v62.a(this.b, ((xh2) obj).b);
        }
        return true;
    }

    public int hashCode() {
        oh2 oh2 = this.b;
        if (oh2 != null) {
            return oh2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Scope['" + this.b + "']";
    }
}
