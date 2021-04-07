package defpackage;

/* renamed from: x11  reason: default package */
final class x11 {
    /* access modifiers changed from: private */
    public static void f(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (o(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || o(b3) || o(b4)) {
            throw ez0.f();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    /* access modifiers changed from: private */
    public static void g(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (o(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || o(b3)))) {
            throw ez0.f();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    public static void h(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || o(b2)) {
            throw ez0.f();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    public static void i(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    public static boolean l(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    public static boolean m(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    public static boolean n(byte b) {
        return b < -16;
    }

    private static boolean o(byte b) {
        return b > -65;
    }
}
