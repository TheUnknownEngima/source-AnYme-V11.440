package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.x0;
import defpackage.b40;
import defpackage.f40;
import defpackage.h40;
import defpackage.j40;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d40  reason: default package */
public class d40 extends f40 {
    private static final int[] e = new int[0];
    private final h40.b b;
    private final AtomicReference<c> c;
    private boolean d;

    /* renamed from: d40$a */
    private static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: d40$b */
    protected static final class b implements Comparable<b> {
        public final boolean e;
        private final String f;
        private final c g;
        private final boolean h;
        private final int i;
        private final int j;
        private final int k;
        private final boolean l;
        private final int m;
        private final int n;
        private final int o;

        public b(f0 f0Var, c cVar, int i2) {
            int i3;
            this.g = cVar;
            this.f = d40.y(f0Var.E);
            int i4 = 0;
            this.h = d40.u(i2, false);
            this.i = d40.r(f0Var, cVar.e, false);
            boolean z = true;
            this.l = (f0Var.g & 1) != 0;
            this.m = f0Var.z;
            this.n = f0Var.A;
            int i5 = f0Var.i;
            this.o = i5;
            if ((i5 != -1 && i5 > cVar.v) || ((i3 = f0Var.z) != -1 && i3 > cVar.u)) {
                z = false;
            }
            this.e = z;
            String[] U = v50.U();
            int i6 = Integer.MAX_VALUE;
            int i7 = 0;
            while (true) {
                if (i7 >= U.length) {
                    break;
                }
                int r = d40.r(f0Var, U[i7], false);
                if (r > 0) {
                    i6 = i7;
                    i4 = r;
                    break;
                }
                i7++;
            }
            this.j = i6;
            this.k = i4;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            int i2;
            int j2;
            boolean z = this.h;
            int i3 = 1;
            if (z != bVar.h) {
                return z ? 1 : -1;
            }
            int i4 = this.i;
            int i5 = bVar.i;
            if (i4 != i5) {
                return d40.l(i4, i5);
            }
            boolean z2 = this.e;
            if (z2 != bVar.e) {
                return z2 ? 1 : -1;
            }
            if (this.g.A && (j2 = d40.k(this.o, bVar.o)) != 0) {
                return j2 > 0 ? -1 : 1;
            }
            boolean z3 = this.l;
            if (z3 != bVar.l) {
                return z3 ? 1 : -1;
            }
            int i6 = this.j;
            int i7 = bVar.j;
            if (i6 != i7) {
                return -d40.l(i6, i7);
            }
            int i8 = this.k;
            int i9 = bVar.k;
            if (i8 != i9) {
                return d40.l(i8, i9);
            }
            if (!this.e || !this.h) {
                i3 = -1;
            }
            int i10 = this.m;
            int i11 = bVar.m;
            if (i10 != i11 || (i10 = this.n) != (i11 = bVar.n)) {
                i2 = d40.l(i10, i11);
            } else if (!v50.b(this.f, bVar.f)) {
                return 0;
            } else {
                i2 = d40.l(this.o, bVar.o);
            }
            return i3 * i2;
        }
    }

    /* renamed from: d40$c */
    public static final class c extends j40 {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public static final c G = new d().a();
        public final boolean A;
        public final boolean B;
        public final boolean C;
        public final int D;
        private final SparseArray<Map<p00, e>> E;
        private final SparseBooleanArray F;
        public final int k;
        public final int l;
        public final int m;
        public final int n;
        public final boolean o;
        public final boolean p;
        public final boolean q;
        public final int r;
        public final int s;
        public final boolean t;
        public final int u;
        public final int v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final boolean z;

        /* renamed from: d40$c$a */
        class a implements Parcelable.Creator<c> {
            a() {
            }

            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            /* renamed from: b */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i, int i2, int i3, int i4, boolean z2, boolean z3, boolean z4, int i5, int i6, boolean z5, String str, int i7, int i8, boolean z6, boolean z7, boolean z8, boolean z9, String str2, int i9, boolean z10, int i10, boolean z11, boolean z12, boolean z13, int i11, SparseArray<Map<p00, e>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(str, str2, i9, z10, i10);
            this.k = i;
            this.l = i2;
            this.m = i3;
            this.n = i4;
            this.o = z2;
            this.p = z3;
            this.q = z4;
            this.r = i5;
            this.s = i6;
            this.t = z5;
            this.u = i7;
            this.v = i8;
            this.w = z6;
            this.x = z7;
            this.y = z8;
            this.z = z9;
            this.A = z11;
            this.B = z12;
            this.C = z13;
            this.D = i11;
            this.E = sparseArray;
            this.F = sparseBooleanArray;
        }

