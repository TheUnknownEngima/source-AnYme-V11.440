package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: rf2  reason: default package */
public class rf2 {
    private static final Map<String, rf2> k = new HashMap();
    private static final String[] l;
    private static final String[] m = {"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi"};
    private static final String[] n = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
    private static final String[] o = {"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"};
    private static final String[] p = {"pre", "plaintext", "title", "textarea"};
    private static final String[] q = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    private static final String[] r = {"input", "keygen", "object", "select", "textarea"};
    private String a;
    private boolean b = true;
    private boolean c = true;
    private boolean d = true;
    private boolean e = true;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "s", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math"};
        l = strArr;
        for (String rf2 : strArr) {
            i(new rf2(rf2));
        }
        for (String rf22 : m) {
            rf2 rf23 = new rf2(rf22);
            rf23.b = false;
            rf23.d = false;
            rf23.c = false;
            i(rf23);
        }
        for (String str : n) {
            rf2 rf24 = k.get(str);
            jf2.j(rf24);
            rf24.d = false;
            rf24.e = false;
            rf24.f = true;
        }
        for (String str2 : o) {
            rf2 rf25 = k.get(str2);
            jf2.j(rf25);
            rf25.c = false;
        }
        for (String str3 : p) {
            rf2 rf26 = k.get(str3);
            jf2.j(rf26);
            rf26.h = true;
        }
        for (String str4 : q) {
            rf2 rf27 = k.get(str4);
            jf2.j(rf27);
            rf27.i = true;
        }
        for (String str5 : r) {
            rf2 rf28 = k.get(str5);
            jf2.j(rf28);
            rf28.j = true;
        }
    }

    private rf2(String str) {
        this.a = str;
    }

    private static void i(rf2 rf2) {
        k.put(rf2.a, rf2);
    }

    public static rf2 k(String str, pf2 pf2) {
        jf2.j(str);
        rf2 rf2 = k.get(str);
        if (rf2 != null) {
            return rf2;
        }
        String b2 = pf2.b(str);
        jf2.h(b2);
        rf2 rf22 = k.get(b2);
        if (rf22 != null) {
            return rf22;
        }
        rf2 rf23 = new rf2(b2);
        rf23.b = false;
        rf23.d = true;
        return rf23;
    }

    public boolean a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.f;
    }

    public boolean e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf2)) {
            return false;
        }
        rf2 rf2 = (rf2) obj;
        return this.a.equals(rf2.a) && this.d == rf2.d && this.e == rf2.e && this.f == rf2.f && this.c == rf2.c && this.b == rf2.b && this.h == rf2.h && this.g == rf2.g && this.i == rf2.i && this.j == rf2.j;
    }

    public boolean f() {
        return k.containsKey(this.a);
    }

    public boolean g() {
        return this.f || this.g;
    }

    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public rf2 j() {
        this.g = true;
        return this;
    }

    public String toString() {
        return this.a;
    }
}
