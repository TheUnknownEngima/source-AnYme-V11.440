package com.zunjae.downloader;

public abstract class h {

    public static final class a extends h {
        private final Exception a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super((r62) null);
            v62.e(exc, "exception");
            this.a = exc;
        }

        public final Exception a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && v62.a(this.a, ((a) obj).a);
            }
            return true;
        }

        public int hashCode() {
            Exception exc = this.a;
            if (exc != null) {
                return exc.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Error(exception=" + this.a + ")";
        }
    }

    public static final class b extends h {
        private final String a;

        public b() {
            this((String) null, 1, (r62) null);
        }

        public b(String str) {
            super((r62) null);
            this.a = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, int i, r62 r62) {
            this((i & 1) != 0 ? null : str);
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
            return "Failure(message=" + this.a + ")";
        }
    }

    public static final class c extends h {
        private final long a;

        public c(long j) {
            super((r62) null);
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && this.a == ((c) obj).a;
            }
            return true;
        }

        public int hashCode() {
            long j = this.a;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            return "Success(id=" + this.a + ")";
        }
    }

    private h() {
    }

    public /* synthetic */ h(r62 r62) {
        this();
    }
}
