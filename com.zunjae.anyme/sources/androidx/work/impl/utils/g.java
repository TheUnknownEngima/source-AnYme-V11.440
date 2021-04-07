package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.h;

public class g implements Runnable {
    private h e;
    private String f;
    private WorkerParameters.a g;

    public g(h hVar, String str, WorkerParameters.a aVar) {
        this.e = hVar;
        this.f = str;
        this.g = aVar;
    }

    public void run() {
        this.e.k().g(this.f, this.g);
    }
}
