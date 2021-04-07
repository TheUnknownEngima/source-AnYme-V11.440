package defpackage;

import com.bumptech.glide.load.g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ff  reason: default package */
final class ff {
    private final Map<g, ye<?>> a = new HashMap();
    private final Map<g, ye<?>> b = new HashMap();

    ff() {
    }

    private Map<g, ye<?>> b(boolean z) {
        return z ? this.b : this.a;
    }

    /* access modifiers changed from: package-private */
    public ye<?> a(g gVar, boolean z) {
        return b(z).get(gVar);
    }

    /* access modifiers changed from: package-private */
    public void c(g gVar, ye<?> yeVar) {
        b(yeVar.p()).put(gVar, yeVar);
    }

    /* access modifiers changed from: package-private */
    public void d(g gVar, ye<?> yeVar) {
        Map<g, ye<?>> b2 = b(yeVar.p());
        if (yeVar.equals(b2.get(gVar))) {
            b2.remove(gVar);
        }
    }
}
