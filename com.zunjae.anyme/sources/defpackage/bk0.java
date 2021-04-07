package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: bk0  reason: default package */
public abstract class bk0 implements Serializable, Iterable<Byte> {
    public static final bk0 f = new kk0(gl0.b);
    private static final gk0 g = (yj0.b() ? new jk0((ak0) null) : new ek0((ak0) null));
    private int e = 0;

    bk0() {
    }

    static ik0 h(int i) {
        return new ik0(i, (ak0) null);
    }

    public static bk0 i(String str) {
        return new kk0(str.getBytes(gl0.a));
    }

    static int k(int i, int i2, int i3) {
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

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void c(xj0 xj0);

    public abstract byte d(int i);

    public abstract boolean equals(Object obj);

    /* access modifiers changed from: package-private */
    public abstract byte g(int i);

    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int size = size();
            i = j(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.e = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new ak0(this);
    }

    /* access modifiers changed from: protected */
    public abstract int j(int i, int i2, int i3);

    public abstract bk0 l(int i, int i2);

    public final String m() {
        return size() == 0 ? "" : a(gl0.a);
    }

    public abstract boolean n();

    /* access modifiers changed from: protected */
    public final int o() {
        return this.e;
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? rn0.a(this) : String.valueOf(rn0.a(l(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
