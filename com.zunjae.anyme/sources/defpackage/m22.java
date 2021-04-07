package defpackage;

import java.io.Serializable;

/* renamed from: m22  reason: default package */
public final class m22<T> implements Serializable {
    public static final a e = new a((r62) null);

    /* renamed from: m22$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }
    }

    /* renamed from: m22$b */
    public static final class b implements Serializable {
        public final Throwable e;

        public b(Throwable th) {
            v62.e(th, "exception");
            this.e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && v62.a(this.e, ((b) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "Failure(" + this.e + ')';
        }
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
