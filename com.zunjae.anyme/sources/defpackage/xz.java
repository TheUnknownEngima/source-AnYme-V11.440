package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.b1;
import com.google.android.exoplayer2.upstream.y;
import defpackage.f00;
import defpackage.g00;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: xz  reason: default package */
public abstract class xz<T> extends uz {
    private final HashMap<T, b> j = new HashMap<>();
    private Handler k;
    private y l;

    /* renamed from: xz$a */
    private final class a implements g00 {
        private final T e;
        private g00.a f;

        public a(T t) {
            this.f = xz.this.o((f00.a) null);
            this.e = t;
        }

        private boolean a(int i, f00.a aVar) {
            if (aVar != null) {
                xz.this.x(this.e, aVar);
                if (aVar == null) {
                    return false;
                }
            } else {
                aVar = null;
            }
            xz.this.z(this.e, i);
            g00.a aVar2 = this.f;
            if (aVar2.a == i && v50.b(aVar2.b, aVar)) {
                return true;
            }
            this.f = xz.this.n(i, aVar, 0);
            return true;
        }

        private g00.c b(g00.c cVar) {
            xz xzVar = xz.this;
            T t = this.e;
            long j = cVar.f;
            xzVar.y(t, j);
            xz xzVar2 = xz.this;
            T t2 = this.e;
            long j2 = cVar.g;
            xzVar2.y(t2, j2);
            return (j == cVar.f && j2 == cVar.g) ? cVar : new g00.c(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, j, j2);
        }

        public void B(int i, f00.a aVar, g00.b bVar, g00.c cVar) {
            if (a(i, aVar)) {
                this.f.w(bVar, b(cVar));
            }
        }

        public void C(int i, f00.a aVar, g00.b bVar, g00.c cVar, IOException iOException, boolean z) {
            if (a(i, aVar)) {
                this.f.t(bVar, b(cVar), iOException, z);
            }
        }

        public void H(int i, f00.a aVar) {
            if (a(i, aVar)) {
                xz xzVar = xz.this;
                f00.a aVar2 = this.f.b;
                q40.e(aVar2);
                if (xzVar.D(aVar2)) {
                    this.f.A();
                }
            }
        }

        public void J(int i, f00.a aVar) {
            if (a(i, aVar)) {
                xz xzVar = xz.this;
                f00.a aVar2 = this.f.b;
                q40.e(aVar2);
                if (xzVar.D(aVar2)) {
                    this.f.z();
                }
            }
        }

        public void P(int i, f00.a aVar, g00.c cVar) {
            if (a(i, aVar)) {
                this.f.d(b(cVar));
            }
        }

        public void k(int i, f00.a aVar, g00.b bVar, g00.c cVar) {
            if (a(i, aVar)) {
                this.f.q(bVar, b(cVar));
            }
        }

        public void o(int i, f00.a aVar) {
            if (a(i, aVar)) {
                this.f.C();
            }
        }

        public void p(int i, f00.a aVar, g00.b bVar, g00.c cVar) {
            if (a(i, aVar)) {
                this.f.n(bVar, b(cVar));
            }
        }

        public void y(int i, f00.a aVar, g00.c cVar) {
            if (a(i, aVar)) {
                this.f.F(b(cVar));
            }
        }
    }

    /* renamed from: xz$b */
    private static final class b {
        public final f00 a;
        public final f00.b b;
        public final g00 c;

        public b(f00 f00, f00.b bVar, g00 g00) {
            this.a = f00;
            this.b = bVar;
            this.c = g00;
        }
    }

    protected xz() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract void A(T t, f00 f00, b1 b1Var);

    /* access modifiers changed from: protected */
    public final void C(T t, f00 f00) {
        q40.a(!this.j.containsKey(t));
        iz izVar = new iz(this, t);
        a aVar = new a(t);
        this.j.put(t, new b(f00, izVar, aVar));
        Handler handler = this.k;
        q40.e(handler);
        f00.d(handler, aVar);
        f00.j(izVar, this.l);
        if (!s()) {
            f00.f(izVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean D(f00.a aVar) {
        return true;
    }

    public void h() {
        for (b bVar : this.j.values()) {
            bVar.a.h();
        }
    }

    /* access modifiers changed from: protected */
    public void q() {
        for (b next : this.j.values()) {
            next.a.f(next.b);
        }
    }

    /* access modifiers changed from: protected */
    public void r() {
        for (b next : this.j.values()) {
            next.a.k(next.b);
        }
    }

    /* access modifiers changed from: protected */
    public void u(y yVar) {
        this.l = yVar;
        this.k = new Handler();
    }

    /* access modifiers changed from: protected */
    public void w() {
        for (b next : this.j.values()) {
            next.a.b(next.b);
            next.a.e(next.c);
        }
        this.j.clear();
    }

    /* access modifiers changed from: protected */
    public f00.a x(T t, f00.a aVar) {
        return aVar;
    }

    /* access modifiers changed from: protected */
    public long y(T t, long j2) {
        return j2;
    }

    /* access modifiers changed from: protected */
    public int z(T t, int i) {
        return i;
    }
}
