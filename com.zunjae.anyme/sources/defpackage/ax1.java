package defpackage;

/* renamed from: ax1  reason: default package */
public final class ax1 {
    public static final a c = new a((r62) null);
    private String a;
    private final String b;

    /* renamed from: ax1$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(r62 r62) {
            this();
        }

        public final String a(String str) {
            v62.e(str, "selector");
            return "javascript: document.querySelector('" + str + "').click();";
        }

        public final String b(String str, String str2) {
            v62.e(str, "selector");
            v62.e(str2, "text");
            return "javascript: document.querySelector('" + str + "').value=\"" + str2 + "\";";
        }

        public final String c(String str) {
            v62.e(str, "selector");
            return "javascript: document.querySelector('" + str + "').style.display = \"none\";";
        }

        public final String d(String str) {
            v62.e(str, "selector");
            return "javascript: document.querySelector('" + str + "').scrollIntoView();";
        }
    }

    public ax1(String str) {
        v62.e(str, "javaScriptQuery");
        this.b = str;
    }

    public ax1(String str, String str2) {
        v62.e(str2, "javaScriptQuery");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return bx1.b(this.a);
    }
}
