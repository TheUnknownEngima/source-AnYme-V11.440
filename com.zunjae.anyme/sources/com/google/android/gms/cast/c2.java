package com.google.android.gms.cast;

import androidx.mediarouter.media.h;

final class c2 extends h.a {
    private final /* synthetic */ CastRemoteDisplayLocalService a;

    c2(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.a = castRemoteDisplayLocalService;
    }

    public final void i(h hVar, h.f fVar) {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService;
        String str;
        this.a.k("onRouteUnselected");
        if (this.a.g == null) {
            castRemoteDisplayLocalService = this.a;
            str = "onRouteUnselected, no device was selected";
        } else if (!CastDevice.l(fVar.j()).i().equals(this.a.g.i())) {
            castRemoteDisplayLocalService = this.a;
            str = "onRouteUnselected, device does not match";
        } else {
            CastRemoteDisplayLocalService.b();
            return;
        }
        castRemoteDisplayLocalService.k(str);
    }
}
