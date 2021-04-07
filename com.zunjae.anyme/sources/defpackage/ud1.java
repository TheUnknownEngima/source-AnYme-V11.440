package defpackage;

import defpackage.ge1;

/* renamed from: ud1  reason: default package */
final class ud1 extends ge1.d.C0116d {
    private final long a;
    private final String b;
    private final ge1.d.C0116d.a c;
    private final ge1.d.C0116d.c d;
    private final ge1.d.C0116d.C0127d e;

    /* renamed from: ud1$b */
    static final class b extends ge1.d.C0116d.b {
        private Long a;
        private String b;
        private ge1.d.C0116d.a c;
        private ge1.d.C0116d.c d;
        private ge1.d.C0116d.C0127d e;

        b() {
        }

        private b(ge1.d.C0116d dVar) {
            this.a = Long.valueOf(dVar.e());
            this.b = dVar.f();
            this.c = dVar.b();
            this.d = dVar.c();
            this.e = dVar.d();
        }

        public ge1.d.C0116d a() {
            String str = "";
            if (this.a == null) {
                str = str + " timestamp";
            }
            if (this.b == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " app";
            }
            if (this.d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new ud1(this.a.longValue(), this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.b b(ge1.d.C0116d.a aVar) {
            if (aVar != null) {
                this.c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public ge1.d.C0116d.b c(ge1.d.C0116d.c cVar) {
            if (cVar != null) {
                this.d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        public ge1.d.C0116d.b d(ge1.d.C0116d.C0127d dVar) {
            this.e = dVar;
            return this;
        }

        public ge1.d.C0116d.b e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        public ge1.d.C0116d.b f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    private ud1(long j, String str, ge1.d.C0116d.a aVar, ge1.d.C0116d.c cVar, ge1.d.C0116d.C0127d dVar) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = dVar;
    }

    public ge1.d.C0116d.a b() {
        return this.c;
    }

    public ge1.d.C0116d.c c() {
        return this.d;
    }

    public ge1.d.C0116d.C0127d d() {
        return this.e;
    }

    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ge1.d.C0116d)) {
            return false;
        }
        ge1.d.C0116d dVar = (ge1.d.C0116d) obj;
        if (this.a == dVar.e() && this.b.equals(dVar.f()) && this.c.equals(dVar.b()) && this.d.equals(dVar.c())) {
            ge1.d.C0116d.C0127d dVar2 = this.e;
            ge1.d.C0116d.C0127d d2 = dVar.d();
            if (dVar2 == null) {
                if (d2 == null) {
                    return true;
                }
            } else if (dVar2.equals(d2)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.b;
    }

    public ge1.d.C0116d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        ge1.d.C0116d.C0127d dVar = this.e;
        return (dVar == null ? 0 : dVar.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }
}
