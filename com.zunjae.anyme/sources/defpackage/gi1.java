package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.di1;

@AutoValue
/* renamed from: gi1  reason: default package */
public abstract class gi1 {

    @AutoValue.Builder
    /* renamed from: gi1$a */
    public static abstract class a {
        public abstract gi1 a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j);
    }

    /* renamed from: gi1$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        di1.b bVar = new di1.b();
        bVar.d(0);
        return bVar;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
