package defpackage;

import java.util.List;

/* renamed from: ls1  reason: default package */
public abstract class ls1 {

    /* renamed from: ls1$a */
    public static final class a extends ls1 {
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
            return "FatalError(exception=" + this.a + ")";
        }
    }

    /* renamed from: ls1$b */
    public static final class b extends ls1 {
        public static final b a = new b();

        private b() {
            super((r62) null);
        }
    }

    /* renamed from: ls1$c */
    public static final class c extends ls1 {
        private final List<ms1> a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<ms1> list) {
            super((r62) null);
            v62.e(list, "addresses");
            this.a = list;
        }

        public final List<ms1> a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && v62.a(this.a, ((c) obj).a);
            }
            return true;
        }

        public int hashCode() {
            List<ms1> list = this.a;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Success(addresses=" + this.a + ")";
        }
    }

    private ls1() {
    }

    public /* synthetic */ ls1(r62 r62) {
        this();
    }
}
