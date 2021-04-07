package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.zo;

@AutoValue
/* renamed from: cp  reason: default package */
abstract class cp {
    static final cp a;

    @AutoValue.Builder
    /* renamed from: cp$a */
    static abstract class a {
        a() {
        }

        /* access modifiers changed from: package-private */
        public abstract cp a();

        /* access modifiers changed from: package-private */
        public abstract a b(int i);

        /* access modifiers changed from: package-private */
        public abstract a c(long j);

        /* access modifiers changed from: package-private */
        public abstract a d(int i);

        /* access modifiers changed from: package-private */
        public abstract a e(int i);

        /* access modifiers changed from: package-private */
        public abstract a f(long j);
    }

    static {
        a a2 = a();
        a2.f(10485760);
        a2.d(200);
        a2.b(10000);
        a2.c(604800000);
        a2.e(81920);
        a = a2.a();
    }

    cp() {
    }

    static a a() {
        return new zo.b();
    }

    /* access modifiers changed from: package-private */
    public abstract int b();

    /* access modifiers changed from: package-private */
    public abstract long c();

    /* access modifiers changed from: package-private */
    public abstract int d();

    /* access modifiers changed from: package-private */
    public abstract int e();

    /* access modifiers changed from: package-private */
    public abstract long f();
}