        c(Parcel parcel) {
            super(parcel);
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readInt();
            this.n = parcel.readInt();
            this.o = v50.t0(parcel);
            this.p = v50.t0(parcel);
            this.q = v50.t0(parcel);
            this.r = parcel.readInt();
            this.s = parcel.readInt();
            this.t = v50.t0(parcel);
            this.u = parcel.readInt();
            this.v = parcel.readInt();
            this.w = v50.t0(parcel);
            this.x = v50.t0(parcel);
            this.y = v50.t0(parcel);
            this.z = v50.t0(parcel);
            this.A = v50.t0(parcel);
            this.B = v50.t0(parcel);
            this.C = v50.t0(parcel);
            this.D = parcel.readInt();
            this.E = h(parcel);
            SparseBooleanArray readSparseBooleanArray = parcel.readSparseBooleanArray();
            v50.g(readSparseBooleanArray);
            this.F = readSparseBooleanArray;
        }

        private static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean b(SparseArray<Map<p00, e>> sparseArray, SparseArray<Map<p00, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !c(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean c(java.util.Map<defpackage.p00, defpackage.d40.e> r4, java.util.Map<defpackage.p00, defpackage.d40.e> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                p00 r1 = (defpackage.p00) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = defpackage.v50.b(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.d40.c.c(java.util.Map, java.util.Map):boolean");
        }

        public static c d(Context context) {
            return new d(context).a();
        }

        private static SparseArray<Map<p00, e>> h(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<p00, e>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    p00 p00 = (p00) parcel.readParcelable(p00.class.getClassLoader());
                    q40.e(p00);
                    hashMap.put(p00, (e) parcel.readParcelable(e.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void i(Parcel parcel, SparseArray<Map<p00, e>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map valueAt = sparseArray.valueAt(i);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : valueAt.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        public int describeContents() {
            return 0;
        }

        public final boolean e(int i) {
            return this.F.get(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return super.equals(obj) && this.k == cVar.k && this.l == cVar.l && this.m == cVar.m && this.n == cVar.n && this.o == cVar.o && this.p == cVar.p && this.q == cVar.q && this.t == cVar.t && this.r == cVar.r && this.s == cVar.s && this.u == cVar.u && this.v == cVar.v && this.w == cVar.w && this.x == cVar.x && this.y == cVar.y && this.z == cVar.z && this.A == cVar.A && this.B == cVar.B && this.C == cVar.C && this.D == cVar.D && a(this.F, cVar.F) && b(this.E, cVar.E);
        }

        public final e f(int i, p00 p00) {
            Map map = this.E.get(i);
            if (map != null) {
                return (e) map.get(p00);
            }
            return null;
        }

        public final boolean g(int i, p00 p00) {
            Map map = this.E.get(i);
            return map != null && map.containsKey(p00);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + (this.o ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + this.r) * 31) + this.s) * 31) + this.u) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            v50.J0(parcel, this.o);
            v50.J0(parcel, this.p);
            v50.J0(parcel, this.q);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
            v50.J0(parcel, this.t);
            parcel.writeInt(this.u);
            parcel.writeInt(this.v);
            v50.J0(parcel, this.w);
            v50.J0(parcel, this.x);
            v50.J0(parcel, this.y);
            v50.J0(parcel, this.z);
            v50.J0(parcel, this.A);
            v50.J0(parcel, this.B);
            v50.J0(parcel, this.C);
            parcel.writeInt(this.D);
            i(parcel, this.E);
            parcel.writeSparseBooleanArray(this.F);
        }
    }

    /* renamed from: d40$d */
    public static final class d extends j40.b {
        private final SparseBooleanArray A = new SparseBooleanArray();
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;
        private boolean k;
        private boolean l;
        private int m;
        private int n;
        private boolean o;
        private int p;
        private int q;
        private boolean r;
        private boolean s;
        private boolean t;
        private boolean u;
        private boolean v;
        private boolean w;
        private boolean x;
        private int y;
        private final SparseArray<Map<p00, e>> z = new SparseArray<>();

        @Deprecated
        public d() {
            e();
        }

        public d(Context context) {
            super(context);
            e();
            h(context, true);
        }

        private void e() {
            this.f = Integer.MAX_VALUE;
            this.g = Integer.MAX_VALUE;
            this.h = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = true;
            this.k = false;
            this.l = true;
            this.m = Integer.MAX_VALUE;
            this.n = Integer.MAX_VALUE;
            this.o = true;
            this.p = Integer.MAX_VALUE;
            this.q = Integer.MAX_VALUE;
            this.r = true;
            this.s = false;
            this.t = false;
            this.u = false;
            this.v = false;
            this.w = false;
            this.x = true;
            this.y = 0;
        }

        public /* bridge */ /* synthetic */ j40.b b(Context context) {
            f(context);
            return this;
        }

        /* renamed from: d */
        public c a() {
            return new c(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.a, this.p, this.q, this.r, this.s, this.t, this.u, this.b, this.c, this.d, this.e, this.v, this.w, this.x, this.y, this.z, this.A);
        }

        public d f(Context context) {
            super.b(context);
            return this;
        }

        public d g(int i2, int i3, boolean z2) {
            this.m = i2;
            this.n = i3;
            this.o = z2;
            return this;
        }

        public d h(Context context, boolean z2) {
            Point E = v50.E(context);
            g(E.x, E.y, z2);
            return this;
        }
    }

    /* renamed from: d40$e */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public final int e;
        public final int[] f;
        public final int g;
        public final int h;
        public final int i;

        /* renamed from: d40$e$a */
        class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(int i2, int... iArr) {
            this(i2, iArr, 2, 0);
        }

        public e(int i2, int[] iArr, int i3, int i4) {
            this.e = i2;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f = copyOf;
            this.g = iArr.length;
            this.h = i3;
            this.i = i4;
            Arrays.sort(copyOf);
        }

        e(Parcel parcel) {
            this.e = parcel.readInt();
            int readByte = parcel.readByte();
            this.g = readByte;
            int[] iArr = new int[readByte];
            this.f = iArr;
            parcel.readIntArray(iArr);
            this.h = parcel.readInt();
            this.i = parcel.readInt();
        }

        public boolean a(int i2) {
            for (int i3 : this.f) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.e == eVar.e && Arrays.equals(this.f, eVar.f) && this.h == eVar.h && this.i == eVar.i;
        }

        public int hashCode() {
            return (((((this.e * 31) + Arrays.hashCode(this.f)) * 31) + this.h) * 31) + this.i;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.e);
            parcel.writeInt(this.f.length);
            parcel.writeIntArray(this.f);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
        }
    }

    /* renamed from: d40$f */
    protected static final class f implements Comparable<f> {
        public final boolean e;
        private final boolean f;
        private final boolean g;
        private final boolean h;
        private final int i;
        private final int j;
        private final int k;
        private final boolean l;

        public f(f0 f0Var, c cVar, int i2, String str) {
            boolean z = false;
            this.f = d40.u(i2, false);
            int i3 = f0Var.g & (~cVar.i);
            this.g = (i3 & 1) != 0;
            boolean z2 = (i3 & 2) != 0;
            this.i = d40.r(f0Var, cVar.f, cVar.h);
            this.j = Integer.bitCount(f0Var.h & cVar.g);
            this.l = (f0Var.h & 1088) != 0;
            this.h = (this.i > 0 && !z2) || (this.i == 0 && z2);
            this.k = d40.r(f0Var, str, d40.y(str) == null);
            if (this.i > 0 || ((cVar.f == null && this.j > 0) || this.g || (z2 && this.k > 0))) {
                z = true;
            }
            this.e = z;
        }

        /* renamed from: a */
        public int compareTo(f fVar) {
            boolean z;
            boolean z2 = this.f;
            if (z2 != fVar.f) {
                return z2 ? 1 : -1;
            }
            int i2 = this.i;
            int i3 = fVar.i;
            if (i2 != i3) {
                return d40.l(i2, i3);
            }
            int i4 = this.j;
            int i5 = fVar.j;
            if (i4 != i5) {
                return d40.l(i4, i5);
            }
            boolean z3 = this.g;
            if (z3 != fVar.g) {
                return z3 ? 1 : -1;
            }
            boolean z4 = this.h;
            if (z4 != fVar.h) {
                return z4 ? 1 : -1;
            }
            int i6 = this.k;
            int i7 = fVar.k;
            if (i6 != i7) {
                return d40.l(i6, i7);
            }
            if (i4 != 0 || (z = this.l) == fVar.l) {
                return 0;
            }
            return z ? -1 : 1;
        }
    }

    public d40(Context context) {
        this(context, (h40.b) new b40.d());
    }

    public d40(Context context, h40.b bVar) {
        this(c.d(context), bVar);
    }

    public d40(c cVar, h40.b bVar) {
        this.b = bVar;
        this.c = new AtomicReference<>(cVar);
    }

    private static h40.a A(p00 p00, int[][] iArr, int i, c cVar) {
        p00 p002 = p00;
        c cVar2 = cVar;
        int i2 = cVar2.q ? 24 : 16;
        boolean z = cVar2.p && (i & i2) != 0;
        int i3 = 0;
        while (i3 < p002.e) {
            o00 a2 = p002.a(i3);
            o00 o00 = a2;
            int[] q = q(a2, iArr[i3], z, i2, cVar2.k, cVar2.l, cVar2.m, cVar2.n, cVar2.r, cVar2.s, cVar2.t);
            if (q.length > 0) {
                return new h40.a(o00, q);
            }
            i3++;
            p002 = p00;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009b, code lost:
        if (r0 < 0) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.h40.a D(defpackage.p00 r17, int[][] r18, defpackage.d40.c r19) {
        /*
            r0 = r17
            r1 = r19
            r3 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = -1
        L_0x000b:
            int r11 = r0.e
            if (r5 >= r11) goto L_0x00e0
            o00 r11 = r0.a(r5)
            int r13 = r1.r
            int r14 = r1.s
            boolean r15 = r1.t
            java.util.List r13 = t(r11, r13, r14, r15)
            r14 = r18[r5]
            r15 = 0
        L_0x0020:
            int r2 = r11.e
            if (r15 >= r2) goto L_0x00d7
            com.google.android.exoplayer2.f0 r2 = r11.a(r15)
            int r12 = r2.h
            r12 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r12 == 0) goto L_0x0030
            goto L_0x00cc
        L_0x0030:
            r12 = r14[r15]
            boolean r4 = r1.C
            boolean r4 = u(r12, r4)
            if (r4 == 0) goto L_0x00cc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            boolean r4 = r13.contains(r4)
            if (r4 == 0) goto L_0x006d
            int r4 = r2.r
            if (r4 == r3) goto L_0x004c
            int r12 = r1.k
            if (r4 > r12) goto L_0x006d
        L_0x004c:
            int r4 = r2.s
            if (r4 == r3) goto L_0x0054
            int r12 = r1.l
            if (r4 > r12) goto L_0x006d
        L_0x0054:
            float r4 = r2.t
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = r1.m
            float r12 = (float) r12
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x006d
        L_0x0063:
            int r4 = r2.i
            if (r4 == r3) goto L_0x006b
            int r12 = r1.n
            if (r4 > r12) goto L_0x006d
        L_0x006b:
            r4 = 1
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r4 != 0) goto L_0x0076
            boolean r12 = r1.o
            if (r12 != 0) goto L_0x0076
            goto L_0x00cc
        L_0x0076:
            if (r4 == 0) goto L_0x007a
            r12 = 2
            goto L_0x007b
        L_0x007a:
            r12 = 1
        L_0x007b:
            r3 = r14[r15]
            r0 = 0
            boolean r3 = u(r3, r0)
            if (r3 == 0) goto L_0x0086
            int r12 = r12 + 1000
        L_0x0086:
            if (r12 <= r8) goto L_0x008a
            r0 = 1
            goto L_0x008b
        L_0x008a:
            r0 = 0
        L_0x008b:
            if (r12 != r8) goto L_0x00bc
            int r0 = r2.i
            int r0 = k(r0, r9)
            r16 = r6
            boolean r6 = r1.A
            if (r6 == 0) goto L_0x00a1
            if (r0 == 0) goto L_0x00a1
            if (r0 >= 0) goto L_0x009f
        L_0x009d:
            r0 = 1
            goto L_0x00be
        L_0x009f:
            r0 = 0
            goto L_0x00be
        L_0x00a1:
            int r0 = r2.J()
            if (r0 == r10) goto L_0x00ac
            int r0 = k(r0, r10)
            goto L_0x00b2
        L_0x00ac:
            int r0 = r2.i
            int r0 = k(r0, r9)
        L_0x00b2:
            if (r3 == 0) goto L_0x00b9
            if (r4 == 0) goto L_0x00b9
            if (r0 <= 0) goto L_0x009f
            goto L_0x009d
        L_0x00b9:
            if (r0 >= 0) goto L_0x009f
            goto L_0x009d
        L_0x00bc:
            r16 = r6
        L_0x00be:
            if (r0 == 0) goto L_0x00ce
            int r0 = r2.i
            int r2 = r2.J()
            r9 = r0
            r10 = r2
            r6 = r11
            r8 = r12
            r7 = r15
            goto L_0x00d0
        L_0x00cc:
            r16 = r6
        L_0x00ce:
            r6 = r16
        L_0x00d0:
            int r15 = r15 + 1
            r0 = r17
            r3 = -1
            goto L_0x0020
        L_0x00d7:
            r16 = r6
            int r5 = r5 + 1
            r0 = r17
            r3 = -1
            goto L_0x000b
        L_0x00e0:
            if (r6 != 0) goto L_0x00e4
            r2 = 0
            goto L_0x00ef
        L_0x00e4:
            h40$a r2 = new h40$a
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r7
            r2.<init>(r6, r0)
        L_0x00ef:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d40.D(p00, int[][], d40$c):h40$a");
    }

    /* access modifiers changed from: private */
    public static int k(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: private */
    public static int l(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    private static void m(o00 o00, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list2.get(size).intValue();
            o00 o002 = o00;
            if (!w(o00.a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                list2.remove(size);
            }
        }
    }

    private static int n(o00 o00, int[] iArr, a aVar, int i, boolean z, boolean z2, boolean z3) {
        o00 o002 = o00;
        int i2 = 0;
        for (int i3 = 0; i3 < o002.e; i3++) {
            if (v(o00.a(i3), iArr[i3], aVar, i, z, z2, z3)) {
                i2++;
            }
        }
        return i2;
    }

    private static int[] o(o00 o00, int[] iArr, int i, boolean z, boolean z2, boolean z3) {
        int n;
        o00 o002 = o00;
        HashSet hashSet = new HashSet();
        a aVar = null;
        int i2 = 0;
        for (int i3 = 0; i3 < o002.e; i3++) {
            f0 a2 = o002.a(i3);
            a aVar2 = new a(a2.z, a2.A, a2.m);
            if (hashSet.add(aVar2) && (n = n(o00, iArr, aVar2, i, z, z2, z3)) > i2) {
                i2 = n;
                aVar = aVar2;
            }
        }
        if (i2 <= 1) {
            return e;
        }
        q40.e(aVar);
        int[] iArr2 = new int[i2];
        int i4 = 0;
        for (int i5 = 0; i5 < o002.e; i5++) {
            if (v(o002.a(i5), iArr[i5], aVar, i, z, z2, z3)) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        return iArr2;
    }

    private static int p(o00 o00, int[] iArr, int i, String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue = list.get(i7).intValue();
            o00 o002 = o00;
            if (w(o00.a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                i6++;
            }
        }
        return i6;
    }

    private static int[] q(o00 o00, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        String str;
        o00 o002 = o00;
        if (o002.e < 2) {
            return e;
        }
        List<Integer> t = t(o002, i6, i7, z2);
        if (t.size() < 2) {
            return e;
        }
        if (!z) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i8 = 0;
            for (int i9 = 0; i9 < t.size(); i9++) {
                String str3 = o002.a(t.get(i9).intValue()).m;
                if (hashSet.add(str3)) {
                    String str4 = str3;
                    int p = p(o00, iArr, i, str3, i2, i3, i4, i5, t);
                    if (p > i8) {
                        i8 = p;
                        str2 = str4;
                    }
                }
            }
            str = str2;
        } else {
            str = null;
        }
        m(o00, iArr, i, str, i2, i3, i4, i5, t);
        return t.size() < 2 ? e : v50.E0(t);
    }

    protected static int r(f0 f0Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(f0Var.E)) {
            return 4;
        }
        String y = y(str);
        String y2 = y(f0Var.E);
        if (y2 == null || y == null) {
            return (!z || y2 != null) ? 0 : 1;
        }
        if (y2.startsWith(y) || y.startsWith(y2)) {
            return 3;
        }
        return v50.A0(y2, "-")[0].equals(v50.A0(y, "-")[0]) ? 2 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point s(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = defpackage.v50.i(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = defpackage.v50.i(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d40.s(boolean, int, int, int, int):android.graphics.Point");
    }

    private static List<Integer> t(o00 o00, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(o00.e);
        for (int i4 = 0; i4 < o00.e; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < o00.e; i6++) {
                f0 a2 = o00.a(i6);
                int i7 = a2.r;
                if (i7 > 0 && (i3 = a2.s) > 0) {
                    Point s = s(z, i, i2, i7, i3);
                    int i8 = a2.r;
                    int i9 = a2.s;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (((float) s.x) * 0.98f)) && i9 >= ((int) (((float) s.y) * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int J = o00.a(((Integer) arrayList.get(size)).intValue()).J();
                    if (J == -1 || J > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    protected static boolean u(int i, boolean z) {
        int d2 = v0.d(i);
        return d2 == 4 || (z && d2 == 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r2 = r2.A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean v(com.google.android.exoplayer2.f0 r2, int r3, defpackage.d40.a r4, int r5, boolean r6, boolean r7, boolean r8) {
        /*
            r0 = 0
            boolean r3 = u(r3, r0)
            if (r3 == 0) goto L_0x0031
            int r3 = r2.i
            r1 = -1
            if (r3 == r1) goto L_0x000e
            if (r3 > r5) goto L_0x0031
        L_0x000e:
            if (r8 != 0) goto L_0x0018
            int r3 = r2.z
            if (r3 == r1) goto L_0x0031
            int r5 = r4.a
            if (r3 != r5) goto L_0x0031
        L_0x0018:
            if (r6 != 0) goto L_0x0026
            java.lang.String r3 = r2.m
            if (r3 == 0) goto L_0x0031
            java.lang.String r5 = r4.c
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L_0x0031
        L_0x0026:
            if (r7 != 0) goto L_0x0030
            int r2 = r2.A
            if (r2 == r1) goto L_0x0031
            int r3 = r4.b
            if (r2 != r3) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d40.v(com.google.android.exoplayer2.f0, int, d40$a, int, boolean, boolean, boolean):boolean");
    }

    private static boolean w(f0 f0Var, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if ((f0Var.h & 16384) != 0 || !u(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !v50.b(f0Var.m, str)) {
            return false;
        }
        int i7 = f0Var.r;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = f0Var.s;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f2 = f0Var.t;
        if (f2 != -1.0f && f2 > ((float) i5)) {
            return false;
        }
        int i9 = f0Var.i;
        return i9 == -1 || i9 <= i6;
    }

    private static void x(f40.a aVar, int[][][] iArr, x0[] x0VarArr, h40[] h40Arr, int i) {
        boolean z;
        if (i != 0) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                if (i2 >= aVar.c()) {
                    z = true;
                    break;
                }
                int d2 = aVar.d(i2);
                h40 h40 = h40Arr[i2];
                if ((d2 == 1 || d2 == 2) && h40 != null && z(iArr[i2], aVar.e(i2), h40)) {
                    if (d2 == 1) {
                        if (i4 != -1) {
                            break;
                        }
                        i4 = i2;
                    } else if (i3 != -1) {
                        break;
                    } else {
                        i3 = i2;
                    }
                }
                i2++;
            }
            z = false;
            if (!(i4 == -1 || i3 == -1)) {
                z2 = true;
            }
            if (z && z2) {
                x0 x0Var = new x0(i);
                x0VarArr[i4] = x0Var;
                x0VarArr[i3] = x0Var;
            }
        }
    }

    protected static String y(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean z(int[][] iArr, p00 p00, h40 h40) {
        if (h40 == null) {
            return false;
        }
        int b2 = p00.b(h40.a());
        for (int i = 0; i < h40.length(); i++) {
            if (v0.f(iArr[b2][h40.f(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: d40$b} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.h40.a[] B(defpackage.f40.a r22, int[][][] r23, int[] r24, defpackage.d40.c r25) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r25
            int r9 = r22.c()
            h40$a[] r10 = new defpackage.h40.a[r9]
            r11 = 0
            r0 = 0
            r12 = 0
            r13 = 0
        L_0x0010:
            r14 = 2
            r15 = 1
            if (r12 >= r9) goto L_0x0044
            int r1 = r7.d(r12)
            if (r14 != r1) goto L_0x0041
            if (r0 != 0) goto L_0x0036
            p00 r1 = r7.e(r12)
            r2 = r23[r12]
            r3 = r24[r12]
            r5 = 1
            r0 = r21
            r4 = r25
            h40$a r0 = r0.G(r1, r2, r3, r4, r5)
            r10[r12] = r0
            r0 = r10[r12]
            if (r0 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            p00 r1 = r7.e(r12)
            int r1 = r1.e
            if (r1 <= 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r15 = 0
        L_0x0040:
            r13 = r13 | r15
        L_0x0041:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x0044:
            r12 = -1
            r16 = 0
            r3 = r16
            r4 = r3
            r2 = -1
            r5 = 0
        L_0x004c:
            if (r5 >= r9) goto L_0x00b7
            int r0 = r7.d(r5)
            if (r15 != r0) goto L_0x00a8
            boolean r0 = r6.d
            if (r0 != 0) goto L_0x005e
            if (r13 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            r17 = 0
            goto L_0x0060
        L_0x005e:
            r17 = 1
        L_0x0060:
            p00 r1 = r7.e(r5)
            r18 = r23[r5]
            r19 = r24[r5]
            r0 = r21
            r14 = r2
            r2 = r18
            r15 = r3
            r3 = r19
            r20 = r4
            r4 = r25
            r19 = r5
            r5 = r17
            android.util.Pair r0 = r0.C(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ae
            if (r15 == 0) goto L_0x008a
            java.lang.Object r1 = r0.second
            d40$b r1 = (defpackage.d40.b) r1
            int r1 = r1.compareTo(r15)
            if (r1 <= 0) goto L_0x00ae
        L_0x008a:
            if (r14 == r12) goto L_0x008e
            r10[r14] = r16
        L_0x008e:
            java.lang.Object r1 = r0.first
            h40$a r1 = (defpackage.h40.a) r1
            r10[r19] = r1
            o00 r2 = r1.a
            int[] r1 = r1.b
            r1 = r1[r11]
            com.google.android.exoplayer2.f0 r1 = r2.a(r1)
            java.lang.String r4 = r1.E
            java.lang.Object r0 = r0.second
            r3 = r0
            d40$b r3 = (defpackage.d40.b) r3
            r2 = r19
            goto L_0x00b2
        L_0x00a8:
            r14 = r2
            r15 = r3
            r20 = r4
            r19 = r5
        L_0x00ae:
            r2 = r14
            r3 = r15
            r4 = r20
        L_0x00b2:
            int r5 = r19 + 1
            r14 = 2
            r15 = 1
            goto L_0x004c
        L_0x00b7:
            r20 = r4
            r0 = r16
            r1 = -1
        L_0x00bc:
            if (r11 >= r9) goto L_0x010d
            int r2 = r7.d(r11)
            r3 = 1
            if (r2 == r3) goto L_0x0105
            r4 = 2
            if (r2 == r4) goto L_0x0102
            r5 = 3
            if (r2 == r5) goto L_0x00d8
            p00 r5 = r7.e(r11)
            r13 = r23[r11]
            h40$a r2 = r6.E(r2, r5, r13, r8)
            r10[r11] = r2
            goto L_0x0102
        L_0x00d8:
            p00 r2 = r7.e(r11)
            r5 = r23[r11]
            r13 = r20
            android.util.Pair r2 = r6.F(r2, r5, r8, r13)
            if (r2 == 0) goto L_0x0108
            if (r0 == 0) goto L_0x00f2
            java.lang.Object r5 = r2.second
            d40$f r5 = (defpackage.d40.f) r5
            int r5 = r5.compareTo(r0)
            if (r5 <= 0) goto L_0x0108
        L_0x00f2:
            if (r1 == r12) goto L_0x00f6
            r10[r1] = r16
        L_0x00f6:
            java.lang.Object r0 = r2.first
            h40$a r0 = (defpackage.h40.a) r0
            r10[r11] = r0
            java.lang.Object r0 = r2.second
            d40$f r0 = (defpackage.d40.f) r0
            r1 = r11
            goto L_0x0108
        L_0x0102:
            r13 = r20
            goto L_0x0108
        L_0x0105:
            r13 = r20
            r4 = 2
        L_0x0108:
            int r11 = r11 + 1
            r20 = r13
            goto L_0x00bc
        L_0x010d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d40.B(f40$a, int[][][], int[], d40$c):h40$a[]");
    }

    /* access modifiers changed from: protected */
    public Pair<h40.a, b> C(p00 p00, int[][] iArr, int i, c cVar, boolean z) {
        p00 p002 = p00;
        c cVar2 = cVar;
        h40.a aVar = null;
        b bVar = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < p002.e; i4++) {
            o00 a2 = p002.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a2.e; i5++) {
                if (u(iArr2[i5], cVar2.C)) {
                    b bVar2 = new b(a2.a(i5), cVar2, iArr2[i5]);
                    if ((bVar2.e || cVar2.w) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        o00 a3 = p002.a(i2);
        if (!cVar2.B && !cVar2.A && z) {
            int[] o = o(a3, iArr[i2], cVar2.v, cVar2.x, cVar2.y, cVar2.z);
            if (o.length > 0) {
                aVar = new h40.a(a3, o);
            }
        }
        if (aVar == null) {
            aVar = new h40.a(a3, i3);
        }
        q40.e(bVar);
        return Pair.create(aVar, bVar);
    }

    /* access modifiers changed from: protected */
    public h40.a E(int i, p00 p00, int[][] iArr, c cVar) {
        o00 o00 = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < p00.e; i4++) {
            o00 a2 = p00.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a2.e; i5++) {
                if (u(iArr2[i5], cVar.C)) {
                    int i6 = (a2.a(i5).g & 1) != 0 ? 2 : 1;
                    if (u(iArr2[i5], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i3) {
                        o00 = a2;
                        i2 = i5;
                        i3 = i6;
                    }
                }
            }
        }
        if (o00 == null) {
            return null;
        }
        return new h40.a(o00, i2);
    }

    /* access modifiers changed from: protected */
    public Pair<h40.a, f> F(p00 p00, int[][] iArr, c cVar, String str) {
        p00 p002 = p00;
        c cVar2 = cVar;
        int i = -1;
        o00 o00 = null;
        f fVar = null;
        for (int i2 = 0; i2 < p002.e; i2++) {
            o00 a2 = p002.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < a2.e; i3++) {
                if (u(iArr2[i3], cVar2.C)) {
                    f fVar2 = new f(a2.a(i3), cVar2, iArr2[i3], str);
                    if (fVar2.e && (fVar == null || fVar2.compareTo(fVar) > 0)) {
                        o00 = a2;
                        i = i3;
                        fVar = fVar2;
                    }
                } else {
                    String str2 = str;
                }
            }
            String str3 = str;
        }
        if (o00 == null) {
            return null;
        }
        h40.a aVar = new h40.a(o00, i);
        q40.e(fVar);
        return Pair.create(aVar, fVar);
    }

    /* access modifiers changed from: protected */
    public h40.a G(p00 p00, int[][] iArr, int i, c cVar, boolean z) {
        h40.a A = (cVar.B || cVar.A || !z) ? null : A(p00, iArr, i, cVar);
        return A == null ? D(p00, iArr, cVar) : A;
    }

    /* access modifiers changed from: protected */
    public final Pair<x0[], h40[]> h(f40.a aVar, int[][][] iArr, int[] iArr2) {
        c cVar = this.c.get();
        int c2 = aVar.c();
        h40.a[] B = B(aVar, iArr, iArr2, cVar);
        int i = 0;
        while (true) {
            h40.a aVar2 = null;
            if (i >= c2) {
                break;
            }
            if (cVar.e(i)) {
                B[i] = null;
            } else {
                p00 e2 = aVar.e(i);
                if (cVar.g(i, e2)) {
                    e f2 = cVar.f(i, e2);
                    if (f2 != null) {
                        aVar2 = new h40.a(e2.a(f2.e), f2.f, f2.h, Integer.valueOf(f2.i));
                    }
                    B[i] = aVar2;
                }
            }
            i++;
        }
        h40[] a2 = this.b.a(B, a());
        x0[] x0VarArr = new x0[c2];
        for (int i2 = 0; i2 < c2; i2++) {
            x0VarArr[i2] = !cVar.e(i2) && (aVar.d(i2) == 6 || a2[i2] != null) ? x0.b : null;
        }
        x(aVar, iArr, x0VarArr, a2, cVar.D);
        return Pair.create(x0VarArr, a2);
    }
}
