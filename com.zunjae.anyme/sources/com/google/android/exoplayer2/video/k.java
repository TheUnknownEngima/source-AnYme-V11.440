package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

@TargetApi(17)
public final class k extends Surface {
    private static int g;
    private static boolean h;
    private final b e;
    private boolean f;

    private static class b extends HandlerThread implements Handler.Callback {
        private v40 e;
        private Handler f;
        private Error g;
        private RuntimeException h;
        private k i;

        public b() {
            super("dummySurface");
        }

        private void b(int i2) {
            q40.e(this.e);
            this.e.h(i2);
            this.i = new k(this, this.e.g(), i2 != 0);
        }

        private void d() {
            q40.e(this.e);
            this.e.i();
        }

        public k a(int i2) {
            boolean z;
            start();
            this.f = new Handler(getLooper(), this);
            this.e = new v40(this.f);
            synchronized (this) {
                z = false;
                this.f.obtainMessage(1, i2, 0).sendToTarget();
                while (this.i == null && this.h == null && this.g == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.h;
            if (runtimeException == null) {
                Error error = this.g;
                if (error == null) {
                    k kVar = this.i;
                    q40.e(kVar);
                    return kVar;
                }
                throw error;
            }
            throw runtimeException;
        }

        public void c() {
            q40.e(this.f);
            this.f.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    b50.d("DummySurface", "Failed to initialize dummy surface", e2);
                    this.h = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e3) {
                    try {
                        b50.d("DummySurface", "Failed to initialize dummy surface", e3);
                        this.g = e3;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i2 != 2) {
                return true;
            } else {
                try {
                    d();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    private k(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.e = bVar;
    }

    private static void a() {
        if (v50.a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    private static int b(Context context) {
        if (z40.h(context)) {
            return z40.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        boolean z;
        synchronized (k.class) {
            z = true;
            if (!h) {
                g = b(context);
                h = true;
            }
            if (g == 0) {
                z = false;
            }
        }
        return z;
    }

    public static k d(Context context, boolean z) {
        a();
        int i = 0;
        q40.f(!z || c(context));
        b bVar = new b();
        if (z) {
            i = g;
        }
        return bVar.a(i);
    }

    public void release() {
        super.release();
        synchronized (this.e) {
            if (!this.f) {
                this.e.c();
                this.f = true;
            }
        }
    }
}
