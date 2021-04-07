package defpackage;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.g;
import defpackage.ah;
import defpackage.se;
import defpackage.wd;
import java.io.File;
import java.util.List;

/* renamed from: pe  reason: default package */
class pe implements se, wd.a<Object> {
    private final List<g> e;
    private final te<?> f;
    private final se.a g;
    private int h;
    private g i;
    private List<ah<File, ?>> j;
    private int k;
    private volatile ah.a<?> l;
    private File m;

    pe(List<g> list, te<?> teVar, se.a aVar) {
        this.h = -1;
        this.e = list;
        this.f = teVar;
        this.g = aVar;
    }

    pe(te<?> teVar, se.a aVar) {
        this(teVar.c(), teVar, aVar);
    }

    private boolean a() {
        return this.k < this.j.size();
    }

    public boolean b() {
        while (true) {
            boolean z = false;
            if (this.j == null || !a()) {
                int i2 = this.h + 1;
                this.h = i2;
                if (i2 >= this.e.size()) {
                    return false;
                }
                g gVar = this.e.get(this.h);
                File b = this.f.d().b(new qe(gVar, this.f.o()));
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
                    int i3 = this.k;
                    this.k = i3 + 1;
                    this.l = list.get(i3).b(this.m, this.f.s(), this.f.f(), this.f.k());
                    if (this.l != null && this.f.t(this.l.c.a())) {
                        this.l.c.e(this.f.l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    public void c(Exception exc) {
        this.g.a(this.i, exc, this.l.c, a.DATA_DISK_CACHE);
    }

    public void cancel() {
        ah.a<?> aVar = this.l;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void f(Object obj) {
        this.g.f(this.i, obj, this.l.c, a.DATA_DISK_CACHE, this.i);
    }
}
