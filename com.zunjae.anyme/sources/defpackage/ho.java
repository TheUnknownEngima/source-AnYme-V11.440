package defpackage;

import defpackage.Cdo;

/* renamed from: ho  reason: default package */
final class ho<T> implements zm<T> {
    private final eo a;
    private final String b;
    private final vm c;
    private final ym<T, byte[]> d;
    private final io e;

    ho(eo eoVar, String str, vm vmVar, ym<T, byte[]> ymVar, io ioVar) {
        this.a = eoVar;
        this.b = str;
        this.c = vmVar;
        this.d = ymVar;
        this.e = ioVar;
    }

    static /* synthetic */ void c(Exception exc) {
    }

    public void a(wm<T> wmVar) {
        b(wmVar, go.b());
    }

    public void b(wm<T> wmVar, bn bnVar) {
        io ioVar = this.e;
        Cdo.a a2 = Cdo.a();
        a2.e(this.a);
        a2.c(wmVar);
        a2.f(this.b);
        a2.d(this.d);
        a2.b(this.c);
        ioVar.a(a2.a(), bnVar);
    }
}
