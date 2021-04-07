package defpackage;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: zp0  reason: default package */
public final class zp0 {
    static {
        new yp0();
    }

    public static InputStream a(InputStream inputStream, long j) {
        return new bq0(inputStream, 1048577);
    }

    public static byte[] b(InputStream inputStream) {
        wp0.a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, 2147483639 - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    return c(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            i = dq0.a(i, 2);
        }
        if (inputStream.read() == -1) {
            return c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    private static byte[] c(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
