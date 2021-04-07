package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.e;
import com.bumptech.glide.g;
import defpackage.xe;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: el  reason: default package */
public final class el<R> implements zk, ol, dl {
    private static final boolean D = Log.isLoggable("Request", 2);
    private int A;
    private boolean B;
    private RuntimeException C;
    private final String a;
    private final nm b;
    private final Object c;
    private final bl<R> d;
    private final al e;
    private final Context f;
    private final e g;
    private final Object h;
    private final Class<R> i;
    private final xk<?> j;
    private final int k;
    private final int l;
    private final g m;
    private final pl<R> n;
    private final List<bl<R>> o;
    private final vl<? super R> p;
    private final Executor q;
    private Cif<R> r;
    private xe.d s;
    private long t;
    private volatile xe u;
    private a v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private int z;

    /* renamed from: el$a */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private el(Context context, e eVar, Object obj, Object obj2, Class<R> cls, xk<?> xkVar, int i2, int i3, g gVar, pl<R> plVar, bl<R> blVar, List<bl<R>> list, al alVar, xe xeVar, vl<? super R> vlVar, Executor executor) {
        this.a = D ? String.valueOf(super.hashCode()) : null;
        this.b = nm.a();
        this.c = obj;
        this.f = context;
        this.g = eVar;
        this.h = obj2;
        this.i = cls;
        this.j = xkVar;
        this.k = i2;
        this.l = i3;
        this.m = gVar;
        this.n = plVar;
        this.d = blVar;
        this.o = list;
        this.e = alVar;
        this.u = xeVar;
        this.p = vlVar;
        this.q = executor;
        this.v = a.PENDING;
        if (this.C == null && eVar.i()) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a5 A[Catch:{ all -> 0x00b6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A(defpackage.Cif<R> r11, R r12, com.bumptech.glide.load.a r13) {
        /*
            r10 = this;
            boolean r6 = r10.s()
            el$a r0 = defpackage.el.a.COMPLETE
            r10.v = r0
            r10.r = r11
            com.bumptech.glide.e r11 = r10.g
            int r11 = r11.g()
            r0 = 3
            if (r11 > r0) goto L_0x0064
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Finished loading "
            r11.append(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.t
            double r0 = defpackage.fm.a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            r11.toString()
        L_0x0064:
            r11 = 1
            r10.B = r11
            r7 = 0
            java.util.List<bl<R>> r0 = r10.o     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x008c
            java.util.List<bl<R>> r0 = r10.o     // Catch:{ all -> 0x00b6 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00b6 }
            r9 = 0
        L_0x0073:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00b6 }
            bl r0 = (defpackage.bl) r0     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r10.h     // Catch:{ all -> 0x00b6 }
            pl<R> r3 = r10.n     // Catch:{ all -> 0x00b6 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.b(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            r9 = r9 | r0
            goto L_0x0073
        L_0x008c:
            r9 = 0
        L_0x008d:
            bl<R> r0 = r10.d     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00a1
            bl<R> r0 = r10.d     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r10.h     // Catch:{ all -> 0x00b6 }
            pl<R> r3 = r10.n     // Catch:{ all -> 0x00b6 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.b(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00b6 }
            if (r0 == 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r11 = 0
        L_0x00a2:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b0
            vl<? super R> r11 = r10.p     // Catch:{ all -> 0x00b6 }
            ul r11 = r11.a(r13, r6)     // Catch:{ all -> 0x00b6 }
            pl<R> r13 = r10.n     // Catch:{ all -> 0x00b6 }
            r13.e(r12, r11)     // Catch:{ all -> 0x00b6 }
        L_0x00b0:
            r10.B = r7
            r10.x()
            return
        L_0x00b6:
            r11 = move-exception
            r10.B = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el.A(if, java.lang.Object, com.bumptech.glide.load.a):void");
    }

    private void B() {
        if (l()) {
            Drawable drawable = null;
            if (this.h == null) {
                drawable = q();
            }
            if (drawable == null) {
                drawable = p();
            }
            if (drawable == null) {
                drawable = r();
            }
            this.n.g(drawable);
        }
    }

    private void i() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean k() {
        al alVar = this.e;
        return alVar == null || alVar.k(this);
    }

    private boolean l() {
        al alVar = this.e;
        return alVar == null || alVar.e(this);
    }

    private boolean m() {
        al alVar = this.e;
        return alVar == null || alVar.g(this);
    }

    private void o() {
        i();
        this.b.c();
        this.n.d(this);
        xe.d dVar = this.s;
        if (dVar != null) {
            dVar.a();
            this.s = null;
        }
    }

    private Drawable p() {
        if (this.w == null) {
            Drawable r2 = this.j.r();
            this.w = r2;
            if (r2 == null && this.j.q() > 0) {
                this.w = t(this.j.q());
            }
        }
        return this.w;
    }

    private Drawable q() {
        if (this.y == null) {
            Drawable s2 = this.j.s();
            this.y = s2;
            if (s2 == null && this.j.t() > 0) {
                this.y = t(this.j.t());
            }
        }
        return this.y;
    }

    private Drawable r() {
        if (this.x == null) {
            Drawable y2 = this.j.y();
            this.x = y2;
            if (y2 == null && this.j.A() > 0) {
                this.x = t(this.j.A());
            }
        }
        return this.x;
    }

    private boolean s() {
        al alVar = this.e;
        return alVar == null || !alVar.c().b();
    }

    private Drawable t(int i2) {
        return yi.a(this.g, i2, this.j.H() != null ? this.j.H() : this.f.getTheme());
    }

    private void u(String str) {
        str + " this: " + this.a;
    }

    private static int v(int i2, float f2) {
        return i2 == Integer.MIN_VALUE ? i2 : Math.round(f2 * ((float) i2));
    }

    private void w() {
        al alVar = this.e;
        if (alVar != null) {
            alVar.a(this);
        }
    }

    private void x() {
        al alVar = this.e;
        if (alVar != null) {
            alVar.i(this);
        }
    }

    public static <R> el<R> y(Context context, e eVar, Object obj, Object obj2, Class<R> cls, xk<?> xkVar, int i2, int i3, g gVar, pl<R> plVar, bl<R> blVar, List<bl<R>> list, al alVar, xe xeVar, vl<? super R> vlVar, Executor executor) {
        return new el(context, eVar, obj, obj2, cls, xkVar, i2, i3, gVar, plVar, blVar, list, alVar, xeVar, vlVar, executor);
    }

    /* JADX INFO: finally extract failed */
    private void z(df dfVar, int i2) {
        boolean z2;
        this.b.c();
        synchronized (this.c) {
            dfVar.k(this.C);
            int g2 = this.g.g();
            if (g2 <= i2) {
                "Load failed for " + this.h + " with size [" + this.z + "x" + this.A + "]";
                if (g2 <= 4) {
                    dfVar.g("Glide");
                }
            }
            this.s = null;
            this.v = a.FAILED;
            boolean z3 = true;
            this.B = true;
            try {
                if (this.o != null) {
                    z2 = false;
                    for (bl<R> a2 : this.o) {
                        z2 |= a2.a(dfVar, this.h, this.n, s());
                    }
                } else {
                    z2 = false;
                }
                if (this.d == null || !this.d.a(dfVar, this.h, this.n, s())) {
                    z3 = false;
                }
                if (!z2 && !z3) {
                    B();
                }
                this.B = false;
                w();
            } catch (Throwable th) {
                this.B = false;
                throw th;
            }
        }
    }

    public void a(df dfVar) {
        z(dfVar, 5);
    }

    public boolean b() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.COMPLETE;
        }
        return z2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [xe$d, if<R>] */
    /* JADX WARNING: type inference failed for: r0v2, types: [if] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r5.u.l(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(defpackage.Cif<?> r6, com.bumptech.glide.load.a r7) {
        /*
            r5 = this;
            nm r0 = r5.b
            r0.c()
            r0 = 0
            java.lang.Object r1 = r5.c     // Catch:{ all -> 0x00b9 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b9 }
            r5.s = r0     // Catch:{ all -> 0x00b6 }
            if (r6 != 0) goto L_0x002f
            df r6 = new df     // Catch:{ all -> 0x00b6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            r7.<init>()     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r7.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.Class<R> r2 = r5.i     // Catch:{ all -> 0x00b6 }
            r7.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r2 = " inside, but instead got null."
            r7.append(r2)     // Catch:{ all -> 0x00b6 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b6 }
            r6.<init>(r7)     // Catch:{ all -> 0x00b6 }
            r5.a(r6)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            return
        L_0x002f:
            java.lang.Object r2 = r6.get()     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x005c
            java.lang.Class<R> r3 = r5.i     // Catch:{ all -> 0x00b6 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00b6 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0042
            goto L_0x005c
        L_0x0042:
            boolean r3 = r5.m()     // Catch:{ all -> 0x00b6 }
            if (r3 != 0) goto L_0x0057
            r5.r = r0     // Catch:{ all -> 0x00b2 }
            el$a r7 = defpackage.el.a.COMPLETE     // Catch:{ all -> 0x00b2 }
            r5.v = r7     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x0056
            xe r7 = r5.u
            r7.l(r6)
        L_0x0056:
            return
        L_0x0057:
            r5.A(r6, r2, r7)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            return
        L_0x005c:
            r5.r = r0     // Catch:{ all -> 0x00b2 }
            df r7 = new df     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r0.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "Expected to receive an object of "
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.Class<R> r3 = r5.i     // Catch:{ all -> 0x00b2 }
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = " but instead got "
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x007b
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r3 = ""
        L_0x007d:
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "{"
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            r0.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "} inside Resource{"
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            r0.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = "}."
            r0.append(r3)     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x009a
            java.lang.String r2 = ""
            goto L_0x009c
        L_0x009a:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x009c:
            r0.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b2 }
            r7.<init>(r0)     // Catch:{ all -> 0x00b2 }
            r5.a(r7)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            if (r6 == 0) goto L_0x00b1
            xe r7 = r5.u
            r7.l(r6)
        L_0x00b1:
            return
        L_0x00b2:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L_0x00b7
        L_0x00b6:
            r6 = move-exception
        L_0x00b7:
            monitor-exit(r1)     // Catch:{ all -> 0x00b6 }
            throw r6     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r6 = move-exception
            if (r0 == 0) goto L_0x00c1
            xe r7 = r5.u
            r7.l(r0)
        L_0x00c1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el.c(if, com.bumptech.glide.load.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r4.u.l(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            r4.i()     // Catch:{ all -> 0x003c }
            nm r1 = r4.b     // Catch:{ all -> 0x003c }
            r1.c()     // Catch:{ all -> 0x003c }
            el$a r1 = r4.v     // Catch:{ all -> 0x003c }
            el$a r2 = defpackage.el.a.CLEARED     // Catch:{ all -> 0x003c }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x0013:
            r4.o()     // Catch:{ all -> 0x003c }
            if<R> r1 = r4.r     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            if<R> r1 = r4.r     // Catch:{ all -> 0x003c }
            r4.r = r2     // Catch:{ all -> 0x003c }
            r2 = r1
        L_0x0020:
            boolean r1 = r4.k()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x002f
            pl<R> r1 = r4.n     // Catch:{ all -> 0x003c }
            android.graphics.drawable.Drawable r3 = r4.r()     // Catch:{ all -> 0x003c }
            r1.i(r3)     // Catch:{ all -> 0x003c }
        L_0x002f:
            el$a r1 = defpackage.el.a.CLEARED     // Catch:{ all -> 0x003c }
            r4.v = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x003b
            xe r0 = r4.u
            r0.l(r2)
        L_0x003b:
            return
        L_0x003c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el.clear():void");
    }

    public boolean d(zk zkVar) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        xk<?> xkVar;
        g gVar;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        xk<?> xkVar2;
        g gVar2;
        int size2;
        zk zkVar2 = zkVar;
        if (!(zkVar2 instanceof el)) {
            return false;
        }
        synchronized (this.c) {
            i2 = this.k;
            i3 = this.l;
            obj = this.h;
            cls = this.i;
            xkVar = this.j;
            gVar = this.m;
            size = this.o != null ? this.o.size() : 0;
        }
        el elVar = (el) zkVar2;
        synchronized (elVar.c) {
            i4 = elVar.k;
            i5 = elVar.l;
            obj2 = elVar.h;
            cls2 = elVar.i;
            xkVar2 = elVar.j;
            gVar2 = elVar.m;
            size2 = elVar.o != null ? elVar.o.size() : 0;
        }
        return i2 == i4 && i3 == i5 && km.c(obj, obj2) && cls.equals(cls2) && xkVar.equals(xkVar2) && gVar == gVar2 && size == size2;
    }

    public void e(int i2, int i3) {
        Object obj;
        this.b.c();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                if (D) {
                    u("Got onSizeReady in " + fm.a(this.t));
                }
                if (this.v == a.WAITING_FOR_SIZE) {
                    this.v = a.RUNNING;
                    float G = this.j.G();
                    this.z = v(i2, G);
                    this.A = v(i3, G);
                    if (D) {
                        u("finished setup for calling load in " + fm.a(this.t));
                    }
                    obj = obj2;
                    try {
                        this.s = this.u.g(this.g, this.h, this.j.D(), this.z, this.A, this.j.C(), this.i, this.m, this.j.p(), this.j.I(), this.j.V(), this.j.R(), this.j.v(), this.j.O(), this.j.L(), this.j.K(), this.j.u(), this, this.q);
                        if (this.v != a.RUNNING) {
                            this.s = null;
                        }
                        if (D) {
                            u("finished onSizeReady in " + fm.a(this.t));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    public boolean f() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.CLEARED;
        }
        return z2;
    }

    public Object g() {
        this.b.c();
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            r4.i()     // Catch:{ all -> 0x00af }
            nm r1 = r4.b     // Catch:{ all -> 0x00af }
            r1.c()     // Catch:{ all -> 0x00af }
            long r1 = defpackage.fm.b()     // Catch:{ all -> 0x00af }
            r4.t = r1     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = r4.h     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x003c
            int r1 = r4.k     // Catch:{ all -> 0x00af }
            int r2 = r4.l     // Catch:{ all -> 0x00af }
            boolean r1 = defpackage.km.s(r1, r2)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0027
            int r1 = r4.k     // Catch:{ all -> 0x00af }
            r4.z = r1     // Catch:{ all -> 0x00af }
            int r1 = r4.l     // Catch:{ all -> 0x00af }
            r4.A = r1     // Catch:{ all -> 0x00af }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r4.q()     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            df r2 = new df     // Catch:{ all -> 0x00af }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00af }
            r4.z(r2, r1)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x003c:
            el$a r1 = r4.v     // Catch:{ all -> 0x00af }
            el$a r2 = defpackage.el.a.RUNNING     // Catch:{ all -> 0x00af }
            if (r1 == r2) goto L_0x00a7
            el$a r1 = r4.v     // Catch:{ all -> 0x00af }
            el$a r2 = defpackage.el.a.COMPLETE     // Catch:{ all -> 0x00af }
            if (r1 != r2) goto L_0x0051
            if<R> r1 = r4.r     // Catch:{ all -> 0x00af }
            com.bumptech.glide.load.a r2 = com.bumptech.glide.load.a.MEMORY_CACHE     // Catch:{ all -> 0x00af }
            r4.c(r1, r2)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x0051:
            el$a r1 = defpackage.el.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00af }
            r4.v = r1     // Catch:{ all -> 0x00af }
            int r1 = r4.k     // Catch:{ all -> 0x00af }
            int r2 = r4.l     // Catch:{ all -> 0x00af }
            boolean r1 = defpackage.km.s(r1, r2)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0067
            int r1 = r4.k     // Catch:{ all -> 0x00af }
            int r2 = r4.l     // Catch:{ all -> 0x00af }
            r4.e(r1, r2)     // Catch:{ all -> 0x00af }
            goto L_0x006c
        L_0x0067:
            pl<R> r1 = r4.n     // Catch:{ all -> 0x00af }
            r1.j(r4)     // Catch:{ all -> 0x00af }
        L_0x006c:
            el$a r1 = r4.v     // Catch:{ all -> 0x00af }
            el$a r2 = defpackage.el.a.RUNNING     // Catch:{ all -> 0x00af }
            if (r1 == r2) goto L_0x0078
            el$a r1 = r4.v     // Catch:{ all -> 0x00af }
            el$a r2 = defpackage.el.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00af }
            if (r1 != r2) goto L_0x0087
        L_0x0078:
            boolean r1 = r4.l()     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0087
            pl<R> r1 = r4.n     // Catch:{ all -> 0x00af }
            android.graphics.drawable.Drawable r2 = r4.r()     // Catch:{ all -> 0x00af }
            r1.h(r2)     // Catch:{ all -> 0x00af }
        L_0x0087:
            boolean r1 = D     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r1.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00af }
            long r2 = r4.t     // Catch:{ all -> 0x00af }
            double r2 = defpackage.fm.a(r2)     // Catch:{ all -> 0x00af }
            r1.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00af }
            r4.u(r1)     // Catch:{ all -> 0x00af }
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00a7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00af }
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el.h():void");
    }

    public boolean isRunning() {
        boolean z2;
        synchronized (this.c) {
            if (this.v != a.RUNNING) {
                if (this.v != a.WAITING_FOR_SIZE) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public boolean j() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.COMPLETE;
        }
        return z2;
    }

    public void n() {
        synchronized (this.c) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
