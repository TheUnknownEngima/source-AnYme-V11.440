package defpackage;

import android.net.Uri;

/* renamed from: n10  reason: default package */
public final class n10 {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public n10(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public n10 a(n10 n10, String str) {
        String c2 = c(str);
        if (n10 != null && c2.equals(n10.c(str))) {
            long j = this.b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.a;
                if (j3 + j == n10.a) {
                    long j4 = n10.b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new n10(c2, j3, j2);
                }
            }
            long j5 = n10.b;
            if (j5 != -1) {
                long j6 = n10.a;
                if (j6 + j5 == this.a) {
                    long j7 = this.b;
                    if (j7 != -1) {
                        j2 = j5 + j7;
                    }
                    return new n10(c2, j6, j2);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return u50.d(str, this.c);
    }

    public String c(String str) {
        return u50.c(str, this.c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n10.class != obj.getClass()) {
            return false;
        }
        n10 n10 = (n10) obj;
        return this.a == n10.a && this.b == n10.b && this.c.equals(n10.c);
    }

    public int hashCode() {
        if (this.d == 0) {
            this.d = ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        }
        return this.d;
    }

    public String toString() {
        String str = this.c;
        long j = this.a;
        long j2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
