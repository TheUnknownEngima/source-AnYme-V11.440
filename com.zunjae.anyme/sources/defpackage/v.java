package defpackage;

import java.util.concurrent.Executor;

/* renamed from: v  reason: default package */
public class v extends x {
    private static volatile v c;
    private static final Executor d = new a();
    private x a;
    private x b;

    /* renamed from: v$a */
    static class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            v.f().a(runnable);
        }
    }

    private v() {
        w wVar = new w();
        this.b = wVar;
        this.a = wVar;
    }

    public static Executor e() {
        return d;
    }

    public static v f() {
        if (c != null) {
            return c;
        }
        synchronized (v.class) {
            if (c == null) {
                c = new v();
            }
        }
        return c;
    }

    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    public boolean c() {
        return this.a.c();
    }

    public void d(Runnable runnable) {
        this.a.d(runnable);
    }
}
