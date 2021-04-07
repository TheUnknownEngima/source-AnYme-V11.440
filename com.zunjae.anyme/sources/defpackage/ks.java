package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.v;
import defpackage.ns;
import defpackage.ps;
import defpackage.ts;
import defpackage.us;
import defpackage.x40;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@TargetApi(18)
/* renamed from: ks  reason: default package */
class ks<T extends ts> implements ps<T> {
    public final List<ns.b> a;
    private final us<T> b;
    private final a<T> c;
    private final b<T> d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final HashMap<String, String> h;
    private final x40<ls> i;
    /* access modifiers changed from: private */
    public final t j;
    final xs k;
    final UUID l;
    final ks<T>.e m;
    private int n;
    private int o;
    private HandlerThread p;
    private ks<T>.c q;
    private T r;
    private ps.a s;
    private byte[] t;
    private byte[] u;
    private us.a v;
    private us.d w;

    /* renamed from: ks$a */
    public interface a<T extends ts> {
        void a(ks<T> ksVar);

        void b(Exception exc);

        void c();
    }

    /* renamed from: ks$b */
    public interface b<T extends ts> {
        void a(ks<T> ksVar);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: ks$c */
    private class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, Exception exc) {
            d dVar = (d) message.obj;
            if (!dVar.a) {
                return false;
            }
            int i = dVar.d + 1;
            dVar.d = i;
            if (i > ks.this.j.c(3)) {
                return false;
            }
            long a2 = ks.this.j.a(3, SystemClock.elapsedRealtime() - dVar.b, exc instanceof IOException ? (IOException) exc : new f(exc), dVar.d);
            if (a2 == -9223372036854775807L) {
                return false;
            }
            sendMessageDelayed(Message.obtain(message), a2);
            return true;
        }

        /* access modifiers changed from: package-private */
        public void b(int i, Object obj, boolean z) {
            obtainMessage(i, new d(z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public void handleMessage(Message message) {
            byte[] bArr;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    bArr = ks.this.k.b(ks.this.l, (us.d) dVar.c);
                } else if (i == 1) {
                    bArr = ks.this.k.a(ks.this.l, (us.a) dVar.c);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                boolean a2 = a(message, e);
                bArr = e;
                if (a2) {
                    return;
                }
            }
            ks.this.m.obtainMessage(message.what, Pair.create(dVar.c, bArr)).sendToTarget();
        }
    }

    /* renamed from: ks$d */
    private static final class d {
        public final boolean a;
        public final long b;
        public final Object c;
        public int d;

        public d(boolean z, long j, Object obj) {
            this.a = z;
            this.b = j;
            this.c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: ks$e */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                ks.this.t(obj, obj2);
            } else if (i == 1) {
                ks.this.p(obj, obj2);
            }
        }
    }

