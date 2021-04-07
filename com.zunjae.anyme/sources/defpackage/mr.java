package defpackage;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.exoplayer2.o0;
import defpackage.er;
import defpackage.gr;
import defpackage.ir;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: mr  reason: default package */
public final class mr implements gr {
    public static boolean S = false;
    public static boolean T = false;
    private int A;
    private int B;
    private long C;
    private float D;
    private er[] E;
    private ByteBuffer[] F;
    private ByteBuffer G;
    private ByteBuffer H;
    private byte[] I;
    private int J;
    private int K;
    private boolean L;
    private boolean M;
    private boolean N;
    private int O;
    private jr P;
    private boolean Q;
    /* access modifiers changed from: private */
    public long R;
    private final cr a;
    private final c b;
    private final boolean c;
    private final lr d;
    private final ur e;
    private final er[] f;
    private final er[] g;
    /* access modifiers changed from: private */
    public final ConditionVariable h;
    private final ir i;
    private final ArrayDeque<g> j;
    /* access modifiers changed from: private */
    public gr.c k;
    private AudioTrack l;
    private d m;
    private d n;
    private AudioTrack o;
    private br p;
    private o0 q;
    private o0 r;
    private long s;
    private long t;
    private ByteBuffer u;
    private int v;
    private long w;
    private long x;
    private long y;
    private long z;

    /* renamed from: mr$a */
    class a extends Thread {
        final /* synthetic */ AudioTrack e;

        a(AudioTrack audioTrack) {
            this.e = audioTrack;
        }

        public void run() {
            try {
                this.e.flush();
                this.e.release();
            } finally {
                mr.this.h.open();
            }
        }
    }

    /* renamed from: mr$b */
    class b extends Thread {
        final /* synthetic */ AudioTrack e;

        b(mr mrVar, AudioTrack audioTrack) {
            this.e = audioTrack;
        }

        public void run() {
            this.e.release();
        }
    }

    /* renamed from: mr$c */
    public interface c {
        o0 a(o0 o0Var);

        long b(long j);

        long c();

        er[] d();
    }

    /* renamed from: mr$d */
    private static final class d {
        public final boolean a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;
        public final boolean j;
        public final er[] k;

        public d(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z2, boolean z3, er[] erVarArr) {
            this.a = z;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8 == 0 ? f() : i8;
            this.i = z2;
            this.j = z3;
            this.k = erVarArr;
        }

        @TargetApi(21)
        private AudioTrack c(boolean z, br brVar, int i2) {
            return new AudioTrack(z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : brVar.a(), new AudioFormat.Builder().setChannelMask(this.f).setEncoding(this.g).setSampleRate(this.e).build(), this.h, 1, i2 != 0 ? i2 : 0);
        }

        private int f() {
            if (this.a) {
                int minBufferSize = AudioTrack.getMinBufferSize(this.e, this.f, this.g);
                q40.f(minBufferSize != -2);
                return v50.o(minBufferSize * 4, ((int) d(250000)) * this.d, (int) Math.max((long) minBufferSize, d(750000) * ((long) this.d)));
            }
            int d2 = mr.G(this.g);
            if (this.g == 5) {
                d2 *= 2;
            }
            return (int) ((((long) d2) * 250000) / 1000000);
        }

