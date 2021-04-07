package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: li1  reason: default package */
public class li1 {
    private static volatile li1 b;
    private final Set<ni1> a = new HashSet();

    li1() {
    }

    public static li1 a() {
        li1 li1 = b;
        if (li1 == null) {
            synchronized (li1.class) {
                li1 = b;
                if (li1 == null) {
                    li1 = new li1();
                    b = li1;
                }
            }
        }
        return li1;
    }

    /* access modifiers changed from: package-private */
    public Set<ni1> b() {
        Set<ni1> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }
}
