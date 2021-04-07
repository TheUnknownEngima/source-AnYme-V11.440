package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: ee2  reason: default package */
public class ee2 {
    public static final ee2 d = new a();
    private boolean a;
    private long b;
    private long c;

    /* renamed from: ee2$a */
    class a extends ee2 {
        a() {
        }

        public ee2 d(long j) {
            return this;
        }

        public void f() {
        }

        public ee2 g(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    public ee2 a() {
        this.a = false;
        return this;
    }

    public ee2 b() {
        this.c = 0;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public ee2 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public ee2 g(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit != null) {
            this.c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long h() {
        return this.c;
    }
}
