package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.f0;
import defpackage.vt;

/* renamed from: w00  reason: default package */
public final class w00 implements jt {
    public final ht e;
    private final int f;
    private final f0 g;
    private final SparseArray<a> h = new SparseArray<>();
    private boolean i;
    private b j;
    private long k;
    private tt l;
    private f0[] m;

    /* renamed from: w00$a */
    private static final class a implements vt {
        private final int a;
        private final int b;
        private final f0 c;
        private final gt d = new gt();
        public f0 e;
        private vt f;
        private long g;

        public a(int i, int i2, f0 f0Var) {
            this.a = i;
            this.b = i2;
            this.c = f0Var;
        }

        public int a(it itVar, int i, boolean z) {
            return this.f.a(itVar, i, z);
        }

        public void b(i50 i50, int i) {
            this.f.b(i50, i);
        }

        public void c(long j, int i, int i2, int i3, vt.a aVar) {
            long j2 = this.g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f = this.d;
            }
            this.f.c(j, i, i2, i3, aVar);
        }

        public void d(f0 f0Var) {
            f0 f0Var2 = this.c;
            if (f0Var2 != null) {
                f0Var = f0Var.i(f0Var2);
            }
            this.e = f0Var;
            this.f.d(f0Var);
        }

        public void e(b bVar, long j) {
            if (bVar == null) {
                this.f = this.d;
                return;
            }
            this.g = j;
            vt a2 = bVar.a(this.a, this.b);
            this.f = a2;
            f0 f0Var = this.e;
            if (f0Var != null) {
                a2.d(f0Var);
            }
        }
    }

    /* renamed from: w00$b */
    public interface b {
        vt a(int i, int i2);
    }

    public w00(ht htVar, int i2, f0 f0Var) {
        this.e = htVar;
        this.f = i2;
        this.g = f0Var;
    }

    public vt a(int i2, int i3) {
        a aVar = this.h.get(i2);
        if (aVar == null) {
            q40.f(this.m == null);
            aVar = new a(i2, i3, i3 == this.f ? this.g : null);
            aVar.e(this.j, this.k);
            this.h.put(i2, aVar);
        }
        return aVar;
    }

    public f0[] b() {
        return this.m;
    }

    public tt c() {
        return this.l;
    }

    public void d(b bVar, long j2, long j3) {
        this.j = bVar;
        this.k = j3;
        if (!this.i) {
            this.e.g(this);
            if (j2 != -9223372036854775807L) {
                this.e.h(0, j2);
            }
            this.i = true;
            return;
        }
        ht htVar = this.e;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        htVar.h(0, j2);
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            this.h.valueAt(i2).e(bVar, j3);
        }
    }

    public void f(tt ttVar) {
        this.l = ttVar;
    }

    public void p() {
        f0[] f0VarArr = new f0[this.h.size()];
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            f0VarArr[i2] = this.h.valueAt(i2).e;
        }
        this.m = f0VarArr;
    }
}
