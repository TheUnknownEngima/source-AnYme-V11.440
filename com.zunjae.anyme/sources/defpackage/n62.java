package defpackage;

import java.io.Serializable;

/* renamed from: n62  reason: default package */
public abstract class n62 implements x72, Serializable {
    public static final Object k = a.e;
    private transient x72 e;
    protected final Object f;
    private final Class g;
    private final String h;
    private final String i;
    private final boolean j;

    /* renamed from: n62$a */
    private static class a implements Serializable {
        /* access modifiers changed from: private */
        public static final a e = new a();

        private a() {
        }
    }

    public n62() {
        this(k);
    }

    protected n62(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected n62(Object obj, Class cls, String str, String str2, boolean z) {
        this.f = obj;
        this.g = cls;
        this.h = str;
        this.i = str2;
        this.j = z;
    }

    public String a() {
        return this.h;
    }

    public Object b(Object... objArr) {
        return g().b(objArr);
    }

    public x72 c() {
        x72 x72 = this.e;
        if (x72 != null) {
            return x72;
        }
        x72 d = d();
        this.e = d;
        return d;
    }

    /* access modifiers changed from: protected */
    public abstract x72 d();

    public Object e() {
        return this.f;
    }

    public z72 f() {
        Class cls = this.g;
        if (cls == null) {
            return null;
        }
        return this.j ? f72.c(cls) : f72.b(cls);
    }

    /* access modifiers changed from: protected */
    public x72 g() {
        x72 c = c();
        if (c != this) {
            return c;
        }
        throw new n52();
    }

    public String h() {
        return this.i;
    }
}
