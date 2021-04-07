package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class i<TranscodeType> extends xk<i<TranscodeType>> implements Cloneable {
    private final Context E;
    private final j F;
    private final Class<TranscodeType> G;
    private final e H;
    private k<?, ? super TranscodeType> I;
    private Object J;
    private List<bl<TranscodeType>> K;
    private i<TranscodeType> L;
    private i<TranscodeType> M;
    private Float N;
    private boolean O = true;
    private boolean P;
    private boolean Q;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.g[] r0 = com.bumptech.glide.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.bumptech.glide.g r2 = com.bumptech.glide.g.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.g r3 = com.bumptech.glide.g.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.g r4 = com.bumptech.glide.g.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.g r5 = com.bumptech.glide.g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.i.a.<clinit>():void");
        }
    }

    static {
        cl clVar = (cl) ((cl) ((cl) new cl().g(we.b)).i0(g.LOW)).r0(true);
    }

    @SuppressLint({"CheckResult"})
    protected i(c cVar, j jVar, Class<TranscodeType> cls, Context context) {
        this.F = jVar;
        this.G = cls;
        this.E = context;
        this.I = jVar.q(cls);
        this.H = cVar.j();
        G0(jVar.o());
        b(jVar.p());
    }

    private zk A0(Object obj, pl<TranscodeType> plVar, bl<TranscodeType> blVar, al alVar, k<?, ? super TranscodeType> kVar, g gVar, int i, int i2, xk<?> xkVar, Executor executor) {
        yk ykVar;
        yk ykVar2;
        if (this.M != null) {
            ykVar2 = new yk(obj, alVar);
            ykVar = ykVar2;
        } else {
            Object obj2 = obj;
            ykVar = null;
            ykVar2 = alVar;
        }
        zk C0 = C0(obj, plVar, blVar, ykVar2, kVar, gVar, i, i2, xkVar, executor);
        if (ykVar == null) {
            return C0;
        }
        int x = this.M.x();
        int w = this.M.w();
        if (km.s(i, i2) && !this.M.X()) {
            x = xkVar.x();
            w = xkVar.w();
        }
        i<TranscodeType> iVar = this.M;
        yk ykVar3 = ykVar;
        ykVar3.q(C0, iVar.A0(obj, plVar, blVar, ykVar3, iVar.I, iVar.B(), x, w, this.M, executor));
        return ykVar3;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [xk, xk<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.zk C0(java.lang.Object r19, defpackage.pl<TranscodeType> r20, defpackage.bl<TranscodeType> r21, defpackage.al r22, com.bumptech.glide.k<?, ? super TranscodeType> r23, com.bumptech.glide.g r24, int r25, int r26, defpackage.xk<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.i<TranscodeType> r0 = r11.L
            if (r0 == 0) goto L_0x0096
            boolean r1 = r11.Q
            if (r1 != 0) goto L_0x008e
            com.bumptech.glide.k<?, ? super TranscodeType> r1 = r0.I
            boolean r0 = r0.O
            if (r0 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            com.bumptech.glide.i<TranscodeType> r0 = r11.L
            boolean r0 = r0.P()
            if (r0 == 0) goto L_0x0029
            com.bumptech.glide.i<TranscodeType> r0 = r11.L
            com.bumptech.glide.g r0 = r0.B()
            goto L_0x002d
        L_0x0029:
            com.bumptech.glide.g r0 = r11.F0(r13)
        L_0x002d:
            r15 = r0
            com.bumptech.glide.i<TranscodeType> r0 = r11.L
            int r0 = r0.x()
            com.bumptech.glide.i<TranscodeType> r1 = r11.L
            int r1 = r1.w()
            boolean r2 = defpackage.km.s(r25, r26)
            if (r2 == 0) goto L_0x0050
            com.bumptech.glide.i<TranscodeType> r2 = r11.L
            boolean r2 = r2.X()
            if (r2 != 0) goto L_0x0050
            int r0 = r27.x()
            int r1 = r27.w()
        L_0x0050:
            r16 = r0
            r17 = r1
            fl r10 = new fl
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            zk r10 = r0.R0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.Q = r0
            com.bumptech.glide.i<TranscodeType> r9 = r11.L
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            zk r0 = r0.A0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.Q = r1
            r13.p(r12, r0)
            return r13
        L_0x008e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0096:
            java.lang.Float r0 = r11.N
            if (r0 == 0) goto L_0x00d6
            fl r14 = new fl
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            zk r15 = r0.R0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            xk r0 = r27.clone()
            java.lang.Float r1 = r11.N
            float r1 = r1.floatValue()
            xk r4 = r0.q0(r1)
            com.bumptech.glide.g r7 = r11.F0(r13)
            r0 = r18
            r1 = r19
            zk r0 = r0.R0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.p(r15, r0)
            return r14
        L_0x00d6:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            zk r0 = r0.R0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.i.C0(java.lang.Object, pl, bl, al, com.bumptech.glide.k, com.bumptech.glide.g, int, int, xk, java.util.concurrent.Executor):zk");
    }

    private g F0(g gVar) {
        int i = a.b[gVar.ordinal()];
        if (i == 1) {
            return g.NORMAL;
        }
        if (i == 2) {
            return g.HIGH;
        }
        if (i == 3 || i == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + B());
    }

    @SuppressLint({"CheckResult"})
    private void G0(List<bl<Object>> list) {
        for (bl<Object> x0 : list) {
            x0(x0);
        }
    }

    private <Y extends pl<TranscodeType>> Y I0(Y y, bl<TranscodeType> blVar, xk<?> xkVar, Executor executor) {
        jm.d(y);
        if (this.P) {
            zk z0 = z0(y, blVar, xkVar, executor);
            zk c = y.c();
            if (!z0.d(c) || L0(xkVar, c)) {
                this.F.m(y);
                y.f(z0);
                this.F.B(y, z0);
                return y;
            }
            jm.d(c);
            if (!c.isRunning()) {
                c.h();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean L0(xk<?> xkVar, zk zkVar) {
        return !xkVar.O() && zkVar.j();
    }

    private i<TranscodeType> Q0(Object obj) {
        this.J = obj;
        this.P = true;
        return this;
    }

    private zk R0(Object obj, pl<TranscodeType> plVar, bl<TranscodeType> blVar, xk<?> xkVar, al alVar, k<?, ? super TranscodeType> kVar, g gVar, int i, int i2, Executor executor) {
        Context context = this.E;
        e eVar = this.H;
        return el.y(context, eVar, obj, this.J, this.G, xkVar, i, i2, gVar, plVar, blVar, this.K, alVar, eVar.f(), kVar.c(), executor);
    }

    private zk z0(pl<TranscodeType> plVar, bl<TranscodeType> blVar, xk<?> xkVar, Executor executor) {
        return A0(new Object(), plVar, blVar, (al) null, this.I, xkVar.B(), xkVar.x(), xkVar.w(), xkVar, executor);
    }

    /* renamed from: D0 */
    public i<TranscodeType> e() {
        i<TranscodeType> iVar = (i) super.clone();
        iVar.I = iVar.I.clone();
        return iVar;
    }

    public i<TranscodeType> E0(i<TranscodeType> iVar) {
        this.M = iVar;
        return this;
    }

    public <Y extends pl<TranscodeType>> Y H0(Y y) {
        J0(y, (bl) null, em.b());
        return y;
    }

    /* access modifiers changed from: package-private */
    public <Y extends pl<TranscodeType>> Y J0(Y y, bl<TranscodeType> blVar, Executor executor) {
        I0(y, blVar, this, executor);
        return y;
    }

    public ql<ImageView, TranscodeType> K0(ImageView imageView) {
        xk xkVar;
        km.b();
        jm.d(imageView);
        if (!W() && U() && imageView.getScaleType() != null) {
            switch (a.a[imageView.getScaleType().ordinal()]) {
                case 1:
                    xkVar = e().a0();
                    break;
                case 2:
                case 6:
                    xkVar = e().b0();
                    break;
                case 3:
                case 4:
                case 5:
                    xkVar = e().c0();
                    break;
            }
        }
        xkVar = this;
        ql<ImageView, TranscodeType> a2 = this.H.a(imageView, this.G);
        I0(a2, (bl) null, xkVar, em.b());
        return a2;
    }

    public i<TranscodeType> M0(Uri uri) {
        Q0(uri);
        return this;
    }

    public i<TranscodeType> N0(Integer num) {
        Q0(num);
        return b(cl.z0(wl.c(this.E)));
    }

    public i<TranscodeType> O0(Object obj) {
        Q0(obj);
        return this;
    }

    public i<TranscodeType> P0(String str) {
        Q0(str);
        return this;
    }

    public i<TranscodeType> x0(bl<TranscodeType> blVar) {
        if (blVar != null) {
            if (this.K == null) {
                this.K = new ArrayList();
            }
            this.K.add(blVar);
        }
        return this;
    }

    /* renamed from: y0 */
    public i<TranscodeType> b(xk<?> xkVar) {
        jm.d(xkVar);
        return (i) super.b(xkVar);
    }
}