        public AudioTrack a(boolean z, br brVar, int i2) {
            AudioTrack audioTrack;
            if (v50.a >= 21) {
                audioTrack = c(z, brVar, i2);
            } else {
                int S = v50.S(brVar.c);
                int i3 = this.e;
                int i4 = this.f;
                int i5 = this.g;
                int i6 = this.h;
                if (i2 != 0) {
                    audioTrack = new AudioTrack(S, i3, i4, i5, i6, 1, i2);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new gr.b(state, this.e, this.f, this.h);
        }

        public boolean b(d dVar) {
            return dVar.g == this.g && dVar.e == this.e && dVar.f == this.f;
        }

        public long d(long j2) {
            return (j2 * ((long) this.e)) / 1000000;
        }

        public long e(long j2) {
            return (j2 * 1000000) / ((long) this.e);
        }

        public long g(long j2) {
            return (j2 * 1000000) / ((long) this.c);
        }
    }

    /* renamed from: mr$e */
    public static class e implements c {
        private final er[] a;
        private final rr b;
        private final tr c;

        public e(er... erVarArr) {
            this(erVarArr, new rr(), new tr());
        }

        public e(er[] erVarArr, rr rrVar, tr trVar) {
            er[] erVarArr2 = new er[(erVarArr.length + 2)];
            this.a = erVarArr2;
            System.arraycopy(erVarArr, 0, erVarArr2, 0, erVarArr.length);
            this.b = rrVar;
            this.c = trVar;
            er[] erVarArr3 = this.a;
            erVarArr3[erVarArr.length] = rrVar;
            erVarArr3[erVarArr.length + 1] = trVar;
        }

        public o0 a(o0 o0Var) {
            this.b.w(o0Var.c);
            return new o0(this.c.j(o0Var.a), this.c.i(o0Var.b), o0Var.c);
        }

        public long b(long j) {
            return this.c.h(j);
        }

        public long c() {
            return this.b.q();
        }

        public er[] d() {
            return this.a;
        }
    }

    /* renamed from: mr$f */
    public static final class f extends RuntimeException {
        private f(String str) {
            super(str);
        }

        /* synthetic */ f(String str, a aVar) {
            this(str);
        }
    }

    /* renamed from: mr$g */
    private static final class g {
        /* access modifiers changed from: private */
        public final o0 a;
        /* access modifiers changed from: private */
        public final long b;
        /* access modifiers changed from: private */
        public final long c;

        private g(o0 o0Var, long j, long j2) {
            this.a = o0Var;
            this.b = j;
            this.c = j2;
        }

        /* synthetic */ g(o0 o0Var, long j, long j2, a aVar) {
            this(o0Var, j, j2);
        }
    }

    /* renamed from: mr$h */
    private final class h implements ir.a {
        private h() {
        }

        /* synthetic */ h(mr mrVar, a aVar) {
            this();
        }

        public void a(int i, long j) {
            if (mr.this.k != null) {
                mr.this.k.b(i, j, SystemClock.elapsedRealtime() - mr.this.R);
            }
        }

        public void b(long j) {
            StringBuilder sb = new StringBuilder(61);
            sb.append("Ignoring impossibly large audio latency: ");
            sb.append(j);
            b50.h("AudioTrack", sb.toString());
        }

        public void c(long j, long j2, long j3, long j4) {
            long v = mr.this.H();
            long w = mr.this.I();
            StringBuilder sb = new StringBuilder(182);
            sb.append("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(v);
            sb.append(", ");
            sb.append(w);
            String sb2 = sb.toString();
            if (!mr.T) {
                b50.h("AudioTrack", sb2);
                return;
            }
            throw new f(sb2, (a) null);
        }

        public void d(long j, long j2, long j3, long j4) {
            long v = mr.this.H();
            long w = mr.this.I();
            StringBuilder sb = new StringBuilder(180);
            sb.append("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            sb.append(", ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j4);
            sb.append(", ");
            sb.append(v);
            sb.append(", ");
            sb.append(w);
            String sb2 = sb.toString();
            if (!mr.T) {
                b50.h("AudioTrack", sb2);
                return;
            }
            throw new f(sb2, (a) null);
        }
    }

    public mr(cr crVar, c cVar, boolean z2) {
        this.a = crVar;
        q40.e(cVar);
        this.b = cVar;
        this.c = z2;
        this.h = new ConditionVariable(true);
        this.i = new ir(new h(this, (a) null));
        this.d = new lr();
        this.e = new ur();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new kr[]{new qr(), this.d, this.e});
        Collections.addAll(arrayList, cVar.d());
        this.f = (er[]) arrayList.toArray(new er[0]);
        this.g = new er[]{new or()};
        this.D = 1.0f;
        this.B = 0;
        this.p = br.f;
        this.O = 0;
        this.P = new jr(0, Utils.FLOAT_EPSILON);
        this.r = o0.e;
        this.K = -1;
        this.E = new er[0];
        this.F = new ByteBuffer[0];
        this.j = new ArrayDeque<>();
    }

    public mr(cr crVar, er[] erVarArr) {
        this(crVar, erVarArr, false);
    }

    public mr(cr crVar, er[] erVarArr, boolean z2) {
        this(crVar, (c) new e(erVarArr), z2);
    }

    private long A(long j2) {
        long j3;
        long M2;
        g gVar = null;
        while (!this.j.isEmpty() && j2 >= this.j.getFirst().c) {
            gVar = this.j.remove();
        }
        if (gVar != null) {
            this.r = gVar.a;
            this.t = gVar.c;
            this.s = gVar.b - this.C;
        }
        if (this.r.a == 1.0f) {
            return (j2 + this.s) - this.t;
        }
        if (this.j.isEmpty()) {
            j3 = this.s;
            M2 = this.b.b(j2 - this.t);
        } else {
            j3 = this.s;
            M2 = v50.M(j2 - this.t, this.r.a);
        }
        return j3 + M2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean B() {
        /*
            r9 = this;
            int r0 = r9.K
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0016
            mr$d r0 = r9.n
            boolean r0 = r0.i
            if (r0 == 0) goto L_0x000f
            r0 = 0
            goto L_0x0012
        L_0x000f:
            er[] r0 = r9.E
            int r0 = r0.length
        L_0x0012:
            r9.K = r0
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r4 = r9.K
            er[] r5 = r9.E
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x002a
            r4.g()
        L_0x002a:
            r9.N(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L_0x0034
            return r3
        L_0x0034:
            int r0 = r9.K
            int r0 = r0 + r2
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.H
            if (r0 == 0) goto L_0x0044
            r9.T(r0, r7)
            java.nio.ByteBuffer r0 = r9.H
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.K = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr.B():boolean");
    }

    private void C() {
        int i2 = 0;
        while (true) {
            er[] erVarArr = this.E;
            if (i2 < erVarArr.length) {
                er erVar = erVarArr[i2];
                erVar.flush();
                this.F[i2] = erVar.d();
                i2++;
            } else {
                return;
            }
        }
    }

    private static int E(int i2, boolean z2) {
        if (v50.a <= 28 && !z2) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (v50.a <= 26 && "fugu".equals(v50.b) && !z2 && i2 == 1) {
            i2 = 2;
        }
        return v50.z(i2);
    }

    private static int F(int i2, ByteBuffer byteBuffer) {
        if (i2 == 14) {
            int a2 = zq.a(byteBuffer);
            if (a2 == -1) {
                return 0;
            }
            return zq.h(byteBuffer, a2) * 16;
        } else if (i2 == 17) {
            return ar.c(byteBuffer);
        } else {
            if (i2 != 18) {
                switch (i2) {
                    case 5:
                    case 6:
                        break;
                    case 7:
                    case 8:
                        return nr.e(byteBuffer);
                    case 9:
                        return rt.a(byteBuffer.get(byteBuffer.position()));
                    default:
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected audio encoding: ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                }
            }
            return zq.d(byteBuffer);
        }
    }

    /* access modifiers changed from: private */
    public static int G(int i2) {
        if (i2 == 5) {
            return 80000;
        }
        if (i2 == 6) {
            return 768000;
        }
        if (i2 == 7) {
            return 192000;
        }
        if (i2 == 8) {
            return 2250000;
        }
        if (i2 == 14) {
            return 3062500;
        }
        if (i2 == 17) {
            return 336000;
        }
        if (i2 == 18) {
            return 768000;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: private */
    public long H() {
        d dVar = this.n;
        return dVar.a ? this.w / ((long) dVar.b) : this.x;
    }

    /* access modifiers changed from: private */
    public long I() {
        d dVar = this.n;
        return dVar.a ? this.y / ((long) dVar.d) : this.z;
    }

    private void J(long j2) {
        this.h.block();
        d dVar = this.n;
        q40.e(dVar);
        AudioTrack a2 = dVar.a(this.Q, this.p, this.O);
        this.o = a2;
        int audioSessionId = a2.getAudioSessionId();
        if (S && v50.a < 21) {
            AudioTrack audioTrack = this.l;
            if (!(audioTrack == null || audioSessionId == audioTrack.getAudioSessionId())) {
                O();
            }
            if (this.l == null) {
                this.l = K(audioSessionId);
            }
        }
        if (this.O != audioSessionId) {
            this.O = audioSessionId;
            gr.c cVar = this.k;
            if (cVar != null) {
                cVar.a(audioSessionId);
            }
        }
        y(this.r, j2);
        ir irVar = this.i;
        AudioTrack audioTrack2 = this.o;
        d dVar2 = this.n;
        irVar.s(audioTrack2, dVar2.g, dVar2.d, dVar2.h);
        P();
        int i2 = this.P.a;
        if (i2 != 0) {
            this.o.attachAuxEffect(i2);
            this.o.setAuxEffectSendLevel(this.P.b);
        }
    }

    private static AudioTrack K(int i2) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i2);
    }

    private boolean L() {
        return this.o != null;
    }

    private void M() {
        if (!this.M) {
            this.M = true;
            this.i.g(I());
            this.o.stop();
            this.v = 0;
        }
    }

    private void N(long j2) {
        ByteBuffer byteBuffer;
        int length = this.E.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.F[i2 - 1];
            } else {
                byteBuffer = this.G;
                if (byteBuffer == null) {
                    byteBuffer = er.a;
                }
            }
            if (i2 == length) {
                T(byteBuffer, j2);
            } else {
                er erVar = this.E[i2];
                erVar.e(byteBuffer);
                ByteBuffer d2 = erVar.d();
                this.F[i2] = d2;
                if (d2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    private void O() {
        AudioTrack audioTrack = this.l;
        if (audioTrack != null) {
            this.l = null;
            new b(this, audioTrack).start();
        }
    }

    private void P() {
        if (L()) {
            if (v50.a >= 21) {
                Q(this.o, this.D);
            } else {
                R(this.o, this.D);
            }
        }
    }

    @TargetApi(21)
    private static void Q(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    private static void R(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    private void S() {
        er[] erVarArr = this.n.k;
        ArrayList arrayList = new ArrayList();
        for (er erVar : erVarArr) {
            if (erVar.b()) {
                arrayList.add(erVar);
            } else {
                erVar.flush();
            }
        }
        int size = arrayList.size();
        this.E = (er[]) arrayList.toArray(new er[size]);
        this.F = new ByteBuffer[size];
        C();
    }

    private void T(ByteBuffer byteBuffer, long j2) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.H;
            boolean z2 = true;
            int i2 = 0;
            if (byteBuffer2 != null) {
                q40.a(byteBuffer2 == byteBuffer);
            } else {
                this.H = byteBuffer;
                if (v50.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.I;
                    if (bArr == null || bArr.length < remaining) {
                        this.I = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.I, 0, remaining);
                    byteBuffer.position(position);
                    this.J = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (v50.a < 21) {
                int c2 = this.i.c(this.y);
                if (c2 > 0 && (i2 = this.o.write(this.I, this.J, Math.min(remaining2, c2))) > 0) {
                    this.J += i2;
                    byteBuffer.position(byteBuffer.position() + i2);
                }
            } else if (this.Q) {
                if (j2 == -9223372036854775807L) {
                    z2 = false;
                }
                q40.f(z2);
                i2 = V(this.o, byteBuffer, remaining2, j2);
            } else {
                i2 = U(this.o, byteBuffer, remaining2);
            }
            this.R = SystemClock.elapsedRealtime();
            if (i2 >= 0) {
                if (this.n.a) {
                    this.y += (long) i2;
                }
                if (i2 == remaining2) {
                    if (!this.n.a) {
                        this.z += (long) this.A;
                    }
                    this.H = null;
                    return;
                }
                return;
            }
            throw new gr.d(i2);
        }
    }

    @TargetApi(21)
    private static int U(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    @TargetApi(21)
    private int V(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (v50.a >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j2 * 1000);
        }
        if (this.u == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.u = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.u.putInt(1431633921);
        }
        if (this.v == 0) {
            this.u.putInt(4, i2);
            this.u.putLong(8, j2 * 1000);
            this.u.position(0);
            this.v = i2;
        }
        int remaining = this.u.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.u, remaining, 1);
            if (write < 0) {
                this.v = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int U = U(audioTrack, byteBuffer, i2);
        if (U < 0) {
            this.v = 0;
            return U;
        }
        this.v -= U;
        return U;
    }

    private void y(o0 o0Var, long j2) {
        this.j.add(new g(this.n.j ? this.b.a(o0Var) : o0.e, Math.max(0, j2), this.n.e(I()), (a) null));
        S();
    }

    private long z(long j2) {
        return j2 + this.n.e(this.b.c());
    }

    public void D() {
        this.N = true;
        if (L()) {
            this.i.t();
            this.o.play();
        }
    }

    public void a() {
        flush();
        O();
        for (er a2 : this.f) {
            a2.a();
        }
        for (er a3 : this.g) {
            a3.a();
        }
        this.O = 0;
        this.N = false;
    }

    public boolean c() {
        return !L() || (this.L && !k());
    }

    public o0 e() {
        o0 o0Var = this.q;
        return o0Var != null ? o0Var : !this.j.isEmpty() ? this.j.getLast().a : this.r;
    }

    public void flush() {
        if (L()) {
            this.w = 0;
            this.x = 0;
            this.y = 0;
            this.z = 0;
            this.A = 0;
            o0 o0Var = this.q;
            if (o0Var != null) {
                this.r = o0Var;
                this.q = null;
            } else if (!this.j.isEmpty()) {
                this.r = this.j.getLast().a;
            }
            this.j.clear();
            this.s = 0;
            this.t = 0;
            this.e.o();
            C();
            this.G = null;
            this.H = null;
            this.M = false;
            this.L = false;
            this.K = -1;
            this.u = null;
            this.v = 0;
            this.B = 0;
            if (this.i.i()) {
                this.o.pause();
            }
            AudioTrack audioTrack = this.o;
            this.o = null;
            d dVar = this.m;
            if (dVar != null) {
                this.n = dVar;
                this.m = null;
            }
            this.i.q();
            this.h.close();
            new a(audioTrack).start();
        }
    }

    public void g(o0 o0Var) {
        d dVar = this.n;
        if (dVar != null && !dVar.j) {
            this.r = o0.e;
        } else if (o0Var.equals(e())) {
        } else {
            if (L()) {
                this.q = o0Var;
            } else {
                this.r = o0Var;
            }
        }
    }

    public boolean h(int i2, int i3) {
        if (v50.f0(i3)) {
            return i3 != 4 || v50.a >= 21;
        }
        cr crVar = this.a;
        return crVar != null && crVar.e(i3) && (i2 == -1 || i2 <= this.a.d());
    }

    public void i(int i2, int i3, int i4, int i5, int[] iArr, int i6, int i7) {
        int[] iArr2;
        int i8;
        int i9;
        int i10;
        int i11 = i3;
        boolean z2 = false;
        if (v50.a < 21 && i11 == 8 && iArr == null) {
            iArr2 = new int[6];
            for (int i12 = 0; i12 < 6; i12++) {
                iArr2[i12] = i12;
            }
        } else {
            iArr2 = iArr;
        }
        boolean f0 = v50.f0(i2);
        boolean z3 = this.c && h(i11, 4) && v50.e0(i2);
        er[] erVarArr = z3 ? this.g : this.f;
        if (f0) {
            this.e.p(i6, i7);
            this.d.n(iArr2);
            er.a aVar = new er.a(i4, i11, i2);
            int length = erVarArr.length;
            int i13 = 0;
            while (i13 < length) {
                er erVar = erVarArr[i13];
                try {
                    er.a f2 = erVar.f(aVar);
                    if (erVar.b()) {
                        aVar = f2;
                    }
                    i13++;
                } catch (er.b e2) {
                    throw new gr.a((Throwable) e2);
                }
            }
            int i14 = aVar.a;
            i10 = aVar.b;
            i8 = aVar.c;
            i9 = i14;
        } else {
            i10 = i11;
            i8 = i2;
            i9 = i4;
        }
        int E2 = E(i10, f0);
        if (E2 != 0) {
            int Q2 = f0 ? v50.Q(i2, i3) : -1;
            int Q3 = f0 ? v50.Q(i8, i10) : -1;
            if (f0 && !z3) {
                z2 = true;
            }
            d dVar = new d(f0, Q2, i4, Q3, i9, E2, i8, i5, f0, z2, erVarArr);
            if (L()) {
                this.m = dVar;
            } else {
                this.n = dVar;
            }
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unsupported channel count: ");
            sb.append(i10);
            throw new gr.a(sb.toString());
        }
    }

    public void j() {
        if (!this.L && L() && B()) {
            M();
            this.L = true;
        }
    }

    public boolean k() {
        return L() && this.i.h(I());
    }

    public long l(boolean z2) {
        if (!L() || this.B == 0) {
            return Long.MIN_VALUE;
        }
        return this.C + z(A(Math.min(this.i.d(z2), this.n.e(I()))));
    }

    public void m() {
        if (this.Q) {
            this.Q = false;
            this.O = 0;
            flush();
        }
    }

    public void n() {
        this.N = false;
        if (L() && this.i.p()) {
            this.o.pause();
        }
    }

    public void o(br brVar) {
        if (!this.p.equals(brVar)) {
            this.p = brVar;
            if (!this.Q) {
                flush();
                this.O = 0;
            }
        }
    }

    public void p() {
        if (this.B == 1) {
            this.B = 2;
        }
    }

    public void q(float f2) {
        if (this.D != f2) {
            this.D = f2;
            P();
        }
    }

    public boolean r(ByteBuffer byteBuffer, long j2) {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j3 = j2;
        ByteBuffer byteBuffer3 = this.G;
        q40.a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (this.m != null) {
            if (!B()) {
                return false;
            }
            if (!this.m.b(this.n)) {
                M();
                if (k()) {
                    return false;
                }
                flush();
            } else {
                this.n = this.m;
                this.m = null;
            }
            y(this.r, j3);
        }
        if (!L()) {
            J(j3);
            if (this.N) {
                D();
            }
        }
        if (!this.i.k(I())) {
            return false;
        }
        if (this.G == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            d dVar = this.n;
            if (!dVar.a && this.A == 0) {
                int F2 = F(dVar.g, byteBuffer2);
                this.A = F2;
                if (F2 == 0) {
                    return true;
                }
            }
            if (this.q != null) {
                if (!B()) {
                    return false;
                }
                o0 o0Var = this.q;
                this.q = null;
                y(o0Var, j3);
            }
            if (this.B == 0) {
                this.C = Math.max(0, j3);
                this.B = 1;
            } else {
                long g2 = this.C + this.n.g(H() - this.e.n());
                if (this.B == 1 && Math.abs(g2 - j3) > 200000) {
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Discontinuity detected [expected ");
                    sb.append(g2);
                    sb.append(", got ");
                    sb.append(j3);
                    sb.append("]");
                    b50.c("AudioTrack", sb.toString());
                    this.B = 2;
                }
                if (this.B == 2) {
                    long j4 = j3 - g2;
                    this.C += j4;
                    this.B = 1;
                    gr.c cVar = this.k;
                    if (!(cVar == null || j4 == 0)) {
                        cVar.c();
                    }
                }
            }
            if (this.n.a) {
                this.w += (long) byteBuffer.remaining();
            } else {
                this.x += (long) this.A;
            }
            this.G = byteBuffer2;
        }
        if (this.n.i) {
            N(j3);
        } else {
            T(this.G, j3);
        }
        if (!this.G.hasRemaining()) {
            this.G = null;
            return true;
        } else if (!this.i.j(I())) {
            return false;
        } else {
            b50.h("AudioTrack", "Resetting stalled audio track");
            flush();
            return true;
        }
    }

    public void s(int i2) {
        q40.f(v50.a >= 21);
        if (!this.Q || this.O != i2) {
            this.Q = true;
            this.O = i2;
            flush();
        }
    }

    public void t(gr.c cVar) {
        this.k = cVar;
    }

    public void u(jr jrVar) {
        if (!this.P.equals(jrVar)) {
            int i2 = jrVar.a;
            float f2 = jrVar.b;
            AudioTrack audioTrack = this.o;
            if (audioTrack != null) {
                if (this.P.a != i2) {
                    audioTrack.attachAuxEffect(i2);
                }
                if (i2 != 0) {
                    this.o.setAuxEffectSendLevel(f2);
                }
            }
            this.P = jrVar;
        }
    }
}
