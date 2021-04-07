package defpackage;

import defpackage.ge1;

/* renamed from: fe1  reason: default package */
final class fe1 extends ge1.d.f {
    private final String a;

    /* renamed from: fe1$b */
    static final class b extends ge1.d.f.a {
        private String a;

        b() {
        }

        public ge1.d.f a() {
            String str = "";
            if (this.a == null) {
                str = str + " identifier";
            }
            if (str.isEmpty()) {
                return new fe1(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.f.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    private fe1(String str) {
        this.a = str;
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ge1.d.f) {
            return this.a.equals(((ge1.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.a + "}";
    }
}
