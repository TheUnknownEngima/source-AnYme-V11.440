package defpackage;

import java.nio.charset.Charset;

/* renamed from: yf1  reason: default package */
final /* synthetic */ class yf1 implements ym {
    private static final yf1 a = new yf1();

    private yf1() {
    }

    public static ym b() {
        return a;
    }

    public Object a(Object obj) {
        return zf1.b.E((ge1) obj).getBytes(Charset.forName("UTF-8"));
    }
}
