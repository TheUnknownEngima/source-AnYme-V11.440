package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.m0;
import defpackage.hx;
import defpackage.tt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: gx  reason: default package */
public final class gx implements ht {
    /* access modifiers changed from: private */
    public final int a;
    /* access modifiers changed from: private */
    public final List<s50> b;
    private final i50 c;
    private final SparseIntArray d;
    /* access modifiers changed from: private */
    public final hx.c e;
    /* access modifiers changed from: private */
    public final SparseArray<hx> f;
    /* access modifiers changed from: private */
    public final SparseBooleanArray g;
    /* access modifiers changed from: private */
    public final SparseBooleanArray h;
    private final fx i;
    private ex j;
    /* access modifiers changed from: private */
    public jt k;
    /* access modifiers changed from: private */
    public int l;
    /* access modifiers changed from: private */
    public boolean m;
    private boolean n;
    private boolean o;
    /* access modifiers changed from: private */
    public hx p;
    private int q;
    /* access modifiers changed from: private */
    public int r;

    /* renamed from: gx$a */
    private class a implements ax {
        private final h50 a = new h50(new byte[4]);

        public a() {
        }

        public void a(s50 s50, jt jtVar, hx.d dVar) {
        }

        public void b(i50 i50) {
            if (i50.z() == 0 && (i50.z() & 128) != 0) {
                i50.N(6);
                int a2 = i50.a() / 4;
                for (int i = 0; i < a2; i++) {
                    i50.g(this.a, 4);
                    int h = this.a.h(16);
                    this.a.q(3);
                    if (h == 0) {
                        this.a.q(13);
                    } else {
                        int h2 = this.a.h(13);
                        gx.this.f.put(h2, new bx(new b(h2)));
                        gx.k(gx.this);
                    }
                }
                if (gx.this.a != 2) {
                    gx.this.f.remove(0);
                }
            }
        }
    }

    /* renamed from: gx$b */
    private class b implements ax {
        private final h50 a = new h50(new byte[5]);
        private final SparseArray<hx> b = new SparseArray<>();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public b(int i) {
            this.d = i;
        }

        private hx.b c(i50 i50, int i) {
            int c2 = i50.c();
            int i2 = i + c2;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (i50.c() < i2) {
                int z = i50.z();
                int c3 = i50.c() + i50.z();
                if (z == 5) {
                    long B = i50.B();
                    if (B != 1094921523) {
                        if (B != 1161904947) {
                            if (B != 1094921524) {
                                if (B == 1212503619) {
                                    i3 = 36;
                                }
                                i50.N(c3 - i50.c());
                            }
                        }
                        i3 = 135;
                        i50.N(c3 - i50.c());
                    }
                    i3 = 129;
                    i50.N(c3 - i50.c());
                } else {
                    if (z != 106) {
                        if (z != 122) {
                            if (z == 127) {
                                if (i50.z() != 21) {
                                }
                            } else if (z == 123) {
                                i3 = 138;
                            } else if (z == 10) {
                                str = i50.w(3).trim();
                            } else if (z == 89) {
                                arrayList = new ArrayList();
                                while (i50.c() < c3) {
                                    String trim = i50.w(3).trim();
                                    int z2 = i50.z();
                                    byte[] bArr = new byte[4];
                                    i50.h(bArr, 0, 4);
                                    arrayList.add(new hx.a(trim, z2, bArr));
                                }
                                i3 = 89;
                            }
                            i50.N(c3 - i50.c());
                        }
                        i3 = 135;
                        i50.N(c3 - i50.c());
                    }
                    i3 = 129;
                    i50.N(c3 - i50.c());
                }
                i3 = 172;
                i50.N(c3 - i50.c());
            }
            i50.M(i2);
            return new hx.b(i3, str, arrayList, Arrays.copyOfRange(i50.a, c2, i2));
        }

        public void a(s50 s50, jt jtVar, hx.d dVar) {
        }

