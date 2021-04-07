package defpackage;

/* renamed from: im  reason: default package */
public class im {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public im() {
    }

    public im(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || im.class != obj.getClass()) {
            return false;
        }
        im imVar = (im) obj;
        return this.a.equals(imVar.a) && this.b.equals(imVar.b) && km.d(this.c, imVar.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
