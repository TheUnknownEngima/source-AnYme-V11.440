package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: g81  reason: default package */
public final class g81 {
    public static final Executor a = new a();
    static final Executor b = new z81();

    /* renamed from: g81$a */
    private static final class a implements Executor {
        private final Handler e = new e71(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.e.post(runnable);
        }
    }
}
