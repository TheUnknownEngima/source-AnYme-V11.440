package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: gl0  reason: default package */
public final class gl0 {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        byte[] bArr2 = b;
        mk0.a(bArr2, 0, bArr2.length, false);
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int c = c(length, bArr, 0, length);
        if (c == 0) {
            return 1;
        }
        return c;
    }

    static int c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static <T> T d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    static Object e(Object obj, Object obj2) {
        om0 c = ((pm0) obj).c();
        c.M((pm0) obj2);
        return c.F();
    }

    public static boolean f(byte[] bArr) {
        return fo0.e(bArr);
    }

    public static String g(byte[] bArr) {
        return new String(bArr, a);
    }

    static boolean h(pm0 pm0) {
        if (!(pm0 instanceof tj0)) {
            return false;
        }
        tj0 tj0 = (tj0) pm0;
        return false;
    }

    public static int i(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int j(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
