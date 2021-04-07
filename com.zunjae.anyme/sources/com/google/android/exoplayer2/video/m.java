package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.video.t;
import defpackage.wx;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public class m extends ux {
    private static final int[] n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean o1;
    private static boolean p1;
    private final q A0;
    private final t.a B0;
    private final long C0;
    private final int D0;
    private final boolean E0 = h1();
    private final long[] F0 = new long[10];
    private final long[] G0 = new long[10];
    private a H0;
    private boolean I0;
    private boolean J0;
    private Surface K0;
    private Surface L0;
    private int M0 = 1;
    private boolean N0;
    private long O0;
    private long P0 = -9223372036854775807L;
    private long Q0;
    private int R0;
    private int S0;
    private int T0;
    private long U0;
    private int V0;
    private float W0 = -1.0f;
    private MediaFormat X0;
    private int Y0 = -1;
    private int Z0 = -1;
    private int a1;
    private float b1 = -1.0f;
    private int c1;
    private int d1;
    private int e1;
    private float f1;
    private boolean g1;
    private int h1;
    b i1;
    private long j1 = -9223372036854775807L;
    private long k1 = -9223372036854775807L;
    private int l1;
    private p m1;
    private final Context z0;

    protected static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    @TargetApi(23)
    private final class b implements MediaCodec.OnFrameRenderedListener, Handler.Callback {
        private final Handler e;

        public b(MediaCodec mediaCodec) {
            Handler handler = new Handler(this);
            this.e = handler;
            mediaCodec.setOnFrameRenderedListener(this, handler);
        }

        private void a(long j) {
            m mVar = m.this;
            if (this == mVar.i1) {
                if (j == Long.MAX_VALUE) {
                    mVar.z1();
                } else {
                    mVar.y1(j);
                }
            }
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(v50.F0(message.arg1, message.arg2));
            return true;
        }

        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (v50.a < 30) {
                this.e.sendMessageAtFrontOfQueue(Message.obtain(this.e, 0, (int) (j >> 32), (int) j));
                return;
            }
            a(j);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    public m(Context context, vx vxVar, long j, rs<vs> rsVar, boolean z, boolean z2, Handler handler, t tVar, int i) {
        super(2, vxVar, rsVar, z, z2, 30.0f);
        this.C0 = j;
        this.D0 = i;
        Context applicationContext = context.getApplicationContext();
        this.z0 = applicationContext;
        this.A0 = new q(applicationContext);
        this.B0 = new t.a(handler, tVar);
        e1();
    }

    private void A1(MediaCodec mediaCodec, int i, int i2) {
        this.Y0 = i;
        this.Z0 = i2;
        this.b1 = this.W0;
        if (v50.a >= 21) {
            int i3 = this.V0;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.Y0;
                this.Y0 = this.Z0;
                this.Z0 = i4;
                this.b1 = 1.0f / this.b1;
            }
        } else {
            this.a1 = this.V0;
        }
        mediaCodec.setVideoScalingMode(this.M0);
    }

    @TargetApi(29)
    private static void D1(MediaCodec mediaCodec, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodec.setParameters(bundle);
    }

    private void E1() {
        this.P0 = this.C0 > 0 ? SystemClock.elapsedRealtime() + this.C0 : -9223372036854775807L;
    }

    @TargetApi(23)
    private static void F1(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    private void G1(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.L0;
            if (surface2 != null) {
                surface = surface2;
            } else {
                tx l0 = l0();
                if (l0 != null && K1(l0)) {
                    surface = k.d(this.z0, l0.f);
                    this.L0 = surface;
                }
            }
        }
        if (this.K0 != surface) {
            this.K0 = surface;
            int state = getState();
            MediaCodec j0 = j0();
            if (j0 != null) {
                if (v50.a < 23 || surface == null || this.I0) {
                    N0();
                    z0();
                } else {
                    F1(j0, surface);
                }
            }
            if (surface == null || surface == this.L0) {
                e1();
                d1();
                return;
            }
            w1();
            d1();
            if (state == 2) {
                E1();
            }
        } else if (surface != null && surface != this.L0) {
            w1();
            v1();
        }
    }

    private boolean K1(tx txVar) {
        return v50.a >= 23 && !this.g1 && !f1(txVar.a) && (!txVar.f || k.c(this.z0));
    }

    private void d1() {
        MediaCodec j0;
        this.N0 = false;
        if (v50.a >= 23 && this.g1 && (j0 = j0()) != null) {
            this.i1 = new b(j0);
        }
    }

    private void e1() {
        this.c1 = -1;
        this.d1 = -1;
        this.f1 = -1.0f;
        this.e1 = -1;
    }

    @TargetApi(21)
    private static void g1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    private static boolean h1() {
        return "NVIDIA".equals(v50.c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int j1(defpackage.tx r7, java.lang.String r8, int r9, int r10) {
        /*
            r0 = -1
            if (r9 == r0) goto L_0x00a9
            if (r10 != r0) goto L_0x0007
            goto L_0x00a9
        L_0x0007:
            int r1 = r8.hashCode()
            r2 = 5
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            switch(r1) {
                case -1664118616: goto L_0x0046;
                case -1662541442: goto L_0x003c;
                case 1187890754: goto L_0x0032;
                case 1331836730: goto L_0x0028;
                case 1599127256: goto L_0x001e;
                case 1599127257: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 5
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 3
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "video/avc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 2
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "video/mp4v-es"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 1
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "video/hevc"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 4
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "video/3gpp"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0050
            r8 = 0
            goto L_0x0051
        L_0x0050:
            r8 = -1
        L_0x0051:
            if (r8 == 0) goto L_0x00a0
            if (r8 == r3) goto L_0x00a0
            if (r8 == r6) goto L_0x0061
            if (r8 == r5) goto L_0x00a0
            if (r8 == r4) goto L_0x005e
            if (r8 == r2) goto L_0x005e
            return r0
        L_0x005e:
            int r9 = r9 * r10
            goto L_0x00a3
        L_0x0061:
            java.lang.String r8 = defpackage.v50.d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x009f
            java.lang.String r8 = defpackage.v50.c
            java.lang.String r1 = "Amazon"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x008e
            java.lang.String r8 = defpackage.v50.d
            java.lang.String r1 = "KFSOWI"
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x009f
            java.lang.String r8 = defpackage.v50.d
            java.lang.String r1 = "AFTS"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x008e
            boolean r7 = r7.f
            if (r7 == 0) goto L_0x008e
            goto L_0x009f
        L_0x008e:
            r7 = 16
            int r8 = defpackage.v50.i(r9, r7)
            int r9 = defpackage.v50.i(r10, r7)
            int r8 = r8 * r9
            int r8 = r8 * 16
            int r9 = r8 * 16
            goto L_0x00a2
        L_0x009f:
            return r0
        L_0x00a0:
            int r9 = r9 * r10
        L_0x00a2:
            r4 = 2
        L_0x00a3:
            int r9 = r9 * 3
            int r4 = r4 * 2
            int r9 = r9 / r4
            return r9
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.m.j1(tx, java.lang.String, int, int):int");
    }

    private static Point k1(tx txVar, f0 f0Var) {
        boolean z = f0Var.s > f0Var.r;
        int i = z ? f0Var.s : f0Var.r;
        int i2 = z ? f0Var.r : f0Var.s;
        float f = ((float) i2) / ((float) i);
        for (int i3 : n1) {
            int i4 = (int) (((float) i3) * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (v50.a >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point b2 = txVar.b(i5, i3);
                if (txVar.t(b2.x, b2.y, (double) f0Var.t)) {
                    return b2;
                }
            } else {
                try {
                    int i6 = v50.i(i3, 16) * 16;
                    int i7 = v50.i(i4, 16) * 16;
                    if (i6 * i7 <= wx.D()) {
                        int i8 = z ? i7 : i6;
                        if (!z) {
                            i6 = i7;
                        }
                        return new Point(i8, i6);
                    }
                } catch (wx.c unused) {
                }
            }
        }
        return null;
    }

    private static List<tx> m1(vx vxVar, f0 f0Var, boolean z, boolean z2) {
        Pair<Integer, Integer> h;
        String str;
        String str2 = f0Var.m;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<tx> l = wx.l(vxVar.b(str2, z, z2), f0Var);
        if ("video/dolby-vision".equals(str2) && (h = wx.h(f0Var)) != null) {
            int intValue = ((Integer) h.first).intValue();
            if (intValue == 16 || intValue == 256) {
                str = "video/hevc";
            } else if (intValue == 512) {
                str = "video/avc";
            }
            l.addAll(vxVar.b(str, z, z2));
        }
        return Collections.unmodifiableList(l);
    }

    private static int n1(tx txVar, f0 f0Var) {
        if (f0Var.n == -1) {
            return j1(txVar, f0Var.m, f0Var.r, f0Var.s);
        }
        int size = f0Var.o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += f0Var.o.get(i2).length;
        }
        return f0Var.n + i;
    }

    private static boolean p1(long j) {
        return j < -30000;
    }

    private static boolean q1(long j) {
        return j < -500000;
    }

    private void s1() {
        if (this.R0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.B0.c(this.R0, elapsedRealtime - this.Q0);
            this.R0 = 0;
            this.Q0 = elapsedRealtime;
        }
    }

    private void u1() {
        if (this.Y0 != -1 || this.Z0 != -1) {
            if (this.c1 != this.Y0 || this.d1 != this.Z0 || this.e1 != this.a1 || this.f1 != this.b1) {
                this.B0.n(this.Y0, this.Z0, this.a1, this.b1);
                this.c1 = this.Y0;
                this.d1 = this.Z0;
                this.e1 = this.a1;
                this.f1 = this.b1;
            }
        }
    }

    private void v1() {
        if (this.N0) {
            this.B0.m(this.K0);
        }
    }

    private void w1() {
        if (this.c1 != -1 || this.d1 != -1) {
            this.B0.n(this.c1, this.d1, this.e1, this.f1);
        }
    }

    private void x1(long j, long j2, f0 f0Var, MediaFormat mediaFormat) {
        p pVar = this.m1;
        if (pVar != null) {
            pVar.c(j, j2, f0Var, mediaFormat);
        }
    }

    /* access modifiers changed from: private */
    public void z1() {
        T0();
    }

    /* access modifiers changed from: protected */
    public void B1(MediaCodec mediaCodec, int i, long j) {
        u1();
        t50.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        t50.c();
        this.U0 = SystemClock.elapsedRealtime() * 1000;
        this.x0.e++;
        this.S0 = 0;
        t1();
    }

    /* access modifiers changed from: protected */
    public void C0(String str, long j, long j2) {
        this.B0.a(str, j, j2);
        this.I0 = f1(str);
        tx l0 = l0();
        q40.e(l0);
        this.J0 = l0.m();
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void C1(MediaCodec mediaCodec, int i, long j, long j2) {
        u1();
        t50.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        t50.c();
        this.U0 = SystemClock.elapsedRealtime() * 1000;
        this.x0.e++;
        this.S0 = 0;
        t1();
    }

    /* access modifiers changed from: protected */
    public void D0(g0 g0Var) {
        super.D0(g0Var);
        f0 f0Var = g0Var.c;
        this.B0.e(f0Var);
        this.W0 = f0Var.v;
        this.V0 = f0Var.u;
    }

    /* access modifiers changed from: protected */
    public void E0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.X0 = mediaFormat;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        A1(mediaCodec, z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width"), z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height"));
    }

    /* access modifiers changed from: protected */
    public void F0(long j) {
        if (!this.g1) {
            this.T0--;
        }
        while (true) {
            int i = this.l1;
            if (i != 0 && j >= this.G0[0]) {
                long[] jArr = this.F0;
                this.k1 = jArr[0];
                int i2 = i - 1;
                this.l1 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.G0;
                System.arraycopy(jArr2, 1, jArr2, 0, this.l1);
                d1();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
        this.j1 = -9223372036854775807L;
        this.k1 = -9223372036854775807L;
        this.l1 = 0;
        this.X0 = null;
        e1();
        d1();
        this.A0.d();
        this.i1 = null;
        try {
            super.G();
        } finally {
            this.B0.b(this.x0);
        }
    }

    /* access modifiers changed from: protected */
    public void G0(as asVar) {
        if (!this.g1) {
            this.T0++;
        }
        this.j1 = Math.max(asVar.h, this.j1);
        if (v50.a < 23 && this.g1) {
            y1(asVar.h);
        }
    }

    /* access modifiers changed from: protected */
    public void H(boolean z) {
        super.H(z);
        int i = this.h1;
        int i2 = A().a;
        this.h1 = i2;
        this.g1 = i2 != 0;
        if (this.h1 != i) {
            N0();
        }
        this.B0.d(this.x0);
        this.A0.e();
    }

    /* access modifiers changed from: protected */
    public boolean H1(long j, long j2, boolean z) {
        return q1(j) && !z;
    }

    /* access modifiers changed from: protected */
    public void I(long j, boolean z) {
        super.I(j, z);
        d1();
        this.O0 = -9223372036854775807L;
        this.S0 = 0;
        this.j1 = -9223372036854775807L;
        int i = this.l1;
        if (i != 0) {
            this.k1 = this.F0[i - 1];
            this.l1 = 0;
        }
        if (z) {
            E1();
        } else {
            this.P0 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    public boolean I0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, f0 f0Var) {
        long j4 = j;
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j5 = j3;
        if (this.O0 == -9223372036854775807L) {
            this.O0 = j4;
        }
        long j6 = j5 - this.k1;
        if (!z || z2) {
            long j7 = j5 - j4;
            if (this.K0 != this.L0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                long j8 = elapsedRealtime - this.U0;
                long j9 = elapsedRealtime;
                boolean z3 = getState() == 2;
                if (this.P0 == -9223372036854775807L && j4 >= this.k1 && (!this.N0 || (z3 && J1(j7, j8)))) {
                    long nanoTime = System.nanoTime();
                    x1(j6, nanoTime, f0Var, this.X0);
                    if (v50.a >= 21) {
                        C1(mediaCodec, i, j6, nanoTime);
                        return true;
                    }
                    B1(mediaCodec2, i3, j6);
                    return true;
                }
                if (z3 && j4 != this.O0) {
                    long nanoTime2 = System.nanoTime();
                    long b2 = this.A0.b(j3, ((j7 - (j9 - j2)) * 1000) + nanoTime2);
                    long j10 = (b2 - nanoTime2) / 1000;
                    boolean z4 = this.P0 != -9223372036854775807L;
                    if (H1(j10, j2, z2) && r1(mediaCodec, i, j6, j, z4)) {
                        return false;
                    }
                    if (I1(j10, j2, z2)) {
                        if (z4) {
                            L1(mediaCodec2, i3, j6);
                            return true;
                        }
                        i1(mediaCodec2, i3, j6);
                        return true;
                    } else if (v50.a >= 21) {
                        if (j10 < 50000) {
                            x1(j6, b2, f0Var, this.X0);
                            C1(mediaCodec, i, j6, b2);
                            return true;
                        }
                    } else if (j10 < 30000) {
                        if (j10 > 11000) {
                            try {
                                Thread.sleep((j10 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        x1(j6, b2, f0Var, this.X0);
                        B1(mediaCodec2, i3, j6);
                        return true;
                    }
                }
                return false;
            } else if (!p1(j7)) {
                return false;
            } else {
                L1(mediaCodec2, i3, j6);
                return true;
            }
        } else {
            L1(mediaCodec2, i3, j6);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public boolean I1(long j, long j2, boolean z) {
        return p1(j) && !z;
    }

    /* access modifiers changed from: protected */
    public void J() {
        try {
            super.J();
        } finally {
            Surface surface = this.L0;
            if (surface != null) {
                if (this.K0 == surface) {
                    this.K0 = null;
                }
                this.L0.release();
                this.L0 = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean J1(long j, long j2) {
        return p1(j) && j2 > 100000;
    }

    /* access modifiers changed from: protected */
    public void K() {
        super.K();
        this.R0 = 0;
        this.Q0 = SystemClock.elapsedRealtime();
        this.U0 = SystemClock.elapsedRealtime() * 1000;
    }

    /* access modifiers changed from: protected */
    public void L() {
        this.P0 = -9223372036854775807L;
        s1();
        super.L();
    }

    /* access modifiers changed from: protected */
    public void L1(MediaCodec mediaCodec, int i, long j) {
        t50.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        t50.c();
        this.x0.f++;
    }

    /* access modifiers changed from: protected */
    public void M(f0[] f0VarArr, long j) {
        if (this.k1 == -9223372036854775807L) {
            this.k1 = j;
        } else {
            int i = this.l1;
            long[] jArr = this.F0;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                b50.h("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.l1 = i + 1;
            }
            long[] jArr2 = this.F0;
            int i2 = this.l1;
            jArr2[i2 - 1] = j;
            this.G0[i2 - 1] = this.j1;
        }
        super.M(f0VarArr, j);
    }

    /* access modifiers changed from: protected */
    public void M1(int i) {
        zr zrVar = this.x0;
        zrVar.g += i;
        this.R0 += i;
        int i2 = this.S0 + i;
        this.S0 = i2;
        zrVar.h = Math.max(i2, zrVar.h);
        int i3 = this.D0;
        if (i3 > 0 && this.R0 >= i3) {
            s1();
        }
    }

    /* access modifiers changed from: protected */
    public void N0() {
        try {
            super.N0();
        } finally {
            this.T0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public int Q(MediaCodec mediaCodec, tx txVar, f0 f0Var, f0 f0Var2) {
        if (!txVar.o(f0Var, f0Var2, true)) {
            return 0;
        }
        int i = f0Var2.r;
        a aVar = this.H0;
        if (i > aVar.a || f0Var2.s > aVar.b || n1(txVar, f0Var2) > this.H0.c) {
            return 0;
        }
        return f0Var.M(f0Var2) ? 3 : 2;
    }

    /* access modifiers changed from: protected */
    public boolean W0(tx txVar) {
        return this.K0 != null || K1(txVar);
    }

    /* access modifiers changed from: protected */
    public int Y0(vx vxVar, rs<vs> rsVar, f0 f0Var) {
        int i = 0;
        if (!e50.n(f0Var.m)) {
            return v0.a(0);
        }
        ns nsVar = f0Var.p;
        boolean z = nsVar != null;
        List<tx> m12 = m1(vxVar, f0Var, z, false);
        if (z && m12.isEmpty()) {
            m12 = m1(vxVar, f0Var, false, false);
        }
        if (m12.isEmpty()) {
            return v0.a(1);
        }
        if (!(nsVar == null || vs.class.equals(f0Var.G) || (f0Var.G == null && u.P(rsVar, nsVar)))) {
            return v0.a(2);
        }
        tx txVar = m12.get(0);
        boolean l = txVar.l(f0Var);
        int i2 = txVar.n(f0Var) ? 16 : 8;
        if (l) {
            List<tx> m13 = m1(vxVar, f0Var, z, true);
            if (!m13.isEmpty()) {
                tx txVar2 = m13.get(0);
                if (txVar2.l(f0Var) && txVar2.n(f0Var)) {
                    i = 32;
                }
            }
        }
        return v0.b(l ? 4 : 3, i2, i);
    }

    /* access modifiers changed from: protected */
    public void a0(tx txVar, MediaCodec mediaCodec, f0 f0Var, MediaCrypto mediaCrypto, float f) {
        String str = txVar.c;
        a l12 = l1(txVar, f0Var, D());
        this.H0 = l12;
        MediaFormat o12 = o1(f0Var, str, l12, f, this.E0, this.h1);
        if (this.K0 == null) {
            q40.f(K1(txVar));
            if (this.L0 == null) {
                this.L0 = k.d(this.z0, txVar.f);
            }
            this.K0 = this.L0;
        }
        mediaCodec.configure(o12, this.K0, mediaCrypto, 0);
        if (v50.a >= 23 && this.g1) {
            this.i1 = new b(mediaCodec);
        }
    }

    public boolean f() {
        Surface surface;
        if (super.f() && (this.N0 || (((surface = this.L0) != null && this.K0 == surface) || j0() == null || this.g1))) {
            this.P0 = -9223372036854775807L;
            return true;
        } else if (this.P0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.P0) {
                return true;
            }
            this.P0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0619, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x061a, code lost:
        switch(r3) {
            case 0: goto L_0x061e;
            case 1: goto L_0x061e;
            case 2: goto L_0x061e;
            case 3: goto L_0x061e;
            case 4: goto L_0x061e;
            case 5: goto L_0x061e;
            case 6: goto L_0x061e;
            case 7: goto L_0x061e;
            case 8: goto L_0x061e;
            case 9: goto L_0x061e;
            case 10: goto L_0x061e;
            case 11: goto L_0x061e;
            case 12: goto L_0x061e;
            case 13: goto L_0x061e;
            case 14: goto L_0x061e;
            case 15: goto L_0x061e;
            case 16: goto L_0x061e;
            case 17: goto L_0x061e;
            case 18: goto L_0x061e;
            case 19: goto L_0x061e;
            case 20: goto L_0x061e;
            case 21: goto L_0x061e;
            case 22: goto L_0x061e;
            case 23: goto L_0x061e;
            case 24: goto L_0x061e;
            case 25: goto L_0x061e;
            case 26: goto L_0x061e;
            case 27: goto L_0x061e;
            case 28: goto L_0x061e;
            case 29: goto L_0x061e;
            case 30: goto L_0x061e;
            case 31: goto L_0x061e;
            case 32: goto L_0x061e;
            case 33: goto L_0x061e;
            case 34: goto L_0x061e;
            case 35: goto L_0x061e;
            case 36: goto L_0x061e;
            case 37: goto L_0x061e;
            case 38: goto L_0x061e;
            case 39: goto L_0x061e;
            case 40: goto L_0x061e;
            case 41: goto L_0x061e;
            case 42: goto L_0x061e;
            case 43: goto L_0x061e;
            case 44: goto L_0x061e;
            case 45: goto L_0x061e;
            case 46: goto L_0x061e;
            case 47: goto L_0x061e;
            case 48: goto L_0x061e;
            case 49: goto L_0x061e;
            case 50: goto L_0x061e;
            case 51: goto L_0x061e;
            case 52: goto L_0x061e;
            case 53: goto L_0x061e;
            case 54: goto L_0x061e;
            case 55: goto L_0x061e;
            case 56: goto L_0x061e;
            case 57: goto L_0x061e;
            case 58: goto L_0x061e;
            case 59: goto L_0x061e;
            case 60: goto L_0x061e;
            case 61: goto L_0x061e;
            case 62: goto L_0x061e;
            case 63: goto L_0x061e;
            case 64: goto L_0x061e;
            case 65: goto L_0x061e;
            case 66: goto L_0x061e;
            case 67: goto L_0x061e;
            case 68: goto L_0x061e;
            case 69: goto L_0x061e;
            case 70: goto L_0x061e;
            case 71: goto L_0x061e;
            case 72: goto L_0x061e;
            case 73: goto L_0x061e;
            case 74: goto L_0x061e;
            case 75: goto L_0x061e;
            case 76: goto L_0x061e;
            case 77: goto L_0x061e;
            case 78: goto L_0x061e;
            case 79: goto L_0x061e;
            case 80: goto L_0x061e;
            case 81: goto L_0x061e;
            case 82: goto L_0x061e;
            case 83: goto L_0x061e;
            case 84: goto L_0x061e;
            case 85: goto L_0x061e;
            case 86: goto L_0x061e;
            case 87: goto L_0x061e;
            case 88: goto L_0x061e;
            case 89: goto L_0x061e;
            case 90: goto L_0x061e;
            case 91: goto L_0x061e;
            case 92: goto L_0x061e;
            case 93: goto L_0x061e;
            case 94: goto L_0x061e;
            case 95: goto L_0x061e;
            case 96: goto L_0x061e;
            case 97: goto L_0x061e;
            case 98: goto L_0x061e;
            case 99: goto L_0x061e;
            case 100: goto L_0x061e;
            case 101: goto L_0x061e;
            case 102: goto L_0x061e;
            case 103: goto L_0x061e;
            case 104: goto L_0x061e;
            case 105: goto L_0x061e;
            case 106: goto L_0x061e;
            case 107: goto L_0x061e;
            case 108: goto L_0x061e;
            case 109: goto L_0x061e;
            case 110: goto L_0x061e;
            case 111: goto L_0x061e;
            case 112: goto L_0x061e;
            case 113: goto L_0x061e;
            case 114: goto L_0x061e;
            case 115: goto L_0x061e;
            case 116: goto L_0x061e;
            case 117: goto L_0x061e;
            case 118: goto L_0x061e;
            case 119: goto L_0x061e;
            case 120: goto L_0x061e;
            case 121: goto L_0x061e;
            case 122: goto L_0x061e;
            case 123: goto L_0x061e;
            case 124: goto L_0x061e;
            case 125: goto L_0x061e;
            default: goto L_0x061d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x061e, code lost:
        p1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0620, code lost:
        r1 = defpackage.v50.d;
        r3 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0629, code lost:
        if (r3 == -594534941) goto L_0x0649;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x062e, code lost:
        if (r3 == 2006354) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0633, code lost:
        if (r3 == 2006367) goto L_0x0636;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x063c, code lost:
        if (r1.equals("AFTN") == false) goto L_0x0653;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x063e, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0646, code lost:
        if (r1.equals("AFTA") == false) goto L_0x0653;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x064f, code lost:
        if (r1.equals("JSN-L21") == false) goto L_0x0653;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0651, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0653, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0654, code lost:
        if (r0 == 0) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0656, code lost:
        if (r0 == 1) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0658, code lost:
        if (r0 == 2) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f1(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "OMX.google"
            boolean r8 = r8.startsWith(r0)
            r0 = 0
            if (r8 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<com.google.android.exoplayer2.video.m> r8 = com.google.android.exoplayer2.video.m.class
            monitor-enter(r8)
            boolean r1 = o1     // Catch:{ all -> 0x0660 }
            if (r1 != 0) goto L_0x065c
            java.lang.String r1 = "dangal"
            java.lang.String r2 = defpackage.v50.b     // Catch:{ all -> 0x0660 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0660 }
            r2 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001c:
            p1 = r2     // Catch:{ all -> 0x0660 }
            goto L_0x065a
        L_0x0020:
            int r1 = defpackage.v50.a     // Catch:{ all -> 0x0660 }
            r3 = 27
            if (r1 > r3) goto L_0x0031
            java.lang.String r1 = "HWEML"
            java.lang.String r4 = defpackage.v50.b     // Catch:{ all -> 0x0660 }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0031
            goto L_0x001c
        L_0x0031:
            int r1 = defpackage.v50.a     // Catch:{ all -> 0x0660 }
            if (r1 < r3) goto L_0x0037
            goto L_0x065a
        L_0x0037:
            java.lang.String r1 = defpackage.v50.b     // Catch:{ all -> 0x0660 }
            int r4 = r1.hashCode()     // Catch:{ all -> 0x0660 }
            r5 = -1
            r6 = 2
            switch(r4) {
                case -2144781245: goto L_0x060e;
                case -2144781185: goto L_0x0603;
                case -2144781160: goto L_0x05f8;
                case -2097309513: goto L_0x05ed;
                case -2022874474: goto L_0x05e2;
                case -1978993182: goto L_0x05d7;
                case -1978990237: goto L_0x05cc;
                case -1936688988: goto L_0x05c1;
                case -1936688066: goto L_0x05b6;
                case -1936688065: goto L_0x05aa;
                case -1931988508: goto L_0x059e;
                case -1696512866: goto L_0x0592;
                case -1680025915: goto L_0x0586;
                case -1615810839: goto L_0x057a;
                case -1554255044: goto L_0x056e;
                case -1481772737: goto L_0x0562;
                case -1481772730: goto L_0x0556;
                case -1481772729: goto L_0x054a;
                case -1320080169: goto L_0x053e;
                case -1217592143: goto L_0x0532;
                case -1180384755: goto L_0x0526;
                case -1139198265: goto L_0x051a;
                case -1052835013: goto L_0x050e;
                case -993250464: goto L_0x0503;
                case -993250458: goto L_0x04f8;
                case -965403638: goto L_0x04ec;
                case -958336948: goto L_0x04e0;
                case -879245230: goto L_0x04d4;
                case -842500323: goto L_0x04c8;
                case -821392978: goto L_0x04bd;
                case -797483286: goto L_0x04b1;
                case -794946968: goto L_0x04a5;
                case -788334647: goto L_0x0499;
                case -782144577: goto L_0x048d;
                case -575125681: goto L_0x0481;
                case -521118391: goto L_0x0475;
                case -430914369: goto L_0x0469;
                case -290434366: goto L_0x045d;
                case -282781963: goto L_0x0451;
                case -277133239: goto L_0x0445;
                case -173639913: goto L_0x0439;
                case -56598463: goto L_0x042d;
                case 2126: goto L_0x0421;
                case 2564: goto L_0x0415;
                case 2715: goto L_0x0409;
                case 2719: goto L_0x03fd;
                case 3483: goto L_0x03f1;
                case 73405: goto L_0x03e5;
                case 75739: goto L_0x03d9;
                case 76779: goto L_0x03cd;
                case 78669: goto L_0x03c1;
                case 79305: goto L_0x03b5;
                case 80618: goto L_0x03a9;
                case 88274: goto L_0x039d;
                case 98846: goto L_0x0391;
                case 98848: goto L_0x0385;
                case 99329: goto L_0x0379;
                case 101481: goto L_0x036d;
                case 1513190: goto L_0x0362;
                case 1514184: goto L_0x0357;
                case 1514185: goto L_0x034c;
                case 2436959: goto L_0x0340;
                case 2463773: goto L_0x0334;
                case 2464648: goto L_0x0328;
                case 2689555: goto L_0x031c;
                case 3154429: goto L_0x0310;
                case 3284551: goto L_0x0304;
                case 3351335: goto L_0x02f8;
                case 3386211: goto L_0x02ec;
                case 41325051: goto L_0x02e0;
                case 55178625: goto L_0x02d4;
                case 61542055: goto L_0x02c9;
                case 65355429: goto L_0x02bd;
                case 66214468: goto L_0x02b1;
                case 66214470: goto L_0x02a5;
                case 66214473: goto L_0x0299;
                case 66215429: goto L_0x028d;
                case 66215431: goto L_0x0281;
                case 66215433: goto L_0x0275;
                case 66216390: goto L_0x0269;
                case 76402249: goto L_0x025d;
                case 76404105: goto L_0x0251;
                case 76404911: goto L_0x0245;
                case 80963634: goto L_0x0239;
                case 82882791: goto L_0x022d;
                case 98715550: goto L_0x0221;
                case 101370885: goto L_0x0215;
                case 102844228: goto L_0x0209;
                case 165221241: goto L_0x01fe;
                case 182191441: goto L_0x01f2;
                case 245388979: goto L_0x01e6;
                case 287431619: goto L_0x01da;
                case 307593612: goto L_0x01ce;
                case 308517133: goto L_0x01c2;
                case 316215098: goto L_0x01b6;
                case 316215116: goto L_0x01aa;
                case 316246811: goto L_0x019e;
                case 316246818: goto L_0x0192;
                case 407160593: goto L_0x0186;
                case 507412548: goto L_0x017a;
                case 793982701: goto L_0x016e;
                case 794038622: goto L_0x0162;
                case 794040393: goto L_0x0156;
                case 835649806: goto L_0x014a;
                case 917340916: goto L_0x013e;
                case 958008161: goto L_0x0132;
                case 1060579533: goto L_0x0126;
                case 1150207623: goto L_0x011a;
                case 1176899427: goto L_0x010e;
                case 1280332038: goto L_0x0102;
                case 1306947716: goto L_0x00f6;
                case 1349174697: goto L_0x00ea;
                case 1522194893: goto L_0x00de;
                case 1691543273: goto L_0x00d2;
                case 1709443163: goto L_0x00c6;
                case 1865889110: goto L_0x00ba;
                case 1906253259: goto L_0x00ae;
                case 1977196784: goto L_0x00a2;
                case 2006372676: goto L_0x0096;
                case 2029784656: goto L_0x008a;
                case 2030379515: goto L_0x007e;
                case 2033393791: goto L_0x0072;
                case 2047190025: goto L_0x0068;
                case 2047252157: goto L_0x005c;
                case 2048319463: goto L_0x0050;
                case 2048855701: goto L_0x0044;
                default: goto L_0x0042;
            }     // Catch:{ all -> 0x0660 }
        L_0x0042:
            goto L_0x0619
        L_0x0044:
            java.lang.String r3 = "HWWAS-H"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 55
            goto L_0x061a
        L_0x0050:
            java.lang.String r3 = "HWVNS-H"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 54
            goto L_0x061a
        L_0x005c:
            java.lang.String r3 = "ELUGA_Prim"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 28
            goto L_0x061a
        L_0x0068:
            java.lang.String r4 = "ELUGA_Note"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            goto L_0x061a
        L_0x0072:
            java.lang.String r3 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 12
            goto L_0x061a
        L_0x007e:
            java.lang.String r3 = "HWCAM-H"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 53
            goto L_0x061a
        L_0x008a:
            java.lang.String r3 = "HWBLN-H"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 52
            goto L_0x061a
        L_0x0096:
            java.lang.String r3 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 16
            goto L_0x061a
        L_0x00a2:
            java.lang.String r3 = "Infinix-X572"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 58
            goto L_0x061a
        L_0x00ae:
            java.lang.String r3 = "PB2-670M"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 87
            goto L_0x061a
        L_0x00ba:
            java.lang.String r3 = "santoni"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 103(0x67, float:1.44E-43)
            goto L_0x061a
        L_0x00c6:
            java.lang.String r3 = "iball8735_9806"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 57
            goto L_0x061a
        L_0x00d2:
            java.lang.String r3 = "CPH1609"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 20
            goto L_0x061a
        L_0x00de:
            java.lang.String r3 = "woods_f"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 119(0x77, float:1.67E-43)
            goto L_0x061a
        L_0x00ea:
            java.lang.String r3 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 50
            goto L_0x061a
        L_0x00f6:
            java.lang.String r3 = "EverStar_S"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 30
            goto L_0x061a
        L_0x0102:
            java.lang.String r3 = "hwALE-H"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 51
            goto L_0x061a
        L_0x010e:
            java.lang.String r3 = "itel_S41"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 60
            goto L_0x061a
        L_0x011a:
            java.lang.String r3 = "LS-5017"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 67
            goto L_0x061a
        L_0x0126:
            java.lang.String r3 = "panell_d"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 83
            goto L_0x061a
        L_0x0132:
            java.lang.String r3 = "j2xlteins"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 61
            goto L_0x061a
        L_0x013e:
            java.lang.String r3 = "A7000plus"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 8
            goto L_0x061a
        L_0x014a:
            java.lang.String r3 = "manning"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 69
            goto L_0x061a
        L_0x0156:
            java.lang.String r3 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 48
            goto L_0x061a
        L_0x0162:
            java.lang.String r3 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 47
            goto L_0x061a
        L_0x016e:
            java.lang.String r3 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 46
            goto L_0x061a
        L_0x017a:
            java.lang.String r3 = "QM16XE_U"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 101(0x65, float:1.42E-43)
            goto L_0x061a
        L_0x0186:
            java.lang.String r3 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 93
            goto L_0x061a
        L_0x0192:
            java.lang.String r3 = "TB3-850M"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 111(0x6f, float:1.56E-43)
            goto L_0x061a
        L_0x019e:
            java.lang.String r3 = "TB3-850F"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 110(0x6e, float:1.54E-43)
            goto L_0x061a
        L_0x01aa:
            java.lang.String r3 = "TB3-730X"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 109(0x6d, float:1.53E-43)
            goto L_0x061a
        L_0x01b6:
            java.lang.String r3 = "TB3-730F"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 108(0x6c, float:1.51E-43)
            goto L_0x061a
        L_0x01c2:
            java.lang.String r3 = "A7020a48"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 10
            goto L_0x061a
        L_0x01ce:
            java.lang.String r3 = "A7010a48"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 9
            goto L_0x061a
        L_0x01da:
            java.lang.String r3 = "griffin"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 49
            goto L_0x061a
        L_0x01e6:
            java.lang.String r3 = "marino_f"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 70
            goto L_0x061a
        L_0x01f2:
            java.lang.String r3 = "CPY83_I00"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 21
            goto L_0x061a
        L_0x01fe:
            java.lang.String r3 = "A2016a40"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 6
            goto L_0x061a
        L_0x0209:
            java.lang.String r3 = "le_x6"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 66
            goto L_0x061a
        L_0x0215:
            java.lang.String r3 = "l5460"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 65
            goto L_0x061a
        L_0x0221:
            java.lang.String r3 = "i9031"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 56
            goto L_0x061a
        L_0x022d:
            java.lang.String r3 = "X3_HK"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 121(0x79, float:1.7E-43)
            goto L_0x061a
        L_0x0239:
            java.lang.String r3 = "V23GB"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 114(0x72, float:1.6E-43)
            goto L_0x061a
        L_0x0245:
            java.lang.String r3 = "Q4310"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 99
            goto L_0x061a
        L_0x0251:
            java.lang.String r3 = "Q4260"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 97
            goto L_0x061a
        L_0x025d:
            java.lang.String r3 = "PRO7S"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 95
            goto L_0x061a
        L_0x0269:
            java.lang.String r3 = "F3311"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 37
            goto L_0x061a
        L_0x0275:
            java.lang.String r3 = "F3215"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 36
            goto L_0x061a
        L_0x0281:
            java.lang.String r3 = "F3213"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 35
            goto L_0x061a
        L_0x028d:
            java.lang.String r3 = "F3211"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 34
            goto L_0x061a
        L_0x0299:
            java.lang.String r3 = "F3116"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 33
            goto L_0x061a
        L_0x02a5:
            java.lang.String r3 = "F3113"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 32
            goto L_0x061a
        L_0x02b1:
            java.lang.String r3 = "F3111"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 31
            goto L_0x061a
        L_0x02bd:
            java.lang.String r3 = "E5643"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 25
            goto L_0x061a
        L_0x02c9:
            java.lang.String r3 = "A1601"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 5
            goto L_0x061a
        L_0x02d4:
            java.lang.String r3 = "Aura_Note_2"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 13
            goto L_0x061a
        L_0x02e0:
            java.lang.String r3 = "MEIZU_M5"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 71
            goto L_0x061a
        L_0x02ec:
            java.lang.String r3 = "p212"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 80
            goto L_0x061a
        L_0x02f8:
            java.lang.String r3 = "mido"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 73
            goto L_0x061a
        L_0x0304:
            java.lang.String r3 = "kate"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 64
            goto L_0x061a
        L_0x0310:
            java.lang.String r3 = "fugu"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 39
            goto L_0x061a
        L_0x031c:
            java.lang.String r3 = "XE2X"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 122(0x7a, float:1.71E-43)
            goto L_0x061a
        L_0x0328:
            java.lang.String r3 = "Q427"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 98
            goto L_0x061a
        L_0x0334:
            java.lang.String r3 = "Q350"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 96
            goto L_0x061a
        L_0x0340:
            java.lang.String r3 = "P681"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 81
            goto L_0x061a
        L_0x034c:
            java.lang.String r3 = "1714"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 2
            goto L_0x061a
        L_0x0357:
            java.lang.String r3 = "1713"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 1
            goto L_0x061a
        L_0x0362:
            java.lang.String r3 = "1601"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 0
            goto L_0x061a
        L_0x036d:
            java.lang.String r3 = "flo"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 38
            goto L_0x061a
        L_0x0379:
            java.lang.String r3 = "deb"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 24
            goto L_0x061a
        L_0x0385:
            java.lang.String r3 = "cv3"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 23
            goto L_0x061a
        L_0x0391:
            java.lang.String r3 = "cv1"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 22
            goto L_0x061a
        L_0x039d:
            java.lang.String r3 = "Z80"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 125(0x7d, float:1.75E-43)
            goto L_0x061a
        L_0x03a9:
            java.lang.String r3 = "QX1"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 102(0x66, float:1.43E-43)
            goto L_0x061a
        L_0x03b5:
            java.lang.String r3 = "PLE"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 94
            goto L_0x061a
        L_0x03c1:
            java.lang.String r3 = "P85"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 82
            goto L_0x061a
        L_0x03cd:
            java.lang.String r3 = "MX6"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 74
            goto L_0x061a
        L_0x03d9:
            java.lang.String r3 = "M5c"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 68
            goto L_0x061a
        L_0x03e5:
            java.lang.String r3 = "JGZ"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 62
            goto L_0x061a
        L_0x03f1:
            java.lang.String r3 = "mh"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 72
            goto L_0x061a
        L_0x03fd:
            java.lang.String r3 = "V5"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 115(0x73, float:1.61E-43)
            goto L_0x061a
        L_0x0409:
            java.lang.String r3 = "V1"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 113(0x71, float:1.58E-43)
            goto L_0x061a
        L_0x0415:
            java.lang.String r3 = "Q5"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 100
            goto L_0x061a
        L_0x0421:
            java.lang.String r3 = "C1"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 17
            goto L_0x061a
        L_0x042d:
            java.lang.String r3 = "woods_fn"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 120(0x78, float:1.68E-43)
            goto L_0x061a
        L_0x0439:
            java.lang.String r3 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 26
            goto L_0x061a
        L_0x0445:
            java.lang.String r3 = "Z12_PRO"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 124(0x7c, float:1.74E-43)
            goto L_0x061a
        L_0x0451:
            java.lang.String r3 = "BLACK-1X"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 14
            goto L_0x061a
        L_0x045d:
            java.lang.String r3 = "taido_row"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 107(0x6b, float:1.5E-43)
            goto L_0x061a
        L_0x0469:
            java.lang.String r3 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 92
            goto L_0x061a
        L_0x0475:
            java.lang.String r3 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 42
            goto L_0x061a
        L_0x0481:
            java.lang.String r3 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 40
            goto L_0x061a
        L_0x048d:
            java.lang.String r3 = "OnePlus5T"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 79
            goto L_0x061a
        L_0x0499:
            java.lang.String r3 = "whyred"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 118(0x76, float:1.65E-43)
            goto L_0x061a
        L_0x04a5:
            java.lang.String r3 = "watson"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 117(0x75, float:1.64E-43)
            goto L_0x061a
        L_0x04b1:
            java.lang.String r3 = "SVP-DTV15"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 105(0x69, float:1.47E-43)
            goto L_0x061a
        L_0x04bd:
            java.lang.String r3 = "A7000-a"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 7
            goto L_0x061a
        L_0x04c8:
            java.lang.String r3 = "nicklaus_f"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 76
            goto L_0x061a
        L_0x04d4:
            java.lang.String r3 = "tcl_eu"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 112(0x70, float:1.57E-43)
            goto L_0x061a
        L_0x04e0:
            java.lang.String r3 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 29
            goto L_0x061a
        L_0x04ec:
            java.lang.String r3 = "s905x018"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 106(0x6a, float:1.49E-43)
            goto L_0x061a
        L_0x04f8:
            java.lang.String r3 = "A10-70L"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 4
            goto L_0x061a
        L_0x0503:
            java.lang.String r3 = "A10-70F"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 3
            goto L_0x061a
        L_0x050e:
            java.lang.String r3 = "namath"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 75
            goto L_0x061a
        L_0x051a:
            java.lang.String r3 = "Slate_Pro"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 104(0x68, float:1.46E-43)
            goto L_0x061a
        L_0x0526:
            java.lang.String r3 = "iris60"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 59
            goto L_0x061a
        L_0x0532:
            java.lang.String r3 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 15
            goto L_0x061a
        L_0x053e:
            java.lang.String r3 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 41
            goto L_0x061a
        L_0x054a:
            java.lang.String r3 = "panell_dt"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 86
            goto L_0x061a
        L_0x0556:
            java.lang.String r3 = "panell_ds"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 85
            goto L_0x061a
        L_0x0562:
            java.lang.String r3 = "panell_dl"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 84
            goto L_0x061a
        L_0x056e:
            java.lang.String r3 = "vernee_M5"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 116(0x74, float:1.63E-43)
            goto L_0x061a
        L_0x057a:
            java.lang.String r3 = "Phantom6"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 91
            goto L_0x061a
        L_0x0586:
            java.lang.String r3 = "ComioS1"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 18
            goto L_0x061a
        L_0x0592:
            java.lang.String r3 = "XT1663"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 123(0x7b, float:1.72E-43)
            goto L_0x061a
        L_0x059e:
            java.lang.String r3 = "AquaPowerM"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 11
            goto L_0x061a
        L_0x05aa:
            java.lang.String r3 = "PGN611"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 90
            goto L_0x061a
        L_0x05b6:
            java.lang.String r3 = "PGN610"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 89
            goto L_0x061a
        L_0x05c1:
            java.lang.String r3 = "PGN528"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 88
            goto L_0x061a
        L_0x05cc:
            java.lang.String r3 = "NX573J"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 78
            goto L_0x061a
        L_0x05d7:
            java.lang.String r3 = "NX541J"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 77
            goto L_0x061a
        L_0x05e2:
            java.lang.String r3 = "CP8676_I02"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 19
            goto L_0x061a
        L_0x05ed:
            java.lang.String r3 = "K50a40"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 63
            goto L_0x061a
        L_0x05f8:
            java.lang.String r3 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 45
            goto L_0x061a
        L_0x0603:
            java.lang.String r3 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 44
            goto L_0x061a
        L_0x060e:
            java.lang.String r3 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0619
            r3 = 43
            goto L_0x061a
        L_0x0619:
            r3 = -1
        L_0x061a:
            switch(r3) {
                case 0: goto L_0x061e;
                case 1: goto L_0x061e;
                case 2: goto L_0x061e;
                case 3: goto L_0x061e;
                case 4: goto L_0x061e;
                case 5: goto L_0x061e;
                case 6: goto L_0x061e;
                case 7: goto L_0x061e;
                case 8: goto L_0x061e;
                case 9: goto L_0x061e;
                case 10: goto L_0x061e;
                case 11: goto L_0x061e;
                case 12: goto L_0x061e;
                case 13: goto L_0x061e;
                case 14: goto L_0x061e;
                case 15: goto L_0x061e;
                case 16: goto L_0x061e;
                case 17: goto L_0x061e;
                case 18: goto L_0x061e;
                case 19: goto L_0x061e;
                case 20: goto L_0x061e;
                case 21: goto L_0x061e;
                case 22: goto L_0x061e;
                case 23: goto L_0x061e;
                case 24: goto L_0x061e;
                case 25: goto L_0x061e;
                case 26: goto L_0x061e;
                case 27: goto L_0x061e;
                case 28: goto L_0x061e;
                case 29: goto L_0x061e;
                case 30: goto L_0x061e;
                case 31: goto L_0x061e;
                case 32: goto L_0x061e;
                case 33: goto L_0x061e;
                case 34: goto L_0x061e;
                case 35: goto L_0x061e;
                case 36: goto L_0x061e;
                case 37: goto L_0x061e;
                case 38: goto L_0x061e;
                case 39: goto L_0x061e;
                case 40: goto L_0x061e;
                case 41: goto L_0x061e;
                case 42: goto L_0x061e;
                case 43: goto L_0x061e;
                case 44: goto L_0x061e;
                case 45: goto L_0x061e;
                case 46: goto L_0x061e;
                case 47: goto L_0x061e;
                case 48: goto L_0x061e;
                case 49: goto L_0x061e;
                case 50: goto L_0x061e;
                case 51: goto L_0x061e;
                case 52: goto L_0x061e;
                case 53: goto L_0x061e;
                case 54: goto L_0x061e;
                case 55: goto L_0x061e;
                case 56: goto L_0x061e;
                case 57: goto L_0x061e;
                case 58: goto L_0x061e;
                case 59: goto L_0x061e;
                case 60: goto L_0x061e;
                case 61: goto L_0x061e;
                case 62: goto L_0x061e;
                case 63: goto L_0x061e;
                case 64: goto L_0x061e;
                case 65: goto L_0x061e;
                case 66: goto L_0x061e;
                case 67: goto L_0x061e;
                case 68: goto L_0x061e;
                case 69: goto L_0x061e;
                case 70: goto L_0x061e;
                case 71: goto L_0x061e;
                case 72: goto L_0x061e;
                case 73: goto L_0x061e;
                case 74: goto L_0x061e;
                case 75: goto L_0x061e;
                case 76: goto L_0x061e;
                case 77: goto L_0x061e;
                case 78: goto L_0x061e;
                case 79: goto L_0x061e;
                case 80: goto L_0x061e;
                case 81: goto L_0x061e;
                case 82: goto L_0x061e;
                case 83: goto L_0x061e;
                case 84: goto L_0x061e;
                case 85: goto L_0x061e;
                case 86: goto L_0x061e;
                case 87: goto L_0x061e;
                case 88: goto L_0x061e;
                case 89: goto L_0x061e;
                case 90: goto L_0x061e;
                case 91: goto L_0x061e;
                case 92: goto L_0x061e;
                case 93: goto L_0x061e;
                case 94: goto L_0x061e;
                case 95: goto L_0x061e;
                case 96: goto L_0x061e;
                case 97: goto L_0x061e;
                case 98: goto L_0x061e;
                case 99: goto L_0x061e;
                case 100: goto L_0x061e;
                case 101: goto L_0x061e;
                case 102: goto L_0x061e;
                case 103: goto L_0x061e;
                case 104: goto L_0x061e;
                case 105: goto L_0x061e;
                case 106: goto L_0x061e;
                case 107: goto L_0x061e;
                case 108: goto L_0x061e;
                case 109: goto L_0x061e;
                case 110: goto L_0x061e;
                case 111: goto L_0x061e;
                case 112: goto L_0x061e;
                case 113: goto L_0x061e;
                case 114: goto L_0x061e;
                case 115: goto L_0x061e;
                case 116: goto L_0x061e;
                case 117: goto L_0x061e;
                case 118: goto L_0x061e;
                case 119: goto L_0x061e;
                case 120: goto L_0x061e;
                case 121: goto L_0x061e;
                case 122: goto L_0x061e;
                case 123: goto L_0x061e;
                case 124: goto L_0x061e;
                case 125: goto L_0x061e;
                default: goto L_0x061d;
            }     // Catch:{ all -> 0x0660 }
        L_0x061d:
            goto L_0x0620
        L_0x061e:
            p1 = r2     // Catch:{ all -> 0x0660 }
        L_0x0620:
            java.lang.String r1 = defpackage.v50.d     // Catch:{ all -> 0x0660 }
            int r3 = r1.hashCode()     // Catch:{ all -> 0x0660 }
            r4 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r3 == r4) goto L_0x0649
            r4 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r3 == r4) goto L_0x0640
            r0 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r3 == r0) goto L_0x0636
            goto L_0x0653
        L_0x0636:
            java.lang.String r0 = "AFTN"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0660 }
            if (r0 == 0) goto L_0x0653
            r0 = 1
            goto L_0x0654
        L_0x0640:
            java.lang.String r3 = "AFTA"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0660 }
            if (r1 == 0) goto L_0x0653
            goto L_0x0654
        L_0x0649:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0660 }
            if (r0 == 0) goto L_0x0653
            r0 = 2
            goto L_0x0654
        L_0x0653:
            r0 = -1
        L_0x0654:
            if (r0 == 0) goto L_0x001c
            if (r0 == r2) goto L_0x001c
            if (r0 == r6) goto L_0x001c
        L_0x065a:
            o1 = r2     // Catch:{ all -> 0x0660 }
        L_0x065c:
            monitor-exit(r8)     // Catch:{ all -> 0x0660 }
            boolean r8 = p1
            return r8
        L_0x0660:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0660 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.m.f1(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean h0() {
        try {
            return super.h0();
        } finally {
            this.T0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void i1(MediaCodec mediaCodec, int i, long j) {
        t50.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        t50.c();
        M1(1);
    }

    /* access modifiers changed from: protected */
    public a l1(tx txVar, f0 f0Var, f0[] f0VarArr) {
        int j12;
        int i = f0Var.r;
        int i2 = f0Var.s;
        int n12 = n1(txVar, f0Var);
        if (f0VarArr.length == 1) {
            if (!(n12 == -1 || (j12 = j1(txVar, f0Var.m, f0Var.r, f0Var.s)) == -1)) {
                n12 = Math.min((int) (((float) n12) * 1.5f), j12);
            }
            return new a(i, i2, n12);
        }
        boolean z = false;
        for (f0 f0Var2 : f0VarArr) {
            if (txVar.o(f0Var, f0Var2, false)) {
                z |= f0Var2.r == -1 || f0Var2.s == -1;
                i = Math.max(i, f0Var2.r);
                i2 = Math.max(i2, f0Var2.s);
                n12 = Math.max(n12, n1(txVar, f0Var2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder(66);
            sb.append("Resolutions unknown. Codec max resolution: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            b50.h("MediaCodecVideoRenderer", sb.toString());
            Point k12 = k1(txVar, f0Var);
            if (k12 != null) {
                i = Math.max(i, k12.x);
                i2 = Math.max(i2, k12.y);
                n12 = Math.max(n12, j1(txVar, f0Var.m, i, i2));
                StringBuilder sb2 = new StringBuilder(57);
                sb2.append("Codec max resolution adjusted to: ");
                sb2.append(i);
                sb2.append("x");
                sb2.append(i2);
                b50.h("MediaCodecVideoRenderer", sb2.toString());
            }
        }
        return new a(i, i2, n12);
    }

    /* access modifiers changed from: protected */
    public boolean m0() {
        return this.g1 && v50.a < 23;
    }

    /* access modifiers changed from: protected */
    public float n0(float f, f0 f0Var, f0[] f0VarArr) {
        float f2 = -1.0f;
        for (f0 f0Var2 : f0VarArr) {
            float f3 = f0Var2.t;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    public List<tx> o0(vx vxVar, f0 f0Var, boolean z) {
        return m1(vxVar, f0Var, z, this.g1);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    public MediaFormat o1(f0 f0Var, String str, a aVar, float f, boolean z, int i) {
        Pair<Integer, Integer> h;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", f0Var.r);
        mediaFormat.setInteger("height", f0Var.s);
        xx.e(mediaFormat, f0Var.o);
        xx.c(mediaFormat, "frame-rate", f0Var.t);
        xx.d(mediaFormat, "rotation-degrees", f0Var.u);
        xx.b(mediaFormat, f0Var.y);
        if ("video/dolby-vision".equals(f0Var.m) && (h = wx.h(f0Var)) != null) {
            xx.d(mediaFormat, "profile", ((Integer) h.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.a);
        mediaFormat.setInteger("max-height", aVar.b);
        xx.d(mediaFormat, "max-input-size", aVar.c);
        if (v50.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            g1(mediaFormat, i);
        }
        return mediaFormat;
    }

    public void r(int i, Object obj) {
        if (i == 1) {
            G1((Surface) obj);
        } else if (i == 4) {
            this.M0 = ((Integer) obj).intValue();
            MediaCodec j0 = j0();
            if (j0 != null) {
                j0.setVideoScalingMode(this.M0);
            }
        } else if (i == 6) {
            this.m1 = (p) obj;
        } else {
            super.r(i, obj);
        }
    }

    /* access modifiers changed from: protected */
    public boolean r1(MediaCodec mediaCodec, int i, long j, long j2, boolean z) {
        int O = O(j2);
        if (O == 0) {
            return false;
        }
        zr zrVar = this.x0;
        zrVar.i++;
        int i2 = this.T0 + O;
        if (z) {
            zrVar.f += i2;
        } else {
            M1(i2);
        }
        g0();
        return true;
    }

    /* access modifiers changed from: protected */
    public void t0(as asVar) {
        if (this.J0) {
            ByteBuffer byteBuffer = asVar.i;
            q40.e(byteBuffer);
            ByteBuffer byteBuffer2 = byteBuffer;
            if (byteBuffer2.remaining() >= 7) {
                byte b2 = byteBuffer2.get();
                short s = byteBuffer2.getShort();
                short s2 = byteBuffer2.getShort();
                byte b3 = byteBuffer2.get();
                byte b4 = byteBuffer2.get();
                byteBuffer2.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer2.remaining()];
                    byteBuffer2.get(bArr);
                    byteBuffer2.position(0);
                    D1(j0(), bArr);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t1() {
        if (!this.N0) {
            this.N0 = true;
            this.B0.m(this.K0);
        }
    }

    /* access modifiers changed from: protected */
    public void y1(long j) {
        f0 b12 = b1(j);
        if (b12 != null) {
            A1(j0(), b12.r, b12.s);
        }
        u1();
        this.x0.e++;
        t1();
        F0(j);
    }
}
