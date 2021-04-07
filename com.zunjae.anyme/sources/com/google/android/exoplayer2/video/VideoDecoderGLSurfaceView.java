package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class VideoDecoderGLSurfaceView extends GLSurfaceView {
    private final o e;

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new o(this);
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(this.e);
        setRenderMode(0);
    }

    public n getVideoDecoderOutputBufferRenderer() {
        return this.e;
    }
}
