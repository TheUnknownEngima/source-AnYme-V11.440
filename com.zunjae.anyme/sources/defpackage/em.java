package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: em  reason: default package */
public final class em {
    private static final Executor a = new a();
    private static final Executor b = new b();

    /* renamed from: em$a */
    class a implements Executor {
        private final Handler e = new Handler(Looper.getMainLooper());

        a() {
        }

        public void execute(Runnable runnable) {
            this.e.post(runnable);
        }
    }

    /* renamed from: em$b */
    class b implements Executor {
        b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return b;
    }

    public static Executor b() {
        return a;
    }
}
