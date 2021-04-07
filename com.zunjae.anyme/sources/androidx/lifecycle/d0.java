package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class d0 {
    private final HashMap<String, a0> a = new HashMap<>();

    public final void a() {
        for (a0 a2 : this.a.values()) {
            a2.a();
        }
        this.a.clear();
    }

    /* access modifiers changed from: package-private */
    public final a0 b(String str) {
        return this.a.get(str);
    }

    /* access modifiers changed from: package-private */
    public Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    /* access modifiers changed from: package-private */
    public final void d(String str, a0 a0Var) {
        a0 put = this.a.put(str, a0Var);
        if (put != null) {
            put.d();
        }
    }
}
