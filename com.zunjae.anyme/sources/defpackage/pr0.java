package defpackage;

import defpackage.uq0;

/* renamed from: pr0  reason: default package */
final class pr0 extends uq0.a {
    private final /* synthetic */ String i;
    private final /* synthetic */ String j;
    private final /* synthetic */ Object k;
    private final /* synthetic */ boolean l;
    private final /* synthetic */ uq0 m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    pr0(uq0 uq0, String str, String str2, Object obj, boolean z) {
        super(uq0);
        this.m = uq0;
        this.i = str;
        this.j = str2;
        this.k = obj;
        this.l = z;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.m.h.setUserProperty(this.i, this.j, x80.s3(this.k), this.l, this.e);
    }
}
