package defpackage;

import android.os.Bundle;
import defpackage.uq0;

/* renamed from: jr0  reason: default package */
final class jr0 extends uq0.a {
    private final /* synthetic */ String i;
    private final /* synthetic */ String j;
    private final /* synthetic */ boolean k;
    private final /* synthetic */ x61 l;
    private final /* synthetic */ uq0 m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    jr0(uq0 uq0, String str, String str2, boolean z, x61 x61) {
        super(uq0);
        this.m = uq0;
        this.i = str;
        this.j = str2;
        this.k = z;
        this.l = x61;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.m.h.getUserProperties(this.i, this.j, this.k, this.l);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.l.p((Bundle) null);
    }
}
