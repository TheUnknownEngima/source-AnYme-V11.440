package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: ck1  reason: default package */
public class ck1 extends yi1<String> implements dk1, RandomAccess {
    private static final ck1 g;
    private final List<Object> f;

    static {
        ck1 ck1 = new ck1();
        g = ck1;
        ck1.s();
    }

    public ck1() {
        this(10);
    }

    public ck1(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private ck1(ArrayList<Object> arrayList) {
        this.f = arrayList;
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof ej1 ? ((ej1) obj).A() : xj1.j((byte[]) obj);
    }

    public List<?> O() {
        return Collections.unmodifiableList(this.f);
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof dk1) {
            collection = ((dk1) collection).O();
        }
        boolean addAll = this.f.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public dk1 b0() {
        return t0() ? new ol1(this) : this;
    }

    /* renamed from: c */
    public void add(int i, String str) {
        a();
        this.f.add(i, str);
        this.modCount++;
    }

    public void clear() {
        a();
        this.f.clear();
        this.modCount++;
    }

    /* renamed from: g */
    public String get(int i) {
        Object obj = this.f.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ej1) {
            ej1 ej1 = (ej1) obj;
            String A = ej1.A();
            if (ej1.l()) {
                this.f.set(i, A);
            }
            return A;
        }
        byte[] bArr = (byte[]) obj;
        String j = xj1.j(bArr);
        if (xj1.g(bArr)) {
            this.f.set(i, j);
        }
        return j;
    }

    /* renamed from: h */
    public ck1 w(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f);
            return new ck1((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public String remove(int i) {
        a();
        Object remove = this.f.remove(i);
        this.modCount++;
        return d(remove);
    }

    /* renamed from: j */
    public String set(int i, String str) {
        a();
        return d(this.f.set(i, str));
    }

    public Object n0(int i) {
        return this.f.get(i);
    }

    public int size() {
        return this.f.size();
    }

    public void x(ej1 ej1) {
        a();
        this.f.add(ej1);
        this.modCount++;
    }
}
