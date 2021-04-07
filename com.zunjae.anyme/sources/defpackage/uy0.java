package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: uy0  reason: default package */
public final class uy0 {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = b;
        wx0.b(bArr2, 0, bArr2.length, false);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T d(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    static Object e(Object obj, Object obj2) {
        e01 c = ((f01) obj).c();
        c.B0((f01) obj2);
        return c.m();
    }

    static <T> T f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static boolean g(f01 f01) {
        if (!(f01 instanceof dx0)) {
            return false;
        }
        dx0 dx0 = (dx0) f01;
        return false;
    }

    public static boolean h(byte[] bArr) {
        return v11.f(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }
}
