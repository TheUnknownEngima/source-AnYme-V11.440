package defpackage;

import java.util.NoSuchElementException;

/* renamed from: s72  reason: default package */
public final class s72 extends s32 {
    private final int e;
    private boolean f;
    private int g;
    private final int h;

    public s72(int i, int i2, int i3) {
        this.h = i3;
        this.e = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f = z;
        this.g = !z ? this.e : i;
    }

    public int b() {
        int i = this.g;
        if (i != this.e) {
            this.g = this.h + i;
        } else if (this.f) {
            this.f = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f;
    }
}
