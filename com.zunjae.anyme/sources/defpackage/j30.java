package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: j30  reason: default package */
final class j30 implements k20 {
    private final h20[] e;
    private final long[] f;

    public j30(h20[] h20Arr, long[] jArr) {
        this.e = h20Arr;
        this.f = jArr;
    }

    public int a(long j) {
        int d = v50.d(this.f, j, false, false);
        if (d < this.f.length) {
            return d;
        }
        return -1;
    }

    public long e(int i) {
        boolean z = true;
        q40.a(i >= 0);
        if (i >= this.f.length) {
            z = false;
        }
        q40.a(z);
        return this.f[i];
    }

    public List<h20> f(long j) {
        int f2 = v50.f(this.f, j, true, false);
        if (f2 != -1) {
            h20[] h20Arr = this.e;
            if (h20Arr[f2] != h20.s) {
                return Collections.singletonList(h20Arr[f2]);
            }
        }
        return Collections.emptyList();
    }

    public int h() {
        return this.f.length;
    }
}
