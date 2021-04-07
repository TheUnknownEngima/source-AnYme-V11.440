package defpackage;

import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ah;
import defpackage.wd;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: qg  reason: default package */
public class qg implements ah<File, ByteBuffer> {

    /* renamed from: qg$a */
    private static final class a implements wd<ByteBuffer> {
        private final File e;

        a(File file) {
            this.e = file;
        }

        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void e(g gVar, wd.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(am.a(this.e));
            } catch (IOException e2) {
                boolean isLoggable = Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.c(e2);
            }
        }
    }

    /* renamed from: qg$b */
    public static class b implements bh<File, ByteBuffer> {
        public ah<File, ByteBuffer> b(eh ehVar) {
            return new qg();
        }
    }

    /* renamed from: c */
    public ah.a<ByteBuffer> b(File file, int i, int i2, i iVar) {
        return new ah.a<>(new zl(file), new a(file));
    }

    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
