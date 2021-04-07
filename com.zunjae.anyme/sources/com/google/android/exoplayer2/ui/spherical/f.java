package com.google.android.exoplayer2.ui.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.video.p;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

final class f implements p, x50 {
    private final AtomicBoolean a = new AtomicBoolean();
    private final AtomicBoolean b = new AtomicBoolean(true);
    private final e c = new e();
    private final z50 d = new z50();
    private final r50<Long> e = new r50<>();
    private final r50<a60> f = new r50<>();
    private final float[] g = new float[16];
    private final float[] h = new float[16];
    private int i;
    private SurfaceTexture j;
    private volatile int k = 0;
    private int l = -1;
    private byte[] m;

    private void h(byte[] bArr, int i2, long j2) {
        byte[] bArr2 = this.m;
        int i3 = this.l;
        this.m = bArr;
        if (i2 == -1) {
            i2 = this.k;
        }
        this.l = i2;
        if (i3 != i2 || !Arrays.equals(bArr2, this.m)) {
            a60 a60 = null;
            byte[] bArr3 = this.m;
            if (bArr3 != null) {
                a60 = b60.a(bArr3, this.l);
            }
            if (a60 == null || !e.c(a60)) {
                a60 = a60.b(this.l);
            }
            this.f.a(j2, a60);
        }
    }

    public void a(long j2, float[] fArr) {
        this.d.e(j2, fArr);
    }

    public void b() {
        this.e.c();
        this.d.d();
        this.b.set(true);
    }

    public void c(long j2, long j3, f0 f0Var, MediaFormat mediaFormat) {
        this.e.a(j3, Long.valueOf(j2));
        h(f0Var.x, f0Var.w, j3);
    }

    public void d(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        z40.b();
        if (this.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.j;
            q40.e(surfaceTexture);
            surfaceTexture.updateTexImage();
            z40.b();
            if (this.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.g, 0);
            }
            long timestamp = this.j.getTimestamp();
            Long g2 = this.e.g(timestamp);
            if (g2 != null) {
                this.d.c(this.g, g2.longValue());
            }
            a60 i2 = this.f.i(timestamp);
            if (i2 != null) {
                this.c.d(i2);
            }
        }
        Matrix.multiplyMM(this.h, 0, fArr, 0, this.g, 0);
        this.c.a(this.i, this.h, z);
    }

    public SurfaceTexture e() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        z40.b();
        this.c.b();
        z40.b();
        this.i = z40.g();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.i);
        this.j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new a(this));
        return this.j;
    }

    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        this.a.set(true);
    }

    public void g(int i2) {
        this.k = i2;
    }
}
