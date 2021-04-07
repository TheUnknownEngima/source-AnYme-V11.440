package defpackage;

import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.l;
import java.util.Arrays;

/* renamed from: b10  reason: default package */
public abstract class b10 extends v00 {
    private byte[] i;
    private volatile boolean j;

    public b10(i iVar, l lVar, int i2, f0 f0Var, int i3, Object obj, byte[] bArr) {
        super(iVar, lVar, i2, f0Var, i3, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = bArr;
    }

    private void i(int i2) {
        byte[] bArr = this.i;
        if (bArr == null) {
            this.i = new byte[16384];
        } else if (bArr.length < i2 + 16384) {
            this.i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    public final void a() {
        try {
            this.h.c(this.a);
            int i2 = 0;
            int i3 = 0;
            while (i2 != -1 && !this.j) {
                i(i3);
                i2 = this.h.a(this.i, i3, 16384);
                if (i2 != -1) {
                    i3 += i2;
                }
            }
            if (!this.j) {
                g(this.i, i3);
            }
        } finally {
            v50.k(this.h);
        }
    }

    public final void c() {
        this.j = true;
    }

    /* access modifiers changed from: protected */
    public abstract void g(byte[] bArr, int i2);

    public byte[] h() {
        return this.i;
    }
}
