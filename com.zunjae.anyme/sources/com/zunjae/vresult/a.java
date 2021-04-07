package com.zunjae.vresult;

public abstract class a<T> {

    /* renamed from: com.zunjae.vresult.a$a  reason: collision with other inner class name */
    public static final class C0217a extends a {
        public static final C0217a a = new C0217a();

        private C0217a() {
            super((r62) null);
        }
    }

    public static final class b<T> extends a<T> {
        private final Exception a;

        public b(Exception exc) {
            super((r62) null);
            this.a = exc;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && v62.a(this.a, ((b) obj).a);
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

    public static final class c extends a {
        public static final c a = new c();

        private c() {
            super((r62) null);
        }
    }

    public static final class d extends a {
        public static final d a = new d();

        private d() {
            super((r62) null);
        }
    }

    public static final class e<T> extends a<T> {
        private final T a;

        public e(T t) {
            super((r62) null);
            this.a = t;
        }

        public final T b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof e) && v62.a(this.a, ((e) obj).a);
            }
            return true;
        }

        public int hashCode() {
            T t = this.a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Success(response=" + this.a + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(r62 r62) {
        this();
    }

    public final T a() {
        if (this instanceof e) {
            return ((e) this).b();
        }
        return null;
    }
}
