package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: dm  reason: default package */
public class dm extends InputStream {
    private static final Queue<dm> g = km.f(0);
    private InputStream e;
    private IOException f;

    dm() {
    }

    public static dm b(InputStream inputStream) {
        dm poll;
        synchronized (g) {
            poll = g.poll();
        }
        if (poll == null) {
            poll = new dm();
        }
        poll.i(inputStream);
        return poll;
    }

    public IOException a() {
        return this.f;
    }

    public int available() {
        return this.e.available();
    }

    public void close() {
        this.e.close();
    }

    public void h() {
        this.f = null;
        this.e = null;
        synchronized (g) {
            g.offer(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(InputStream inputStream) {
        this.e = inputStream;
    }

    public void mark(int i) {
        this.e.mark(i);
    }

    public boolean markSupported() {
        return this.e.markSupported();
    }

    public int read() {
        try {
            return this.e.read();
        } catch (IOException e2) {
            this.f = e2;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.e.read(bArr);
        } catch (IOException e2) {
            this.f = e2;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.e.read(bArr, i, i2);
        } catch (IOException e2) {
            this.f = e2;
            return -1;
        }
    }

    public synchronized void reset() {
        this.e.reset();
    }

    public long skip(long j) {
        try {
            return this.e.skip(j);
        } catch (IOException e2) {
            this.f = e2;
            return 0;
        }
    }
}
