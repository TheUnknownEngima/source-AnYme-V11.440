package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: tr1  reason: default package */
public final class tr1 {
    private ArrayList<String> a = nv1.a.b();

    public final boolean a(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        Iterator<String> it = this.a.iterator();
        while (it.hasNext()) {
            String next = it.next();
            v62.d(next, "reason");
            if (next != null) {
                String lowerCase2 = next.toLowerCase();
                v62.d(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (g92.v(lowerCase, lowerCase2, false, 2, (Object) null)) {
                    uj2.f("[isAdvertisement] Blocked " + lowerCase + " >> reason:" + next, new Object[0]);
                    return true;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        "[isAdvertisement] Not blocked " + lowerCase;
        uj2.h(vw1.AdBlocker.getValue());
        uj2.a(str, new Object[0]);
        return false;
    }

    public final void b() {
        this.a = nv1.a.b();
        uj2.f("Size of AdBlock list = " + this.a.size() + ')', new Object[0]);
    }
}
