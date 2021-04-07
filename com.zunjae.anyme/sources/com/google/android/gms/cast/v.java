package com.google.android.gms.cast;

import android.view.Display;
import com.google.android.gms.cast.CastRemoteDisplayLocalService;
import com.google.android.gms.common.api.Status;

final class v implements z71<Void> {
    private final /* synthetic */ CastRemoteDisplayLocalService a;

    v(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.a = castRemoteDisplayLocalService;
    }

    public final void a(e81<Void> e81) {
        if (!e81.q()) {
            this.a.k("Unable to stop the remote display, result unsuccessful");
            if (this.a.e.get() != null) {
                ((CastRemoteDisplayLocalService.a) this.a.e.get()).b(new Status(2202));
            }
        } else {
            this.a.k("remote display stopped");
        }
        Display unused = this.a.h = null;
    }
}
