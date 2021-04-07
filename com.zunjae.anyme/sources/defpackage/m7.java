package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: m7  reason: default package */
public abstract class m7<T> implements g7<T> {
    private final List<String> a = new ArrayList();
    private T b;
    private v7<T> c;
    private a d;

    /* renamed from: m7$a */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    m7(v7<T> v7Var) {
        this.c = v7Var;
    }

    private void h() {
        if (!this.a.isEmpty() && this.d != null) {
            T t = this.b;
            if (t == null || c(t)) {
                this.d.b(this.a);
            } else {
                this.d.a(this.a);
            }
        }
    }

    public void a(T t) {
        this.b = t;
        h();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b(i8 i8Var);

    /* access modifiers changed from: package-private */
    public abstract boolean c(T t);

    public boolean d(String str) {
        T t = this.b;
        return t != null && c(t) && this.a.contains(str);
    }

    public void e(List<i8> list) {
        this.a.clear();
        for (i8 next : list) {
            if (b(next)) {
                this.a.add(next.a);
            }
        }
        if (this.a.isEmpty()) {
            this.c.c(this);
        } else {
            this.c.a(this);
        }
        h();
    }

    public void f() {
        if (!this.a.isEmpty()) {
            this.a.clear();
            this.c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.d != aVar) {
            this.d = aVar;
            h();
        }
    }
}
