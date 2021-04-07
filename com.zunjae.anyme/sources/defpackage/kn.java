package defpackage;

import defpackage.qn;

/* renamed from: kn  reason: default package */
final class kn extends qn {
    private final qn.c a;
    private final qn.b b;

    /* renamed from: kn$b */
    static final class b extends qn.a {
        private qn.c a;
        private qn.b b;

        b() {
        }

        public qn.a a(qn.b bVar) {
            this.b = bVar;
            return this;
        }

        public qn.a b(qn.c cVar) {
            this.a = cVar;
            return this;
        }

        public qn c() {
            return new kn(this.a, this.b, (a) null);
        }
    }

    /* synthetic */ kn(qn.c cVar, qn.b bVar, a aVar) {
        this.a = cVar;
        this.b = bVar;
    }

    public qn.b b() {
        return this.b;
    }

    public qn.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qn)) {
            return false;
        }
        qn.c cVar = this.a;
        if (cVar != null ? cVar.equals(((kn) obj).a) : ((kn) obj).a == null) {
            qn.b bVar = this.b;
            qn.b bVar2 = ((kn) obj).b;
            if (bVar == null) {
                if (bVar2 == null) {
                    return true;
                }
            } else if (bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        qn.c cVar = this.a;
        int i = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        qn.b bVar = this.b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
