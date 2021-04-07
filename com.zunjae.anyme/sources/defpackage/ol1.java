package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: ol1  reason: default package */
public class ol1 extends AbstractList<String> implements dk1, RandomAccess {
    /* access modifiers changed from: private */
    public final dk1 e;

    /* renamed from: ol1$a */
    class a implements ListIterator<String> {
        ListIterator<String> e = ol1.this.e.listIterator(this.f);
        final /* synthetic */ int f;

        a(int i) {
            this.f = i;
        }

        public void a(String str) {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            a((String) obj);
            throw null;
        }

        /* renamed from: b */
        public String next() {
            return this.e.next();
        }

        /* renamed from: c */
        public String previous() {
            return this.e.previous();
        }

        public void d(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.e.hasNext();
        }

        public boolean hasPrevious() {
            return this.e.hasPrevious();
        }

        public int nextIndex() {
            return this.e.nextIndex();
        }

        public int previousIndex() {
            return this.e.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            d((String) obj);
            throw null;
        }
    }

    /* renamed from: ol1$b */
    class b implements Iterator<String> {
        Iterator<String> e = ol1.this.e.iterator();

        b() {
        }

        /* renamed from: a */
        public String next() {
            return this.e.next();
        }

        public boolean hasNext() {
            return this.e.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ol1(dk1 dk1) {
        this.e = dk1;
    }

    public List<?> O() {
        return this.e.O();
    }

    public dk1 b0() {
        return this;
    }

    /* renamed from: c */
    public String get(int i) {
        return (String) this.e.get(i);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public ListIterator<String> listIterator(int i) {
        return new a(i);
    }

    public Object n0(int i) {
        return this.e.n0(i);
    }

    public int size() {
        return this.e.size();
    }

    public void x(ej1 ej1) {
        throw new UnsupportedOperationException();
    }
}
