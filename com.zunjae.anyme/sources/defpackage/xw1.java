package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xw1  reason: default package */
public final class xw1 {
    private final long a = System.nanoTime();
    private long b;
    private final String c;

    public xw1(String str) {
        v62.e(str, "tag");
        this.c = str;
    }

    public final void a() {
        long nanoTime = System.nanoTime();
        this.b = nanoTime;
        "The process [" + this.c + "] took " + TimeUnit.NANOSECONDS.toMillis(nanoTime - this.a) + " ms";
    }
}
