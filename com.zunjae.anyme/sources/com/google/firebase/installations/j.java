package com.google.firebase.installations;

import com.google.firebase.installations.l;

class j implements n {
    private final o a;
    private final f81<l> b;

    public j(o oVar, f81<l> f81) {
        this.a = oVar;
        this.b = f81;
    }

    public boolean a(bi1 bi1, Exception exc) {
        if (!bi1.i() && !bi1.j() && !bi1.l()) {
            return false;
        }
        this.b.d(exc);
        return true;
    }

    public boolean b(bi1 bi1) {
        if (!bi1.k() || this.a.b(bi1)) {
            return false;
        }
        f81<l> f81 = this.b;
        l.a a2 = l.a();
        a2.b(bi1.b());
        a2.d(bi1.c());
        a2.c(bi1.h());
        f81.c(a2.a());
        return true;
    }
}
