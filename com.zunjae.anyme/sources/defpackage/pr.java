package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.v0;
import defpackage.fr;
import defpackage.gr;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: pr  reason: default package */
public class pr extends ux implements d50 {
    /* access modifiers changed from: private */
    public final fr.a A0;
    private final gr B0;
    private final long[] C0 = new long[10];
    private int D0;
    private boolean E0;
    private boolean F0;
    private boolean G0;
    private MediaFormat H0;
    private f0 I0;
    private long J0;
    private boolean K0;
    /* access modifiers changed from: private */
    public boolean L0;
    private long M0 = -9223372036854775807L;
    private int N0;
    private final Context z0;

    /* renamed from: pr$b */
    private final class b implements gr.c {
        private b() {
        }

        public void a(int i) {
            pr.this.A0.a(i);
            pr.this.o1(i);
        }

        public void b(int i, long j, long j2) {
            pr.this.A0.b(i, j, j2);
            pr.this.q1(i, j, j2);
        }

        public void c() {
            pr.this.p1();
            boolean unused = pr.this.L0 = true;
        }
    }

    @Deprecated
    public pr(Context context, vx vxVar, rs<vs> rsVar, boolean z, boolean z2, Handler handler, fr frVar, gr grVar) {
        super(1, vxVar, rsVar, z, z2, 44100.0f);
        this.z0 = context.getApplicationContext();
        this.B0 = grVar;
        this.A0 = new fr.a(handler, frVar);
        grVar.t(new b());
    }

    private static boolean g1(String str) {
        return v50.a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(v50.c) && (v50.b.startsWith("zeroflte") || v50.b.startsWith("herolte") || v50.b.startsWith("heroqlte"));
    }

    private static boolean h1(String str) {
        return v50.a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(v50.c) && (v50.b.startsWith("baffin") || v50.b.startsWith("grand") || v50.b.startsWith("fortuna") || v50.b.startsWith("gprimelte") || v50.b.startsWith("j2y18lte") || v50.b.startsWith("ms01"));
    }

    private static boolean i1() {
        return v50.a == 23 && ("ZTE B2017G".equals(v50.d) || "AXON 7 mini".equals(v50.d));
    }

