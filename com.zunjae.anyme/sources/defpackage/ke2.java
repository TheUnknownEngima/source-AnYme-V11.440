package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Locale;

/* renamed from: ke2  reason: default package */
public abstract class ke2 {
    static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i) {
        return Integer.toHexString(i).toUpperCase(Locale.ENGLISH);
    }

    public abstract int b(CharSequence charSequence, int i, Writer writer);

    public final String c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(charSequence.length() * 2);
            d(charSequence, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void d(CharSequence charSequence, Writer writer) {
        if (writer == null) {
            throw new IllegalArgumentException("The Writer must not be null");
        } else if (charSequence != null) {
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int b = b(charSequence, i, writer);
                if (b == 0) {
                    char charAt = charSequence.charAt(i);
                    writer.write(charAt);
                    i++;
                    if (Character.isHighSurrogate(charAt) && i < length) {
                        char charAt2 = charSequence.charAt(i);
                        if (Character.isLowSurrogate(charAt2)) {
                            writer.write(charAt2);
                            i++;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < b; i2++) {
                        i += Character.charCount(Character.codePointAt(charSequence, i));
                    }
                }
            }
        }
    }

    public final ke2 e(ke2... ke2Arr) {
        ke2[] ke2Arr2 = new ke2[(ke2Arr.length + 1)];
        ke2Arr2[0] = this;
        System.arraycopy(ke2Arr, 0, ke2Arr2, 1, ke2Arr.length);
        return new je2(ke2Arr2);
    }
}
