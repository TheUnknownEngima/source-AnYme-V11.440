package defpackage;

import com.bumptech.glide.h;
import com.bumptech.glide.load.i;
import defpackage.ah;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: eh  reason: default package */
public class eh {
    private static final c e = new c();
    private static final ah<Object, Object> f = new a();
    private final List<b<?, ?>> a;
    private final c b;
    private final Set<b<?, ?>> c;
    private final r3<List<Throwable>> d;

    /* renamed from: eh$a */
    private static class a implements ah<Object, Object> {
        a() {
        }

        public boolean a(Object obj) {
            return false;
        }

        public ah.a<Object> b(Object obj, int i, int i2, i iVar) {
            return null;
        }
    }

    /* renamed from: eh$b */
    private static class b<Model, Data> {
        private final Class<Model> a;
        final Class<Data> b;
        final bh<? extends Model, ? extends Data> c;

        public b(Class<Model> cls, Class<Data> cls2, bh<? extends Model, ? extends Data> bhVar) {
            this.a = cls;
            this.b = cls2;
            this.c = bhVar;
        }

        public boolean a(Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: eh$c */
    static class c {
        c() {
        }

        public <Model, Data> dh<Model, Data> a(List<ah<Model, Data>> list, r3<List<Throwable>> r3Var) {
            return new dh<>(list, r3Var);
        }
    }

    public eh(r3<List<Throwable>> r3Var) {
        this(r3Var, e);
    }

    eh(r3<List<Throwable>> r3Var, c cVar) {
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = r3Var;
        this.b = cVar;
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, bh<? extends Model, ? extends Data> bhVar, boolean z) {
        b bVar = new b(cls, cls2, bhVar);
        List<b<?, ?>> list = this.a;
        list.add(z ? list.size() : 0, bVar);
    }

    private <Model, Data> ah<Model, Data> c(b<?, ?> bVar) {
        ah<? extends Model, ? extends Data> b2 = bVar.c.b(this);
        jm.d(b2);
        return b2;
    }

    private static <Model, Data> ah<Model, Data> f() {
        return f;
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, bh<? extends Model, ? extends Data> bhVar) {
        a(cls, cls2, bhVar, true);
    }

    public synchronized <Model, Data> ah<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b next : this.a) {
                if (this.c.contains(next)) {
                    z = true;
                } else if (next.b(cls, cls2)) {
                    this.c.add(next);
                    arrayList.add(c(next));
                    this.c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.b.a(arrayList, this.d);
            } else if (arrayList.size() == 1) {
                return (ah) arrayList.get(0);
            } else if (z) {
                return f();
            } else {
                throw new h.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model> List<ah<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b next : this.a) {
                if (!this.c.contains(next)) {
                    if (next.a(cls)) {
                        this.c.add(next);
                        arrayList.add(c(next));
                        this.c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : this.a) {
            if (!arrayList.contains(next.b) && next.a(cls)) {
                arrayList.add(next.b);
            }
        }
        return arrayList;
    }
}