    private int j1(tx txVar, f0 f0Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(txVar.a) || (i = v50.a) >= 24 || (i == 23 && v50.h0(this.z0))) {
            return f0Var.n;
        }
        return -1;
    }

    private static int n1(f0 f0Var) {
        if ("audio/raw".equals(f0Var.m)) {
            return f0Var.B;
        }
        return 2;
    }

    private void r1() {
        long l = this.B0.l(c());
        if (l != Long.MIN_VALUE) {
            if (!this.L0) {
                l = Math.max(this.J0, l);
            }
            this.J0 = l;
            this.L0 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void C0(String str, long j, long j2) {
        this.A0.c(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public void D0(g0 g0Var) {
        super.D0(g0Var);
        f0 f0Var = g0Var.c;
        this.I0 = f0Var;
        this.A0.f(f0Var);
    }

    /* access modifiers changed from: protected */
    public void E0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.H0;
        if (mediaFormat2 != null) {
            i = m1(mediaFormat2.getInteger("channel-count"), mediaFormat2.getString("mime"));
            mediaFormat = mediaFormat2;
        } else {
            i = mediaFormat.containsKey("v-bits-per-sample") ? v50.P(mediaFormat.getInteger("v-bits-per-sample")) : n1(this.I0);
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.F0 || integer != 6 || (i2 = this.I0.z) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i2];
            for (int i3 = 0; i3 < this.I0.z; i3++) {
                iArr[i3] = i3;
            }
        }
        try {
            this.B0.i(i, integer, integer2, 0, iArr, this.I0.C, this.I0.D);
        } catch (gr.a e) {
            throw z(e, this.I0);
        }
    }

    /* access modifiers changed from: protected */
    public void F0(long j) {
        while (this.N0 != 0 && j >= this.C0[0]) {
            this.B0.p();
            int i = this.N0 - 1;
            this.N0 = i;
            long[] jArr = this.C0;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
        try {
            this.M0 = -9223372036854775807L;
            this.N0 = 0;
            this.B0.flush();
            try {
                super.G();
            } finally {
                this.A0.d(this.x0);
            }
        } catch (Throwable th) {
            super.G();
            throw th;
        } finally {
            this.A0.d(this.x0);
        }
    }

    /* access modifiers changed from: protected */
    public void G0(as asVar) {
        if (this.K0 && !asVar.isDecodeOnly()) {
            if (Math.abs(asVar.h - this.J0) > 500000) {
                this.J0 = asVar.h;
            }
            this.K0 = false;
        }
        this.M0 = Math.max(asVar.h, this.M0);
    }

    /* access modifiers changed from: protected */
    public void H(boolean z) {
        super.H(z);
        this.A0.e(this.x0);
        int i = A().a;
        if (i != 0) {
            this.B0.s(i);
        } else {
            this.B0.m();
        }
    }

    /* access modifiers changed from: protected */
    public void I(long j, boolean z) {
        super.I(j, z);
        this.B0.flush();
        this.J0 = j;
        this.K0 = true;
        this.L0 = true;
        this.M0 = -9223372036854775807L;
        this.N0 = 0;
    }

    /* access modifiers changed from: protected */
    public boolean I0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, f0 f0Var) {
        if (this.G0 && j3 == 0 && (i2 & 4) != 0) {
            long j4 = this.M0;
            if (j4 != -9223372036854775807L) {
                j3 = j4;
            }
        }
        if (this.E0 && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.x0.f++;
            this.B0.p();
            return true;
        } else {
            try {
                if (!this.B0.r(byteBuffer, j3)) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                this.x0.e++;
                return true;
            } catch (gr.b | gr.d e) {
                throw z(e, this.I0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void J() {
        try {
            super.J();
        } finally {
            this.B0.a();
        }
    }

    /* access modifiers changed from: protected */
    public void K() {
        super.K();
        this.B0.D();
    }

    /* access modifiers changed from: protected */
    public void L() {
        r1();
        this.B0.n();
        super.L();
    }

    /* access modifiers changed from: protected */
    public void M(f0[] f0VarArr, long j) {
        super.M(f0VarArr, j);
        if (this.M0 != -9223372036854775807L) {
            int i = this.N0;
            long[] jArr = this.C0;
            if (i == jArr.length) {
                long j2 = jArr[i - 1];
                StringBuilder sb = new StringBuilder(67);
                sb.append("Too many stream changes, so dropping change at ");
                sb.append(j2);
                b50.h("MediaCodecAudioRenderer", sb.toString());
            } else {
                this.N0 = i + 1;
            }
            this.C0[this.N0 - 1] = this.M0;
        }
    }

    /* access modifiers changed from: protected */
    public void O0() {
        try {
            this.B0.j();
        } catch (gr.d e) {
            throw z(e, this.I0);
        }
    }

    /* access modifiers changed from: protected */
    public int Q(MediaCodec mediaCodec, tx txVar, f0 f0Var, f0 f0Var2) {
        if (j1(txVar, f0Var2) <= this.D0 && f0Var.C == 0 && f0Var.D == 0 && f0Var2.C == 0 && f0Var2.D == 0) {
            if (txVar.o(f0Var, f0Var2, true)) {
                return 3;
            }
            if (f1(f0Var, f0Var2)) {
                return 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int Y0(vx vxVar, rs<vs> rsVar, f0 f0Var) {
        String str = f0Var.m;
        if (!e50.l(str)) {
            return v0.a(0);
        }
        int i = v50.a >= 21 ? 32 : 0;
        boolean z = f0Var.p == null || vs.class.equals(f0Var.G) || (f0Var.G == null && u.P(rsVar, f0Var.p));
        int i2 = 8;
        int i3 = 4;
        if (z && e1(f0Var.z, str) && vxVar.a() != null) {
            return v0.b(4, 8, i);
        }
        if (("audio/raw".equals(str) && !this.B0.h(f0Var.z, f0Var.B)) || !this.B0.h(f0Var.z, 2)) {
            return v0.a(1);
        }
        List<tx> o0 = o0(vxVar, f0Var, false);
        if (o0.isEmpty()) {
            return v0.a(1);
        }
        if (!z) {
            return v0.a(2);
        }
        tx txVar = o0.get(0);
        boolean l = txVar.l(f0Var);
        if (l && txVar.n(f0Var)) {
            i2 = 16;
        }
        if (!l) {
            i3 = 3;
        }
        return v0.b(i3, i2, i);
    }

    /* access modifiers changed from: protected */
    public void a0(tx txVar, MediaCodec mediaCodec, f0 f0Var, MediaCrypto mediaCrypto, float f) {
        this.D0 = k1(txVar, f0Var, D());
        this.F0 = g1(txVar.a);
        this.G0 = h1(txVar.a);
        boolean z = txVar.g;
        this.E0 = z;
        MediaFormat l1 = l1(f0Var, z ? "audio/raw" : txVar.c, this.D0, f);
        mediaCodec.configure(l1, (Surface) null, mediaCrypto, 0);
        if (this.E0) {
            this.H0 = l1;
            l1.setString("mime", f0Var.m);
            return;
        }
        this.H0 = null;
    }

    public boolean c() {
        return super.c() && this.B0.c();
    }

    public o0 e() {
        return this.B0.e();
    }

    /* access modifiers changed from: protected */
    public boolean e1(int i, String str) {
        return m1(i, str) != 0;
    }

    public boolean f() {
        return this.B0.k() || super.f();
    }

    /* access modifiers changed from: protected */
    public boolean f1(f0 f0Var, f0 f0Var2) {
        return v50.b(f0Var.m, f0Var2.m) && f0Var.z == f0Var2.z && f0Var.A == f0Var2.A && f0Var.B == f0Var2.B && f0Var.M(f0Var2) && !"audio/opus".equals(f0Var.m);
    }

    public void g(o0 o0Var) {
        this.B0.g(o0Var);
    }

    /* access modifiers changed from: protected */
    public int k1(tx txVar, f0 f0Var, f0[] f0VarArr) {
        int j1 = j1(txVar, f0Var);
        if (f0VarArr.length == 1) {
            return j1;
        }
        for (f0 f0Var2 : f0VarArr) {
            if (txVar.o(f0Var, f0Var2, false)) {
                j1 = Math.max(j1, j1(txVar, f0Var2));
            }
        }
        return j1;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    public MediaFormat l1(f0 f0Var, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", f0Var.z);
        mediaFormat.setInteger("sample-rate", f0Var.A);
        xx.e(mediaFormat, f0Var.o);
        xx.d(mediaFormat, "max-input-size", i);
        if (v50.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !i1()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (v50.a <= 28 && "audio/ac4".equals(f0Var.m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public int m1(int i, String str) {
        if ("audio/eac3-joc".equals(str)) {
            if (this.B0.h(-1, 18)) {
                return e50.d("audio/eac3-joc");
            }
            str = "audio/eac3";
        }
        int d = e50.d(str);
        if (this.B0.h(i, d)) {
            return d;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public float n0(float f, f0 f0Var, f0[] f0VarArr) {
        int i = -1;
        for (f0 f0Var2 : f0VarArr) {
            int i2 = f0Var2.A;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    public long o() {
        if (getState() == 2) {
            r1();
        }
        return this.J0;
    }

    /* access modifiers changed from: protected */
    public List<tx> o0(vx vxVar, f0 f0Var, boolean z) {
        tx a2;
        String str = f0Var.m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (e1(f0Var.z, str) && (a2 = vxVar.a()) != null) {
            return Collections.singletonList(a2);
        }
        List<tx> l = wx.l(vxVar.b(str, z, false), f0Var);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(l);
            arrayList.addAll(vxVar.b("audio/eac3", z, false));
            l = arrayList;
        }
        return Collections.unmodifiableList(l);
    }

    /* access modifiers changed from: protected */
    public void o1(int i) {
    }

    /* access modifiers changed from: protected */
    public void p1() {
    }

    /* access modifiers changed from: protected */
    public void q1(int i, long j, long j2) {
    }

    public void r(int i, Object obj) {
        if (i == 2) {
            this.B0.q(((Float) obj).floatValue());
        } else if (i == 3) {
            this.B0.o((br) obj);
        } else if (i != 5) {
            super.r(i, obj);
        } else {
            this.B0.u((jr) obj);
        }
    }

    public d50 x() {
        return this;
    }
}
