package defpackage;

import java.io.OutputStream;

/* renamed from: vd  reason: default package */
public final class vd extends OutputStream {
    private final OutputStream e;
    private byte[] f;
    private of g;
    private int h;

    public vd(OutputStream outputStream, of ofVar) {
        this(outputStream, ofVar, 65536);
    }

    vd(OutputStream outputStream, of ofVar, int i) {
        this.e = outputStream;
        this.g = ofVar;
        this.f = (byte[]) ofVar.e(i, byte[].class);
    }

    private void a() {
        int i = this.h;
        if (i > 0) {
            this.e.write(this.f, 0, i);
            this.h = 0;
        }
    }

    private void b() {
        if (this.h == this.f.length) {
            a();
        }
    }

    private void h() {
        byte[] bArr = this.f;
        if (bArr != null) {
            this.g.d(bArr);
            this.f = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.e.close();
            h();
        } catch (Throwable th) {
            this.e.close();
            throw th;
        }
    }

    public void flush() {
        a();
        this.e.flush();
    }

    public void write(int i) {
        byte[] bArr = this.f;
        int i2 = this.h;
        this.h = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.h != 0 || i4 < this.f.length) {
                int min = Math.min(i4, this.f.length - this.h);
                System.arraycopy(bArr, i5, this.f, this.h, min);
                this.h += min;
                i3 += min;
                b();
            } else {
                this.e.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
