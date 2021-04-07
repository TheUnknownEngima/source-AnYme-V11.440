package org.jsoup.nodes;

import org.jsoup.nodes.f;

public class g extends k {
    public g(String str, String str2, String str3, String str4, String str5) {
        super(str5);
        e("name", str);
        if (str2 != null) {
            e("pubSysKey", str2);
        }
        e("publicId", str3);
        e("systemId", str4);
    }

    private boolean X(String str) {
        return !if2.d(d(str));
    }

    /* access modifiers changed from: package-private */
    public void B(Appendable appendable, int i, f.a aVar) {
        appendable.append((aVar.p() != f.a.C0255a.html || X("publicId") || X("systemId")) ? "<!DOCTYPE" : "<!doctype");
        if (X("name")) {
            appendable.append(" ").append(d("name"));
        }
        if (X("pubSysKey")) {
            appendable.append(" ").append(d("pubSysKey"));
        }
        if (X("publicId")) {
            appendable.append(" \"").append(d("publicId")).append('\"');
        }
        if (X("systemId")) {
            appendable.append(" \"").append(d("systemId")).append('\"');
        }
        appendable.append('>');
    }

    /* access modifiers changed from: package-private */
    public void C(Appendable appendable, int i, f.a aVar) {
    }

    public String x() {
        return "#doctype";
    }
}
