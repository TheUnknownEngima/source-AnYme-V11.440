package com.zunjae.anyme.features.kanon;

import com.google.gson.annotations.SerializedName;

public final class j {
    @SerializedName("Episodes")
    private final Integer a;
    @SerializedName("ImageURL")
    private final String b;
    @SerializedName("KitsuId")
    private final Integer c;
    @SerializedName("MALId")
    private final int d;
    @SerializedName("PosterId")
    private final String e;
    @SerializedName("Score")
    private final Double f;
    @SerializedName("Title")
    private final String g;
    @SerializedName("Type")
    private final String h;
    @SerializedName("Username")
    private final String i;
    private ry1 j;

    public j() {
        this((Integer) null, (String) null, (Integer) null, 0, (String) null, (Double) null, (String) null, (String) null, (String) null, (ry1) null, 1023, (r62) null);
    }

    public j(Integer num, String str, Integer num2, int i2, String str2, Double d2, String str3, String str4, String str5, ry1 ry1) {
        this.a = num;
        this.b = str;
        this.c = num2;
        this.d = i2;
        this.e = str2;
        this.f = d2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = ry1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ j(java.lang.Integer r12, java.lang.String r13, java.lang.Integer r14, int r15, java.lang.String r16, java.lang.Double r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, defpackage.ry1 r21, int r22, defpackage.r62 r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x000d
            r1 = r3
            goto L_0x000e
        L_0x000d:
            r1 = r12
        L_0x000e:
            r4 = r0 & 2
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0016
            r4 = r5
            goto L_0x0017
        L_0x0016:
            r4 = r13
        L_0x0017:
            r6 = r0 & 4
            if (r6 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r3 = r14
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r2 = r15
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r5
            goto L_0x002b
        L_0x0029:
            r6 = r16
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0036
            r7 = 0
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            goto L_0x0038
        L_0x0036:
            r7 = r17
        L_0x0038:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003e
            r8 = r5
            goto L_0x0040
        L_0x003e:
            r8 = r18
        L_0x0040:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0046
            r9 = r5
            goto L_0x0048
        L_0x0046:
            r9 = r19
        L_0x0048:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r5 = r20
        L_0x004f:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0055
            r0 = 0
            goto L_0x0057
        L_0x0055:
            r0 = r21
        L_0x0057:
            r12 = r11
            r13 = r1
            r14 = r4
            r15 = r3
            r16 = r2
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r5
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.kanon.j.<init>(java.lang.Integer, java.lang.String, java.lang.Integer, int, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, ry1, int, r62):void");
    }

    public final Integer a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final Integer c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return v62.a(this.a, jVar.a) && v62.a(this.b, jVar.b) && v62.a(this.c, jVar.c) && this.d == jVar.d && v62.a(this.e, jVar.e) && v62.a(this.f, jVar.f) && v62.a(this.g, jVar.g) && v62.a(this.h, jVar.h) && v62.a(this.i, jVar.i) && v62.a(this.j, jVar.j);
    }

    public final ry1 f() {
        return this.j;
    }

    public final Double g() {
        return this.f;
    }

    public final String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.c;
        int hashCode3 = (((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.d) * 31;
        String str2 = this.e;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Double d2 = this.f;
        int hashCode5 = (hashCode4 + (d2 != null ? d2.hashCode() : 0)) * 31;
        String str3 = this.g;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.h;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.i;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        ry1 ry1 = this.j;
        if (ry1 != null) {
            i2 = ry1.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String i() {
        return this.h;
    }

    public final String j() {
        return this.i;
    }

    public final void k(ry1 ry1) {
        this.j = ry1;
    }

    public final xy1 l() {
        long j2 = (long) this.d;
        String str = this.g;
        if (str == null) {
            str = "AnYme";
        }
        String str2 = this.b;
        if (str2 == null) {
            str2 = "";
        }
        return new xy1(j2, str, str2);
    }

    public String toString() {
        return "StaffRecommendation(episodes=" + this.a + ", imageURL=" + this.b + ", kitsuId=" + this.c + ", malID=" + this.d + ", posterId=" + this.e + ", score=" + this.f + ", title=" + this.g + ", type=" + this.h + ", username=" + this.i + ", progress=" + this.j + ")";
    }
}
