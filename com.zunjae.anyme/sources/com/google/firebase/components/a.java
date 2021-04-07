package com.google.firebase.components;

import java.util.Set;

abstract class a implements e {
    a() {
    }

    public <T> T a(Class<T> cls) {
        xh1<T> b = b(cls);
        if (b == null) {
            return null;
        }
        return b.get();
    }

    public <T> Set<T> d(Class<T> cls) {
        return c(cls).get();
    }
}
