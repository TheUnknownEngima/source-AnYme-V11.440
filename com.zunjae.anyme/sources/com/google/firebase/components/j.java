package com.google.firebase.components;

import java.util.Set;

final /* synthetic */ class j implements xh1 {
    private final Set a;

    private j(Set set) {
        this.a = set;
    }

    public static xh1 a(Set set) {
        return new j(set);
    }

    public Object get() {
        return l.g(this.a);
    }
}
