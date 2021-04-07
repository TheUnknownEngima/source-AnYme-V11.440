package com.google.firebase.iid;

final /* synthetic */ class o implements d81 {
    private final FirebaseInstanceId a;
    private final String b;
    private final String c;
    private final String d;

    o(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final e81 a(Object obj) {
        return this.a.z(this.b, this.c, this.d, (String) obj);
    }
}
