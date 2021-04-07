package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

class u {
    final h0<RecyclerView.c0, a> a = new h0<>();
    final e0<RecyclerView.c0> b = new e0<>();

    static class a {
        static r3<a> d = new s3(20);
        int a;
        RecyclerView.l.c b;
        RecyclerView.l.c c;

        private a() {
        }

        static void a() {
            do {
            } while (d.b() != null);
        }

        static a b() {
            a b2 = d.b();
            return b2 == null ? new a() : b2;
        }

        static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.c(aVar);
        }
    }

    interface b {
        void a(RecyclerView.c0 c0Var);

        void b(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    u() {
    }

    private RecyclerView.l.c l(RecyclerView.c0 c0Var, int i) {
        a m;
        RecyclerView.l.c cVar;
        int f = this.a.f(c0Var);
        if (f >= 0 && (m = this.a.m(f)) != null) {
            int i2 = m.a;
            if ((i2 & i) != 0) {
                m.a = (~i) & i2;
                if (i == 4) {
                    cVar = m.b;
                } else if (i == 8) {
                    cVar = m.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((m.a & 12) == 0) {
                    this.a.k(f);
                    a.c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.a |= 2;
        aVar.b = cVar;
    }

    /* access modifiers changed from: package-private */
    public void b(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.a |= 1;
    }

    /* access modifiers changed from: package-private */
    public void c(long j, RecyclerView.c0 c0Var) {
        this.b.p(j, c0Var);
    }

    /* access modifiers changed from: package-private */
    public void d(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    /* access modifiers changed from: package-private */
    public void e(RecyclerView.c0 c0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(c0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(c0Var, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.a.clear();
        this.b.c();
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.c0 g(long j) {
        return this.b.g(j);
    }

    /* access modifiers changed from: package-private */
    public boolean h(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean i(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        a.a();
    }

    public void k(RecyclerView.c0 c0Var) {
        p(c0Var);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c m(RecyclerView.c0 c0Var) {
        return l(c0Var, 8);
    }

    /* access modifiers changed from: package-private */
    public RecyclerView.l.c n(RecyclerView.c0 c0Var) {
        return l(c0Var, 4);
    }

    /* access modifiers changed from: package-private */
    public void o(b bVar) {
        RecyclerView.l.c cVar;
        RecyclerView.l.c cVar2;
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.c0 i = this.a.i(size);
            a k = this.a.k(size);
            int i2 = k.a;
            if ((i2 & 3) != 3) {
                if ((i2 & 1) != 0) {
                    cVar = k.b;
                    if (cVar != null) {
                        cVar2 = k.c;
                    }
                } else {
                    if ((i2 & 14) != 14) {
                        if ((i2 & 12) == 12) {
                            bVar.d(i, k.b, k.c);
                        } else if ((i2 & 4) != 0) {
                            cVar = k.b;
                            cVar2 = null;
                        } else if ((i2 & 8) == 0) {
                        }
                        a.c(k);
                    }
                    bVar.b(i, k.b, k.c);
                    a.c(k);
                }
                bVar.c(i, cVar, cVar2);
                a.c(k);
            }
            bVar.a(i);
            a.c(k);
        }
    }

    /* access modifiers changed from: package-private */
    public void p(RecyclerView.c0 c0Var) {
        a aVar = this.a.get(c0Var);
        if (aVar != null) {
            aVar.a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    public void q(RecyclerView.c0 c0Var) {
        int s = this.b.s() - 1;
        while (true) {
            if (s < 0) {
                break;
            } else if (c0Var == this.b.t(s)) {
                this.b.r(s);
                break;
            } else {
                s--;
            }
        }
        a remove = this.a.remove(c0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
