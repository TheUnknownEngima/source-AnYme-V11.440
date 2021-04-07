package defpackage;

import defpackage.qe2;
import java.io.Writer;

/* renamed from: he2  reason: default package */
public class he2 {
    public static final ke2 a = new je2(new re2(), new te2(), new oe2(me2.j()), new oe2(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""}));
    public static final ke2 b = new je2(new oe2(me2.d()), new oe2(me2.h()), new oe2(me2.f()), new qe2(new qe2.a[0]));

    /* renamed from: he2$a */
    static class a extends ke2 {
        private static final String b = String.valueOf('\"');
        private static final char[] c = {',', '\"', 13, 10};

        public int b(CharSequence charSequence, int i, Writer writer) {
            if (i == 0) {
                if (ie2.b(charSequence.toString(), c)) {
                    writer.write(charSequence.toString());
                } else {
                    writer.write(34);
                    String charSequence2 = charSequence.toString();
                    String str = b;
                    writer.write(ie2.i(charSequence2, str, b + b));
                    writer.write(34);
                }
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            throw new IllegalStateException("CsvEscaper should never reach the [1] index");
        }
    }

    /* renamed from: he2$b */
    static class b extends ke2 {
        private static final String b = String.valueOf('\"');
        private static final char[] c = {',', '\"', 13, 10};

        public int b(CharSequence charSequence, int i, Writer writer) {
            String str;
            if (i == 0) {
                if (charSequence.charAt(0) == '\"' && charSequence.charAt(charSequence.length() - 1) == '\"') {
                    String charSequence2 = charSequence.subSequence(1, charSequence.length() - 1).toString();
                    if (ie2.a(charSequence2, c)) {
                        str = ie2.i(charSequence2, b + b, b);
                    } else {
                        str = charSequence.toString();
                    }
                } else {
                    str = charSequence.toString();
                }
                writer.write(str);
                return Character.codePointCount(charSequence, 0, charSequence.length());
            }
            throw new IllegalStateException("CsvUnescaper should never reach the [1] index");
        }
    }

    static {
        new oe2(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}).e(new oe2(me2.i())).e(ne2.h(32, 127));
        new je2(new oe2(new String[]{"'", "\\'"}, new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new oe2(me2.i()), ne2.h(32, 127));
        new je2(new oe2(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new oe2(me2.i()), ne2.h(32, 127));
        new je2(new oe2(me2.c()), new oe2(me2.a()));
        new je2(new oe2(me2.c()), new oe2(me2.a()), new oe2(new String[]{"\u0000", ""}, new String[]{"\u0001", ""}, new String[]{"\u0002", ""}, new String[]{"\u0003", ""}, new String[]{"\u0004", ""}, new String[]{"\u0005", ""}, new String[]{"\u0006", ""}, new String[]{"\u0007", ""}, new String[]{"\b", ""}, new String[]{"\u000b", ""}, new String[]{"\f", ""}, new String[]{"\u000e", ""}, new String[]{"\u000f", ""}, new String[]{"\u0010", ""}, new String[]{"\u0011", ""}, new String[]{"\u0012", ""}, new String[]{"\u0013", ""}, new String[]{"\u0014", ""}, new String[]{"\u0015", ""}, new String[]{"\u0016", ""}, new String[]{"\u0017", ""}, new String[]{"\u0018", ""}, new String[]{"\u0019", ""}, new String[]{"\u001a", ""}, new String[]{"\u001b", ""}, new String[]{"\u001c", ""}, new String[]{"\u001d", ""}, new String[]{"\u001e", ""}, new String[]{"\u001f", ""}, new String[]{"￾", ""}, new String[]{"￿", ""}), pe2.g(127, 132), pe2.g(134, 159), new ue2());
        new je2(new oe2(me2.c()), new oe2(me2.a()), new oe2(new String[]{"\u0000", ""}, new String[]{"\u000b", "&#11;"}, new String[]{"\f", "&#12;"}, new String[]{"￾", ""}, new String[]{"￿", ""}), pe2.g(1, 8), pe2.g(14, 31), pe2.g(127, 132), pe2.g(134, 159), new ue2());
        new je2(new oe2(me2.c()), new oe2(me2.g()));
        new je2(new oe2(me2.c()), new oe2(me2.g()), new oe2(me2.e()));
        new je2(new oe2(me2.d()), new oe2(me2.h()), new qe2(new qe2.a[0]));
        new je2(new oe2(me2.d()), new oe2(me2.b()), new qe2(new qe2.a[0]));
    }

    public static final String a(String str) {
        return b.c(str);
    }
}
