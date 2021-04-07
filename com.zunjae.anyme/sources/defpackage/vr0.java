package defpackage;

import android.app.Activity;
import defpackage.uq0;

/* renamed from: vr0  reason: default package */
final class vr0 extends uq0.a {
    private final /* synthetic */ Activity i;
    private final /* synthetic */ x61 j;
    private final /* synthetic */ uq0.b k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    vr0(uq0.b bVar, Activity activity, x61 x61) {
        super(uq0.this);
        this.k = bVar;
        this.i = activity;
        this.j = x61;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        uq0.this.h.onActivitySaveInstanceState(x80.s3(this.i), this.j, this.f);
    }
}
