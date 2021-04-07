package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.r;

public class n<A extends a.b, L> {
    public final m<A, L> a;
    public final s<A, L> b;

    public static class a<A extends a.b, L> {
        /* access modifiers changed from: private */
        public o<A, f81<Void>> a;
        /* access modifiers changed from: private */
        public o<A, f81<Boolean>> b;
        private j<L> c;
        private d[] d;
        private boolean e;

        private a() {
            this.e = true;
        }

        public n<A, L> a() {
            boolean z = true;
            r.b(this.a != null, "Must set register function");
            r.b(this.b != null, "Must set unregister function");
            if (this.c == null) {
                z = false;
            }
            r.b(z, "Must set holder");
            return new n<>(new j0(this, this.c, this.d, this.e), new h0(this, this.c.b()));
        }

        public a<A, L> b(o<A, f81<Void>> oVar) {
            this.a = oVar;
            return this;
        }

        public a<A, L> c(d... dVarArr) {
            this.d = dVarArr;
            return this;
        }

        public a<A, L> d(o<A, f81<Boolean>> oVar) {
            this.b = oVar;
            return this;
        }

        public a<A, L> e(j<L> jVar) {
            this.c = jVar;
            return this;
        }
    }

    private n(m<A, L> mVar, s<A, L> sVar) {
        this.a = mVar;
        this.b = sVar;
    }

    public static <A extends a.b, L> a<A, L> a() {
        return new a<>();
    }
}
