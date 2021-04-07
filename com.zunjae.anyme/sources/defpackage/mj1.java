package defpackage;

import defpackage.vj1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: mj1  reason: default package */
public class mj1 {
    private static boolean b = true;
    private static volatile mj1 c;
    static final mj1 d = new mj1(true);
    private final Map<a, vj1.e<?, ?>> a;

    /* renamed from: mj1$a */
    private static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    mj1() {
        this.a = new HashMap();
    }

    mj1(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static mj1 b() {
        mj1 mj1 = c;
        if (mj1 == null) {
            synchronized (mj1.class) {
                mj1 = c;
                if (mj1 == null) {
                    mj1 = b ? lj1.a() : d;
                    c = mj1;
                }
            }
        }
        return mj1;
    }

    public <ContainingType extends ok1> vj1.e<ContainingType, ?> a(ContainingType containingtype, int i) {
        return this.a.get(new a(containingtype, i));
    }
}
