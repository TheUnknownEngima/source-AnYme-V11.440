package defpackage;

/* renamed from: xx1  reason: default package */
public final class xx1 {
    public static final xx1 a = new xx1();

    private xx1() {
    }

    public final boolean a() {
        String l = l02.l("KEY_KANONAPP_TOKEN", (String) null);
        return l != null && l.length() == 10;
    }

    public final boolean b() {
        return !a();
    }

    public final void c(String str) {
        v62.e(str, "kanonAppToken");
        l02.v("KEY_KANONAPP_TOKEN", str);
    }

    public final String d() {
        return l02.l("KEY_KANONAPP_TOKEN", (String) null);
    }
}
