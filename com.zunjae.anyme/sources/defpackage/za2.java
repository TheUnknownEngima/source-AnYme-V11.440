package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: za2  reason: default package */
final class za2 implements ea2 {
    final xa2 e;
    final gc2 f;
    final ld2 g;
    /* access modifiers changed from: private */
    @Nullable
    public pa2 h;
    final ab2 i;
    final boolean j;
    private boolean k;

    /* renamed from: za2$a */
    class a extends ld2 {
        a() {
        }

        /* access modifiers changed from: protected */
        public void t() {
            za2.this.cancel();
        }
    }

    /* renamed from: za2$b */
    final class b extends hb2 {
        private final fa2 f;

        static {
            Class<za2> cls = za2.class;
        }

        b(fa2 fa2) {
            super("OkHttp %s", za2.this.g());
            this.f = fa2;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[Catch:{ all -> 0x0024 }] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0051 A[Catch:{ all -> 0x0024 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void k() {
            /*
                r5 = this;
                za2 r0 = defpackage.za2.this
                ld2 r0 = r0.g
                r0.k()
                r0 = 0
                za2 r1 = defpackage.za2.this     // Catch:{ IOException -> 0x0026 }
                cb2 r0 = r1.e()     // Catch:{ IOException -> 0x0026 }
                r1 = 1
                fa2 r2 = r5.f     // Catch:{ IOException -> 0x0022 }
                za2 r3 = defpackage.za2.this     // Catch:{ IOException -> 0x0022 }
                r2.a(r3, r0)     // Catch:{ IOException -> 0x0022 }
            L_0x0016:
                za2 r0 = defpackage.za2.this
                xa2 r0 = r0.e
                na2 r0 = r0.o()
                r0.e(r5)
                goto L_0x0064
            L_0x0022:
                r0 = move-exception
                goto L_0x0029
            L_0x0024:
                r0 = move-exception
                goto L_0x0065
            L_0x0026:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x0029:
                za2 r2 = defpackage.za2.this     // Catch:{ all -> 0x0024 }
                java.io.IOException r0 = r2.j(r0)     // Catch:{ all -> 0x0024 }
                if (r1 == 0) goto L_0x0051
                dd2 r1 = defpackage.dd2.j()     // Catch:{ all -> 0x0024 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
                r3.<init>()     // Catch:{ all -> 0x0024 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0024 }
                za2 r4 = defpackage.za2.this     // Catch:{ all -> 0x0024 }
                java.lang.String r4 = r4.n()     // Catch:{ all -> 0x0024 }
                r3.append(r4)     // Catch:{ all -> 0x0024 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0024 }
                r1.q(r2, r3, r0)     // Catch:{ all -> 0x0024 }
                goto L_0x0016
            L_0x0051:
                za2 r1 = defpackage.za2.this     // Catch:{ all -> 0x0024 }
                pa2 r1 = r1.h     // Catch:{ all -> 0x0024 }
                za2 r2 = defpackage.za2.this     // Catch:{ all -> 0x0024 }
                r1.b(r2, r0)     // Catch:{ all -> 0x0024 }
                fa2 r1 = r5.f     // Catch:{ all -> 0x0024 }
                za2 r2 = defpackage.za2.this     // Catch:{ all -> 0x0024 }
                r1.b(r2, r0)     // Catch:{ all -> 0x0024 }
                goto L_0x0016
            L_0x0064:
                return
            L_0x0065:
                za2 r1 = defpackage.za2.this
                xa2 r1 = r1.e
                na2 r1 = r1.o()
                r1.e(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.za2.b.k():void");
        }

        /* access modifiers changed from: package-private */
        public void l(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                za2.this.h.b(za2.this, interruptedIOException);
                this.f.b(za2.this, interruptedIOException);
                za2.this.e.o().e(this);
            } catch (Throwable th) {
                za2.this.e.o().e(this);
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public za2 m() {
            return za2.this;
        }

        /* access modifiers changed from: package-private */
        public String n() {
            return za2.this.i.j().m();
        }
    }

    private za2(xa2 xa2, ab2 ab2, boolean z) {
        this.e = xa2;
        this.i = ab2;
        this.j = z;
        this.f = new gc2(xa2, z);
        a aVar = new a();
        this.g = aVar;
        aVar.g((long) xa2.d(), TimeUnit.MILLISECONDS);
    }

    private void c() {
        this.f.j(dd2.j().n("response.body().close()"));
    }

    static za2 f(xa2 xa2, ab2 ab2, boolean z) {
        za2 za2 = new za2(xa2, ab2, z);
        za2.h = xa2.q().a(za2);
        return za2;
    }

    public void cancel() {
        this.f.b();
    }

    /* renamed from: d */
    public za2 clone() {
        return f(this.e, this.i, this.j);
    }

    /* access modifiers changed from: package-private */
    public cb2 e() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.e.u());
        arrayList.add(this.f);
        arrayList.add(new xb2(this.e.n()));
        arrayList.add(new kb2(this.e.v()));
        arrayList.add(new qb2(this.e));
        if (!this.j) {
            arrayList.addAll(this.e.w());
        }
        arrayList.add(new yb2(this.j));
        cb2 c = new dc2(arrayList, (wb2) null, (zb2) null, (sb2) null, 0, this.i, this, this.h, this.e.f(), this.e.H(), this.e.O()).c(this.i);
        if (!this.f.e()) {
            return c;
        }
        ib2.g(c);
        throw new IOException("Canceled");
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return this.i.j().C();
    }

    public cb2 h() {
        synchronized (this) {
            if (!this.k) {
                this.k = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        c();
        this.g.k();
        this.h.c(this);
        try {
            this.e.o().b(this);
            cb2 e2 = e();
            if (e2 != null) {
                this.e.o().f(this);
                return e2;
            }
            throw new IOException("Canceled");
        } catch (IOException e3) {
            IOException j2 = j(e3);
            this.h.b(this, j2);
            throw j2;
        } catch (Throwable th) {
            this.e.o().f(this);
            throw th;
        }
    }

    public ab2 i() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public IOException j(@Nullable IOException iOException) {
        if (!this.g.n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public boolean l() {
        return this.f.e();
    }

    /* access modifiers changed from: package-private */
    public String n() {
        StringBuilder sb = new StringBuilder();
        sb.append(l() ? "canceled " : "");
        sb.append(this.j ? "web socket" : "call");
        sb.append(" to ");
        sb.append(g());
        return sb.toString();
    }

    public void z(fa2 fa2) {
        synchronized (this) {
            if (!this.k) {
                this.k = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        c();
        this.h.c(this);
        this.e.o().a(new b(fa2));
    }
}
