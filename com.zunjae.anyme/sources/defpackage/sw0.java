package defpackage;

/* renamed from: sw0  reason: default package */
public final class sw0 extends vw0 {
    public static int a(int i, int i2, int i3) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(vu0.b("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
    }
}
