package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ng2  reason: default package */
public final class ng2 {
    /* access modifiers changed from: private */
    public static kh2 b = new ih2();
    public static final a c = new a((r62) null);
    private final mg2 a;

    /* renamed from: ng2$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final ng2 a() {
            ng2 ng2 = new ng2((r62) null);
            ng2.e();
            return ng2;
        }

        public final kh2 b() {
            return ng2.b;
        }
    }

    /* renamed from: ng2$b */
    static final class b extends w62 implements o52<u22> {
        final /* synthetic */ ng2 f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ng2 ng2) {
            super(0);
            this.f = ng2;
        }

        public final void a() {
            this.f.d().a();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    /* renamed from: ng2$c */
    static final class c extends w62 implements o52<u22> {
        final /* synthetic */ ng2 f;
        final /* synthetic */ List g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ng2 ng2, List list) {
            super(0);
            this.f = ng2;
            this.g = list;
        }

        public final void a() {
            this.f.f(this.g);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return u22.a;
        }
    }

    private ng2() {
        this.a = new mg2();
    }

    public /* synthetic */ ng2(r62 r62) {
        this();
    }

    /* access modifiers changed from: private */
    public final void f(Iterable<lh2> iterable) {
        this.a.c().f().j(iterable);
        this.a.d().e(iterable);
    }

    public final ng2 c() {
        if (b.d(jh2.DEBUG)) {
            double b2 = vh2.b(new b(this));
            kh2 kh2 = b;
            kh2.a("instances started in " + b2 + " ms");
        } else {
            this.a.a();
        }
        return this;
    }

    public final mg2 d() {
        return this.a;
    }

    public final void e() {
        this.a.d().d(this.a);
    }

    public final ng2 g(List<lh2> list) {
        v62.f(list, "modules");
        if (b.d(jh2.INFO)) {
            double b2 = vh2.b(new c(this, list));
            int size = this.a.c().f().i().size();
            Collection<uh2> c2 = this.a.d().c();
            ArrayList arrayList = new ArrayList(g32.l(c2, 10));
            for (uh2 a2 : c2) {
                arrayList.add(Integer.valueOf(a2.a().size()));
            }
            int W = size + n32.W(arrayList);
            kh2 kh2 = b;
            kh2.c("total " + W + " registered definitions");
            kh2 kh22 = b;
            kh22.c("load modules in " + b2 + " ms");
        } else {
            f(list);
        }
        return this;
    }
}
