package defpackage;

import java.util.ArrayList;

/* renamed from: of2  reason: default package */
public class of2 extends ArrayList<nf2> {
    private final int e;

    of2(int i, int i2) {
        super(i);
        this.e = i2;
    }

    public static of2 d() {
        return new of2(0, 0);
    }

    public static of2 g(int i) {
        return new of2(16, i);
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return size() < this.e;
    }
}
