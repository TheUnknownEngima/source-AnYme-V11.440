package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.hn;

@AutoValue
/* renamed from: nn  reason: default package */
public abstract class nn {

    @AutoValue.Builder
    /* renamed from: nn$a */
    public static abstract class a {
        public abstract a a(long j);

        public abstract a b(qn qnVar);

        public abstract a c(Integer num);

        public abstract nn d();

        public abstract a e(long j);

        public abstract a f(long j);
    }

    public static a a(String str) {
        hn.b bVar = new hn.b();
        bVar.g(str);
        return bVar;
    }

    public static a b(byte[] bArr) {
        hn.b bVar = new hn.b();
        bVar.h(bArr);
        return bVar;
    }

    public abstract Integer c();

    public abstract long d();

    public abstract long e();

    public abstract qn f();

    public abstract byte[] g();

    public abstract String h();

    public abstract long i();
}
