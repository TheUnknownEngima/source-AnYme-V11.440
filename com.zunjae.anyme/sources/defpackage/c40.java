package defpackage;

import android.os.SystemClock;
import com.google.android.exoplayer2.f0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: c40  reason: default package */
public abstract class c40 implements h40 {
    protected final o00 a;
    protected final int b;
    protected final int[] c;
    private final f0[] d;
    private final long[] e;
    private int f;

    /* renamed from: c40$b */
    private static final class b implements Comparator<f0> {
        private b() {
        }

        /* renamed from: a */
        public int compare(f0 f0Var, f0 f0Var2) {
            return f0Var2.i - f0Var.i;
        }
    }

    public c40(o00 o00, int... iArr) {
        int i = 0;
        q40.f(iArr.length > 0);
        q40.e(o00);
        this.a = o00;
        int length = iArr.length;
        this.b = length;
        this.d = new f0[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = o00.a(iArr[i2]);
        }
        Arrays.sort(this.d, new b());
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = o00.b(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    public final o00 a() {
        return this.a;
    }

    public final boolean c(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean r = r(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !r) {
            r = i2 != i && !r(i2, elapsedRealtime);
            i2++;
        }
        if (!r) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], v50.a(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    public final f0 d(int i) {
        return this.d[i];
    }

    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c40 c40 = (c40) obj;
        return this.a == c40.a && Arrays.equals(this.c, c40.c);
    }

    public final int f(int i) {
        return this.c[i];
    }

    public int g(long j, List<? extends d10> list) {
        return list.size();
    }

    public final int h(f0 f0Var) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == f0Var) {
                return i;
            }
        }
        return -1;
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        }
        return this.f;
    }

    public void i() {
    }

    public final int k() {
        return this.c[b()];
    }

    public final f0 l() {
        return this.d[b()];
    }

    public final int length() {
        return this.c.length;
    }

    public void n(float f2) {
    }

    public /* synthetic */ void p() {
        g40.a(this);
    }

    public final int q(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final boolean r(int i, long j) {
        return this.e[i] > j;
    }
}
