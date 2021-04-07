package defpackage;

import android.util.Base64;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import defpackage.ah;
import defpackage.wd;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: rg  reason: default package */
public final class rg<Model, Data> implements ah<Model, Data> {
    private final a<Data> a;

    /* renamed from: rg$a */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(String str);
    }

    /* renamed from: rg$b */
    private static final class b<Data> implements wd<Data> {
        private final String e;
        private final a<Data> f;
        private Data g;

        b(String str, a<Data> aVar) {
            this.e = str;
            this.f = aVar;
        }

        public Class<Data> a() {
            return this.f.a();
        }

        public void b() {
            try {
                this.f.b(this.g);
            } catch (IOException unused) {
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
            } catch (IllegalArgumentException e2) {
                aVar.c(e2);
            }
        }
    }

    /* renamed from: rg$c */
    public static final class c<Model> implements bh<Model, InputStream> {
        private final a<InputStream> a = new a(this);

        /* renamed from: rg$c$a */
        class a implements a<InputStream> {
            a(c cVar) {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public ah<Model, InputStream> b(eh ehVar) {
            return new rg(this.a);
        }
    }

    public rg(a<Data> aVar) {
        this.a = aVar;
    }

    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    public ah.a<Data> b(Model model, int i, int i2, i iVar) {
        return new ah.a<>(new zl(model), new b(model.toString(), this.a));
    }
}
