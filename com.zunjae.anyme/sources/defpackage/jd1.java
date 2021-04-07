package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: jd1  reason: default package */
class jd1 implements Closeable {
    private static final Logger k = Logger.getLogger(jd1.class.getName());
    /* access modifiers changed from: private */
    public final RandomAccessFile e;
    int f;
    private int g;
    private b h;
    private b i;
    private final byte[] j = new byte[16];

    /* renamed from: jd1$a */
    class a implements d {
        boolean a = true;
        final /* synthetic */ StringBuilder b;

        a(jd1 jd1, StringBuilder sb) {
            this.b = sb;
        }

        public void a(InputStream inputStream, int i) {
            if (this.a) {
                this.a = false;
            } else {
                this.b.append(", ");
            }
            this.b.append(i);
        }
    }

    /* renamed from: jd1$b */
    static class b {
        static final b c = new b(0, 0);
        final int a;
        final int b;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position = " + this.a + ", length = " + this.b + "]";
        }
    }

    /* renamed from: jd1$c */
    private final class c extends InputStream {
        private int e;
        private int f;

        private c(b bVar) {
            this.e = jd1.this.Q(bVar.a + 4);
            this.f = bVar.b;
        }

        /* synthetic */ c(jd1 jd1, b bVar, a aVar) {
            this(bVar);
        }

        public int read() {
            if (this.f == 0) {
                return -1;
            }
            jd1.this.e.seek((long) this.e);
            int read = jd1.this.e.read();
            this.e = jd1.this.Q(this.e + 1);
            this.f--;
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            Object unused = jd1.B(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            jd1.this.L(this.e, bArr, i, i2);
            this.e = jd1.this.Q(this.e + i2);
            this.f -= i2;
            return i2;
        }
    }

    /* renamed from: jd1$d */
    public interface d {
        void a(InputStream inputStream, int i);
    }

    public jd1(File file) {
        if (!file.exists()) {
            z(file);
        }
        this.e = C(file);
        F();
    }

    /* access modifiers changed from: private */
    public static <T> T B(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile C(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b E(int i2) {
        if (i2 == 0) {
            return b.c;
        }
        this.e.seek((long) i2);
        return new b(i2, this.e.readInt());
    }

    private void F() {
        this.e.seek(0);
        this.e.readFully(this.j);
        int G = G(this.j, 0);
        this.f = G;
        if (((long) G) <= this.e.length()) {
            this.g = G(this.j, 4);
            int G2 = G(this.j, 8);
            int G3 = G(this.j, 12);
            this.h = E(G2);
            this.i = E(G3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f + ", Actual length: " + this.e.length());
    }

    private static int G(byte[] bArr, int i2) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    private int J() {
        return this.f - P();
    }

    /* access modifiers changed from: private */
    public void L(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int Q = Q(i2);
        int i5 = Q + i4;
        int i6 = this.f;
        if (i5 <= i6) {
            this.e.seek((long) Q);
            randomAccessFile = this.e;
        } else {
            int i7 = i6 - Q;
            this.e.seek((long) Q);
            this.e.readFully(bArr, i3, i7);
            this.e.seek(16);
            randomAccessFile = this.e;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.readFully(bArr, i3, i4);
    }

    private void M(int i2, byte[] bArr, int i3, int i4) {
        RandomAccessFile randomAccessFile;
        int Q = Q(i2);
        int i5 = Q + i4;
        int i6 = this.f;
        if (i5 <= i6) {
            this.e.seek((long) Q);
            randomAccessFile = this.e;
        } else {
            int i7 = i6 - Q;
            this.e.seek((long) Q);
            this.e.write(bArr, i3, i7);
            this.e.seek(16);
            randomAccessFile = this.e;
            i3 += i7;
            i4 -= i7;
        }
        randomAccessFile.write(bArr, i3, i4);
    }

    private void N(int i2) {
        this.e.setLength((long) i2);
        this.e.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    public int Q(int i2) {
        int i3 = this.f;
        return i2 < i3 ? i2 : (i2 + 16) - i3;
    }

    private void U(int i2, int i3, int i4, int i5) {
        Y(this.j, i2, i3, i4, i5);
        this.e.seek(0);
        this.e.write(this.j);
    }

    private static void V(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    private static void Y(byte[] bArr, int... iArr) {
        int i2 = 0;
        for (int V : iArr) {
            V(bArr, i2, V);
            i2 += 4;
        }
    }

    private void r(int i2) {
        int i3 = i2 + 4;
        int J = J();
        if (J < i3) {
            int i4 = this.f;
            do {
                J += i4;
                i4 <<= 1;
            } while (J < i3);
            N(i4);
            b bVar = this.i;
            int Q = Q(bVar.a + 4 + bVar.b);
            if (Q < this.h.a) {
                FileChannel channel = this.e.getChannel();
                channel.position((long) this.f);
                long j2 = (long) (Q - 4);
                if (channel.transferTo(16, j2, channel) != j2) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.i.a;
            int i6 = this.h.a;
            if (i5 < i6) {
                int i7 = (this.f + i5) - 16;
                U(i4, this.g, i6, i7);
                this.i = new b(i7, this.i.b);
            } else {
                U(i4, this.g, i6, i5);
            }
            this.f = i4;
        }
    }

    /* JADX INFO: finally extract failed */
    private static void z(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile C = C(file2);
        try {
            C.setLength(4096);
            C.seek(0);
            byte[] bArr = new byte[16];
            Y(bArr, 4096, 0, 0, 0);
            C.write(bArr);
            C.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            C.close();
            throw th;
        }
    }

    public synchronized boolean A() {
        return this.g == 0;
    }

    public synchronized void K() {
        if (A()) {
            throw new NoSuchElementException();
        } else if (this.g == 1) {
            m();
        } else {
            int Q = Q(this.h.a + 4 + this.h.b);
            L(Q, this.j, 0, 4);
            int G = G(this.j, 0);
            U(this.f, this.g - 1, Q, this.i.a);
            this.g--;
            this.h = new b(Q, G);
        }
    }

    public int P() {
        if (this.g == 0) {
            return 16;
        }
        b bVar = this.i;
        int i2 = bVar.a;
        int i3 = this.h.a;
        return i2 >= i3 ? (i2 - i3) + 4 + bVar.b + 16 : (((i2 + 4) + bVar.b) + this.f) - i3;
    }

    public synchronized void close() {
        this.e.close();
    }

    public void k(byte[] bArr) {
        l(bArr, 0, bArr.length);
    }

    public synchronized void l(byte[] bArr, int i2, int i3) {
        B(bArr, "buffer");
        if ((i2 | i3) < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        r(i3);
        boolean A = A();
        b bVar = new b(A ? 16 : Q(this.i.a + 4 + this.i.b), i3);
        V(this.j, 0, i3);
        M(bVar.a, this.j, 0, 4);
        M(bVar.a + 4, bArr, i2, i3);
        U(this.f, this.g + 1, A ? bVar.a : this.h.a, bVar.a);
        this.i = bVar;
        this.g++;
        if (A) {
            this.h = bVar;
        }
    }

    public synchronized void m() {
        U(4096, 0, 0, 0);
        this.g = 0;
        this.h = b.c;
        this.i = b.c;
        if (this.f > 4096) {
            N(4096);
        }
        this.f = 4096;
    }

    public synchronized void t(d dVar) {
        int i2 = this.h.a;
        for (int i3 = 0; i3 < this.g; i3++) {
            b E = E(i2);
            dVar.a(new c(this, E, (a) null), E.b);
            i2 = Q(E.a + 4 + E.b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(jd1.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f);
        sb.append(", size=");
        sb.append(this.g);
        sb.append(", first=");
        sb.append(this.h);
        sb.append(", last=");
        sb.append(this.i);
        sb.append(", element lengths=[");
        try {
            t(new a(this, sb));
        } catch (IOException e2) {
            k.log(Level.WARNING, "read error", e2);
        }
        sb.append("]]");
        return sb.toString();
    }
}
