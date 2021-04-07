package defpackage;

import java.nio.ByteBuffer;

/* renamed from: i20  reason: default package */
public abstract class i20 extends cs<o20, p20, m20> implements l20 {
    protected i20(String str) {
        super(new o20[2], new p20[2]);
        v(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final m20 k(o20 o20, p20 p20, boolean z) {
        try {
            ByteBuffer byteBuffer = o20.f;
            q40.e(byteBuffer);
            ByteBuffer byteBuffer2 = byteBuffer;
            p20 p202 = p20;
            p202.i(o20.h, z(byteBuffer2.array(), byteBuffer2.limit(), z), o20.k);
            p20.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (m20 e) {
            return e;
        }
    }

    /* access modifiers changed from: protected */
    public final void B(p20 p20) {
        super.s(p20);
    }

    public void b(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final o20 h() {
        return new o20();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final p20 i() {
        return new j20(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final m20 j(Throwable th) {
        return new m20("Unexpected decode error", th);
    }

    /* access modifiers changed from: protected */
    public abstract k20 z(byte[] bArr, int i, boolean z);
}
