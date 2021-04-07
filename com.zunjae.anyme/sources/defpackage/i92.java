package defpackage;

/* renamed from: i92  reason: default package */
class i92 extends h92 {
    public static final String j0(String str, int i) {
        v62.e(str, "$this$drop");
        if (i >= 0) {
            String substring = str.substring(w72.e(i, str.length()));
            v62.d(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static String k0(String str, int i) {
        v62.e(str, "$this$dropLast");
        if (i >= 0) {
            return l0(str, w72.b(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static String l0(String str, int i) {
        v62.e(str, "$this$take");
        if (i >= 0) {
            String substring = str.substring(0, w72.e(i, str.length()));
            v62.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
