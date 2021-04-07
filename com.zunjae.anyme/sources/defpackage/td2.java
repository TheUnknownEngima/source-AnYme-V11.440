package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: td2  reason: default package */
public class td2 extends ee2 {
    private ee2 e;

    public td2(ee2 ee2) {
        if (ee2 != null) {
            this.e = ee2;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public ee2 a() {
        return this.e.a();
    }

    public ee2 b() {
        return this.e.b();
    }

    public long c() {
        return this.e.c();
    }

    public ee2 d(long j) {
        return this.e.d(j);
    }

    public boolean e() {
        return this.e.e();
    }

    public void f() {
        this.e.f();
    }

    public ee2 g(long j, TimeUnit timeUnit) {
        return this.e.g(j, timeUnit);
    }

    public long h() {
        return this.e.h();
    }

    public final ee2 i() {
        return this.e;
    }

    public final td2 j(ee2 ee2) {
        if (ee2 != null) {
            this.e = ee2;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
