package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.v0;
import defpackage.yx;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ey  reason: default package */
public final class ey extends u implements Handler.Callback {
    private final by p;
    private final dy q;
    private final Handler r;
    private final cy s;
    private final yx[] t;
    private final long[] u;
    private int v;
    private int w;
    private ay x;
    private boolean y;
    private long z;

    public ey(dy dyVar, Looper looper) {
        this(dyVar, looper, by.a);
    }

    public ey(dy dyVar, Looper looper, by byVar) {
        super(4);
        q40.e(dyVar);
        this.q = dyVar;
        this.r = looper == null ? null : v50.u(looper, this);
        q40.e(byVar);
        this.p = byVar;
        this.s = new cy();
        this.t = new yx[5];
        this.u = new long[5];
    }

    private void Q(yx yxVar, List<yx.b> list) {
        for (int i = 0; i < yxVar.d(); i++) {
            f0 C = yxVar.c(i).C();
            if (C == null || !this.p.b(C)) {
                list.add(yxVar.c(i));
            } else {
                ay a = this.p.a(C);
                byte[] F0 = yxVar.c(i).F0();
                q40.e(F0);
                byte[] bArr = F0;
                this.s.clear();
                this.s.k(bArr.length);
                ByteBuffer byteBuffer = this.s.f;
                v50.g(byteBuffer);
                byteBuffer.put(bArr);
                this.s.l();
                yx a2 = a.a(this.s);
                if (a2 != null) {
                    Q(a2, list);
                }
            }
        }
    }

    private void R() {
        Arrays.fill(this.t, (Object) null);
        this.v = 0;
        this.w = 0;
    }

    private void S(yx yxVar) {
        Handler handler = this.r;
        if (handler != null) {
            handler.obtainMessage(0, yxVar).sendToTarget();
        } else {
            T(yxVar);
        }
    }

    private void T(yx yxVar) {
        this.q.v(yxVar);
    }

    /* access modifiers changed from: protected */
    public void G() {
        R();
        this.x = null;
    }

    /* access modifiers changed from: protected */
    public void I(long j, boolean z2) {
        R();
        this.y = false;
    }

    /* access modifiers changed from: protected */
    public void M(f0[] f0VarArr, long j) {
        this.x = this.p.a(f0VarArr[0]);
    }

    public int b(f0 f0Var) {
        if (!this.p.b(f0Var)) {
            return v0.a(0);
        }
        return v0.a(u.P((rs<?>) null, f0Var.p) ? 4 : 2);
    }

    public boolean c() {
        return this.y;
    }

    public boolean f() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            T((yx) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public void q(long j, long j2) {
        if (!this.y && this.w < 5) {
            this.s.clear();
            g0 B = B();
            int N = N(B, this.s, false);
            if (N == -4) {
                if (this.s.isEndOfStream()) {
                    this.y = true;
                } else if (!this.s.isDecodeOnly()) {
                    cy cyVar = this.s;
                    cyVar.k = this.z;
                    cyVar.l();
                    ay ayVar = this.x;
                    v50.g(ayVar);
                    yx a = ayVar.a(this.s);
                    if (a != null) {
                        ArrayList arrayList = new ArrayList(a.d());
                        Q(a, arrayList);
                        if (!arrayList.isEmpty()) {
                            yx yxVar = new yx((List<? extends yx.b>) arrayList);
                            int i = this.v;
                            int i2 = this.w;
                            int i3 = (i + i2) % 5;
                            this.t[i3] = yxVar;
                            this.u[i3] = this.s.h;
                            this.w = i2 + 1;
                        }
                    }
                }
            } else if (N == -5) {
                f0 f0Var = B.c;
                q40.e(f0Var);
                this.z = f0Var.q;
            }
        }
        if (this.w > 0) {
            long[] jArr = this.u;
            int i4 = this.v;
            if (jArr[i4] <= j) {
                yx yxVar2 = this.t[i4];
                v50.g(yxVar2);
                S(yxVar2);
                yx[] yxVarArr = this.t;
                int i5 = this.v;
                yxVarArr[i5] = null;
                this.v = (i5 + 1) % 5;
                this.w--;
            }
        }
    }
}
