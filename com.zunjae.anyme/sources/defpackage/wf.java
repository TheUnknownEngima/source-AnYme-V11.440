package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: wf  reason: default package */
public final class wf implements of {
    private final uf<a, Object> a = new uf<>();
    private final b b = new b();
    private final Map<Class<?>, NavigableMap<Integer, Integer>> c = new HashMap();
    private final Map<Class<?>, nf<?>> d = new HashMap();
    private final int e;
    private int f;

    /* renamed from: wf$a */
    private static final class a implements zf {
        private final b a;
        int b;
        private Class<?> c;

        a(b bVar) {
            this.a = bVar;
        }

        public void a() {
            this.a.c(this);
        }

        /* access modifiers changed from: package-private */
        public void b(int i, Class<?> cls) {
            this.b = i;
            this.c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            int i = this.b * 31;
            Class<?> cls = this.c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.b + "array=" + this.c + '}';
        }
    }

    /* renamed from: wf$b */
    private static final class b extends qf<a> {
        b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        /* access modifiers changed from: package-private */
        public a e(int i, Class<?> cls) {
            a aVar = (a) b();
            aVar.b(i, cls);
            return aVar;
        }
    }

    public wf(int i) {
        this.e = i;
    }

    private void f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m = m(cls);
        Integer num = (Integer) m.get(Integer.valueOf(i));
        if (num != null) {
            int intValue = num.intValue();
            Integer valueOf = Integer.valueOf(i);
            if (intValue == 1) {
                m.remove(valueOf);
            } else {
                m.put(valueOf, Integer.valueOf(num.intValue() - 1));
            }
        } else {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        }
    }

    private void g() {
        h(this.e);
    }

    private void h(int i) {
        while (this.f > i) {
            Object f2 = this.a.f();
            jm.d(f2);
            nf i2 = i(f2);
            this.f -= i2.b(f2) * i2.a();
            f(i2.b(f2), f2.getClass());
            if (Log.isLoggable(i2.o(), 2)) {
                i2.o();
                "evicted: " + i2.b(f2);
            }
        }
    }

    private <T> nf<T> i(T t) {
        return j(t.getClass());
    }

    private <T> nf<T> j(Class<T> cls) {
        nf<T> nfVar = this.d.get(cls);
        if (nfVar == null) {
            if (cls.equals(int[].class)) {
                nfVar = new vf();
            } else if (cls.equals(byte[].class)) {
                nfVar = new tf();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.d.put(cls, nfVar);
        }
        return nfVar;
    }

    private <T> T k(a aVar) {
        return this.a.a(aVar);
    }

    private <T> T l(a aVar, Class<T> cls) {
        nf<T> j = j(cls);
        T k = k(aVar);
        if (k != null) {
            this.f -= j.b(k) * j.a();
            f(j.b(k), cls);
        }
        if (k != null) {
            return k;
        }
        if (Log.isLoggable(j.o(), 2)) {
            j.o();
            "Allocated " + aVar.b + " bytes";
        }
        return j.newArray(aVar.b);
    }

    private NavigableMap<Integer, Integer> m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private boolean n() {
        int i = this.f;
        return i == 0 || this.e / i >= 2;
    }

    private boolean o(int i) {
        return i <= this.e / 2;
    }

    private boolean p(int i, Integer num) {
        return num != null && (n() || num.intValue() <= i * 8);
    }

    public synchronized void a(int i) {
        if (i >= 40) {
            try {
                b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            h(this.e / 2);
        }
    }

    public synchronized void b() {
        h(0);
    }

    public synchronized <T> T c(int i, Class<T> cls) {
        return l(this.b.e(i, cls), cls);
    }

    public synchronized <T> void d(T t) {
        Class<?> cls = t.getClass();
        nf<?> j = j(cls);
        int b2 = j.b(t);
        int a2 = j.a() * b2;
        if (o(a2)) {
            a e2 = this.b.e(b2, cls);
            this.a.d(e2, t);
            NavigableMap<Integer, Integer> m = m(cls);
            Integer num = (Integer) m.get(Integer.valueOf(e2.b));
            Integer valueOf = Integer.valueOf(e2.b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m.put(valueOf, Integer.valueOf(i));
            this.f += a2;
            g();
        }
    }

    public synchronized <T> T e(int i, Class<T> cls) {
        Integer ceilingKey;
        ceilingKey = m(cls).ceilingKey(Integer.valueOf(i));
        return l(p(i, ceilingKey) ? this.b.e(ceilingKey.intValue(), cls) : this.b.e(i, cls), cls);
    }
}
