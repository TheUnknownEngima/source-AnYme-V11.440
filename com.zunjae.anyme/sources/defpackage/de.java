package defpackage;

import defpackage.xd;
import java.io.InputStream;

/* renamed from: de  reason: default package */
public final class de implements xd<InputStream> {
    private final qi a;

    /* renamed from: de$a */
    public static final class a implements xd.a<InputStream> {
        private final of a;

        public a(of ofVar) {
            this.a = ofVar;
        }

        public Class<InputStream> a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public xd<InputStream> b(InputStream inputStream) {
            return new de(inputStream, this.a);
        }
    }

    public de(InputStream inputStream, of ofVar) {
        qi qiVar = new qi(inputStream, ofVar);
        this.a = qiVar;
        qiVar.mark(5242880);
    }

    public void b() {
        this.a.h();
    }

    public void c() {
        this.a.b();
    }

    /* renamed from: d */
    public InputStream a() {
        this.a.reset();
        return this.a;
    }
}
