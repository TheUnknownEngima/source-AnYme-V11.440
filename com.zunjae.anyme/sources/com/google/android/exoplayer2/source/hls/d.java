package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.l;
import com.google.android.exoplayer2.upstream.y;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class d implements i {
    private final i a;
    private final byte[] b;
    private final byte[] c;
    private CipherInputStream d;

    public d(i iVar, byte[] bArr, byte[] bArr2) {
        this.a = iVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public final int a(byte[] bArr, int i, int i2) {
        q40.e(this.d);
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    public final void b(y yVar) {
        this.a.b(yVar);
    }

    public final long c(l lVar) {
        try {
            Cipher f = f();
            try {
                f.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                k kVar = new k(this.a, lVar);
                this.d = new CipherInputStream(kVar, f);
                kVar.b();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    public final Map<String, List<String>> d() {
        return this.a.d();
    }

    public final Uri e() {
        return this.a.e();
    }

    /* access modifiers changed from: protected */
    public Cipher f() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}
