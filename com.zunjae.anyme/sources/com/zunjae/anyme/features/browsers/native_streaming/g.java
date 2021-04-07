package com.zunjae.anyme.features.browsers.native_streaming;

public abstract class g {

    public static final class a extends g {
        public static final a a = new a();

        private a() {
            super((r62) null);
        }
    }

    public static final class b extends g {
        private final String a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((r62) null);
            v62.e(str, "query");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && v62.a(this.a, ((b) obj).a);
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Query(query=" + this.a + ")";
        }
    }

    private g() {
    }

    public /* synthetic */ g(r62 r62) {
        this();
    }
}
