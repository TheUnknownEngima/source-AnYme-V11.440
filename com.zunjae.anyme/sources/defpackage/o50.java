package defpackage;

import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.v;

/* renamed from: o50  reason: default package */
public final class o50 implements d50 {
    private final r40 e;
    private boolean f;
    private long g;
    private long h;
    private o0 i = o0.e;

    public o50(r40 r40) {
        this.e = r40;
    }

    public void a(long j) {
        this.g = j;
        if (this.f) {
            this.h = this.e.a();
        }
    }

    public void b() {
        if (!this.f) {
            this.h = this.e.a();
            this.f = true;
        }
    }

    public void c() {
        if (this.f) {
            a(o());
            this.f = false;
        }
    }

    public o0 e() {
        return this.i;
    }

    public void g(o0 o0Var) {
        if (this.f) {
            a(o());
        }
        this.i = o0Var;
    }

    public long o() {
        long j = this.g;
        if (!this.f) {
            return j;
        }
        long a = this.e.a() - this.h;
        o0 o0Var = this.i;
        return j + (o0Var.a == 1.0f ? v.a(a) : o0Var.a(a));
    }
}
