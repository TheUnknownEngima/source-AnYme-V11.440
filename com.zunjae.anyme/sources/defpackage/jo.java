package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import defpackage.eo;
import defpackage.ko;
import defpackage.zn;
import java.util.Collections;
import java.util.Set;

/* renamed from: jo  reason: default package */
public class jo implements io {
    private static volatile ko e;
    private final kq a;
    private final kq b;
    private final uo c;
    private final m d;

    jo(kq kqVar, kq kqVar2, uo uoVar, m mVar, q qVar) {
        this.a = kqVar;
        this.b = kqVar2;
        this.c = uoVar;
        this.d = mVar;
        qVar.a();
    }

    private zn b(Cdo doVar) {
        zn.a a2 = zn.a();
        a2.i(this.a.a());
        a2.k(this.b.a());
        a2.j(doVar.g());
        a2.h(new yn(doVar.b(), doVar.d()));
        a2.g(doVar.c().a());
        return a2.d();
    }

    public static jo c() {
        ko koVar = e;
        if (koVar != null) {
            return koVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<vm> d(wn wnVar) {
        return wnVar instanceof xn ? Collections.unmodifiableSet(((xn) wnVar).b()) : Collections.singleton(vm.b("proto"));
    }

    public static void f(Context context) {
        if (e == null) {
            synchronized (jo.class) {
                if (e == null) {
                    ko.a h = vn.h();
                    h.b(context);
                    e = h.a();
                }
            }
        }
    }

    public void a(Cdo doVar, bn bnVar) {
        this.c.a(doVar.f().e(doVar.c().c()), b(doVar), bnVar);
    }

    public m e() {
        return this.d;
    }

    public an g(wn wnVar) {
        Set<vm> d2 = d(wnVar);
        eo.a a2 = eo.a();
        a2.b(wnVar.a());
        a2.c(wnVar.H());
        return new fo(d2, a2.a(), this);
    }
}
