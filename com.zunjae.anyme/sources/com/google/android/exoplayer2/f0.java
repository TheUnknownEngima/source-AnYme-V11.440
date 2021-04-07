package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.video.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final String E;
    public final int F;
    public final Class<? extends ts> G;
    private int H;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final yx k;
    public final String l;
    public final String m;
    public final int n;
    public final List<byte[]> o;
    public final ns p;
    public final long q;
    public final int r;
    public final int s;
    public final float t;
    public final int u;
    public final float v;
    public final int w;
    public final byte[] x;
    public final i y;
    public final int z;

    class a implements Parcelable.Creator<f0> {
        a() {
        }

        /* renamed from: a */
        public f0 createFromParcel(Parcel parcel) {
            return new f0(parcel);
        }

        /* renamed from: b */
        public f0[] newArray(int i) {
            return new f0[i];
        }
    }

    f0(Parcel parcel) {
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readString();
        this.k = (yx) parcel.readParcelable(yx.class.getClassLoader());
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        int readInt = parcel.readInt();
        this.o = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.o.add(parcel.createByteArray());
        }
        this.p = (ns) parcel.readParcelable(ns.class.getClassLoader());
        this.q = parcel.readLong();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readFloat();
        this.u = parcel.readInt();
        this.v = parcel.readFloat();
        this.x = v50.t0(parcel) ? parcel.createByteArray() : null;
        this.w = parcel.readInt();
        this.y = (i) parcel.readParcelable(i.class.getClassLoader());
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = parcel.readString();
        this.F = parcel.readInt();
        this.G = null;
    }

    f0(String str, String str2, int i2, int i3, int i4, String str3, yx yxVar, String str4, String str5, int i5, List<byte[]> list, ns nsVar, long j2, int i6, int i7, float f2, int i8, float f3, byte[] bArr, int i9, i iVar, int i10, int i11, int i12, int i13, int i14, String str6, int i15, Class<? extends ts> cls) {
        this.e = str;
        this.f = str2;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str3;
        this.k = yxVar;
        this.l = str4;
        this.m = str5;
        this.n = i5;
        this.o = list == null ? Collections.emptyList() : list;
        this.p = nsVar;
        this.q = j2;
        this.r = i6;
        this.s = i7;
        this.t = f2;
        int i16 = 0;
        int i17 = i8;
        this.u = i17 == -1 ? 0 : i17;
        this.v = f3 == -1.0f ? 1.0f : f3;
        this.x = bArr;
        this.w = i9;
        this.y = iVar;
        this.z = i10;
        this.A = i11;
        this.B = i12;
        int i18 = i13;
        this.C = i18 == -1 ? 0 : i18;
        int i19 = i14;
        this.D = i19 != -1 ? i19 : i16;
        this.E = v50.m0(str6);
        this.F = i15;
        this.G = cls;
    }

    public static f0 D(String str, String str2, String str3, int i2, int i3, String str4, int i4, ns nsVar, long j2, List<byte[]> list) {
        return new f0(str, (String) null, i3, 0, i2, str3, (yx) null, (String) null, str2, -1, list, nsVar, j2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (i) null, -1, -1, -1, -1, -1, str4, i4, (Class<? extends ts>) null);
    }

    public static f0 E(String str, String str2, String str3, int i2, int i3, String str4, ns nsVar, long j2) {
        return D(str, str2, str3, i2, i3, str4, -1, nsVar, j2, Collections.emptyList());
    }

    public static f0 F(String str, String str2, String str3, String str4, String str5, yx yxVar, int i2, int i3, int i4, float f2, List<byte[]> list, int i5, int i6) {
        return new f0(str, str2, i5, i6, i2, str5, yxVar, str3, str4, -1, list, (ns) null, Long.MAX_VALUE, i3, i4, f2, -1, -1.0f, (byte[]) null, -1, (i) null, -1, -1, -1, -1, -1, (String) null, -1, (Class<? extends ts>) null);
    }

    public static f0 H(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, ns nsVar) {
        return I(str, str2, str3, i2, i3, i4, i5, f2, list, i6, f3, (byte[]) null, -1, (i) null, nsVar);
    }

    public static f0 I(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, i iVar, ns nsVar) {
        return new f0(str, (String) null, 0, 0, i2, str3, (yx) null, (String) null, str2, i3, list, nsVar, Long.MAX_VALUE, i4, i5, f2, i6, f3, bArr, i7, iVar, -1, -1, -1, -1, -1, (String) null, -1, (Class<? extends ts>) null);
    }

    public static f0 m(String str, String str2, String str3, String str4, String str5, yx yxVar, int i2, int i3, int i4, List<byte[]> list, int i5, int i6, String str6) {
        return new f0(str, str2, i5, i6, i2, str5, yxVar, str3, str4, -1, list, (ns) null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (i) null, i3, i4, -1, -1, -1, str6, -1, (Class<? extends ts>) null);
    }

    public static f0 n(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, List<byte[]> list, ns nsVar, int i9, String str4, yx yxVar) {
        return new f0(str, (String) null, i9, 0, i2, str3, yxVar, (String) null, str2, i3, list, nsVar, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (i) null, i4, i5, i6, i7, i8, str4, -1, (Class<? extends ts>) null);
    }

    public static f0 o(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, ns nsVar, int i7, String str4) {
        return n(str, str2, str3, i2, i3, i4, i5, i6, -1, -1, list, nsVar, i7, str4, (yx) null);
    }

    public static f0 p(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, ns nsVar, int i6, String str4) {
        return o(str, str2, str3, i2, i3, i4, i5, -1, list, nsVar, i6, str4);
    }

    public static f0 q(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, String str6) {
        return new f0(str, str2, i3, i4, i2, str5, (yx) null, str3, str4, -1, (List<byte[]>) null, (ns) null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (i) null, -1, -1, -1, -1, -1, str6, -1, (Class<? extends ts>) null);
    }

    public static f0 s(String str, String str2, String str3, int i2, int i3, List<byte[]> list, String str4, ns nsVar) {
        return new f0(str, (String) null, i3, 0, i2, str3, (yx) null, (String) null, str2, -1, list, nsVar, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (i) null, -1, -1, -1, -1, -1, str4, -1, (Class<? extends ts>) null);
    }

    public static f0 u(String str, String str2, long j2) {
        return new f0(str, (String) null, 0, 0, -1, (String) null, (yx) null, (String) null, str2, -1, (List<byte[]>) null, (ns) null, j2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (i) null, -1, -1, -1, -1, -1, (String) null, -1, (Class<? extends ts>) null);
    }

    public static f0 v(String str, String str2, String str3, int i2, ns nsVar) {
        return new f0(str, (String) null, 0, 0, i2, str3, (yx) null, (String) null, str2, -1, (List<byte[]>) null, nsVar, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (i) null, -1, -1, -1, -1, -1, (String) null, -1, (Class<? extends ts>) null);
    }

    public static f0 w(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, String str6) {
        return x(str, str2, str3, str4, str5, i2, i3, i4, str6, -1);
    }

    public static f0 x(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, String str6, int i5) {
        return new f0(str, str2, i3, i4, i2, str5, (yx) null, str3, str4, -1, (List<byte[]>) null, (ns) null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (i) null, -1, -1, -1, -1, -1, str6, i5, (Class<? extends ts>) null);
    }

    public static f0 y(String str, String str2, int i2, String str3) {
        return z(str, str2, i2, str3, (ns) null);
    }

    public static f0 z(String str, String str2, int i2, String str3, ns nsVar) {
        return D(str, str2, (String) null, -1, i2, str3, -1, nsVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public int J() {
        int i2;
        int i3 = this.r;
        if (i3 == -1 || (i2 = this.s) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public boolean M(f0 f0Var) {
        if (this.o.size() != f0Var.o.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            if (!Arrays.equals(this.o.get(i2), f0Var.o.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public f0 a(ns nsVar, yx yxVar) {
        if (nsVar != this.p) {
            yx yxVar2 = yxVar;
        } else if (yxVar == this.k) {
            return this;
        }
        return new f0(this.e, this.f, this.g, this.h, this.i, this.j, yxVar, this.l, this.m, this.n, this.o, nsVar, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public f0 b(int i2) {
        return new f0(this.e, this.f, this.g, this.h, i2, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public f0 c(String str, String str2, String str3, String str4, yx yxVar, int i2, int i3, int i4, int i5, int i6, String str5) {
        yx yxVar2 = this.k;
        yx yxVar3 = yxVar;
        return new f0(str, str2, i6, this.h, i2, str4, yxVar2 != null ? yxVar2.b(yxVar3) : yxVar3, this.l, str3, this.n, this.o, this.p, this.q, i3, i4, this.t, this.u, this.v, this.x, this.w, this.y, i5, this.A, this.B, this.C, this.D, str5, this.F, this.G);
    }

    public f0 d(ns nsVar) {
        return a(nsVar, this.k);
    }

    public int describeContents() {
        return 0;
    }

    public f0 e(Class<? extends ts> cls) {
        return new f0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r3 = r8.H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r8 == 0) goto L_0x0105
            java.lang.Class<com.google.android.exoplayer2.f0> r2 = com.google.android.exoplayer2.f0.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L_0x0011
            goto L_0x0105
        L_0x0011:
            com.google.android.exoplayer2.f0 r8 = (com.google.android.exoplayer2.f0) r8
            int r2 = r7.H
            if (r2 == 0) goto L_0x001e
            int r3 = r8.H
            if (r3 == 0) goto L_0x001e
            if (r2 == r3) goto L_0x001e
            return r1
        L_0x001e:
            int r2 = r7.g
            int r3 = r8.g
            if (r2 != r3) goto L_0x0103
            int r2 = r7.h
            int r3 = r8.h
            if (r2 != r3) goto L_0x0103
            int r2 = r7.i
            int r3 = r8.i
            if (r2 != r3) goto L_0x0103
            int r2 = r7.n
            int r3 = r8.n
            if (r2 != r3) goto L_0x0103
            long r2 = r7.q
            long r4 = r8.q
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0103
            int r2 = r7.r
            int r3 = r8.r
            if (r2 != r3) goto L_0x0103
            int r2 = r7.s
            int r3 = r8.s
            if (r2 != r3) goto L_0x0103
            int r2 = r7.u
            int r3 = r8.u
            if (r2 != r3) goto L_0x0103
            int r2 = r7.w
            int r3 = r8.w
            if (r2 != r3) goto L_0x0103
            int r2 = r7.z
            int r3 = r8.z
            if (r2 != r3) goto L_0x0103
            int r2 = r7.A
            int r3 = r8.A
            if (r2 != r3) goto L_0x0103
            int r2 = r7.B
            int r3 = r8.B
            if (r2 != r3) goto L_0x0103
            int r2 = r7.C
            int r3 = r8.C
            if (r2 != r3) goto L_0x0103
            int r2 = r7.D
            int r3 = r8.D
            if (r2 != r3) goto L_0x0103
            int r2 = r7.F
            int r3 = r8.F
            if (r2 != r3) goto L_0x0103
            float r2 = r7.t
            float r3 = r8.t
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 != 0) goto L_0x0103
            float r2 = r7.v
            float r3 = r8.v
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 != 0) goto L_0x0103
            java.lang.Class<? extends ts> r2 = r7.G
            java.lang.Class<? extends ts> r3 = r8.G
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            java.lang.String r2 = r7.e
            java.lang.String r3 = r8.e
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            java.lang.String r2 = r7.f
            java.lang.String r3 = r8.f
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            java.lang.String r2 = r7.j
            java.lang.String r3 = r8.j
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            java.lang.String r2 = r7.l
            java.lang.String r3 = r8.l
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            java.lang.String r2 = r7.m
            java.lang.String r3 = r8.m
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            java.lang.String r2 = r7.E
            java.lang.String r3 = r8.E
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            byte[] r2 = r7.x
            byte[] r3 = r8.x
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L_0x0103
            yx r2 = r7.k
            yx r3 = r8.k
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            com.google.android.exoplayer2.video.i r2 = r7.y
            com.google.android.exoplayer2.video.i r3 = r8.y
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            ns r2 = r7.p
            ns r3 = r8.p
            boolean r2 = defpackage.v50.b(r2, r3)
            if (r2 == 0) goto L_0x0103
            boolean r8 = r7.M(r8)
            if (r8 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r0 = 0
        L_0x0104:
            return r0
        L_0x0105:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f0.equals(java.lang.Object):boolean");
    }

    public f0 f(float f2) {
        return new f0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, f2, this.u, this.v, this.x, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public f0 g(int i2, int i3) {
        return new f0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.w, this.y, this.z, this.A, this.B, i2, i3, this.E, this.F, this.G);
    }

    public f0 h(String str) {
        return new f0(this.e, str, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public int hashCode() {
        if (this.H == 0) {
            String str = this.e;
            int i2 = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str3 = this.j;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            yx yxVar = this.k;
            int hashCode4 = (hashCode3 + (yxVar == null ? 0 : yxVar.hashCode())) * 31;
            String str4 = this.l;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.m;
            int hashCode6 = (((((((((((((((((((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.n) * 31) + ((int) this.q)) * 31) + this.r) * 31) + this.s) * 31) + Float.floatToIntBits(this.t)) * 31) + this.u) * 31) + Float.floatToIntBits(this.v)) * 31) + this.w) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31;
            String str6 = this.E;
            int hashCode7 = (((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.F) * 31;
            Class<? extends ts> cls = this.G;
            if (cls != null) {
                i2 = cls.hashCode();
            }
            this.H = hashCode7 + i2;
        }
        return this.H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r6 = r1.E;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.f0 i(com.google.android.exoplayer2.f0 r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            if (r0 != r1) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.String r2 = r0.m
            int r2 = defpackage.e50.h(r2)
            java.lang.String r4 = r1.e
            java.lang.String r3 = r1.f
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            java.lang.String r3 = r0.f
        L_0x0016:
            r5 = r3
            java.lang.String r3 = r0.E
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L_0x001f
            if (r2 != r7) goto L_0x0026
        L_0x001f:
            java.lang.String r6 = r1.E
            if (r6 == 0) goto L_0x0026
            r31 = r6
            goto L_0x0028
        L_0x0026:
            r31 = r3
        L_0x0028:
            int r3 = r0.i
            r6 = -1
            if (r3 != r6) goto L_0x002f
            int r3 = r1.i
        L_0x002f:
            r8 = r3
            java.lang.String r3 = r0.j
            if (r3 != 0) goto L_0x0043
            java.lang.String r6 = r1.j
            java.lang.String r6 = defpackage.v50.B(r6, r2)
            java.lang.String[] r9 = defpackage.v50.B0(r6)
            int r9 = r9.length
            if (r9 != r7) goto L_0x0043
            r9 = r6
            goto L_0x0044
        L_0x0043:
            r9 = r3
        L_0x0044:
            yx r3 = r0.k
            if (r3 != 0) goto L_0x004b
            yx r3 = r1.k
            goto L_0x0051
        L_0x004b:
            yx r6 = r1.k
            yx r3 = r3.b(r6)
        L_0x0051:
            r10 = r3
            float r3 = r0.t
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0062
            r6 = 2
            if (r2 != r6) goto L_0x0062
            float r2 = r1.t
            r20 = r2
            goto L_0x0064
        L_0x0062:
            r20 = r3
        L_0x0064:
            int r2 = r0.g
            int r3 = r1.g
            r6 = r2 | r3
            int r2 = r0.h
            int r3 = r1.h
            r7 = r2 | r3
            ns r1 = r1.p
            ns r2 = r0.p
            ns r15 = defpackage.ns.d(r1, r2)
            com.google.android.exoplayer2.f0 r1 = new com.google.android.exoplayer2.f0
            r3 = r1
            java.lang.String r11 = r0.l
            java.lang.String r12 = r0.m
            int r13 = r0.n
            java.util.List<byte[]> r14 = r0.o
            r35 = r1
            long r1 = r0.q
            r16 = r1
            int r1 = r0.r
            r18 = r1
            int r1 = r0.s
            r19 = r1
            int r1 = r0.u
            r21 = r1
            float r1 = r0.v
            r22 = r1
            byte[] r1 = r0.x
            r23 = r1
            int r1 = r0.w
            r24 = r1
            com.google.android.exoplayer2.video.i r1 = r0.y
            r25 = r1
            int r1 = r0.z
            r26 = r1
            int r1 = r0.A
            r27 = r1
            int r1 = r0.B
            r28 = r1
            int r1 = r0.C
            r29 = r1
            int r1 = r0.D
            r30 = r1
            int r1 = r0.F
            r32 = r1
            java.lang.Class<? extends ts> r1 = r0.G
            r33 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f0.i(com.google.android.exoplayer2.f0):com.google.android.exoplayer2.f0");
    }

    public f0 j(int i2) {
        return new f0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, i2, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public f0 k(yx yxVar) {
        return a(this.p, yxVar);
    }

    public f0 l(long j2) {
        return new f0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, j2, this.r, this.s, this.t, this.u, this.v, this.x, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public String toString() {
        String str = this.e;
        String str2 = this.f;
        String str3 = this.l;
        String str4 = this.m;
        String str5 = this.j;
        int i2 = this.i;
        String str6 = this.E;
        int i3 = this.r;
        int i4 = this.s;
        float f2 = this.t;
        int i5 = this.z;
        int i6 = this.A;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        boolean z2 = false;
        parcel.writeParcelable(this.k, 0);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        int size = this.o.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.o.get(i3));
        }
        parcel.writeParcelable(this.p, 0);
        parcel.writeLong(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeFloat(this.t);
        parcel.writeInt(this.u);
        parcel.writeFloat(this.v);
        if (this.x != null) {
            z2 = true;
        }
        v50.J0(parcel, z2);
        byte[] bArr = this.x;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.w);
        parcel.writeParcelable(this.y, i2);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
        parcel.writeString(this.E);
        parcel.writeInt(this.F);
    }
}
