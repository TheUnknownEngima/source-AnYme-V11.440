package defpackage;

import java.io.Writer;

/* renamed from: re2  reason: default package */
public class re2 extends ke2 {
    private boolean f(char c) {
        return c >= '0' && c <= '7';
    }

    private boolean g(char c) {
        return c >= '0' && c <= '3';
    }

    public int b(CharSequence charSequence, int i, Writer writer) {
        int length = (charSequence.length() - i) - 1;
        StringBuilder sb = new StringBuilder();
        if (charSequence.charAt(i) != '\\' || length <= 0) {
            return 0;
        }
        int i2 = i + 1;
        if (!f(charSequence.charAt(i2))) {
            return 0;
        }
        int i3 = i + 2;
        int i4 = i + 3;
        sb.append(charSequence.charAt(i2));
        if (length > 1 && f(charSequence.charAt(i3))) {
            sb.append(charSequence.charAt(i3));
            if (length > 2 && g(charSequence.charAt(i2)) && f(charSequence.charAt(i4))) {
                sb.append(charSequence.charAt(i4));
            }
        }
        writer.write(Integer.parseInt(sb.toString(), 8));
        return sb.length() + 1;
    }
}
