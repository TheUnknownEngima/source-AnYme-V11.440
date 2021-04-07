package defpackage;

import android.app.Activity;
import defpackage.uq0;

/* renamed from: xr0  reason: default package */
final class xr0 extends uq0.a {
    private final /* synthetic */ Activity i;
    private final /* synthetic */ uq0.b j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    xr0(uq0.b bVar, Activity activity) {
        super(uq0.this);
        this.j = bVar;
        this.i = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        uq0.this.h.onActivityDestroyed(x80.s3(this.i), this.f);
    }
}
