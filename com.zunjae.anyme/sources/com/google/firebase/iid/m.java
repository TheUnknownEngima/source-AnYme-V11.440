package com.google.firebase.iid;

import java.util.concurrent.CountDownLatch;

final /* synthetic */ class m implements z71 {
    private final CountDownLatch a;

    m(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void a(e81 e81) {
        this.a.countDown();
    }
}
