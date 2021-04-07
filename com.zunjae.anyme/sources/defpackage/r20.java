package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.v0;
import java.util.Collections;
import java.util.List;

/* renamed from: r20  reason: default package */
public final class r20 extends u implements Handler.Callback {
    private p20 A;
    private int B;
    private final Handler p;
    private final q20 q;
    private final n20 r;
    private final g0 s;
    private boolean t;
    private boolean u;
    private int v;
    private f0 w;
    private l20 x;
    private o20 y;
    private p20 z;

    public r20(q20 q20, Looper looper) {
        this(q20, looper, n20.a);
    }

    public r20(q20 q20, Looper looper, n20 n20) {
        super(3);
        q40.e(q20);
        this.q = q20;
        this.p = looper == null ? null : v50.u(looper, this);
        this.r = n20;
        this.s = new g0();
    }

    private void Q() {
        Y(Collections.emptyList());
    }

    private long R() {
        int i = this.B;
        if (i == -1 || i >= this.z.h()) {
            return Long.MAX_VALUE;
        }
        return this.z.e(this.B);
    }

    private void S(m20 m20) {
        String valueOf = String.valueOf(this.w);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        b50.d("TextRenderer", sb.toString(), m20);
        X();
    }

    private void T(List<h20> list) {
        this.q.p(list);
    }

    private void U() {
        this.y = null;
        this.B = -1;
        p20 p20 = this.z;
        if (p20 != null) {
            p20.release();
            this.z = null;
        }
        p20 p202 = this.A;
        if (p202 != null) {
            p202.release();
            this.A = null;
        }
    }

    private void V() {
        U();
        this.x.a();
        this.x = null;
        this.v = 0;
    }

    private void W() {
        V();
        this.x = this.r.a(this.w);
    }

    private void X() {
        Q();
        if (this.v != 0) {
            W();
            return;
        }
        U();
        this.x.flush();
    }

    private void Y(List<h20> list) {
        Handler handler = this.p;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            T(list);
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
        this.w = null;
        Q();
        V();
    }

    /* access modifiers changed from: protected */
    public void I(long j, boolean z2) {
        this.t = false;
        this.u = false;
        X();
    }

    /* access modifiers changed from: protected */
    public void M(f0[] f0VarArr, long j) {
        f0 f0Var = f0VarArr[0];
        this.w = f0Var;
        if (this.x != null) {
            this.v = 1;
        } else {
            this.x = this.r.a(f0Var);
        }
    }

    public int b(f0 f0Var) {
        if (this.r.b(f0Var)) {
            return v0.a(u.P((rs<?>) null, f0Var.p) ? 4 : 2);
        }
        return v0.a(e50.m(f0Var.m) ? 1 : 0);
    }

    public boolean c() {
        return this.u;
    }

    public boolean f() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            T((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    public void q(long j, long j2) {
        boolean z2;
        if (!this.u) {
            if (this.A == null) {
                this.x.b(j);
                try {
                    this.A = (p20) this.x.c();
                } catch (m20 e) {
                    S(e);
                    return;
                }
            }
            if (getState() == 2) {
                if (this.z != null) {
                    long R = R();
                    z2 = false;
                    while (R <= j) {
                        this.B++;
                        R = R();
                        z2 = true;
                    }
                } else {
                    z2 = false;
                }
                p20 p20 = this.A;
                if (p20 != null) {
                    if (p20.isEndOfStream()) {
                        if (!z2 && R() == Long.MAX_VALUE) {
                            if (this.v == 2) {
                                W();
                            } else {
                                U();
                                this.u = true;
                            }
                        }
                    } else if (this.A.timeUs <= j) {
                        p20 p202 = this.z;
                        if (p202 != null) {
                            p202.release();
                        }
                        p20 p203 = this.A;
                        this.z = p203;
                        this.A = null;
                        this.B = p203.a(j);
                        z2 = true;
                    }
                }
                if (z2) {
                    Y(this.z.f(j));
                }
                if (this.v != 2) {
                    while (!this.t) {
                        try {
                            if (this.y == null) {
                                o20 o20 = (o20) this.x.d();
                                this.y = o20;
                                if (o20 == null) {
                                    return;
                                }
                            }
                            if (this.v == 1) {
                                this.y.setFlags(4);
                                this.x.e(this.y);
                                this.y = null;
                                this.v = 2;
                                return;
                            }
                            int N = N(this.s, this.y, false);
                            if (N == -4) {
                                if (this.y.isEndOfStream()) {
                                    this.t = true;
                                } else {
                                    this.y.k = this.s.c.q;
                                    this.y.l();
                                }
                                this.x.e(this.y);
                                this.y = null;
                            } else if (N == -3) {
                                return;
                            }
                        } catch (m20 e2) {
                            S(e2);
                            return;
                        }
                    }
                }
            }
        }
    }
}
