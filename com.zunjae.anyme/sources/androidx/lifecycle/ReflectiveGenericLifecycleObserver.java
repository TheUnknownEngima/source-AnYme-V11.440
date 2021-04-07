package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.h;

class ReflectiveGenericLifecycleObserver implements l {
    private final Object e;
    private final a.C0026a f;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.e = obj;
        this.f = a.c.c(obj.getClass());
    }

    public void c(n nVar, h.a aVar) {
        this.f.a(nVar, aVar, this.e);
    }
}
