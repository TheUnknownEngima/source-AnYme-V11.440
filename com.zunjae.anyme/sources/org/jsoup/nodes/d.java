package org.jsoup.nodes;

import org.jsoup.nodes.f;

public class d extends k {
    public d(String str, String str2) {
        super(str2);
        this.g.u("comment", str);
    }

    /* access modifiers changed from: package-private */
    public void B(Appendable appendable, int i, f.a aVar) {
        if (aVar.o()) {
            v(appendable, i, aVar);
        }
        appendable.append("<!--").append(X()).append("-->");
    }

    /* access modifiers changed from: package-private */
    public void C(Appendable appendable, int i, f.a aVar) {
    }

    public String X() {
        return this.g.j("comment");
    }

    public String toString() {
        return y();
    }

    public String x() {
        return "#comment";
    }
}
