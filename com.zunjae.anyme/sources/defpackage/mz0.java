package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: mz0  reason: default package */
public final class mz0 extends fx0<String> implements lz0, RandomAccess {
    private static final mz0 g;
    private final List<Object> f;

    static {
        mz0 mz0 = new mz0();
        g = mz0;
        mz0.f0();
    }

    public mz0() {
        this(10);
    }

    public mz0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    private mz0(ArrayList<Object> arrayList) {
        this.f = arrayList;
    }

    private static String c(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof lx0 ? ((lx0) obj).n() : uy0.i((byte[]) obj);
    }

    public final void W(lx0 lx0) {
        a();
        this.f.add(lx0);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a();
        this.f.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof lz0) {
            collection = ((lz0) collection).b();
        }
        boolean addAll = this.f.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final List<?> b() {
        return Collections.unmodifiableList(this.f);
    }

    public final void clear() {
        a();
        this.f.clear();
        this.modCount++;
    }

    public final Object e(int i) {
        return this.f.get(i);
    }

    public final /* synthetic */ bz0 f(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f);
            return new mz0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof lx0) {
            lx0 lx0 = (lx0) obj;
            String n = lx0.n();
            if (lx0.p()) {
                this.f.set(i, n);
            }
            return n;
        }
        byte[] bArr = (byte[]) obj;
        String i2 = uy0.i(bArr);
        if (uy0.h(bArr)) {
            this.f.set(i, i2);
        }
        return i2;
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

    public final lz0 v() {
        return zza() ? new r11(this) : this;
    }
}
