package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: p30  reason: default package */
final class p30 implements k20 {
    private final l30 e;
    private final long[] f;
    private final Map<String, o30> g;
    private final Map<String, m30> h;
    private final Map<String, String> i;

    public p30(l30 l30, Map<String, o30> map, Map<String, m30> map2, Map<String, String> map3) {
        this.e = l30;
        this.h = map2;
        this.i = map3;
        this.g = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f = l30.j();
    }

    public int a(long j) {
        int d = v50.d(this.f, j, false, false);
        if (d < this.f.length) {
            return d;
        }
        return -1;
    }

    public long e(int i2) {
        return this.f[i2];
    }

    public List<h20> f(long j) {
        return this.e.h(j, this.g, this.h, this.i);
    }

    public int h() {
        return this.f.length;
    }
}
