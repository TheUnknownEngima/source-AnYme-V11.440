package kotlinx.coroutines;

import defpackage.n42;

public final class e0 extends h42 {
    public static final a f = new a((r62) null);
    private final String e;

    public static final class a implements n42.c<e0> {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }
    }

    public final String N() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e0) && v62.a(this.e, ((e0) obj).e);
        }
        return true;
    }

    public int hashCode() {
        String str = this.e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CoroutineName(" + this.e + ')';
    }
}
