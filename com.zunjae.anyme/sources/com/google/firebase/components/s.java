package com.google.firebase.components;

public class s<T> implements xh1<T> {
    private static final Object c = new Object();
    private volatile Object a = c;
    private volatile xh1<T> b;

    public s(xh1<T> xh1) {
        this.b = xh1;
    }

    public T get() {
        T t = this.a;
        if (t == c) {
            synchronized (this) {
                t = this.a;
                if (t == c) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
