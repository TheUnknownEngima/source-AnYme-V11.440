package defpackage;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

@TargetApi(17)
/* renamed from: v40  reason: default package */
public final class v40 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    private static final int[] l = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private final Handler e;
    private final int[] f;
    private final c g;
    private EGLDisplay h;
    private EGLContext i;
    private EGLSurface j;
    private SurfaceTexture k;

    /* renamed from: v40$b */
    public static final class b extends RuntimeException {
        private b(String str) {
            super(str);
        }
    }

    /* renamed from: v40$c */
    public interface c {
        void a();
    }

    public v40(Handler handler) {
        this(handler, (c) null);
    }

    public v40(Handler handler, c cVar) {
        this.e = handler;
        this.g = cVar;
        this.f = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, l, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new b(v50.w("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i2) {
        EGLSurface eGLSurface;
        if (i2 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    private void d() {
        c cVar = this.g;
        if (cVar != null) {
            cVar.a();
        }
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        z40.b();
    }

    private static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new b("eglInitialize failed");
        }
        throw new b("eglGetDisplay failed");
    }

    public SurfaceTexture g() {
        SurfaceTexture surfaceTexture = this.k;
        q40.e(surfaceTexture);
        return surfaceTexture;
    }

    public void h(int i2) {
        EGLDisplay f2 = f();
        this.h = f2;
        EGLConfig a2 = a(f2);
        EGLContext b2 = b(this.h, a2, i2);
        this.i = b2;
        this.j = c(this.h, a2, b2, i2);
        e(this.f);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f[0]);
        this.k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.e.removeCallbacks(this);
        try {
            if (this.k != null) {
                this.k.release();
                GLES20.glDeleteTextures(1, this.f, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.h;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.h;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.j;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.h, this.j);
            }
            EGLContext eGLContext = this.i;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.h, eGLContext);
            }
            if (v50.a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.h;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.h);
            }
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.e.post(this);
    }

    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.k;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
