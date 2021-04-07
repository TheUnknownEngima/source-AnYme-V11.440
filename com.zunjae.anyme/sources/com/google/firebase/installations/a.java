package com.google.firebase.installations;

import com.google.firebase.installations.l;

final class a extends l {
    private final String a;
    private final long b;
    private final long c;

    static final class b extends l.a {
        private String a;
        private Long b;
        private Long c;

        b() {
        }

        public l a() {
            String str = "";
            if (this.a == null) {
                str = str + " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public l.a c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        public l.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    private a(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public String b() {
        return this.a;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a.equals(lVar.b()) && this.b == lVar.d() && this.c == lVar.c();
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }
}
