package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: db2  reason: default package */
public abstract class db2 implements Closeable {
    @Nullable
    private Reader e;

    /* renamed from: db2$a */
    class a extends db2 {
        final /* synthetic */ va2 f;
        final /* synthetic */ long g;
        final /* synthetic */ pd2 h;

        a(va2 va2, long j, pd2 pd2) {
            this.f = va2;
            this.g = j;
            this.h = pd2;
        }

        public long h() {
            return this.g;
        }

        @Nullable
        public va2 i() {
            return this.f;
        }

        public pd2 m() {
            return this.h;
        }
    }

    /* renamed from: db2$b */
    static final class b extends Reader {
        private final pd2 e;
        private final Charset f;
        private boolean g;
        @Nullable
        private Reader h;

        b(pd2 pd2, Charset charset) {
            this.e = pd2;
            this.f = charset;
        }

        public void close() {
            this.g = true;
            Reader reader = this.h;
            if (reader != null) {
                reader.close();
            } else {
                this.e.close();
            }
        }

        public int read(char[] cArr, int i, int i2) {
            if (!this.g) {
                Reader reader = this.h;
                if (reader == null) {
                    InputStreamReader inputStreamReader = new InputStreamReader(this.e.f(), ib2.c(this.e, this.f));
                    this.h = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private Charset b() {
        va2 i = i();
        return i != null ? i.b(ib2.i) : ib2.i;
    }

    public static db2 k(@Nullable va2 va2, long j, pd2 pd2) {
        if (pd2 != null) {
            return new a(va2, j, pd2);
        }
        throw new NullPointerException("source == null");
    }

    public static db2 l(@Nullable va2 va2, byte[] bArr) {
        nd2 nd2 = new nd2();
        nd2.z0(bArr);
        return k(va2, (long) bArr.length, nd2);
    }

    public final Reader a() {
        Reader reader = this.e;
        if (reader != null) {
            return reader;
        }
        b bVar = new b(m(), b());
        this.e = bVar;
        return bVar;
    }

    public void close() {
        ib2.g(m());
    }

    public abstract long h();

    @Nullable
    public abstract va2 i();

    public abstract pd2 m();

    public final String r() {
        pd2 m = m();
        try {
            return m.T(ib2.c(m, b()));
        } finally {
            ib2.g(m);
        }
    }
}
