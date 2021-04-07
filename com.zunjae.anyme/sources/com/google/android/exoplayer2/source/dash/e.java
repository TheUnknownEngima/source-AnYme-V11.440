package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.j;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.z0;
import defpackage.e00;
import defpackage.g00;
import defpackage.m00;
import defpackage.y00;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class e implements e00, m00.a<y00<c>>, y00.b<c> {
    private static final Pattern A = Pattern.compile("CC([1-4])=(.+)");
    final int e;
    private final c.a f;
    private final y g;
    private final rs<?> h;
    private final t i;
    private final long j;
    private final v k;
    private final com.google.android.exoplayer2.upstream.e l;
    private final p00 m;
    private final a[] n;
    private final zz o;
    private final j p;
    private final IdentityHashMap<y00<c>, j.c> q = new IdentityHashMap<>();
    private final g00.a r;
    private e00.a s;
    private y00<c>[] t = H(0);
    private i[] u = new i[0];
    private m00 v;
    private h10 w;
    private int x;
    private List<k10> y;
    private boolean z;

    private static final class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        private a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.b = i;
            this.a = iArr;
            this.c = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.d = i6;
        }

        public static a a(int[] iArr, int i) {
            return new a(3, 1, iArr, i, -1, -1, -1);
        }

        public static a b(int[] iArr, int i) {
            return new a(4, 1, iArr, i, -1, -1, -1);
        }

        public static a c(int i) {
            return new a(4, 2, new int[0], -1, -1, -1, i);
        }

        public static a d(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public e(int i2, h10 h10, int i3, c.a aVar, y yVar, rs<?> rsVar, t tVar, g00.a aVar2, long j2, v vVar, com.google.android.exoplayer2.upstream.e eVar, zz zzVar, j.b bVar) {
        this.e = i2;
        this.w = h10;
        this.x = i3;
        this.f = aVar;
        this.g = yVar;
        this.h = rsVar;
        this.i = tVar;
        this.r = aVar2;
        this.j = j2;
        this.k = vVar;
        this.l = eVar;
        this.o = zzVar;
        this.p = new j(h10, bVar, eVar);
        this.v = zzVar.a(this.t);
        l10 d = h10.d(i3);
        List<k10> list = d.d;
        this.y = list;
        Pair<p00, a[]> x2 = x(rsVar, d.c, list);
        this.m = (p00) x2.first;
        this.n = (a[]) x2.second;
        aVar2.z();
    }

    private static j10 A(List<j10> list) {
        return z(list, "http://dashif.org/guidelines/trickmode");
    }

    private static f0[] B(List<g10> list, int[] iArr) {
        for (int i2 : iArr) {
            g10 g10 = list.get(i2);
            List<j10> list2 = list.get(i2).d;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                j10 j10 = list2.get(i3);
                if ("urn:scte:dash:cc:cea-608:2015".equals(j10.a)) {
                    String str = j10.b;
                    if (str == null) {
                        return new f0[]{i(g10.a)};
                    }
                    String[] z0 = v50.z0(str, ";");
                    f0[] f0VarArr = new f0[z0.length];
                    for (int i4 = 0; i4 < z0.length; i4++) {
                        Matcher matcher = A.matcher(z0[i4]);
                        if (!matcher.matches()) {
                            return new f0[]{i(g10.a)};
                        }
                        f0VarArr[i4] = p(g10.a, matcher.group(2), Integer.parseInt(matcher.group(1)));
                    }
                    return f0VarArr;
                }
            }
        }
        return new f0[0];
    }

    private static int[][] C(List<g10> list) {
        int i2;
        j10 y2;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i3 = 0; i3 < size; i3++) {
            sparseIntArray.put(list.get(i3).a, i3);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i3));
            arrayList.add(arrayList2);
            sparseArray.put(i3, arrayList2);
        }
        for (int i4 = 0; i4 < size; i4++) {
            g10 g10 = list.get(i4);
            j10 A2 = A(g10.e);
            if (A2 == null) {
                A2 = A(g10.f);
            }
            if (A2 == null || (i2 = sparseIntArray.get(Integer.parseInt(A2.b), -1)) == -1) {
                i2 = i4;
            }
            if (i2 == i4 && (y2 = y(g10.f)) != null) {
                for (String parseInt : v50.z0(y2.b, ",")) {
                    int i5 = sparseIntArray.get(Integer.parseInt(parseInt), -1);
                    if (i5 != -1) {
                        i2 = Math.min(i2, i5);
                    }
                }
            }
            if (i2 != i4) {
                List list2 = (List) sparseArray.get(i4);
                List list3 = (List) sparseArray.get(i2);
                list3.addAll(list2);
                sparseArray.put(i4, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i6 = 0; i6 < size2; i6++) {
            iArr[i6] = v50.E0((List) arrayList.get(i6));
            Arrays.sort(iArr[i6]);
        }
        return iArr;
    }

    private int D(int i2, int[] iArr) {
        int i3 = iArr[i2];
        if (i3 == -1) {
            return -1;
        }
        int i4 = this.n[i3].e;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 == i4 && this.n[i6].c == 0) {
                return i5;
            }
        }
        return -1;
    }

    private int[] E(h40[] h40Arr) {
        int[] iArr = new int[h40Arr.length];
        for (int i2 = 0; i2 < h40Arr.length; i2++) {
            if (h40Arr[i2] != null) {
                iArr[i2] = this.m.b(h40Arr[i2].a());
            } else {
                iArr[i2] = -1;
            }
        }
        return iArr;
    }

    private static boolean F(List<g10> list, int[] iArr) {
        for (int i2 : iArr) {
            List<o10> list2 = list.get(i2).c;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (!list2.get(i3).d.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int G(int i2, List<g10> list, int[][] iArr, boolean[] zArr, f0[][] f0VarArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (F(list, iArr[i4])) {
                zArr[i4] = true;
                i3++;
            }
            f0VarArr[i4] = B(list, iArr[i4]);
            if (f0VarArr[i4].length != 0) {
                i3++;
            }
        }
        return i3;
    }

    private static y00<c>[] H(int i2) {
        return new y00[i2];
    }

    private void K(h40[] h40Arr, boolean[] zArr, l00[] l00Arr) {
        for (int i2 = 0; i2 < h40Arr.length; i2++) {
            if (h40Arr[i2] == null || !zArr[i2]) {
                if (l00Arr[i2] instanceof y00) {
                    l00Arr[i2].O(this);
                } else if (l00Arr[i2] instanceof y00.a) {
                    l00Arr[i2].c();
                }
                l00Arr[i2] = null;
            }
        }
    }

    private void L(h40[] h40Arr, l00[] l00Arr, int[] iArr) {
        for (int i2 = 0; i2 < h40Arr.length; i2++) {
            if ((l00Arr[i2] instanceof b00) || (l00Arr[i2] instanceof y00.a)) {
                int D = D(i2, iArr);
                if (!(D == -1 ? l00Arr[i2] instanceof b00 : (l00Arr[i2] instanceof y00.a) && l00Arr[i2].e == l00Arr[D])) {
                    if (l00Arr[i2] instanceof y00.a) {
                        l00Arr[i2].c();
                    }
                    l00Arr[i2] = null;
                }
            }
        }
    }

    private void M(h40[] h40Arr, l00[] l00Arr, boolean[] zArr, long j2, int[] iArr) {
        for (int i2 = 0; i2 < h40Arr.length; i2++) {
            h40 h40 = h40Arr[i2];
            if (h40 != null) {
                if (l00Arr[i2] == null) {
                    zArr[i2] = true;
                    a aVar = this.n[iArr[i2]];
                    int i3 = aVar.c;
                    if (i3 == 0) {
                        l00Arr[i2] = w(aVar, h40, j2);
                    } else if (i3 == 2) {
                        l00Arr[i2] = new i(this.y.get(aVar.d), h40.a().a(0), this.w.d);
                    }
                } else if (l00Arr[i2] instanceof y00) {
                    ((c) l00Arr[i2].C()).b(h40);
                }
            }
        }
        for (int i4 = 0; i4 < h40Arr.length; i4++) {
            if (l00Arr[i4] == null && h40Arr[i4] != null) {
                a aVar2 = this.n[iArr[i4]];
                if (aVar2.c == 1) {
                    int D = D(i4, iArr);
                    if (D == -1) {
                        l00Arr[i4] = new b00();
                    } else {
                        l00Arr[i4] = l00Arr[D].Q(j2, aVar2.b);
                    }
                }
            }
        }
    }

    private static f0 i(int i2) {
        return p(i2, (String) null, -1);
    }

    private static f0 p(int i2, String str, int i3) {
        String str2;
        if (i3 != -1) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(":");
            sb.append(i3);
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 18);
        sb2.append(i2);
        sb2.append(":cea608");
        sb2.append(str2);
        return f0.D(sb2.toString(), "application/cea-608", (String) null, -1, 0, str, i3, (ns) null, Long.MAX_VALUE, (List<byte[]>) null);
    }

    private static void t(List<k10> list, o00[] o00Arr, a[] aVarArr, int i2) {
        int i3 = 0;
        while (i3 < list.size()) {
            o00Arr[i2] = new o00(f0.v(list.get(i3).a(), "application/x-emsg", (String) null, -1, (ns) null));
            aVarArr[i2] = a.c(i3);
            i3++;
            i2++;
        }
    }

    private static int v(rs<?> rsVar, List<g10> list, int[][] iArr, int i2, boolean[] zArr, f0[][] f0VarArr, o00[] o00Arr, a[] aVarArr) {
        int i3;
        int i4;
        List<g10> list2 = list;
        int i5 = i2;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int[] iArr2 = iArr[i6];
            ArrayList arrayList = new ArrayList();
            for (int i8 : iArr2) {
                arrayList.addAll(list.get(i8).c);
            }
            int size = arrayList.size();
            f0[] f0VarArr2 = new f0[size];
            for (int i9 = 0; i9 < size; i9++) {
                f0 f0Var = ((o10) arrayList.get(i9)).a;
                ns nsVar = f0Var.p;
                rs<?> rsVar2 = rsVar;
                if (nsVar != null) {
                    f0Var = f0Var.e(rsVar.b(nsVar));
                }
                f0VarArr2[i9] = f0Var;
            }
            rs<?> rsVar3 = rsVar;
            g10 g10 = list.get(iArr2[0]);
            int i10 = i7 + 1;
            if (zArr[i6]) {
                i3 = i10 + 1;
            } else {
                i3 = i10;
                i10 = -1;
            }
            if (f0VarArr[i6].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            o00Arr[i7] = new o00(f0VarArr2);
            aVarArr[i7] = a.d(g10.b, iArr2, i7, i10, i3);
            if (i10 != -1) {
                int i11 = g10.a;
                StringBuilder sb = new StringBuilder(16);
                sb.append(i11);
                sb.append(":emsg");
                o00Arr[i10] = new o00(f0.v(sb.toString(), "application/x-emsg", (String) null, -1, (ns) null));
                aVarArr[i10] = a.b(iArr2, i7);
            }
            if (i3 != -1) {
                o00Arr[i3] = new o00(f0VarArr[i6]);
                aVarArr[i3] = a.a(iArr2, i7);
            }
            i6++;
            i7 = i4;
        }
        return i7;
    }

    private y00<c> w(a aVar, h40 h40, long j2) {
        int i2;
        o00 o00;
        o00 o002;
        int i3;
        a aVar2 = aVar;
        boolean z2 = aVar2.f != -1;
        j.c cVar = null;
        if (z2) {
            o00 = this.m.a(aVar2.f);
            i2 = 1;
        } else {
            o00 = null;
            i2 = 0;
        }
        boolean z3 = aVar2.g != -1;
        if (z3) {
            o002 = this.m.a(aVar2.g);
            i2 += o002.e;
        } else {
            o002 = null;
        }
        f0[] f0VarArr = new f0[i2];
        int[] iArr = new int[i2];
        if (z2) {
            f0VarArr[0] = o00.a(0);
            iArr[0] = 4;
            i3 = 1;
        } else {
            i3 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z3) {
            for (int i4 = 0; i4 < o002.e; i4++) {
                f0VarArr[i3] = o002.a(i4);
                iArr[i3] = 3;
                arrayList.add(f0VarArr[i3]);
                i3++;
            }
        }
        if (this.w.d && z2) {
            cVar = this.p.k();
        }
        j.c cVar2 = cVar;
        j.c cVar3 = cVar2;
        y00 y00 = new y00(aVar2.b, iArr, f0VarArr, this.f.a(this.k, this.w, this.x, aVar2.a, h40, aVar2.b, this.j, z2, arrayList, cVar2, this.g), this, this.l, j2, this.h, this.i, this.r);
        synchronized (this) {
            this.q.put(y00, cVar3);
        }
        return y00;
    }

    private static Pair<p00, a[]> x(rs<?> rsVar, List<g10> list, List<k10> list2) {
        int[][] C = C(list);
        int length = C.length;
        boolean[] zArr = new boolean[length];
        f0[][] f0VarArr = new f0[length][];
        int G = G(length, list, C, zArr, f0VarArr) + length + list2.size();
        o00[] o00Arr = new o00[G];
        a[] aVarArr = new a[G];
        t(list2, o00Arr, aVarArr, v(rsVar, list, C, length, zArr, f0VarArr, o00Arr, aVarArr));
        return Pair.create(new p00(o00Arr), aVarArr);
    }

    private static j10 y(List<j10> list) {
        return z(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static j10 z(List<j10> list, String str) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            j10 j10 = list.get(i2);
            if (str.equals(j10.a)) {
                return j10;
            }
        }
        return null;
    }

    /* renamed from: I */
    public void j(y00<c> y00) {
        this.s.j(this);
    }

    public void J() {
        this.p.n();
        for (y00<c> O : this.t) {
            O.O(this);
        }
        this.s = null;
        this.r.A();
    }

    public void N(h10 h10, int i2) {
        this.w = h10;
        this.x = i2;
        this.p.p(h10);
        y00<c>[] y00Arr = this.t;
        if (y00Arr != null) {
            for (y00<c> C : y00Arr) {
                C.C().f(h10, i2);
            }
            this.s.j(this);
        }
        this.y = h10.d(i2).d;
        for (i iVar : this.u) {
            Iterator<k10> it = this.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k10 next = it.next();
                if (next.a().equals(iVar.b())) {
                    boolean z2 = true;
                    int e2 = h10.e() - 1;
                    if (!h10.d || i2 != e2) {
                        z2 = false;
                    }
                    iVar.d(next, z2);
                }
            }
        }
    }

    public long b() {
        return this.v.b();
    }

    public boolean c(long j2) {
        return this.v.c(j2);
    }

    public boolean d() {
        return this.v.d();
    }

    public long e(long j2, z0 z0Var) {
        for (y00<c> y00 : this.t) {
            if (y00.e == 2) {
                return y00.e(j2, z0Var);
            }
        }
        return j2;
    }

    public synchronized void f(y00<c> y00) {
        j.c remove = this.q.remove(y00);
        if (remove != null) {
            remove.l();
        }
    }

    public long g() {
        return this.v.g();
    }

    public void h(long j2) {
        this.v.h(j2);
    }

    public long k(h40[] h40Arr, boolean[] zArr, l00[] l00Arr, boolean[] zArr2, long j2) {
        int[] E = E(h40Arr);
        K(h40Arr, zArr, l00Arr);
        L(h40Arr, l00Arr, E);
        M(h40Arr, l00Arr, zArr2, j2, E);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (y00 y00 : l00Arr) {
            if (y00 instanceof y00) {
                arrayList.add(y00);
            } else if (y00 instanceof i) {
                arrayList2.add((i) y00);
            }
        }
        y00<c>[] H = H(arrayList.size());
        this.t = H;
        arrayList.toArray(H);
        i[] iVarArr = new i[arrayList2.size()];
        this.u = iVarArr;
        arrayList2.toArray(iVarArr);
        this.v = this.o.a(this.t);
        return j2;
    }

    public void n() {
        this.k.a();
    }

    public long o(long j2) {
        for (y00<c> P : this.t) {
            P.P(j2);
        }
        for (i c : this.u) {
            c.c(j2);
        }
        return j2;
    }

    public long q() {
        if (this.z) {
            return -9223372036854775807L;
        }
        this.r.C();
        this.z = true;
        return -9223372036854775807L;
    }

    public void r(e00.a aVar, long j2) {
        this.s = aVar;
        aVar.m(this);
    }

    public p00 s() {
        return this.m;
    }

    public void u(long j2, boolean z2) {
        for (y00<c> u2 : this.t) {
            u2.u(j2, z2);
        }
    }
}
