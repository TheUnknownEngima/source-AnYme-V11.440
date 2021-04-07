package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.video.t;

/* compiled from: lambda */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ t.a e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ float i;

    public /* synthetic */ c(t.a aVar, int i2, int i3, int i4, float f2) {
        this.e = aVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = f2;
    }

    public final void run() {
        this.e.l(this.f, this.g, this.h, this.i);
    }
}
