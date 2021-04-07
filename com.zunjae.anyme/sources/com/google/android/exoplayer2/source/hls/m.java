package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.source.hls.o;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.t;
import com.google.android.exoplayer2.upstream.y;
import com.google.android.exoplayer2.z0;
import defpackage.c20;
import defpackage.e00;
import defpackage.g00;
import defpackage.x10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public final class m implements e00, o.a, c20.b {
    private final j e;
    private final c20 f;
    private final i g;
    private final y h;
    private final rs<?> i;
    private final t j;
    private final g00.a k;
    private final e l;
    private final IdentityHashMap<l00, Integer> m = new IdentityHashMap<>();
    private final r n = new r();
    private final zz o;
    private final boolean p;
    private final int q;
    private final boolean r;
    private e00.a s;
    private int t;
    private p00 u;
    private o[] v = new o[0];
    private o[] w = new o[0];
    private m00 x;
    private boolean y;

    public m(j jVar, c20 c20, i iVar, y yVar, rs<?> rsVar, t tVar, g00.a aVar, e eVar, zz zzVar, boolean z, int i2, boolean z2) {
        this.e = jVar;
        this.f = c20;
        this.g = iVar;
        this.h = yVar;
        this.i = rsVar;
        this.j = tVar;
        this.k = aVar;
        this.l = eVar;
        this.o = zzVar;
        this.p = z;
        this.q = i2;
        this.r = z2;
        this.x = zzVar.a(new m00[0]);
        aVar.z();
    }

    private void p(long j2, List<x10.a> list, List<o> list2, List<int[]> list3, Map<String, ns> map) {
        List<x10.a> list4 = list;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list4.get(i2).c;
            if (!hashSet.add(str)) {
                List<o> list5 = list2;
                List<int[]> list6 = list3;
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (v50.b(str, list4.get(i3).c)) {
                        x10.a aVar = list4.get(i3);
                        arrayList3.add(Integer.valueOf(i3));
                        arrayList.add(aVar.a);
                        arrayList2.add(aVar.b);
                        z &= aVar.b.j != null;
                    }
                }
                Uri[] uriArr = new Uri[0];
                v50.h(uriArr);
                o w2 = w(1, (Uri[]) arrayList.toArray(uriArr), (f0[]) arrayList2.toArray(new f0[0]), (f0) null, Collections.emptyList(), map, j2);
                list3.add(v50.E0(arrayList3));
                list2.add(w2);
                if (this.p && z) {
                    w2.Y(new o00[]{new o00((f0[]) arrayList2.toArray(new f0[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void t(defpackage.x10 r21, long r22, java.util.List<com.google.android.exoplayer2.source.hls.o> r24, java.util.List<int[]> r25, java.util.Map<java.lang.String, defpackage.ns> r26) {
        /*
            r20 = this;
            r0 = r21
            java.util.List<x10$b> r1 = r0.e
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x000e:
            java.util.List<x10$b> r7 = r0.e
            int r7 = r7.size()
            r8 = -1
            r9 = 2
            r10 = 1
            if (r4 >= r7) goto L_0x0047
            java.util.List<x10$b> r7 = r0.e
            java.lang.Object r7 = r7.get(r4)
            x10$b r7 = (defpackage.x10.b) r7
            com.google.android.exoplayer2.f0 r7 = r7.b
            int r11 = r7.s
            if (r11 > 0) goto L_0x0040
            java.lang.String r11 = r7.j
            java.lang.String r11 = defpackage.v50.B(r11, r9)
            if (r11 == 0) goto L_0x0030
            goto L_0x0040
        L_0x0030:
            java.lang.String r7 = r7.j
            java.lang.String r7 = defpackage.v50.B(r7, r10)
            if (r7 == 0) goto L_0x003d
            r2[r4] = r10
            int r6 = r6 + 1
            goto L_0x0044
        L_0x003d:
            r2[r4] = r8
            goto L_0x0044
        L_0x0040:
            r2[r4] = r9
            int r5 = r5 + 1
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0047:
            if (r5 <= 0) goto L_0x004c
            r1 = r5
            r4 = 1
            goto L_0x0053
        L_0x004c:
            if (r6 >= r1) goto L_0x0052
            int r1 = r1 - r6
            r4 = 0
            r5 = 1
            goto L_0x0054
        L_0x0052:
            r4 = 0
        L_0x0053:
            r5 = 0
        L_0x0054:
            android.net.Uri[] r13 = new android.net.Uri[r1]
            com.google.android.exoplayer2.f0[] r6 = new com.google.android.exoplayer2.f0[r1]
            int[] r7 = new int[r1]
            r11 = 0
            r12 = 0
        L_0x005c:
            java.util.List<x10$b> r14 = r0.e
            int r14 = r14.size()
            if (r11 >= r14) goto L_0x0088
            if (r4 == 0) goto L_0x006a
            r14 = r2[r11]
            if (r14 != r9) goto L_0x0085
        L_0x006a:
            if (r5 == 0) goto L_0x0070
            r14 = r2[r11]
            if (r14 == r10) goto L_0x0085
        L_0x0070:
            java.util.List<x10$b> r14 = r0.e
            java.lang.Object r14 = r14.get(r11)
            x10$b r14 = (defpackage.x10.b) r14
            android.net.Uri r15 = r14.a
            r13[r12] = r15
            com.google.android.exoplayer2.f0 r14 = r14.b
            r6[r12] = r14
            int r14 = r12 + 1
            r7[r12] = r11
            r12 = r14
        L_0x0085:
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0088:
            r2 = r6[r3]
            java.lang.String r2 = r2.j
            r12 = 0
            com.google.android.exoplayer2.f0 r15 = r0.h
            java.util.List<com.google.android.exoplayer2.f0> r4 = r0.i
            r11 = r20
            r14 = r6
            r16 = r4
            r17 = r26
            r18 = r22
            com.google.android.exoplayer2.source.hls.o r4 = r11.w(r12, r13, r14, r15, r16, r17, r18)
            r5 = r24
            r5.add(r4)
            r5 = r25
            r5.add(r7)
            r5 = r20
            boolean r7 = r5.p
            if (r7 == 0) goto L_0x0185
            if (r2 == 0) goto L_0x0185
            java.lang.String r7 = defpackage.v50.B(r2, r9)
            if (r7 == 0) goto L_0x00b8
            r7 = 1
            goto L_0x00b9
        L_0x00b8:
            r7 = 0
        L_0x00b9:
            java.lang.String r9 = defpackage.v50.B(r2, r10)
            if (r9 == 0) goto L_0x00c1
            r9 = 1
            goto L_0x00c2
        L_0x00c1:
            r9 = 0
        L_0x00c2:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r7 == 0) goto L_0x0123
            com.google.android.exoplayer2.f0[] r2 = new com.google.android.exoplayer2.f0[r1]
            r7 = 0
        L_0x00cc:
            if (r7 >= r1) goto L_0x00d9
            r12 = r6[r7]
            com.google.android.exoplayer2.f0 r12 = z(r12)
            r2[r7] = r12
            int r7 = r7 + 1
            goto L_0x00cc
        L_0x00d9:
            o00 r1 = new o00
            r1.<init>((com.google.android.exoplayer2.f0[]) r2)
            r11.add(r1)
            if (r9 == 0) goto L_0x0103
            com.google.android.exoplayer2.f0 r1 = r0.h
            if (r1 != 0) goto L_0x00ef
            java.util.List<x10$a> r1 = r0.f
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0103
        L_0x00ef:
            o00 r1 = new o00
            com.google.android.exoplayer2.f0[] r2 = new com.google.android.exoplayer2.f0[r10]
            r6 = r6[r3]
            com.google.android.exoplayer2.f0 r7 = r0.h
            com.google.android.exoplayer2.f0 r6 = x(r6, r7, r3)
            r2[r3] = r6
            r1.<init>((com.google.android.exoplayer2.f0[]) r2)
            r11.add(r1)
        L_0x0103:
            java.util.List<com.google.android.exoplayer2.f0> r0 = r0.i
            if (r0 == 0) goto L_0x013f
            r1 = 0
        L_0x0108:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x013f
            o00 r2 = new o00
            com.google.android.exoplayer2.f0[] r6 = new com.google.android.exoplayer2.f0[r10]
            java.lang.Object r7 = r0.get(r1)
            com.google.android.exoplayer2.f0 r7 = (com.google.android.exoplayer2.f0) r7
            r6[r3] = r7
            r2.<init>((com.google.android.exoplayer2.f0[]) r6)
            r11.add(r2)
            int r1 = r1 + 1
            goto L_0x0108
        L_0x0123:
            if (r9 == 0) goto L_0x0168
            com.google.android.exoplayer2.f0[] r2 = new com.google.android.exoplayer2.f0[r1]
            r7 = 0
        L_0x0128:
            if (r7 >= r1) goto L_0x0137
            r9 = r6[r7]
            com.google.android.exoplayer2.f0 r12 = r0.h
            com.google.android.exoplayer2.f0 r9 = x(r9, r12, r10)
            r2[r7] = r9
            int r7 = r7 + 1
            goto L_0x0128
        L_0x0137:
            o00 r0 = new o00
            r0.<init>((com.google.android.exoplayer2.f0[]) r2)
            r11.add(r0)
        L_0x013f:
            o00 r0 = new o00
            com.google.android.exoplayer2.f0[] r1 = new com.google.android.exoplayer2.f0[r10]
            java.lang.String r2 = "ID3"
            java.lang.String r6 = "application/id3"
            r7 = 0
            com.google.android.exoplayer2.f0 r2 = com.google.android.exoplayer2.f0.v(r2, r6, r7, r8, r7)
            r1[r3] = r2
            r0.<init>((com.google.android.exoplayer2.f0[]) r1)
            r11.add(r0)
            o00[] r1 = new defpackage.o00[r3]
            java.lang.Object[] r1 = r11.toArray(r1)
            o00[] r1 = (defpackage.o00[]) r1
            int[] r2 = new int[r10]
            int r0 = r11.indexOf(r0)
            r2[r3] = r0
            r4.Y(r1, r3, r2)
            goto L_0x0185
        L_0x0168:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unexpected codecs attribute: "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x017b
            java.lang.String r1 = r1.concat(r2)
            goto L_0x0181
        L_0x017b:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x0181:
            r0.<init>(r1)
            throw r0
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.m.t(x10, long, java.util.List, java.util.List, java.util.Map):void");
    }

    private void v(long j2) {
        x10 f2 = this.f.f();
        q40.e(f2);
        Map<String, ns> y2 = this.r ? y(f2.k) : Collections.emptyMap();
        boolean z = !f2.e.isEmpty();
        List<x10.a> list = f2.f;
        List<x10.a> list2 = f2.g;
        this.t = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            t(f2, j2, arrayList, arrayList2, y2);
        }
        p(j2, list, arrayList, arrayList2, y2);
        int i2 = 0;
        while (i2 < list2.size()) {
            x10.a aVar = list2.get(i2);
            int i3 = i2;
            o w2 = w(3, new Uri[]{aVar.a}, new f0[]{aVar.b}, (f0) null, Collections.emptyList(), y2, j2);
            arrayList2.add(new int[]{i3});
            arrayList.add(w2);
            w2.Y(new o00[]{new o00(aVar.b)}, 0, new int[0]);
            i2 = i3 + 1;
        }
        this.v = (o[]) arrayList.toArray(new o[0]);
        int[][] iArr = (int[][]) arrayList2.toArray(new int[0][]);
        o[] oVarArr = this.v;
        this.t = oVarArr.length;
        oVarArr[0].h0(true);
        for (o y3 : this.v) {
            y3.y();
        }
        this.w = this.v;
    }

    private o w(int i2, Uri[] uriArr, f0[] f0VarArr, f0 f0Var, List<f0> list, Map<String, ns> map, long j2) {
        return new o(i2, this, new h(this.e, this.f, uriArr, f0VarArr, this.g, this.h, this.n, list), map, this.l, j2, f0Var, this.i, this.j, this.k, this.q);
    }

    private static f0 x(f0 f0Var, f0 f0Var2, boolean z) {
        String str;
        int i2;
        int i3;
        int i4;
        yx yxVar;
        String str2;
        String str3;
        f0 f0Var3 = f0Var;
        f0 f0Var4 = f0Var2;
        if (f0Var4 != null) {
            String str4 = f0Var4.j;
            yx yxVar2 = f0Var4.k;
            int i5 = f0Var4.z;
            int i6 = f0Var4.g;
            int i7 = f0Var4.h;
            String str5 = f0Var4.E;
            str3 = f0Var4.f;
            str2 = str4;
            yxVar = yxVar2;
            i4 = i5;
            i3 = i6;
            i2 = i7;
            str = str5;
        } else {
            String B = v50.B(f0Var3.j, 1);
            yx yxVar3 = f0Var3.k;
            if (z) {
                int i8 = f0Var3.z;
                str2 = B;
                i4 = i8;
                i3 = f0Var3.g;
                yxVar = yxVar3;
                i2 = f0Var3.h;
                str = f0Var3.E;
                str3 = f0Var3.f;
            } else {
                str2 = B;
                str3 = null;
                str = null;
                yxVar = yxVar3;
                i4 = -1;
                i3 = 0;
                i2 = 0;
            }
        }
        return f0.m(f0Var3.e, str3, f0Var3.l, e50.e(str2), str2, yxVar, z ? f0Var3.i : -1, i4, -1, (List<byte[]>) null, i3, i2, str);
    }

    private static Map<String, ns> y(List<ns> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            ns nsVar = list.get(i2);
            String str = nsVar.g;
            i2++;
            int i3 = i2;
            while (i3 < arrayList.size()) {
                ns nsVar2 = (ns) arrayList.get(i3);
                if (TextUtils.equals(nsVar2.g, str)) {
                    nsVar = nsVar.f(nsVar2);
                    arrayList.remove(i3);
                } else {
                    i3++;
                }
            }
            hashMap.put(str, nsVar);
        }
        return hashMap;
    }

    private static f0 z(f0 f0Var) {
        String B = v50.B(f0Var.j, 2);
        return f0.F(f0Var.e, f0Var.f, f0Var.l, e50.e(B), B, f0Var.k, f0Var.i, f0Var.r, f0Var.s, f0Var.t, (List<byte[]>) null, f0Var.g, f0Var.h);
    }

    /* renamed from: A */
    public void j(o oVar) {
        this.s.j(this);
    }

    public void B() {
        this.f.b(this);
        for (o a0 : this.v) {
            a0.a0();
        }
        this.s = null;
        this.k.A();
    }

    public void a() {
        int i2 = this.t - 1;
        this.t = i2;
        if (i2 <= 0) {
            int i3 = 0;
            for (o s2 : this.v) {
                i3 += s2.s().e;
            }
            o00[] o00Arr = new o00[i3];
            int i4 = 0;
            for (o oVar : this.v) {
                int i5 = oVar.s().e;
                int i6 = 0;
                while (i6 < i5) {
                    o00Arr[i4] = oVar.s().a(i6);
                    i6++;
                    i4++;
                }
            }
            this.u = new p00(o00Arr);
            this.s.m(this);
        }
    }

    public long b() {
        return this.x.b();
    }

    public boolean c(long j2) {
        if (this.u != null) {
            return this.x.c(j2);
        }
        for (o y2 : this.v) {
            y2.y();
        }
        return false;
    }

    public boolean d() {
        return this.x.d();
    }

    public long e(long j2, z0 z0Var) {
        return j2;
    }

    public void f() {
        this.s.j(this);
    }

    public long g() {
        return this.x.g();
    }

    public void h(long j2) {
        this.x.h(j2);
    }

    public boolean i(Uri uri, long j2) {
        boolean z = true;
        for (o W : this.v) {
            z &= W.W(uri, j2);
        }
        this.s.j(this);
        return z;
    }

    public long k(h40[] h40Arr, boolean[] zArr, l00[] l00Arr, boolean[] zArr2, long j2) {
        h40[] h40Arr2 = h40Arr;
        l00[] l00Arr2 = l00Arr;
        int[] iArr = new int[h40Arr2.length];
        int[] iArr2 = new int[h40Arr2.length];
        for (int i2 = 0; i2 < h40Arr2.length; i2++) {
            iArr[i2] = l00Arr2[i2] == null ? -1 : this.m.get(l00Arr2[i2]).intValue();
            iArr2[i2] = -1;
            if (h40Arr2[i2] != null) {
                o00 a = h40Arr2[i2].a();
                int i3 = 0;
                while (true) {
                    o[] oVarArr = this.v;
                    if (i3 >= oVarArr.length) {
                        break;
                    } else if (oVarArr[i3].s().b(a) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.m.clear();
        int length = h40Arr2.length;
        l00[] l00Arr3 = new l00[length];
        l00[] l00Arr4 = new l00[h40Arr2.length];
        h40[] h40Arr3 = new h40[h40Arr2.length];
        o[] oVarArr2 = new o[this.v.length];
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        while (i5 < this.v.length) {
            for (int i6 = 0; i6 < h40Arr2.length; i6++) {
                h40 h40 = null;
                l00Arr4[i6] = iArr[i6] == i5 ? l00Arr2[i6] : null;
                if (iArr2[i6] == i5) {
                    h40 = h40Arr2[i6];
                }
                h40Arr3[i6] = h40;
            }
            o oVar = this.v[i5];
            o oVar2 = oVar;
            int i7 = length;
            int i8 = i5;
            int i9 = i4;
            h40[] h40Arr4 = h40Arr3;
            o[] oVarArr3 = oVarArr2;
            boolean e0 = oVar.e0(h40Arr3, zArr, l00Arr4, zArr2, j2, z);
            int i10 = 0;
            boolean z2 = false;
            while (true) {
                boolean z3 = true;
                if (i10 >= h40Arr2.length) {
                    break;
                }
                l00 l00 = l00Arr4[i10];
                if (iArr2[i10] == i8) {
                    q40.e(l00);
                    l00Arr3[i10] = l00;
                    this.m.put(l00, Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i10] == i8) {
                    if (l00 != null) {
                        z3 = false;
                    }
                    q40.f(z3);
                }
                i10++;
            }
            if (z2) {
                oVarArr3[i9] = oVar2;
                i4 = i9 + 1;
                if (i9 == 0) {
                    oVar2.h0(true);
                    if (!e0) {
                        o[] oVarArr4 = this.w;
                        if (oVarArr4.length != 0) {
                            if (oVar2 == oVarArr4[0]) {
                            }
                            this.n.b();
                            z = true;
                        }
                    }
                    this.n.b();
                    z = true;
                } else {
                    oVar2.h0(false);
                }
            } else {
                i4 = i9;
            }
            i5 = i8 + 1;
            oVarArr2 = oVarArr3;
            length = i7;
            h40Arr3 = h40Arr4;
            l00Arr2 = l00Arr;
        }
        System.arraycopy(l00Arr3, 0, l00Arr2, 0, length);
        o[] oVarArr5 = (o[]) v50.p0(oVarArr2, i4);
        this.w = oVarArr5;
        this.x = this.o.a(oVarArr5);
        return j2;
    }

    public void l(Uri uri) {
        this.f.i(uri);
    }

    public void n() {
        for (o n2 : this.v) {
            n2.n();
        }
    }

    public long o(long j2) {
        o[] oVarArr = this.w;
        if (oVarArr.length > 0) {
            boolean d0 = oVarArr[0].d0(j2, false);
            int i2 = 1;
            while (true) {
                o[] oVarArr2 = this.w;
                if (i2 >= oVarArr2.length) {
                    break;
                }
                oVarArr2[i2].d0(j2, d0);
                i2++;
            }
            if (d0) {
                this.n.b();
            }
        }
        return j2;
    }

    public long q() {
        if (this.y) {
            return -9223372036854775807L;
        }
        this.k.C();
        this.y = true;
        return -9223372036854775807L;
    }

    public void r(e00.a aVar, long j2) {
        this.s = aVar;
        this.f.j(this);
        v(j2);
    }

    public p00 s() {
        p00 p00 = this.u;
        q40.e(p00);
        return p00;
    }

    public void u(long j2, boolean z) {
        for (o u2 : this.w) {
            u2.u(j2, z);
        }
    }
}
