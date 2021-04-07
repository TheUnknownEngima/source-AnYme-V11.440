package defpackage;

import android.app.Activity;
import defpackage.uq0;

/* renamed from: ar0  reason: default package */
final class ar0 extends uq0.a {
    private final /* synthetic */ Activity i;
    private final /* synthetic */ String j;
    private final /* synthetic */ String k;
    private final /* synthetic */ uq0 l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ar0(uq0 uq0, Activity activity, String str, String str2) {
        super(uq0);
        this.l = uq0;
        this.i = activity;
        this.j = str;
        this.k = str2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.l.h.setCurrentScreen(x80.s3(this.i), this.j, this.k, this.e);
    }
}
