package defpackage;

import android.graphics.Bitmap;
import defpackage.od;

/* renamed from: hj  reason: default package */
public final class hj implements od.a {
    private final rf a;
    private final of b;

    public hj(rf rfVar, of ofVar) {
        this.a = rfVar;
        this.b = ofVar;
    }

    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.a.e(i, i2, config);
    }

    public int[] b(int i) {
        of ofVar = this.b;
        return ofVar == null ? new int[i] : (int[]) ofVar.e(i, int[].class);
    }

    public void c(Bitmap bitmap) {
        this.a.c(bitmap);
    }

    public void d(byte[] bArr) {
        of ofVar = this.b;
        if (ofVar != null) {
            ofVar.d(bArr);
        }
    }

    public byte[] e(int i) {
        of ofVar = this.b;
        return ofVar == null ? new byte[i] : (byte[]) ofVar.e(i, byte[].class);
    }

    public void f(int[] iArr) {
        of ofVar = this.b;
        if (ofVar != null) {
            ofVar.d(iArr);
        }
    }
}
