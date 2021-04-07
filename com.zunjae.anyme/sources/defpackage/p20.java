package defpackage;

import java.util.List;

/* renamed from: p20  reason: default package */
public abstract class p20 extends bs implements k20 {
    private k20 e;
    private long f;

    public int a(long j) {
        k20 k20 = this.e;
        q40.e(k20);
        return k20.a(j - this.f);
    }

    public void clear() {
        super.clear();
        this.e = null;
    }

    public long e(int i) {
        k20 k20 = this.e;
        q40.e(k20);
        return k20.e(i) + this.f;
    }

    public List<h20> f(long j) {
        k20 k20 = this.e;
        q40.e(k20);
        return k20.f(j - this.f);
    }

    public int h() {
        k20 k20 = this.e;
        q40.e(k20);
        return k20.h();
    }

    public void i(long j, k20 k20, long j2) {
        this.timeUs = j;
        this.e = k20;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.f = j;
    }
}
