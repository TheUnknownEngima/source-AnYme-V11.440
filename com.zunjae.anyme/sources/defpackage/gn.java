package defpackage;

import defpackage.mn;

/* renamed from: gn  reason: default package */
final class gn extends mn {
    private final mn.b a;
    private final cn b;

    /* renamed from: gn$b */
    static final class b extends mn.a {
        private mn.b a;
        private cn b;

        b() {
        }

        public mn.a a(cn cnVar) {
            this.b = cnVar;
            return this;
        }

        public mn.a b(mn.b bVar) {
            this.a = bVar;
            return this;
        }

        public mn c() {
            return new gn(this.a, this.b, (a) null);
        }
    }

    /* synthetic */ gn(mn.b bVar, cn cnVar, a aVar) {
        this.a = bVar;
        this.b = cnVar;
    }

    public cn b() {
        return this.b;
    }

    public mn.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return false;
        }
        mn.b bVar = this.a;
        if (bVar != null ? bVar.equals(((gn) obj).a) : ((gn) obj).a == null) {
            cn cnVar = this.b;
            cn cnVar2 = ((gn) obj).b;
            if (cnVar == null) {
                if (cnVar2 == null) {
                    return true;
                }
            } else if (cnVar.equals(cnVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        mn.b bVar = this.a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        cn cnVar = this.b;
        if (cnVar != null) {
            i = cnVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
