package androidx.work;

import android.annotation.SuppressLint;

public interface k {
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a = new b.c();
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0067b b = new b.C0067b();

    public static abstract class b {

        public static final class a extends b {
            private final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public Throwable a() {
                return this.a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
            }
        }

        /* renamed from: androidx.work.k$b$b  reason: collision with other inner class name */
        public static final class C0067b extends b {
            private C0067b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }
}
