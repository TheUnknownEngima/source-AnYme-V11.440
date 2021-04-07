package com.google.firebase.installations;

class k implements n {
    final f81<String> a;

    public k(f81<String> f81) {
        this.a = f81;
    }

    public boolean a(bi1 bi1, Exception exc) {
        return false;
    }

    public boolean b(bi1 bi1) {
        if (!bi1.l() && !bi1.k() && !bi1.i()) {
            return false;
        }
        this.a.e(bi1.d());
        return true;
    }
}
