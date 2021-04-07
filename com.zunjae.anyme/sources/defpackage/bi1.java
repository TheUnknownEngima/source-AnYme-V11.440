package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.ai1;
import defpackage.yh1;

@AutoValue
/* renamed from: bi1  reason: default package */
public abstract class bi1 {

    @AutoValue.Builder
    /* renamed from: bi1$a */
    public static abstract class a {
        public abstract bi1 a();

        public abstract a b(String str);

        public abstract a c(long j);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(ai1.a aVar);

        public abstract a h(long j);
    }

    static {
        a().a();
    }

    public static a a() {
        yh1.b bVar = new yh1.b();
        bVar.h(0);
        bVar.g(ai1.a.ATTEMPT_MIGRATION);
        bVar.c(0);
        return bVar;
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract ai1.a g();

    public abstract long h();

    public boolean i() {
        return g() == ai1.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == ai1.a.NOT_GENERATED || g() == ai1.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == ai1.a.REGISTERED;
    }

    public boolean l() {
        return g() == ai1.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == ai1.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public bi1 o(String str, long j, long j2) {
        a n = n();
        n.b(str);
        n.c(j);
        n.h(j2);
        return n.a();
    }

    public bi1 p() {
        a n = n();
        n.b((String) null);
        return n.a();
    }

    public bi1 q(String str) {
        a n = n();
        n.e(str);
        n.g(ai1.a.REGISTER_ERROR);
        return n.a();
    }

    public bi1 r() {
        a n = n();
        n.g(ai1.a.NOT_GENERATED);
        return n.a();
    }

    public bi1 s(String str, String str2, long j, String str3, long j2) {
        a n = n();
        n.d(str);
        n.g(ai1.a.REGISTERED);
        n.b(str3);
        n.f(str2);
        n.c(j2);
        n.h(j);
        return n.a();
    }

    public bi1 t(String str) {
        a n = n();
        n.d(str);
        n.g(ai1.a.UNREGISTERED);
        return n.a();
    }
}
