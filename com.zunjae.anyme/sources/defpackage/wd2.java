package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* renamed from: wd2  reason: default package */
public final class wd2 {
    static final Logger a = Logger.getLogger(wd2.class.getName());

    /* renamed from: wd2$a */
    class a implements ce2 {
        final /* synthetic */ ee2 e;
        final /* synthetic */ OutputStream f;

        a(ee2 ee2, OutputStream outputStream) {
            this.e = ee2;
            this.f = outputStream;
        }

        public void X(nd2 nd2, long j) {
            fe2.b(nd2.f, 0, j);
            while (j > 0) {
                this.e.f();
                zd2 zd2 = nd2.e;
                int min = (int) Math.min(j, (long) (zd2.c - zd2.b));
                this.f.write(zd2.a, zd2.b, min);
                int i = zd2.b + min;
                zd2.b = i;
                long j2 = (long) min;
                j -= j2;
                nd2.f -= j2;
                if (i == zd2.c) {
                    nd2.e = zd2.b();
                    ae2.a(zd2);
                }
            }
        }

        public ee2 c() {
            return this.e;
        }

        public void close() {
            this.f.close();
        }

        public void flush() {
            this.f.flush();
        }

        public String toString() {
            return "sink(" + this.f + ")";
        }
    }

    /* renamed from: wd2$b */
    class b implements de2 {
        final /* synthetic */ ee2 e;
        final /* synthetic */ InputStream f;

        b(ee2 ee2, InputStream inputStream) {
            this.e = ee2;
            this.f = inputStream;
        }

        public ee2 c() {
            return this.e;
        }

        public void close() {
            this.f.close();
        }

        public String toString() {
            return "source(" + this.f + ")";
        }

        public long y0(nd2 nd2, long j) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (i == 0) {
                return 0;
            } else {
                try {
                    this.e.f();
                    zd2 u0 = nd2.u0(1);
                    int read = this.f.read(u0.a, u0.c, (int) Math.min(j, (long) (8192 - u0.c)));
                    if (read == -1) {
                        return -1;
                    }
                    u0.c += read;
                    long j2 = (long) read;
                    nd2.f += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (wd2.e(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }
    }

    /* renamed from: wd2$c */
    class c implements ce2 {
        c() {
        }

        public void X(nd2 nd2, long j) {
            nd2.e(j);
        }

        public ee2 c() {
            return ee2.d;
        }

        public void close() {
        }

        public void flush() {
        }
    }

    /* renamed from: wd2$d */
    class d extends ld2 {
        final /* synthetic */ Socket k;

        d(Socket socket) {
            this.k = socket;
        }

        /* access modifiers changed from: protected */
        public IOException o(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void t() {
            /*
                r5 = this;
                java.lang.String r0 = "Failed to close timed out socket "
                java.net.Socket r1 = r5.k     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                r1.close()     // Catch:{ Exception -> 0x001a, AssertionError -> 0x0008 }
                goto L_0x0033
            L_0x0008:
                r1 = move-exception
                boolean r2 = defpackage.wd2.e(r1)
                if (r2 == 0) goto L_0x0019
                java.util.logging.Logger r2 = defpackage.wd2.a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                goto L_0x0024
            L_0x0019:
                throw r1
            L_0x001a:
                r1 = move-exception
                java.util.logging.Logger r2 = defpackage.wd2.a
                java.util.logging.Level r3 = java.util.logging.Level.WARNING
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
            L_0x0024:
                r4.append(r0)
                java.net.Socket r0 = r5.k
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.log(r3, r0, r1)
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.wd2.d.t():void");
        }
    }

    private wd2() {
    }

    public static ce2 a(File file) {
        if (file != null) {
            return g(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static ce2 b() {
        return new c();
    }

    public static od2 c(ce2 ce2) {
        return new xd2(ce2);
    }

    public static pd2 d(de2 de2) {
        return new yd2(de2);
    }

    static boolean e(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static ce2 f(File file) {
        if (file != null) {
            return g(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static ce2 g(OutputStream outputStream) {
        return h(outputStream, new ee2());
    }

    private static ce2 h(OutputStream outputStream, ee2 ee2) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (ee2 != null) {
            return new a(ee2, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static ce2 i(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            ld2 n = n(socket);
            return n.r(h(socket.getOutputStream(), n));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static de2 j(File file) {
        if (file != null) {
            return k(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static de2 k(InputStream inputStream) {
        return l(inputStream, new ee2());
    }

    private static de2 l(InputStream inputStream, ee2 ee2) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (ee2 != null) {
            return new b(ee2, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static de2 m(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            ld2 n = n(socket);
            return n.s(l(socket.getInputStream(), n));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    private static ld2 n(Socket socket) {
        return new d(socket);
    }
}
