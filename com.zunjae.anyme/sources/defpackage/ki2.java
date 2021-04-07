package defpackage;

import defpackage.cb2;
import defpackage.ea2;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: ki2  reason: default package */
final class ki2<T> implements ai2<T> {
    private final pi2 e;
    private final Object[] f;
    private final ea2.a g;
    private final ei2<db2, T> h;
    private volatile boolean i;
    @GuardedBy("this")
    @Nullable
    private ea2 j;
    @GuardedBy("this")
    @Nullable
    private Throwable k;
    @GuardedBy("this")
    private boolean l;

    /* renamed from: ki2$a */
    class a implements fa2 {
        final /* synthetic */ ci2 a;

        a(ci2 ci2) {
            this.a = ci2;
        }

        private void c(Throwable th) {
            try {
                this.a.a(ki2.this, th);
            } catch (Throwable th2) {
                vi2.t(th2);
                th2.printStackTrace();
            }
        }

        public void a(ea2 ea2, cb2 cb2) {
            try {
                try {
                    this.a.b(ki2.this, ki2.this.d(cb2));
                } catch (Throwable th) {
                    vi2.t(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                vi2.t(th2);
                c(th2);
            }
        }

        public void b(ea2 ea2, IOException iOException) {
            c(iOException);
        }
    }

    /* renamed from: ki2$b */
    static final class b extends db2 {
        private final db2 f;
        private final pd2 g;
        @Nullable
        IOException h;

        /* renamed from: ki2$b$a */
        class a extends sd2 {
            a(de2 de2) {
                super(de2);
            }

            public long y0(nd2 nd2, long j) {
                try {
                    return super.y0(nd2, j);
                } catch (IOException e) {
                    b.this.h = e;
                    throw e;
                }
            }
        }

        b(db2 db2) {
            this.f = db2;
            this.g = wd2.d(new a(db2.m()));
        }

        public void close() {
            this.f.close();
        }

        public long h() {
            return this.f.h();
        }

        public va2 i() {
            return this.f.i();
        }

        public pd2 m() {
            return this.g;
        }

        /* access modifiers changed from: package-private */
        public void t() {
            IOException iOException = this.h;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: ki2$c */
    static final class c extends db2 {
        @Nullable
        private final va2 f;
        private final long g;

        c(@Nullable va2 va2, long j) {
            this.f = va2;
            this.g = j;
        }

        public long h() {
            return this.g;
        }

        public va2 i() {
            return this.f;
        }

        public pd2 m() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    ki2(pi2 pi2, Object[] objArr, ea2.a aVar, ei2<db2, T> ei2) {
        this.e = pi2;
        this.f = objArr;
        this.g = aVar;
        this.h = ei2;
    }

    private ea2 c() {
        ea2 b2 = this.g.b(this.e.a(this.f));
        if (b2 != null) {
            return b2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public void Q(ci2<T> ci2) {
        ea2 ea2;
        Throwable th;
        vi2.b(ci2, "callback == null");
        synchronized (this) {
            if (!this.l) {
                this.l = true;
                ea2 = this.j;
                th = this.k;
                if (ea2 == null && th == null) {
                    try {
                        ea2 c2 = c();
                        this.j = c2;
                        ea2 = c2;
                    } catch (Throwable th2) {
                        th = th2;
                        vi2.t(th);
                        this.k = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            ci2.a(this, th);
            return;
        }
        if (this.i) {
            ea2.cancel();
        }
        ea2.z(new a(ci2));
    }

    /* renamed from: b */
    public ki2<T> clone() {
        return new ki2<>(this.e, this.f, this.g, this.h);
    }

    public void cancel() {
        ea2 ea2;
        this.i = true;
        synchronized (this) {
            ea2 = this.j;
        }
        if (ea2 != null) {
            ea2.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public qi2<T> d(cb2 cb2) {
        db2 a2 = cb2.a();
        cb2.a A = cb2.A();
        A.b(new c(a2.i(), a2.h()));
        cb2 c2 = A.c();
        int h2 = c2.h();
        if (h2 < 200 || h2 >= 300) {
            try {
                return qi2.c(vi2.a(a2), c2);
            } finally {
                a2.close();
            }
        } else if (h2 == 204 || h2 == 205) {
            a2.close();
            return qi2.f(null, c2);
        } else {
            b bVar = new b(a2);
            try {
                return qi2.f(this.h.a(bVar), c2);
            } catch (RuntimeException e2) {
                bVar.t();
                throw e2;
            }
        }
    }

    public qi2<T> h() {
        ea2 ea2;
        synchronized (this) {
            if (!this.l) {
                this.l = true;
                if (this.k == null) {
                    ea2 = this.j;
                    if (ea2 == null) {
                        try {
                            ea2 = c();
                            this.j = ea2;
                        } catch (IOException | Error | RuntimeException e2) {
                            vi2.t(e2);
                            this.k = e2;
                            throw e2;
                        }
                    }
                } else if (this.k instanceof IOException) {
                    throw ((IOException) this.k);
                } else if (this.k instanceof RuntimeException) {
                    throw ((RuntimeException) this.k);
                } else {
                    throw ((Error) this.k);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.i) {
            ea2.cancel();
        }
        return d(ea2.h());
    }

    public synchronized ab2 i() {
        ea2 ea2 = this.j;
        if (ea2 != null) {
            return ea2.i();
        } else if (this.k == null) {
            try {
                ea2 c2 = c();
                this.j = c2;
                return c2.i();
            } catch (RuntimeException e2) {
                e = e2;
                vi2.t(e);
                this.k = e;
                throw e;
            } catch (Error e3) {
                e = e3;
                vi2.t(e);
                this.k = e;
                throw e;
            } catch (IOException e4) {
                this.k = e4;
                throw new RuntimeException("Unable to create request.", e4);
            }
        } else if (this.k instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.k);
        } else if (this.k instanceof RuntimeException) {
            throw ((RuntimeException) this.k);
        } else {
            throw ((Error) this.k);
        }
    }

    public boolean l() {
        boolean z = true;
        if (this.i) {
            return true;
        }
        synchronized (this) {
            if (this.j == null || !this.j.l()) {
                z = false;
            }
        }
        return z;
    }
}
