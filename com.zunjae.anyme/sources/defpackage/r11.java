package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: r11  reason: default package */
public final class r11 extends AbstractList<String> implements lz0, RandomAccess {
    /* access modifiers changed from: private */
    public final lz0 e;

    public r11(lz0 lz0) {
        this.e = lz0;
    }

    public final void W(lx0 lx0) {
        throw new UnsupportedOperationException();
    }

    public final List<?> b() {
        return this.e.b();
    }

    public final Object e(int i) {
        return this.e.e(i);
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.e.get(i);
    }

    public final Iterator<String> iterator() {
        return new t11(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new q11(this, i);
    }

    public final int size() {
        return this.e.size();
    }

    public final lz0 v() {
        return this;
    }
}
