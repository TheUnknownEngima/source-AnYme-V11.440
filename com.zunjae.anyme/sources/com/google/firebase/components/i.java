package com.google.firebase.components;

final /* synthetic */ class i implements xh1 {
    private final l a;
    private final d b;

    private i(l lVar, d dVar) {
        this.a = lVar;
        this.b = dVar;
    }

    public static xh1 a(l lVar, d dVar) {
        return new i(lVar, dVar);
    }

    public Object get() {
        return this.b.d().a(new v(this.b, this.a));
    }
}
