package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.r;

public final class j<L> {
    private volatile L a;
    private final a<L> b;

    public static final class a<L> {
        private final L a;
        private final String b;

        a(L l, String str) {
            this.a = l;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
        }
    }

    public interface b<L> {
        void a(L l);

        void b();
    }

    private final class c extends l90 {
        public c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            r.a(z);
            j.this.c((b) message.obj);
        }
    }

    j(Looper looper, L l, String str) {
        new c(looper);
        r.k(l, "Listener must not be null");
        this.a = l;
        r.f(str);
        this.b = new a<>(l, str);
    }

    public final void a() {
        this.a = null;
    }

    public final a<L> b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final void c(b<? super L> bVar) {
        L l = this.a;
        if (l == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(l);
        } catch (RuntimeException e) {
            bVar.b();
            throw e;
        }
    }
}
