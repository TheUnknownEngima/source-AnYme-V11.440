package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: r30  reason: default package */
final class r30 implements k20 {
    public static final r30 f = new r30();
    private final List<h20> e;

    private r30() {
        this.e = Collections.emptyList();
    }

    public r30(h20 h20) {
        this.e = Collections.singletonList(h20);
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
