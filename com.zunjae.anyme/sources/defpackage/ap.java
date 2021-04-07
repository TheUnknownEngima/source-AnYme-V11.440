package defpackage;

/* renamed from: ap  reason: default package */
final class ap extends hp {
    private final long a;
    private final eo b;
    private final zn c;

    ap(long j, eo eoVar, zn znVar) {
        this.a = j;
        if (eoVar != null) {
            this.b = eoVar;
            if (znVar != null) {
                this.c = znVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public zn b() {
        return this.c;
    }

    public long c() {
        return this.a;
    }

    public eo d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return this.a == hpVar.c() && this.b.equals(hpVar.d()) && this.c.equals(hpVar.b());
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
