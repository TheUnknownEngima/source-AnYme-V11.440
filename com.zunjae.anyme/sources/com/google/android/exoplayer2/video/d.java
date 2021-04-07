package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.t;

/* compiled from: lambda */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ t.a e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;

    public /* synthetic */ d(t.a aVar, String str, long j, long j2) {
        this.e = aVar;
        this.f = str;
        this.g = j;
        this.h = j2;
    }

    public final void run() {
        this.e.f(this.f, this.g, this.h);
    }
}
