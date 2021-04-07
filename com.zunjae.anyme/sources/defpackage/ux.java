package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.v;
import defpackage.wx;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ux  reason: default package */
public abstract class ux extends u {
    private static final byte[] y0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private f0 A;
    private f0 B;
    private ps<vs> C;
    private ps<vs> D;
    private MediaCrypto E;
    private boolean F;
    private long G = -9223372036854775807L;
    private float H = 1.0f;
    private MediaCodec I;
    private f0 J;
    private float K = -1.0f;
    private ArrayDeque<tx> L;
    private a M;
    private tx N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private ByteBuffer[] Z;
    private ByteBuffer[] a0;
    private long b0;
    private int c0;
    private int d0;
    private ByteBuffer e0;
    private boolean f0;
    private boolean g0;
    private boolean h0;
    private int i0 = 0;
    private int j0 = 0;
    private int k0 = 0;
    private boolean l0;
    private boolean m0;
    private boolean n0;
    private long o0;
    private final vx p;
    private long p0;
    private final rs<vs> q;
    private boolean q0;
    private final boolean r;
    private boolean r0;
    private final boolean s;
    private boolean s0;
    private final float t;
    private boolean t0;
    private final as u = new as(0);
    private boolean u0;
    private final as v = as.r();
    private boolean v0;
    private final r50<f0> w = new r50<>();
    private boolean w0;
    private final ArrayList<Long> x = new ArrayList<>();
    protected zr x0;
    private final MediaCodec.BufferInfo y = new MediaCodec.BufferInfo();
    private boolean z;

    /* renamed from: ux$a */
    public static class a extends Exception {
        public final String e;
        public final boolean f;
        public final tx g;
        public final String h;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(com.google.android.exoplayer2.f0 r12, java.lang.Throwable r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                java.lang.String r1 = java.lang.String.valueOf(r0)
                int r1 = r1.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.m
                java.lang.String r9 = b(r15)
                r8 = 0
                r10 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.a.<init>(com.google.android.exoplayer2.f0, java.lang.Throwable, boolean, int):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(com.google.android.exoplayer2.f0 r9, java.lang.Throwable r10, boolean r11, defpackage.tx r12) {
            /*
                r8 = this;
                java.lang.String r0 = r12.a
                java.lang.String r1 = java.lang.String.valueOf(r9)
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                int r2 = r2 + 23
                java.lang.String r3 = java.lang.String.valueOf(r1)
                int r3 = r3.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Decoder init failed: "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ", "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.String r3 = r9.m
                int r0 = defpackage.v50.a
                r2 = 21
                if (r0 < r2) goto L_0x003f
                java.lang.String r0 = d(r10)
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                r6 = r0
                r7 = 0
                r0 = r8
                r2 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.a.<init>(com.google.android.exoplayer2.f0, java.lang.Throwable, boolean, tx):void");
        }

        private a(String str, Throwable th, String str2, boolean z, tx txVar, String str3, a aVar) {
            super(str, th);
            this.e = str2;
            this.f = z;
            this.g = txVar;
            this.h = str3;
        }

        private static String b(int i) {
            String str = i < 0 ? "neg_" : "";
            int abs = Math.abs(i);
            StringBuilder sb = new StringBuilder(str.length() + 71);
            sb.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb.append(str);
            sb.append(abs);
            return sb.toString();
        }

        /* access modifiers changed from: private */
        public a c(a aVar) {
            return new a(getMessage(), getCause(), this.e, this.f, this.g, this.h, aVar);
        }

        @TargetApi(21)
        private static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }
    }

    public ux(int i, vx vxVar, rs<vs> rsVar, boolean z2, boolean z3, float f) {
        super(i);
        q40.e(vxVar);
        this.p = vxVar;
        this.q = rsVar;
        this.r = z2;
        this.s = z3;
        this.t = f;
    }

