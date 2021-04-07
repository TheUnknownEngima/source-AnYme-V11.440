package defpackage;

import com.google.firebase.components.d;
import com.google.firebase.components.e;
import com.google.firebase.components.n;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ki1  reason: default package */
public class ki1 implements pi1 {
    private final String a;
    private final li1 b;

    ki1(Set<ni1> set, li1 li1) {
        this.a = d(set);
        this.b = li1;
    }

    public static d<pi1> b() {
        d.b<pi1> a2 = d.a(pi1.class);
        a2.b(n.g(ni1.class));
        a2.f(ji1.b());
        return a2.d();
    }

    static /* synthetic */ pi1 c(e eVar) {
        return new ki1(eVar.d(ni1.class), li1.a());
    }

    private static String d(Set<ni1> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<ni1> it = set.iterator();
        while (it.hasNext()) {
            ni1 next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.b.b());
    }
}
