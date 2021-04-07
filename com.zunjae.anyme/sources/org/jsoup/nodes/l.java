package org.jsoup.nodes;

import org.jsoup.nodes.f;

public class l extends k {
    String k;

    public l(String str, String str2) {
        this.h = str2;
        this.k = str;
    }

    private void X() {
        if (this.g == null) {
            b bVar = new b();
            this.g = bVar;
            bVar.u("text", this.k);
        }
    }

    static boolean b0(StringBuilder sb) {
        return sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (a0() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        v(r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (a0() == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B(java.lang.Appendable r7, int r8, org.jsoup.nodes.f.a r9) {
        /*
            r6 = this;
            boolean r0 = r9.o()
            if (r0 == 0) goto L_0x003d
            int r0 = r6.U()
            if (r0 != 0) goto L_0x0024
            org.jsoup.nodes.k r0 = r6.e
            boolean r1 = r0 instanceof org.jsoup.nodes.h
            if (r1 == 0) goto L_0x0024
            org.jsoup.nodes.h r0 = (org.jsoup.nodes.h) r0
            rf2 r0 = r0.C0()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0024
            boolean r0 = r6.a0()
            if (r0 == 0) goto L_0x003a
        L_0x0024:
            boolean r0 = r9.n()
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r6.V()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003d
            boolean r0 = r6.a0()
            if (r0 != 0) goto L_0x003d
        L_0x003a:
            r6.v(r7, r8, r9)
        L_0x003d:
            boolean r8 = r9.o()
            if (r8 == 0) goto L_0x0058
            org.jsoup.nodes.k r8 = r6.G()
            boolean r8 = r8 instanceof org.jsoup.nodes.h
            if (r8 == 0) goto L_0x0058
            org.jsoup.nodes.k r8 = r6.G()
            boolean r8 = org.jsoup.nodes.h.x0(r8)
            if (r8 != 0) goto L_0x0058
            r8 = 1
            r4 = 1
            goto L_0x005a
        L_0x0058:
            r8 = 0
            r4 = 0
        L_0x005a:
            java.lang.String r1 = r6.Z()
            r3 = 0
            r5 = 0
            r0 = r7
            r2 = r9
            org.jsoup.nodes.i.e(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.l.B(java.lang.Appendable, int, org.jsoup.nodes.f$a):void");
    }

    /* access modifiers changed from: package-private */
    public void C(Appendable appendable, int i, f.a aVar) {
    }

    public String Z() {
        b bVar = this.g;
        return bVar == null ? this.k : bVar.j("text");
    }

    public boolean a0() {
        return if2.d(Z());
    }

    public String b(String str) {
        X();
        return super.b(str);
    }

    public String d(String str) {
        X();
        return super.d(str);
    }

    public k e(String str, String str2) {
        X();
        super.e(str, str2);
        return this;
    }

    public b f() {
        X();
        return super.f();
    }

    public String toString() {
        return y();
    }

    public boolean u(String str) {
        X();
        return super.u(str);
    }

    public String x() {
        return "#text";
    }
}
