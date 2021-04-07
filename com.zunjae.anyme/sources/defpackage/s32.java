package defpackage;

import java.util.Iterator;

/* renamed from: s32  reason: default package */
public abstract class s32 implements Iterator<Integer>, j72 {
    /* renamed from: a */
    public final Integer next() {
        return Integer.valueOf(b());
    }

    public abstract int b();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
