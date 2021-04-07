package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.r0;
import com.google.android.exoplayer2.s;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.video.p;
import com.google.android.exoplayer2.video.s;
import com.google.android.exoplayer2.video.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class a1 extends t implements r0, r0.c, r0.b {
    /* access modifiers changed from: private */
    public zr A;
    /* access modifiers changed from: private */
    public int B;
    private float C;
    private f00 D;
    /* access modifiers changed from: private */
    public List<h20> E;
    private p F;
    private x50 G;
    private boolean H;
    /* access modifiers changed from: private */
    public l50 I;
    /* access modifiers changed from: private */
    public boolean J;
    protected final u0[] b;
    private final c0 c;
    private final Handler d;
    private final c e;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<s> f;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<dr> g;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<q20> h;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<dy> i;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<t> j;
    /* access modifiers changed from: private */
    public final CopyOnWriteArraySet<fr> k;
    private final f l;
    private final rq m;
    private final r n;
    private final s o;
    private final c1 p;
    private final d1 q;
    /* access modifiers changed from: private */
    public f0 r;
    /* access modifiers changed from: private */
    public f0 s;
    /* access modifiers changed from: private */
    public Surface t;
    private boolean u;
    private SurfaceHolder v;
    private TextureView w;
    private int x;
    private int y;
    /* access modifiers changed from: private */
    public zr z;

    public static final class b {
        private final Context a;
        private final y0 b;
        private r40 c;
        private k40 d;
        private i0 e;
        private f f;
        private rq g;
        private Looper h;
        private boolean i;

        public b(Context context) {
            this(context, new a0(context));
        }

        public b(Context context, y0 y0Var) {
            this(context, y0Var, new d40(context), new y(), n.l(context), v50.L(), new rq(r40.a), true, r40.a);
        }

        public b(Context context, y0 y0Var, k40 k40, i0 i0Var, f fVar, Looper looper, rq rqVar, boolean z, r40 r40) {
            this.a = context;
            this.b = y0Var;
            this.d = k40;
            this.e = i0Var;
            this.f = fVar;
            this.h = looper;
            this.g = rqVar;
            this.c = r40;
        }

        public a1 a() {
            q40.f(!this.i);
            this.i = true;
            return new a1(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.h);
        }
    }

    private final class c implements t, fr, q20, dy, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, s.b, r.b, r0.a {
        private c() {
        }

        public /* synthetic */ void A(int i) {
            q0.h(this, i);
        }

        @Deprecated
        public /* synthetic */ void D(b1 b1Var, Object obj, int i) {
            q0.l(this, b1Var, obj, i);
        }

        public void F(f0 f0Var) {
            f0 unused = a1.this.r = f0Var;
            Iterator it = a1.this.j.iterator();
            while (it.hasNext()) {
                ((t) it.next()).F(f0Var);
            }
        }

        public void G(zr zrVar) {
            zr unused = a1.this.z = zrVar;
            Iterator it = a1.this.j.iterator();
            while (it.hasNext()) {
                ((t) it.next()).G(zrVar);
            }
        }

        public void I(f0 f0Var) {
            f0 unused = a1.this.s = f0Var;
            Iterator it = a1.this.k.iterator();
            while (it.hasNext()) {
                ((fr) it.next()).I(f0Var);
            }
        }

        public void K(int i, long j, long j2) {
            Iterator it = a1.this.k.iterator();
            while (it.hasNext()) {
                ((fr) it.next()).K(i, j, j2);
            }
        }

        public /* synthetic */ void L(p00 p00, i40 i40) {
            q0.m(this, p00, i40);
        }

        public void M(zr zrVar) {
            Iterator it = a1.this.j.iterator();
            while (it.hasNext()) {
                ((t) it.next()).M(zrVar);
            }
            f0 unused = a1.this.r = null;
            zr unused2 = a1.this.z = null;
        }

        public /* synthetic */ void R(boolean z) {
            q0.a(this, z);
        }

        public void a(int i) {
            if (a1.this.B != i) {
                int unused = a1.this.B = i;
                Iterator it = a1.this.g.iterator();
                while (it.hasNext()) {
                    dr drVar = (dr) it.next();
                    if (!a1.this.k.contains(drVar)) {
                        drVar.a(i);
                    }
                }
                Iterator it2 = a1.this.k.iterator();
                while (it2.hasNext()) {
                    ((fr) it2.next()).a(i);
                }
            }
        }

        public void b(int i, int i2, int i3, float f) {
            Iterator it = a1.this.f.iterator();
            while (it.hasNext()) {
                com.google.android.exoplayer2.video.s sVar = (com.google.android.exoplayer2.video.s) it.next();
                if (!a1.this.j.contains(sVar)) {
                    sVar.b(i, i2, i3, f);
                }
            }
            Iterator it2 = a1.this.j.iterator();
            while (it2.hasNext()) {
                ((t) it2.next()).b(i, i2, i3, f);
            }
        }

        public /* synthetic */ void c(o0 o0Var) {
            q0.c(this, o0Var);
        }

        public /* synthetic */ void d(int i) {
            q0.d(this, i);
        }

        public void e(boolean z) {
            a1 a1Var;
            if (a1.this.I != null) {
                boolean z2 = false;
                if (z && !a1.this.J) {
                    a1.this.I.a(0);
                    a1Var = a1.this;
                    z2 = true;
                } else if (!z && a1.this.J) {
                    a1.this.I.b(0);
                    a1Var = a1.this;
                } else {
                    return;
                }
                boolean unused = a1Var.J = z2;
            }
        }

        public /* synthetic */ void f(int i) {
            q0.g(this, i);
        }

        public void g(zr zrVar) {
            Iterator it = a1.this.k.iterator();
            while (it.hasNext()) {
                ((fr) it.next()).g(zrVar);
            }
            f0 unused = a1.this.s = null;
            zr unused2 = a1.this.A = null;
            int unused3 = a1.this.B = 0;
        }

        public void h(zr zrVar) {
            zr unused = a1.this.A = zrVar;
            Iterator it = a1.this.k.iterator();
            while (it.hasNext()) {
                ((fr) it.next()).h(zrVar);
            }
        }

        public void i(String str, long j, long j2) {
            Iterator it = a1.this.j.iterator();
            while (it.hasNext()) {
                ((t) it.next()).i(str, j, j2);
            }
        }

        public /* synthetic */ void j(b0 b0Var) {
            q0.e(this, b0Var);
        }

        public void k() {
            a1.this.y(false);
        }

        public /* synthetic */ void l() {
            q0.i(this);
        }

        public void m(float f) {
            a1.this.G0();
        }

        public /* synthetic */ void n(b1 b1Var, int i) {
            q0.k(this, b1Var, i);
        }

        public void o(int i) {
            a1 a1Var = a1.this;
            a1Var.L0(a1Var.j(), i);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            a1.this.K0(new Surface(surfaceTexture), true);
            a1.this.B0(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            a1.this.K0((Surface) null, true);
            a1.this.B0(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            a1.this.B0(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void p(List<h20> list) {
            List unused = a1.this.E = list;
            Iterator it = a1.this.h.iterator();
            while (it.hasNext()) {
                ((q20) it.next()).p(list);
            }
        }

        public void r(Surface surface) {
            if (a1.this.t == surface) {
                Iterator it = a1.this.f.iterator();
                while (it.hasNext()) {
                    ((com.google.android.exoplayer2.video.s) it.next()).E();
                }
            }
            Iterator it2 = a1.this.j.iterator();
            while (it2.hasNext()) {
                ((t) it2.next()).r(surface);
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            a1.this.B0(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            a1.this.K0(surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a1.this.K0((Surface) null, false);
            a1.this.B0(0, 0);
        }

        public void t(String str, long j, long j2) {
            Iterator it = a1.this.k.iterator();
            while (it.hasNext()) {
                ((fr) it.next()).t(str, j, j2);
            }
        }

        public /* synthetic */ void u(boolean z) {
            q0.j(this, z);
        }

        public void v(yx yxVar) {
            Iterator it = a1.this.i.iterator();
            while (it.hasNext()) {
                ((dy) it.next()).v(yxVar);
            }
        }

        public void x(int i, long j) {
            Iterator it = a1.this.j.iterator();
            while (it.hasNext()) {
                ((t) it.next()).x(i, j);
            }
        }

        public void z(boolean z, int i) {
            a1.this.M0();
        }
    }

    protected a1(Context context, y0 y0Var, k40 k40, i0 i0Var, f fVar, rq rqVar, r40 r40, Looper looper) {
        this(context, y0Var, k40, i0Var, qs.d(), fVar, rqVar, r40, looper);
    }

    @Deprecated
    protected a1(Context context, y0 y0Var, k40 k40, i0 i0Var, rs<vs> rsVar, f fVar, rq rqVar, r40 r40, Looper looper) {
        Context context2 = context;
        rs<vs> rsVar2 = rsVar;
        f fVar2 = fVar;
        rq rqVar2 = rqVar;
        this.l = fVar2;
        this.m = rqVar2;
        this.e = new c();
        this.f = new CopyOnWriteArraySet<>();
        this.g = new CopyOnWriteArraySet<>();
        this.h = new CopyOnWriteArraySet<>();
        this.i = new CopyOnWriteArraySet<>();
        this.j = new CopyOnWriteArraySet<>();
        this.k = new CopyOnWriteArraySet<>();
        Handler handler = new Handler(looper);
        this.d = handler;
        c cVar = this.e;
        this.b = y0Var.a(handler, cVar, cVar, cVar, cVar, rsVar);
        this.C = 1.0f;
        this.B = 0;
        br brVar = br.f;
        this.E = Collections.emptyList();
        c0 c0Var = new c0(this.b, k40, i0Var, fVar, r40, looper);
        this.c = c0Var;
        rqVar2.b0(c0Var);
        this.c.q(rqVar2);
        this.c.q(this.e);
        this.j.add(rqVar2);
        this.f.add(rqVar2);
        this.k.add(rqVar2);
        this.g.add(rqVar2);
        w0(rqVar2);
        fVar2.g(this.d, rqVar2);
        if (rsVar2 instanceof ms) {
            ((ms) rsVar2).g(this.d, rqVar2);
        }
        this.n = new r(context, this.d, this.e);
        this.o = new s(context, this.d, this.e);
        this.p = new c1(context);
        this.q = new d1(context);
    }

    /* access modifiers changed from: private */
    public void B0(int i2, int i3) {
        if (i2 != this.x || i3 != this.y) {
            this.x = i2;
            this.y = i3;
            Iterator<com.google.android.exoplayer2.video.s> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().N(i2, i3);
            }
        }
    }

    private void F0() {
        TextureView textureView = this.w;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.e) {
                b50.h("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.w.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.w = null;
        }
        SurfaceHolder surfaceHolder = this.v;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.e);
            this.v = null;
        }
    }

    /* access modifiers changed from: private */
    public void G0() {
        float f2 = this.C * this.o.f();
        for (u0 u0Var : this.b) {
            if (u0Var.j() == 1) {
                s0 b0 = this.c.b0(u0Var);
                b0.n(2);
                b0.m(Float.valueOf(f2));
                b0.l();
            }
        }
    }

    private void I0(com.google.android.exoplayer2.video.n nVar) {
        for (u0 u0Var : this.b) {
            if (u0Var.j() == 2) {
                s0 b0 = this.c.b0(u0Var);
                b0.n(8);
                b0.m(nVar);
                b0.l();
            }
        }
    }

    /* access modifiers changed from: private */
    public void K0(Surface surface, boolean z2) {
        ArrayList<s0> arrayList = new ArrayList<>();
        for (u0 u0Var : this.b) {
            if (u0Var.j() == 2) {
                s0 b0 = this.c.b0(u0Var);
                b0.n(1);
                b0.m(surface);
                b0.l();
                arrayList.add(b0);
            }
        }
        Surface surface2 = this.t;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (s0 a2 : arrayList) {
                    a2.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.u) {
                this.t.release();
            }
        }
        this.t = surface;
        this.u = z2;
    }

    /* access modifiers changed from: private */
    public void L0(boolean z2, int i2) {
        int i3 = 0;
        boolean z3 = z2 && i2 != -1;
        if (z3 && i2 != 1) {
            i3 = 1;
        }
        this.c.t0(z3, i3);
    }

    /* access modifiers changed from: private */
    public void M0() {
        boolean z2;
        d1 d1Var;
        int h2 = h();
        if (h2 != 1) {
            if (h2 == 2 || h2 == 3) {
                this.p.a(j());
                d1Var = this.q;
                z2 = j();
                d1Var.a(z2);
            } else if (h2 != 4) {
                throw new IllegalStateException();
            }
        }
        z2 = false;
        this.p.a(false);
        d1Var = this.q;
        d1Var.a(z2);
    }

    private void N0() {
        if (Looper.myLooper() != O()) {
            b50.i("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.H ? null : new IllegalStateException());
            this.H = true;
        }
    }

    public long A() {
        N0();
        return this.c.A();
    }

    public f0 A0() {
        return this.r;
    }

    public void C0(f00 f00) {
        D0(f00, true, true);
    }

    public void D(p pVar) {
        N0();
        if (this.F == pVar) {
            for (u0 u0Var : this.b) {
                if (u0Var.j() == 2) {
                    s0 b0 = this.c.b0(u0Var);
                    b0.n(6);
                    b0.m((Object) null);
                    b0.l();
                }
            }
        }
    }

    public void D0(f00 f00, boolean z2, boolean z3) {
        N0();
        f00 f002 = this.D;
        if (f002 != null) {
            f002.e(this.m);
            this.m.a0();
        }
        this.D = f00;
        f00.d(this.d, this.m);
        boolean j2 = j();
        L0(j2, this.o.n(j2, 2));
        this.c.r0(f00, z2, z3);
    }

    public void E(int i2) {
        N0();
        this.c.E(i2);
    }

    public void E0() {
        N0();
        this.n.b(false);
        this.p.a(false);
        this.q.a(false);
        this.o.h();
        this.c.s0();
        F0();
        Surface surface = this.t;
        if (surface != null) {
            if (this.u) {
                surface.release();
            }
            this.t = null;
        }
        f00 f00 = this.D;
        if (f00 != null) {
            f00.e(this.m);
            this.D = null;
        }
        if (this.J) {
            l50 l50 = this.I;
            q40.e(l50);
            l50.b(0);
            this.J = false;
        }
        this.l.d(this.m);
        this.E = Collections.emptyList();
    }

    public int F() {
        N0();
        return this.c.F();
    }

    public int G() {
        N0();
        return this.c.G();
    }

    public void H0(o0 o0Var) {
        N0();
        this.c.u0(o0Var);
    }

    public void I(SurfaceView surfaceView) {
        z0(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void J(q20 q20) {
        if (!this.E.isEmpty()) {
            q20.p(this.E);
        }
        this.h.add(q20);
    }

    public void J0(SurfaceHolder surfaceHolder) {
        N0();
        F0();
        if (surfaceHolder != null) {
            x0();
        }
        this.v = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.e);
            Surface surface = surfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                K0(surface, false);
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                B0(surfaceFrame.width(), surfaceFrame.height());
                return;
            }
        }
        K0((Surface) null, false);
        B0(0, 0);
    }

    public int K() {
        N0();
        return this.c.K();
    }

    public p00 L() {
        N0();
        return this.c.L();
    }

    public long M() {
        N0();
        return this.c.M();
    }

    public b1 N() {
        N0();
        return this.c.N();
    }

    public Looper O() {
        return this.c.O();
    }

    public boolean P() {
        N0();
        return this.c.P();
    }

    public long Q() {
        N0();
        return this.c.Q();
    }

    public void R(TextureView textureView) {
        N0();
        F0();
        if (textureView != null) {
            x0();
        }
        this.w = textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                b50.h("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.e);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                K0(new Surface(surfaceTexture), true);
                B0(textureView.getWidth(), textureView.getHeight());
                return;
            }
        }
        K0((Surface) null, true);
        B0(0, 0);
    }

    public i40 S() {
        N0();
        return this.c.S();
    }

    public int T(int i2) {
        N0();
        return this.c.T(i2);
    }

    public void U(com.google.android.exoplayer2.video.s sVar) {
        this.f.remove(sVar);
    }

    public long V() {
        N0();
        return this.c.V();
    }

    public r0.b W() {
        return this;
    }

    public void a(Surface surface) {
        N0();
        F0();
        if (surface != null) {
            x0();
        }
        int i2 = 0;
        K0(surface, false);
        if (surface != null) {
            i2 = -1;
        }
        B0(i2, i2);
    }

    public void b(x50 x50) {
        N0();
        this.G = x50;
        for (u0 u0Var : this.b) {
            if (u0Var.j() == 5) {
                s0 b0 = this.c.b0(u0Var);
                b0.n(7);
                b0.m(x50);
                b0.l();
            }
        }
    }

    public void c(p pVar) {
        N0();
        this.F = pVar;
        for (u0 u0Var : this.b) {
            if (u0Var.j() == 2) {
                s0 b0 = this.c.b0(u0Var);
                b0.n(6);
                b0.m(pVar);
                b0.l();
            }
        }
    }

    public void d(Surface surface) {
        N0();
        if (surface != null && surface == this.t) {
            y0();
        }
    }

    public o0 e() {
        N0();
        return this.c.e();
    }

    public boolean f() {
        N0();
        return this.c.f();
    }

    public long g() {
        N0();
        return this.c.g();
    }

    public int h() {
        N0();
        return this.c.h();
    }

    public void i(int i2, long j2) {
        N0();
        this.m.Z();
        this.c.i(i2, j2);
    }

    public boolean j() {
        N0();
        return this.c.j();
    }

    public void k(boolean z2) {
        N0();
        this.c.k(z2);
    }

    public b0 l() {
        N0();
        return this.c.l();
    }

    public void m(x50 x50) {
        N0();
        if (this.G == x50) {
            for (u0 u0Var : this.b) {
                if (u0Var.j() == 5) {
                    s0 b0 = this.c.b0(u0Var);
                    b0.n(7);
                    b0.m((Object) null);
                    b0.l();
                }
            }
        }
    }

    public int n() {
        N0();
        return this.c.n();
    }

    public void p(TextureView textureView) {
        N0();
        if (textureView != null && textureView == this.w) {
            R((TextureView) null);
        }
    }

    public void q(r0.a aVar) {
        N0();
        this.c.q(aVar);
    }

    public void r(com.google.android.exoplayer2.video.n nVar) {
        N0();
        if (nVar != null) {
            y0();
        }
        I0(nVar);
    }

    public int s() {
        N0();
        return this.c.s();
    }

    public void t(SurfaceView surfaceView) {
        J0(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void u(q20 q20) {
        this.h.remove(q20);
    }

    public void v(r0.a aVar) {
        N0();
        this.c.v(aVar);
    }

    public int w() {
        N0();
        return this.c.w();
    }

    public void w0(dy dyVar) {
        this.i.add(dyVar);
    }

    public void x(com.google.android.exoplayer2.video.s sVar) {
        this.f.add(sVar);
    }

    public void x0() {
        N0();
        I0((com.google.android.exoplayer2.video.n) null);
    }

    public void y(boolean z2) {
        N0();
        L0(z2, this.o.n(z2, h()));
    }

    public void y0() {
        N0();
        F0();
        K0((Surface) null, false);
        B0(0, 0);
    }

    public r0.c z() {
        return this;
    }

    public void z0(SurfaceHolder surfaceHolder) {
        N0();
        if (surfaceHolder != null && surfaceHolder == this.v) {
            J0((SurfaceHolder) null);
        }
    }
}
