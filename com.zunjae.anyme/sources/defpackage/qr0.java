package defpackage;

import android.os.Bundle;
import defpackage.uq0;

/* renamed from: qr0  reason: default package */
final class qr0 extends uq0.a {
    private final /* synthetic */ Long i;
    private final /* synthetic */ String j;
    private final /* synthetic */ String k;
    private final /* synthetic */ Bundle l;
    private final /* synthetic */ boolean m;
    private final /* synthetic */ boolean n;
    private final /* synthetic */ uq0 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    qr0(uq0 uq0, Long l2, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(uq0);
        this.o = uq0;
        this.i = l2;
        this.j = str;
        this.k = str2;
        this.l = bundle;
        this.m = z;
        this.n = z2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Long l2 = this.i;
        this.o.h.logEvent(this.j, this.k, this.l, this.m, this.n, l2 == null ? this.e : l2.longValue());
    }
}
