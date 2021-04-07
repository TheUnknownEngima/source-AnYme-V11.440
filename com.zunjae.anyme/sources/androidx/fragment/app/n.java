package androidx.fragment.app;

import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class n extends a0 {
    private static final c0.a i = new a();
    private final HashMap<String, Fragment> c = new HashMap<>();
    private final HashMap<String, n> d = new HashMap<>();
    private final HashMap<String, d0> e = new HashMap<>();
    private final boolean f;
    private boolean g = false;
    private boolean h = false;

    static class a implements c0.a {
        a() {
        }

        public <T extends a0> T a(Class<T> cls) {
            return new n(true);
        }
    }

    n(boolean z) {
        this.f = z;
    }

    static n j(d0 d0Var) {
        return (n) new c0(d0Var, i).a(n.class);
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (k.s0(3)) {
            "onCleared called for " + this;
        }
        this.g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.c.equals(nVar.c) && this.d.equals(nVar.d) && this.e.equals(nVar.e);
    }

    /* access modifiers changed from: package-private */
    public boolean f(Fragment fragment) {
        if (this.c.containsKey(fragment.i)) {
            return false;
        }
        this.c.put(fragment.i, fragment);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment) {
        if (k.s0(3)) {
            "Clearing non-config state for " + fragment;
        }
        n nVar = this.d.get(fragment.i);
        if (nVar != null) {
            nVar.d();
            this.d.remove(fragment.i);
        }
        d0 d0Var = this.e.get(fragment.i);
        if (d0Var != null) {
            d0Var.a();
            this.e.remove(fragment.i);
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment h(String str) {
        return this.c.get(str);
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    /* access modifiers changed from: package-private */
    public n i(Fragment fragment) {
        n nVar = this.d.get(fragment.i);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this.f);
        this.d.put(fragment.i, nVar2);
        return nVar2;
    }

    /* access modifiers changed from: package-private */
    public Collection<Fragment> k() {
        return this.c.values();
    }

    /* access modifiers changed from: package-private */
    public d0 l(Fragment fragment) {
        d0 d0Var = this.e.get(fragment.i);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0();
        this.e.put(fragment.i, d0Var2);
        return d0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public boolean n(Fragment fragment) {
        return this.c.remove(fragment.i) != null;
    }

    /* access modifiers changed from: package-private */
    public boolean o(Fragment fragment) {
        if (!this.c.containsKey(fragment.i)) {
            return true;
        }
        return this.f ? this.g : !this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
