package com.google.firebase.remoteconfig;

public class j extends g {
    private final int e;

    public j(int i, String str) {
        super(str);
        this.e = i;
    }

    public j(int i, String str, Throwable th) {
        super(str, th);
        this.e = i;
    }

    public int a() {
        return this.e;
    }
}
