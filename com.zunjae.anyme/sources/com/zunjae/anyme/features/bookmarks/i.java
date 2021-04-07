package com.zunjae.anyme.features.bookmarks;

import java.util.List;

public abstract class i {

    public static final class a extends i {
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

    public static final class b extends i {
        public static final b a = new b();

        private b() {
            super((r62) null);
        }
    }

    public static final class c extends i {
        private final List<c> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<c> list) {
            super((r62) null);
            v62.e(list, "data");
            this.a = list;
        }

        public final List<c> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && v62.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<c> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Success(data=" + this.a + ")";
        }
    }

    private i() {
    }

    public /* synthetic */ i(r62 r62) {
        this();
    }
}