    private void A0(MediaCrypto mediaCrypto, boolean z2) {
        if (this.L == null) {
            try {
                List<tx> i02 = i0(z2);
                ArrayDeque<tx> arrayDeque = new ArrayDeque<>();
                this.L = arrayDeque;
                if (this.s) {
                    arrayDeque.addAll(i02);
                } else if (!i02.isEmpty()) {
                    this.L.add(i02.get(0));
                }
                this.M = null;
            } catch (wx.c e) {
                throw new a(this.A, (Throwable) e, z2, -49998);
            }
        }
        if (!this.L.isEmpty()) {
            while (this.I == null) {
                tx peekFirst = this.L.peekFirst();
                if (W0(peekFirst)) {
                    try {
                        v0(peekFirst, mediaCrypto);
                    } catch (Exception e2) {
                        String valueOf = String.valueOf(peekFirst);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Failed to initialize decoder: ");
                        sb.append(valueOf);
                        b50.i("MediaCodecRenderer", sb.toString(), e2);
                        this.L.removeFirst();
                        a aVar = new a(this.A, (Throwable) e2, z2, peekFirst);
                        a aVar2 = this.M;
                        if (aVar2 == null) {
                            this.M = aVar;
                        } else {
                            this.M = aVar2.c(aVar);
                        }
                        if (this.L.isEmpty()) {
                            throw this.M;
                        }
                    }
                } else {
                    return;
                }
            }
            this.L = null;
            return;
        }
        throw new a(this.A, (Throwable) null, z2, -49999);
    }

    private static boolean B0(ps<vs> psVar, f0 f0Var) {
        vs e = psVar.e();
        if (e == null) {
            return true;
        }
        if (e.c) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(e.a, e.b);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(f0Var.m);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private void H0() {
        int i = this.k0;
        if (i == 1) {
            g0();
        } else if (i == 2) {
            a1();
        } else if (i != 3) {
            this.r0 = true;
            O0();
        } else {
            M0();
        }
    }

    private void J0() {
        if (v50.a < 21) {
            this.a0 = this.I.getOutputBuffers();
        }
    }

    private void K0() {
        this.n0 = true;
        MediaFormat outputFormat = this.I.getOutputFormat();
        if (this.O != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.X = true;
            return;
        }
        if (this.V) {
            outputFormat.setInteger("channel-count", 1);
        }
        E0(this.I, outputFormat);
    }

    private boolean L0(boolean z2) {
        g0 B2 = B();
        this.v.clear();
        int N2 = N(B2, this.v, z2);
        if (N2 == -5) {
            D0(B2);
            return true;
        } else if (N2 != -4 || !this.v.isEndOfStream()) {
            return false;
        } else {
            this.q0 = true;
            H0();
            return false;
        }
    }

    private void M0() {
        N0();
        z0();
    }

    private void P0() {
        if (v50.a < 21) {
            this.Z = null;
            this.a0 = null;
        }
    }

    private void Q0() {
        this.c0 = -1;
        this.u.f = null;
    }

    private int R(String str) {
        if (v50.a <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (v50.d.startsWith("SM-T585") || v50.d.startsWith("SM-A510") || v50.d.startsWith("SM-A520") || v50.d.startsWith("SM-J700"))) {
            return 2;
        }
        if (v50.a >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(v50.b) || "flounder_lte".equals(v50.b) || "grouper".equals(v50.b) || "tilapia".equals(v50.b)) ? 1 : 0;
        }
        return 0;
    }

    private void R0() {
        this.d0 = -1;
        this.e0 = null;
    }

