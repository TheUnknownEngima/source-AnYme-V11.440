package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gh2  reason: default package */
public final class gh2<T> extends dh2<T> {
    private final Map<String, T> b = new ConcurrentHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gh2(sg2<T> sg2) {
        super(sg2);
        v62.f(sg2, "beanDefinition");
    }

    private final void f(sg2<?> sg2, sh2 sh2) {
        uh2 h = sh2.h();
        oh2 b2 = h != null ? h.b() : null;
        oh2 k = sg2.k();
        if (!(!v62.a(k, b2))) {
            return;
        }
        if (b2 == null) {
            throw new xg2("Can't use definition " + sg2 + " defined for scope '" + k + "', with an open scope instance " + sh2 + ". Use a scope instance with scope '" + k + '\'');
        } else if (k != null) {
            throw new xg2("Can't use definition " + sg2 + " defined for scope '" + k + "' with scope instance " + sh2 + ". Use a scope instance with scope '" + k + "'.");
        }
    }

    public void a() {
        z52 e = d().e();
        if (e != null) {
            u22 u22 = (u22) e.r(null);
        }
        this.b.clear();
    }

    public <T> T c(fh2 fh2) {
        v62.f(fh2, "context");
        if (fh2.a() == null) {
            throw new IllegalStateException("ScopeDefinitionInstance has no registered Koin instance".toString());
        } else if (!v62.a(fh2.c(), fh2.a().c())) {
            sh2 c = fh2.c();
            if (c != null) {
                f(d(), c);
                String g = c.g();
                T t = this.b.get(g);
                if (t == null) {
                    t = b(fh2);
                    Map<String, T> map = this.b;
                    if (t != null) {
                        map.put(g, t);
                    } else {
                        throw new IllegalStateException(("Instance creation from " + d() + " should not be null").toString());
                    }
                }
                return t;
            }
            throw new IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
        } else {
            throw new ch2("No scope instance created to resolve " + d());
        }
    }

    public void e(fh2 fh2) {
        v62.f(fh2, "context");
        sh2 c = fh2.c();
        if (c != null) {
            if (ng2.c.b().d(jh2.DEBUG)) {
                kh2 b2 = ng2.c.b();
                b2.a("releasing '" + c + "' ~ " + d() + ' ');
            }
            z52 f = d().f();
            if (f != null) {
                u22 u22 = (u22) f.r(this.b.get(c.g()));
            }
            this.b.remove(c.g());
            return;
        }
        throw new IllegalStateException("ScopeDefinitionInstance has no scope in context".toString());
    }
}
