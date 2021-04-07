package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: ej1  reason: default package */
public abstract class ej1 implements Iterable<Byte>, Serializable {
    public static final ej1 f = new i(xj1.b);
    private static final e g = (zi1.c() ? new j((a) null) : new c((a) null));
    private int e = 0;

    /* renamed from: ej1$a */
    class a extends b {
        private int e = 0;
        private final int f = ej1.this.size();

        a() {
        }

        public boolean hasNext() {
            return this.e < this.f;
        }

        public byte nextByte() {
            int i = this.e;
            if (i < this.f) {
                this.e = i + 1;
                return ej1.this.k(i);
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: ej1$b */
    static abstract class b implements f {
        b() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: ej1$c */
    private static final class c implements e {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: ej1$d */
    private static final class d extends i {
        private final int i;
        private final int j;

        d(byte[] bArr, int i2, int i3) {
            super(bArr);
            ej1.d(i2, i2 + i3, bArr.length);
            this.i = i2;
            this.j = i3;
        }

        /* access modifiers changed from: protected */
        public int G() {
            return this.i;
        }

        public byte a(int i2) {
            ej1.c(i2, size());
            return this.h[this.i + i2];
        }

        /* access modifiers changed from: protected */
        public void j(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.h, G() + i2, bArr, i3, i4);
        }

        /* access modifiers changed from: package-private */
        public byte k(int i2) {
            return this.h[this.i + i2];
        }

        public int size() {
            return this.j;
        }
    }

    /* renamed from: ej1$e */
    private interface e {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* renamed from: ej1$f */
    public interface f extends Iterator<Byte> {
        byte nextByte();
    }

    /* renamed from: ej1$g */
    static final class g {
        private final hj1 a;
        private final byte[] b;

        private g(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.a = hj1.d0(bArr);
        }

        /* synthetic */ g(int i, a aVar) {
            this(i);
        }

        public ej1 a() {
            this.a.c();
            return new i(this.b);
        }

        public hj1 b() {
            return this.a;
        }
    }

    /* renamed from: ej1$h */
    static abstract class h extends ej1 {
        h() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ej1.super.iterator();
        }
    }

    /* renamed from: ej1$i */
    private static class i extends h {
        protected final byte[] h;

        i(byte[] bArr) {
            if (bArr != null) {
                this.h = bArr;
                return;
            }
            throw null;
        }

        /* access modifiers changed from: package-private */
        public final void E(dj1 dj1) {
            dj1.a(this.h, G(), size());
        }

        /* access modifiers changed from: package-private */
        public final boolean F(ej1 ej1, int i, int i2) {
            if (i2 <= ej1.size()) {
                int i3 = i + i2;
                if (i3 > ej1.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + ej1.size());
                } else if (!(ej1 instanceof i)) {
                    return ej1.t(i, i3).equals(t(0, i2));
                } else {
                    i iVar = (i) ej1;
                    byte[] bArr = this.h;
                    byte[] bArr2 = iVar.h;
                    int G = G() + i2;
                    int G2 = G();
                    int G3 = iVar.G() + i;
                    while (G2 < G) {
                        if (bArr[G2] != bArr2[G3]) {
                            return false;
                        }
                        G2++;
                        G3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        public int G() {
            return 0;
        }

        public byte a(int i) {
            return this.h[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ej1) || size() != ((ej1) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int r = r();
            int r2 = iVar.r();
            if (r == 0 || r2 == 0 || r == r2) {
                return F(iVar, 0, size());
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public void j(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.h, i, bArr, i2, i3);
        }

        /* access modifiers changed from: package-private */
        public byte k(int i) {
            return this.h[i];
        }

        public final boolean l() {
            int G = G();
            return ql1.n(this.h, G, size() + G);
        }

        public final fj1 o() {
            return fj1.j(this.h, G(), size(), true);
        }

        /* access modifiers changed from: protected */
        public final int p(int i, int i2, int i3) {
            return xj1.i(i, this.h, G() + i2, i3);
        }

        public int size() {
            return this.h.length;
        }

        public final ej1 t(int i, int i2) {
            int d = ej1.d(i, i2, size());
            return d == 0 ? ej1.f : new d(this.h, G() + i, d);
        }

        /* access modifiers changed from: protected */
        public final String z(Charset charset) {
            return new String(this.h, G(), size(), charset);
        }
    }

    /* renamed from: ej1$j */
    private static final class j implements e {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    ej1() {
    }

    private String B() {
        if (size() <= 50) {
            return jl1.a(this);
        }
        return jl1.a(t(0, 47)) + "...";
    }

    static ej1 C(byte[] bArr) {
        return new i(bArr);
    }

    static ej1 D(byte[] bArr, int i2, int i3) {
        return new d(bArr, i2, i3);
    }

    static void c(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) >= 0) {
            return;
        }
        if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
    }

    static int d(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        } else if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
        }
    }

    public static ej1 g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public static ej1 h(byte[] bArr, int i2, int i3) {
        d(i2, i2 + i3, bArr.length);
        return new i(g.a(bArr, i2, i3));
    }

    public static ej1 i(String str) {
        return new i(str.getBytes(xj1.a));
    }

    static g n(int i2) {
        return new g(i2, (a) null);
    }

    public final String A() {
        return y(xj1.a);
    }

    /* access modifiers changed from: package-private */
    public abstract void E(dj1 dj1);

    public abstract byte a(int i2);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.e;
        if (i2 == 0) {
            int size = size();
            i2 = p(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.e = i2;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public abstract void j(byte[] bArr, int i2, int i3, int i4);

    /* access modifiers changed from: package-private */
    public abstract byte k(int i2);

    public abstract boolean l();

    /* renamed from: m */
    public f iterator() {
        return new a();
    }

    public abstract fj1 o();

    /* access modifiers changed from: protected */
    public abstract int p(int i2, int i3, int i4);

    /* access modifiers changed from: protected */
    public final int r() {
        return this.e;
    }

    public abstract int size();

    public abstract ej1 t(int i2, int i3);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), B()});
    }

    public final byte[] u() {
        int size = size();
        if (size == 0) {
            return xj1.b;
        }
        byte[] bArr = new byte[size];
        j(bArr, 0, 0, size);
        return bArr;
    }

    public final String y(Charset charset) {
        return size() == 0 ? "" : z(charset);
    }

    /* access modifiers changed from: protected */
    public abstract String z(Charset charset);
}
