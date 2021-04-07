package defpackage;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ah;
import defpackage.wd;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: sg  reason: default package */
public class sg<Data> implements ah<File, Data> {
    private final d<Data> a;

    /* renamed from: sg$a */
    public static class a<Data> implements bh<File, Data> {
        private final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        public final ah<File, Data> b(eh ehVar) {
            return new sg(this.a);
        }
    }

    /* renamed from: sg$b */
    public static class b extends a<ParcelFileDescriptor> {

        /* renamed from: sg$b$a */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* renamed from: sg$c */
    private static final class c<Data> implements wd<Data> {
        private final File e;
        private final d<Data> f;
        private Data g;

        c(File file, d<Data> dVar) {
            this.e = file;
            this.f = dVar;
        }

        public Class<Data> a() {
            return this.f.a();
        }

        public void b() {
            Data data = this.g;
            if (data != null) {
                try {
                    this.f.b(data);
                } catch (IOException unused) {
                }
            }
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a d() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void e(g gVar, wd.a<? super Data> aVar) {
            try {
                Data c = this.f.c(this.e);
                this.g = c;
                aVar.f(c);
            } catch (FileNotFoundException e2) {
                boolean isLoggable = Log.isLoggable("FileLoader", 3);
                aVar.c(e2);
            }
        }
    }

    /* renamed from: sg$d */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(File file);
    }

    /* renamed from: sg$e */
    public static class e extends a<InputStream> {

        /* renamed from: sg$e$a */
        class a implements d<InputStream> {
            a() {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(File file) {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public sg(d<Data> dVar) {
        this.a = dVar;
    }

    /* renamed from: c */
    public ah.a<Data> b(File file, int i, int i2, i iVar) {
        return new ah.a<>(new zl(file), new c(file, this.a));
    }

    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
