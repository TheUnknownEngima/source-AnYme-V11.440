package com.google.android.gms.cast;

final class d2 implements Runnable {
    private final /* synthetic */ boolean e;
    private final /* synthetic */ CastRemoteDisplayLocalService f;

    d2(CastRemoteDisplayLocalService castRemoteDisplayLocalService, boolean z) {
        this.f = castRemoteDisplayLocalService;
        this.e = z;
    }

    public final void run() {
        this.f.h(this.e);
    }
}
