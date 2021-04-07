package defpackage;

import defpackage.jq;

/* renamed from: ro  reason: default package */
final /* synthetic */ class ro implements jq.a {
    private final so a;
    private final eo b;
    private final zn c;

    private ro(so soVar, eo eoVar, zn znVar) {
        this.a = soVar;
        this.b = eoVar;
        this.c = znVar;
    }

    public static jq.a a(so soVar, eo eoVar, zn znVar) {
        return new ro(soVar, eoVar, znVar);
    }

    public Object h() {
        return so.b(this.a, this.b, this.c);
    }
}
