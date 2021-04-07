package com.google.android.gms.cast.framework;

import com.google.android.gms.cast.framework.f;

public final class p<T extends f> extends m0 {
    private final h<T> a;
    private final Class<T> b;

    public p(h<T> hVar, Class<T> cls) {
        this.a = hVar;
        this.b = cls;
    }

    public final w80 C() {
        return x80.s3(this.a);
    }

    public final void G1(w80 w80) {
        h<T> hVar;
        f fVar = (f) x80.r3(w80);
        if (this.b.isInstance(fVar) && (hVar = this.a) != null) {
            hVar.o((f) this.b.cast(fVar));
        }
    }

    public final void H2(w80 w80, int i) {
        h<T> hVar;
        f fVar = (f) x80.r3(w80);
        if (this.b.isInstance(fVar) && (hVar = this.a) != null) {
            hVar.k((f) this.b.cast(fVar), i);
        }
    }

    public final void N(w80 w80, String str) {
        h<T> hVar;
        f fVar = (f) x80.r3(w80);
        if (this.b.isInstance(fVar) && (hVar = this.a) != null) {
            hVar.h((f) this.b.cast(fVar), str);
        }
    }

    public final void R(w80 w80, int i) {
        h<T> hVar;
        f fVar = (f) x80.r3(w80);
        if (this.b.isInstance(fVar) && (hVar = this.a) != null) {
            hVar.m((f) this.b.cast(fVar), i);
        }
    }

    public final void X2(w80 w80, int i) {
        h<T> hVar;
        f fVar = (f) x80.r3(w80);
        if (this.b.isInstance(fVar) && (hVar = this.a) != null) {
            hVar.i((f) this.b.cast(fVar), i);
        }
    }

    public final int a() {
        return 12451009;
    }

    public final void n3(w80 w80, boolean z) {
        h<T> hVar;
        f fVar = (f) x80.r3(w80);
        if (this.b.isInstance(fVar) && (hVar = this.a) != null) {
            hVar.l((f) this.b.cast(fVar), z);
        }
    }

    public final void q0(w80 w80, int i) {
        h<T> hVar;
        f fVar = (f) x80.r3(w80);
        if (this.b.isInstance(fVar) && (hVar = this.a) != null) {
            hVar.g((f) this.b.cast(fVar), i);
        }
    }

    public final void s0(w80 w80, String str) {
        h<T> hVar;
        f fVar = (f) x80.r3(w80);
        if (this.b.isInstance(fVar) && (hVar = this.a) != null) {
            hVar.j((f) this.b.cast(fVar), str);
        }
    }

    public final void s2(w80 w80) {
        h<T> hVar;
        f fVar = (f) x80.r3(w80);
        if (this.b.isInstance(fVar) && (hVar = this.a) != null) {
            hVar.n((f) this.b.cast(fVar));
        }
    }
}
