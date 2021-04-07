package com.google.firebase.remoteconfig.internal;

import java.util.Date;

final /* synthetic */ class h implements x71 {
    private final k a;
    private final e81 b;
    private final e81 c;
    private final Date d;

    private h(k kVar, e81 e81, e81 e812, Date date) {
        this.a = kVar;
        this.b = e81;
        this.c = e812;
        this.d = date;
    }

    public static x71 b(k kVar, e81 e81, e81 e812, Date date) {
        return new h(kVar, e81, e812, date);
    }

    public Object a(e81 e81) {
        return k.n(this.a, this.b, this.c, this.d, e81);
    }
}
