package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.b;
import com.google.android.gms.cast.framework.media.i;
import com.google.android.gms.cast.o;
import com.google.android.gms.cast.q;
import java.util.List;

final class r0 implements k70 {
    private final /* synthetic */ i a;

    r0(i iVar) {
        this.a = iVar;
    }

    private final void l() {
        q k;
        if (this.a.k != null && (k = this.a.k()) != null) {
            k.Y().a(this.a.k.b(k));
            List<b> a2 = this.a.k.a(k);
            MediaInfo j = this.a.j();
            if (j != null) {
                j.F().a(a2);
            }
        }
    }

    public final void a() {
        l();
        for (i.b a2 : this.a.g) {
            a2.a();
        }
        for (i.a c : this.a.h) {
            c.c();
        }
    }

    public final void b() {
        for (i.b b : this.a.g) {
            b.b();
        }
        for (i.a e : this.a.h) {
            e.e();
        }
    }

    public final void c() {
        for (i.b c : this.a.g) {
            c.c();
        }
        for (i.a d : this.a.h) {
            d.d();
        }
    }

    public final void d() {
        l();
        this.a.Z();
        for (i.b d : this.a.g) {
            d.d();
        }
        for (i.a g : this.a.h) {
            g.g();
        }
    }

    public final void e() {
        for (i.b e : this.a.g) {
            e.e();
        }
        for (i.a a2 : this.a.h) {
            a2.a();
        }
    }

    public final void f(int[] iArr, int i) {
        for (i.a i2 : this.a.h) {
            i2.i(iArr, i);
        }
    }

    public final void g(int[] iArr) {
        for (i.a l : this.a.h) {
            l.l(iArr);
        }
    }

    public final void h(int[] iArr) {
        for (i.a h : this.a.h) {
            h.h(iArr);
        }
    }

    public final void i(int[] iArr) {
        for (i.a k : this.a.h) {
            k.k(iArr);
        }
    }

    public final void j(MediaError mediaError) {
        for (i.a b : this.a.h) {
            b.b(mediaError);
        }
    }

    public final void k(o[] oVarArr) {
        for (i.a j : this.a.h) {
            j.j(oVarArr);
        }
    }
}
