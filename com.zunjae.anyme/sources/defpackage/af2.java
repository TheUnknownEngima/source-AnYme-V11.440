package defpackage;

/* renamed from: af2  reason: default package */
public final class af2 {
    public static final int a(int i, int i2) {
        if (i2 >= 0 && 255 >= i2) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
