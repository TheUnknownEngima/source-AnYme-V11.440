package defpackage;

import defpackage.Cdo;

/* renamed from: tn  reason: default package */
final class tn extends Cdo {
    private final eo a;
    private final String b;
    private final wm<?> c;
    private final ym<?, byte[]> d;
    private final vm e;

    /* renamed from: tn$b */
    static final class b extends Cdo.a {
        private eo a;
        private String b;
        private wm<?> c;
        private ym<?, byte[]> d;
        private vm e;

        b() {
        }

        public Cdo a() {
            String str = "";
            if (this.a == null) {
                str = str + " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new tn(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public Cdo.a b(vm vmVar) {
            if (vmVar != null) {
                this.e = vmVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        public Cdo.a c(wm<?> wmVar) {
            if (wmVar != null) {
                this.c = wmVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public Cdo.a d(ym<?, byte[]> ymVar) {
            if (ymVar != null) {
                this.d = ymVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public Cdo.a e(eo eoVar) {
            if (eoVar != null) {
                this.a = eoVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public Cdo.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    private tn(eo eoVar, String str, wm<?> wmVar, ym<?, byte[]> ymVar, vm vmVar) {
        this.a = eoVar;
        this.b = str;
        this.c = wmVar;
        this.d = ymVar;
        this.e = vmVar;
    }

    public vm b() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public wm<?> c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public ym<?, byte[]> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cdo)) {
            return false;
        }
        Cdo doVar = (Cdo) obj;
        return this.a.equals(doVar.f()) && this.b.equals(doVar.g()) && this.c.equals(doVar.c()) && this.d.equals(doVar.e()) && this.e.equals(doVar.b());
    }

    public eo f() {
        return this.a;
    }

    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
