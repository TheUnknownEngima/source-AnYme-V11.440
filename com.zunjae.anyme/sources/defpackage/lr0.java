package defpackage;

import defpackage.uq0;

/* renamed from: lr0  reason: default package */
final class lr0 extends uq0.a {
    private final /* synthetic */ int i = 5;
    private final /* synthetic */ String j;
    private final /* synthetic */ Object k;
    private final /* synthetic */ uq0 l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    lr0(uq0 uq0, boolean z, int i2, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.l = uq0;
        this.j = str;
        this.k = obj;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.l.h.logHealthData(this.i, this.j, x80.s3(this.k), x80.s3(null), x80.s3(null));
    }
}
