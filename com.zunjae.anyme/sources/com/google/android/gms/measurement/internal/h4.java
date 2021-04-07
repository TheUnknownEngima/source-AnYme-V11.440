package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class h4 {
    public String a;
    private String b;
    private long c;
    public Bundle d;

    private h4(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle == null ? new Bundle() : bundle;
        this.c = j;
    }

    public static h4 b(s sVar) {
        return new h4(sVar.e, sVar.g, sVar.f.l(), sVar.h);
    }

    public final s a() {
        return new s(this.a, new n(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.a;
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
