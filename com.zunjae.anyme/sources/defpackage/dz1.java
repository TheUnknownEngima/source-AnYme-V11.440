package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: dz1  reason: default package */
public final class dz1 {
    public static final dz1 a = new dz1();

    /* renamed from: dz1$a */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((sy1) t).u()), Integer.valueOf(((sy1) t2).u()));
        }
    }

    /* renamed from: dz1$b */
    public static final class b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((sy1) t).getOrder()), Integer.valueOf(((sy1) t2).getOrder()));
        }
    }

    /* renamed from: dz1$c */
    public static final class c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(((sy1) t).y(), ((sy1) t2).y());
        }
    }

    /* renamed from: dz1$d */
    public static final class d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((sy1) t).m()), Integer.valueOf(((sy1) t2).m()));
        }
    }

    /* renamed from: dz1$e */
    public static final class e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Double.valueOf(((sy1) t).q()), Double.valueOf(((sy1) t2).q()));
        }
    }

    /* renamed from: dz1$f */
    public static final class f<T> implements Comparator<T> {
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r8 = defpackage.f92.q((r1 = r8.j()), "-", "", false, 4, (java.lang.Object) null);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(T r8, T r9) {
            /*
                r7 = this;
                sy1 r8 = (defpackage.sy1) r8
                yy1 r8 = r8.k()
                r0 = 0
                if (r8 == 0) goto L_0x0021
                java.lang.String r1 = r8.j()
                if (r1 == 0) goto L_0x0021
                r4 = 0
                r5 = 4
                r6 = 0
                java.lang.String r2 = "-"
                java.lang.String r3 = ""
                java.lang.String r8 = defpackage.f92.q(r1, r2, r3, r4, r5, r6)
                if (r8 == 0) goto L_0x0021
                java.lang.Integer r8 = defpackage.e92.g(r8)
                goto L_0x0022
            L_0x0021:
                r8 = r0
            L_0x0022:
                sy1 r9 = (defpackage.sy1) r9
                yy1 r9 = r9.k()
                if (r9 == 0) goto L_0x0041
                java.lang.String r1 = r9.j()
                if (r1 == 0) goto L_0x0041
                r4 = 0
                r5 = 4
                r6 = 0
                java.lang.String r2 = "-"
                java.lang.String r3 = ""
                java.lang.String r9 = defpackage.f92.q(r1, r2, r3, r4, r5, r6)
                if (r9 == 0) goto L_0x0041
                java.lang.Integer r0 = defpackage.e92.g(r9)
            L_0x0041:
                int r8 = defpackage.d42.a(r8, r0)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dz1.f.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: dz1$g */
    public static final class g<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            ky1 d = ((sy1) t).d();
            long j = Long.MAX_VALUE;
            Long valueOf = Long.valueOf(d != null ? d.d() : Long.MAX_VALUE);
            ky1 d2 = ((sy1) t2).d();
            if (d2 != null) {
                j = d2.d();
            }
            return d42.a(valueOf, Long.valueOf(j));
        }
    }

    /* renamed from: dz1$h */
    public static final class h<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((sy1) t2).u()), Integer.valueOf(((sy1) t).u()));
        }
    }

    /* renamed from: dz1$i */
    public static final class i<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((sy1) t2).getOrder()), Integer.valueOf(((sy1) t).getOrder()));
        }
    }

    /* renamed from: dz1$j */
    public static final class j<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(((sy1) t2).y(), ((sy1) t).y());
        }
    }

    /* renamed from: dz1$k */
    public static final class k<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((sy1) t2).m()), Integer.valueOf(((sy1) t).m()));
        }
    }

    /* renamed from: dz1$l */
    public static final class l<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Double.valueOf(((sy1) t2).q()), Double.valueOf(((sy1) t).q()));
        }
    }

    /* renamed from: dz1$m */
    public static final class m<T> implements Comparator<T> {
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r9 = defpackage.f92.q((r1 = r9.j()), "-", "", false, 4, (java.lang.Object) null);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(T r8, T r9) {
            /*
                r7 = this;
                sy1 r9 = (defpackage.sy1) r9
                yy1 r9 = r9.k()
                r0 = 0
                if (r9 == 0) goto L_0x0021
                java.lang.String r1 = r9.j()
                if (r1 == 0) goto L_0x0021
                r4 = 0
                r5 = 4
                r6 = 0
                java.lang.String r2 = "-"
                java.lang.String r3 = ""
                java.lang.String r9 = defpackage.f92.q(r1, r2, r3, r4, r5, r6)
                if (r9 == 0) goto L_0x0021
                java.lang.Integer r9 = defpackage.e92.g(r9)
                goto L_0x0022
            L_0x0021:
                r9 = r0
            L_0x0022:
                sy1 r8 = (defpackage.sy1) r8
                yy1 r8 = r8.k()
                if (r8 == 0) goto L_0x0041
                java.lang.String r1 = r8.j()
                if (r1 == 0) goto L_0x0041
                r4 = 0
                r5 = 4
                r6 = 0
                java.lang.String r2 = "-"
                java.lang.String r3 = ""
                java.lang.String r8 = defpackage.f92.q(r1, r2, r3, r4, r5, r6)
                if (r8 == 0) goto L_0x0041
                java.lang.Integer r0 = defpackage.e92.g(r8)
            L_0x0041:
                int r8 = defpackage.d42.a(r9, r0)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dz1.m.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* renamed from: dz1$n */
    public static final class n<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            ky1 d = ((sy1) t2).d();
            long j = Long.MIN_VALUE;
            Long valueOf = Long.valueOf(d != null ? d.d() : Long.MIN_VALUE);
            ky1 d2 = ((sy1) t).d();
            if (d2 != null) {
                j = d2.d();
            }
            return d42.a(valueOf, Long.valueOf(j));
        }
    }

    /* renamed from: dz1$o */
    public static final class o<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return d42.a(Integer.valueOf(((sy1) t2).getOrder()), Integer.valueOf(((sy1) t).getOrder()));
        }
    }

    private dz1() {
    }

    private final int b() {
        return l02.g("KEY_ANIME_SORT_DB5", gz1.LastUpdatedDesc.getCode());
    }

    private final void e(int i2) {
        l02.r("KEY_ANIME_SORT_DB5", i2);
    }

    public final int a(int i2) {
        if (!f()) {
            return b();
        }
        String format = String.format("SortOrderSpecificScreen%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        v62.d(format, "java.lang.String.format(this, *args)");
        return l02.g(format, b());
    }

    public final void c(int i2, Integer num) {
        if (!f() || num == null) {
            e(i2);
            return;
        }
        String format = String.format("SortOrderSpecificScreen%d", Arrays.copyOf(new Object[]{num}, 1));
        v62.d(format, "java.lang.String.format(this, *args)");
        l02.r(format, i2);
    }

    public final void d(boolean z) {
        l02.p("SettingRememberByScreenV2", z);
    }

    public final boolean f() {
        return l02.e("SettingRememberByScreenV2", false);
    }

    public final List<sy1> g(List<sy1> list, int i2) {
        Comparator comparator;
        v62.e(list, "animes");
        gz1 a2 = gz1.Companion.a(a(i2));
        if (a2 != null) {
            switch (cz1.a[a2.ordinal()]) {
                case 1:
                    comparator = new a();
                    break;
                case 2:
                    comparator = new h();
                    break;
                case 3:
                    comparator = new i();
                    break;
                case 4:
                    comparator = new b();
                    break;
                case 5:
                    comparator = new c();
                    break;
                case 6:
                    comparator = new j();
                    break;
                case 7:
                    comparator = new d();
                    break;
                case 8:
                    comparator = new k();
                    break;
                case 9:
                    comparator = new e();
                    break;
                case 10:
                    comparator = new l();
                    break;
                case 11:
                    comparator = new f();
                    break;
                case 12:
                    comparator = new m();
                    break;
                case 13:
                    comparator = new g();
                    break;
                case 14:
                    comparator = new n();
                    break;
            }
        }
        comparator = new o();
        return n32.U(list, comparator);
    }
}
