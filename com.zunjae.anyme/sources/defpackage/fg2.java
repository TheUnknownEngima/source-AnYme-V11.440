package defpackage;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import org.jsoup.nodes.h;

/* renamed from: fg2  reason: default package */
public class fg2 {
    private final bg2 a;
    private final h b;

    /* renamed from: fg2$a */
    public static class a extends IllegalStateException {
        public a(String str, Object... objArr) {
            super(String.format(str, objArr));
        }
    }

    private fg2(bg2 bg2, h hVar) {
        jf2.j(bg2);
        jf2.j(hVar);
        this.a = bg2;
        this.b = hVar;
    }

    private fg2(String str, h hVar) {
        jf2.j(str);
        String trim = str.trim();
        jf2.h(trim);
        jf2.j(hVar);
        this.a = eg2.t(trim);
        this.b = hVar;
    }

    private ag2 a() {
        return yf2.a(this.a, this.b);
    }

    public static ag2 b(String str, Iterable<h> iterable) {
        jf2.h(str);
        jf2.j(iterable);
        bg2 t = eg2.t(str);
        ArrayList arrayList = new ArrayList();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        for (h d : iterable) {
            Iterator it = d(t, d).iterator();
            while (it.hasNext()) {
                h hVar = (h) it.next();
                if (!identityHashMap.containsKey(hVar)) {
                    arrayList.add(hVar);
                    identityHashMap.put(hVar, Boolean.TRUE);
                }
            }
        }
        return new ag2((List<h>) arrayList);
    }

    public static ag2 c(String str, h hVar) {
        return new fg2(str, hVar).a();
    }

    public static ag2 d(bg2 bg2, h hVar) {
        return new fg2(bg2, hVar).a();
    }
}
