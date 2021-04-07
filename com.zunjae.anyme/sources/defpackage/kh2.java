package defpackage;

/* renamed from: kh2  reason: default package */
public abstract class kh2 {
    private jh2 a;

    public kh2(jh2 jh2) {
        v62.f(jh2, "level");
        this.a = jh2;
    }

    public final void a(String str) {
        v62.f(str, "msg");
        e(jh2.DEBUG, str);
    }

    public final void b(String str) {
        v62.f(str, "msg");
        e(jh2.ERROR, str);
    }

    public final void c(String str) {
        v62.f(str, "msg");
        e(jh2.INFO, str);
    }

    public final boolean d(jh2 jh2) {
        v62.f(jh2, "lvl");
        return this.a.compareTo(jh2) <= 0;
    }

    public abstract void e(jh2 jh2, String str);
}
