package com.google.firebase.remoteconfig.internal;

import java.util.Date;

final /* synthetic */ class i implements x71 {
    private final k a;
    private final Date b;

    private i(k kVar, Date date) {
        this.a = kVar;
        this.b = date;
    }

    public static x71 b(k kVar, Date date) {
        return new i(kVar, date);
    }

    public Object a(e81 e81) {
        e81 unused = this.a.s(e81, this.b);
        return e81;
    }
}
