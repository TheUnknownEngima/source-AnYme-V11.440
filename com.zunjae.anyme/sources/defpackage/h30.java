package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: h30  reason: default package */
final class h30 implements k20 {
    private final List<List<h20>> e;
    private final List<Long> f;

    public h30(List<List<h20>> list, List<Long> list2) {
        this.e = list;
        this.f = list2;
    }

    public int a(long j) {
        int c = v50.c(this.f, Long.valueOf(j), false, false);
        if (c < this.f.size()) {
            return c;
        }
        return -1;
    }

    public long e(int i) {
        boolean z = true;
        q40.a(i >= 0);
        if (i >= this.f.size()) {
            z = false;
        }
        q40.a(z);
        return this.f.get(i).longValue();
    }

    public List<h20> f(long j) {
        int e2 = v50.e(this.f, Long.valueOf(j), true, false);
        return e2 == -1 ? Collections.emptyList() : this.e.get(e2);
    }

    public int h() {
        return this.f.size();
    }
}
