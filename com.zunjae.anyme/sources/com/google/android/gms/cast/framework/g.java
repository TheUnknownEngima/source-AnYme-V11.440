package com.google.android.gms.cast.framework;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.internal.r;

public class g {
    private static final u60 c = new u60("SessionManager");
    private final h0 a;
    private final Context b;

    public g(h0 h0Var, Context context) {
        this.a = h0Var;
        this.b = context;
    }

    public <T extends f> void a(h<T> hVar, Class<T> cls) {
        r.j(hVar);
        r.j(cls);
        r.e("Must be called from the main thread.");
        try {
            this.a.u0(new p(hVar, cls));
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "addSessionManagerListener", h0.class.getSimpleName());
        }
    }

    public void b(boolean z) {
        r.e("Must be called from the main thread.");
        try {
            c.e("End session for %s", this.b.getPackageName());
            this.a.P(true, z);
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "endCurrentSession", h0.class.getSimpleName());
        }
    }

    public c c() {
        r.e("Must be called from the main thread.");
        f d = d();
        if (d == null || !(d instanceof c)) {
            return null;
        }
        return (c) d;
    }

    public f d() {
        r.e("Must be called from the main thread.");
        try {
            return (f) x80.r3(this.a.R2());
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "getWrappedCurrentSession", h0.class.getSimpleName());
            return null;
        }
    }

    public <T extends f> void e(h<T> hVar, Class cls) {
        r.j(cls);
        r.e("Must be called from the main thread.");
        if (hVar != null) {
            try {
                this.a.O0(new p(hVar, cls));
            } catch (RemoteException e) {
                c.b(e, "Unable to call %s on %s.", "removeSessionManagerListener", h0.class.getSimpleName());
            }
        }
    }

    public final w80 f() {
        try {
            return this.a.I();
        } catch (RemoteException e) {
            c.b(e, "Unable to call %s on %s.", "getWrappedThis", h0.class.getSimpleName());
            return null;
        }
    }
}
