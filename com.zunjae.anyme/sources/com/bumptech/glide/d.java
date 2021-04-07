package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.c;
import defpackage.bg;
import defpackage.ik;
import defpackage.jg;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class d {
    private final Map<Class<?>, k<?, ?>> a = new b0();
    private xe b;
    private rf c;
    private of d;
    private ig e;
    private lg f;
    private lg g;
    private bg.a h;
    private jg i;
    private ak j;
    private int k = 4;
    private c.a l = new a(this);
    private ik.b m;
    private lg n;
    private boolean o;
    private List<bl<Object>> p;
    private boolean q;
    private boolean r;

    class a implements c.a {
        a(d dVar) {
        }

        public cl a() {
            return new cl();
        }
    }

    /* access modifiers changed from: package-private */
    public c a(Context context) {
        Context context2 = context;
        if (this.f == null) {
            this.f = lg.g();
        }
        if (this.g == null) {
            this.g = lg.e();
        }
        if (this.n == null) {
            this.n = lg.c();
        }
        if (this.i == null) {
            this.i = new jg.a(context2).a();
        }
        if (this.j == null) {
            this.j = new ck();
        }
        if (this.c == null) {
            int b2 = this.i.b();
            if (b2 > 0) {
                this.c = new xf((long) b2);
            } else {
                this.c = new sf();
            }
        }
        if (this.d == null) {
            this.d = new wf(this.i.a());
        }
        if (this.e == null) {
            this.e = new hg((long) this.i.d());
        }
        if (this.h == null) {
            this.h = new gg(context2);
        }
        if (this.b == null) {
            this.b = new xe(this.e, this.h, this.g, this.f, lg.h(), this.n, this.o);
        }
        List<bl<Object>> list = this.p;
        this.p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        return new c(context, this.b, this.e, this.c, this.d, new ik(this.m), this.j, this.k, this.l, this.a, this.p, this.q, this.r);
    }

    public <T> d b(Class<T> cls, k<?, T> kVar) {
        this.a.put(cls, kVar);
        return this;
    }

    public d c(bg.a aVar) {
        this.h = aVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void d(ik.b bVar) {
        this.m = bVar;
    }
}
