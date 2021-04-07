package defpackage;

import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ah;
import defpackage.wd;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: og  reason: default package */
public class og<Data> implements ah<byte[], Data> {
    private final b<Data> a;

    /* renamed from: og$a */
    public static class a implements bh<byte[], ByteBuffer> {

        /* renamed from: og$a$a  reason: collision with other inner class name */
        class C0133a implements b<ByteBuffer> {
            C0133a(a aVar) {
            }

            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        public ah<byte[], ByteBuffer> b(eh ehVar) {
            return new og(new C0133a(this));
        }
    }

    /* renamed from: og$b */
    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* renamed from: og$c */
    private static class c<Data> implements wd<Data> {
        private final byte[] e;
        private final b<Data> f;

        c(byte[] bArr, b<Data> bVar) {
            this.e = bArr;
            this.f = bVar;
        }

        public Class<Data> a() {
            return this.f.a();
        }

        public void b() {
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void e(g gVar, wd.a<? super Data> aVar) {
            aVar.f(this.f.b(this.e));
        }
    }

    /* renamed from: og$d */
    public static class d implements bh<byte[], InputStream> {

        /* renamed from: og$d$a */
        class a implements b<InputStream> {
            a(d dVar) {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        public ah<byte[], InputStream> b(eh ehVar) {
            return new og(new a(this));
        }
    }

    public og(b<Data> bVar) {
        this.a = bVar;
    }

    /* renamed from: c */
    public ah.a<Data> b(byte[] bArr, int i, int i2, i iVar) {
        return new ah.a<>(new zl(bArr), new c(bArr, this.a));
    }

    /* renamed from: d */
    public boolean a(byte[] bArr) {
        return true;
    }
}
