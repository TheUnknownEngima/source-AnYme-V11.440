package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: a9  reason: default package */
public interface a9<IT> {

    /* renamed from: a9$a */
    public static final class a {
        public static /* synthetic */ void a(a9 a9Var, List list, d62 d62, d62 d622, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    d62 = null;
                }
                if ((i & 4) != 0) {
                    d622 = null;
                }
                a9Var.d(list, d62, d622);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: set");
        }
    }

    void a();

    void addAll(Collection<? extends IT> collection);

    void b(f9 f9Var);

    void c(int i);

    void clear();

    void d(List<? extends IT> list, d62<? super IT, ? super IT, Boolean> d62, d62<? super IT, ? super IT, Boolean> d622);

    List<IT> e();

    void f();

    void g(int i, IT it);

    IT get(int i);

    boolean isEmpty();

    int size();
}
