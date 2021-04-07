package org.jsoup.nodes;

import org.jsoup.nodes.f;

public class m extends k {
    private final String k;
    private final boolean l;

    public m(String str, String str2, boolean z) {
        super(str2);
        jf2.j(str);
        this.k = str;
        this.l = z;
    }

    /* access modifiers changed from: package-private */
    public void B(Appendable appendable, int i, f.a aVar) {
        String str = "!";
        appendable.append("<").append(this.l ? str : "?").append(this.k);
        this.g.t(appendable, aVar);
        if (!this.l) {
            str = "?";
        }
        appendable.append(str).append(">");
    }

    /* access modifiers changed from: package-private */
    public void C(Appendable appendable, int i, f.a aVar) {
    }

    public String X() {
        return this.k;
    }

    public String toString() {
        return y();
    }

    public String x() {
        return "#declaration";
    }
}
