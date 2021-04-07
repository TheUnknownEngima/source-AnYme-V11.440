package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: r00  reason: default package */
public final class r00 {
    public static final r00 f = new r00(new long[0]);
    public final int a;
    public final long[] b;
    public final a[] c;
    public final long d;
    public final long e;

    /* renamed from: r00$a */
    public static final class a {
        public final int a;
        public final Uri[] b;
        public final int[] c;
        public final long[] d;

        public a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        private a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            q40.a(iArr.length == uriArr.length);
            this.a = i;
            this.c = iArr;
            this.b = uriArr;
            this.d = jArr;
        }

        public int a() {
            return b(-1);
        }

        public int b(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.c;
                if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                    return i2;
                }
                i2++;
            }
            return i2;
        }

        public boolean c() {
            return this.a == -1 || a() < this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Arrays.equals(this.b, aVar.b) && Arrays.equals(this.c, aVar.c) && Arrays.equals(this.d, aVar.d);
        }

        public int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
        }
    }

    public r00(long... jArr) {
        int length = jArr.length;
        this.a = length;
        this.b = Arrays.copyOf(jArr, length);
        this.c = new a[length];
        for (int i = 0; i < length; i++) {
            this.c[i] = new a();
        }
        this.d = 0;
        this.e = -9223372036854775807L;
    }

    private boolean c(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = this.b[i];
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    public int a(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i < jArr.length && jArr[i] != Long.MIN_VALUE && (j >= jArr[i] || !this.c[i].c())) {
                i++;
            }
        }
        if (i < this.b.length) {
            return i;
        }
        return -1;
    }

    public int b(long j, long j2) {
        int length = this.b.length - 1;
        while (length >= 0 && c(j, j2, length)) {
            length--;
        }
        if (length < 0 || !this.c[length].c()) {
            return -1;
        }
        return length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r00.class != obj.getClass()) {
            return false;
        }
        r00 r00 = (r00) obj;
        return this.a == r00.a && this.d == r00.d && this.e == r00.e && Arrays.equals(this.b, r00.b) && Arrays.equals(this.c, r00.c);
    }

    public int hashCode() {
        return (((((((this.a * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adResumePositionUs=");
        sb.append(this.d);
        sb.append(", adGroups=[");
        for (int i = 0; i < this.c.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.b[i]);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < this.c[i].c.length; i2++) {
                sb.append("ad(state=");
                int i3 = this.c[i].c[i2];
                sb.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(this.c[i].d[i2]);
                sb.append(')');
                if (i2 < this.c[i].c.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < this.c.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
