package defpackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import com.zunjae.anyme.features.bookmarks.BookmarkEntriesActivity;
import com.zunjae.vresult.a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: qu1  reason: default package */
public final class qu1 extends a0 {
    private List<com.zunjae.anyme.features.kanon.a> c;
    private ArrayList<Integer> d;
    private yx1 e;
    private ArrayList<vy1> f = new ArrayList<>();
    private int g;
    private boolean h;
    private t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.notes.d>>> i = new t<>();
    private t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.kanon.j>>> j = new t<>();
    private t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.kanon.b>>> k = new t<>();
    private t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.waifus.j>>> l = new t<>();
    private t<com.zunjae.vresult.a<List<ct1>>> m = new t<>();
    private t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.bookmarks.b>>> n = new t<>();
    private t<com.zunjae.vresult.a<List<jt1>>> o = new t<>();
    private t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.bookmarks.f>>> p = new t<>();
    private t<com.zunjae.vresult.a<List<vs1>>> q = new t<>();
    private t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.discover.continue_watching.d>>> r = new t<>();
    private final tv1 s;
    private final com.zunjae.anyme.features.kanon.e t;
    private final ov1 u;

    /* renamed from: qu1$a */
    static final class a extends w62 implements z52<List<? extends com.zunjae.anyme.features.bookmarks.f>, List<? extends com.zunjae.anyme.features.bookmarks.f>> {
        public static final a f = new a();

