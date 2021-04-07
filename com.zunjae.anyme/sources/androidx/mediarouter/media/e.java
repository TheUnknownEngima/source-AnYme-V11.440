package androidx.mediarouter.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class e {
    Bundle a;
    final List<b> b;
    final boolean c;

    public static final class a {
        private List<b> a;
        private boolean b = false;

        public a() {
        }

        public a(e eVar) {
            if (eVar != null) {
                this.a = eVar.b;
                this.b = eVar.c;
                return;
            }
            throw new IllegalArgumentException("descriptor must not be null");
        }

        public a a(b bVar) {
            if (bVar != null) {
                List<b> list = this.a;
                if (list == null) {
                    this.a = new ArrayList();
                } else if (list.contains(bVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                this.a.add(bVar);
                return this;
            }
            throw new IllegalArgumentException("route must not be null");
        }

        public e b() {
            return new e(this.a, this.b);
        }

        /* access modifiers changed from: package-private */
        public a c(Collection<b> collection) {
            if (collection == null || collection.isEmpty()) {
                this.a = null;
            } else {
                this.a = new ArrayList(collection);
            }
            return this;
        }
    }

    e(List<b> list, boolean z) {
        this.b = list == null ? Collections.emptyList() : list;
        this.c = z;
    }

    public static e b(Bundle bundle) {
        ArrayList arrayList = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(b.e((Bundle) parcelableArrayList.get(i)));
            }
            arrayList = arrayList2;
        }
        return new e(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public Bundle a() {
        Bundle bundle = this.a;
        if (bundle != null) {
            return bundle;
        }
        this.a = new Bundle();
        List<b> list = this.b;
        if (list != null && !list.isEmpty()) {
            int size = this.b.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(this.b.get(i).a());
            }
            this.a.putParcelableArrayList("routes", arrayList);
        }
        this.a.putBoolean("supportsDynamicGroupRoute", this.c);
        return this.a;
    }

    public List<b> c() {
        return this.b;
    }

    public boolean d() {
        int size = c().size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            if (bVar == null || !bVar.z()) {
                return false;
            }
        }
        return true;
    }

    public boolean e() {
        return this.c;
    }

    public String toString() {
        return "MediaRouteProviderDescriptor{ " + "routes=" + Arrays.toString(c().toArray()) + ", isValid=" + d() + " }";
    }
}
