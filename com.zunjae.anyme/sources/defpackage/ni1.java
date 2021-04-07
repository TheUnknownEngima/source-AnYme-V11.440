package defpackage;

import com.google.auto.value.AutoValue;
import javax.annotation.Nonnull;

@AutoValue
/* renamed from: ni1  reason: default package */
abstract class ni1 {
    ni1() {
    }

    static ni1 a(String str, String str2) {
        return new ii1(str, str2);
    }

    @Nonnull
    public abstract String b();

    @Nonnull
    public abstract String c();
}
