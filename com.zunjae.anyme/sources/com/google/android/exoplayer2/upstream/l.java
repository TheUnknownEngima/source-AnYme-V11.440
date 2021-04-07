package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class l {
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map<String, String> d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    public l(Uri uri, int i2) {
        this(uri, 0, -1, (String) null, i2);
    }

    public l(Uri uri, int i2, byte[] bArr, long j, long j2, long j3, String str, int i3) {
        this(uri, i2, bArr, j, j2, j3, str, i3, Collections.emptyMap());
    }

    public l(Uri uri, int i2, byte[] bArr, long j, long j2, long j3, String str, int i3, Map<String, String> map) {
        byte[] bArr2 = bArr;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        q40.a(j4 >= 0);
        q40.a(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        q40.a(z);
        this.a = uri;
        this.b = i2;
        this.c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = str;
        this.i = i3;
        this.d = Collections.unmodifiableMap(new HashMap(map));
    }

    public l(Uri uri, long j, long j2, long j3, String str, int i2) {
        this(uri, (byte[]) null, j, j2, j3, str, i2);
    }

    public l(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public l(Uri uri, long j, long j2, String str, int i2) {
        this(uri, j, j, j2, str, i2);
    }

    public l(Uri uri, long j, long j2, String str, int i2, Map<String, String> map) {
        this(uri, c((byte[]) null), (byte[]) null, j, j, j2, str, i2, map);
    }

    public l(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        this(uri, c(bArr), bArr, j, j2, j3, str, i2);
    }

    public static String b(int i2) {
        if (i2 == 1) {
            return "GET";
        }
        if (i2 == 2) {
            return "POST";
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new AssertionError(i2);
    }

    private static int c(byte[] bArr) {
        return bArr != null ? 2 : 1;
    }

    public final String a() {
        return b(this.b);
    }

    public boolean d(int i2) {
        return (this.i & i2) == i2;
    }

    public l e(long j) {
        long j2 = this.g;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return f(j, j3);
    }

    public l f(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new l(this.a, this.b, this.c, this.e + j, this.f + j, j2, this.h, this.i, this.d);
    }

    public String toString() {
        String a2 = a();
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString(this.c);
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        String str = this.h;
        int i2 = this.i;
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 94 + String.valueOf(valueOf).length() + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(a2);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }
}
