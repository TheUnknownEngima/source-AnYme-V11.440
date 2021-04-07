package defpackage;

import java.util.ArrayList;

/* renamed from: dh2  reason: default package */
public abstract class dh2<T> {
    private final sg2<T> a;

    public dh2(sg2<T> sg2) {
        v62.f(sg2, "beanDefinition");
        this.a = sg2;
    }

    public abstract void a();

    public <T> T b(fh2 fh2) {
        v62.f(fh2, "context");
        if (ng2.c.b().d(jh2.DEBUG)) {
            ng2.c.b().a("| create instance for " + this.a);
        }
        try {
            mh2 b = fh2.b();
            d62<sh2, mh2, T> c = this.a.c();
            sh2 c2 = fh2.c();
            if (c2 != null) {
                return c.G(c2, b);
            }
            throw new IllegalStateException("Can't execute definition instance while this context is not registered against any Koin instance".toString());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.toString());
            sb.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            v62.b(stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                v62.b(stackTraceElement, "it");
                String className = stackTraceElement.getClassName();
                v62.b(className, "it.className");
                if (!(!g92.v(className, "sun.reflect", false, 2, (Object) null))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb.append(n32.G(arrayList, "\n\t", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (z52) null, 62, (Object) null));
            String sb2 = sb.toString();
            ng2.c.b().b("Instance creation error : could not create instance for " + this.a + ": " + sb2);
            throw new zg2("Could not create instance for " + this.a, e);
        }
    }

    public abstract <T> T c(fh2 fh2);

    public final sg2<T> d() {
        return this.a;
    }

    public abstract void e(fh2 fh2);
}
