package com.google.android.exoplayer2.ui.spherical;

import android.graphics.SurfaceTexture;

/* compiled from: lambda */
public final /* synthetic */ class a implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ f e;

    public /* synthetic */ a(f fVar) {
        this.e = fVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.e.f(surfaceTexture);
    }
}
