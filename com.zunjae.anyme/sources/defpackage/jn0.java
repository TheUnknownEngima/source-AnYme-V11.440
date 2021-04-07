package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: jn0  reason: default package */
final class jn0 extends pn0 {
    private final /* synthetic */ in0 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private jn0(in0 in0) {
        super(in0, (hn0) null);
        this.f = in0;
    }

    /* synthetic */ jn0(in0 in0, hn0 hn0) {
        this(in0);
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new kn0(this.f, (hn0) null);
    }
}
