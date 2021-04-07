package defpackage;

/* renamed from: qo  reason: default package */
final /* synthetic */ class qo implements Runnable {
    private final so e;
    private final eo f;
    private final bn g;
    private final zn h;

    private qo(so soVar, eo eoVar, bn bnVar, zn znVar) {
        this.e = soVar;
        this.f = eoVar;
        this.g = bnVar;
        this.h = znVar;
    }

    public static Runnable a(so soVar, eo eoVar, bn bnVar, zn znVar) {
        return new qo(soVar, eoVar, bnVar, znVar);
    }

    public void run() {
        so.c(this.e, this.f, this.g, this.h);
    }
}
