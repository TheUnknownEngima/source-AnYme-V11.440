package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.ci1;

@AutoValue
/* renamed from: fi1  reason: default package */
public abstract class fi1 {

    @AutoValue.Builder
    /* renamed from: fi1$a */
    public static abstract class a {
        public abstract fi1 a();

        public abstract a b(gi1 gi1);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* renamed from: fi1$b */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new ci1.b();
    }

    public abstract gi1 b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
