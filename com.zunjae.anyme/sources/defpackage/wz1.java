package defpackage;

import android.text.Spanned;
import com.zunjae.constants.b;
import defpackage.iz1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jsoup.nodes.h;

/* renamed from: wz1  reason: default package */
public final class wz1 implements iz1 {
    private final jz1 e = jz1.AnimeKisa;
    private final hz1 f = hz1.BuiltinBrowser;
    private final Void g;
    private final boolean h = true;
    private final Void i;
    private final mz1 j = mz1.Grid;
    private final long k = 15;
    private final boolean l = true;

    /* renamed from: wz1$a */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((nz1) t).a()), Integer.valueOf(((nz1) t2).a()));
        }
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

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b5 A[SYNTHETIC, Splitter:B:14:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<defpackage.qz1> d(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "query"
            defpackage.v62.e(r15, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://animekisa.tv/search?q="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            r0 = 0
            bf2 r15 = defpackage.df2.a(r15)     // Catch:{ Exception -> 0x00ba }
            com.zunjae.constants.b r1 = com.zunjae.constants.b.d     // Catch:{ Exception -> 0x00ba }
            java.lang.String r1 = r1.b()     // Catch:{ Exception -> 0x00ba }
            r15.c(r1)     // Catch:{ Exception -> 0x00ba }
            r1 = 1
            r15.f(r1)     // Catch:{ Exception -> 0x00ba }
            org.jsoup.nodes.f r15 = r15.get()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r2 = ".lisbox22"
            ag2 r15 = r15.z0(r2)     // Catch:{ Exception -> 0x00ba }
            org.jsoup.nodes.h r15 = r15.g()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r2 = ".an"
            ag2 r15 = r15.z0(r2)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r2 = "root.select(\".an\")"
            defpackage.v62.d(r15, r2)     // Catch:{ Exception -> 0x00ba }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ba }
            r2.<init>()     // Catch:{ Exception -> 0x00ba }
            java.util.Iterator r15 = r15.iterator()     // Catch:{ Exception -> 0x00ba }
        L_0x004a:
            boolean r3 = r15.hasNext()     // Catch:{ Exception -> 0x00ba }
            if (r3 == 0) goto L_0x00b9
            java.lang.Object r3 = r15.next()     // Catch:{ Exception -> 0x00ba }
            org.jsoup.nodes.h r3 = (org.jsoup.nodes.h) r3     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = ".similardd"
            ag2 r4 = r3.z0(r4)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r7 = r4.o()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r4 = ".similarpic"
            ag2 r4 = r3.z0(r4)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = "img"
            ag2 r4 = r4.n(r5)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = "src"
            java.lang.String r4 = r4.c(r5)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = "href"
            java.lang.String r6 = r3.d(r5)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = ".similardd-categories"
            ag2 r3 = r3.z0(r5)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r10 = r3.o()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r3 = "/"
            boolean r3 = defpackage.v62.a(r6, r3)     // Catch:{ Exception -> 0x00b2 }
            r3 = r3 ^ r1
            if (r3 == 0) goto L_0x00b2
            qz1 r3 = new qz1     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = "slug"
            defpackage.v62.d(r6, r5)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r5 = "title"
            defpackage.v62.d(r7, r5)     // Catch:{ Exception -> 0x00b2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2 }
            r5.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = "https://animekisa.tv"
            r5.append(r8)     // Catch:{ Exception -> 0x00b2 }
            r5.append(r4)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = r5.toString()     // Catch:{ Exception -> 0x00b2 }
            r9 = 0
            r11 = 0
            r12 = 32
            r13 = 0
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00b3
        L_0x00b2:
            r3 = r0
        L_0x00b3:
            if (r3 == 0) goto L_0x004a
            r2.add(r3)     // Catch:{ Exception -> 0x00ba }
            goto L_0x004a
        L_0x00b9:
            return r2
        L_0x00ba:
            r15 = move-exception
            defpackage.uj2.d(r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz1.d(java.lang.String):java.util.List");
    }

    public mz1 e() {
        return this.j;
    }

    public long f() {
        return this.k;
    }

    public List<lz1> g(String str, int i2) {
        v62.e(str, "slug");
        try {
            bf2 a2 = df2.a("https://animekisa.tv" + str);
            a2.c(b.d.b());
            a2.f(true);
            ag2<h> z0 = a2.get().z0(".infovan");
            v62.d(z0, "root");
            ArrayList arrayList = new ArrayList(g32.l(z0, 10));
            for (h hVar : z0) {
                String d = hVar.d("href");
                String o = hVar.z0(".infoept2 > .centerv").o();
                v62.d(o, "episodeNumber");
                arrayList.add(new nz1(d, "", o, (String) null, (List<pz1>) null));
            }
            return e32.b(new lz1("~", "~", (Integer) null, n32.U(arrayList, new a()), 4, (r62) null));
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean h() {
        return this.h;
    }

    public List<oz1> i(String str, int i2) {
        oz1 oz1;
        String value;
        v62.e(str, "id");
        List<l22> h2 = f32.h(new l22("VidStreaming", "https://vidstreaming"), new l22("Fembed", "https://fcdn"), new l22("MP4Upload", "https://www.mp4upload"), new l22("Cloud9", "https://cloud9"));
        try {
            bf2 a2 = df2.a("https://animekisa.tv/" + str);
            a2.c(b.d.b());
            a2.f(true);
            String str2 = a2.get().p0().toString();
            ArrayList arrayList = new ArrayList();
            for (l22 l22 : h2) {
                s82 b = u82.b(new u82(((String) l22.d()) + "(.*?\")"), str2, 0, 2, (Object) null);
                if (b == null || (value = b.getValue()) == null) {
                    oz1 = null;
                } else {
                    if (f92.l(value, "\"", false, 2, (Object) null)) {
                        value = i92.k0(value, 1);
                    }
                    oz1 = new oz1((String) l22.c(), value);
                }
                if (oz1 != null) {
                    arrayList.add(oz1);
                }
            }
            return arrayList;
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
