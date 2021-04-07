package com.google.firebase.remoteconfig.internal;

final /* synthetic */ class b implements d81 {
    private final e a;
    private final boolean b;
    private final f c;

    private b(e eVar, boolean z, f fVar) {
        this.a = eVar;
        this.b = z;
        this.c = fVar;
    }

    public static d81 b(e eVar, boolean z, f fVar) {
        return new b(eVar, z, fVar);
    }

    public e81 a(Object obj) {
        return e.h(this.a, this.b, this.c, (Void) obj);
    }
}
