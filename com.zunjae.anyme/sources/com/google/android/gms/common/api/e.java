package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.internal.b;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.r;
import java.util.Collections;

public class e<O extends a.d> {
    private final Context a;
    private final a<O> b;
    private final O c;
    private final b<O> d;
    private final Looper e;
    private final int f;
    private final p g;
    protected final f h;

    public static class a {
        public static final a c = new C0089a().a();
        public final p a;
        public final Looper b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        public static class C0089a {
            private p a;
            private Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, this.b);
            }
        }

        private a(p pVar, Account account, Looper looper) {
            this.a = pVar;
            this.b = looper;
        }
    }

    public e(Context context, a<O> aVar, O o, a aVar2) {
        r.k(context, "Null context is not permitted.");
        r.k(aVar, "Api must not be null.");
        r.k(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.b = aVar;
        this.c = o;
        this.e = aVar2.b;
        this.d = b.b(aVar, o);
        f h2 = f.h(this.a);
        this.h = h2;
        this.f = h2.j();
        this.g = aVar2.a;
        this.h.e(this);
    }

    private final <TResult, A extends a.b> e81<TResult> w(int i, q<A, TResult> qVar) {
        f81 f81 = new f81();
        this.h.f(this, i, qVar, f81, this.g);
        return f81.a();
    }

    /* access modifiers changed from: protected */
    public d.a a() {
        Account account;
        GoogleSignInAccount a2;
        GoogleSignInAccount a3;
        d.a aVar = new d.a();
        O o = this.c;
        if (!(o instanceof a.d.b) || (a3 = ((a.d.b) o).a()) == null) {
            O o2 = this.c;
            account = o2 instanceof a.d.C0088a ? ((a.d.C0088a) o2).z() : null;
        } else {
            account = a3.i();
        }
        aVar.c(account);
        O o3 = this.c;
        aVar.a((!(o3 instanceof a.d.b) || (a2 = ((a.d.b) o3).a()) == null) ? Collections.emptySet() : a2.u());
        aVar.d(this.a.getClass().getName());
        aVar.e(this.a.getPackageName());
        return aVar;
    }

    public <TResult, A extends a.b> e81<TResult> d(q<A, TResult> qVar) {
        return w(0, qVar);
    }

    public <A extends a.b> e81<Void> g(n<A, ?> nVar) {
        r.j(nVar);
        r.k(nVar.a.b(), "Listener has already been released.");
        r.k(nVar.b.a(), "Listener has already been released.");
        return this.h.c(this, nVar.a, nVar.b);
    }

    public e81<Boolean> o(j.a<?> aVar) {
        r.k(aVar, "Listener key cannot be null.");
        return this.h.b(this, aVar);
    }

    public <TResult, A extends a.b> e81<TResult> p(q<A, TResult> qVar) {
        return w(1, qVar);
    }

    public b<O> q() {
        return this.d;
    }

    public final int r() {
        return this.f;
    }

    public Looper s() {
        return this.e;
    }

    public <L> j<L> t(L l, String str) {
        return k.a(l, this.e, str);
    }

    public a.f u(Looper looper, f.a<O> aVar) {
        return this.b.b().a(this.a, looper, a().b(), this.c, aVar, aVar);
    }

    public l0 v(Context context, Handler handler) {
        return new l0(context, handler, a().b());
    }
}
