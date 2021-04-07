package org.jsoup.nodes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.jsoup.nodes.f;

public class a implements Map.Entry<String, String>, Cloneable {
    private static final String[] g = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    private String e;
    private String f;

    public a(String str, String str2) {
        jf2.h(str);
        jf2.j(str2);
        this.e = str.trim();
        this.f = str2;
    }

    /* renamed from: b */
    public a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    public String getKey() {
        return this.e;
    }

    /* renamed from: d */
    public String getValue() {
        return this.f;
    }

    public String e() {
        StringBuilder sb = new StringBuilder();
        try {
            f(sb, new f("").I0());
            return sb.toString();
        } catch (IOException e2) {
            throw new ef2(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.e;
        if (str == null ? aVar.e != null : !str.equals(aVar.e)) {
            return false;
        }
        String str2 = this.f;
        String str3 = aVar.f;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void f(Appendable appendable, f.a aVar) {
        appendable.append(this.e);
        if (!o(aVar)) {
            appendable.append("=\"");
            i.e(appendable, this.f, aVar, true, false, false);
            appendable.append('\"');
        }
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return Arrays.binarySearch(g, this.e) >= 0;
    }

    public int hashCode() {
        String str = this.e;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public void j(String str) {
        jf2.h(str);
        this.e = str.trim();
    }

    /* renamed from: n */
    public String setValue(String str) {
        jf2.j(str);
        String str2 = this.f;
        this.f = str;
        return str2;
    }

    /* access modifiers changed from: protected */
    public final boolean o(f.a aVar) {
        return ("".equals(this.f) || this.f.equalsIgnoreCase(this.e)) && aVar.p() == f.a.C0255a.html && g();
    }

    public String toString() {
        return e();
    }
}
