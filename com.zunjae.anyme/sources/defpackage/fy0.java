package defpackage;

import defpackage.sy0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fy0  reason: default package */
public class fy0 {
    private static volatile fy0 b;
    private static volatile fy0 c;
    private static final fy0 d = new fy0(true);
    private final Map<a, sy0.f<?, ?>> a;

    /* renamed from: fy0$a */
    static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    fy0() {
        this.a = new HashMap();
    }

    private fy0(boolean z) {
        this.a = Collections.emptyMap();
    }

    public static fy0 a() {
        fy0 fy0 = b;
        if (fy0 == null) {
            synchronized (fy0.class) {
                fy0 = b;
                if (fy0 == null) {
                    fy0 = d;
                    b = fy0;
                }
            }
        }
        return fy0;
    }

    public static fy0 c() {
        Class<fy0> cls = fy0.class;
        fy0 fy0 = c;
        if (fy0 != null) {
            return fy0;
        }
        synchronized (cls) {
            fy0 fy02 = c;
            if (fy02 != null) {
                return fy02;
            }
            fy0 b2 = qy0.b(cls);
            c = b2;
            return b2;
        }
    }

    public final <ContainingType extends f01> sy0.f<ContainingType, ?> b(ContainingType containingtype, int i) {
        return this.a.get(new a(containingtype, i));
    }
}
