package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.r;

public abstract class f {
    private static final u60 c = new u60("Session");
    private final g0 a;
    private final a b;

    class a extends m {
        private a() {
        }

        public final void B0(Bundle bundle) {
            f.this.i(bundle);
        }

        public final void B2(Bundle bundle) {
            f.this.j(bundle);
        }

        public final w80 J1() {
            return x80.s3(f.this);
        }

        public final void N1(Bundle bundle) {
            f.this.l(bundle);
        }

        public final int a() {
            return 12451009;
        }

        public final void s1(Bundle bundle) {
            f.this.k(bundle);
        }

        public final long t0() {
            return f.this.b();
        }

        public final void v1(boolean z) {
            f.this.a(z);
        }
    }

    protected f(Context context, String str, String str2) {
        a aVar = new a();
        this.b = aVar;
        this.a = t90.e(context, str, str2, aVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    public long b() {
        r.e("Must be called from the main thread.");
        return 0;
    }

    public boolean c() {
        r.e("Must be called from the main thread.");
        try {
            return this.a.y();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "isConnected", g0.class.getSimpleName());
            return false;
        }
    }

    public boolean d() {
        r.e("Must be called from the main thread.");
        try {
            return this.a.u();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "isConnecting", g0.class.getSimpleName());
            return false;
        }
    }

    public boolean e() {
        r.e("Must be called from the main thread.");
        try {
            return this.a.w2();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "isResuming", g0.class.getSimpleName());
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void f(int i) {
        try {
            this.a.C2(i);
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "notifyFailedToResumeSession", g0.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public final void g(int i) {
        try {
            this.a.f2(i);
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "notifyFailedToStartSession", g0.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public final void h(int i) {
        try {
            this.a.Y0(i);
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "notifySessionEnded", g0.class.getSimpleName());
        }
    }

    /* access modifiers changed from: protected */
    public void i(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void j(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public abstract void k(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract void l(Bundle bundle);

    public final w80 m() {
        try {
            return this.a.F();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "getWrappedObject", g0.class.getSimpleName());
            return null;
        }
    }
}
