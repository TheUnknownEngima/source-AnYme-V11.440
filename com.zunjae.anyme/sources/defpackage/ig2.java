package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: ig2  reason: default package */
public final class ig2 {

    /* renamed from: ig2$a */
    static final class a extends w62 implements d62<sh2, mh2, Context> {
        final /* synthetic */ Context f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(2);
            this.f = context;
        }

        /* renamed from: a */
        public final Context G(sh2 sh2, mh2 mh2) {
            v62.f(sh2, "$receiver");
            v62.f(mh2, "it");
            return this.f;
        }
    }

    /* renamed from: ig2$b */
    static final class b extends w62 implements d62<sh2, mh2, Application> {
        final /* synthetic */ Context f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(2);
            this.f = context;
        }

        /* renamed from: a */
        public final Application G(sh2 sh2, mh2 mh2) {
            v62.f(sh2, "$receiver");
            v62.f(mh2, "it");
            return (Application) this.f;
        }
    }

    public static final ng2 a(ng2 ng2, Context context) {
        v62.f(ng2, "$this$androidContext");
        v62.f(context, "androidContext");
        if (ng2.c.b().d(jh2.INFO)) {
            ng2.c.b().c("[init] declare Android Context");
        }
        ph2 f = ng2.d().c().f();
        tg2 tg2 = tg2.a;
        a aVar = new a(context);
        ug2 ug2 = ug2.Single;
        sg2 sg2 = new sg2((oh2) null, (oh2) null, f72.b(Context.class));
        sg2.n(aVar);
        sg2.o(ug2);
        f.k(sg2);
        if (context instanceof Application) {
            ph2 f2 = ng2.d().c().f();
            tg2 tg22 = tg2.a;
            b bVar = new b(context);
            ug2 ug22 = ug2.Single;
            sg2 sg22 = new sg2((oh2) null, (oh2) null, f72.b(Application.class));
            sg22.n(bVar);
            sg22.o(ug22);
            f2.k(sg22);
        }
        return ng2;
    }
}
