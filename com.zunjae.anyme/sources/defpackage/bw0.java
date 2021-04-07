package defpackage;

import java.io.Serializable;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: bw0  reason: default package */
public class bw0<K, V> extends gv0<K, V> implements Serializable {
    private final transient zv0<K, ? extends uv0<V>> e;

    bw0(zv0<K, ? extends uv0<V>> zv0, int i) {
        this.e = zv0;
    }

    public final boolean a(@NullableDecl Object obj) {
        return obj != null && super.a(obj);
    }

    public final /* synthetic */ Map zza() {
        return this.e;
    }
}
