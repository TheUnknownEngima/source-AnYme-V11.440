package defpackage;

import defpackage.tt;
import java.util.Arrays;

/* renamed from: ct  reason: default package */
public final class ct implements tt {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public ct(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0;
        }
    }

    public int a(long j) {
        return v50.f(this.e, j, true, true);
    }

    public boolean e() {
        return true;
    }

    public tt.a i(long j) {
        int a2 = a(j);
        ut utVar = new ut(this.e[a2], this.c[a2]);
        if (utVar.a >= j || a2 == this.a - 1) {
            return new tt.a(utVar);
        }
        int i = a2 + 1;
        return new tt.a(utVar, new ut(this.e[i], this.c[i]));
    }

    public long j() {
        return this.f;
    }

    public String toString() {
        int i = this.a;
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.e);
        String arrays4 = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 71 + String.valueOf(arrays2).length() + String.valueOf(arrays3).length() + String.valueOf(arrays4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        sb.append(arrays4);
        sb.append(")");
        return sb.toString();
    }
}
