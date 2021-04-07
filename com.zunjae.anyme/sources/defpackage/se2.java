package defpackage;

import java.io.Writer;

/* renamed from: se2  reason: default package */
public class se2 extends le2 {
    private final int b;
    private final int c;
    private final boolean d;

    protected se2(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public boolean f(int i, Writer writer) {
        if (this.d) {
            if (i < this.b || i > this.c) {
                return false;
            }
        } else if (i >= this.b && i <= this.c) {
            return false;
        }
        if (i > 65535) {
            writer.write(g(i));
            return true;
        }
        writer.write("\\u");
        writer.write(ke2.a[(i >> 12) & 15]);
        writer.write(ke2.a[(i >> 8) & 15]);
        writer.write(ke2.a[(i >> 4) & 15]);
        writer.write(ke2.a[i & 15]);
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract String g(int i);
}
