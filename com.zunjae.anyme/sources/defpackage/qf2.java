package defpackage;

import org.jsoup.nodes.f;

/* renamed from: qf2  reason: default package */
public class qf2 {
    private wf2 a;
    private int b = 0;
    private of2 c;
    private pf2 d;

    public qf2(wf2 wf2) {
        this.a = wf2;
        this.d = wf2.b();
    }

    public static qf2 a() {
        return new qf2(new lf2());
    }

    public static f c(String str, String str2) {
        lf2 lf2 = new lf2();
        return lf2.d(str, str2, of2.d(), lf2.b());
    }

    public static qf2 e() {
        return new qf2(new xf2());
    }

    public boolean b() {
        return this.b > 0;
    }

    public f d(String str, String str2) {
        of2 g = b() ? of2.g(this.b) : of2.d();
        this.c = g;
        return this.a.d(str, str2, g, this.d);
    }
}
