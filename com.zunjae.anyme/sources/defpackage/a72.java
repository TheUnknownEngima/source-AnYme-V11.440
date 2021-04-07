package defpackage;

/* renamed from: a72  reason: default package */
public final class a72 implements o62 {
    private final Class<?> a;

    public a72(Class<?> cls, String str) {
        v62.e(cls, "jClass");
        v62.e(str, "moduleName");
        this.a = cls;
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a72) && v62.a(a(), ((a72) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
