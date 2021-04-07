package com.zunjae.dynsourcegen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class e {
    public static final a j = new a((r62) null);
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final f e;
    private final boolean f;
    private final List<String> g;
    private final int h;
    private int i;

    public static final class a {

        /* renamed from: com.zunjae.dynsourcegen.e$a$a  reason: collision with other inner class name */
        public static final class C0216a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(((e) t).g(), ((e) t2).g());
            }
        }

        public static final class b<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(Integer.valueOf(((e) t).b()), Integer.valueOf(((e) t2).b()));
            }
        }

        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        private final List<e> a() {
            Collection collection;
            List<b> a = b.x.a();
            if (a != null) {
                collection = new ArrayList(g32.l(a, 10));
                for (b t : a) {
                    collection.add(t.t());
                }
            } else {
                collection = f32.f();
            }
            List<jz1> a2 = jz1.Companion.a();
            ArrayList arrayList = new ArrayList(g32.l(a2, 10));
            for (jz1 representable : a2) {
                arrayList.add(representable.toRepresentable());
            }
            List<c> a3 = c.i.a();
            ArrayList arrayList2 = new ArrayList(g32.l(a3, 10));
            for (c j : a3) {
                arrayList2.add(j.j());
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            arrayList3.addAll(collection);
            return n32.U(n32.U(arrayList3, new C0216a()), new b());
        }

        private final void d(String str, int i) {
            l02.c(i(str, i));
        }

        private final e e() {
            jz1 jz1 = jz1.AnimeUltima;
            e l = l(l02.g("KEY_DEFAULT_STREAMING_SITEV16", -1));
            return l != null ? l : jz1.toRepresentable();
        }

        private final e h() {
            e l = l(l02.g("KEY_STREAMING_APPV16", -1));
            return l != null ? l : e();
        }

        private final String i(String str, int i) {
            return str + i;
        }

        private final String j(int i) {
            return "KEY_PREFERRED_STREAM_SITEV16" + i;
        }

        private final e l(int i) {
            T t;
            boolean z;
            Iterator<T> it = a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((e) t).c() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            return (e) t;
        }

        public final List<String> b() {
            List<e> a = a();
            ArrayList<e> arrayList = new ArrayList<>();
            for (T next : a) {
                e eVar = (e) next;
                if (eVar.i() && !eVar.j()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(g32.l(arrayList, 10));
            for (e g : arrayList) {
                arrayList2.add(g.g());
            }
            return arrayList2;
        }

        public final void c(int i) {
            for (e e : a()) {
                e.j.d(e.e(), i);
            }
        }

        public final List<e> f() {
            List<e> a = a();
            ArrayList arrayList = new ArrayList();
            for (T next : a) {
                if (((e) next).j()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final List<e> g() {
            List<e> a = a();
            ArrayList arrayList = new ArrayList();
            for (T next : a) {
                if (!((e) next).j()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final e k(int i) {
            e l = l(l02.g(j(i), -1));
            return l != null ? l : h();
        }

        public final void m(int i) {
            l02.c(j(i));
        }

        public final void n(e eVar) {
            v62.e(eVar, "classicBrowserRepo");
            l02.r("KEY_STREAMING_APPV16", eVar.c());
        }

        public final void o(int i, e eVar) {
            v62.e(eVar, "videoStreamSite");
            l02.r(j(i), eVar.c());
        }

        public final void p(int i) {
            l02.r("KEY_DEFAULT_STREAMING_SITEV16", i);
        }
    }

    public e(int i2, String str, String str2, String str3, f fVar, boolean z, List<String> list, int i3, int i4) {
        v62.e(str, "title");
        v62.e(str2, "repo");
        v62.e(fVar, "type");
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = fVar;
        this.f = z;
        this.g = list;
        this.h = i3;
        this.i = i4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.zunjae.dynsourcegen.f r17, boolean r18, java.util.List r19, int r20, int r21, int r22, defpackage.r62 r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0009
            r1 = 1
            r8 = 1
            goto L_0x000b
        L_0x0009:
            r8 = r18
        L_0x000b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0016
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0018
        L_0x0016:
            r10 = r20
        L_0x0018:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x001f
            r0 = 0
            r11 = 0
            goto L_0x0021
        L_0x001f:
            r11 = r21
        L_0x0021:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.dynsourcegen.e.<init>(int, java.lang.String, java.lang.String, java.lang.String, com.zunjae.dynsourcegen.f, boolean, java.util.List, int, int, int, r62):void");
    }

    public final String a() {
        return this.d;
    }

    public final int b() {
        return this.h;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.i;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && v62.a(this.b, eVar.b) && v62.a(this.c, eVar.c) && v62.a(this.d, eVar.d) && v62.a(this.e, eVar.e) && this.f == eVar.f && v62.a(this.g, eVar.g) && this.h == eVar.h && this.i == eVar.i;
    }

    public final List<String> f() {
        return this.g;
    }

    public final String g() {
        return this.b;
    }

    public final f h() {
        return this.e;
    }

    public int hashCode() {
        int i2 = this.a * 31;
        String str = this.b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        f fVar = this.e;
        int hashCode4 = (hashCode3 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        boolean z = this.f;
        if (z) {
            z = true;
        }
        int i4 = (hashCode4 + (z ? 1 : 0)) * 31;
        List<String> list = this.g;
        if (list != null) {
            i3 = list.hashCode();
        }
        return ((((i4 + i3) * 31) + this.h) * 31) + this.i;
    }

    public final boolean i() {
        return this.f;
    }

    public final boolean j() {
        return this.e == f.NSFW;
    }

    public final void k(int i2) {
        this.i = i2;
    }

    public String toString() {
        return "StreamingSiteRepresentable(id=" + this.a + ", title=" + this.b + ", repo=" + this.c + ", description=" + this.d + ", type=" + this.e + ", isAvailable=" + this.f + ", tags=" + this.g + ", forcedSortOrder=" + this.h + ", numberOfUsers=" + this.i + ")";
    }
}
