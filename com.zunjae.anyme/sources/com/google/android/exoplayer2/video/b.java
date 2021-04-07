package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.video.t;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ t.a e;
    public final /* synthetic */ Surface f;

    public /* synthetic */ b(t.a aVar, Surface surface) {
        this.e = aVar;
        this.f = surface;
    }

    public final void run() {
        this.e.k(this.f);
    }
}
