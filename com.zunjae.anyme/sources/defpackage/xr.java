package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* renamed from: xr  reason: default package */
public final class xr {
    public byte[] a;
    public int[] b;
    public int[] c;
    private final MediaCodec.CryptoInfo d;
    private final b e;

    @TargetApi(24)
    /* renamed from: xr$b */
    private static final class b {
        private final MediaCodec.CryptoInfo a;
        private final MediaCodec.CryptoInfo.Pattern b;

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.a = cryptoInfo;
            this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* access modifiers changed from: private */
        public void b(int i, int i2) {
            this.b.set(i, i2);
            this.a.setPattern(this.b);
        }
    }

    public xr() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.d = cryptoInfo;
        this.e = v50.a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.d;
    }

    public void b(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.b = iArr;
        this.c = iArr2;
        this.a = bArr2;
        MediaCodec.CryptoInfo cryptoInfo = this.d;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (v50.a >= 24) {
            this.e.b(i3, i4);
        }
    }
}
