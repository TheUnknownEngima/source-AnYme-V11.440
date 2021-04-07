package com.google.firebase.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class l extends a {
    private static final xh1<Set<Object>> e = k.a();
    private final Map<d<?>, s<?>> a = new HashMap();
    private final Map<Class<?>, s<?>> b = new HashMap();
    private final Map<Class<?>, s<Set<?>>> c = new HashMap();
    private final r d;

    public l(Executor executor, Iterable<h> iterable, d<?>... dVarArr) {
        this.d = new r(executor);
        ArrayList<d> arrayList = new ArrayList<>();
        arrayList.add(d.n(this.d, r.class, rh1.class, qh1.class));
        for (h components : iterable) {
            arrayList.addAll(components.getComponents());
        }
        for (d<?> dVar : dVarArr) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        m.a(arrayList);
        for (d dVar2 : arrayList) {
            this.a.put(dVar2, new s(i.a(this, dVar2)));
        }
        h();
        i();
    }

    static /* synthetic */ Set g(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((s) it.next()).get());
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private void h() {
        for (Map.Entry next : this.a.entrySet()) {
            d dVar = (d) next.getKey();
            if (dVar.k()) {
                s sVar = (s) next.getValue();
                for (Class put : dVar.e()) {
                    this.b.put(put, sVar);
                }
            }
        }
        j();
    }

    private void i() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.a.entrySet()) {
            d dVar = (d) next.getKey();
            if (!dVar.k()) {
                s sVar = (s) next.getValue();
                for (Class cls : dVar.e()) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(sVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            this.c.put((Class) entry.getKey(), new s(j.a((Set) entry.getValue())));
        }
    }

    private void j() {
        for (d next : this.a.keySet()) {
            Iterator<n> it = next.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    n next2 = it.next();
                    if (next2.c() && !this.b.containsKey(next2.a())) {
                        throw new t(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.a()}));
                    }
                }
            }
        }
    }

    public <T> xh1<T> b(Class<T> cls) {
        u.c(cls, "Null interface requested.");
        return this.b.get(cls);
    }

    public <T> xh1<Set<T>> c(Class<T> cls) {
        s sVar = this.c.get(cls);
        return sVar != null ? sVar : e;
    }

    public void e(boolean z) {
        for (Map.Entry next : this.a.entrySet()) {
            d dVar = (d) next.getKey();
            s sVar = (s) next.getValue();
            if (dVar.i() || (dVar.j() && z)) {
                sVar.get();
            }
        }
        this.d.c();
    }
}
