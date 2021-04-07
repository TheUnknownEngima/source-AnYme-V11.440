package defpackage;

/* renamed from: hh2  reason: default package */
public final class hh2<T> extends dh2<T> {
    private T b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hh2(sg2<T> sg2) {
        super(sg2);
        v62.f(sg2, "beanDefinition");
    }

    public void a() {
        z52 e = d().e();
        if (e != null) {
            u22 u22 = (u22) e.r(this.b);
        }
        this.b = null;
    }

    public <T> T c(fh2 fh2) {
        v62.f(fh2, "context");
        if (this.b == null) {
            this.b = b(fh2);
        }
        T t = this.b;
        if (!(t instanceof Object)) {
            t = null;
        }
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Single instance created couldn't return value".toString());
    }

    public void e(fh2 fh2) {
        v62.f(fh2, "context");
    }
}
