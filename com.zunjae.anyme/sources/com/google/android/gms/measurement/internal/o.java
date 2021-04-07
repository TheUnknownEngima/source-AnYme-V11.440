package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.r;

final class o {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    o(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l, Long l2, Long l3, Boolean bool) {
        long j7 = j2;
        long j8 = j3;
        long j9 = j4;
        long j10 = j6;
        r.f(str);
        r.f(str2);
        boolean z = true;
        r.a(j7 >= 0);
        r.a(j8 >= 0);
        r.a(j9 >= 0);
        r.a(j10 < 0 ? false : z);
        this.a = str;
        this.b = str2;
        this.c = j7;
        this.d = j8;
        this.e = j9;
        this.f = j5;
        this.g = j10;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    o(String str, String str2, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, 0, 0, 0, j4, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public final o a(long j2) {
        return new o(this.a, this.b, this.c, this.d, this.e, j2, this.g, this.h, this.i, this.j, this.k);
    }

    /* access modifiers changed from: package-private */
    public final o b(long j2, long j3) {
        return new o(this.a, this.b, this.c, this.d, this.e, this.f, j2, Long.valueOf(j3), this.i, this.j, this.k);
    }

    /* access modifiers changed from: package-private */
    public final o c(Long l, Long l2, Boolean bool) {
        return new o(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
