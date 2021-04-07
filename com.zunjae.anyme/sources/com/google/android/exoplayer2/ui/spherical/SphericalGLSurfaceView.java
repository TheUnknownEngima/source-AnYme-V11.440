package com.google.android.exoplayer2.ui.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.WindowManager;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.ui.spherical.d;
import com.google.android.exoplayer2.ui.spherical.h;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class SphericalGLSurfaceView extends GLSurfaceView {
    private final SensorManager e;
    private final Sensor f;
    private final d g;
    private final Handler h;
    private final h i;
    private final f j;
    private SurfaceTexture k;
    private Surface l;
    private r0.c m;
    private boolean n;
    private boolean o;
    private boolean p;

    class a implements GLSurfaceView.Renderer, h.a, d.a {
        private final f e;
        private final float[] f = new float[16];
        private final float[] g = new float[16];
        private final float[] h;
        private final float[] i;
        private final float[] j;
        private float k;
        private float l;
        private final float[] m;
        private final float[] n;

        public a(f fVar) {
            float[] fArr = new float[16];
            this.h = fArr;
            this.i = new float[16];
            this.j = new float[16];
            this.m = new float[16];
            this.n = new float[16];
            this.e = fVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(this.i, 0);
            Matrix.setIdentityM(this.j, 0);
            this.l = 3.1415927f;
        }

        private float c(float f2) {
            if (f2 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f2))) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.i, 0, -this.k, (float) Math.cos((double) this.l), (float) Math.sin((double) this.l), Utils.FLOAT_EPSILON);
        }

        public synchronized void a(float[] fArr, float f2) {
            System.arraycopy(fArr, 0, this.h, 0, this.h.length);
            this.l = -f2;
            d();
        }

        public synchronized void b(PointF pointF) {
            this.k = pointF.y;
            d();
            Matrix.setRotateM(this.j, 0, -pointF.x, Utils.FLOAT_EPSILON, 1.0f, Utils.FLOAT_EPSILON);
        }

        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.n, 0, this.h, 0, this.j, 0);
                Matrix.multiplyMM(this.m, 0, this.i, 0, this.n, 0);
            }
            Matrix.multiplyMM(this.g, 0, this.f, 0, this.m, 0);
            this.e.d(this.g, false);
        }

        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f2 = ((float) i2) / ((float) i3);
            Matrix.perspectiveM(this.f, 0, c(f2), f2, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.d(this.e.e());
        }
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        q40.e(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        this.e = sensorManager;
        Sensor defaultSensor = v50.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f = defaultSensor == null ? this.e.getDefaultSensor(11) : defaultSensor;
        f fVar = new f();
        this.j = fVar;
        a aVar = new a(fVar);
        this.i = new h(context, aVar, 25.0f);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        q40.e(windowManager);
        this.g = new d(windowManager.getDefaultDisplay(), this.i, aVar);
        this.n = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(this.i);
    }

    /* access modifiers changed from: private */
    public void d(SurfaceTexture surfaceTexture) {
        this.h.post(new b(this, surfaceTexture));
    }

    private static void e(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void f() {
        boolean z = this.n && this.o;
        Sensor sensor = this.f;
        if (sensor != null && z != this.p) {
            if (z) {
                this.e.registerListener(this.g, sensor, 0);
            } else {
                this.e.unregisterListener(this.g);
            }
            this.p = z;
        }
    }

    public /* synthetic */ void b() {
        Surface surface = this.l;
        if (surface != null) {
            r0.c cVar = this.m;
            if (cVar != null) {
                cVar.d(surface);
            }
            e(this.k, this.l);
            this.k = null;
            this.l = null;
        }
    }

    public /* synthetic */ void c(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.k;
        Surface surface = this.l;
        this.k = surfaceTexture;
        Surface surface2 = new Surface(surfaceTexture);
        this.l = surface2;
        r0.c cVar = this.m;
        if (cVar != null) {
            cVar.a(surface2);
        }
        e(surfaceTexture2, surface);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.post(new c(this));
    }

    public void onPause() {
        this.o = false;
        f();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.o = true;
        f();
    }

    public void setDefaultStereoMode(int i2) {
        this.j.g(i2);
    }

    public void setSingleTapListener(g gVar) {
        this.i.b(gVar);
    }

    public void setUseSensorRotation(boolean z) {
        this.n = z;
        f();
    }

    public void setVideoComponent(r0.c cVar) {
        r0.c cVar2 = this.m;
        if (cVar != cVar2) {
            if (cVar2 != null) {
                Surface surface = this.l;
                if (surface != null) {
                    cVar2.d(surface);
                }
                this.m.D(this.j);
                this.m.m(this.j);
            }
            this.m = cVar;
            if (cVar != null) {
                cVar.c(this.j);
                this.m.b(this.j);
                this.m.a(this.l);
            }
        }
    }
}
