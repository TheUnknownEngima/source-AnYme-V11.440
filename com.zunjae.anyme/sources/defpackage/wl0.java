package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: wl0  reason: default package */
public final class wl0 extends vj0<String> implements vl0, RandomAccess {
    private static final wl0 g;
    private final List<Object> f;

    static {
        wl0 wl0 = new wl0();
        g = wl0;
        wl0.q();
    }

    public wl0() {
        this(10);
    }

    public wl0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private wl0(ArrayList<Object> arrayList) {
        this.f = arrayList;
    }

    private static String c(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof bk0 ? ((bk0) obj).m() : gl0.g((byte[]) obj);
    }

    public final vl0 a0() {
        return T() ? new ao0(this) : this;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.f.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof vl0) {
            collection = ((vl0) collection).x0();
        }
        boolean addAll = this.f.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        a();
        this.f.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bk0) {
            bk0 bk0 = (bk0) obj;
            String m = bk0.m();
            if (bk0.n()) {
                this.f.set(i, m);
            }
            return m;
        }
        byte[] bArr = (byte[]) obj;
        String g2 = gl0.g(bArr);
        if (gl0.f(bArr)) {
            this.f.set(i, g2);
        }
        return g2;
    }

    public final /* synthetic */ ll0 l0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f);
            return new wl0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        a();
        Object remove = this.f.remove(i);
        this.modCount++;
        return c(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        a();
        return c(this.f.set(i, (String) obj));
    }

    public final int size() {
        return this.f.size();
    }

    public final Object w0(int i) {
        return this.f.get(i);
    }

    public final List<?> x0() {
        return Collections.unmodifiableList(this.f);
    }
}
