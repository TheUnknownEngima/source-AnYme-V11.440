package defpackage;

import kotlinx.coroutines.a0;
import kotlinx.coroutines.internal.v;

/* renamed from: n92  reason: default package */
public final class n92 extends o92 {
    private static final a0 j;
    public static final n92 k;

    static {
        n92 n92 = new n92();
        k = n92;
        j = n92.V(x.d("kotlinx.coroutines.io.parallelism", w72.b(64, v.a()), 0, 0, 12, (Object) null));
    }

    private n92() {
        super(0, 0, (String) null, 7, (r62) null);
    }

    public final a0 c0() {
        return j;
    }

    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    public String toString() {
        return "DefaultDispatcher";
    }
}
