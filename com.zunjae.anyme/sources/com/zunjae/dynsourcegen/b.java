package com.zunjae.dynsourcegen;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b {
    public static final a x = new a((r62) null);
    @SerializedName("id")
    private final int a;
    @SerializedName("name")
    private final String b;
    @SerializedName("version")
    private final int c;
    @SerializedName("desc")
    private final String d;
    @SerializedName("language")
    private final List<String> e;
    @SerializedName("vsc")
    private final String f;
    @SerializedName("vec")
    private final String g;
    @SerializedName("su")
    private final String h;
    @SerializedName("base")
    private final String i;
    @SerializedName("ua")
    private final String j;
    @SerializedName("e_fl")
    private final String k;
    @SerializedName("e_flps")
    private final String l;
    @SerializedName("e_split_ops")
    private final d m;
    @SerializedName("e_fjsoepi")
    private final String n;
    @SerializedName("e_jsopfwem")
    private final String o;
    @SerializedName("cc")
    private final Map<String, String> p;
    @SerializedName("htdw")
    private final List<String> q;
    @SerializedName("jsi")
    private final List<String> r;
    @SerializedName("tags")
    private final List<String> s;
    @SerializedName("ntie")
    private final String t;
    @SerializedName("lsjsinj")
    private final Map<String, String> u;
    @SerializedName("pbtsb")
    private final boolean v;
    @SerializedName("ia")
    private final boolean w;

    public static final class a {

        /* renamed from: com.zunjae.dynsourcegen.b$a$a  reason: collision with other inner class name */
        public static final class C0214a extends TypeToken<List<? extends b>> {
        }

        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        private final List<b> b() {
            try {
                String l = l02.l("KEY_DYNAMIC_BROWSERS", (String) null);
                if (l != null) {
                    return (List) new Gson().fromJson(l, new C0214a().getType());
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public final List<b> a() {
            List<b> b = b();
            if (b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (T next : b) {
                if (((b) next).r()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final void c(List<b> list) {
            v62.e(list, "browsers");
            l02.v("KEY_DYNAMIC_BROWSERS", new Gson().toJson((Object) list));
        }

        public final b d(int i) {
            boolean z;
            List<b> a = a();
            T t = null;
            if (a == null) {
                return null;
            }
            Iterator<T> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((b) next).h() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    t = next;
                    break;
                }
            }
            return (b) t;
        }
    }

    public final Map<String, String> a() {
        return this.p;
    }

    public final String b() {
        return this.k;
    }

    public final String c() {
        return this.l;
    }

    public final d d() {
        return this.m;
    }

    public final String e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && v62.a(this.b, bVar.b) && this.c == bVar.c && v62.a(this.d, bVar.d) && v62.a(this.e, bVar.e) && v62.a(this.f, bVar.f) && v62.a(this.g, bVar.g) && v62.a(this.h, bVar.h) && v62.a(this.i, bVar.i) && v62.a(this.j, bVar.j) && v62.a(this.k, bVar.k) && v62.a(this.l, bVar.l) && v62.a(this.m, bVar.m) && v62.a(this.n, bVar.n) && v62.a(this.o, bVar.o) && v62.a(this.p, bVar.p) && v62.a(this.q, bVar.q) && v62.a(this.r, bVar.r) && v62.a(this.s, bVar.s) && v62.a(this.t, bVar.t) && v62.a(this.u, bVar.u) && this.v == bVar.v && this.w == bVar.w;
    }

    public final String f() {
        return this.o;
    }

    public final List<String> g() {
        return this.q;
    }

    public final int h() {
        return this.a;
    }

    public int hashCode() {
        int i2 = this.a * 31;
        String str = this.b;
        int i3 = 0;
        int hashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.e;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.h;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.i;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.j;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.k;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.l;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        d dVar = this.m;
        int hashCode11 = (hashCode10 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        String str10 = this.n;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.o;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Map<String, String> map = this.p;
        int hashCode14 = (hashCode13 + (map != null ? map.hashCode() : 0)) * 31;
        List<String> list2 = this.q;
        int hashCode15 = (hashCode14 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.r;
        int hashCode16 = (hashCode15 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.s;
        int hashCode17 = (hashCode16 + (list4 != null ? list4.hashCode() : 0)) * 31;
        String str12 = this.t;
        int hashCode18 = (hashCode17 + (str12 != null ? str12.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.u;
        if (map2 != null) {
            i3 = map2.hashCode();
        }
        int i4 = (hashCode18 + i3) * 31;
        boolean z = this.v;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i5 = (i4 + (z ? 1 : 0)) * 31;
        boolean z3 = this.w;
        if (!z3) {
            z2 = z3;
        }
        return i5 + (z2 ? 1 : 0);
    }

    public final List<String> i() {
        return this.r;
    }

    public final Map<String, String> j() {
        return this.u;
    }

    public final String k() {
        return this.t;
    }

    public final boolean l() {
        return this.v;
    }

    public final String m() {
        return this.h;
    }

    public final String n() {
        return this.j;
    }

    public final String o() {
        return this.g;
    }

    public final String p() {
        return this.f;
    }

    public final String q() {
        return "DynRepo" + this.b + '-' + this.c;
    }

    public final boolean r() {
        return this.w;
    }

    public List<String> s() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.e);
        arrayList.add("Cloud");
        List<String> list = this.s;
        if (list == null) {
            list = f32.f();
        }
        arrayList.addAll(list);
        return arrayList;
    }

    public e t() {
        return new e(this.a, this.b, q(), this.d, f.Cloud, false, s(), 0, 0, 416, (r62) null);
    }

    public String toString() {
        return "DynamicCloudSource(id=" + this.a + ", name=" + this.b + ", version=" + this.c + ", description=" + this.d + ", language=" + this.e + ", validShowCondition=" + this.f + ", validEpisodeCondition=" + this.g + ", searchUrl=" + this.h + ", homeURL=" + this.i + ", userAgent=" + this.j + ", episodeFromLink=" + this.k + ", episodeFromLinkPageStarted=" + this.l + ", episodeFromSplittedLinkOnPageStarted=" + this.m + ", episodeNumberOnPageInterceptWhenEpisodeMatches=" + this.n + ", executeJavaScriptOnPageFinishedWhenEpisodeMatches=" + this.o + ", customCookies=" + this.p + ", hostsThatDontWork=" + this.q + ", jsInstructions=" + this.r + ", tags=" + this.s + ", navigateToInitialEpisode=" + this.t + ", localStorageInjections=" + this.u + ", playbackThroughSnackBar=" + this.v + ", isAvailable=" + this.w + ")";
    }
}