    /* renamed from: ks$f */
    public static final class f extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public f(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                int r2 = r2 + 13
                java.lang.String r3 = java.lang.String.valueOf(r1)
                int r3 = r3.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ks.f.<init>(java.lang.Throwable):void");
        }
    }

    public ks(UUID uuid, us<T> usVar, a<T> aVar, b<T> bVar, List<ns.b> list, int i2, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, xs xsVar, Looper looper, x40<ls> x40, t tVar) {
        List<ns.b> list2;
        if (i2 == 1 || i2 == 3) {
            q40.e(bArr);
        }
        this.l = uuid;
        this.c = aVar;
        this.d = bVar;
        this.b = usVar;
        this.e = i2;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.u = bArr;
            list2 = null;
        } else {
            q40.e(list);
            list2 = Collections.unmodifiableList(list);
        }
        this.a = list2;
        this.h = hashMap;
        this.k = xsVar;
        this.i = x40;
        this.j = tVar;
        this.n = 2;
        this.m = new e(looper);
    }

    @RequiresNonNull({"sessionId"})
    private void j(boolean z) {
        if (!this.g) {
            byte[] bArr = this.t;
            v50.g(bArr);
            byte[] bArr2 = bArr;
            int i2 = this.e;
            if (i2 == 0 || i2 == 1) {
                if (this.u == null) {
                    v(bArr2, 1, z);
                    return;
                } else if (this.n == 4 || x()) {
                    long k2 = k();
                    if (this.e == 0 && k2 <= 60) {
                        StringBuilder sb = new StringBuilder(88);
                        sb.append("Offline license has expired or will expire soon. Remaining seconds: ");
                        sb.append(k2);
                        b50.b("DefaultDrmSession", sb.toString());
                    } else if (k2 <= 0) {
                        o(new ws());
                        return;
                    } else {
                        this.n = 4;
                        this.i.b(is.a);
                        return;
                    }
                } else {
                    return;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    q40.e(this.u);
                    q40.e(this.t);
                    if (x()) {
                        v(this.u, 3, z);
                        return;
                    }
                    return;
                }
                return;
            } else if (this.u != null && !x()) {
                return;
            }
            v(bArr2, 2, z);
        }
    }

    private long k() {
        if (!v.d.equals(this.l)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> b2 = zs.b(this);
        q40.e(b2);
        Pair pair = b2;
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean m() {
        int i2 = this.n;
        return i2 == 3 || i2 == 4;
    }

    private void o(Exception exc) {
        this.s = new ps.a(exc);
        this.i.b(new es(exc));
        if (this.n != 4) {
            this.n = 1;
        }
    }

    /* access modifiers changed from: private */
    public void p(Object obj, Object obj2) {
        x40<ls> x40;
        x40.a aVar;
        if (obj == this.v && m()) {
            this.v = null;
            if (obj2 instanceof Exception) {
                q((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.e == 3) {
                    us<T> usVar = this.b;
                    byte[] bArr2 = this.u;
                    v50.g(bArr2);
                    usVar.j(bArr2, bArr);
                    x40 = this.i;
                    aVar = is.a;
                } else {
                    byte[] j2 = this.b.j(this.t, bArr);
                    if (!((this.e != 2 && (this.e != 0 || this.u == null)) || j2 == null || j2.length == 0)) {
                        this.u = j2;
                    }
                    this.n = 4;
                    x40 = this.i;
                    aVar = js.a;
                }
                x40.b(aVar);
            } catch (Exception e2) {
                q(e2);
            }
        }
    }

    private void q(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.c.a(this);
        } else {
            o(exc);
        }
    }

    private void r() {
        if (this.e == 0 && this.n == 4) {
            v50.g(this.t);
            j(false);
        }
    }

    /* access modifiers changed from: private */
    public void t(Object obj, Object obj2) {
        if (obj != this.w) {
            return;
        }
        if (this.n == 2 || m()) {
            this.w = null;
            if (obj2 instanceof Exception) {
                this.c.b((Exception) obj2);
                return;
            }
            try {
                this.b.k((byte[]) obj2);
                this.c.c();
            } catch (Exception e2) {
                this.c.b(e2);
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean u(boolean z) {
        if (m()) {
            return true;
        }
        try {
            byte[] f2 = this.b.f();
            this.t = f2;
            this.r = this.b.d(f2);
            this.i.b(hs.a);
            this.n = 3;
            q40.e(this.t);
            return true;
        } catch (NotProvisionedException e2) {
            if (z) {
                this.c.a(this);
                return false;
            }
            o(e2);
            return false;
        } catch (Exception e3) {
            o(e3);
            return false;
        }
    }

    private void v(byte[] bArr, int i2, boolean z) {
        try {
            this.v = this.b.l(bArr, this.a, i2, this.h);
            ks<T>.c cVar = this.q;
            v50.g(cVar);
            us.a aVar = this.v;
            q40.e(aVar);
            cVar.b(1, aVar, z);
        } catch (Exception e2) {
            q(e2);
        }
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean x() {
        try {
            this.b.g(this.t, this.u);
            return true;
        } catch (Exception e2) {
            b50.d("DefaultDrmSession", "Error trying to restore keys.", e2);
            o(e2);
            return false;
        }
    }

    public void a() {
        int i2 = this.o - 1;
        this.o = i2;
        if (i2 == 0) {
            this.n = 0;
            ks<T>.e eVar = this.m;
            v50.g(eVar);
            eVar.removeCallbacksAndMessages((Object) null);
            ks<T>.c cVar = this.q;
            v50.g(cVar);
            cVar.removeCallbacksAndMessages((Object) null);
            this.q = null;
            HandlerThread handlerThread = this.p;
            v50.g(handlerThread);
            handlerThread.quit();
            this.p = null;
            this.r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.b.h(bArr);
                this.t = null;
                this.i.b(ds.a);
            }
            this.d.a(this);
        }
    }

    public void b() {
        boolean z = false;
        q40.f(this.o >= 0);
        int i2 = this.o + 1;
        this.o = i2;
        if (i2 == 1) {
            if (this.n == 2) {
                z = true;
            }
            q40.f(z);
            HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new c(this.p.getLooper());
            if (u(true)) {
                j(true);
            }
        }
    }

    public boolean c() {
        return this.f;
    }

    public Map<String, String> d() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.b.c(bArr);
    }

    public final T e() {
        return this.r;
    }

    public final ps.a f() {
        if (this.n == 1) {
            return this.s;
        }
        return null;
    }

    public final int getState() {
        return this.n;
    }

    public boolean l(byte[] bArr) {
        return Arrays.equals(this.t, bArr);
    }

    public void s(int i2) {
        if (i2 == 2) {
            r();
        }
    }

    public void w() {
        this.w = this.b.e();
        ks<T>.c cVar = this.q;
        v50.g(cVar);
        us.d dVar = this.w;
        q40.e(dVar);
        cVar.b(0, dVar, true);
    }
}
