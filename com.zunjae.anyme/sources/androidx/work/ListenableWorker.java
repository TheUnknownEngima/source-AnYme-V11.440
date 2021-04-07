package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {
    private Context e;
    private WorkerParameters f;
    private boolean g;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0062a extends a {
            private final e a;

            public C0062a() {
                this(e.c);
            }

            public C0062a(e eVar) {
                this.a = eVar;
            }

            public e e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0062a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0062a) obj).a);
            }

            public int hashCode() {
                return (C0062a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            private final e a;

            public c() {
                this(e.c);
            }

            public c(e eVar) {
                this.a = eVar;
            }

            public e e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }
        }

        a() {
        }

        public static a a() {
            return new C0062a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(e eVar) {
            return new c(eVar);
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.e = context;
            this.f = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context a() {
        return this.e;
    }

    public Executor c() {
        return this.f.a();
    }

    public final UUID d() {
        return this.f.b();
    }

    public final e f() {
        return this.f.c();
    }

    public s8 g() {
        return this.f.d();
    }

    public p h() {
        return this.f.e();
    }

    public final boolean i() {
        return this.g;
    }

    public void j() {
    }

    public final void k() {
        this.g = true;
    }

    public abstract db1<a> l();

    public final void n() {
        j();
    }
}
