package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.mediarouter.media.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class d {
    private final Context a;
    private final C0035d b;
    private final c c = new c();
    private a d;
    private c e;
    private boolean f;
    private e g;
    private boolean h;

    public static abstract class a {
        public abstract void a(d dVar, e eVar);
    }

    public static abstract class b extends e {
        private final Object a = new Object();
        Executor b;
        C0034d c;
        Collection<c> d;

        class a implements Runnable {
            final /* synthetic */ Collection e;

            a(Collection collection) {
                this.e = collection;
            }

            public void run() {
                b bVar = b.this;
                bVar.c.a(bVar, this.e);
            }
        }

        /* renamed from: androidx.mediarouter.media.d$b$b  reason: collision with other inner class name */
        class C0033b implements Runnable {
            final /* synthetic */ Collection e;

            C0033b(Collection collection) {
                this.e = collection;
            }

            public void run() {
                b bVar = b.this;
                bVar.c.a(bVar, this.e);
            }
        }

        public static final class c {
            final b a;
            final int b;
            final boolean c;
            final boolean d;
            final boolean e;
            Bundle f;

            c(b bVar, int i, boolean z, boolean z2, boolean z3) {
                this.a = bVar;
                this.b = i;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }

            static c a(Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                return new c(b.e(bundle.getBundle("mrDescriptor")), bundle.getInt("selectionState", 1), bundle.getBoolean("isUnselectable", false), bundle.getBoolean("isGroupable", false), bundle.getBoolean("isTransferable", false));
            }

            public b b() {
                return this.a;
            }

            public int c() {
                return this.b;
            }

            public boolean d() {
                return this.d;
            }

            public boolean e() {
                return this.e;
            }

            public boolean f() {
                return this.c;
            }

            /* access modifiers changed from: package-private */
            public Bundle g() {
                if (this.f == null) {
                    Bundle bundle = new Bundle();
                    this.f = bundle;
                    bundle.putBundle("mrDescriptor", this.a.a());
                    this.f.putInt("selectionState", this.b);
                    this.f.putBoolean("isUnselectable", this.c);
                    this.f.putBoolean("isGroupable", this.d);
                    this.f.putBoolean("isTransferable", this.e);
                }
                return this.f;
            }
        }

        /* renamed from: androidx.mediarouter.media.d$b$d  reason: collision with other inner class name */
        interface C0034d {
            void a(b bVar, Collection<c> collection);
        }

        public String k() {
            return null;
        }

        public String l() {
            return null;
        }

        public final void m(Collection<c> collection) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.b.execute(new C0033b(collection));
                } else {
                    this.d = new ArrayList(collection);
                }
            }
        }

        public abstract void n(String str);

        public abstract void o(String str);

        public abstract void p(List<String> list);

        /* access modifiers changed from: package-private */
        public void q(Executor executor, C0034d dVar) {
            synchronized (this.a) {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                } else if (dVar != null) {
                    this.b = executor;
                    this.c = dVar;
                    if (this.d != null && !this.d.isEmpty()) {
                        Collection<c> collection = this.d;
                        this.d = null;
                        this.b.execute(new a(collection));
                    }
                } else {
                    throw new NullPointerException("Listener shouldn't be null");
                }
            }
        }
    }

    private final class c extends Handler {
        c() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                d.this.l();
            } else if (i == 2) {
                d.this.m();
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.d$d  reason: collision with other inner class name */
    public static final class C0035d {
        private final ComponentName a;

        C0035d(ComponentName componentName) {
            if (componentName != null) {
                this.a = componentName;
                return;
            }
            throw new IllegalArgumentException("componentName must not be null");
        }

        public ComponentName a() {
            return this.a;
        }

        public String b() {
            return this.a.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
        }
    }

    public static abstract class e {
        public boolean d(Intent intent, h.c cVar) {
            return false;
        }

        public void e() {
        }

        public void f() {
        }

        public void g(int i) {
        }

        public void h() {
        }

        public void i(int i) {
            h();
        }

        public void j(int i) {
        }
    }

    d(Context context, C0035d dVar) {
        if (context != null) {
            this.a = context;
            this.b = dVar == null ? new C0035d(new ComponentName(context, getClass())) : dVar;
            return;
        }
        throw new IllegalArgumentException("context must not be null");
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.h = false;
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this, this.g);
        }
    }

    /* access modifiers changed from: package-private */
    public void m() {
        this.f = false;
        v(this.e);
    }

    public final Context n() {
        return this.a;
    }

    public final e o() {
        return this.g;
    }

    public final c p() {
        return this.e;
    }

    public final Handler q() {
        return this.c;
    }

    public final C0035d r() {
        return this.b;
    }

    public b s(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public e t(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public e u(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return t(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public void v(c cVar) {
    }

    public final void w(a aVar) {
        h.d();
        this.d = aVar;
    }

    public final void x(e eVar) {
        h.d();
        if (this.g != eVar) {
            this.g = eVar;
            if (!this.h) {
                this.h = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    public final void y(c cVar) {
        h.d();
        if (!p3.a(this.e, cVar)) {
            this.e = cVar;
            if (!this.f) {
                this.f = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }
}
