package defpackage;

import android.os.RemoteException;
import androidx.mediarouter.media.h;
import com.google.android.gms.common.internal.r;

/* renamed from: ba0  reason: default package */
public final class ba0 extends h.a {
    private static final u60 b = new u60("MediaRouterCallback");
    private final z90 a;

    public ba0(z90 z90) {
        r.j(z90);
        this.a = z90;
    }

    public final void d(h hVar, h.f fVar) {
        try {
            this.a.Y(fVar.l(), fVar.j());
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteAdded", z90.class.getSimpleName());
        }
    }

    public final void e(h hVar, h.f fVar) {
        try {
            this.a.f3(fVar.l(), fVar.j());
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteChanged", z90.class.getSimpleName());
        }
    }

    public final void g(h hVar, h.f fVar) {
        try {
            this.a.L2(fVar.l(), fVar.j());
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteRemoved", z90.class.getSimpleName());
        }
    }

    public final void h(h hVar, h.f fVar) {
        try {
            this.a.o2(fVar.l(), fVar.j());
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteSelected", z90.class.getSimpleName());
        }
    }

    public final void j(h hVar, h.f fVar, int i) {
        try {
            this.a.D1(fVar.l(), fVar.j(), i);
        } catch (RemoteException e) {
            b.b(e, "Unable to call %s on %s.", "onRouteUnselected", z90.class.getSimpleName());
        }
    }
}
