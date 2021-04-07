package defpackage;

/* renamed from: t62  reason: default package */
public class t62 extends n62 implements s62, a82 {
    private final int l;
    private final int m;

    public t62(int i, Object obj) {
        this(i, obj, (Class) null, (String) null, (String) null, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t62(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.l = i;
        this.m = i2 >> 1;
    }

    /* access modifiers changed from: protected */
    public x72 d() {
        f72.a(this);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t62) {
            t62 t62 = (t62) obj;
            return v62.a(f(), t62.f()) && a().equals(t62.a()) && h().equals(t62.h()) && this.m == t62.m && this.l == t62.l && v62.a(e(), t62.e());
        } else if (obj instanceof a82) {
            return obj.equals(c());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((f() == null ? 0 : f().hashCode() * 31) + a().hashCode()) * 31) + h().hashCode();
    }

    public int i() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public a82 g() {
        return (a82) super.g();
    }

    public String toString() {
        x72 c = c();
        if (c != this) {
            return c.toString();
        }
        if ("<init>".equals(a())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + a() + " (Kotlin reflection is not available)";
    }
}
