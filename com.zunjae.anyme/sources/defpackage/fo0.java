package defpackage;

/* renamed from: fo0  reason: default package */
final class fo0 {
    private static final ho0 a = ((!(bo0.y() && bo0.z()) || yj0.b()) ? new go0() : new io0());

    static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new jo0(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    static int b(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return a.b(charSequence, bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int c(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static boolean e(byte[] bArr) {
        return a.c(bArr, 0, bArr.length);
    }

    public static boolean f(byte[] bArr, int i, int i2) {
        return a.c(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int g(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return c(b);
        }
        if (i3 == 1) {
            return k(b, bArr[i]);
        }
        if (i3 == 2) {
            return i(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    public static int i(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* access modifiers changed from: private */
    public static int k(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }
}
