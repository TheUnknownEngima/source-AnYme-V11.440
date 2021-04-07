package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class v extends a {
    private final Set<Class<?>> a;
    private final Set<Class<?>> b;
    private final Set<Class<?>> c;
    private final Set<Class<?>> d;
    private final Set<Class<?>> e;
    private final e f;

    private static class a implements qh1 {
        public a(Set<Class<?>> set, qh1 qh1) {
        }
    }

    v(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (n next : dVar.c()) {
            if (next.b()) {
                boolean d2 = next.d();
                Class<?> a2 = next.a();
                if (d2) {
                    hashSet3.add(a2);
                } else {
                    hashSet.add(a2);
                }
            } else {
                boolean d3 = next.d();
                Class<?> a3 = next.a();
                if (d3) {
                    hashSet4.add(a3);
                } else {
                    hashSet2.add(a3);
                }
            }
        }
        if (!dVar.f().isEmpty()) {
            hashSet.add(qh1.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = dVar.f();
        this.f = eVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.a.contains(cls)) {
            T a2 = this.f.a(cls);
            return !cls.equals(qh1.class) ? a2 : new a(this.e, (qh1) a2);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> xh1<T> b(Class<T> cls) {
        if (this.b.contains(cls)) {
            return this.f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> xh1<Set<T>> c(Class<T> cls) {
        if (this.d.contains(cls)) {
            return this.f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public <T> Set<T> d(Class<T> cls) {
        if (this.c.contains(cls)) {
            return this.f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
