package defpackage;

import java.io.Writer;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: oe2  reason: default package */
public class oe2 extends ke2 {
    private final HashMap<String, String> b = new HashMap<>();
    private final HashSet<Character> c = new HashSet<>();
    private final int d;
    private final int e;

    public oe2(CharSequence[]... charSequenceArr) {
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        if (charSequenceArr != null) {
            int i3 = 0;
            for (CharSequence[] charSequenceArr2 : charSequenceArr) {
                this.b.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
                this.c.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
                int length = charSequenceArr2[0].length();
                i2 = length < i2 ? length : i2;
                if (length > i3) {
                    i3 = length;
                }
            }
            i = i3;
        }
        this.d = i2;
        this.e = i;
    }

    public int b(CharSequence charSequence, int i, Writer writer) {
        if (!this.c.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int i2 = this.e;
        if (i + i2 > charSequence.length()) {
            i2 = charSequence.length() - i;
        }
        while (i2 >= this.d) {
            String str = this.b.get(charSequence.subSequence(i, i + i2).toString());
            if (str != null) {
                writer.write(str);
                return i2;
            }
            i2--;
        }
        return 0;
    }
}
