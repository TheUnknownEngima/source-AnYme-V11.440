package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.g;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.m;
import com.github.mikephil.charting.utils.Utils;
import defpackage.xk;
import java.util.Map;

/* renamed from: xk  reason: default package */
public abstract class xk<T extends xk<T>> implements Cloneable {
    private boolean A;
    private boolean B;
    private boolean C = true;
    private boolean D;
    private int e;
    private float f = 1.0f;
    private we g = we.c;
    private g h = g.NORMAL;
    private Drawable i;
    private int j;
    private Drawable k;
    private int l;
    private boolean m = true;
    private int n = -1;
    private int o = -1;
    private com.bumptech.glide.load.g p = yl.c();
    private boolean q;
    private boolean r = true;
    private Drawable s;
    private int t;
    private i u = new i();
    private Map<Class<?>, m<?>> v = new bm();
    private Class<?> w = Object.class;
    private boolean x;
    private Resources.Theme y;
    private boolean z;

    private boolean S(int i2) {
        return T(this.e, i2);
    }

    private static boolean T(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T e0(defpackage.fi r2, com.bumptech.glide.load.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            r0 = 0
            xk r2 = r1.k0(r2, r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk.e0(fi, com.bumptech.glide.load.m):xk");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private T k0(defpackage.fi r1, com.bumptech.glide.load.m<android.graphics.Bitmap> r2, boolean r3) {
        /*
            r0 = this;
            if (r3 == 0) goto L_0x0007
            xk r1 = r0.u0(r1, r2)
            goto L_0x000b
        L_0x0007:
            xk r1 = r0.f0(r1, r2)
        L_0x000b:
            r2 = 1
            r1.C = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk.k0(fi, com.bumptech.glide.load.m, boolean):xk");
    }

    private T l0() {
        return this;
    }

    private T n0() {
        if (!this.x) {
            l0();
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final int A() {
        return this.l;
    }

    public final g B() {
        return this.h;
    }

    public final Class<?> C() {
        return this.w;
    }

    public final com.bumptech.glide.load.g D() {
        return this.p;
    }

    public final float G() {
        return this.f;
    }

    public final Resources.Theme H() {
        return this.y;
    }

    public final Map<Class<?>, m<?>> I() {
        return this.v;
    }

    public final boolean K() {
        return this.D;
    }

    public final boolean L() {
        return this.A;
    }

    public final boolean O() {
        return this.m;
    }

    public final boolean P() {
        return S(8);
    }

    /* access modifiers changed from: package-private */
    public boolean R() {
        return this.C;
    }

    public final boolean U() {
        return this.r;
    }

    public final boolean V() {
        return this.q;
    }

    public final boolean W() {
        return S(2048);
    }

    public final boolean X() {
        return km.s(this.o, this.n);
    }

    public T Z() {
        this.x = true;
        l0();
        return this;
    }

    public T a0() {
        return f0(fi.c, new ci());
    }

    public T b(xk<?> xkVar) {
        if (this.z) {
            return clone().b(xkVar);
        }
        if (T(xkVar.e, 2)) {
            this.f = xkVar.f;
        }
        if (T(xkVar.e, 262144)) {
            this.A = xkVar.A;
        }
        if (T(xkVar.e, 1048576)) {
            this.D = xkVar.D;
        }
        if (T(xkVar.e, 4)) {
            this.g = xkVar.g;
        }
        if (T(xkVar.e, 8)) {
            this.h = xkVar.h;
        }
        if (T(xkVar.e, 16)) {
            this.i = xkVar.i;
            this.j = 0;
            this.e &= -33;
        }
        if (T(xkVar.e, 32)) {
            this.j = xkVar.j;
            this.i = null;
            this.e &= -17;
        }
        if (T(xkVar.e, 64)) {
            this.k = xkVar.k;
            this.l = 0;
            this.e &= -129;
        }
        if (T(xkVar.e, 128)) {
            this.l = xkVar.l;
            this.k = null;
            this.e &= -65;
        }
        if (T(xkVar.e, 256)) {
            this.m = xkVar.m;
        }
        if (T(xkVar.e, 512)) {
            this.o = xkVar.o;
            this.n = xkVar.n;
        }
        if (T(xkVar.e, 1024)) {
            this.p = xkVar.p;
        }
        if (T(xkVar.e, 4096)) {
            this.w = xkVar.w;
        }
        if (T(xkVar.e, 8192)) {
            this.s = xkVar.s;
            this.t = 0;
            this.e &= -16385;
        }
        if (T(xkVar.e, 16384)) {
            this.t = xkVar.t;
            this.s = null;
            this.e &= -8193;
        }
        if (T(xkVar.e, 32768)) {
            this.y = xkVar.y;
        }
        if (T(xkVar.e, 65536)) {
            this.r = xkVar.r;
        }
        if (T(xkVar.e, 131072)) {
            this.q = xkVar.q;
        }
        if (T(xkVar.e, 2048)) {
            this.v.putAll(xkVar.v);
            this.C = xkVar.C;
        }
        if (T(xkVar.e, 524288)) {
            this.B = xkVar.B;
        }
        if (!this.r) {
            this.v.clear();
            int i2 = this.e & -2049;
            this.e = i2;
            this.q = false;
            this.e = i2 & -131073;
            this.C = true;
        }
        this.e |= xkVar.e;
        this.u.d(xkVar.u);
        n0();
        return this;
    }

    public T b0() {
        return e0(fi.b, new di());
    }

    public T c() {
        if (!this.x || this.z) {
            this.z = true;
            return Z();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public T c0() {
        return e0(fi.a, new ki());
    }

    public T d() {
        return u0(fi.c, new ci());
    }

    /* renamed from: e */
    public T clone() {
        try {
            T t2 = (xk) super.clone();
            i iVar = new i();
            t2.u = iVar;
            iVar.d(this.u);
            bm bmVar = new bm();
            t2.v = bmVar;
            bmVar.putAll(this.v);
            t2.x = false;
            t2.z = false;
            return t2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xk)) {
            return false;
        }
        xk xkVar = (xk) obj;
        return Float.compare(xkVar.f, this.f) == 0 && this.j == xkVar.j && km.d(this.i, xkVar.i) && this.l == xkVar.l && km.d(this.k, xkVar.k) && this.t == xkVar.t && km.d(this.s, xkVar.s) && this.m == xkVar.m && this.n == xkVar.n && this.o == xkVar.o && this.q == xkVar.q && this.r == xkVar.r && this.A == xkVar.A && this.B == xkVar.B && this.g.equals(xkVar.g) && this.h == xkVar.h && this.u.equals(xkVar.u) && this.v.equals(xkVar.v) && this.w.equals(xkVar.w) && km.d(this.p, xkVar.p) && km.d(this.y, xkVar.y);
    }

    public T f(Class<?> cls) {
        if (this.z) {
            return clone().f(cls);
        }
        jm.d(cls);
        this.w = cls;
        this.e |= 4096;
        n0();
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T f0(defpackage.fi r2, com.bumptech.glide.load.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.z
            if (r0 == 0) goto L_0x000d
            xk r0 = r1.clone()
            xk r2 = r0.f0(r2, r3)
            return r2
        L_0x000d:
            r1.j(r2)
            r2 = 0
            xk r2 = r1.t0(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk.f0(fi, com.bumptech.glide.load.m):xk");
    }

    public T g(we weVar) {
        if (this.z) {
            return clone().g(weVar);
        }
        jm.d(weVar);
        this.g = weVar;
        this.e |= 4;
        n0();
        return this;
    }

    public T g0(int i2, int i3) {
        if (this.z) {
            return clone().g0(i2, i3);
        }
        this.o = i2;
        this.n = i3;
        this.e |= 512;
        n0();
        return this;
    }

    public T h0(int i2) {
        if (this.z) {
            return clone().h0(i2);
        }
        this.l = i2;
        int i3 = this.e | 128;
        this.e = i3;
        this.k = null;
        this.e = i3 & -65;
        n0();
        return this;
    }

    public int hashCode() {
        return km.n(this.y, km.n(this.p, km.n(this.w, km.n(this.v, km.n(this.u, km.n(this.h, km.n(this.g, km.o(this.B, km.o(this.A, km.o(this.r, km.o(this.q, km.m(this.o, km.m(this.n, km.o(this.m, km.n(this.s, km.m(this.t, km.n(this.k, km.m(this.l, km.n(this.i, km.m(this.j, km.k(this.f)))))))))))))))))))));
    }

    public T i0(g gVar) {
        if (this.z) {
            return clone().i0(gVar);
        }
        jm.d(gVar);
        this.h = gVar;
        this.e |= 8;
        n0();
        return this;
    }

    public T j(fi fiVar) {
        h hVar = fi.f;
        jm.d(fiVar);
        return o0(hVar, fiVar);
    }

    public T n(int i2) {
        if (this.z) {
            return clone().n(i2);
        }
        this.j = i2;
        int i3 = this.e | 32;
        this.e = i3;
        this.i = null;
        this.e = i3 & -17;
        n0();
        return this;
    }

    public T o(int i2) {
        if (this.z) {
            return clone().o(i2);
        }
        this.t = i2;
        int i3 = this.e | 16384;
        this.e = i3;
        this.s = null;
        this.e = i3 & -8193;
        n0();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.h<Y>, java.lang.Object, com.bumptech.glide.load.h] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T o0(com.bumptech.glide.load.h<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.z
            if (r0 == 0) goto L_0x000d
            xk r0 = r1.clone()
            xk r2 = r0.o0(r2, r3)
            return r2
        L_0x000d:
            defpackage.jm.d(r2)
            defpackage.jm.d(r3)
            com.bumptech.glide.load.i r0 = r1.u
            r0.e(r2, r3)
            r1.n0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk.o0(com.bumptech.glide.load.h, java.lang.Object):xk");
    }

    public final we p() {
        return this.g;
    }

    public T p0(com.bumptech.glide.load.g gVar) {
        if (this.z) {
            return clone().p0(gVar);
        }
        jm.d(gVar);
        this.p = gVar;
        this.e |= 1024;
        n0();
        return this;
    }

    public final int q() {
        return this.j;
    }

    public T q0(float f2) {
        if (this.z) {
            return clone().q0(f2);
        }
        if (f2 < Utils.FLOAT_EPSILON || f2 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f = f2;
        this.e |= 2;
        n0();
        return this;
    }

    public final Drawable r() {
        return this.i;
    }

    public T r0(boolean z2) {
        if (this.z) {
            return clone().r0(true);
        }
        this.m = !z2;
        this.e |= 256;
        n0();
        return this;
    }

    public final Drawable s() {
        return this.s;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T s0(com.bumptech.glide.load.m<android.graphics.Bitmap> r2) {
        /*
            r1 = this;
            r0 = 1
            xk r2 = r1.t0(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk.s0(com.bumptech.glide.load.m):xk");
    }

    public final int t() {
        return this.t;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T t0(com.bumptech.glide.load.m<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.z
            if (r0 == 0) goto L_0x000d
            xk r0 = r2.clone()
            xk r3 = r0.t0(r3, r4)
            return r3
        L_0x000d:
            ii r0 = new ii
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.v0(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.v0(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r0.c()
            r2.v0(r1, r0, r4)
            java.lang.Class<ij> r0 = defpackage.ij.class
            lj r1 = new lj
            r1.<init>(r3)
            r2.v0(r0, r1, r4)
            r2.n0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk.t0(com.bumptech.glide.load.m, boolean):xk");
    }

    public final boolean u() {
        return this.B;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T u0(defpackage.fi r2, com.bumptech.glide.load.m<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.z
            if (r0 == 0) goto L_0x000d
            xk r0 = r1.clone()
            xk r2 = r0.u0(r2, r3)
            return r2
        L_0x000d:
            r1.j(r2)
            xk r2 = r1.s0(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk.u0(fi, com.bumptech.glide.load.m):xk");
    }

    public final i v() {
        return this.u;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<Y>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T v0(java.lang.Class<Y> r2, com.bumptech.glide.load.m<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.z
            if (r0 == 0) goto L_0x000d
            xk r0 = r1.clone()
            xk r2 = r0.v0(r2, r3, r4)
            return r2
        L_0x000d:
            defpackage.jm.d(r2)
            defpackage.jm.d(r3)
            java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.m<?>> r0 = r1.v
            r0.put(r2, r3)
            int r2 = r1.e
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.e = r2
            r3 = 1
            r1.r = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.e = r2
            r0 = 0
            r1.C = r0
            if (r4 == 0) goto L_0x0032
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.e = r2
            r1.q = r3
        L_0x0032:
            r1.n0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk.v0(java.lang.Class, com.bumptech.glide.load.m, boolean):xk");
    }

    public final int w() {
        return this.n;
    }

    public T w0(boolean z2) {
        if (this.z) {
            return clone().w0(z2);
        }
        this.D = z2;
        this.e |= 1048576;
        n0();
        return this;
    }

    public final int x() {
        return this.o;
    }

    public final Drawable y() {
        return this.k;
    }
}
