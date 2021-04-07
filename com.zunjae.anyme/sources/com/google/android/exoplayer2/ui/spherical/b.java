package com.google.android.exoplayer2.ui.spherical;

import android.graphics.SurfaceTexture;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ SphericalGLSurfaceView e;
    public final /* synthetic */ SurfaceTexture f;

    public /* synthetic */ b(SphericalGLSurfaceView sphericalGLSurfaceView, SurfaceTexture surfaceTexture) {
        this.e = sphericalGLSurfaceView;
        this.f = surfaceTexture;
    }

    public final void run() {
        this.e.c(this.f);
    }
}