        public void b(i50 i50) {
            s50 s50;
            i50 i502 = i50;
            if (i50.z() == 2) {
                int i = 0;
                if (gx.this.a == 1 || gx.this.a == 2 || gx.this.l == 1) {
                    s50 = (s50) gx.this.b.get(0);
                } else {
                    s50 = new s50(((s50) gx.this.b.get(0)).c());
                    gx.this.b.add(s50);
                }
                if ((i50.z() & 128) != 0) {
                    i502.N(1);
                    int F = i50.F();
                    int i2 = 3;
                    i502.N(3);
                    i502.g(this.a, 2);
                    this.a.q(3);
                    int i3 = 13;
                    int unused = gx.this.r = this.a.h(13);
                    i502.g(this.a, 2);
                    int i4 = 4;
                    this.a.q(4);
                    i502.N(this.a.h(12));
                    if (gx.this.a == 2 && gx.this.p == null) {
                        hx.b bVar = new hx.b(21, (String) null, (List<hx.a>) null, v50.f);
                        gx gxVar = gx.this;
                        hx unused2 = gxVar.p = gxVar.e.a(21, bVar);
                        gx.this.p.a(s50, gx.this.k, new hx.d(F, 21, 8192));
                    }
                    this.b.clear();
                    this.c.clear();
                    int a2 = i50.a();
                    while (a2 > 0) {
                        i502.g(this.a, 5);
                        int h = this.a.h(8);
                        this.a.q(i2);
                        int h2 = this.a.h(i3);
                        this.a.q(i4);
                        int h3 = this.a.h(12);
                        hx.b c2 = c(i502, h3);
                        if (h == 6) {
                            h = c2.a;
                        }
                        a2 -= h3 + 5;
                        int i5 = gx.this.a == 2 ? h : h2;
                        if (!gx.this.g.get(i5)) {
                            hx o = (gx.this.a == 2 && h == 21) ? gx.this.p : gx.this.e.a(h, c2);
                            if (gx.this.a != 2 || h2 < this.c.get(i5, 8192)) {
                                this.c.put(i5, h2);
                                this.b.put(i5, o);
                            }
                        }
                        i2 = 3;
                        i4 = 4;
                        i3 = 13;
                    }
                    int size = this.c.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        int keyAt = this.c.keyAt(i6);
                        int valueAt = this.c.valueAt(i6);
                        gx.this.g.put(keyAt, true);
                        gx.this.h.put(valueAt, true);
                        hx valueAt2 = this.b.valueAt(i6);
                        if (valueAt2 != null) {
                            if (valueAt2 != gx.this.p) {
                                valueAt2.a(s50, gx.this.k, new hx.d(F, keyAt, 8192));
                            }
                            gx.this.f.put(valueAt, valueAt2);
                        }
                    }
                    if (gx.this.a != 2) {
                        gx.this.f.remove(this.d);
                        gx gxVar2 = gx.this;
                        if (gxVar2.a != 1) {
                            i = gx.this.l - 1;
                        }
                        int unused3 = gxVar2.l = i;
                        if (gx.this.l == 0) {
                            gx.this.k.p();
                        } else {
                            return;
                        }
                    } else if (!gx.this.m) {
                        gx.this.k.p();
                        int unused4 = gx.this.l = 0;
                    } else {
                        return;
                    }
                    boolean unused5 = gx.this.m = true;
                }
            }
        }
    }

    static {
        ew ewVar = ew.a;
    }

    public gx() {
        this(0);
    }

    public gx(int i2) {
        this(1, i2);
    }

    public gx(int i2, int i3) {
        this(i2, new s50(0), new lw(i3));
    }

    public gx(int i2, s50 s50, hx.c cVar) {
        q40.e(cVar);
        this.e = cVar;
        this.a = i2;
        if (i2 == 1 || i2 == 2) {
            this.b = Collections.singletonList(s50);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(s50);
        }
        this.c = new i50(new byte[9400], 0);
        this.g = new SparseBooleanArray();
        this.h = new SparseBooleanArray();
        this.f = new SparseArray<>();
        this.d = new SparseIntArray();
        this.i = new fx();
        this.r = -1;
        y();
    }

    static /* synthetic */ int k(gx gxVar) {
        int i2 = gxVar.l;
        gxVar.l = i2 + 1;
        return i2;
    }

    private boolean u(it itVar) {
        i50 i50 = this.c;
        byte[] bArr = i50.a;
        if (9400 - i50.c() < 188) {
            int a2 = this.c.a();
            if (a2 > 0) {
                System.arraycopy(bArr, this.c.c(), bArr, 0, a2);
            }
            this.c.K(bArr, a2);
        }
        while (this.c.a() < 188) {
            int d2 = this.c.d();
            int a3 = itVar.a(bArr, d2, 9400 - d2);
            if (a3 == -1) {
                return false;
            }
            this.c.L(d2 + a3);
        }
        return true;
    }

    private int v() {
        int c2 = this.c.c();
        int d2 = this.c.d();
        int a2 = ix.a(this.c.a, c2, d2);
        this.c.M(a2);
        int i2 = a2 + 188;
        if (i2 > d2) {
            int i3 = this.q + (a2 - c2);
            this.q = i3;
            if (this.a == 2 && i3 > 376) {
                throw new m0("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.q = 0;
        }
        return i2;
    }

    static /* synthetic */ ht[] w() {
        return new ht[]{new gx()};
    }

    private void x(long j2) {
        tt ttVar;
        jt jtVar;
        if (!this.n) {
            this.n = true;
            if (this.i.b() != -9223372036854775807L) {
                ex exVar = new ex(this.i.c(), this.i.b(), j2, this.r);
                this.j = exVar;
                jtVar = this.k;
                ttVar = exVar.b();
            } else {
                jtVar = this.k;
                ttVar = new tt.b(this.i.b());
            }
            jtVar.f(ttVar);
        }
    }

    private void y() {
        this.g.clear();
        this.f.clear();
        SparseArray<hx> b2 = this.e.b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f.put(b2.keyAt(i2), b2.valueAt(i2));
        }
        this.f.put(0, new bx(new a()));
        this.p = null;
    }

    private boolean z(int i2) {
        return this.a == 2 || this.m || !this.h.get(i2, false);
    }

    public void a() {
    }

    public boolean d(it itVar) {
        boolean z;
        byte[] bArr = this.c.a;
        itVar.l(bArr, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                itVar.j(i2);
                return true;
            }
        }
        return false;
    }

    public int f(it itVar, st stVar) {
        it itVar2 = itVar;
        st stVar2 = stVar;
        long g2 = itVar.g();
        if (this.m) {
            if (((g2 == -1 || this.a == 2) ? false : true) && !this.i.d()) {
                return this.i.e(itVar2, stVar2, this.r);
            }
            x(g2);
            if (this.o) {
                this.o = false;
                h(0, 0);
                if (itVar.m() != 0) {
                    stVar2.a = 0;
                    return 1;
                }
            }
            ex exVar = this.j;
            if (exVar != null && exVar.d()) {
                return this.j.c(itVar2, stVar2);
            }
        }
        if (!u(itVar)) {
            return -1;
        }
        int v = v();
        int d2 = this.c.d();
        if (v > d2) {
            return 0;
        }
        int k2 = this.c.k();
        if ((8388608 & k2) == 0) {
            int i2 = ((4194304 & k2) != 0 ? 1 : 0) | 0;
            int i3 = (2096896 & k2) >> 8;
            boolean z = (k2 & 32) != 0;
            hx hxVar = (k2 & 16) != 0 ? this.f.get(i3) : null;
            if (hxVar != null) {
                if (this.a != 2) {
                    int i4 = k2 & 15;
                    int i5 = this.d.get(i3, i4 - 1);
                    this.d.put(i3, i4);
                    if (i5 != i4) {
                        if (i4 != ((i5 + 1) & 15)) {
                            hxVar.c();
                        }
                    }
                }
                if (z) {
                    int z2 = this.c.z();
                    i2 |= (this.c.z() & 64) != 0 ? 2 : 0;
                    this.c.N(z2 - 1);
                }
                boolean z3 = this.m;
                if (z(i3)) {
                    this.c.L(v);
                    hxVar.b(this.c, i2);
                    this.c.L(d2);
                }
                if (this.a != 2 && !z3 && this.m && g2 != -1) {
                    this.o = true;
                }
            }
        }
        this.c.M(v);
        return 0;
    }

    public void g(jt jtVar) {
        this.k = jtVar;
    }

    public void h(long j2, long j3) {
        ex exVar;
        q40.f(this.a != 2);
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            s50 s50 = this.b.get(i2);
            if ((s50.e() == -9223372036854775807L) || !(s50.e() == 0 || s50.c() == j3)) {
                s50.g();
                s50.h(j3);
            }
        }
        if (!(j3 == 0 || (exVar = this.j) == null)) {
            exVar.h(j3);
        }
        this.c.H();
        this.d.clear();
        for (int i3 = 0; i3 < this.f.size(); i3++) {
            this.f.valueAt(i3).c();
        }
        this.q = 0;
    }
}
