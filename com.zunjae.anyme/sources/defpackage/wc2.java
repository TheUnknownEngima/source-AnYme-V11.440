package defpackage;

import java.io.IOException;

/* renamed from: wc2  reason: default package */
public final class wc2 extends IOException {
    public final kc2 e;

    public wc2(kc2 kc2) {
        super("stream was reset: " + kc2);
        this.e = kc2;
    }
}
