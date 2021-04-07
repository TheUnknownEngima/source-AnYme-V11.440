package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.mikepenz.fastadapter.b;
import com.mikepenz.fastadapter.l;
import com.mikepenz.fastadapter.o;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: jm1  reason: default package */
public class jm1<Item extends l> implements com.mikepenz.fastadapter.d<Item> {
    private com.mikepenz.fastadapter.b<Item> a;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private o<Item> g;

    /* renamed from: jm1$a */
    class a implements km1<Item> {
        final /* synthetic */ Set a;

        a(jm1 jm1, Set set) {
            this.a = set;
        }

        public boolean a(com.mikepenz.fastadapter.c<Item> cVar, int i, Item item, int i2) {
            if (!item.f()) {
                return false;
            }
            this.a.add(item);
            return false;
        }
    }

    /* renamed from: jm1$b */
    class b implements km1<Item> {
        final /* synthetic */ long a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;

        b(long j, boolean z, boolean z2) {
            this.a = j;
            this.b = z;
            this.c = z2;
        }

        public boolean a(com.mikepenz.fastadapter.c<Item> cVar, int i, Item item, int i2) {
            if (item.c() != this.a) {
                return false;
            }
            jm1.this.y(cVar, item, i2, this.b, this.c);
            return true;
        }
    }

    /* renamed from: jm1$c */
    class c implements km1<Item> {
        c() {
        }

        public boolean a(com.mikepenz.fastadapter.c<Item> cVar, int i, Item item, int i2) {
            jm1.this.p(item);
            return false;
        }
    }

    /* renamed from: jm1$d */
    class d implements km1<Item> {
        final /* synthetic */ Set a;

        d(Set set) {
            this.a = set;
        }

        public boolean a(com.mikepenz.fastadapter.c<Item> cVar, int i, Item item, int i2) {
            if (!this.a.contains(item)) {
                return false;
            }
            jm1.this.q(item, i2, (Iterator<Integer>) null);
            return false;
        }
    }

    private void u(@Nullable View view, Item item, int i) {
        if (item.b()) {
            if (!item.f() || this.e) {
                boolean f2 = item.f();
                if (this.b || view == null) {
                    if (!this.c) {
                        m();
                    }
                    if (f2) {
                        n(i);
                    } else {
                        v(i);
                    }
                } else {
                    if (!this.c) {
                        Set s = s();
                        s.remove(item);
                        r(s);
                    }
                    item.e(!f2);
                    view.setSelected(!f2);
                    o<Item> oVar = this.g;
                    if (oVar != null) {
                        oVar.a(item, !f2);
                    }
                }
            }
        }
    }

    public jm1<Item> A(boolean z) {
        this.e = z;
        return this;
    }

    public jm1<Item> B(boolean z) {
        this.c = z;
        return this;
    }

    public jm1<Item> C(boolean z) {
        this.d = z;
        return this;
    }

    public jm1<Item> D(boolean z) {
        this.f = z;
        return this;
    }

    public void a(int i, int i2) {
    }

    public boolean b(View view, int i, com.mikepenz.fastadapter.b<Item> bVar, Item item) {
        if (!this.d || !this.f) {
            return false;
        }
        u(view, item, i);
        return false;
    }

    public void c(int i, int i2) {
    }

    public boolean d(View view, MotionEvent motionEvent, int i, com.mikepenz.fastadapter.b<Item> bVar, Item item) {
        return false;
    }

    public void e(@Nullable Bundle bundle, String str) {
        if (bundle != null) {
            Set<Item> g0 = this.a.g0();
            long[] jArr = new long[g0.size()];
            int i = 0;
            for (Item c2 : g0) {
                jArr[i] = c2.c();
                i++;
            }
            bundle.putLongArray("bundle_selections" + str, jArr);
        }
    }

    public boolean f(View view, int i, com.mikepenz.fastadapter.b<Item> bVar, Item item) {
        if (this.d || !this.f) {
            return false;
        }
        u(view, item, i);
        return false;
    }

    public com.mikepenz.fastadapter.d<Item> g(com.mikepenz.fastadapter.b<Item> bVar) {
        this.a = bVar;
        return null;
    }

    public void h(List<Item> list, boolean z) {
    }

    public void i(@Nullable Bundle bundle, String str) {
        if (bundle != null) {
            long[] longArray = bundle.getLongArray("bundle_selections" + str);
            if (longArray != null) {
                for (long z : longArray) {
                    z(z, false, true);
                }
            }
        }
    }

    public void j(CharSequence charSequence) {
    }

    public void k() {
    }

    public void l(int i, int i2, @Nullable Object obj) {
    }

    public void m() {
        this.a.t0(new c(), false);
        this.a.l();
    }

    public void n(int i) {
        o(i, (Iterator<Integer>) null);
    }

    public void o(int i, @Nullable Iterator<Integer> it) {
        Item Y = this.a.Y(i);
        if (Y != null) {
            q(Y, i, it);
        }
    }

    public void p(Item item) {
        q(item, -1, (Iterator<Integer>) null);
    }

    public void q(Item item, int i, @Nullable Iterator<Integer> it) {
        item.e(false);
        if (it != null) {
            it.remove();
        }
        if (i >= 0) {
            this.a.m(i);
        }
        o<Item> oVar = this.g;
        if (oVar != null) {
            oVar.a(item, false);
        }
    }

    public void r(Set<Item> set) {
        this.a.t0(new d(set), false);
    }

    public Set<Item> s() {
        c0 c0Var = new c0();
        this.a.t0(new a(this, c0Var), false);
        return c0Var;
    }

    public Set<Integer> t() {
        c0 c0Var = new c0();
        int g2 = this.a.g();
        for (int i = 0; i < g2; i++) {
            if (this.a.Y(i).f()) {
                c0Var.add(Integer.valueOf(i));
            }
        }
        return c0Var;
    }

    public void v(int i) {
        w(i, false);
    }

    public void w(int i, boolean z) {
        x(i, z, false);
    }

    public void x(int i, boolean z, boolean z2) {
        Item item;
        b.e<Item> f0 = this.a.f0(i);
        if (f0 != null && (item = f0.b) != null) {
            y(f0.a, item, i, z, z2);
        }
    }

    public void y(com.mikepenz.fastadapter.c<Item> cVar, Item item, int i, boolean z, boolean z2) {
        if (!z2 || item.b()) {
            item.e(true);
            this.a.m(i);
            o<Item> oVar = this.g;
            if (oVar != null) {
                oVar.a(item, true);
            }
            if (this.a.a0() != null && z) {
                this.a.a0().a((View) null, cVar, item, i);
            }
        }
    }

    public void z(long j, boolean z, boolean z2) {
        this.a.t0(new b(j, z, z2), true);
    }
}
