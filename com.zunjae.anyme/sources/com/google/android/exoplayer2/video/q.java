package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;

public final class q {
    private final WindowManager a;
    private final b b;
    private final a c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private long j;
    private long k;
    private long l;

    @TargetApi(17)
    private final class a implements DisplayManager.DisplayListener {
        private final DisplayManager a;

        public a(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public void a() {
            this.a.registerDisplayListener(this, (Handler) null);
        }

        public void b() {
            this.a.unregisterDisplayListener(this);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                q.this.h();
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    private static final class b implements Choreographer.FrameCallback, Handler.Callback {
        private static final b j = new b();
        public volatile long e = -9223372036854775807L;
        private final Handler f;
        private final HandlerThread g;
        private Choreographer h;
        private int i;

        private b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.g = handlerThread;
            handlerThread.start();
            Handler u = v50.u(this.g.getLooper(), this);
            this.f = u;
            u.sendEmptyMessage(0);
        }

        private void b() {
            int i2 = this.i + 1;
            this.i = i2;
            if (i2 == 1) {
                this.h.postFrameCallback(this);
            }
        }

        private void c() {
            this.h = Choreographer.getInstance();
        }

        public static b d() {
            return j;
        }

        private void f() {
            int i2 = this.i - 1;
            this.i = i2;
            if (i2 == 0) {
                this.h.removeFrameCallback(this);
                this.e = -9223372036854775807L;
            }
        }

        public void a() {
            this.f.sendEmptyMessage(1);
        }

        public void doFrame(long j2) {
            this.e = j2;
            this.h.postFrameCallbackDelayed(this, 500);
        }

        public void e() {
            this.f.sendEmptyMessage(2);
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c();
                return true;
            } else if (i2 == 1) {
                b();
                return true;
            } else if (i2 != 2) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public q(Context context) {
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.a = (WindowManager) context.getSystemService("window");
        } else {
            this.a = null;
        }
        if (this.a != null) {
            this.c = v50.a >= 17 ? g(context) : aVar;
            this.b = b.d();
        } else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }

    private static long c(long j2, long j3, long j4) {
        long j5;
        long j6 = j3 + (((j2 - j3) / j4) * j4);
        if (j2 <= j6) {
            j5 = j6 - j4;
        } else {
            long j7 = j6;
            j6 = j4 + j6;
            j5 = j7;
        }
        return j6 - j2 < j2 - j5 ? j6 : j5;
    }

    private boolean f(long j2, long j3) {
        return Math.abs((j3 - this.j) - (j2 - this.k)) > 20000000;
    }

    @TargetApi(17)
    private a g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    /* access modifiers changed from: private */
    public void h() {
        Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.d = refreshRate;
            this.e = (refreshRate * 80) / 100;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (f(r0, r13) != false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.i
            if (r2 == 0) goto L_0x0041
            long r2 = r10.f
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r10.l
            r4 = 1
            long r2 = r2 + r4
            r10.l = r2
            long r2 = r10.h
            r10.g = r2
        L_0x0019:
            long r2 = r10.l
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r10.k
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.g
            long r2 = r2 + r4
            boolean r4 = r10.f(r2, r13)
            if (r4 == 0) goto L_0x0033
        L_0x0030:
            r10.i = r6
            goto L_0x0041
        L_0x0033:
            long r4 = r10.j
            long r4 = r4 + r2
            long r6 = r10.k
            long r4 = r4 - r6
            goto L_0x0043
        L_0x003a:
            boolean r2 = r10.f(r0, r13)
            if (r2 == 0) goto L_0x0041
            goto L_0x0030
        L_0x0041:
            r4 = r13
            r2 = r0
        L_0x0043:
            boolean r6 = r10.i
            if (r6 != 0) goto L_0x0052
            r10.k = r0
            r10.j = r13
            r13 = 0
            r10.l = r13
            r13 = 1
            r10.i = r13
        L_0x0052:
            r10.f = r11
            r10.h = r2
            com.google.android.exoplayer2.video.q$b r11 = r10.b
            if (r11 == 0) goto L_0x0077
            long r12 = r10.d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0066
            goto L_0x0077
        L_0x0066:
            long r6 = r11.e
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x006d
            return r4
        L_0x006d:
            long r8 = r10.d
            long r11 = c(r4, r6, r8)
            long r13 = r10.e
            long r11 = r11 - r13
            return r11
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.q.b(long, long):long");
    }

    public void d() {
        if (this.a != null) {
            a aVar = this.c;
            if (aVar != null) {
                aVar.b();
            }
            this.b.e();
        }
    }

    public void e() {
        this.i = false;
        if (this.a != null) {
            this.b.a();
            a aVar = this.c;
            if (aVar != null) {
                aVar.a();
            }
            h();
        }
    }
}
