package defpackage;

import android.os.Bundle;
import defpackage.uq0;

/* renamed from: zq0  reason: default package */
final class zq0 extends uq0.a {
    private final /* synthetic */ String i;
    private final /* synthetic */ String j;
    private final /* synthetic */ Bundle k;
    private final /* synthetic */ uq0 l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zq0(uq0 uq0, String str, String str2, Bundle bundle) {
        super(uq0);
        this.l = uq0;
        this.i = str;
        this.j = str2;
        this.k = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.l.h.clearConditionalUserProperty(this.i, this.j, this.k);
    }
}
