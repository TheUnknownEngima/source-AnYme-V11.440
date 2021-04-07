package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.tn;

@AutoValue
/* renamed from: do  reason: invalid class name and default package */
abstract class Cdo {

    @AutoValue.Builder
    /* renamed from: do$a */
    public static abstract class a {
        public abstract Cdo a();

        /* access modifiers changed from: package-private */
        public abstract a b(vm vmVar);

        /* access modifiers changed from: package-private */
        public abstract a c(wm<?> wmVar);

        /* access modifiers changed from: package-private */
        public abstract a d(ym<?, byte[]> ymVar);

        public abstract a e(eo eoVar);

        public abstract a f(String str);
    }

    Cdo() {
    }

    public static a a() {
        return new tn.b();
    }

    public abstract vm b();

    /* access modifiers changed from: package-private */
    public abstract wm<?> c();

    public byte[] d() {
        return e().a(c().b());
    }

    /* access modifiers changed from: package-private */
    public abstract ym<?, byte[]> e();

    public abstract eo f();

    public abstract String g();
}
