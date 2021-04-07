package defpackage;

import java.util.Iterator;
import org.jsoup.nodes.a;
import org.jsoup.nodes.b;

/* renamed from: pf2  reason: default package */
public class pf2 {
    public static final pf2 c = new pf2(false, false);
    public static final pf2 d = new pf2(true, true);
    private final boolean a;
    private final boolean b;

    public pf2(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* access modifiers changed from: package-private */
    public b a(b bVar) {
        if (!this.b) {
            Iterator<a> it = bVar.iterator();
            while (it.hasNext()) {
                a next = it.next();
                next.j(next.getKey().toLowerCase());
            }
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public String b(String str) {
        String trim = str.trim();
        return !this.a ? trim.toLowerCase() : trim;
    }
}
