package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uk  reason: default package */
public class uk {
    private final AtomicReference<im> a = new AtomicReference<>();
    private final b0<im, List<Class<?>>> b = new b0<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        im andSet = this.a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new im(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.b) {
            list = this.b.get(andSet);
        }
        this.a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.b) {
            this.b.put(new im(cls, cls2, cls3), list);
        }
    }
}
