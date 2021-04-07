package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.r;
import java.util.Set;

public final class a<O extends d> {
    private final C0087a<?, O> a;
    private final String b;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class C0087a<T extends f, O> extends e<T, O> {
        @Deprecated
        public abstract T a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, O o, f.a aVar, f.b bVar);
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface C0088a extends d {
            Account z();
        }

        public interface b extends d {
            GoogleSignInAccount a();
        }

        public static final class c implements d {
            private c() {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        Set<Scope> a();

        void b(k kVar, Set<Scope> set);

        void d();

        String e();

        void f(c.C0090c cVar);

        void i(c.e eVar);

        boolean l();

        int m();

        com.google.android.gms.common.d[] n();

        boolean o();

        boolean u();

        boolean y();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
        void h(int i, T t);

        String j();

        T k(IBinder iBinder);

        String p();
    }

    public <C extends f> a(String str, C0087a<C, O> aVar, g<C> gVar) {
        r.k(aVar, "Cannot construct an Api with a null ClientBuilder");
        r.k(gVar, "Cannot construct an Api with a null ClientKey");
        this.b = str;
        this.a = aVar;
    }

    public final String a() {
        return this.b;
    }

    public final C0087a<?, O> b() {
        r.n(this.a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.a;
    }
}
