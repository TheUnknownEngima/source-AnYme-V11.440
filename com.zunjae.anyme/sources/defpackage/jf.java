package defpackage;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.g;
import defpackage.ah;
import defpackage.se;
import defpackage.wd;
import java.io.File;
import java.util.List;

/* renamed from: jf  reason: default package */
class jf implements se, wd.a<Object> {
    private final se.a e;
    private final te<?> f;
    private int g;
    private int h = -1;
    private g i;
    private List<ah<File, ?>> j;
    private int k;
    private volatile ah.a<?> l;
    private File m;
    private kf n;

    jf(te<?> teVar, se.a aVar) {
        this.f = teVar;
        this.e = aVar;
    }

    private boolean a() {
        return this.k < this.j.size();
    }

    public boolean b() {
        List<g> c = this.f.c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m2 = this.f.m();
        if (!m2.isEmpty()) {
            while (true) {
                if (this.j == null || !a()) {
                    int i2 = this.h + 1;
                    this.h = i2;
                    if (i2 >= m2.size()) {
                        int i3 = this.g + 1;
                        this.g = i3;
                        if (i3 >= c.size()) {
                            return false;
                        }
                        this.h = 0;
                    }
                    g gVar = c.get(this.g);
                    Class cls = m2.get(this.h);
                    g gVar2 = gVar;
                    this.n = new kf(this.f.b(), gVar2, this.f.o(), this.f.s(), this.f.f(), this.f.r(cls), cls, this.f.k());
                    File b = this.f.d().b(this.n);
                    this.m = b;
                    if (b != null) {
                        this.i = gVar;
                        this.j = this.f.j(b);
                        this.k = 0;
                    }
                } else {
                    this.l = null;
                    while (!z && a()) {
                        List<ah<File, ?>> list = this.j;
                        int i4 = this.k;
                        this.k = i4 + 1;
                        this.l = list.get(i4).b(this.m, this.f.s(), this.f.f(), this.f.k());
                        if (this.l != null && this.f.t(this.l.c.a())) {
                            this.l.c.e(this.f.l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f.q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f.i() + " to " + this.f.q());
        }
    }

    public void c(Exception exc) {
        this.e.a(this.n, exc, this.l.c, a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        ah.a<?> aVar = this.l;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void f(Object obj) {
        this.e.f(this.i, obj, this.l.c, a.RESOURCE_DISK_CACHE, this.n);
    }
}
