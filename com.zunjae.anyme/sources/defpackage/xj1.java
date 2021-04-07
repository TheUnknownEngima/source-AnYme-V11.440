package defpackage;

import defpackage.ok1;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: xj1  reason: default package */
public final class xj1 {
    static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    /* renamed from: xj1$a */
    public interface a extends i<Boolean> {
    }

    /* renamed from: xj1$b */
    public interface b extends i<Double> {
    }

    /* renamed from: xj1$c */
    public interface c {
        int j();
    }

    /* renamed from: xj1$d */
    public interface d<T extends c> {
        T a(int i);
    }

    /* renamed from: xj1$e */
    public interface e {
        boolean a(int i);
    }

    /* renamed from: xj1$f */
    public interface f extends i<Float> {
    }

    /* renamed from: xj1$g */
    public interface g extends i<Integer> {
    }

    /* renamed from: xj1$h */
    public interface h extends i<Long> {
    }

    /* renamed from: xj1$i */
    public interface i<E> extends List<E>, RandomAccess {
        void s();

        boolean t0();

        i<E> w(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        fj1.h(b);
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i2, int i3) {
        int i4 = i(i3, bArr, i2, i3);
        if (i4 == 0) {
            return 1;
        }
        return i4;
    }

    public static int f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return ql1.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        ok1.a d2 = ((ok1) obj).d();
        d2.d0((ok1) obj2);
        return d2.j0();
    }

    static int i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, a);
    }
}
