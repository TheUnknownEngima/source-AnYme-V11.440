package defpackage;

/* renamed from: kv1  reason: default package */
public final class kv1 {
    private final int a;
    private final String b;

    public kv1(int i, String str) {
        v62.e(str, "body");
        this.a = i;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean c() {
        int i = this.a;
        return 200 <= i && 299 >= i;
    }

    public final boolean d() {
        return !c();
    }
}
