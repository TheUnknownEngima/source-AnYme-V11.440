package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: mh1  reason: default package */
public final class mh1 implements ih1<mh1> {
    private static final dh1<Object> e = jh1.b();
    private static final fh1<String> f = kh1.b();
    private static final fh1<Boolean> g = lh1.b();
    private static final b h = new b((a) null);
    /* access modifiers changed from: private */
    public final Map<Class<?>, dh1<?>> a = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, fh1<?>> b = new HashMap();
    /* access modifiers changed from: private */
    public dh1<Object> c = e;
    /* access modifiers changed from: private */
    public boolean d = false;

    /* renamed from: mh1$a */
    class a implements bh1 {
        a() {
        }

        public void a(Object obj, Writer writer) {
            nh1 nh1 = new nh1(writer, mh1.this.a, mh1.this.b, mh1.this.c, mh1.this.d);
            nh1.i(obj, false);
            nh1.r();
        }

        public String b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* renamed from: mh1$b */
    private static final class b implements fh1<Date> {
        private static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: b */
        public void a(Date date, gh1 gh1) {
            gh1.d(a.format(date));
        }
    }

    public mh1() {
        m(String.class, f);
        m(Boolean.class, g);
        m(Date.class, h);
    }

    static /* synthetic */ void i(Object obj, eh1 eh1) {
        throw new ch1("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public /* bridge */ /* synthetic */ ih1 a(Class cls, dh1 dh1) {
        l(cls, dh1);
        return this;
    }

    public bh1 f() {
        return new a();
    }

    public mh1 g(hh1 hh1) {
        hh1.a(this);
        return this;
    }

    public mh1 h(boolean z) {
        this.d = z;
        return this;
    }

    public <T> mh1 l(Class<T> cls, dh1<? super T> dh1) {
        this.a.put(cls, dh1);
        this.b.remove(cls);
        return this;
    }

    public <T> mh1 m(Class<T> cls, fh1<? super T> fh1) {
        this.b.put(cls, fh1);
        this.a.remove(cls);
        return this;
    }
}
