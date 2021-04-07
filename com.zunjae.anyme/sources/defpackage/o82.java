package defpackage;

/* renamed from: o82  reason: default package */
class o82 {
    public static final int a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new t72(2, 36));
    }

    public static final int b(char c, int i) {
        return Character.digit(c, i);
    }

    public static final boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
