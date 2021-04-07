package com.bumptech.glide.load;

import java.security.MessageDigest;

public final class h<T> {
    private static final b<Object> e = new a();
    private final T a;
    private final b<T> b;
    private final String c;
    private volatile byte[] d;

    class a implements b<Object> {
        a() {
        }

        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private h(String str, T t, b<T> bVar) {
        jm.b(str);
        this.c = str;
        this.a = t;
        jm.d(bVar);
        this.b = bVar;
    }

    public static <T> h<T> a(String str, T t, b<T> bVar) {
        return new h<>(str, t, bVar);
    }

    private static <T> b<T> b() {
        return e;
    }

    private byte[] d() {
        if (this.d == null) {
            this.d = this.c.getBytes(g.a);
        }
        return this.d;
    }

    public static <T> h<T> e(String str) {
        return new h<>(str, (Object) null, b());
    }

    public static <T> h<T> f(String str, T t) {
        return new h<>(str, t, b());
    }

    public T c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.c.equals(((h) obj).c);
        }
        return false;
    }

    public void g(T t, MessageDigest messageDigest) {
        this.b.a(d(), t, messageDigest);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.c + '\'' + '}';
    }
}
