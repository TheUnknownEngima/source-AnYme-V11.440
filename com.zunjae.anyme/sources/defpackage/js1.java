package defpackage;

import defpackage.ri2;

/* renamed from: js1  reason: default package */
public final class js1 {
    public static final js1 a = new js1();

    private js1() {
    }

    public final ks1 a(String str) {
        v62.e(str, "ipAddress");
        ri2.b bVar = new ri2.b();
        bVar.b(str);
        bVar.a(wi2.f());
        Object b = bVar.d().b(ks1.class);
        v62.d(b, "retrofit.create(CherryCastingService::class.java)");
        return (ks1) b;
    }
}
