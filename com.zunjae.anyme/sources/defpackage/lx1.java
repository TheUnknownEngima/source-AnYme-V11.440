package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: lx1  reason: default package */
public final class lx1 {
    @SerializedName("mal_id")
    private Integer a;
    @SerializedName("title")
    private String b;
    @SerializedName("title_english")
    private String c;
    @SerializedName("image_url")
    private String d;
    @SerializedName("type")
    private String e;
    @SerializedName("source")
    private String f;
    @SerializedName("episodes")
    private Integer g;
    @SerializedName("status")
    private String h;
    @SerializedName("duration")
    private String i;
    @SerializedName("rating")
    private String j;
    @SerializedName("popularity")
    private String k;
    @SerializedName("score")
    private Double l;
    @SerializedName("rank")
    private Integer m;
    @SerializedName("trailer_url")
    private String n;
    @SerializedName("synopsis")
    private String o;
    @SerializedName("broadcast")
    private String p;
    @SerializedName("studios")
    private ArrayList<mx1> q;
    @SerializedName("genres")
    private ArrayList<kx1> r;
    @SerializedName("opening_themes")
    private ArrayList<String> s;
    @SerializedName("ending_themes")
    private ArrayList<String> t;
    private long u;
    @SerializedName("related")
    private qx1 v;
    @SerializedName("title_synonyms")
    private ArrayList<String> w;
    @SerializedName("aired")
    private ox1 x;

    /* renamed from: lx1$a */
    public final class a {
        private final String a;
        private final String b = ("https://www.youtube.com/results?search_query=" + a(true));
        private final b c;

        public a(lx1 lx1, String str, b bVar) {
            v62.e(str, "originalTitle");
            v62.e(bVar, "type");
            this.c = bVar;
            String a2 = he2.a(str);
            v62.d(a2, "StringEscapeUtils.unescapeHtml4(originalTitle)");
            this.a = a2;
        }

