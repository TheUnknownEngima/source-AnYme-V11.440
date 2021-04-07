package defpackage;

/* renamed from: db  reason: default package */
public class db {
    private cb a;
    private String b;
    private String c;

    public db(cb cbVar, String str, String str2) {
        b(cbVar, str, str2);
        this.a = cbVar;
        this.b = str;
        this.c = str2;
    }

    private void b(cb cbVar, String str, String str2) {
        ra.a(cbVar, "Application must be not null");
        ra.a(str, "Version name must be not null");
        ra.a(str2, "Version code must be not null");
    }

    public static db c(cb cbVar, String str, String str2) {
        return new db(cbVar, str, str2);
    }

    public cb a() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.b;
    }
}
