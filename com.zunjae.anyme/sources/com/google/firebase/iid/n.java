package com.google.firebase.iid;

import com.google.firebase.iid.j0;

final /* synthetic */ class n implements j0.a {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final String d;

    n(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final e81 start() {
        return this.a.A(this.b, this.c, this.d);
    }
}
