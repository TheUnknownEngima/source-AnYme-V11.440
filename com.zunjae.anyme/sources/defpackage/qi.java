package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: qi  reason: default package */
public class qi extends FilterInputStream {
    private volatile byte[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private final of j;

    /* renamed from: qi$a */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    public qi(InputStream inputStream, of ofVar) {
        this(inputStream, ofVar, 65536);
    }

    qi(InputStream inputStream, of ofVar, int i2) {
        super(inputStream);
        this.h = -1;
        this.j = ofVar;
        this.e = (byte[]) ofVar.e(i2, byte[].class);
    }

    private int a(InputStream inputStream, byte[] bArr) {
        int i2;
        int i3 = this.h;
        if (i3 == -1 || this.i - i3 >= (i2 = this.g)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.h = -1;
                this.i = 0;
                this.f = read;
            }
            return read;
        }
        if (i3 == 0 && i2 > bArr.length && this.f == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i2) {
                i2 = length;
            }
            byte[] bArr2 = (byte[]) this.j.e(i2, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.e = bArr2;
            this.j.d(bArr);
            bArr = bArr2;
        } else {
            int i4 = this.h;
            if (i4 > 0) {
                System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
            }
        }
        int i5 = this.i - this.h;
        this.i = i5;
        this.h = 0;
        this.f = 0;
        int read2 = inputStream.read(bArr, i5, bArr.length - i5);
        int i6 = this.i;
        if (read2 > 0) {
            i6 += read2;
        }
        this.f = i6;
        return read2;
    }

    private static IOException i() {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.e == null || inputStream == null) {
            i();
            throw null;
        }
        return (this.f - this.i) + inputStream.available();
    }

    public synchronized void b() {
        this.g = this.e.length;
    }

    public void close() {
        if (this.e != null) {
            this.j.d(this.e);
            this.e = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void h() {
        if (this.e != null) {
            this.j.d(this.e);
            this.e = null;
        }
    }

    public synchronized void mark(int i2) {
        this.g = Math.max(this.g, i2);
        this.h = this.i;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.e     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.i     // Catch:{ all -> 0x003f }
            int r4 = r6.f     // Catch:{ all -> 0x003f }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.a(r1, r0)     // Catch:{ all -> 0x003f }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.e     // Catch:{ all -> 0x003f }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.e     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            i()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0026:
            int r1 = r6.f     // Catch:{ all -> 0x003f }
            int r2 = r6.i     // Catch:{ all -> 0x003f }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r6.i     // Catch:{ all -> 0x003f }
            int r2 = r1 + 1
            r6.i = r2     // Catch:{ all -> 0x003f }
            byte r0 = r0[r1]     // Catch:{ all -> 0x003f }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            i()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.e     // Catch:{ all -> 0x009c }
            r1 = 0
            if (r0 == 0) goto L_0x0098
            if (r9 != 0) goto L_0x000b
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x009c }
            if (r2 == 0) goto L_0x0094
            int r3 = r6.i     // Catch:{ all -> 0x009c }
            int r4 = r6.f     // Catch:{ all -> 0x009c }
            if (r3 >= r4) goto L_0x003c
            int r3 = r6.f     // Catch:{ all -> 0x009c }
            int r4 = r6.i     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
            if (r3 < r9) goto L_0x001e
            r3 = r9
            goto L_0x0023
        L_0x001e:
            int r3 = r6.f     // Catch:{ all -> 0x009c }
            int r4 = r6.i     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
        L_0x0023:
            int r4 = r6.i     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x009c }
            int r4 = r6.i     // Catch:{ all -> 0x009c }
            int r4 = r4 + r3
            r6.i = r4     // Catch:{ all -> 0x009c }
            if (r3 == r9) goto L_0x003a
            int r4 = r2.available()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r8 = r8 + r3
            int r3 = r9 - r3
            goto L_0x003d
        L_0x003a:
            monitor-exit(r6)
            return r3
        L_0x003c:
            r3 = r9
        L_0x003d:
            int r4 = r6.h     // Catch:{ all -> 0x009c }
            r5 = -1
            if (r4 != r5) goto L_0x0052
            int r4 = r0.length     // Catch:{ all -> 0x009c }
            if (r3 < r4) goto L_0x0052
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x0084
            if (r3 != r9) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            int r5 = r9 - r3
        L_0x0050:
            monitor-exit(r6)
            return r5
        L_0x0052:
            int r4 = r6.a(r2, r0)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x005f
            if (r3 != r9) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            int r5 = r9 - r3
        L_0x005d:
            monitor-exit(r6)
            return r5
        L_0x005f:
            byte[] r4 = r6.e     // Catch:{ all -> 0x009c }
            if (r0 == r4) goto L_0x006c
            byte[] r0 = r6.e     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            i()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x006c:
            int r4 = r6.f     // Catch:{ all -> 0x009c }
            int r5 = r6.i     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0075
            r4 = r3
            goto L_0x007a
        L_0x0075:
            int r4 = r6.f     // Catch:{ all -> 0x009c }
            int r5 = r6.i     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
        L_0x007a:
            int r5 = r6.i     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x009c }
            int r5 = r6.i     // Catch:{ all -> 0x009c }
            int r5 = r5 + r4
            r6.i = r5     // Catch:{ all -> 0x009c }
        L_0x0084:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0089
            monitor-exit(r6)
            return r9
        L_0x0089:
            int r5 = r2.available()     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0092
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0092:
            int r8 = r8 + r4
            goto L_0x003d
        L_0x0094:
            i()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x0098:
            i()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x009c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qi.read(byte[], int, int):int");
    }

    public synchronized void reset() {
        if (this.e == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.h) {
            this.i = this.h;
        } else {
            throw new a("Mark has been invalidated, pos: " + this.i + " markLimit: " + this.g);
        }
    }

    public synchronized long skip(long j2) {
        if (j2 < 1) {
            return 0;
        }
        byte[] bArr = this.e;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                i();
                throw null;
            } else if (((long) (this.f - this.i)) >= j2) {
                this.i = (int) (((long) this.i) + j2);
                return j2;
            } else {
                long j3 = ((long) this.f) - ((long) this.i);
                this.i = this.f;
                if (this.h == -1 || j2 > ((long) this.g)) {
                    return j3 + inputStream.skip(j2 - j3);
                } else if (a(inputStream, bArr) == -1) {
                    return j3;
                } else {
                    if (((long) (this.f - this.i)) >= j2 - j3) {
                        this.i = (int) ((((long) this.i) + j2) - j3);
                        return j2;
                    }
                    long j4 = (j3 + ((long) this.f)) - ((long) this.i);
                    this.i = this.f;
                    return j4;
                }
            }
        } else {
            i();
            throw null;
        }
    }
}
