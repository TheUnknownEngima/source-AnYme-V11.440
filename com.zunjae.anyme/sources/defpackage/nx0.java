package defpackage;

import java.util.NoSuchElementException;

/* renamed from: nx0  reason: default package */
final class nx0 extends px0 {
    private int e = 0;
    private final int f = this.g.c();
    private final /* synthetic */ lx0 g;

    nx0(lx0 lx0) {
        this.g = lx0;
    }

    public final boolean hasNext() {
        return this.e < this.f;
    }

    public final byte zza() {
        int i = this.e;
        if (i < this.f) {
            this.e = i + 1;
            return this.g.l(i);
        }
        throw new NoSuchElementException();
    }
}
