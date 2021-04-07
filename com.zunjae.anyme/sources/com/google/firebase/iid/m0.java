package com.google.firebase.iid;

import java.io.IOException;

final /* synthetic */ class m0 implements Runnable {
    private final f81 e;

    m0(f81 f81) {
        this.e = f81;
    }

    public final void run() {
        this.e.d(new IOException("TIMEOUT"));
    }
}
