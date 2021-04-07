package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: u30  reason: default package */
final class u30 implements k20 {
    private final List<h20> e;

    public u30(List<h20> list) {
        this.e = Collections.unmodifiableList(list);
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
