package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: ak1  reason: default package */
public class ak1 extends bk1 {
    private final ok1 e;

    /* renamed from: ak1$b */
    static class b<K> implements Map.Entry<K, Object> {
        private Map.Entry<K, ak1> e;

        private b(Map.Entry<K, ak1> entry) {
            this.e = entry;
        }

        public ak1 a() {
            return this.e.getValue();
        }

        public K getKey() {
            return this.e.getKey();
        }

        public Object getValue() {
            ak1 value = this.e.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof ok1) {
                return this.e.getValue().d((ok1) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: ak1$c */
    static class c<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> e;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.e = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.e.next();
            return next.getValue() instanceof ak1 ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.e.hasNext();
        }

        public void remove() {
            this.e.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public ok1 f() {
        return c(this.e);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
