package defpackage;

import java.util.Date;

/* renamed from: fx1  reason: default package */
public final class fx1 {
    public static final fx1 a = new fx1();

    private fx1() {
    }

    public final ex1 a(long j) {
        long time = new Date((System.currentTimeMillis() / ((long) 1000)) - j).getTime();
        ex1 ex1 = new ex1();
        Math.abs((int) (time / ((long) 31556926)));
        Math.abs((int) (((double) time) / 2629743.83d));
        ex1.a = Math.abs((int) (time / ((long) 604800)));
        ex1.b = Math.abs((int) (time / ((long) 86400)));
        ex1.c = Math.abs((int) (time / ((long) 3600)));
        ex1.d = Math.abs((int) (time / ((long) 60)));
        Math.abs((int) time);
        return ex1;
    }
}
