package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* renamed from: sa  reason: default package */
public class sa {
    static long a(byte[] bArr, int i, ByteOrder byteOrder) {
        long j = 0;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            for (int i2 = i; i2 < i + 8; i2++) {
                j = (j << 8) | (((long) bArr[i2]) & 255);
            }
        } else {
            for (int i3 = i + 7; i3 >= i; i3--) {
                j = (j << 8) | (((long) bArr[i3]) & 255);
            }
        }
        return j;
    }

    public static UUID b(UUID uuid, String str) {
        return c(uuid, str.getBytes(Charset.forName("UTF-8")));
    }

    public static UUID c(UUID uuid, byte[] bArr) {
        if (bArr != null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                if (uuid == null) {
                    instance.update(new byte[16]);
                } else {
                    instance.update(f(uuid.getMostSignificantBits(), ByteOrder.BIG_ENDIAN));
                    instance.update(f(uuid.getLeastSignificantBits(), ByteOrder.BIG_ENDIAN));
                }
                return d(instance.digest(bArr), 5);
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } else {
            throw new NullPointerException("name == null");
        }
    }

    static UUID d(byte[] bArr, int i) {
        long a = a(bArr, 0, ByteOrder.BIG_ENDIAN);
        long a2 = a(bArr, 8, ByteOrder.BIG_ENDIAN);
        return new UUID((((long) i) << 12) | (a & -61441), (4611686018427387903L & a2) | Long.MIN_VALUE);
    }

    static void e(long j, byte[] bArr, int i, ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            for (int i2 = i + 7; i2 >= i; i2--) {
                bArr[i2] = (byte) ((int) (j & 255));
                j >>= 8;
            }
            return;
        }
        for (int i3 = i; i3 < i + 8; i3++) {
            bArr[i3] = (byte) ((int) (j & 255));
            j >>= 8;
        }
    }

    static byte[] f(long j, ByteOrder byteOrder) {
        byte[] bArr = new byte[8];
        e(j, bArr, 0, byteOrder);
        return bArr;
    }

    public static UUID g(UUID uuid) {
        return b(uuid, UUID.randomUUID().toString());
    }
}
