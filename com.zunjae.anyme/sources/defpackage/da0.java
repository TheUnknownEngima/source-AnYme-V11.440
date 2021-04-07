package defpackage;

import androidx.mediarouter.media.g;

/* renamed from: da0  reason: default package */
final /* synthetic */ class da0 implements Runnable {
    private final aa0 e;
    private final g f;
    private final int g;

    da0(aa0 aa0, g gVar, int i) {
        this.e = aa0;
        this.f = gVar;
        this.g = i;
    }

    public final void run() {
        this.e.u3(this.f, this.g);
    }
}
