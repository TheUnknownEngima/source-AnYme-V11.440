package androidx.lifecycle;

import androidx.lifecycle.h;

class CompositeGeneratedAdaptersObserver implements l {
    private final g[] e;

    CompositeGeneratedAdaptersObserver(g[] gVarArr) {
        this.e = gVarArr;
    }

    public void c(n nVar, h.a aVar) {
        s sVar = new s();
        for (g a : this.e) {
            a.a(nVar, aVar, false, sVar);
        }
        for (g a2 : this.e) {
            a2.a(nVar, aVar, true, sVar);
        }
    }
}
