package defpackage;

import android.app.Activity;
import android.os.Bundle;
import defpackage.uq0;

/* renamed from: sr0  reason: default package */
final class sr0 extends uq0.a {
    private final /* synthetic */ Bundle i;
    private final /* synthetic */ Activity j;
    private final /* synthetic */ uq0.b k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    sr0(uq0.b bVar, Bundle bundle, Activity activity) {
        super(uq0.this);
        this.k = bVar;
        this.i = bundle;
        this.j = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Bundle bundle;
        if (this.i != null) {
            bundle = new Bundle();
            if (this.i.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.i.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        uq0.this.h.onActivityCreated(x80.s3(this.j), bundle, this.f);
    }
}
