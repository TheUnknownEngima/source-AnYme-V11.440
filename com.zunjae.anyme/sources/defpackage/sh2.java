package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* renamed from: sh2  reason: default package */
public final class sh2 {
    private final ph2 a = new ph2();
    private uh2 b;
    private final ArrayList<th2> c = new ArrayList<>();
    private final String d;
    private final boolean e;
    private final mg2 f;

    /* renamed from: sh2$a */
    static final class a extends w62 implements o52<T> {
        final /* synthetic */ sh2 f;
        final /* synthetic */ y72 g;
        final /* synthetic */ oh2 h;
        final /* synthetic */ o52 i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(sh2 sh2, y72 y72, oh2 oh2, o52 o52) {
            super(0);
            this.f = sh2;
            this.g = y72;
            this.h = oh2;
            this.i = o52;
        }

        public final T invoke() {
            return this.f.i(this.h, this.g, this.i);
        }
    }

    public sh2(String str, boolean z, mg2 mg2) {
        v62.f(str, "id");
        v62.f(mg2, "_koin");
        this.d = str;
        this.e = z;
        this.f = mg2;
    }

    private final sg2<?> d(oh2 oh2, y72<?> y72) {
        sg2<?> e2 = this.a.e(oh2, y72);
        if (e2 != null) {
            return e2;
        }
        if (!this.e) {
            return this.f.c().d(oh2, y72);
        }
        throw new bh2("No definition found for '" + yh2.a(y72) + "' has been found. Check your module definitions.");
    }

    /* access modifiers changed from: private */
    public final <T> T i(oh2 oh2, y72<?> y72, o52<mh2> o52) {
        return d(oh2, y72).m(new fh2(this.f, this, o52));
    }

    public final void b() {
        synchronized (this) {
            if (ng2.c.b().d(jh2.DEBUG)) {
                kh2 b2 = ng2.c.b();
                b2.c("closing scope:'" + this.d + '\'');
            }
            for (th2 a2 : this.c) {
                a2.a(this);
            }
            this.c.clear();
            uh2 uh2 = this.b;
            if (uh2 != null) {
                uh2.c(this);
            }
            this.a.b();
            this.f.b(this.d);
            u22 u22 = u22.a;
        }
    }

    public final void c() {
        if (this.e) {
            Set<sg2<?>> d2 = this.a.d();
            if (!d2.isEmpty()) {
                for (sg2 m : d2) {
                    m.m(new fh2(this.f, this, (o52) null, 4, (r62) null));
                }
            }
        }
    }

    public final <T> T e(y72<?> y72, oh2 oh2, o52<mh2> o52) {
        v62.f(y72, "clazz");
        synchronized (this) {
            if (ng2.c.b().d(jh2.DEBUG)) {
                kh2 b2 = ng2.c.b();
                b2.a("+- get '" + yh2.a(y72) + '\'');
                l22 a2 = vh2.a(new a(this, y72, oh2, o52));
                T a3 = a2.a();
                double doubleValue = ((Number) a2.b()).doubleValue();
                kh2 b3 = ng2.c.b();
                b3.a("+- got '" + yh2.a(y72) + "' in " + doubleValue + " ms");
                return a3;
            }
            T i = i(oh2, y72, o52);
            return i;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sh2) {
                sh2 sh2 = (sh2) obj;
                if (v62.a(this.d, sh2.d)) {
                    if (!(this.e == sh2.e) || !v62.a(this.f, sh2.f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final ph2 f() {
        return this.a;
    }

    public final String g() {
        return this.d;
    }

    public final uh2 h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.d;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        mg2 mg2 = this.f;
        if (mg2 != null) {
            i = mg2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        uh2 uh2 = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(",set:'");
        sb.append(uh2 != null ? uh2.b() : null);
        sb.append('\'');
        String sb2 = sb.toString();
        return "Scope[id:'" + this.d + '\'' + sb2 + ']';
    }
}
