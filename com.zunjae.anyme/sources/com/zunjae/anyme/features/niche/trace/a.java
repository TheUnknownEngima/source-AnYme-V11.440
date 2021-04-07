package com.zunjae.anyme.features.niche.trace;

import com.google.gson.annotations.SerializedName;

public final class a {
    @SerializedName("episode")
    private final Object a;
    @SerializedName("filename")
    private final Object b;
    @SerializedName("from")
    private final Object c;
    @SerializedName("is_adult")
    private final Object d;
    @SerializedName("mal_id")
    private final Object e;
    @SerializedName("anilist_id")
    private final int f;
    @SerializedName("similarity")
    private final Object g;
    @SerializedName("title_romaji")
    private final Object h;
    @SerializedName("to")
    private final Object i;
    @SerializedName("at")
    private final Object j;
    @SerializedName("tokenthumb")
    private final Object k;

    public a() {
        this((Object) null, (Object) null, (Object) null, (Object) null, (Object) null, 0, (Object) null, (Object) null, (Object) null, (Object) null, (Object) null, 2047, (r62) null);
    }

    public a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        v62.e(obj, "episode");
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = i2;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.j = obj9;
        this.k = obj10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18, int r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24, int r25, defpackage.r62 r26) {
        /*
            r13 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x000d
            r1 = r3
            goto L_0x000e
        L_0x000d:
            r1 = r14
        L_0x000e:
            r4 = r0 & 2
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0016
            r4 = r5
            goto L_0x0017
        L_0x0016:
            r4 = r15
        L_0x0017:
            r6 = r0 & 4
            r7 = 0
            if (r6 == 0) goto L_0x0022
            java.lang.Double r6 = java.lang.Double.valueOf(r7)
            goto L_0x0024
        L_0x0022:
            r6 = r16
        L_0x0024:
            r9 = r0 & 8
            if (r9 == 0) goto L_0x002b
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            goto L_0x002d
        L_0x002b:
            r9 = r17
        L_0x002d:
            r10 = r0 & 16
            if (r10 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r3 = r18
        L_0x0034:
            r10 = r0 & 32
            if (r10 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r2 = r19
        L_0x003b:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0044
            java.lang.Double r10 = java.lang.Double.valueOf(r7)
            goto L_0x0046
        L_0x0044:
            r10 = r20
        L_0x0046:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004c
            r11 = r5
            goto L_0x004e
        L_0x004c:
            r11 = r21
        L_0x004e:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0057
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            goto L_0x0059
        L_0x0057:
            r7 = r22
        L_0x0059:
            r8 = r0 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x005f
            r8 = r5
            goto L_0x0061
        L_0x005f:
            r8 = r23
        L_0x0061:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r5 = r24
        L_0x0068:
            r14 = r13
            r15 = r1
            r16 = r4
            r17 = r6
            r18 = r9
            r19 = r3
            r20 = r2
            r21 = r10
            r22 = r11
            r23 = r7
            r24 = r8
            r25 = r5
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.niche.trace.a.<init>(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, int, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, int, r62):void");
    }

    public final String a() {
        return "https://trace.moe/thumbnail.php?anilist_id=" + this.f + "&file=" + this.b + "&t=" + this.j + "&token=" + this.k;
    }

    public final Object b() {
        return this.b;
    }

    public final Object c() {
        return this.h;
    }

    public final Object d() {
        return this.d;
    }

    public final int e() {
        if (v62.a(this.a, "")) {
            return -1;
        }
        Object obj = this.a;
        if (!(obj instanceof Double)) {
            obj = null;
        }
        Double d2 = (Double) obj;
        if (d2 != null) {
            return (int) d2.doubleValue();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && v62.a(this.c, aVar.c) && v62.a(this.d, aVar.d) && v62.a(this.e, aVar.e) && this.f == aVar.f && v62.a(this.g, aVar.g) && v62.a(this.h, aVar.h) && v62.a(this.i, aVar.i) && v62.a(this.j, aVar.j) && v62.a(this.k, aVar.k);
    }

    public final xy1 f() {
        Object obj = this.e;
        if (obj != null) {
            int doubleValue = (int) ((Double) obj).doubleValue();
            Object obj2 = this.h;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str = (String) obj2;
            if (str == null) {
                str = "AnYme";
            }
            return new xy1((long) doubleValue, str, "");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
    }

    public int hashCode() {
        Object obj = this.a;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.c;
        int hashCode3 = (hashCode2 + (obj3 != null ? obj3.hashCode() : 0)) * 31;
        Object obj4 = this.d;
        int hashCode4 = (hashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31;
        Object obj5 = this.e;
        int hashCode5 = (((hashCode4 + (obj5 != null ? obj5.hashCode() : 0)) * 31) + this.f) * 31;
        Object obj6 = this.g;
        int hashCode6 = (hashCode5 + (obj6 != null ? obj6.hashCode() : 0)) * 31;
        Object obj7 = this.h;
        int hashCode7 = (hashCode6 + (obj7 != null ? obj7.hashCode() : 0)) * 31;
        Object obj8 = this.i;
        int hashCode8 = (hashCode7 + (obj8 != null ? obj8.hashCode() : 0)) * 31;
        Object obj9 = this.j;
        int hashCode9 = (hashCode8 + (obj9 != null ? obj9.hashCode() : 0)) * 31;
        Object obj10 = this.k;
        if (obj10 != null) {
            i2 = obj10.hashCode();
        }
        return hashCode9 + i2;
    }

    public String toString() {
        return "SearchResultDoc(episode=" + this.a + ", filename=" + this.b + ", from=" + this.c + ", isAdult=" + this.d + ", malId=" + this.e + ", anilistId=" + this.f + ", similarity=" + this.g + ", titleRomaji=" + this.h + ", to=" + this.i + ", at=" + this.j + ", tokenthumb=" + this.k + ")";
    }
}
