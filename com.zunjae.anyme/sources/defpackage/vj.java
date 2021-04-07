package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vj  reason: default package */
public class vj {
    private final List<a<?, ?>> a = new ArrayList();

    /* renamed from: vj$a */
    private static final class a<Z, R> {
        private final Class<Z> a;
        private final Class<R> b;
        final uj<Z, R> c;

        a(Class<Z> cls, Class<R> cls2, uj<Z, R> ujVar) {
            this.a = cls;
            this.b = cls2;
            this.c = ujVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    public synchronized <Z, R> uj<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return wj.b();
        }
        for (a next : this.a) {
            if (next.a(cls, cls2)) {
                return next.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> a2 : this.a) {
            if (a2.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, uj<Z, R> ujVar) {
        this.a.add(new a(cls, cls2, ujVar));
    }
}
