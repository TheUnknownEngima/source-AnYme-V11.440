package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.r;

public abstract class q<A extends a.b, ResultT> {
    private final d[] a;
    private final boolean b;

    public static class a<A extends a.b, ResultT> {
        /* access modifiers changed from: private */
        public o<A, f81<ResultT>> a;
        private boolean b;
        private d[] c;

        private a() {
            this.b = true;
        }

        public q<A, ResultT> a() {
            r.b(this.a != null, "execute parameter required");
            return new p0(this, this.c, this.b);
        }

        public a<A, ResultT> b(o<A, f81<ResultT>> oVar) {
            this.a = oVar;
            return this;
        }

        public a<A, ResultT> c(boolean z) {
            this.b = z;
            return this;
        }

        public a<A, ResultT> d(d... dVarArr) {
            this.c = dVarArr;
            return this;
        }
    }

    @Deprecated
    public q() {
        this.a = null;
        this.b = false;
    }

    private q(d[] dVarArr, boolean z) {
        this.a = dVarArr;
        this.b = z;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>();
    }

    /* access modifiers changed from: protected */
    public abstract void b(A a2, f81<ResultT> f81);

    public boolean c() {
        return this.b;
    }

    public final d[] d() {
        return this.a;
    }
}
