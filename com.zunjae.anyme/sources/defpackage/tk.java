package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tk  reason: default package */
public class tk {
    private static final gf<?, ?, ?> c = new gf(Object.class, Object.class, Object.class, Collections.singletonList(new ve(Object.class, Object.class, Object.class, Collections.emptyList(), new wj(), (r3<List<Throwable>>) null)), (r3<List<Throwable>>) null);
    private final b0<im, gf<?, ?, ?>> a = new b0<>();
    private final AtomicReference<im> b = new AtomicReference<>();

    private im b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        im andSet = this.b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new im();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> gf<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        gf<Data, TResource, Transcode> gfVar;
        im b2 = b(cls, cls2, cls3);
        synchronized (this.a) {
            gfVar = this.a.get(b2);
        }
        this.b.set(b2);
        return gfVar;
    }

    public boolean c(gf<?, ?, ?> gfVar) {
        return c.equals(gfVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, gf<?, ?, ?> gfVar) {
        synchronized (this.a) {
            b0<im, gf<?, ?, ?>> b0Var = this.a;
            im imVar = new im(cls, cls2, cls3);
            if (gfVar == null) {
                gfVar = c;
            }
            b0Var.put(imVar, gfVar);
        }
    }
}
