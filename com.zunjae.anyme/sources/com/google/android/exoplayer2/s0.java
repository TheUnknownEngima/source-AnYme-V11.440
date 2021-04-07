package com.google.android.exoplayer2;

import android.os.Handler;

public final class s0 {
    private final b a;
    private final a b;
    private final b1 c;
    private int d;
    private Object e;
    private Handler f;
    private int g;
    private long h = -9223372036854775807L;
    private boolean i = true;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public interface a {
        void d(s0 s0Var);
    }

    public interface b {
        void r(int i, Object obj);
    }

    public s0(a aVar, b bVar, b1 b1Var, int i2, Handler handler) {
        this.b = aVar;
        this.a = bVar;
        this.c = b1Var;
        this.f = handler;
        this.g = i2;
    }

    public synchronized boolean a() {
        q40.f(this.j);
        q40.f(this.f.getLooper().getThread() != Thread.currentThread());
        while (!this.l) {
            wait();
        }
        return this.k;
    }

    public boolean b() {
        return this.i;
    }

    public Handler c() {
        return this.f;
    }

    public Object d() {
        return this.e;
    }

    public long e() {
        return this.h;
    }

    public b f() {
        return this.a;
    }

    public b1 g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.g;
    }

    public synchronized boolean j() {
        return this.m;
    }

    public synchronized void k(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }

    public s0 l() {
        q40.f(!this.j);
        if (this.h == -9223372036854775807L) {
            q40.a(this.i);
        }
        this.j = true;
        this.b.d(this);
        return this;
    }

    public s0 m(Object obj) {
        q40.f(!this.j);
        this.e = obj;
        return this;
    }

    public s0 n(int i2) {
        q40.f(!this.j);
        this.d = i2;
        return this;
    }
}
