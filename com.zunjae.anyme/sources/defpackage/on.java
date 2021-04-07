package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.in;
import java.util.List;

@AutoValue
/* renamed from: on  reason: default package */
public abstract class on {

    @AutoValue.Builder
    /* renamed from: on$a */
    public static abstract class a {
        public a a(int i) {
            e(Integer.valueOf(i));
            return this;
        }

        public abstract a b(long j);

        public abstract a c(mn mnVar);

        public abstract a d(rn rnVar);

        /* access modifiers changed from: package-private */
        public abstract a e(Integer num);

        /* access modifiers changed from: package-private */
        public abstract a f(String str);

        public abstract a g(List<nn> list);

        public abstract on h();

        public abstract a i(long j);

        public a j(String str) {
            f(str);
            return this;
        }
    }

    public static a a() {
        return new in.b();
    }

    public abstract mn b();

    public abstract List<nn> c();

    public abstract Integer d();

    public abstract String e();

    public abstract rn f();

    public abstract long g();

    public abstract long h();
}
