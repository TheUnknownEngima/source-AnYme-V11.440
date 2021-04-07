package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.v0;
import java.nio.ByteBuffer;

/* renamed from: y50  reason: default package */
public class y50 extends u {
    private final as p = new as(1);
    private final i50 q = new i50();
    private long r;
    private x50 s;
    private long t;

    public y50() {
        super(5);
    }

    private float[] Q(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.q.K(byteBuffer.array(), byteBuffer.limit());
        this.q.M(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.q.n());
        }
        return fArr;
    }

    private void R() {
        this.t = 0;
        x50 x50 = this.s;
        if (x50 != null) {
            x50.b();
        }
    }

    /* access modifiers changed from: protected */
    public void G() {
        R();
    }

    /* access modifiers changed from: protected */
    public void I(long j, boolean z) {
        R();
    }

    /* access modifiers changed from: protected */
    public void M(f0[] f0VarArr, long j) {
        this.r = j;
    }

    public int b(f0 f0Var) {
        return v0.a("application/x-camera-motion".equals(f0Var.m) ? 4 : 0);
    }

    public boolean c() {
        return k();
    }

    public boolean f() {
        return true;
    }

    public void q(long j, long j2) {
        while (!k() && this.t < 100000 + j) {
            this.p.clear();
            if (N(B(), this.p, false) == -4 && !this.p.isEndOfStream()) {
                this.p.l();
                as asVar = this.p;
                this.t = asVar.h;
                if (this.s != null) {
                    ByteBuffer byteBuffer = asVar.f;
                    v50.g(byteBuffer);
                    float[] Q = Q(byteBuffer);
                    if (Q != null) {
                        x50 x50 = this.s;
                        v50.g(x50);
                        x50.a(this.t - this.r, Q);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void r(int i, Object obj) {
        if (i == 7) {
            this.s = (x50) obj;
        } else {
            super.r(i, obj);
        }
    }
}
