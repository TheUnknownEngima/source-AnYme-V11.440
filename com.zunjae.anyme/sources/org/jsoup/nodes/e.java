package org.jsoup.nodes;

import org.jsoup.nodes.f;

public class e extends k {
    public e(String str, String str2) {
        super(str2);
        this.g.u("data", str);
    }

    /* access modifiers changed from: package-private */
    public void B(Appendable appendable, int i, f.a aVar) {
        appendable.append(X());
    }

    /* access modifiers changed from: package-private */
    public void C(Appendable appendable, int i, f.a aVar) {
    }

    public String X() {
        return this.g.j("data");
    }

    public String toString() {
        return y();
    }

    public String x() {
        return "#data";
    }
}
