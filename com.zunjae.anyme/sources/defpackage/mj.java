package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.i;
import com.bumptech.glide.j;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mj  reason: default package */
class mj {
    private final od a;
    private final Handler b;
    private final List<b> c;
    final j d;
    private final rf e;
    private boolean f;
    private boolean g;
    private boolean h;
    private i<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private a n;
    private d o;
    private int p;
    private int q;
    private int r;

    /* renamed from: mj$a */
    static class a extends il<Bitmap> {
        private final Handler h;
        final int i;
        private final long j;
        private Bitmap k;

        a(Handler handler, int i2, long j2) {
            this.h = handler;
            this.i = i2;
            this.j = j2;
        }

        /* access modifiers changed from: package-private */
        public Bitmap a() {
            return this.k;
        }

        /* renamed from: b */
        public void e(Bitmap bitmap, ul<? super Bitmap> ulVar) {
            this.k = bitmap;
            this.h.sendMessageAtTime(this.h.obtainMessage(1, this), this.j);
        }

        public void i(Drawable drawable) {
            this.k = null;
        }
    }

    /* renamed from: mj$b */
    public interface b {
        void a();
    }

    /* renamed from: mj$c */
    private class c implements Handler.Callback {
        c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                mj.this.m((a) message.obj);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                mj.this.d.m((a) message.obj);
                return false;
            }
        }
    }

    /* renamed from: mj$d */
    interface d {
        void a();
    }

    mj(com.bumptech.glide.c cVar, od odVar, int i2, int i3, m<Bitmap> mVar, Bitmap bitmap) {
        this(cVar.g(), com.bumptech.glide.c.v(cVar.i()), odVar, (Handler) null, i(com.bumptech.glide.c.v(cVar.i()), i2, i3), mVar, bitmap);
    }

    mj(rf rfVar, j jVar, od odVar, Handler handler, i<Bitmap> iVar, m<Bitmap> mVar, Bitmap bitmap) {
        this.c = new ArrayList();
        this.d = jVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.e = rfVar;
        this.b = handler;
        this.i = iVar;
        this.a = odVar;
        o(mVar, bitmap);
    }

    private static g g() {
        return new zl(Double.valueOf(Math.random()));
    }

    private static i<Bitmap> i(j jVar, int i2, int i3) {
        return jVar.b().b(((cl) ((cl) cl.y0(we.a).w0(true)).r0(true)).g0(i2, i3));
    }

    private void l() {
        if (this.f && !this.g) {
            if (this.h) {
                jm.a(this.n == null, "Pending target must be null when starting from the first frame");
                this.a.f();
                this.h = false;
            }
            a aVar = this.n;
            if (aVar != null) {
                this.n = null;
                m(aVar);
                return;
            }
            this.g = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.a.d());
            this.a.b();
            this.l = new a(this.b, this.a.g(), uptimeMillis);
            this.i.b(cl.z0(g())).O0(this.a).H0(this.l);
        }
    }

    private void n() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.c(bitmap);
            this.m = null;
        }
    }

    private void p() {
        if (!this.f) {
            this.f = true;
            this.k = false;
            l();
        }
    }

    private void q() {
        this.f = false;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.c.clear();
        n();
        q();
        a aVar = this.j;
        if (aVar != null) {
            this.d.m(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.m(aVar2);
            this.l = null;
        }
        a aVar3 = this.n;
        if (aVar3 != null) {
            this.d.m(aVar3);
            this.n = null;
        }
        this.a.clear();
        this.k = true;
    }

    /* access modifiers changed from: package-private */
    public ByteBuffer b() {
        return this.a.getData().asReadOnlyBuffer();
    }

    /* access modifiers changed from: package-private */
    public Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.a() : this.m;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.i;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public Bitmap e() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.a.c();
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.r;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.a.h() + this.p;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public void m(a aVar) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.a();
        }
        this.g = false;
        if (this.k) {
            this.b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f) {
            this.n = aVar;
        } else {
            if (aVar.a() != null) {
                n();
                a aVar2 = this.j;
                this.j = aVar;
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    this.c.get(size).a();
                }
                if (aVar2 != null) {
                    this.b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            l();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.bumptech.glide.load.m, com.bumptech.glide.load.m<android.graphics.Bitmap>, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(com.bumptech.glide.load.m<android.graphics.Bitmap> r3, android.graphics.Bitmap r4) {
        /*
            r2 = this;
            defpackage.jm.d(r3)
            r0 = r3
            com.bumptech.glide.load.m r0 = (com.bumptech.glide.load.m) r0
            defpackage.jm.d(r4)
            r0 = r4
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2.m = r0
            com.bumptech.glide.i<android.graphics.Bitmap> r0 = r2.i
            cl r1 = new cl
            r1.<init>()
            xk r3 = r1.s0(r3)
            com.bumptech.glide.i r3 = r0.b(r3)
            r2.i = r3
            int r3 = defpackage.km.h(r4)
            r2.p = r3
            int r3 = r4.getWidth()
            r2.q = r3
            int r3 = r4.getHeight()
            r2.r = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj.o(com.bumptech.glide.load.m, android.graphics.Bitmap):void");
    }

    /* access modifiers changed from: package-private */
    public void r(b bVar) {
        if (this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (!this.c.contains(bVar)) {
            boolean isEmpty = this.c.isEmpty();
            this.c.add(bVar);
            if (isEmpty) {
                p();
            }
        } else {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
    }

    /* access modifiers changed from: package-private */
    public void s(b bVar) {
        this.c.remove(bVar);
        if (this.c.isEmpty()) {
            q();
        }
    }
}
