package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.h;
import com.google.android.exoplayer2.source.dash.j;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.q;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.u;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.exoplayer2.upstream.y;
import defpackage.f00;
import defpackage.g00;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DashMediaSource extends uz {
    private final Object A;
    private com.google.android.exoplayer2.upstream.i B;
    /* access modifiers changed from: private */
    public u C;
    private y D;
    /* access modifiers changed from: private */
    public IOException E;
    private Handler F;
    private Uri G;
    private Uri H;
    private h10 I;
    private boolean J;
    private long K;
    private long L;
    private long M;
    private int N;
    private long O;
    private int P;
    private final boolean j;
    private final i.a k;
    private final c.a l;
    private final zz m;
    private final rs<?> n;
    private final t o;
    private final long p;
    private final boolean q;
    private final g00.a r;
    private final w.a<? extends h10> s;
    private final e t;
    private final Object u;
    private final SparseArray<e> v;
    private final Runnable w;
    private final Runnable x;
    private final j.b y;
    private final v z;

    public static final class Factory {
        private final c.a a;
        private final i.a b;
        private rs<?> c;
        private w.a<? extends h10> d;
        private List<com.google.android.exoplayer2.offline.h> e;
        private zz f;
        private t g;
        private long h;
        private boolean i;
        private Object j;

        public Factory(c.a aVar, i.a aVar2) {
            q40.e(aVar);
            this.a = aVar;
            this.b = aVar2;
            this.c = qs.d();
            this.g = new q();
            this.h = 30000;
            this.f = new a00();
        }

        public Factory(i.a aVar) {
            this(new h.a(aVar), aVar);
        }

        public DashMediaSource a(Uri uri) {
            if (this.d == null) {
                this.d = new i10();
            }
            List<com.google.android.exoplayer2.offline.h> list = this.e;
            if (list != null) {
                this.d = new com.google.android.exoplayer2.offline.g(this.d, list);
            }
            q40.e(uri);
            return new DashMediaSource((h10) null, uri, this.b, this.d, this.a, this.f, this.c, this.g, this.h, this.i, this.j);
        }
    }

    private static final class b extends b1 {
        private final long b;
        private final long c;
        private final int d;
        private final long e;
        private final long f;
        private final long g;
        private final h10 h;
        private final Object i;

        public b(long j, long j2, int i2, long j3, long j4, long j5, h10 h10, Object obj) {
            this.b = j;
            this.c = j2;
            this.d = i2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.h = h10;
            this.i = obj;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
            r2 = r2.c.get(r6).c.get(0).i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private long s(long r9) {
            /*
                r8 = this;
                long r0 = r8.g
                h10 r2 = r8.h
                boolean r2 = t(r2)
                if (r2 != 0) goto L_0x000b
                return r0
            L_0x000b:
                r2 = 0
                int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x001e
                long r0 = r0 + r9
                long r9 = r8.f
                int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r2 <= 0) goto L_0x001e
                r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                return r9
            L_0x001e:
                long r9 = r8.e
                long r9 = r9 + r0
                h10 r2 = r8.h
                r3 = 0
                long r4 = r2.g(r3)
                r2 = 0
            L_0x0029:
                h10 r6 = r8.h
                int r6 = r6.e()
                int r6 = r6 + -1
                if (r2 >= r6) goto L_0x0041
                int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x0041
                long r9 = r9 - r4
                int r2 = r2 + 1
                h10 r4 = r8.h
                long r4 = r4.g(r2)
                goto L_0x0029
            L_0x0041:
                h10 r6 = r8.h
                l10 r2 = r6.d(r2)
                r6 = 2
                int r6 = r2.a(r6)
                r7 = -1
                if (r6 != r7) goto L_0x0050
                return r0
            L_0x0050:
                java.util.List<g10> r2 = r2.c
                java.lang.Object r2 = r2.get(r6)
                g10 r2 = (defpackage.g10) r2
                java.util.List<o10> r2 = r2.c
                java.lang.Object r2 = r2.get(r3)
                o10 r2 = (defpackage.o10) r2
                com.google.android.exoplayer2.source.dash.f r2 = r2.i()
                if (r2 == 0) goto L_0x0077
                int r3 = r2.g(r4)
                if (r3 != 0) goto L_0x006d
                goto L_0x0077
            L_0x006d:
                long r3 = r2.d(r9, r4)
                long r2 = r2.b(r3)
                long r0 = r0 + r2
                long r0 = r0 - r9
            L_0x0077:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.b.s(long):long");
        }

        private static boolean t(h10 h10) {
            return h10.d && h10.e != -9223372036854775807L && h10.b == -9223372036854775807L;
        }

        public int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.d) >= 0 && intValue < i()) {
                return intValue;
            }
            return -1;
        }

        public b1.b g(int i2, b1.b bVar, boolean z) {
            q40.c(i2, 0, i());
            Integer num = null;
            String str = z ? this.h.d(i2).a : null;
            if (z) {
                num = Integer.valueOf(this.d + i2);
            }
            bVar.o(str, num, 0, this.h.g(i2), com.google.android.exoplayer2.v.a(this.h.d(i2).b - this.h.d(0).b) - this.e);
            return bVar;
        }

        public int i() {
            return this.h.e();
        }

        public Object m(int i2) {
            q40.c(i2, 0, i());
            return Integer.valueOf(this.d + i2);
        }

        public b1.c o(int i2, b1.c cVar, long j) {
            q40.c(i2, 0, 1);
            long s = s(j);
            Object obj = b1.c.n;
            Object obj2 = this.i;
            h10 h10 = this.h;
            Object obj3 = obj;
            b1.c cVar2 = cVar;
            cVar2.e(obj3, obj2, h10, this.b, this.c, true, t(h10), this.h.d, s, this.f, 0, i() - 1, this.e);
            return cVar;
        }

        public int p() {
            return 1;
        }
    }

    private final class c implements j.b {
        private c() {
        }

        public void a() {
            DashMediaSource.this.E();
        }

        public void b(long j) {
            DashMediaSource.this.D(j);
        }
    }

    static final class d implements w.a<Long> {
        private static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        d() {
        }

        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = a.matcher(readLine);
                if (!matcher.matches()) {
                    String valueOf = String.valueOf(readLine);
                    throw new m0(valueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(valueOf) : new String("Couldn't parse timestamp: "));
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = "+".equals(matcher.group(4)) ? 1 : -1;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= j * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw new m0((Throwable) e);
            }
        }
    }

    private final class e implements u.b<w<h10>> {
        private e() {
        }

        /* renamed from: a */
        public void l(w<h10> wVar, long j, long j2, boolean z) {
            DashMediaSource.this.F(wVar, j, j2);
        }

        /* renamed from: b */
        public void m(w<h10> wVar, long j, long j2) {
            DashMediaSource.this.G(wVar, j, j2);
        }

        /* renamed from: c */
        public u.c t(w<h10> wVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.H(wVar, j, j2, iOException, i);
        }
    }

    final class f implements v {
        f() {
        }

        private void b() {
            if (DashMediaSource.this.E != null) {
                throw DashMediaSource.this.E;
            }
        }

        public void a() {
            DashMediaSource.this.C.a();
            b();
        }
    }

    private static final class g {
        public final boolean a;
        public final long b;
        public final long c;

        private g(boolean z, long j, long j2) {
            this.a = z;
            this.b = j;
            this.c = j2;
        }

        public static g a(l10 l10, long j) {
            boolean z;
            boolean z2;
            long j2;
            l10 l102 = l10;
            long j3 = j;
            int size = l102.c.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                int i3 = l102.c.get(i2).b;
                if (i3 == 1 || i3 == 2) {
                    z = true;
                } else {
                    i2++;
                }
            }
            long j4 = Long.MAX_VALUE;
            int i4 = 0;
            boolean z3 = false;
            long j5 = 0;
            boolean z4 = false;
            while (i4 < size) {
                g10 g10 = l102.c.get(i4);
                if (!z || g10.b != 3) {
                    f i5 = g10.c.get(i).i();
                    if (i5 == null) {
                        return new g(true, 0, j);
                    }
                    z3 |= i5.e();
                    int g = i5.g(j3);
                    if (g == 0) {
                        z2 = z;
                        j2 = 0;
                        j5 = 0;
                        z4 = true;
                    } else if (!z4) {
                        z2 = z;
                        long f = i5.f();
                        long j6 = j4;
                        j5 = Math.max(j5, i5.b(f));
                        if (g != -1) {
                            long j7 = (f + ((long) g)) - 1;
                            j2 = Math.min(j6, i5.b(j7) + i5.a(j7, j3));
                        } else {
                            j2 = j6;
                        }
                    }
                    i4++;
                    j4 = j2;
                    z = z2;
                    i = 0;
                }
                z2 = z;
                j2 = j4;
                i4++;
                j4 = j2;
                z = z2;
                i = 0;
            }
            return new g(z3, j5, j4);
        }
    }

    private final class h implements u.b<w<Long>> {
        private h() {
        }

        /* renamed from: a */
        public void l(w<Long> wVar, long j, long j2, boolean z) {
            DashMediaSource.this.F(wVar, j, j2);
        }

        /* renamed from: b */
        public void m(w<Long> wVar, long j, long j2) {
            DashMediaSource.this.I(wVar, j, j2);
        }

        /* renamed from: c */
        public u.c t(w<Long> wVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.J(wVar, j, j2, iOException);
        }
    }

    private static final class i implements w.a<Long> {
        private i() {
        }

        /* renamed from: b */
        public Long a(Uri uri, InputStream inputStream) {
            return Long.valueOf(v50.r0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        e0.a("goog.exo.dash");
    }

    private DashMediaSource(h10 h10, Uri uri, i.a aVar, w.a<? extends h10> aVar2, c.a aVar3, zz zzVar, rs<?> rsVar, t tVar, long j2, boolean z2, Object obj) {
        this.G = uri;
        this.I = h10;
        this.H = uri;
        this.k = aVar;
        this.s = aVar2;
        this.l = aVar3;
        this.n = rsVar;
        this.o = tVar;
        this.p = j2;
        this.q = z2;
        this.m = zzVar;
        this.A = obj;
        this.j = h10 != null;
        this.r = o((f00.a) null);
        this.u = new Object();
        this.v = new SparseArray<>();
        this.y = new c();
        this.O = -9223372036854775807L;
        if (this.j) {
            q40.f(!h10.d);
            this.t = null;
            this.w = null;
            this.x = null;
            this.z = new v.a();
            return;
        }
        this.t = new e();
        this.z = new f();
        this.w = new a(this);
        this.x = new b(this);
    }

    private long A() {
        return com.google.android.exoplayer2.v.a(this.M != 0 ? SystemClock.elapsedRealtime() + this.M : System.currentTimeMillis());
    }

    private void K(IOException iOException) {
        b50.d("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        M(true);
    }

    private void L(long j2) {
        this.M = j2;
        M(true);
    }

    private void M(boolean z2) {
        long j2;
        boolean z3;
        long j3;
        for (int i2 = 0; i2 < this.v.size(); i2++) {
            int keyAt = this.v.keyAt(i2);
            if (keyAt >= this.P) {
                this.v.valueAt(i2).N(this.I, keyAt - this.P);
            }
        }
        int e2 = this.I.e() - 1;
        g a2 = g.a(this.I.d(0), this.I.g(0));
        g a3 = g.a(this.I.d(e2), this.I.g(e2));
        long j4 = a2.b;
        long j5 = a3.c;
        if (!this.I.d || a3.a) {
            j2 = j4;
            z3 = false;
        } else {
            j5 = Math.min((A() - com.google.android.exoplayer2.v.a(this.I.a)) - com.google.android.exoplayer2.v.a(this.I.d(e2).b), j5);
            long j6 = this.I.f;
            if (j6 != -9223372036854775807L) {
                long a4 = j5 - com.google.android.exoplayer2.v.a(j6);
                while (a4 < 0 && e2 > 0) {
                    e2--;
                    a4 += this.I.g(e2);
                }
                j4 = e2 == 0 ? Math.max(j4, a4) : this.I.g(0);
            }
            j2 = j4;
            z3 = true;
        }
        long j7 = j5 - j2;
        for (int i3 = 0; i3 < this.I.e() - 1; i3++) {
            j7 += this.I.g(i3);
        }
        h10 h10 = this.I;
        if (h10.d) {
            long j8 = this.p;
            if (!this.q) {
                long j9 = h10.g;
                if (j9 != -9223372036854775807L) {
                    j8 = j9;
                }
            }
            long a5 = j7 - com.google.android.exoplayer2.v.a(j8);
            if (a5 < 5000000) {
                a5 = Math.min(5000000, j7 / 2);
            }
            j3 = a5;
        } else {
            j3 = 0;
        }
        h10 h102 = this.I;
        long j10 = h102.a;
        long b2 = j10 != -9223372036854775807L ? j10 + h102.d(0).b + com.google.android.exoplayer2.v.b(j2) : -9223372036854775807L;
        h10 h103 = this.I;
        v(new b(h103.a, b2, this.P, j2, j7, j3, h103, this.A));
        if (!this.j) {
            this.F.removeCallbacks(this.x);
            long j11 = 5000;
            if (z3) {
                this.F.postDelayed(this.x, 5000);
            }
            if (this.J) {
                S();
            } else if (z2) {
                h10 h104 = this.I;
                if (h104.d) {
                    long j12 = h104.e;
                    if (j12 != -9223372036854775807L) {
                        if (j12 != 0) {
                            j11 = j12;
                        }
                        Q(Math.max(0, (this.K + j11) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    private void N(s10 s10) {
        w.a aVar;
        String str = s10.a;
        if (v50.b(str, "urn:mpeg:dash:utc:direct:2014") || v50.b(str, "urn:mpeg:dash:utc:direct:2012")) {
            O(s10);
            return;
        }
        if (v50.b(str, "urn:mpeg:dash:utc:http-iso:2014") || v50.b(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            aVar = new d();
        } else if (v50.b(str, "urn:mpeg:dash:utc:http-xsdate:2014") || v50.b(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            aVar = new i();
        } else {
            K(new IOException("Unsupported UTC timing scheme"));
            return;
        }
        P(s10, aVar);
    }

    private void O(s10 s10) {
        try {
            L(v50.r0(s10.b) - this.L);
        } catch (m0 e2) {
            K(e2);
        }
    }

    private void P(s10 s10, w.a<Long> aVar) {
        R(new w(this.B, Uri.parse(s10.b), 5, aVar), new h(), 1);
    }

    private void Q(long j2) {
        this.F.postDelayed(this.w, j2);
    }

    private <T> void R(w<T> wVar, u.b<w<T>> bVar, int i2) {
        this.r.y(wVar.a, wVar.b, this.C.n(wVar, bVar, i2));
    }

    /* access modifiers changed from: private */
    public void S() {
        Uri uri;
        this.F.removeCallbacks(this.w);
        if (!this.C.i()) {
            if (this.C.j()) {
                this.J = true;
                return;
            }
            synchronized (this.u) {
                uri = this.H;
            }
            this.J = false;
            R(new w(this.B, uri, 4, this.s), this.t, this.o.c(4));
        }
    }

    private long z() {
        return (long) Math.min((this.N - 1) * 1000, 5000);
    }

    public /* synthetic */ void C() {
        M(false);
    }

    /* access modifiers changed from: package-private */
    public void D(long j2) {
        long j3 = this.O;
        if (j3 == -9223372036854775807L || j3 < j2) {
            this.O = j2;
        }
    }

    /* access modifiers changed from: package-private */
    public void E() {
        this.F.removeCallbacks(this.x);
        S();
    }

    /* access modifiers changed from: package-private */
    public void F(w<?> wVar, long j2, long j3) {
        w<?> wVar2 = wVar;
        this.r.p(wVar2.a, wVar.f(), wVar.d(), wVar2.b, j2, j3, wVar.b());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(com.google.android.exoplayer2.upstream.w<defpackage.h10> r18, long r19, long r21) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r13 = r19
            g00$a r2 = r1.r
            com.google.android.exoplayer2.upstream.l r3 = r0.a
            android.net.Uri r4 = r18.f()
            java.util.Map r5 = r18.d()
            int r6 = r0.b
            long r11 = r18.b()
            r7 = r19
            r9 = r21
            r2.s(r3, r4, r5, r6, r7, r9, r11)
            java.lang.Object r2 = r18.e()
            h10 r2 = (defpackage.h10) r2
            h10 r3 = r1.I
            r4 = 0
            if (r3 != 0) goto L_0x002c
            r3 = 0
            goto L_0x0030
        L_0x002c:
            int r3 = r3.e()
        L_0x0030:
            l10 r5 = r2.d(r4)
            long r5 = r5.b
            r7 = 0
        L_0x0037:
            if (r7 >= r3) goto L_0x0048
            h10 r8 = r1.I
            l10 r8 = r8.d(r7)
            long r8 = r8.b
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0048
            int r7 = r7 + 1
            goto L_0x0037
        L_0x0048:
            boolean r5 = r2.d
            r6 = 1
            if (r5 == 0) goto L_0x00b6
            int r5 = r3 - r7
            int r8 = r2.e()
            if (r5 <= r8) goto L_0x005e
            java.lang.String r5 = "DashMediaSource"
            java.lang.String r8 = "Loaded out of sync manifest"
        L_0x0059:
            defpackage.b50.h(r5, r8)
            r5 = 1
            goto L_0x0092
        L_0x005e:
            long r8 = r1.O
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0091
            long r10 = r2.h
            r15 = 1000(0x3e8, double:4.94E-321)
            long r15 = r15 * r10
            int r5 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x0091
            java.lang.String r5 = "DashMediaSource"
            r12 = 73
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r12)
            java.lang.String r12 = "Loaded stale dynamic manifest: "
            r15.append(r12)
            r15.append(r10)
            java.lang.String r10 = ", "
            r15.append(r10)
            r15.append(r8)
            java.lang.String r8 = r15.toString()
            goto L_0x0059
        L_0x0091:
            r5 = 0
        L_0x0092:
            if (r5 == 0) goto L_0x00b4
            int r2 = r1.N
            int r3 = r2 + 1
            r1.N = r3
            com.google.android.exoplayer2.upstream.t r3 = r1.o
            int r0 = r0.b
            int r0 = r3.c(r0)
            if (r2 >= r0) goto L_0x00ac
            long r2 = r17.z()
            r1.Q(r2)
            goto L_0x00b3
        L_0x00ac:
            com.google.android.exoplayer2.source.dash.d r0 = new com.google.android.exoplayer2.source.dash.d
            r0.<init>()
            r1.E = r0
        L_0x00b3:
            return
        L_0x00b4:
            r1.N = r4
        L_0x00b6:
            r1.I = r2
            boolean r5 = r1.J
            boolean r2 = r2.d
            r2 = r2 & r5
            r1.J = r2
            long r8 = r13 - r21
            r1.K = r8
            r1.L = r13
            java.lang.Object r2 = r1.u
            monitor-enter(r2)
            com.google.android.exoplayer2.upstream.l r5 = r0.a     // Catch:{ all -> 0x00fe }
            android.net.Uri r5 = r5.a     // Catch:{ all -> 0x00fe }
            android.net.Uri r8 = r1.H     // Catch:{ all -> 0x00fe }
            if (r5 != r8) goto L_0x00d1
            r4 = 1
        L_0x00d1:
            if (r4 == 0) goto L_0x00e4
            h10 r4 = r1.I     // Catch:{ all -> 0x00fe }
            android.net.Uri r4 = r4.j     // Catch:{ all -> 0x00fe }
            if (r4 == 0) goto L_0x00de
            h10 r0 = r1.I     // Catch:{ all -> 0x00fe }
            android.net.Uri r0 = r0.j     // Catch:{ all -> 0x00fe }
            goto L_0x00e2
        L_0x00de:
            android.net.Uri r0 = r18.f()     // Catch:{ all -> 0x00fe }
        L_0x00e2:
            r1.H = r0     // Catch:{ all -> 0x00fe }
        L_0x00e4:
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            if (r3 != 0) goto L_0x00f5
            h10 r0 = r1.I
            boolean r2 = r0.d
            if (r2 == 0) goto L_0x00fa
            s10 r0 = r0.i
            if (r0 == 0) goto L_0x00fa
            r1.N(r0)
            goto L_0x00fd
        L_0x00f5:
            int r0 = r1.P
            int r0 = r0 + r7
            r1.P = r0
        L_0x00fa:
            r1.M(r6)
        L_0x00fd:
            return
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.G(com.google.android.exoplayer2.upstream.w, long, long):void");
    }

    /* access modifiers changed from: package-private */
    public u.c H(w<h10> wVar, long j2, long j3, IOException iOException, int i2) {
        w<h10> wVar2 = wVar;
        long a2 = this.o.a(4, j3, iOException, i2);
        u.c h2 = a2 == -9223372036854775807L ? u.e : u.h(false, a2);
        this.r.v(wVar2.a, wVar.f(), wVar.d(), wVar2.b, j2, j3, wVar.b(), iOException, !h2.c());
        return h2;
    }

    /* access modifiers changed from: package-private */
    public void I(w<Long> wVar, long j2, long j3) {
        w<Long> wVar2 = wVar;
        this.r.s(wVar2.a, wVar.f(), wVar.d(), wVar2.b, j2, j3, wVar.b());
        L(wVar.e().longValue() - j2);
    }

    /* access modifiers changed from: package-private */
    public u.c J(w<Long> wVar, long j2, long j3, IOException iOException) {
        w<Long> wVar2 = wVar;
        g00.a aVar = this.r;
        l lVar = wVar2.a;
        Uri f2 = wVar.f();
        Map<String, List<String>> d2 = wVar.d();
        int i2 = wVar2.b;
        aVar.v(lVar, f2, d2, i2, j2, j3, wVar.b(), iOException, true);
        K(iOException);
        return u.d;
    }

    public e00 a(f00.a aVar, com.google.android.exoplayer2.upstream.e eVar, long j2) {
        f00.a aVar2 = aVar;
        int intValue = ((Integer) aVar2.a).intValue() - this.P;
        g00.a p2 = p(aVar2, this.I.d(intValue).b);
        e eVar2 = new e(this.P + intValue, this.I, intValue, this.l, this.D, this.n, this.o, p2, this.M, this.z, eVar, this.m, this.y);
        this.v.put(eVar2.e, eVar2);
        return eVar2;
    }

    public void h() {
        this.z.a();
    }

    public void i(e00 e00) {
        e eVar = (e) e00;
        eVar.J();
        this.v.remove(eVar.e);
    }

    /* access modifiers changed from: protected */
    public void u(y yVar) {
        this.D = yVar;
        this.n.t();
        if (this.j) {
            M(false);
            return;
        }
        this.B = this.k.a();
        this.C = new u("Loader:DashMediaSource");
        this.F = new Handler();
        S();
    }

    /* access modifiers changed from: protected */
    public void w() {
        this.J = false;
        this.B = null;
        u uVar = this.C;
        if (uVar != null) {
            uVar.l();
            this.C = null;
        }
        this.K = 0;
        this.L = 0;
        this.I = this.j ? this.I : null;
        this.H = this.G;
        this.E = null;
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.F = null;
        }
        this.M = 0;
        this.N = 0;
        this.O = -9223372036854775807L;
        this.P = 0;
        this.v.clear();
        this.n.a();
    }
}
