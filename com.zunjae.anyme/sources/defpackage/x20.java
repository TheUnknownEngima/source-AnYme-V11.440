package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: x20  reason: default package */
final class x20 implements k20 {
    private final List<h20> e;

    public x20(List<h20> list) {
        this.e = list;
    }

    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public long e(int i) {
        q40.a(i == 0);
        return 0;
    }

    public List<h20> f(long j) {
        return j >= 0 ? this.e : Collections.emptyList();
    }

    public int h() {
        return 1;
    }
}