    private static boolean S(String str, f0 f0Var) {
        return v50.a < 21 && f0Var.o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private void S0(ps<vs> psVar) {
        os.a(this.C, psVar);
        this.C = psVar;
    }

    private static boolean T(String str) {
        return (v50.a <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (v50.a <= 19 && (("hb2000".equals(v50.b) || "stvm8".equals(v50.b)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    private static boolean U(String str) {
        return v50.a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private void U0(ps<vs> psVar) {
        os.a(this.D, psVar);
        this.D = psVar;
    }

    private static boolean V(tx txVar) {
        String str = txVar.a;
        return (v50.a <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (v50.a <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ("Amazon".equals(v50.c) && "AFTS".equals(v50.d) && txVar.f);
    }

    private boolean V0(long j) {
        return this.G == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.G;
    }

    private static boolean W(String str) {
        int i = v50.a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (v50.a == 19 && v50.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean X(String str, f0 f0Var) {
        return v50.a <= 18 && f0Var.z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private boolean X0(boolean z2) {
        ps<vs> psVar = this.C;
        if (psVar == null || (!z2 && (this.r || psVar.c()))) {
            return false;
        }
        int state = this.C.getState();
        if (state != 1) {
            return state != 4;
        }
        throw z(this.C.f(), this.A);
    }

    private static boolean Y(String str) {
        return v50.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean Z(String str) {
        return v50.a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void Z0() {
        if (v50.a >= 23) {
            float n02 = n0(this.H, this.J, D());
            float f = this.K;
            if (f != n02) {
                if (n02 == -1.0f) {
                    c0();
                } else if (f != -1.0f || n02 > this.t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", n02);
                    this.I.setParameters(bundle);
                    this.K = n02;
                }
            }
        }
    }

    @TargetApi(23)
    private void a1() {
        vs e = this.D.e();
        if (e == null) {
            M0();
        } else if (v.e.equals(e.a)) {
            M0();
        } else if (!g0()) {
            try {
                this.E.setMediaDrmSession(e.b);
                S0(this.D);
                this.j0 = 0;
                this.k0 = 0;
            } catch (MediaCryptoException e2) {
                throw z(e2, this.A);
            }
        }
    }

    private void b0() {
        if (this.l0) {
            this.j0 = 1;
            this.k0 = 1;
        }
    }

    private void c0() {
        if (this.l0) {
            this.j0 = 1;
            this.k0 = 3;
            return;
        }
        M0();
    }

    private void d0() {
        if (v50.a < 23) {
            c0();
        } else if (this.l0) {
            this.j0 = 1;
            this.k0 = 2;
        } else {
            a1();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e0(long r19, long r21) {
        /*
            r18 = this;
            r14 = r18
            boolean r0 = r18.u0()
            r15 = 1
            r13 = 0
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r14.U
            if (r0 == 0) goto L_0x002b
            boolean r0 = r14.m0
            if (r0 == 0) goto L_0x002b
            android.media.MediaCodec r0 = r14.I     // Catch:{ IllegalStateException -> 0x001f }
            android.media.MediaCodec$BufferInfo r1 = r14.y     // Catch:{ IllegalStateException -> 0x001f }
            long r2 = r18.p0()     // Catch:{ IllegalStateException -> 0x001f }
            int r0 = r0.dequeueOutputBuffer(r1, r2)     // Catch:{ IllegalStateException -> 0x001f }
            goto L_0x0037
        L_0x001f:
            r18.H0()
            boolean r0 = r14.r0
            if (r0 == 0) goto L_0x002a
            r18.N0()
        L_0x002a:
            return r13
        L_0x002b:
            android.media.MediaCodec r0 = r14.I
            android.media.MediaCodec$BufferInfo r1 = r14.y
            long r2 = r18.p0()
            int r0 = r0.dequeueOutputBuffer(r1, r2)
        L_0x0037:
            if (r0 >= 0) goto L_0x0058
            r1 = -2
            if (r0 != r1) goto L_0x0040
            r18.K0()
            return r15
        L_0x0040:
            r1 = -3
            if (r0 != r1) goto L_0x0047
            r18.J0()
            return r15
        L_0x0047:
            boolean r0 = r14.Y
            if (r0 == 0) goto L_0x0057
            boolean r0 = r14.q0
            if (r0 != 0) goto L_0x0054
            int r0 = r14.j0
            r1 = 2
            if (r0 != r1) goto L_0x0057
        L_0x0054:
            r18.H0()
        L_0x0057:
            return r13
        L_0x0058:
            boolean r1 = r14.X
            if (r1 == 0) goto L_0x0064
            r14.X = r13
            android.media.MediaCodec r1 = r14.I
            r1.releaseOutputBuffer(r0, r13)
            return r15
        L_0x0064:
            android.media.MediaCodec$BufferInfo r1 = r14.y
            int r2 = r1.size
            if (r2 != 0) goto L_0x0074
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0074
            r18.H0()
            return r13
        L_0x0074:
            r14.d0 = r0
            java.nio.ByteBuffer r0 = r14.s0(r0)
            r14.e0 = r0
            if (r0 == 0) goto L_0x0091
            android.media.MediaCodec$BufferInfo r1 = r14.y
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r14.e0
            android.media.MediaCodec$BufferInfo r1 = r14.y
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0091:
            android.media.MediaCodec$BufferInfo r0 = r14.y
            long r0 = r0.presentationTimeUs
            boolean r0 = r14.w0(r0)
            r14.f0 = r0
            long r0 = r14.p0
            android.media.MediaCodec$BufferInfo r2 = r14.y
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r14.g0 = r0
            android.media.MediaCodec$BufferInfo r0 = r14.y
            long r0 = r0.presentationTimeUs
            r14.b1(r0)
        L_0x00b1:
            boolean r0 = r14.U
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r14.m0
            if (r0 == 0) goto L_0x00ed
            android.media.MediaCodec r5 = r14.I     // Catch:{ IllegalStateException -> 0x00e0 }
            java.nio.ByteBuffer r6 = r14.e0     // Catch:{ IllegalStateException -> 0x00e0 }
            int r7 = r14.d0     // Catch:{ IllegalStateException -> 0x00e0 }
            android.media.MediaCodec$BufferInfo r0 = r14.y     // Catch:{ IllegalStateException -> 0x00e0 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00e0 }
            android.media.MediaCodec$BufferInfo r0 = r14.y     // Catch:{ IllegalStateException -> 0x00e0 }
            long r9 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00e0 }
            boolean r11 = r14.f0     // Catch:{ IllegalStateException -> 0x00e0 }
            boolean r12 = r14.g0     // Catch:{ IllegalStateException -> 0x00e0 }
            com.google.android.exoplayer2.f0 r3 = r14.B     // Catch:{ IllegalStateException -> 0x00e0 }
            r0 = r18
            r1 = r19
            r16 = r3
            r3 = r21
            r17 = 0
            r13 = r16
            boolean r0 = r0.I0(r1, r3, r5, r6, r7, r8, r9, r11, r12, r13)     // Catch:{ IllegalStateException -> 0x00de }
            goto L_0x010b
        L_0x00de:
            goto L_0x00e2
        L_0x00e0:
            r17 = 0
        L_0x00e2:
            r18.H0()
            boolean r0 = r14.r0
            if (r0 == 0) goto L_0x00ec
            r18.N0()
        L_0x00ec:
            return r17
        L_0x00ed:
            r17 = 0
            android.media.MediaCodec r5 = r14.I
            java.nio.ByteBuffer r6 = r14.e0
            int r7 = r14.d0
            android.media.MediaCodec$BufferInfo r0 = r14.y
            int r8 = r0.flags
            long r9 = r0.presentationTimeUs
            boolean r11 = r14.f0
            boolean r12 = r14.g0
            com.google.android.exoplayer2.f0 r13 = r14.B
            r0 = r18
            r1 = r19
            r3 = r21
            boolean r0 = r0.I0(r1, r3, r5, r6, r7, r8, r9, r11, r12, r13)
        L_0x010b:
            if (r0 == 0) goto L_0x0128
            android.media.MediaCodec$BufferInfo r0 = r14.y
            long r0 = r0.presentationTimeUs
            r14.F0(r0)
            android.media.MediaCodec$BufferInfo r0 = r14.y
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x011e
            r13 = 1
            goto L_0x011f
        L_0x011e:
            r13 = 0
        L_0x011f:
            r18.R0()
            if (r13 != 0) goto L_0x0125
            return r15
        L_0x0125:
            r18.H0()
        L_0x0128:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.e0(long, long):boolean");
    }

    private boolean f0() {
        int i;
        int i2;
        MediaCodec mediaCodec = this.I;
        if (mediaCodec == null || this.j0 == 2 || this.q0) {
            return false;
        }
        if (this.c0 < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.c0 = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            this.u.f = r0(dequeueInputBuffer);
            this.u.clear();
        }
        if (this.j0 == 1) {
            if (!this.Y) {
                this.m0 = true;
                this.I.queueInputBuffer(this.c0, 0, 0, 0, 4);
                Q0();
            }
            this.j0 = 2;
            return false;
        } else if (this.W) {
            this.W = false;
            this.u.f.put(y0);
            this.I.queueInputBuffer(this.c0, 0, y0.length, 0, 0);
            Q0();
            this.l0 = true;
            return true;
        } else {
            g0 B2 = B();
            if (this.s0) {
                i2 = -4;
                i = 0;
            } else {
                if (this.i0 == 1) {
                    for (int i3 = 0; i3 < this.J.o.size(); i3++) {
                        this.u.f.put(this.J.o.get(i3));
                    }
                    this.i0 = 2;
                }
                i = this.u.f.position();
                i2 = N(B2, this.u, false);
            }
            if (k()) {
                this.p0 = this.o0;
            }
            if (i2 == -3) {
                return false;
            }
            if (i2 == -5) {
                if (this.i0 == 2) {
                    this.u.clear();
                    this.i0 = 1;
                }
                D0(B2);
                return true;
            } else if (this.u.isEndOfStream()) {
                if (this.i0 == 2) {
                    this.u.clear();
                    this.i0 = 1;
                }
                this.q0 = true;
                if (!this.l0) {
                    H0();
                    return false;
                }
                try {
                    if (!this.Y) {
                        this.m0 = true;
                        this.I.queueInputBuffer(this.c0, 0, 0, 0, 4);
                        Q0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw z(e, this.A);
                }
            } else if (!this.t0 || this.u.isKeyFrame()) {
                this.t0 = false;
                boolean m = this.u.m();
                boolean X0 = X0(m);
                this.s0 = X0;
                if (X0) {
                    return false;
                }
                if (this.Q && !m) {
                    f50.b(this.u.f);
                    if (this.u.f.position() == 0) {
                        return true;
                    }
                    this.Q = false;
                }
                try {
                    long j = this.u.h;
                    if (this.u.isDecodeOnly()) {
                        this.x.add(Long.valueOf(j));
                    }
                    if (this.u0) {
                        this.w.a(j, this.A);
                        this.u0 = false;
                    }
                    this.o0 = Math.max(this.o0, j);
                    this.u.l();
                    if (this.u.hasSupplementalData()) {
                        t0(this.u);
                    }
                    G0(this.u);
                    if (m) {
                        this.I.queueSecureInputBuffer(this.c0, 0, q0(this.u, i), j, 0);
                    } else {
                        this.I.queueInputBuffer(this.c0, 0, this.u.f.limit(), j, 0);
                    }
                    Q0();
                    this.l0 = true;
                    this.i0 = 0;
                    this.x0.c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw z(e2, this.A);
                }
            } else {
                this.u.clear();
                if (this.i0 == 2) {
                    this.i0 = 1;
                }
                return true;
            }
        }
    }

    private List<tx> i0(boolean z2) {
        List<tx> o02 = o0(this.p, this.A, z2);
        if (o02.isEmpty() && z2) {
            o02 = o0(this.p, this.A, false);
            if (!o02.isEmpty()) {
                String str = this.A.m;
                String valueOf = String.valueOf(o02);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99 + String.valueOf(valueOf).length());
                sb.append("Drm session requires secure decoder for ");
                sb.append(str);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(valueOf);
                sb.append(".");
                b50.h("MediaCodecRenderer", sb.toString());
            }
        }
        return o02;
    }

    private void k0(MediaCodec mediaCodec) {
        if (v50.a < 21) {
            this.Z = mediaCodec.getInputBuffers();
            this.a0 = mediaCodec.getOutputBuffers();
        }
    }

    private static MediaCodec.CryptoInfo q0(as asVar, int i) {
        MediaCodec.CryptoInfo a2 = asVar.e.a();
        if (i == 0) {
            return a2;
        }
        if (a2.numBytesOfClearData == null) {
            a2.numBytesOfClearData = new int[1];
        }
        int[] iArr = a2.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return a2;
    }

    private ByteBuffer r0(int i) {
        return v50.a >= 21 ? this.I.getInputBuffer(i) : this.Z[i];
    }

    private ByteBuffer s0(int i) {
        return v50.a >= 21 ? this.I.getOutputBuffer(i) : this.a0[i];
    }

    private boolean u0() {
        return this.d0 >= 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void v0(defpackage.tx r17, android.media.MediaCrypto r18) {
        /*
            r16 = this;
            r7 = r16
            r0 = r17
            java.lang.String r8 = r0.a
            int r1 = defpackage.v50.a
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 23
            if (r1 >= r3) goto L_0x0011
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x001d
        L_0x0011:
            float r1 = r7.H
            com.google.android.exoplayer2.f0 r3 = r7.A
            com.google.android.exoplayer2.f0[] r4 = r16.D()
            float r1 = r7.n0(r1, r3, r4)
        L_0x001d:
            float r3 = r7.t
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0026
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0027
        L_0x0026:
            r9 = r1
        L_0x0027:
            r1 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0110 }
            java.lang.String r2 = "createCodec:"
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0110 }
            int r4 = r3.length()     // Catch:{ Exception -> 0x0110 }
            if (r4 == 0) goto L_0x003d
            java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0110 }
            goto L_0x0043
        L_0x003d:
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0110 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0110 }
            r2 = r3
        L_0x0043:
            defpackage.t50.a(r2)     // Catch:{ Exception -> 0x0110 }
            android.media.MediaCodec r12 = android.media.MediaCodec.createByCodecName(r8)     // Catch:{ Exception -> 0x0110 }
            defpackage.t50.c()     // Catch:{ Exception -> 0x010d }
            java.lang.String r1 = "configureCodec"
            defpackage.t50.a(r1)     // Catch:{ Exception -> 0x010d }
            com.google.android.exoplayer2.f0 r4 = r7.A     // Catch:{ Exception -> 0x010d }
            r1 = r16
            r2 = r17
            r3 = r12
            r5 = r18
            r6 = r9
            r1.a0(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x010d }
            defpackage.t50.c()     // Catch:{ Exception -> 0x010d }
            java.lang.String r1 = "startCodec"
            defpackage.t50.a(r1)     // Catch:{ Exception -> 0x010d }
            r12.start()     // Catch:{ Exception -> 0x010d }
            defpackage.t50.c()     // Catch:{ Exception -> 0x010d }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x010d }
            r7.k0(r12)     // Catch:{ Exception -> 0x010d }
            r7.I = r12
            r7.N = r0
            r7.K = r9
            com.google.android.exoplayer2.f0 r1 = r7.A
            r7.J = r1
            int r1 = r7.R(r8)
            r7.O = r1
            boolean r1 = Y(r8)
            r7.P = r1
            com.google.android.exoplayer2.f0 r1 = r7.J
            boolean r1 = S(r8, r1)
            r7.Q = r1
            boolean r1 = W(r8)
            r7.R = r1
            boolean r1 = Z(r8)
            r7.S = r1
            boolean r1 = T(r8)
            r7.T = r1
            boolean r1 = U(r8)
            r7.U = r1
            com.google.android.exoplayer2.f0 r1 = r7.J
            boolean r1 = X(r8, r1)
            r7.V = r1
            boolean r0 = V(r17)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x00c3
            boolean r0 = r16.m0()
            if (r0 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r0 = 0
            goto L_0x00c4
        L_0x00c3:
            r0 = 1
        L_0x00c4:
            r7.Y = r0
            r16.Q0()
            r16.R0()
            int r0 = r16.getState()
            r5 = 2
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 != r5) goto L_0x00e0
            long r5 = android.os.SystemClock.elapsedRealtime()
            r14 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 + r14
            goto L_0x00e1
        L_0x00e0:
            r5 = r12
        L_0x00e1:
            r7.b0 = r5
            r7.h0 = r2
            r7.i0 = r2
            r7.m0 = r2
            r7.l0 = r2
            r7.o0 = r12
            r7.p0 = r12
            r7.j0 = r2
            r7.k0 = r2
            r7.W = r2
            r7.X = r2
            r7.f0 = r2
            r7.g0 = r2
            r7.t0 = r1
            zr r0 = r7.x0
            int r2 = r0.a
            int r2 = r2 + r1
            r0.a = r2
            long r5 = r3 - r10
            r1 = r16
            r2 = r8
            r1.C0(r2, r3, r5)
            return
        L_0x010d:
            r0 = move-exception
            r1 = r12
            goto L_0x0111
        L_0x0110:
            r0 = move-exception
        L_0x0111:
            if (r1 == 0) goto L_0x0119
            r16.P0()
            r1.release()
        L_0x0119:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.v0(tx, android.media.MediaCrypto):void");
    }

    private boolean w0(long j) {
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            if (this.x.get(i).longValue() == j) {
                this.x.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean x0(IllegalStateException illegalStateException) {
        if (v50.a >= 21 && y0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @TargetApi(21)
    private static boolean y0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* access modifiers changed from: protected */
    public abstract void C0(String str, long j, long j2);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009d, code lost:
        if (r1.s == r2.s) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D0(com.google.android.exoplayer2.g0 r5) {
        /*
            r4 = this;
            r0 = 1
            r4.u0 = r0
            com.google.android.exoplayer2.f0 r1 = r5.c
            defpackage.q40.e(r1)
            com.google.android.exoplayer2.f0 r1 = (com.google.android.exoplayer2.f0) r1
            boolean r2 = r5.a
            if (r2 == 0) goto L_0x0014
            ps<?> r5 = r5.b
            r4.U0(r5)
            goto L_0x0020
        L_0x0014:
            com.google.android.exoplayer2.f0 r5 = r4.A
            rs<vs> r2 = r4.q
            ps<vs> r3 = r4.D
            ps r5 = r4.E(r5, r1, r2, r3)
            r4.D = r5
        L_0x0020:
            r4.A = r1
            android.media.MediaCodec r5 = r4.I
            if (r5 != 0) goto L_0x002a
            r4.z0()
            return
        L_0x002a:
            ps<vs> r5 = r4.D
            if (r5 != 0) goto L_0x0032
            ps<vs> r5 = r4.C
            if (r5 != 0) goto L_0x0058
        L_0x0032:
            ps<vs> r5 = r4.D
            if (r5 == 0) goto L_0x003a
            ps<vs> r5 = r4.C
            if (r5 == 0) goto L_0x0058
        L_0x003a:
            ps<vs> r5 = r4.D
            ps<vs> r2 = r4.C
            if (r5 == r2) goto L_0x004c
            tx r2 = r4.N
            boolean r2 = r2.f
            if (r2 != 0) goto L_0x004c
            boolean r5 = B0(r5, r1)
            if (r5 != 0) goto L_0x0058
        L_0x004c:
            int r5 = defpackage.v50.a
            r2 = 23
            if (r5 >= r2) goto L_0x005c
            ps<vs> r5 = r4.D
            ps<vs> r2 = r4.C
            if (r5 == r2) goto L_0x005c
        L_0x0058:
            r4.c0()
            return
        L_0x005c:
            android.media.MediaCodec r5 = r4.I
            tx r2 = r4.N
            com.google.android.exoplayer2.f0 r3 = r4.J
            int r5 = r4.Q(r5, r2, r3, r1)
            if (r5 == 0) goto L_0x00c2
            if (r5 == r0) goto L_0x00af
            r2 = 2
            if (r5 == r2) goto L_0x0082
            r0 = 3
            if (r5 != r0) goto L_0x007c
            r4.J = r1
            r4.Z0()
            ps<vs> r5 = r4.D
            ps<vs> r0 = r4.C
            if (r5 == r0) goto L_0x00c5
            goto L_0x00ba
        L_0x007c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x0082:
            boolean r5 = r4.P
            if (r5 == 0) goto L_0x0087
            goto L_0x00c2
        L_0x0087:
            r4.h0 = r0
            r4.i0 = r0
            int r5 = r4.O
            if (r5 == r2) goto L_0x00a1
            if (r5 != r0) goto L_0x00a0
            int r5 = r1.r
            com.google.android.exoplayer2.f0 r2 = r4.J
            int r3 = r2.r
            if (r5 != r3) goto L_0x00a0
            int r5 = r1.s
            int r2 = r2.s
            if (r5 != r2) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r0 = 0
        L_0x00a1:
            r4.W = r0
            r4.J = r1
            r4.Z0()
            ps<vs> r5 = r4.D
            ps<vs> r0 = r4.C
            if (r5 == r0) goto L_0x00c5
            goto L_0x00ba
        L_0x00af:
            r4.J = r1
            r4.Z0()
            ps<vs> r5 = r4.D
            ps<vs> r0 = r4.C
            if (r5 == r0) goto L_0x00be
        L_0x00ba:
            r4.d0()
            goto L_0x00c5
        L_0x00be:
            r4.b0()
            goto L_0x00c5
        L_0x00c2:
            r4.c0()
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.D0(com.google.android.exoplayer2.g0):void");
    }

    /* access modifiers changed from: protected */
    public abstract void E0(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public abstract void F0(long j);

    /* access modifiers changed from: protected */
    public void G() {
        this.A = null;
        if (this.D == null && this.C == null) {
            h0();
        } else {
            J();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void G0(as asVar);

    /* access modifiers changed from: protected */
    public void H(boolean z2) {
        rs<vs> rsVar = this.q;
        if (rsVar != null && !this.z) {
            this.z = true;
            rsVar.t();
        }
        this.x0 = new zr();
    }

    /* access modifiers changed from: protected */
    public void I(long j, boolean z2) {
        this.q0 = false;
        this.r0 = false;
        this.w0 = false;
        g0();
        this.w.c();
    }

    /* access modifiers changed from: protected */
    public abstract boolean I0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z2, boolean z3, f0 f0Var);

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public void J() {
        try {
            N0();
            U0((ps<vs>) null);
            rs<vs> rsVar = this.q;
            if (rsVar != null && this.z) {
                this.z = false;
                rsVar.a();
            }
        } catch (Throwable th) {
            U0((ps<vs>) null);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void K() {
    }

    /* access modifiers changed from: protected */
    public void L() {
    }

    /* access modifiers changed from: protected */
    public void N0() {
        this.L = null;
        this.N = null;
        this.J = null;
        this.n0 = false;
        Q0();
        R0();
        P0();
        this.s0 = false;
        this.b0 = -9223372036854775807L;
        this.x.clear();
        this.o0 = -9223372036854775807L;
        this.p0 = -9223372036854775807L;
        try {
            if (this.I != null) {
                this.x0.b++;
                if (!this.v0) {
                    this.I.stop();
                }
                this.I.release();
            }
            this.I = null;
            try {
                if (this.E != null) {
                    this.E.release();
                }
            } finally {
                this.E = null;
                this.F = false;
                S0((ps<vs>) null);
            }
        } catch (Throwable th) {
            this.I = null;
            try {
                if (this.E != null) {
                    this.E.release();
                }
                throw th;
            } finally {
                this.E = null;
                this.F = false;
                S0((ps<vs>) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void O0() {
    }

    /* access modifiers changed from: protected */
    public abstract int Q(MediaCodec mediaCodec, tx txVar, f0 f0Var, f0 f0Var2);

    /* access modifiers changed from: protected */
    public final void T0() {
        this.w0 = true;
    }

    /* access modifiers changed from: protected */
    public boolean W0(tx txVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract int Y0(vx vxVar, rs<vs> rsVar, f0 f0Var);

    /* access modifiers changed from: protected */
    public abstract void a0(tx txVar, MediaCodec mediaCodec, f0 f0Var, MediaCrypto mediaCrypto, float f);

    public final int b(f0 f0Var) {
        try {
            return Y0(this.p, this.q, f0Var);
        } catch (wx.c e) {
            throw z(e, f0Var);
        }
    }

    /* access modifiers changed from: protected */
    public final f0 b1(long j) {
        f0 i = this.w.i(j);
        if (i != null) {
            this.B = i;
        }
        return i;
    }

    public boolean c() {
        return this.r0;
    }

    public boolean f() {
        return this.A != null && !this.s0 && (F() || u0() || (this.b0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.b0));
    }

    /* access modifiers changed from: protected */
    public final boolean g0() {
        boolean h02 = h0();
        if (h02) {
            z0();
        }
        return h02;
    }

    /* access modifiers changed from: protected */
    public boolean h0() {
        if (this.I == null) {
            return false;
        }
        if (this.k0 == 3 || this.R || ((this.S && !this.n0) || (this.T && this.m0))) {
            N0();
            return true;
        }
        this.I.flush();
        Q0();
        R0();
        this.b0 = -9223372036854775807L;
        this.m0 = false;
        this.l0 = false;
        this.t0 = true;
        this.W = false;
        this.X = false;
        this.f0 = false;
        this.g0 = false;
        this.s0 = false;
        this.x.clear();
        this.o0 = -9223372036854775807L;
        this.p0 = -9223372036854775807L;
        this.j0 = 0;
        this.k0 = 0;
        this.i0 = this.h0 ? 1 : 0;
        return false;
    }

    /* access modifiers changed from: protected */
    public final MediaCodec j0() {
        return this.I;
    }

    /* access modifiers changed from: protected */
    public final tx l0() {
        return this.N;
    }

    /* access modifiers changed from: protected */
    public boolean m0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract float n0(float f, f0 f0Var, f0[] f0VarArr);

    /* access modifiers changed from: protected */
    public abstract List<tx> o0(vx vxVar, f0 f0Var, boolean z2);

    public final int p() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public long p0() {
        return 0;
    }

    public void q(long j, long j2) {
        if (this.w0) {
            this.w0 = false;
            H0();
        }
        try {
            if (this.r0) {
                O0();
            } else if (this.A != null || L0(true)) {
                z0();
                if (this.I != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    t50.a("drainAndFeed");
                    while (e0(j, j2)) {
                    }
                    while (f0() && V0(elapsedRealtime)) {
                    }
                    t50.c();
                } else {
                    this.x0.d += O(j);
                    L0(false);
                }
                this.x0.a();
            }
        } catch (IllegalStateException e) {
            if (x0(e)) {
                throw z(e, this.A);
            }
            throw e;
        }
    }

    public final void s(float f) {
        this.H = f;
        if (this.I != null && this.k0 != 3 && getState() != 0) {
            Z0();
        }
    }

    /* access modifiers changed from: protected */
    public void t0(as asVar) {
    }

    /* access modifiers changed from: protected */
    public final void z0() {
        if (this.I == null && this.A != null) {
            S0(this.D);
            String str = this.A.m;
            ps<vs> psVar = this.C;
            if (psVar != null) {
                if (this.E == null) {
                    vs e = psVar.e();
                    if (e != null) {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(e.a, e.b);
                            this.E = mediaCrypto;
                            this.F = !e.c && mediaCrypto.requiresSecureDecoderComponent(str);
                        } catch (MediaCryptoException e2) {
                            throw z(e2, this.A);
                        }
                    } else if (this.C.f() == null) {
                        return;
                    }
                }
                if (vs.d) {
                    int state = this.C.getState();
                    if (state == 1) {
                        throw z(this.C.f(), this.A);
                    } else if (state != 4) {
                        return;
                    }
                }
            }
            try {
                A0(this.E, this.F);
            } catch (a e3) {
                throw z(e3, this.A);
            }
        }
    }
}
