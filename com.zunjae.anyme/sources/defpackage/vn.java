package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.j;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import defpackage.ko;
import java.util.concurrent.Executor;

/* renamed from: vn  reason: default package */
final class vn extends ko {
    private j12<Executor> e;
    private j12<Context> f;
    private j12 g;
    private j12 h;
    private j12 i;
    private j12<aq> j;
    private j12<g> k;
    private j12<s> l;
    private j12<so> m;
    private j12<m> n;
    private j12<q> o;
    private j12<jo> p;

    /* renamed from: vn$b */
    private static final class b implements ko.a {
        private Context a;

        private b() {
        }

        public ko a() {
            p02.a(this.a, Context.class);
            return new vn(this.a);
        }

        public /* bridge */ /* synthetic */ ko.a b(Context context) {
            c(context);
            return this;
        }

        public b c(Context context) {
            p02.b(context);
            this.a = context;
            return this;
        }
    }

    private vn(Context context) {
        i(context);
    }

    public static ko.a h() {
        return new b();
    }

    private void i(Context context) {
        this.e = m02.a(bo.a());
        n02 a2 = o02.a(context);
        this.f = a2;
        j a3 = j.a(a2, mq.a(), nq.a());
        this.g = a3;
        this.h = m02.a(l.a(this.f, a3));
        this.i = hq.a(this.f, ep.a(), fp.a());
        this.j = m02.a(bq.a(mq.a(), nq.a(), gp.a(), this.i));
        wo b2 = wo.b(mq.a());
        this.k = b2;
        yo a4 = yo.a(this.f, this.j, b2, nq.a());
        this.l = a4;
        j12<Executor> j12 = this.e;
        j12 j122 = this.h;
        j12<aq> j123 = this.j;
        this.m = to.a(j12, j122, a4, j123, j123);
        j12<Context> j124 = this.f;
        j12 j125 = this.h;
        j12<aq> j126 = this.j;
        this.n = n.a(j124, j125, j126, this.l, this.e, j126, mq.a());
        j12<Executor> j127 = this.e;
        j12<aq> j128 = this.j;
        this.o = r.a(j127, j128, this.l, j128);
        this.p = m02.a(lo.a(mq.a(), nq.a(), this.m, this.n, this.o));
    }

    /* access modifiers changed from: package-private */
    public bp a() {
        return this.j.get();
    }

    /* access modifiers changed from: package-private */
    public jo b() {
        return this.p.get();
    }
}
