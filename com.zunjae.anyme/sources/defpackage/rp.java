package defpackage;

import defpackage.aq;

/* renamed from: rp  reason: default package */
final /* synthetic */ class rp implements aq.d {
    private final gq a;

    private rp(gq gqVar) {
        this.a = gqVar;
    }

    public static aq.d b(gq gqVar) {
        return new rp(gqVar);
    }

    public Object a() {
        return this.a.getWritableDatabase();
    }
}
