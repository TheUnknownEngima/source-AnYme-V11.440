package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.t;

/* compiled from: lambda */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ t.a e;
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    public /* synthetic */ g(t.a aVar, int i, long j) {
        this.e = aVar;
        this.f = i;
        this.g = j;
    }

    public final void run() {
        this.e.h(this.f, this.g);
    }
}
