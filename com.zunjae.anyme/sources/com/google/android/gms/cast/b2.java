package com.google.android.gms.cast;

final class b2 implements Runnable {
    private final /* synthetic */ CastRemoteDisplayLocalService e;

    b2(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.e = castRemoteDisplayLocalService;
    }

    public final void run() {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.e;
        boolean i = castRemoteDisplayLocalService.m;
        StringBuilder sb = new StringBuilder(59);
        sb.append("onCreate after delay. The local service been started: ");
        sb.append(i);
        castRemoteDisplayLocalService.k(sb.toString());
        if (!this.e.m) {
            this.e.l("The local service has not been been started, stopping it");
            this.e.stopSelf();
        }
    }
}
