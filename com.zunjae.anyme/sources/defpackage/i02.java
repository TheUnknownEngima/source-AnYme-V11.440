package defpackage;

/* renamed from: i02  reason: default package */
public final class i02 {
    public static long a(long j) {
        return System.currentTimeMillis() + d(j, 86400000, 106751991167L);
    }

    public static long b(long j) {
        return System.currentTimeMillis() + d(j, 3600000, 2562047788015L);
    }

    public static long c(long j) {
        return System.currentTimeMillis() + d(j, 60000, 153722867280912L);
    }

    private static long d(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }
}
