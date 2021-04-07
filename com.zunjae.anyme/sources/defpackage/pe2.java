package defpackage;

import java.io.Writer;

/* renamed from: pe2  reason: default package */
public class pe2 extends le2 {
    private final int b;
    private final int c;
    private final boolean d;

    private pe2(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public static pe2 g(int i, int i2) {
        return new pe2(i, i2, true);
    }

    public boolean f(int i, Writer writer) {
        if (this.d) {
            if (i < this.b || i > this.c) {
                return false;
            }
        } else if (i >= this.b && i <= this.c) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
