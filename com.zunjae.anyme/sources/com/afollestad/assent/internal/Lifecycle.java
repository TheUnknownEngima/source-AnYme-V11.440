package com.afollestad.assent.internal;

import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;

public final class Lifecycle implements m {
    private n e;
    private h.a[] f;
    private z52<? super h.a, u22> g;

    public Lifecycle(n nVar, h.a[] aVarArr, z52<? super h.a, u22> z52) {
        h a;
        v62.f(aVarArr, "watchFor");
        this.e = nVar;
        this.f = aVarArr;
        this.g = z52;
        if (nVar != null && (a = nVar.a()) != null) {
            a.a(this);
        }
    }

    @v(h.a.ON_CREATE)
    public final void onCreate() {
        z52<? super h.a, u22> z52;
        if (((this.f.length == 0) || b32.g(this.f, h.a.ON_CREATE)) && (z52 = this.g) != null) {
            u22 r = z52.r(h.a.ON_CREATE);
        }
    }

    @v(h.a.ON_DESTROY)
    public final void onDestroy() {
        z52<? super h.a, u22> z52;
        h a;
        n nVar = this.e;
        if (!(nVar == null || (a = nVar.a()) == null)) {
            a.c(this);
        }
        this.e = null;
        if (((this.f.length == 0) || b32.g(this.f, h.a.ON_DESTROY)) && (z52 = this.g) != null) {
            u22 r = z52.r(h.a.ON_DESTROY);
        }
        this.g = null;
    }

    @v(h.a.ON_PAUSE)
    public final void onPause() {
        z52<? super h.a, u22> z52;
        if (((this.f.length == 0) || b32.g(this.f, h.a.ON_PAUSE)) && (z52 = this.g) != null) {
            u22 r = z52.r(h.a.ON_PAUSE);
        }
    }

    @v(h.a.ON_RESUME)
    public final void onResume() {
        z52<? super h.a, u22> z52;
        if (((this.f.length == 0) || b32.g(this.f, h.a.ON_RESUME)) && (z52 = this.g) != null) {
            u22 r = z52.r(h.a.ON_RESUME);
        }
    }

    @v(h.a.ON_START)
    public final void onStart() {
        z52<? super h.a, u22> z52;
        if (((this.f.length == 0) || b32.g(this.f, h.a.ON_START)) && (z52 = this.g) != null) {
            u22 r = z52.r(h.a.ON_START);
        }
    }

    @v(h.a.ON_STOP)
    public final void onStop() {
        z52<? super h.a, u22> z52;
        if (((this.f.length == 0) || b32.g(this.f, h.a.ON_STOP)) && (z52 = this.g) != null) {
            u22 r = z52.r(h.a.ON_STOP);
        }
    }
}
