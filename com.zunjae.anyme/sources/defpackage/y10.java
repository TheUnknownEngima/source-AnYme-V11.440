package defpackage;

import com.google.android.exoplayer2.offline.h;
import java.util.Collections;
import java.util.List;

/* renamed from: y10  reason: default package */
public final class y10 extends z10 {
    public final int d;
    public final long e;
    public final long f;
    public final boolean g;
    public final int h;
    public final long i;
    public final int j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final ns n;
    public final List<a> o;
    public final long p;

    /* renamed from: y10$a */
    public static final class a implements Comparable<Long> {
        public final String e;
        public final a f;
        public final long g;
        public final int h;
        public final long i;
        public final ns j;
        public final String k;
        public final String l;
        public final long m;
        public final long n;
        public final boolean o;

        public a(String str, long j2, long j3, String str2, String str3) {
            this(str, (a) null, "", 0, -1, -9223372036854775807L, (ns) null, str2, str3, j2, j3, false);
        }

        public a(String str, a aVar, String str2, long j2, int i2, long j3, ns nsVar, String str3, String str4, long j4, long j5, boolean z) {
            this.e = str;
            this.f = aVar;
            this.g = j2;
            this.h = i2;
            this.i = j3;
            this.j = nsVar;
            this.k = str3;
            this.l = str4;
            this.m = j4;
            this.n = j5;
            this.o = z;
        }

        /* renamed from: a */
        public int compareTo(Long l2) {
            if (this.i > l2.longValue()) {
                return 1;
            }
            return this.i < l2.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y10(int i2, String str, List<String> list, long j2, long j3, boolean z, int i3, long j4, int i4, long j5, boolean z2, boolean z3, boolean z4, ns nsVar, List<a> list2) {
        super(str, list, z2);
        String str2 = str;
        List<String> list3 = list;
        this.d = i2;
        this.f = j3;
        this.g = z;
        this.h = i3;
        this.i = j4;
        this.j = i4;
        this.k = j5;
        this.l = z3;
        this.m = z4;
        this.n = nsVar;
        this.o = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            a aVar = list2.get(list2.size() - 1);
            this.p = aVar.i + aVar.g;
        } else {
            this.p = 0;
        }
        this.e = j2 == -9223372036854775807L ? -9223372036854775807L : j2 >= 0 ? j2 : this.p + j2;
    }

    public /* bridge */ /* synthetic */ Object a(List list) {
        b(list);
        return this;
    }

    public y10 b(List<h> list) {
        return this;
    }

    public y10 c(long j2, int i2) {
        return new y10(this.d, this.a, this.b, this.e, j2, true, i2, this.i, this.j, this.k, this.c, this.l, this.m, this.n, this.o);
    }

    public y10 d() {
        if (this.l) {
            return this;
        }
        y10 y10 = r2;
        y10 y102 = new y10(this.d, this.a, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.c, true, this.m, this.n, this.o);
        return y10;
    }

    public long e() {
        return this.f + this.p;
    }

    public boolean f(y10 y10) {
        if (y10 == null) {
            return true;
        }
        long j2 = this.i;
        long j3 = y10.i;
        if (j2 > j3) {
            return true;
        }
        if (j2 < j3) {
            return false;
        }
        int size = this.o.size();
        int size2 = y10.o.size();
        if (size <= size2) {
            return size == size2 && this.l && !y10.l;
        }
        return true;
    }
}
