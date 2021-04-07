package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: if1  reason: default package */
final class if1 {
    private final byte[] a;
    private volatile int b = 0;

    private if1(byte[] bArr) {
        this.a = bArr;
    }

    public static if1 a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static if1 b(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new if1(bArr2);
    }

    public static if1 c(String str) {
        try {
            return new if1(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public void d(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    public InputStream e() {
        return new ByteArrayInputStream(this.a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof if1)) {
            return false;
        }
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = ((if1) obj).a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public int f() {
        return this.a.length;
    }

    public int hashCode() {
        int i = this.b;
        if (i == 0) {
            int i2 = r1;
            for (byte b2 : this.a) {
                i2 = (i2 * 31) + b2;
            }
            i = i2 == 0 ? 1 : i2;
            this.b = i;
        }
        return i;
    }
}
