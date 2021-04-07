package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: a11  reason: default package */
final class a11 extends g11 {
    private final /* synthetic */ z01 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a11(z01 z01) {
        super(z01, (x01) null);
        this.f = z01;
    }

    /* synthetic */ a11(z01 z01, x01 x01) {
        this(z01);
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new b11(this.f, (x01) null);
    }
}
