package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: ao0  reason: default package */
public final class ao0 extends AbstractList<String> implements vl0, RandomAccess {
    /* access modifiers changed from: private */
    public final vl0 e;

    public ao0(vl0 vl0) {
        this.e = vl0;
    }

    public final vl0 a0() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.e.get(i);
    }

    public final Iterator<String> iterator() {
        return new do0(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new zn0(this, i);
    }

    public final int size() {
        return this.e.size();
    }

    public final Object w0(int i) {
        return this.e.w0(i);
    }

    public final List<?> x0() {
        return this.e.x0();
    }
}
