package defpackage;

import com.afollestad.recyclical.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: m9  reason: default package */
public final class m9 {
    private final Map<Integer, Integer> a = new LinkedHashMap();
    private Map<Integer, a<?, ?>> b = new LinkedHashMap();
    private Map<String, Integer> c = new LinkedHashMap();

    public final a<?, ?> a(String str) {
        v62.f(str, "name");
        Integer num = this.c.get(str);
        if (num != null) {
            return b(num.intValue());
        }
        throw new IllegalStateException(("Didn't find item type for class " + str).toString());
    }

    public final a<?, ?> b(int i) {
        a<?, ?> aVar = this.b.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Didn't find any definitions for type " + i).toString());
    }

    public final boolean c() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Collection<a<?, ?>> values = this.b.values();
        boolean z5 = values instanceof Collection;
        boolean z6 = true;
        if (!z5 || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a aVar = (a) it.next();
                if (!(aVar instanceof n9)) {
                    aVar = null;
                }
                n9 n9Var = (n9) aVar;
                if ((n9Var != null ? n9Var.i() : null) != null) {
                    z4 = true;
                    continue;
                } else {
                    z4 = false;
                    continue;
                }
                if (z4) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z5 || !values.isEmpty()) {
            Iterator<T> it2 = values.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                a aVar2 = (a) it2.next();
                if (!(aVar2 instanceof n9)) {
                    aVar2 = null;
                }
                n9 n9Var2 = (n9) aVar2;
                if ((n9Var2 != null ? n9Var2.i() : null) != null) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (!z3) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        if (z && !z2) {
            z6 = false;
        }
        if (z6) {
            return z;
        }
        throw new IllegalArgumentException("If you specify that one item type has stable IDs, all item types must.".toString());
    }

    public final int d(int i) {
        Integer num = this.a.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("Didn't find layout for type " + i).toString());
    }

    public final void e(int i, a<?, ?> aVar) {
        v62.f(aVar, "definition");
        String j = l9.d(aVar).j();
        Integer num = (Integer) n32.K(this.a.keySet());
        int intValue = (num != null ? num.intValue() : 0) + 1;
        this.a.put(Integer.valueOf(intValue), Integer.valueOf(i));
        this.c.put(j, Integer.valueOf(intValue));
        this.b.put(Integer.valueOf(intValue), aVar);
    }

    public final int f(String str) {
        v62.f(str, "name");
        Integer num = this.c.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(("Didn't find item type for class " + str).toString());
    }

    public final m9 g() {
        boolean z = true;
        if (!this.b.isEmpty()) {
            if (this.a.size() == this.c.size()) {
                if (this.b.size() != this.c.size()) {
                    z = false;
                }
                if (z) {
                    return this;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("No bindings defined.".toString());
    }
}
