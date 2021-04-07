package defpackage;

/* renamed from: ye1  reason: default package */
public class ye1 {
    private int a;
    private String b;
    private sa2 c;

    ye1(int i, String str, sa2 sa2) {
        this.a = i;
        this.b = str;
        this.c = sa2;
    }

    static ye1 c(cb2 cb2) {
        return new ye1(cb2.h(), cb2.a() == null ? null : cb2.a().r(), cb2.m());
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public String d(String str) {
        return this.c.c(str);
    }
}
