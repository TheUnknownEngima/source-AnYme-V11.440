package defpackage;

/* renamed from: r42  reason: default package */
class r42 {

    /* renamed from: r42$a */
    public static final class a extends c52 {
        private int f;
        final /* synthetic */ z52 g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(k42 k42, k42 k422, z52 z52) {
            super(k422);
            this.g = z52;
        }

        /* access modifiers changed from: protected */
        public Object k(Object obj) {
            int i = this.f;
            if (i == 0) {
                this.f = 1;
                n22.b(obj);
                z52 z52 = this.g;
                if (z52 != null) {
                    i72.c(z52, 1);
                    return z52.r(this);
                }
                throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f = 2;
                n22.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: r42$b */
    public static final class b extends w42 {
        private int h;
        final /* synthetic */ z52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(k42 k42, n42 n42, k42 k422, n42 n422, z52 z52) {
            super(k422, n422);
            this.i = z52;
        }

        /* access modifiers changed from: protected */
        public Object k(Object obj) {
            int i2 = this.h;
            if (i2 == 0) {
                this.h = 1;
                n22.b(obj);
                z52 z52 = this.i;
                if (z52 != null) {
                    i72.c(z52, 1);
                    return z52.r(this);
                }
                throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i2 == 1) {
                this.h = 2;
                n22.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: r42$c */
    public static final class c extends c52 {
        private int f;
        final /* synthetic */ d62 g;
        final /* synthetic */ Object h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(k42 k42, k42 k422, d62 d62, Object obj) {
            super(k422);
            this.g = d62;
            this.h = obj;
        }

        /* access modifiers changed from: protected */
        public Object k(Object obj) {
            int i = this.f;
            if (i == 0) {
                this.f = 1;
                n22.b(obj);
                d62 d62 = this.g;
                if (d62 != null) {
                    i72.c(d62, 2);
                    return d62.G(this.h, this);
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i == 1) {
                this.f = 2;
                n22.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: r42$d */
    public static final class d extends w42 {
        private int h;
        final /* synthetic */ d62 i;
        final /* synthetic */ Object j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(k42 k42, n42 n42, k42 k422, n42 n422, d62 d62, Object obj) {
            super(k422, n422);
            this.i = d62;
            this.j = obj;
        }

        /* access modifiers changed from: protected */
        public Object k(Object obj) {
            int i2 = this.h;
            if (i2 == 0) {
                this.h = 1;
                n22.b(obj);
                d62 d62 = this.i;
                if (d62 != null) {
                    i72.c(d62, 2);
                    return d62.G(this.j, this);
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            } else if (i2 == 1) {
                this.h = 2;
                n22.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [r42$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> defpackage.k42<defpackage.u22> a(defpackage.z52<? super defpackage.k42<? super T>, ? extends java.lang.Object> r7, defpackage.k42<? super T> r8) {
        /*
            java.lang.String r0 = "$this$createCoroutineUnintercepted"
            defpackage.v62.e(r7, r0)
            java.lang.String r0 = "completion"
            defpackage.v62.e(r8, r0)
            defpackage.a52.a(r8)
            boolean r0 = r7 instanceof defpackage.t42
            if (r0 != 0) goto L_0x003c
            n42 r5 = r8.e()
            o42 r0 = defpackage.o42.e
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"
            if (r5 != r0) goto L_0x0029
            r42$a r0 = new r42$a
            if (r8 == 0) goto L_0x0023
            r0.<init>(r8, r8, r7)
            goto L_0x0035
        L_0x0023:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r1)
            throw r7
        L_0x0029:
            r42$b r0 = new r42$b
            if (r8 == 0) goto L_0x0036
            r1 = r0
            r2 = r8
            r3 = r5
            r4 = r8
            r6 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0035:
            return r0
        L_0x0036:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r1)
            throw r7
        L_0x003c:
            t42 r7 = (defpackage.t42) r7
            r7.b(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r42.a(z52, k42):k42");
    }

    public static <R, T> k42<u22> b(d62<? super R, ? super k42<? super T>, ? extends Object> d62, R r, k42<? super T> k42) {
        v62.e(d62, "$this$createCoroutineUnintercepted");
        v62.e(k42, "completion");
        a52.a(k42);
        if (d62 instanceof t42) {
            return ((t42) d62).a(r, k42);
        }
        n42 e = k42.e();
        if (e == o42.e) {
            if (k42 != null) {
                return new c(k42, k42, d62, r);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (k42 != null) {
            return new d(k42, e, k42, e, d62, r);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }

    public static <T> k42<T> c(k42<? super T> k42) {
        k42<Object> o;
        v62.e(k42, "$this$intercepted");
        w42 w42 = (w42) (!(k42 instanceof w42) ? null : k42);
        return (w42 == null || (o = w42.o()) == null) ? k42 : o;
    }
}
