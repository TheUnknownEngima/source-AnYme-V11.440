package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class g {
    public static final g c = new g(new Bundle(), (List<String>) null);
    private final Bundle a;
    List<String> b;

    public static final class a {
        private ArrayList<String> a;

        public a() {
        }

        public a(g gVar) {
            if (gVar != null) {
                gVar.c();
                if (!gVar.b.isEmpty()) {
                    this.a = new ArrayList<>(gVar.b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public a a(Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String b : collection) {
                        b(b);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("categories must not be null");
        }

        public a b(String str) {
            if (str != null) {
                if (this.a == null) {
                    this.a = new ArrayList<>();
                }
                if (!this.a.contains(str)) {
                    this.a.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        public a c(g gVar) {
            if (gVar != null) {
                a(gVar.e());
                return this;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public g d() {
            if (this.a == null) {
                return g.c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.a);
            return new g(bundle, this.a);
        }
    }

    g(Bundle bundle, List<String> list) {
        this.a = bundle;
        this.b = list;
    }

    public static g d(Bundle bundle) {
        if (bundle != null) {
            return new g(bundle, (List<String>) null);
        }
        return null;
    }

    public Bundle a() {
        return this.a;
    }

    public boolean b(g gVar) {
        if (gVar == null) {
            return false;
        }
        c();
        gVar.c();
        return this.b.containsAll(gVar.b);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public List<String> e() {
        c();
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        c();
        gVar.c();
        return this.b.equals(gVar.b);
    }

    public boolean f() {
        c();
        return this.b.isEmpty();
    }

    public boolean g() {
        c();
        return !this.b.contains((Object) null);
    }

    public boolean h(List<IntentFilter> list) {
        if (list != null) {
            c();
            int size = this.b.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory(this.b.get(i2))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        c();
        return this.b.hashCode();
    }

    public String toString() {
        return "MediaRouteSelector{ " + "controlCategories=" + Arrays.toString(e().toArray()) + " }";
    }
}
