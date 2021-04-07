package kotlinx.coroutines.internal;

final /* synthetic */ class x {
    public static final int a(String str, int i, int i2, int i3) {
        v62.f(str, "propertyName");
        return (int) v.c(str, (long) i, (long) i2, (long) i3);
    }

    public static final long b(String str, long j, long j2, long j3) {
        v62.f(str, "propertyName");
        String d = v.d(str);
        if (d == null) {
            return j;
        }
        Long i = e92.i(d);
        if (i != null) {
            long longValue = i.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d + '\'').toString());
    }

    public static final boolean c(String str, boolean z) {
        v62.f(str, "propertyName");
        String d = v.d(str);
        return d != null ? Boolean.parseBoolean(d) : z;
    }

    public static /* synthetic */ int d(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return v.b(str, i, i2, i3);
    }

    public static /* synthetic */ long e(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return v.c(str, j, j4, j3);
    }
}
