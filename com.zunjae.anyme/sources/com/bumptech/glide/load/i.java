package com.bumptech.glide.load;

import java.security.MessageDigest;

public final class i implements g {
    private final b0<h<?>, Object> b = new bm();

    private static <T> void f(h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.g(obj, messageDigest);
    }

    public void a(MessageDigest messageDigest) {
        for (int i = 0; i < this.b.size(); i++) {
            f(this.b.i(i), this.b.m(i), messageDigest);
        }
    }

    public <T> T c(h<T> hVar) {
        return this.b.containsKey(hVar) ? this.b.get(hVar) : hVar.c();
    }

    public void d(i iVar) {
        this.b.j(iVar.b);
    }

    public <T> i e(h<T> hVar, T t) {
        this.b.put(hVar, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.b.equals(((i) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.b + '}';
    }
}
