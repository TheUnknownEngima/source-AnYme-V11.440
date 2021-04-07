package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class b {
    private final Executor a;
    private final p b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public static final class a {
        Executor a;
        p b;
        int c = 4;
        int d = 0;
        int e = Integer.MAX_VALUE;
        int f = 20;

        public b a() {
            return new b(this);
        }
    }

    b(a aVar) {
        Executor executor = aVar.a;
        this.a = executor == null ? a() : executor;
        p pVar = aVar.b;
        this.b = pVar == null ? p.c() : pVar;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
    }

    private Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    public Executor b() {
        return this.a;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return Build.VERSION.SDK_INT == 23 ? this.f / 2 : this.f;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.c;
    }

    public p g() {
        return this.b;
    }
}
