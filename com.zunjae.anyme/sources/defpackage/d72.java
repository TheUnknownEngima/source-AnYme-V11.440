package defpackage;

/* renamed from: d72  reason: default package */
public abstract class d72 extends n62 implements d82 {
    public d72() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d72(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d72) {
            d72 d72 = (d72) obj;
            return f().equals(d72.f()) && a().equals(d72.a()) && h().equals(d72.h()) && v62.a(e(), d72.e());
        } else if (obj instanceof d82) {
            return obj.equals(c());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((f().hashCode() * 31) + a().hashCode()) * 31) + h().hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public d82 g() {
        return (d82) super.g();
    }

    public String toString() {
        x72 c = c();
        if (c != this) {
            return c.toString();
        }
        return "property " + a() + " (Kotlin reflection is not available)";
    }
}
