package defpackage;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* renamed from: yy1  reason: default package */
public final class yy1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    @SerializedName("MALId")
    private int e;
    @SerializedName("KitsuId")
    private int f;
    @SerializedName("StartDate")
    private String g;
    @SerializedName("EndDate")
    private String h;
    @SerializedName("PosterId")
    private String i;
    @SerializedName("CoverId")
    private String j;
    @SerializedName("Type")
    private String k;
    @SerializedName("TitleEnJp")
    private String l;
    @SerializedName("TitleEn")
    private String m;
    @SerializedName("TitleJaJp")
    private String n;

    /* renamed from: yy1$a */
    public static class a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            v62.e(parcel, "in");
            return new yy1(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new yy1[i];
        }
    }

    public yy1() {
        this(0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (r62) null);
    }

    public yy1(int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.e = i2;
        this.f = i3;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = str6;
        this.m = str7;
        this.n = str8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ yy1(int r12, int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, defpackage.r62 r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r13
        L_0x0010:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0017
            r3 = r4
            goto L_0x0018
        L_0x0017:
            r3 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r4
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r4
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r4
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r4
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r4
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r4 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy1.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, r62):void");
    }

    private final boolean p(String str) {
        if (str == null) {
            return false;
        }
        return !f92.n(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (defpackage.g92.v(r0, r8, false, 2, (java.lang.Object) null) == true) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "query"
            defpackage.v62.e(r8, r0)
            java.lang.String r0 = r7.m
            r1 = 0
            r2 = 2
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.String"
            java.lang.String r4 = "(this as java.lang.String).toLowerCase()"
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r0.toLowerCase()
            defpackage.v62.d(r0, r4)
            if (r0 == 0) goto L_0x0029
            boolean r0 = defpackage.g92.v(r0, r8, r5, r2, r1)
            if (r0 != r6) goto L_0x0029
            return r6
        L_0x0023:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r3)
            throw r8
        L_0x0029:
            java.lang.String r0 = r7.l
            if (r0 == 0) goto L_0x0045
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.toLowerCase()
            defpackage.v62.d(r0, r4)
            if (r0 == 0) goto L_0x0045
            boolean r0 = defpackage.g92.v(r0, r8, r5, r2, r1)
            if (r0 != r6) goto L_0x0045
            goto L_0x005b
        L_0x003f:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r3)
            throw r8
        L_0x0045:
            java.lang.String r0 = r7.n
            if (r0 == 0) goto L_0x0063
            defpackage.v62.c(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = r0.toLowerCase()
            defpackage.v62.d(r0, r4)
            boolean r8 = defpackage.g92.v(r0, r8, r5, r2, r1)
            if (r8 == 0) goto L_0x0063
        L_0x005b:
            r5 = 1
            goto L_0x0063
        L_0x005d:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            r8.<init>(r3)
            throw r8
        L_0x0063:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy1.a(java.lang.String):boolean");
    }

    public final String b() {
        return this.j;
    }

    @SuppressLint({"DefaultLocale"})
    public final String c() {
        if (p(this.j)) {
            h72 h72 = h72.a;
            String format = String.format("https://media.kitsu.io/anime/cover_images/%d/large.jpg?%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f), this.j}, 2));
            v62.d(format, "java.lang.String.format(format, *args)");
            return format;
        } else if (!p(this.i)) {
            return "";
        } else {
            h72 h722 = h72.a;
            String format2 = String.format("https://media.kitsu.io/anime/poster_images/%d/large.jpg?%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.f), this.j}, 2));
            v62.d(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
    }

    public final String d() {
        String str = this.h;
        return str != null ? str : "??-??-????";
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy1)) {
            return false;
        }
        yy1 yy1 = (yy1) obj;
        return this.e == yy1.e && this.f == yy1.f && v62.a(this.g, yy1.g) && v62.a(this.h, yy1.h) && v62.a(this.i, yy1.i) && v62.a(this.j, yy1.j) && v62.a(this.k, yy1.k) && v62.a(this.l, yy1.l) && v62.a(this.m, yy1.m) && v62.a(this.n, yy1.n);
    }

    public final String f() {
        return j() + " - " + d();
    }

    public final int g() {
        return this.f;
    }

    public final int h() {
        return this.e;
    }

    public int hashCode() {
        int i2 = ((this.e * 31) + this.f) * 31;
        String str = this.g;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.h;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.i;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.j;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.k;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.l;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.m;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.n;
        if (str8 != null) {
            i3 = str8.hashCode();
        }
        return hashCode7 + i3;
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        String str = this.g;
        return str != null ? str : "??-??-???";
    }

    public final String k() {
        return this.g;
    }

    public final String l() {
        return this.m;
    }

    public final String m() {
        return this.l;
    }

    public final String n() {
        return this.n;
    }

    public final String o() {
        return this.k;
    }

    public String toString() {
        return "MinimalKitsuInfo(malId=" + this.e + ", kitsuId=" + this.f + ", startDate2=" + this.g + ", endDate2=" + this.h + ", posterId=" + this.i + ", coverId=" + this.j + ", type=" + this.k + ", titleEnJp=" + this.l + ", titleEn=" + this.m + ", titleJaJp=" + this.n + ")";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        v62.e(parcel, "parcel");
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
    }
}
