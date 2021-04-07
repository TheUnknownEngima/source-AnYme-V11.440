package defpackage;

import java.util.NoSuchElementException;

/* renamed from: ak0  reason: default package */
final class ak0 extends ck0 {
    private int e = 0;
    private final int f = this.g.size();
    private final /* synthetic */ bk0 g;

    ak0(bk0 bk0) {
        this.g = bk0;
    }

    public final boolean hasNext() {
        return this.e < this.f;
    }

    public final byte nextByte() {
        int i = this.e;
        if (i < this.f) {
            this.e = i + 1;
            return this.g.g(i);
        }
        throw new NoSuchElementException();
    }
}
