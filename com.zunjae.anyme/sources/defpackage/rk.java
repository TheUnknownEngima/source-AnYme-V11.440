package defpackage;

import com.bumptech.glide.load.d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rk  reason: default package */
public class rk {
    private final List<a<?>> a = new ArrayList();

    /* renamed from: rk$a */
    private static final class a<T> {
        private final Class<T> a;
        final d<T> b;

        a(Class<T> cls, d<T> dVar) {
            this.a = cls;
            this.b = dVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, d<T> dVar) {
        this.a.add(new a(cls, dVar));
    }

    public synchronized <T> d<T> b(Class<T> cls) {
        for (a next : this.a) {
            if (next.a(cls)) {
                return next.b;
            }
        }
        return null;
    }
}