        /* renamed from: qu1$a$a  reason: collision with other inner class name */
        public static final class C0259a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(((com.zunjae.anyme.features.bookmarks.f) t).e(), ((com.zunjae.anyme.features.bookmarks.f) t2).e());
            }
        }

        /* renamed from: qu1$a$b */
        public static final class b<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                ry1 d = ((com.zunjae.anyme.features.bookmarks.f) t).d();
                int i = 0;
                Integer valueOf = Integer.valueOf(d != null ? d.c() : 0);
                ry1 d2 = ((com.zunjae.anyme.features.bookmarks.f) t2).d();
                if (d2 != null) {
                    i = d2.c();
                }
                return d42.a(valueOf, Integer.valueOf(i));
            }
        }

        /* renamed from: qu1$a$c */
        public static final class c<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(Integer.valueOf(((com.zunjae.anyme.features.bookmarks.f) t).b()), Integer.valueOf(((com.zunjae.anyme.features.bookmarks.f) t2).b()));
            }
        }

        /* renamed from: qu1$a$d */
        public static final class d<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(((com.zunjae.anyme.features.bookmarks.f) t2).e(), ((com.zunjae.anyme.features.bookmarks.f) t).e());
            }
        }

        /* renamed from: qu1$a$e */
        public static final class e<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                ry1 d = ((com.zunjae.anyme.features.bookmarks.f) t2).d();
                int i = 0;
                Integer valueOf = Integer.valueOf(d != null ? d.c() : 0);
                ry1 d2 = ((com.zunjae.anyme.features.bookmarks.f) t).d();
                if (d2 != null) {
                    i = d2.c();
                }
                return d42.a(valueOf, Integer.valueOf(i));
            }
        }

        /* renamed from: qu1$a$f */
        public static final class f<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return d42.a(Integer.valueOf(((com.zunjae.anyme.features.bookmarks.f) t2).b()), Integer.valueOf(((com.zunjae.anyme.features.bookmarks.f) t).b()));
            }
        }

        a() {
            super(1);
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.bookmarks.f> r(List<com.zunjae.anyme.features.bookmarks.f> list) {
            Comparator comparator;
            v62.e(list, "bookmarks");
            switch (pu1.a[BookmarkEntriesActivity.d.Companion.a(BookmarkEntriesActivity.J.a()).ordinal()]) {
                case 1:
                    comparator = new C0259a();
                    break;
                case 2:
                    comparator = new d();
                    break;
                case 3:
                    comparator = new b();
                    break;
                case 4:
                    comparator = new e();
                    break;
                case 5:
                    comparator = new c();
                    break;
                case 6:
                    comparator = new f();
                    break;
                default:
                    throw new j22();
            }
            return n32.U(list, comparator);
        }
    }

    /* renamed from: qu1$b */
    static final class b extends w62 implements o52<List<? extends com.zunjae.anyme.features.bookmarks.f>> {
        final /* synthetic */ qu1 f;
        final /* synthetic */ String g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(qu1 qu1, String str) {
            super(0);
            this.f = qu1;
            this.g = str;
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.bookmarks.f> invoke() {
            boolean z;
            List<com.zunjae.anyme.features.bookmarks.f> a = this.f.u().z(this.g).h().a();
            v62.c(a);
            v62.d(a, "kanonService.getBookmark…arkId).execute().body()!!");
            List<com.zunjae.anyme.features.bookmarks.f> list = a;
            ov1 k = this.f.k();
            ArrayList arrayList = new ArrayList(g32.l(list, 10));
            for (com.zunjae.anyme.features.bookmarks.f a2 : list) {
                arrayList.add(Integer.valueOf(a2.a()));
            }
            List<ry1> N = k.N(arrayList);
            for (com.zunjae.anyme.features.bookmarks.f fVar : list) {
                T t = null;
                if (N != null) {
                    Iterator<T> it = N.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (((int) ((ry1) next).a()) == fVar.a()) {
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
                    t = (ry1) t;
                }
                fVar.f(t);
            }
            return a.f.r(list);
        }
    }

    /* renamed from: qu1$c */
    static final class c extends w62 implements o52<List<? extends com.zunjae.anyme.features.bookmarks.b>> {
        final /* synthetic */ qu1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(qu1 qu1) {
            super(0);
            this.f = qu1;
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.bookmarks.b> invoke() {
            return this.f.u().H().h().a();
        }
    }

    /* renamed from: qu1$d */
    static final class d extends w62 implements o52<List<? extends com.zunjae.anyme.features.discover.continue_watching.d>> {
        final /* synthetic */ qu1 f;

        /* renamed from: qu1$d$a */
        public static final class a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                String str;
                String c;
                xy1 a = ((com.zunjae.anyme.features.discover.continue_watching.d) t).a();
                String str2 = "";
                if (a == null || (str = a.c()) == null) {
                    str = str2;
                }
                xy1 a2 = ((com.zunjae.anyme.features.discover.continue_watching.d) t2).a();
                if (!(a2 == null || (c = a2.c()) == null)) {
                    str2 = c;
                }
                return d42.a(str, str2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(qu1 qu1) {
            super(0);
            this.f = qu1;
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.discover.continue_watching.d> invoke() {
            T t;
            boolean z;
            ArrayList<com.zunjae.anyme.features.discover.continue_watching.c> a2 = this.f.u().o(new com.zunjae.anyme.features.kanon.k(this.f.k().D(), this.f.k().b())).h().a();
            v62.c(a2);
            v62.d(a2, "kanonService.continueWat…gJson).execute().body()!!");
            ArrayList<com.zunjae.anyme.features.discover.continue_watching.c> arrayList = a2;
            ov1 k = this.f.k();
            ArrayList arrayList2 = new ArrayList(g32.l(arrayList, 10));
            for (com.zunjae.anyme.features.discover.continue_watching.c d : arrayList) {
                arrayList2.add(Integer.valueOf(d.d()));
            }
            List<xy1> I = k.I(arrayList2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : arrayList) {
                Integer valueOf = Integer.valueOf(((com.zunjae.anyme.features.discover.continue_watching.c) next).d());
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((List) obj).add(next);
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Iterator<T> it = I.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((int) ((xy1) t).a()) == ((Number) entry.getKey()).intValue()) {
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
                arrayList3.add(new com.zunjae.anyme.features.discover.continue_watching.d((xy1) t, (List) entry.getValue()));
            }
            return n32.U(arrayList3, new a());
        }
    }

    /* renamed from: qu1$e */
    static final class e extends w62 implements o52<List<? extends jt1>> {
        final /* synthetic */ qu1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(qu1 qu1) {
            super(0);
            this.f = qu1;
        }

        /* renamed from: a */
        public final List<jt1> invoke() {
            return this.f.u().B().h().a();
        }
    }

    /* renamed from: qu1$f */
    static final class f extends w62 implements o52<List<? extends ct1>> {
        final /* synthetic */ qu1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(qu1 qu1) {
            super(0);
            this.f = qu1;
        }

        /* renamed from: a */
        public final List<ct1> invoke() {
            return this.f.u().p().h().a();
        }
    }

    /* renamed from: qu1$g */
    static final class g extends w62 implements o52<List<? extends com.zunjae.anyme.features.kanon.b>> {
        final /* synthetic */ qu1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(qu1 qu1) {
            super(0);
            this.f = qu1;
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.kanon.b> invoke() {
            return this.f.u().D().h().a();
        }
    }

    /* renamed from: qu1$h */
    static final class h extends w62 implements o52<List<? extends com.zunjae.anyme.features.notes.d>> {
        final /* synthetic */ qu1 f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(qu1 qu1, int i, int i2) {
            super(0);
            this.f = qu1;
            this.g = i;
            this.h = i2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.zunjae.anyme.features.notes.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.zunjae.anyme.features.notes.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.zunjae.anyme.features.notes.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: com.zunjae.anyme.features.notes.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.zunjae.anyme.features.notes.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.zunjae.anyme.features.notes.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.zunjae.anyme.features.notes.d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<com.zunjae.anyme.features.notes.d> invoke() {
            /*
                r14 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                qu1 r1 = r14.f
                com.zunjae.anyme.features.kanon.e r1 = r1.u()
                int r2 = r14.g
                ai2 r1 = r1.v(r2)
                qi2 r1 = r1.h()
                java.lang.Object r1 = r1.a()
                java.util.List r1 = (java.util.List) r1
                java.util.Calendar r2 = java.util.Calendar.getInstance()
                r3 = 1
                int r2 = r2.get(r3)
                java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
                java.lang.String r5 = "MMMM dd HH:mm"
                r4.<init>(r5)
                java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
                java.lang.String r6 = "YYYY MMMM dd HH:mm"
                r5.<init>(r6)
                if (r1 == 0) goto L_0x007e
                java.util.Iterator r6 = r1.iterator()
            L_0x0038:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L_0x007e
                java.lang.Object r7 = r6.next()
                com.zunjae.anyme.features.notes.d r7 = (com.zunjae.anyme.features.notes.d) r7
                qu1 r8 = r14.f
                long r9 = r7.a()
                java.lang.Integer r8 = r8.C(r9)
                if (r8 == 0) goto L_0x0055
                int r8 = r8.intValue()
                goto L_0x0056
            L_0x0055:
                r8 = -1
            L_0x0056:
                r9 = 1000(0x3e8, float:1.401E-42)
                if (r2 != r8) goto L_0x006b
                java.util.Date r8 = new java.util.Date
                long r10 = r7.a()
                long r12 = (long) r9
                long r10 = r10 * r12
                r8.<init>(r10)
                java.lang.String r8 = r4.format(r8)
                goto L_0x007b
            L_0x006b:
                java.util.Date r8 = new java.util.Date
                long r10 = r7.a()
                long r12 = (long) r9
                long r10 = r10 * r12
                r8.<init>(r10)
                java.lang.String r8 = r5.format(r8)
            L_0x007b:
                r7.e = r8
                goto L_0x0038
            L_0x007e:
                int r2 = r14.h
                if (r2 < 0) goto L_0x00b9
                r4 = 0
                r5 = 0
            L_0x0084:
                r6 = 0
                if (r1 == 0) goto L_0x00a6
                java.util.Iterator r7 = r1.iterator()
            L_0x008b:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00a4
                java.lang.Object r8 = r7.next()
                r9 = r8
                com.zunjae.anyme.features.notes.d r9 = (com.zunjae.anyme.features.notes.d) r9
                int r9 = r9.b()
                if (r9 != r5) goto L_0x00a0
                r9 = 1
                goto L_0x00a1
            L_0x00a0:
                r9 = 0
            L_0x00a1:
                if (r9 == 0) goto L_0x008b
                r6 = r8
            L_0x00a4:
                com.zunjae.anyme.features.notes.d r6 = (com.zunjae.anyme.features.notes.d) r6
            L_0x00a6:
                if (r6 != 0) goto L_0x00b1
                com.zunjae.anyme.features.notes.d r6 = new com.zunjae.anyme.features.notes.d
                int r7 = r14.g
                java.lang.String r8 = ""
                r6.<init>(r7, r5, r8)
            L_0x00b1:
                r0.add(r6)
                if (r5 == r2) goto L_0x00b9
                int r5 = r5 + 1
                goto L_0x0084
            L_0x00b9:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qu1.h.invoke():java.util.List");
        }
    }

    /* renamed from: qu1$i */
    static final class i extends w62 implements o52<List<? extends vs1>> {
        final /* synthetic */ qu1 f;
        final /* synthetic */ int g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(qu1 qu1, int i) {
            super(0);
            this.f = qu1;
            this.g = i;
        }

        /* renamed from: a */
        public final List<vs1> invoke() {
            List<vy1> a = this.f.u().a(this.g).h().a();
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(g32.l(a, 10));
            for (vy1 vy1 : a) {
                int e = vy1.e();
                String g2 = vy1.g();
                String d = vy1.d();
                arrayList.add(new vs1(e, g2, d, "{faw-star} " + vy1.f(), vy1.i()));
            }
            return arrayList;
        }
    }

    /* renamed from: qu1$j */
    static final class j extends w62 implements o52<List<? extends com.zunjae.anyme.features.kanon.j>> {
        final /* synthetic */ qu1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(qu1 qu1) {
            super(0);
            this.f = qu1;
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.kanon.j> invoke() {
            boolean z;
            List<com.zunjae.anyme.features.kanon.j> a = this.f.u().u().h().a();
            if (a != null) {
                ov1 k = this.f.k();
                ArrayList arrayList = new ArrayList(g32.l(a, 10));
                for (com.zunjae.anyme.features.kanon.j d : a) {
                    arrayList.add(Integer.valueOf(d.d()));
                }
                List<ry1> N = k.N(arrayList);
                for (com.zunjae.anyme.features.kanon.j jVar : a) {
                    T t = null;
                    if (N != null) {
                        Iterator<T> it = N.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (((int) ((ry1) next).a()) == jVar.d()) {
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
                        t = (ry1) t;
                    }
                    jVar.k(t);
                }
            }
            return a;
        }
    }

    /* renamed from: qu1$k */
    static final class k extends w62 implements o52<List<? extends com.zunjae.anyme.features.waifus.j>> {
        final /* synthetic */ qu1 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(qu1 qu1) {
            super(0);
            this.f = qu1;
        }

        /* renamed from: a */
        public final List<com.zunjae.anyme.features.waifus.j> invoke() {
            return this.f.u().m(75).h().a();
        }
    }

    public qu1(tv1 tv1, com.zunjae.anyme.features.kanon.e eVar, ov1 ov1) {
        v62.e(tv1, "kanonRepository");
        v62.e(eVar, "kanonService");
        v62.e(ov1, "animeRepository");
        this.s = tv1;
        this.t = eVar;
        this.u = ov1;
    }

    /* access modifiers changed from: private */
    public final Integer C(long j2) {
        try {
            Calendar instance = Calendar.getInstance();
            v62.d(instance, "cal");
            instance.setTimeInMillis(j2);
            return Integer.valueOf(instance.get(1));
        } catch (Exception unused) {
            return null;
        }
    }

    public final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.kanon.j>>> A() {
        return this.j;
    }

    public final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.waifus.j>>> B() {
        return this.l;
    }

    public final boolean D() {
        return this.h;
    }

    public final void E(String str) {
        v62.e(str, "bookmarkId");
        a aVar = a.f;
        com.zunjae.vresult.b.b(this, this.p, new b(this, str));
    }

    public final void F() {
        com.zunjae.vresult.b.b(this, this.n, new c(this));
    }

    public final void G() {
        com.zunjae.vresult.b.b(this, this.r, new d(this));
    }

    public final void H() {
        com.zunjae.vresult.b.b(this, this.o, new e(this));
    }

    public final void I() {
        com.zunjae.vresult.b.b(this, this.m, new f(this));
    }

    public final void J() {
        com.zunjae.vresult.b.b(this, this.k, new g(this));
    }

    public final void K(int i2, int i3) {
        com.zunjae.vresult.b.b(this, this.i, new h(this, i2, i3));
    }

    public final void L(int i2) {
        com.zunjae.vresult.b.b(this, this.q, new i(this, i2));
    }

    public final void M() {
        com.zunjae.vresult.b.b(this, this.j, new j(this));
    }

    public final void N() {
        com.zunjae.vresult.b.b(this, this.l, new k(this));
    }

    public final void O(com.zunjae.anyme.features.waifus.j jVar) {
        v62.e(jVar, "kanonWaifu");
        this.s.c(jVar);
    }

    public final void P(List<com.zunjae.anyme.features.kanon.a> list) {
        this.c = list;
    }

    public final void Q(yx1 yx1) {
        this.e = yx1;
    }

    public final void R(boolean z) {
        this.h = z;
    }

    public final void S(ArrayList<Integer> arrayList) {
        this.d = arrayList;
    }

    public final void T(int i2) {
        this.g = i2;
    }

    public final void U() {
        this.s.g();
    }

    public final void g(com.zunjae.anyme.features.bookmarks.b bVar) {
        v62.e(bVar, "bookmark");
        com.zunjae.vresult.a d2 = this.n.d();
        List list = d2 != null ? (List) d2.a() : null;
        if (list == null || list.isEmpty()) {
            this.n.k(new a.e(e32.b(bVar)));
            return;
        }
        List d0 = n32.d0(list);
        d0.add(bVar);
        this.n.k(new a.e(d0));
    }

    public final LiveData<List<com.zunjae.anyme.features.waifus.j>> h() {
        return this.s.a();
    }

    public final void i() {
        System.out.println("Hi I'm alive");
    }

    public final void j(com.zunjae.anyme.features.waifus.j jVar) {
        v62.e(jVar, "kanonWaifu");
        this.s.b(jVar);
    }

    public final ov1 k() {
        return this.u;
    }

    public final List<com.zunjae.anyme.features.kanon.a> l() {
        return this.c;
    }

    public final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.bookmarks.f>>> m() {
        return this.p;
    }

    public final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.bookmarks.b>>> n() {
        return this.n;
    }

    public final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.kanon.b>>> o() {
        return this.k;
    }

    public final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.discover.continue_watching.d>>> p() {
        return this.r;
    }

    public final t<com.zunjae.vresult.a<List<jt1>>> q() {
        return this.o;
    }

    public final ArrayList<vy1> r() {
        return this.f;
    }

    public final t<com.zunjae.vresult.a<List<ct1>>> s() {
        return this.m;
    }

    public final tv1 t() {
        return this.s;
    }

    public final com.zunjae.anyme.features.kanon.e u() {
        return this.t;
    }

    public final yx1 v() {
        return this.e;
    }

    public final ArrayList<Integer> w() {
        return this.d;
    }

    public final t<com.zunjae.vresult.a<List<com.zunjae.anyme.features.notes.d>>> x() {
        return this.i;
    }

    public final int y() {
        return this.g;
    }

    public final t<com.zunjae.vresult.a<List<vs1>>> z() {
        return this.q;
    }
}
