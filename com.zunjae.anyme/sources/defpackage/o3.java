package defpackage;

import java.io.Writer;

/* renamed from: o3  reason: default package */
public class o3 extends Writer {
    private final String e;
    private StringBuilder f = new StringBuilder(128);

    public o3(String str) {
        this.e = str;
    }

    private void a() {
        if (this.f.length() > 0) {
            this.f.toString();
            StringBuilder sb = this.f;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                a();
            } else {
                this.f.append(c);
            }
        }
    }
}
