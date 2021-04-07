package defpackage;

import java.util.concurrent.Callable;

/* renamed from: uc  reason: default package */
public class uc<T> implements Callable<Boolean> {
    private final ab<String> a;
    private hb<T> b;

    public uc(ab<String> abVar, hb<T> hbVar) {
        this.a = abVar;
        this.b = hbVar;
    }

    /* renamed from: a */
    public Boolean call() {
        boolean d;
        if (this.b.b() instanceof Float) {
            d = this.a.f(this.b.a(), (Float) this.b.b());
        } else if (this.b.b() instanceof Integer) {
            d = this.a.g(this.b.a(), (Integer) this.b.b());
        } else if (this.b.b() instanceof String) {
            d = this.a.b(this.b.a(), (String) this.b.b());
        } else if (!(this.b.b() instanceof Boolean)) {
            return Boolean.FALSE;
        } else {
            d = this.a.d(this.b.a(), (Boolean) this.b.b());
        }
        return Boolean.valueOf(d);
    }
}