        private final String a(boolean z) {
            String d = new u82("\\s++").d(new u82("\"").d(new u82("\\(.*?\\) ?").d(this.a, ""), ""), " ");
            int length = d.length() - 1;
            int i = 0;
            boolean z2 = false;
            while (i <= length) {
                boolean z3 = v62.g(d.charAt(!z2 ? i : length), 32) <= 0;
                if (!z2) {
                    if (!z3) {
                        z2 = true;
                    } else {
                        i++;
                    }
                } else if (!z3) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = d.subSequence(i, length + 1).toString();
            return z ? obj : new u82("#[0-9]{0,4}: ").d(obj, "");
        }

        public final String b() {
            return new u82("''").d(new u82("“").d(new u82("”").d(this.a, "\""), "\""), "\"");
        }

        public final ArrayList<Integer> c() {
            Matcher matcher = Pattern.compile("\"([^\"]*)\"").matcher(b());
            if (!matcher.find()) {
                return null;
            }
            ArrayList<Integer> arrayList = new ArrayList<>(2);
            arrayList.add(Integer.valueOf(matcher.start() + 1));
            arrayList.add(Integer.valueOf(matcher.end() - 1));
            return arrayList;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[Catch:{ Exception -> 0x007d }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A[Catch:{ Exception -> 0x007d }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String d() {
            /*
                r6 = this;
                java.lang.String r0 = "\"([^\"]*)\""
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
                java.lang.String r1 = r6.b()
                java.util.regex.Matcher r0 = r0.matcher(r1)
                boolean r1 = r0.find()
                r2 = 0
                if (r1 == 0) goto L_0x007d
                r1 = 1
                java.lang.String r0 = r0.group(r1)     // Catch:{ Exception -> 0x007d }
                java.lang.String r3 = "title"
                defpackage.v62.d(r0, r3)     // Catch:{ Exception -> 0x007d }
                java.lang.String r3 = " ("
                r4 = 2
                r5 = 0
                boolean r3 = defpackage.g92.v(r0, r3, r5, r4, r2)     // Catch:{ Exception -> 0x007d }
                if (r3 == 0) goto L_0x007c
                java.lang.String r3 = " \\("
                u82 r4 = new u82     // Catch:{ Exception -> 0x007d }
                r4.<init>((java.lang.String) r3)     // Catch:{ Exception -> 0x007d }
                java.util.List r0 = r4.e(r0, r5)     // Catch:{ Exception -> 0x007d }
                boolean r3 = r0.isEmpty()     // Catch:{ Exception -> 0x007d }
                if (r3 != 0) goto L_0x0063
                int r3 = r0.size()     // Catch:{ Exception -> 0x007d }
                java.util.ListIterator r3 = r0.listIterator(r3)     // Catch:{ Exception -> 0x007d }
            L_0x0042:
                boolean r4 = r3.hasPrevious()     // Catch:{ Exception -> 0x007d }
                if (r4 == 0) goto L_0x0063
                java.lang.Object r4 = r3.previous()     // Catch:{ Exception -> 0x007d }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x007d }
                int r4 = r4.length()     // Catch:{ Exception -> 0x007d }
                if (r4 != 0) goto L_0x0056
                r4 = 1
                goto L_0x0057
            L_0x0056:
                r4 = 0
            L_0x0057:
                if (r4 != 0) goto L_0x0042
                int r3 = r3.nextIndex()     // Catch:{ Exception -> 0x007d }
                int r3 = r3 + r1
                java.util.List r0 = defpackage.n32.X(r0, r3)     // Catch:{ Exception -> 0x007d }
                goto L_0x0067
            L_0x0063:
                java.util.List r0 = defpackage.f32.f()     // Catch:{ Exception -> 0x007d }
            L_0x0067:
                java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ Exception -> 0x007d }
                java.lang.Object[] r0 = r0.toArray(r1)     // Catch:{ Exception -> 0x007d }
                if (r0 == 0) goto L_0x0074
                java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x007d }
                r0 = r0[r5]     // Catch:{ Exception -> 0x007d }
                goto L_0x007c
            L_0x0074:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x007d }
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
                r0.<init>(r1)     // Catch:{ Exception -> 0x007d }
                throw r0     // Catch:{ Exception -> 0x007d }
            L_0x007c:
                r2 = r0
            L_0x007d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.lx1.a.d():java.lang.String");
        }

        public final b e() {
            return this.c;
        }

        public final String f() {
            return this.b;
        }
    }

    /* renamed from: lx1$b */
    public enum b {
        OPENING,
        ENDING
    }

    private final ArrayList<a> f() {
        return m(this.t, b.ENDING);
    }

    private final ArrayList<a> m(ArrayList<String> arrayList, b bVar) {
        if (arrayList == null) {
            return null;
        }
        ArrayList<a> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            v62.d(next, "song");
            arrayList2.add(new a(this, next, bVar));
        }
        return arrayList2;
    }

    private final ArrayList<a> o() {
        return m(this.s, b.OPENING);
    }

    public final String A() {
        return this.c;
    }

    public final String B() {
        return this.n;
    }

    public final String C() {
        return this.e;
    }

    public final long D() {
        long j2;
        ox1 ox1 = this.x;
        if (ox1 == null) {
            return i02.a(5);
        }
        int a2 = ox1.a().a().a();
        String str = this.h;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 525822406) {
                if (hashCode != 1197950724) {
                    if (hashCode == 1378885426 && str.equals("Currently Airing")) {
                        j2 = 2;
                    }
                } else if (str.equals("Not yet aired")) {
                    return i02.b(1);
                }
            } else if (str.equals("Finished Airing") && a2 < 2017) {
                j2 = 14;
            }
            return i02.a(j2);
        }
        return i02.a(5);
    }

    public final void E(ox1 ox1) {
        this.x = ox1;
    }

    public final void F(String str) {
        this.p = str;
    }

    public final void G(String str) {
        this.i = str;
    }

    public final void H(ArrayList<String> arrayList) {
        this.t = arrayList;
    }

    public final void I(Integer num) {
        this.g = num;
    }

    public void J(long j2) {
        this.u = j2;
    }

    public final void K(long j2) {
        this.u = j2;
    }

    public final void L(ArrayList<kx1> arrayList) {
        this.r = arrayList;
    }

    public final void M(String str) {
        this.d = str;
    }

    public final void N(qx1 qx1) {
        this.v = qx1;
    }

    public final void O(Integer num) {
        this.a = num;
    }

    public final void P(ArrayList<String> arrayList) {
        this.s = arrayList;
    }

    public final void Q(String str) {
        this.k = str;
    }

    public final void R(Integer num) {
        this.m = num;
    }

    public final void S(String str) {
        this.j = str;
    }

    public final void T(Double d2) {
        this.l = d2;
    }

    public final void U(String str) {
        this.f = str;
    }

    public final void V(String str) {
        this.h = str;
    }

    public final void W(ArrayList<mx1> arrayList) {
        this.q = arrayList;
    }

    public final void X(ArrayList<String> arrayList) {
        this.w = arrayList;
    }

    public final void Y(String str) {
        this.o = str;
    }

    public final void Z(String str) {
        this.b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[Catch:{ Exception -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8 A[Catch:{ Exception -> 0x00c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r6 = this;
            java.lang.String r0 = r6.i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            u82 r0 = new u82
            java.lang.String r2 = "^[0-9]{1,2} min.*$"
            r0.<init>((java.lang.String) r2)
            java.lang.String r2 = r6.i
            defpackage.v62.c(r2)
            boolean r0 = r0.c(r2)
            if (r0 != 0) goto L_0x0019
            return r1
        L_0x0019:
            java.lang.String r0 = r6.i     // Catch:{ Exception -> 0x00c0 }
            defpackage.v62.c(r0)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r2 = " min"
            u82 r3 = new u82     // Catch:{ Exception -> 0x00c0 }
            r3.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x00c0 }
            r2 = 0
            java.util.List r0 = r3.e(r0, r2)     // Catch:{ Exception -> 0x00c0 }
            boolean r3 = r0.isEmpty()     // Catch:{ Exception -> 0x00c0 }
            if (r3 != 0) goto L_0x005a
            int r3 = r0.size()     // Catch:{ Exception -> 0x00c0 }
            java.util.ListIterator r3 = r0.listIterator(r3)     // Catch:{ Exception -> 0x00c0 }
        L_0x0038:
            boolean r4 = r3.hasPrevious()     // Catch:{ Exception -> 0x00c0 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r3.previous()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00c0 }
            int r4 = r4.length()     // Catch:{ Exception -> 0x00c0 }
            r5 = 1
            if (r4 != 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 != 0) goto L_0x0038
            int r3 = r3.nextIndex()     // Catch:{ Exception -> 0x00c0 }
            int r3 = r3 + r5
            java.util.List r0 = defpackage.n32.X(r0, r3)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x005e
        L_0x005a:
            java.util.List r0 = defpackage.f32.f()     // Catch:{ Exception -> 0x00c0 }
        L_0x005e:
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00c0 }
            java.lang.Object[] r0 = r0.toArray(r3)     // Catch:{ Exception -> 0x00c0 }
            if (r0 == 0) goto L_0x00b8
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ Exception -> 0x00c0 }
            r0 = r0[r2]     // Catch:{ Exception -> 0x00c0 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00c0 }
            java.lang.Integer r2 = r6.g     // Catch:{ Exception -> 0x00c0 }
            defpackage.v62.c(r2)     // Catch:{ Exception -> 0x00c0 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x00c0 }
            int r0 = r0 * r2
            r2 = 109(0x6d, float:1.53E-43)
            r3 = 60
            if (r0 <= r3) goto L_0x00ae
            int r4 = r0 / 60
            int r0 = r0 % r3
            if (r0 != 0) goto L_0x0096
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r0.<init>()     // Catch:{ Exception -> 0x00c0 }
            r0.append(r4)     // Catch:{ Exception -> 0x00c0 }
            r2 = 104(0x68, float:1.46E-43)
            r0.append(r2)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00b7
        L_0x0096:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r3.<init>()     // Catch:{ Exception -> 0x00c0 }
            r3.append(r4)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r4 = "h "
            r3.append(r4)     // Catch:{ Exception -> 0x00c0 }
            r3.append(r0)     // Catch:{ Exception -> 0x00c0 }
        L_0x00a6:
            r3.append(r2)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00b7
        L_0x00ae:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r3.<init>()     // Catch:{ Exception -> 0x00c0 }
            r3.append(r0)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00a6
        L_0x00b7:
            return r0
        L_0x00b8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r2)     // Catch:{ Exception -> 0x00c0 }
            throw r0     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx1.a():java.lang.String");
    }

    public final void a0(String str) {
        this.c = str;
    }

    public final ox1 b() {
        return this.x;
    }

    public final void b0(String str) {
        this.n = str;
    }

    public final ArrayList<a> c() {
        ArrayList<a> o2 = o();
        ArrayList<a> f2 = f();
        boolean z = true;
        boolean z2 = o2 != null && !o2.isEmpty();
        if (f2 == null || f2.isEmpty()) {
            z = false;
        }
        if (!z && !z2) {
            return null;
        }
        if (!z2 || !z) {
            return z ? f2 : o2;
        }
        v62.c(o2);
        v62.c(f2);
        o2.addAll(f2);
        return o2;
    }

    public final void c0(String str) {
        this.e = str;
    }

    public final String d() {
        return this.p;
    }

    public final String e() {
        return this.i;
    }

    public final ArrayList<String> g() {
        return this.t;
    }

    public final Integer h() {
        return this.g;
    }

    public final long i() {
        return this.u;
    }

    public final ArrayList<kx1> j() {
        return this.r;
    }

    public final String k() {
        return this.d;
    }

    public final qx1 l() {
        return this.v;
    }

    public final Integer n() {
        return this.a;
    }

    public final ArrayList<String> p() {
        return this.s;
    }

    public final String q() {
        return this.k;
    }

    public final Integer r() {
        return this.m;
    }

    public final String s() {
        return this.j;
    }

    public final Double t() {
        return this.l;
    }

    public final String u() {
        return this.f;
    }

    public final String v() {
        return this.h;
    }

    public final ArrayList<mx1> w() {
        return this.q;
    }

    public final ArrayList<String> x() {
        return this.w;
    }

    public final String y() {
        return this.o;
    }

    public final String z() {
        return this.b;
    }
}
