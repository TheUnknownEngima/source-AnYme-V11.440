package defpackage;

/* renamed from: vg2  reason: default package */
public final class vg2 {
    private boolean a;
    private boolean b;

    public vg2() {
        this(false, false, 3, (r62) null);
    }

    public vg2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg2(boolean z, boolean z2, int i, r62 r62) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final void c(boolean z) {
        this.a = z;
    }

    public final void d(boolean z) {
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vg2) {
                vg2 vg2 = (vg2) obj;
                if (this.a == vg2.a) {
                    if (this.b == vg2.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        return "Options(isCreatedAtStart=" + this.a + ", override=" + this.b + ")";
    }
}
