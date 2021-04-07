package defpackage;

/* renamed from: g72  reason: default package */
public class g72 {
    public a82 a(t62 t62) {
        return t62;
    }

    public y72 b(Class cls) {
        return new p62(cls);
    }

    public z72 c(Class cls, String str) {
        return new a72(cls, str);
    }

    public b82 d(x62 x62) {
        return x62;
    }

    public c82 e(b72 b72) {
        return b72;
    }

    public String f(s62 s62) {
        String obj = s62.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(w62 w62) {
        return f(w62);
    }
}
