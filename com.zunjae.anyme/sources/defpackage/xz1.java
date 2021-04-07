package defpackage;

import android.text.Spanned;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zunjae.constants.b;
import defpackage.iz1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jsoup.nodes.h;

/* renamed from: xz1  reason: default package */
public final class xz1 implements iz1 {
    private final jz1 e = jz1.AnimeOne;
    private final hz1 f = hz1.TryDirectly;
    private final Void g;
    private final boolean h = true;
    private final Void i;
    private final mz1 j = mz1.List;
    private final long k = 15;
    private final boolean l = true;

    /* renamed from: xz1$a */
    public static final class a extends TypeToken<yz1> {
    }

    public /* bridge */ /* synthetic */ Integer a() {
        return (Integer) p();
    }

    public hz1 b() {
        return this.f;
    }

    public List<oz1> c(pz1 pz1) {
        v62.e(pz1, "provider");
        throw new k22((String) null, 1, (r62) null);
    }

    public List<qz1> d(String str) {
        String str2 = str;
        v62.e(str2, "query");
        try {
            bf2 a2 = df2.a("http://www.anime1.com/home/default/?query=" + str2);
            a2.c(b.d.b());
            a2.f(true);
            a2.a("X-Requested-With", "XMLHttpRequest");
            yz1 yz1 = (yz1) new Gson().fromJson(a2.get().F0().E0().toString(), new a().getType());
            List<String> a3 = yz1.a();
            ArrayList arrayList = new ArrayList(g32.l(a3, 10));
            int i2 = 0;
            for (T next : a3) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str3 = (String) next;
                    String str4 = (String) n32.C(yz1.b(), i2);
                    if (str4 == null) {
                        str4 = "";
                    }
                    arrayList.add(new qz1(str3, str4, (String) null, (String) null, (String) null, (Integer) null, 32, (r62) null));
                    i2 = i3;
                } else {
                    d32.k();
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : arrayList) {
                if (((qz1) next2).d().length() > 0) {
                    arrayList2.add(next2);
                }
            }
            return arrayList2;
        } catch (Exception e2) {
            uj2.d(e2);
            return null;
        }
    }

    public mz1 e() {
        return this.j;
    }

    public long f() {
        return this.k;
    }

    public List<lz1> g(String str, int i2) {
        nz1 nz1;
        String str2 = str;
        v62.e(str2, "slug");
        try {
            bf2 a2 = df2.a("http://www.anime1.com/watch/" + str2);
            a2.c(b.d.b());
            a2.f(true);
            ag2 n = a2.get().z0("div.left-left > ul.anime-list").n("a");
            v62.d(n, "root");
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Object next : n) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    try {
                        ag2 z0 = ((h) next).z0("a");
                        String o = z0.o();
                        String c = z0.c("href");
                        v62.d(o, "title");
                        List U = g92.U(o, new String[]{" "}, false, 0, 6, (Object) null);
                        nz1 = new nz1(c, o, (String) U.get(U.size() - 1), e92.g((String) n32.I(U)) != null ? (String) U.get(U.size() - 2) : "Other", (List<pz1>) null);
                    } catch (Exception e2) {
                        uj2.b(e2);
                        nz1 = null;
                    }
                    if (nz1 != null) {
                        arrayList.add(nz1);
                    }
                    i3 = i4;
                } else {
                    d32.k();
                    throw null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next2 : arrayList) {
                String b = ((nz1) next2).b();
                Object obj = linkedHashMap.get(b);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(b, obj);
                }
                ((List) obj).add(next2);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                if (str3 == null) {
                    str3 = "TV";
                }
                arrayList2.add(new lz1("~", str3, (Integer) null, (List) entry.getValue(), 4, (r62) null));
            }
            return arrayList2;
        } catch (Exception e3) {
            uj2.d(e3);
            return null;
        }
    }

    public boolean h() {
        return this.h;
    }

    public List<oz1> i(String str, int i2) {
        v62.e(str, "id");
        try {
            bf2 a2 = df2.a(str);
            a2.c(b.d.b());
            a2.f(true);
            String str2 = a2.get().p0().toString();
            s82 b = u82.b(new u82("file: \"http" + "(.*?\")"), str2, 0, 2, (Object) null);
            v62.c(b);
            return e32.b(new oz1("Anime1", i92.k0(f92.q(b.getValue(), "file: \"", "", false, 4, (Object) null), 1)));
        } catch (Exception unused) {
            return null;
        }
    }

    public /* bridge */ /* synthetic */ String j() {
        return (String) m();
    }

    public Spanned k() {
        return iz1.a.a(this);
    }

    public jz1 l() {
        return this.e;
    }

    public Void m() {
        return this.g;
    }

    public boolean n() {
        return this.l;
    }

    public List<qz1> o() {
        throw new k22("An operation is not implemented: " + "not implemented");
    }

    public Void p() {
        return this.i;
    }
}
