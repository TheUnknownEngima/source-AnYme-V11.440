package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: fd1  reason: default package */
final /* synthetic */ class fd1 implements x71 {
    private final CountDownLatch a;

    private fd1(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public static x71 b(CountDownLatch countDownLatch) {
        return new fd1(countDownLatch);
    }

    public Object a(e81 e81) {
        return this.a.countDown();
    }
}
