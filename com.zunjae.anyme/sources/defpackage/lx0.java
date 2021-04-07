package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: lx0  reason: default package */
public abstract class lx0 implements Serializable, Iterable<Byte> {
    public static final lx0 f = new ux0(uy0.b);
    private static final qx0 g = (ix0.b() ? new xx0((nx0) null) : new ox0((nx0) null));
    private int e = 0;

    lx0() {
    }

    public static lx0 h(String str) {
        return new ux0(str.getBytes(uy0.a));
    }

    public static lx0 i(byte[] bArr, int i, int i2) {
        m(i, i + i2, bArr.length);
        return new ux0(g.a(bArr, i, i2));
    }

    static int m(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    static sx0 o(int i) {
        return new sx0(i, (nx0) null);
    }

    public abstract byte a(int i);

    public abstract int c();

    /* access modifiers changed from: protected */
    public abstract int d(int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    public abstract lx0 g(int i, int i2);

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int c = c();
            i = d(c, 0, c);
            if (i == 0) {
                i = 1;
            }
            this.e = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new nx0(this);
    }

    /* access modifiers changed from: protected */
    public abstract String j(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void k(mx0 mx0);

    /* access modifiers changed from: package-private */
    public abstract byte l(int i);

    public final String n() {
        return c() == 0 ? "" : j(uy0.a);
    }

    public abstract boolean p();

    /* access modifiers changed from: protected */
    public final int r() {
        return this.e;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(c());
        objArr[2] = c() <= 50 ? i11.a(this) : String.valueOf(i11.a(g(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
