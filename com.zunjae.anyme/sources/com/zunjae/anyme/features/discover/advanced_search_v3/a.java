package com.zunjae.anyme.features.discover.advanced_search_v3;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public final class a {
    /* access modifiers changed from: private */
    public static final List<Integer> h = f32.h(1980, 1985, 1990, 1995, 2000, 2005, 2010, 2015, 2020);
    /* access modifiers changed from: private */
    public static final List<Integer> i = f32.h(1, 2, 3, 4, 5, 6, 7, 8, 9);
    /* access modifiers changed from: private */
    public static final List<Integer> j = f32.h(12, 20, 40);
    public static final C0183a k = new C0183a((r62) null);
    @SerializedName("ShowTypes")
    private List<Integer> a;
    @SerializedName("Genres")
    private final List<Integer> b;
    @SerializedName("MinimumScore")
    private final int c;
    @SerializedName("AiringStart")
    private final int d;
    @SerializedName("MALIdsToExclude")
    private List<Integer> e;
    @SerializedName("DubbedOnly")
    private boolean f;
    @SerializedName("MinimumEpisodes")
    private int g;

    /* renamed from: com.zunjae.anyme.features.discover.advanced_search_v3.a$a  reason: collision with other inner class name */
    public static final class C0183a {
        private C0183a() {
        }

        public /* synthetic */ C0183a(r62 r62) {
            this();
        }

        public final a a() {
            return new a(f32.h(1, 2), e32.b(1), 7, 0, (List) null, false, 0, 120, (r62) null);
        }

        public final List<Integer> b() {
            return a.h;
        }

        public final List<Integer> c() {
            return a.i;
        }

        public final List<Integer> d() {
            return a.j;
        }
    }

    public a() {
        this((List) null, (List) null, 0, 0, (List) null, false, 0, 127, (r62) null);
    }

    public a(List<Integer> list, List<Integer> list2, int i2, int i3, List<Integer> list3, boolean z, int i4) {
        v62.e(list, "showTypes");
        v62.e(list2, "genres");
        v62.e(list3, "malIdsToExclude");
        this.a = list;
        this.b = list2;
        this.c = i2;
        this.d = i3;
        this.e = list3;
        this.f = z;
        this.g = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.util.List r6, java.util.List r7, int r8, int r9, java.util.List r10, boolean r11, int r12, int r13, defpackage.r62 r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r14 == 0) goto L_0x0019
            r6 = 2
            java.lang.Integer[] r14 = new java.lang.Integer[r6]
            r14[r0] = r2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14[r1] = r6
            java.util.List r6 = defpackage.f32.h(r14)
        L_0x0019:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x0021
            java.util.List r7 = defpackage.e32.b(r2)
        L_0x0021:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0029
            r8 = 7
            r1 = 7
            goto L_0x002a
        L_0x0029:
            r1 = r8
        L_0x002a:
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0033
            r9 = 2010(0x7da, float:2.817E-42)
            r2 = 2010(0x7da, float:2.817E-42)
            goto L_0x0034
        L_0x0033:
            r2 = r9
        L_0x0034:
            r7 = r13 & 16
            if (r7 == 0) goto L_0x003c
            java.util.List r10 = defpackage.f32.f()
        L_0x003c:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0043
            r4 = 0
            goto L_0x0044
        L_0x0043:
            r4 = r11
        L_0x0044:
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r12
        L_0x004a:
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.features.discover.advanced_search_v3.a.<init>(java.util.List, java.util.List, int, int, java.util.List, boolean, int, int, r62):void");
    }

    public final List<Integer> d() {
        return this.a;
    }

    public final void e(List<Integer> list) {
        v62.e(list, "<set-?>");
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return v62.a(this.a, aVar.a) && v62.a(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && v62.a(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g;
    }

    public int hashCode() {
        List<Integer> list = this.a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.b;
        int hashCode2 = (((((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 31;
        List<Integer> list3 = this.e;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        return ((i3 + (z ? 1 : 0)) * 31) + this.g;
    }

    public String toString() {
        return "AdvancedSearchQuery(showTypes=" + this.a + ", genres=" + this.b + ", minimumScore=" + this.c + ", airingStart=" + this.d + ", malIdsToExclude=" + this.e + ", dubbedOnly=" + this.f + ", minimumEpisodes=" + this.g + ")";
    }
}
