package defpackage;

import java.util.HashSet;

/* renamed from: uh2  reason: default package */
public final class uh2 {
    private final HashSet<sg2<?>> a = new HashSet<>();
    private final oh2 b;

    public uh2(oh2 oh2) {
        v62.f(oh2, "qualifier");
        this.b = oh2;
    }

    public final HashSet<sg2<?>> a() {
        return this.a;
    }

    public final oh2 b() {
        return this.b;
    }

    public final void c(sh2 sh2) {
        v62.f(sh2, "instance");
        for (sg2 d : this.a) {
            dh2 d2 = d.d();
            if (d2 != null) {
                d2.e(new fh2((mg2) null, sh2, (o52) null, 5, (r62) null));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof uh2) && v62.a(this.b, ((uh2) obj).b);
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
        return "ScopeDefinition(qualifier=" + this.b + ")";
    }
}
