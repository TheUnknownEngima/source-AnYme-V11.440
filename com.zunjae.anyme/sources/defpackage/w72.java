package defpackage;

/* renamed from: w72  reason: default package */
class w72 extends v72 {
    public static float a(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static int b(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static long c(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static float d(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int e(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static long f(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static int g(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static r72 h(int i, int i2) {
        return r72.h.a(i, i2, -1);
    }

    public static t72 i(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? t72.j.a() : new t72(i, i2 - 1);
    }
}
