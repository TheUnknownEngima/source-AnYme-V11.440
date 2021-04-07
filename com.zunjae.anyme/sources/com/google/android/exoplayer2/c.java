package com.google.android.exoplayer2;

import com.google.android.exoplayer2.t;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: lambda */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ CopyOnWriteArrayList e;
    public final /* synthetic */ t.b f;

    public /* synthetic */ c(CopyOnWriteArrayList copyOnWriteArrayList, t.b bVar) {
        this.e = copyOnWriteArrayList;
        this.f = bVar;
    }

    public final void run() {
        c0.g0(this.e, this.f);
    }
}
