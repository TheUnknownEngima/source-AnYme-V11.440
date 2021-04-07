package com.google.firebase.remoteconfig;

final /* synthetic */ class c implements x71 {
    private final e a;
    private final e81 b;
    private final e81 c;

    private c(e eVar, e81 e81, e81 e812) {
        this.a = eVar;
        this.b = e81;
        this.c = e812;
    }

    public static x71 b(e eVar, e81 e81, e81 e812) {
        return new c(eVar, e81, e812);
    }

    public Object a(e81 e81) {
        return e.j(this.a, this.b, this.c, e81);
    }
}
