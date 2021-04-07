package defpackage;

/* renamed from: mu0  reason: default package */
public final class mu0 {
    private final boolean a;

    public mu0(lu0 lu0) {
        tu0.c(lu0, "BuildInfo must be non-null");
        this.a = !lu0.zza();
    }

    public final boolean a(String str) {
        tu0.c(str, "flagName must not be null");
        if (!this.a) {
            return true;
        }
        return ou0.a.zza().a(str);
    }
}
