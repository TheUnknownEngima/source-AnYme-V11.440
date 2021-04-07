package defpackage;

import defpackage.gi1;

/* renamed from: di1  reason: default package */
final class di1 extends gi1 {
    private final String a;
    private final long b;
    private final gi1.b c;

    /* renamed from: di1$b */
    static final class b extends gi1.a {
        private String a;
        private Long b;
        private gi1.b c;

        b() {
        }

        public gi1 a() {
            String str = "";
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new di1(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public gi1.a b(gi1.b bVar) {
            this.c = bVar;
            return this;
        }

        public gi1.a c(String str) {
            this.a = str;
            return this;
        }

        public gi1.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    private di1(String str, long j, gi1.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }

    public gi1.b b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gi1)) {
            return false;
        }
        gi1 gi1 = (gi1) obj;
        String str = this.a;
        if (str != null ? str.equals(gi1.c()) : gi1.c() == null) {
            if (this.b == gi1.d()) {
                gi1.b bVar = this.c;
                gi1.b b2 = gi1.b();
                if (bVar == null) {
                    if (b2 == null) {
                        return true;
                    }
                } else if (bVar.equals(b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        gi1.b bVar = this.c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
