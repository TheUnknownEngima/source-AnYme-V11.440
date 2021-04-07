package com.zunjae.anyme.features.vydia;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import java.util.List;

public final class c extends a0 {
    private int c;
    private boolean d;
    private int e;
    private final d22 f = g22.b(a.f);

    static final class a extends w62 implements o52<t<List<? extends l22<? extends String, ? extends String>>>> {
        public static final a f = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final t<List<l22<String, String>>> invoke() {
            return new t<>();
        }
    }

    public final boolean f() {
        return this.d;
    }

    public final int g() {
        return this.e;
    }

    public final int h() {
        return this.c;
    }

    public final t<List<l22<String, String>>> i() {
        return (t) this.f.getValue();
    }

    public final void j(boolean z) {
        this.d = z;
    }

    public final void k(int i) {
        this.e = i;
    }

    public final void l(int i) {
        this.c = i;
    }
}
