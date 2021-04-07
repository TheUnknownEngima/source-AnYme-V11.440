package defpackage;

import android.os.Build;
import androidx.work.c;
import androidx.work.e;
import androidx.work.h;
import androidx.work.m;
import java.util.List;
import java.util.UUID;

/* renamed from: i8  reason: default package */
public class i8 {
    public String a;
    public m.a b = m.a.ENQUEUED;
    public String c;
    public String d;
    public e e;
    public e f;
    public long g;
    public long h;
    public long i;
    public c j;
    public int k;
    public androidx.work.a l;
    public long m;
    public long n;
    public long o;
    public long p;

    /* renamed from: i8$a */
    public static class a {
        public String a;
        public m.a b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b) {
                return false;
            }
            return this.a.equals(aVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    /* renamed from: i8$b */
    public static class b {
        public String a;
        public m.a b;
        public e c;
        public List<String> d;

        public m a() {
            return new m(UUID.fromString(this.a), this.b, this.c, this.d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            String str = this.a;
            if (str == null ? bVar.a != null : !str.equals(bVar.a)) {
                return false;
            }
            if (this.b != bVar.b) {
                return false;
            }
            e eVar = this.c;
            if (eVar == null ? bVar.c != null : !eVar.equals(bVar.c)) {
                return false;
            }
            List<String> list = this.d;
            List<String> list2 = bVar.d;
            return list != null ? list.equals(list2) : list2 == null;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            m.a aVar = this.b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            e eVar = this.c;
            int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            List<String> list = this.d;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }
    }

    static {
        h.f("WorkSpec");
    }

    public i8(i8 i8Var) {
        e eVar = e.c;
        this.e = eVar;
        this.f = eVar;
        this.j = c.i;
        this.l = androidx.work.a.EXPONENTIAL;
        this.m = 30000;
        this.p = -1;
        this.a = i8Var.a;
        this.c = i8Var.c;
        this.b = i8Var.b;
        this.d = i8Var.d;
        this.e = new e(i8Var.e);
        this.f = new e(i8Var.f);
        this.g = i8Var.g;
        this.h = i8Var.h;
        this.i = i8Var.i;
        this.j = new c(i8Var.j);
        this.k = i8Var.k;
        this.l = i8Var.l;
        this.m = i8Var.m;
        this.n = i8Var.n;
        this.o = i8Var.o;
        this.p = i8Var.p;
    }

    public i8(String str, String str2) {
        e eVar = e.c;
        this.e = eVar;
        this.f = eVar;
        this.j = c.i;
        this.l = androidx.work.a.EXPONENTIAL;
        this.m = 30000;
        this.p = -1;
        this.a = str;
        this.c = str2;
    }

    public long a() {
        boolean z = false;
        if (c()) {
            if (this.l == androidx.work.a.LINEAR) {
                z = true;
            }
            return this.n + Math.min(18000000, z ? this.m * ((long) this.k) : (long) Math.scalb((float) this.m, this.k - 1));
        } else if (!d()) {
            return this.n + this.g;
        } else {
            if (Build.VERSION.SDK_INT > 22) {
                return (this.n + this.h) - this.i;
            }
            if (this.i != this.h) {
                z = true;
            }
            if (!z) {
                return this.n + this.h;
            }
            long j2 = this.n == 0 ? this.i * -1 : 0;
            long j3 = this.n;
            if (j3 == 0) {
                j3 = System.currentTimeMillis();
            }
            return j3 + this.h + j2;
        }
    }

    public boolean b() {
        return !c.i.equals(this.j);
    }

    public boolean c() {
        return this.b == m.a.ENQUEUED && this.k > 0;
    }

    public boolean d() {
        return this.h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i8.class != obj.getClass()) {
            return false;
        }
        i8 i8Var = (i8) obj;
        if (this.g != i8Var.g || this.h != i8Var.h || this.i != i8Var.i || this.k != i8Var.k || this.m != i8Var.m || this.n != i8Var.n || this.o != i8Var.o || this.p != i8Var.p || !this.a.equals(i8Var.a) || this.b != i8Var.b || !this.c.equals(i8Var.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? i8Var.d == null : str.equals(i8Var.d)) {
            return this.e.equals(i8Var.e) && this.f.equals(i8Var.f) && this.j.equals(i8Var.j) && this.l == i8Var.l;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        long j5 = this.m;
        long j6 = this.n;
        long j7 = this.o;
        long j8 = this.p;
        return ((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l.hashCode()) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "{WorkSpec: " + this.a + "}";
    }
}
