package defpackage;

import defpackage.ge1;

/* renamed from: de1  reason: default package */
final class de1 extends ge1.d.C0116d.C0127d {
    private final String a;

    /* renamed from: de1$b */
    static final class b extends ge1.d.C0116d.C0127d.a {
        private String a;

        b() {
        }

        public ge1.d.C0116d.C0127d a() {
            String str = "";
            if (this.a == null) {
                str = str + " content";
            }
            if (str.isEmpty()) {
                return new de1(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public ge1.d.C0116d.C0127d.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    private de1(String str) {
        this.a = str;
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ge1.d.C0116d.C0127d) {
            return this.a.equals(((ge1.d.C0116d.C0127d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }
}
