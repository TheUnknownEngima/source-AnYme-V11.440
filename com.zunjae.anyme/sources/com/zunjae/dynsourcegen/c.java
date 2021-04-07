package com.zunjae.dynsourcegen;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c {
    public static final a i = new a((r62) null);
    @SerializedName("id")
    private final int a;
    @SerializedName("name")
    private final String b;
    @SerializedName("homepage")
    private final String c;
    @SerializedName("su")
    private final String d;
    @SerializedName("desc")
    private final String e;
    @SerializedName("allowZoom")
    private final boolean f;
    @SerializedName("ia")
    private final boolean g;
    @SerializedName("ua")
    private final String h;

    public static final class a {

        /* renamed from: com.zunjae.dynsourcegen.c$a$a  reason: collision with other inner class name */
        public static final class C0215a extends TypeToken<List<? extends c>> {
        }

        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        private final List<c> b() {
            try {
                String l = l02.l("KEY_DYNAMIC_NSFW_BROWSERS", (String) null);
                if (l != null) {
                    return (List) new Gson().fromJson(l, new C0215a().getType());
                }
            } catch (Exception unused) {
            }
            return null;
        }

        public final List<c> a() {
            List<c> b = b();
            if (b == null) {
                return f32.f();
            }
            ArrayList arrayList = new ArrayList();
            for (T next : b) {
                if (((c) next).h()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public final void c(List<c> list) {
            v62.e(list, "browsers");
            l02.v("KEY_DYNAMIC_NSFW_BROWSERS", new Gson().toJson((Object) list));
        }

        public final c d(int i) {
            T t;
            boolean z;
            Iterator<T> it = a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((c) t).d() == i) {
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
            return (c) t;
        }
    }

    public String a() {
        return this.e;
    }

    public final boolean b() {
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && v62.a(this.b, cVar.b) && v62.a(this.c, cVar.c) && v62.a(this.d, cVar.d) && v62.a(this.e, cVar.e) && this.f == cVar.f && this.g == cVar.g && v62.a(this.h, cVar.h);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.h;
    }

    public final boolean h() {
        return this.g;
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
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.f;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i4 = (hashCode4 + (z ? 1 : 0)) * 31;
        boolean z3 = this.g;
        if (!z3) {
            z2 = z3;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        String str5 = this.h;
        if (str5 != null) {
            i3 = str5.hashCode();
        }
        return i5 + i3;
    }

    public List<String> i() {
        return e32.b("NSFW");
    }

    public e j() {
        return new e(this.a, this.b, "nsfw_empty_repo", a(), f.NSFW, this.g, i(), 0, 0, 384, (r62) null);
    }

    public String toString() {
        return "DynamicNSFWSite(id=" + this.a + ", name=" + this.b + ", homepage=" + this.c + ", searchUrl=" + this.d + ", description=" + this.e + ", allowZoom=" + this.f + ", isAvailable=" + this.g + ", userAgent=" + this.h + ")";
    }
}
