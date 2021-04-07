package defpackage;

import defpackage.ua2;
import java.util.List;

/* renamed from: dc2  reason: default package */
public final class dc2 implements ua2.a {
    private final List<ua2> a;
    private final wb2 b;
    private final zb2 c;
    private final sb2 d;
    private final int e;
    private final ab2 f;
    private final ea2 g;
    private final pa2 h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public dc2(List<ua2> list, wb2 wb2, zb2 zb2, sb2 sb2, int i2, ab2 ab2, ea2 ea2, pa2 pa2, int i3, int i4, int i5) {
        this.a = list;
        this.d = sb2;
        this.b = wb2;
        this.c = zb2;
        this.e = i2;
        this.f = ab2;
        this.g = ea2;
        this.h = pa2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
    }

    public int a() {
        return this.j;
    }

    public int b() {
        return this.k;
    }

    public cb2 c(ab2 ab2) {
        return j(ab2, this.b, this.c, this.d);
    }

    public ia2 d() {
        return this.d;
    }

    public int e() {
        return this.i;
    }

    public ea2 f() {
        return this.g;
    }

    public pa2 g() {
        return this.h;
    }

    public zb2 h() {
        return this.c;
    }

    public ab2 i() {
        return this.f;
    }

    public cb2 j(ab2 ab2, wb2 wb2, zb2 zb2, sb2 sb2) {
        if (this.e < this.a.size()) {
            this.l++;
            if (this.c != null && !this.d.t(ab2.j())) {
                throw new IllegalStateException("network interceptor " + this.a.get(this.e - 1) + " must retain the same host and port");
            } else if (this.c == null || this.l <= 1) {
                dc2 dc2 = new dc2(this.a, wb2, zb2, sb2, this.e + 1, ab2, this.g, this.h, this.i, this.j, this.k);
                ua2 ua2 = this.a.get(this.e);
                cb2 a2 = ua2.a(dc2);
                if (zb2 != null && this.e + 1 < this.a.size() && dc2.l != 1) {
                    throw new IllegalStateException("network interceptor " + ua2 + " must call proceed() exactly once");
                } else if (a2 == null) {
                    throw new NullPointerException("interceptor " + ua2 + " returned null");
                } else if (a2.a() != null) {
                    return a2;
                } else {
                    throw new IllegalStateException("interceptor " + ua2 + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + this.a.get(this.e - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public wb2 k() {
        return this.b;
    }
}
