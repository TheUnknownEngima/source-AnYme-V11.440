package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: z  reason: default package */
public class z<K, V> implements Iterable<Map.Entry<K, V>> {
    c<K, V> e;
    private c<K, V> f;
    private WeakHashMap<f<K, V>, Boolean> g = new WeakHashMap<>();
    private int h = 0;

    /* renamed from: z$a */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.h;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.g;
        }
    }

    /* renamed from: z$b */
    private static class b<K, V> extends e<K, V> {
        b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> b(c<K, V> cVar) {
            return cVar.g;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.h;
        }
    }

    /* renamed from: z$c */
    static class c<K, V> implements Map.Entry<K, V> {
        final K e;
        final V f;
        c<K, V> g;
        c<K, V> h;

        c(K k, V v) {
            this.e = k;
            this.f = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.e.equals(cVar.e) && this.f.equals(cVar.f);
        }

        public K getKey() {
            return this.e;
        }

        public V getValue() {
            return this.f;
        }

        public int hashCode() {
            return this.e.hashCode() ^ this.f.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.e + "=" + this.f;
        }
    }

    /* renamed from: z$d */
    private class d implements Iterator<Map.Entry<K, V>>, f<K, V> {
        private c<K, V> e;
        private boolean f = true;

        d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.e;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.h;
                this.e = cVar3;
                this.f = cVar3 == null;
            }
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f) {
                this.f = false;
                cVar = z.this.e;
            } else {
                c<K, V> cVar2 = this.e;
                cVar = cVar2 != null ? cVar2.g : null;
            }
            this.e = cVar;
            return this.e;
        }

        public boolean hasNext() {
            if (this.f) {
                return z.this.e != null;
            }
            c<K, V> cVar = this.e;
            return (cVar == null || cVar.g == null) ? false : true;
        }
    }

    /* renamed from: z$e */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {
        c<K, V> e;
        c<K, V> f;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.e = cVar2;
            this.f = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f;
            c<K, V> cVar2 = this.e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        public void a(c<K, V> cVar) {
            if (this.e == cVar && cVar == this.f) {
                this.f = null;
                this.e = null;
            }
            c<K, V> cVar2 = this.e;
            if (cVar2 == cVar) {
                this.e = b(cVar2);
            }
            if (this.f == cVar) {
                this.f = e();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> b(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* renamed from: d */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f;
            this.f = e();
            return cVar;
        }

        public boolean hasNext() {
            return this.f != null;
        }
    }

    /* renamed from: z$f */
    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        b bVar = new b(this.f, this.e);
        this.g.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Map.Entry<K, V> c() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public c<K, V> d(K k) {
        c<K, V> cVar = this.e;
        while (cVar != null && !cVar.e.equals(k)) {
            cVar = cVar.g;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (size() != zVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = zVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public z<K, V>.d g() {
        z<K, V>.d dVar = new d();
        this.g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.f;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public c<K, V> i(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.h++;
        c<K, V> cVar2 = this.f;
        if (cVar2 == null) {
            this.e = cVar;
        } else {
            cVar2.g = cVar;
            cVar.h = cVar2;
        }
        this.f = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.e, this.f);
        this.g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k, V v) {
        c d2 = d(k);
        if (d2 != null) {
            return d2.f;
        }
        i(k, v);
        return null;
    }

    public V k(K k) {
        c d2 = d(k);
        if (d2 == null) {
            return null;
        }
        this.h--;
        if (!this.g.isEmpty()) {
            for (f<K, V> a2 : this.g.keySet()) {
                a2.a(d2);
            }
        }
        c<K, V> cVar = d2.h;
        if (cVar != null) {
            cVar.g = d2.g;
        } else {
            this.e = d2.g;
        }
        c<K, V> cVar2 = d2.g;
        if (cVar2 != null) {
            cVar2.h = d2.h;
        } else {
            this.f = d2.h;
        }
        d2.g = null;
        d2.h = null;
        return d2.f;
    }

    public int size() {
        return this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
