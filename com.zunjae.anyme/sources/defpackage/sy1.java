package defpackage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: sy1  reason: default package */
public final class sy1 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new b();
    public static final a r = new a((r62) null);
    private long e;
    private String f;
    private int g;
    private int h;
    private int i;
    private String j;
    private int k;
    private int l;
    private int m;
    private int n;
    private List<Integer> o;
    private yy1 p;
    private ky1 q;

    /* renamed from: sy1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final sy1 a(long j, String str, String str2) {
            String str3 = str;
            String str4 = str2;
            v62.e(str3, "seriesTitle");
            sy1 sy1 = new sy1(0, (String) null, 0, 0, 0, (String) null, 0, 0, 0, 0, (List) null, (yy1) null, (ky1) null, 8191, (r62) null);
            sy1.I(j);
            sy1.a0(str3);
            if (str4 != null) {
                sy1.X(str4);
            }
            sy1.R(6);
            sy1.Y(-1);
            return sy1;
        }

        public final sy1 b(xy1 xy1) {
            v62.e(xy1, "minimalAnimeInfo");
            long a = xy1.a();
            String c = xy1.c();
            v62.d(c, "minimalAnimeInfo.seriesTitle");
            return a(a, c, xy1.b());
        }

        public final String c(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 6 ? "Unknown" : "Planned" : "Dropped" : "On Hold" : "Completed" : "Watching";
        }
    }

    /* renamed from: sy1$b */
    public static class b implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            v62.e(parcel2, "in");
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int readInt8 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt8);
                while (readInt8 != 0) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                    readInt8--;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            return new sy1(readLong, readString, readInt, readInt2, readInt3, readString2, readInt4, readInt5, readInt6, readInt7, arrayList, parcel.readInt() != 0 ? (yy1) yy1.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? (ky1) ky1.CREATOR.createFromParcel(parcel2) : null);
        }

        public final Object[] newArray(int i) {
            return new sy1[i];
        }
    }

    public sy1() {
        this(0, (String) null, 0, 0, 0, (String) null, 0, 0, 0, 0, (List) null, (yy1) null, (ky1) null, 8191, (r62) null);
    }

    public sy1(long j2, String str, int i2, int i3, int i4, String str2, int i5, int i6, int i7, int i8, List<Integer> list, yy1 yy1, ky1 ky1) {
        v62.e(str, "seriesTitle");
        v62.e(str2, "seriesImage");
        this.e = j2;
        this.f = str;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str2;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = i8;
        this.o = list;
        this.p = yy1;
        this.q = ky1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ sy1(long r16, java.lang.String r18, int r19, int r20, int r21, java.lang.String r22, int r23, int r24, int r25, int r26, java.util.List r27, defpackage.yy1 r28, defpackage.ky1 r29, int r30, defpackage.r62 r31) {
        /*
            r15 = this;
            r0 = r30
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000b
        L_0x0009:
            r1 = r16
        L_0x000b:
            r3 = r0 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0013
            r3 = r4
            goto L_0x0015
        L_0x0013:
            r3 = r18
        L_0x0015:
            r5 = r0 & 4
            r6 = 0
            if (r5 == 0) goto L_0x001c
            r5 = 0
            goto L_0x001e
        L_0x001c:
            r5 = r19
        L_0x001e:
            r7 = r0 & 8
            if (r7 == 0) goto L_0x0024
            r7 = 0
            goto L_0x0026
        L_0x0024:
            r7 = r20
        L_0x0026:
            r8 = r0 & 16
            if (r8 == 0) goto L_0x002c
            r8 = 0
            goto L_0x002e
        L_0x002c:
            r8 = r21
        L_0x002e:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r4 = r22
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003b
            r9 = 0
            goto L_0x003d
        L_0x003b:
            r9 = r23
        L_0x003d:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0043
            r10 = 0
            goto L_0x0045
        L_0x0043:
            r10 = r24
        L_0x0045:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004b
            r11 = 0
            goto L_0x004d
        L_0x004b:
            r11 = r25
        L_0x004d:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r6 = r26
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            r13 = 0
            if (r12 == 0) goto L_0x005b
            r12 = r13
            goto L_0x005d
        L_0x005b:
            r12 = r27
        L_0x005d:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0063
            r14 = r13
            goto L_0x0065
        L_0x0063:
            r14 = r28
        L_0x0065:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r13 = r29
        L_0x006c:
            r16 = r15
            r17 = r1
            r19 = r3
            r20 = r5
            r21 = r7
            r22 = r8
            r23 = r4
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r6
            r28 = r12
            r29 = r14
            r30 = r13
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy1.<init>(long, java.lang.String, int, int, int, java.lang.String, int, int, int, int, java.util.List, yy1, ky1, int, r62):void");
    }

    public static /* synthetic */ sy1 b(sy1 sy1, long j2, String str, int i2, int i3, int i4, String str2, int i5, int i6, int i7, int i8, List list, yy1 yy1, ky1 ky1, int i9, Object obj) {
        sy1 sy12 = sy1;
        int i10 = i9;
        return sy1.a((i10 & 1) != 0 ? sy12.e : j2, (i10 & 2) != 0 ? sy12.f : str, (i10 & 4) != 0 ? sy12.g : i2, (i10 & 8) != 0 ? sy12.h : i3, (i10 & 16) != 0 ? sy12.i : i4, (i10 & 32) != 0 ? sy12.j : str2, (i10 & 64) != 0 ? sy12.k : i5, (i10 & 128) != 0 ? sy12.l : i6, (i10 & 256) != 0 ? sy12.m : i7, (i10 & 512) != 0 ? sy12.n : i8, (i10 & 1024) != 0 ? sy12.o : list, (i10 & 2048) != 0 ? sy12.p : yy1, (i10 & 4096) != 0 ? sy12.q : ky1);
    }

    private final String e() {
        String str = this.f;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            String d = new u82(" ").d(new u82(" ova").d(new u82("!").d(new u82("[0-9]").d(f92.q(f92.q(f92.q(new u82("edition").d(f92.q(f92.q(f92.q(f92.q(f92.q(new u82("\\(.*?\\) ?").d(lowerCase, ""), "the movie", "", false, 4, (Object) null), "movie", "", false, 4, (Object) null), "special", "", false, 4, (Object) null), "2nd", "", false, 4, (Object) null), "-", " ", false, 4, (Object) null), ""), "season", "", false, 4, (Object) null), "3rd", "", false, 4, (Object) null), " ii", "", false, 4, (Object) null), ""), ""), ""), "+");
            int length = d.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = v62.g(d.charAt(!z ? i2 : length), 32) <= 0;
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i2++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = d.subSequence(i2, length + 1).toString();
            if (!g92.v(obj, ": ", false, 2, (Object) null)) {
                return obj;
            }
            Object[] array = g92.U(obj, new String[]{":"}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array != null) {
                return ((String[]) array)[0];
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final String v() {
        if (this.h == 0) {
            return "?";
        }
        return "" + this.h;
    }

    public final Intent D() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", j());
        intent.putExtra("android.intent.extra.SUBJECT", f92.q(this.f, " ", "_", false, 4, (Object) null));
        return intent;
    }

    @SuppressLint({"DefaultLocale"})
    public final String E(ky1 ky1) {
        if (ky1 == null) {
            return String.valueOf(this.k) + "/" + v();
        }
        int g2 = ky1.g();
        int i2 = this.k;
        if (g2 < i2) {
            return String.valueOf(this.k) + "/" + v();
        }
        h72 h72 = h72.a;
        String format = String.format("%d/%d/%s", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(ky1.b() - 1), v()}, 3));
        v62.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final String F() {
        h72 h72 = h72.a;
        String format = String.format("https://www.youtube.com/results?sp=EgIQA1AU&q=%s OST", Arrays.copyOf(new Object[]{e()}, 1));
        v62.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final void H() {
        int i2 = this.k;
        int i3 = this.h;
        if (i2 != i3 || i3 <= 0) {
            this.k++;
            if (f32.h(3, 6).contains(Integer.valueOf(this.m))) {
                this.m = 1;
            }
            if (l0()) {
                M();
            }
        }
    }

    public final void I(long j2) {
        this.e = j2;
    }

    public final void J(ky1 ky1) {
        this.q = ky1;
    }

    public final void M() {
        this.m = 2;
        this.k = this.h;
    }

    public final void N(List<Integer> list) {
        this.o = list;
    }

    public final void O(yy1 yy1) {
        this.p = yy1;
    }

    public final void Q(int i2) {
        this.l = i2;
    }

    public final void R(int i2) {
        this.m = i2;
    }

    public final void S(int i2) {
        this.k = i2;
    }

    public final void T(int i2) {
        this.n = i2;
    }

    public final void W(int i2) {
        this.h = i2;
    }

    public final void X(String str) {
        v62.e(str, "<set-?>");
        this.j = str;
    }

    public final void Y(int i2) {
        this.i = i2;
    }

    public final sy1 a(long j2, String str, int i2, int i3, int i4, String str2, int i5, int i6, int i7, int i8, List<Integer> list, yy1 yy1, ky1 ky1) {
        String str3 = str;
        v62.e(str3, "seriesTitle");
        String str4 = str2;
        v62.e(str4, "seriesImage");
        return new sy1(j2, str3, i2, i3, i4, str4, i5, i6, i7, i8, list, yy1, ky1);
    }

    public final void a0(String str) {
        v62.e(str, "<set-?>");
        this.f = str;
    }

    public final void b0(int i2) {
        this.g = i2;
    }

    public final long c() {
        return this.e;
    }

    public final ky1 d() {
        return this.q;
    }

    public final void d0(boolean z) {
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy1)) {
            return false;
        }
        sy1 sy1 = (sy1) obj;
        return this.e == sy1.e && v62.a(this.f, sy1.f) && this.g == sy1.g && this.h == sy1.h && this.i == sy1.i && v62.a(this.j, sy1.j) && this.k == sy1.k && this.l == sy1.l && this.m == sy1.m && this.n == sy1.n && v62.a(this.o, sy1.o) && v62.a(this.p, sy1.p) && v62.a(this.q, sy1.q);
    }

    public final String f() {
        return new u82("[^0-9A-Za-z. :()-]").d(this.f, "");
    }

    public final boolean f0() {
        int i2 = this.k;
        int i3 = this.h;
        if (i2 >= i3) {
            return i3 == 0 && this.i == 1;
        }
        return true;
    }

    public final uy1 g(int i2) {
        uy1 uy1 = new uy1();
        uy1.f = i2;
        uy1.e = this.k;
        return uy1;
    }

    public final int getOrder() {
        return this.n;
    }

    public final List<Integer> h() {
        return this.o;
    }

    public int hashCode() {
        long j2 = this.e;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f;
        int i3 = 0;
        int hashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        String str2 = this.j;
        int hashCode2 = (((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.k) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31;
        List<Integer> list = this.o;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        yy1 yy1 = this.p;
        int hashCode4 = (hashCode3 + (yy1 != null ? yy1.hashCode() : 0)) * 31;
        ky1 ky1 = this.q;
        if (ky1 != null) {
            i3 = ky1.hashCode();
        }
        return hashCode4 + i3;
    }

    public final int i() {
        return (int) this.e;
    }

    public final boolean i0(String str) {
        boolean z;
        v62.e(str, "query");
        String str2 = this.f;
        if (str2 != null) {
            String lowerCase = str2.toLowerCase();
            v62.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            boolean v = g92.v(lowerCase, str, false, 2, (Object) null);
            boolean v2 = g92.v(lowerCase, new u82("[^A-Za-z]+").d(str, ""), false, 2, (Object) null);
            yy1 yy1 = this.p;
            if (yy1 != null) {
                v62.c(yy1);
                if (yy1.a(str)) {
                    z = true;
                    return !v || v2 || z;
                }
            }
            z = false;
            if (!v) {
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String j() {
        h72 h72 = h72.a;
        String format = String.format("https://www.myanimelist.net/anime/%d/%s", Arrays.copyOf(new Object[]{Integer.valueOf(i()), this.f}, 2));
        v62.d(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final vy1 j0() {
        return new vy1((int) this.e, (double) this.l, (String) null, this.j, this.f, this.h, (String) null, (String) null, false);
    }

    public final yy1 k() {
        return this.p;
    }

    public final xy1 l() {
        return new xy1(this.e, this.f, this.j);
    }

    public final boolean l0() {
        int i2 = this.h;
        return i2 > 0 && this.k == i2;
    }

    public final int m() {
        return this.l;
    }

    public final int n() {
        return this.m;
    }

    public final String o() {
        return r.c(this.m);
    }

    public final int p() {
        return this.k;
    }

    public final double q() {
        int i2;
        int i3 = this.k;
        if (i3 == 0 || (i2 = this.h) == 0) {
            return (double) 0;
        }
        try {
            return ((double) n72.a(((((double) i3) / ((double) i2)) * ((double) 100)) * 10.0d)) / 10.0d;
        } catch (Exception unused) {
            return (double) 0;
        }
    }

    public final String s() {
        return " (" + q() + "%)";
    }

    public String toString() {
        return "AnimeR3(animeId=" + this.e + ", seriesTitle=" + this.f + ", seriesType=" + this.g + ", seriesEpisodes=" + this.h + ", seriesStatus=" + this.i + ", seriesImage=" + this.j + ", myWatchedEpisodes=" + this.k + ", myScore=" + this.l + ", myStatus=" + this.m + ", order=" + this.n + ", genreIds=" + this.o + ", minimalKitsuInfo=" + this.p + ", calendarEntry=" + this.q + ")";
    }

    public final int u() {
        return this.h;
    }

    public final String w() {
        return this.j;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        v62.e(parcel, "parcel");
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        List<Integer> list = this.o;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Integer intValue : list) {
                parcel.writeInt(intValue.intValue());
            }
        } else {
            parcel.writeInt(0);
        }
        yy1 yy1 = this.p;
        if (yy1 != null) {
            parcel.writeInt(1);
            yy1.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ky1 ky1 = this.q;
        if (ky1 != null) {
            parcel.writeInt(1);
            ky1.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final int x() {
        return this.i;
    }

    public final String y() {
        return this.f;
    }

    public final int z() {
        return this.g;
    }
}
