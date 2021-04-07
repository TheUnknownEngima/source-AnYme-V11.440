package defpackage;

import defpackage.sf2;
import java.util.ArrayList;
import org.jsoup.nodes.f;

/* renamed from: mf2  reason: default package */
enum mf2 {
    Initial {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (mf2.isWhitespace(sf2)) {
                return true;
            }
            if (sf2.g()) {
                lf2.O(sf2.b());
            } else if (sf2.h()) {
                sf2.d c = sf2.c();
                lf2.w().a0(new org.jsoup.nodes.g(lf2.h.b(c.o()), c.p(), c.q(), c.r(), lf2.v()));
                if (c.s()) {
                    lf2.w().K0(f.b.quirks);
                }
                lf2.B0(mf2.BeforeHtml);
            } else {
                lf2.B0(mf2.BeforeHtml);
                return lf2.e(sf2);
            }
            return true;
        }
    },
    BeforeHtml {
        private boolean anythingElse(sf2 sf2, lf2 lf2) {
            lf2.V("html");
            lf2.B0(mf2.BeforeHead);
            return lf2.e(sf2);
        }

        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (sf2.h()) {
                lf2.p(this);
                return false;
            }
            if (sf2.g()) {
                lf2.O(sf2.b());
            } else if (mf2.isWhitespace(sf2)) {
                return true;
            } else {
                if (sf2.k() && sf2.e().C().equals("html")) {
                    lf2.L(sf2.e());
                    lf2.B0(mf2.BeforeHead);
                } else if (sf2.j() && if2.b(sf2.d().C(), "head", "body", "html", "br")) {
                    return anythingElse(sf2, lf2);
                } else {
                    if (!sf2.j()) {
                        return anythingElse(sf2, lf2);
                    }
                    lf2.p(this);
                    return false;
                }
            }
            return true;
        }
    },
    BeforeHead {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (mf2.isWhitespace(sf2)) {
                return true;
            }
            if (sf2.g()) {
                lf2.O(sf2.b());
            } else if (sf2.h()) {
                lf2.p(this);
                return false;
            } else if (sf2.k() && sf2.e().C().equals("html")) {
                return mf2.InBody.process(sf2, lf2);
            } else {
                if (sf2.k() && sf2.e().C().equals("head")) {
                    lf2.z0(lf2.L(sf2.e()));
                    lf2.B0(mf2.InHead);
                } else if (sf2.j() && if2.b(sf2.d().C(), "head", "body", "html", "br")) {
                    lf2.g("head");
                    return lf2.e(sf2);
                } else if (sf2.j()) {
                    lf2.p(this);
                    return false;
                } else {
                    lf2.g("head");
                    return lf2.e(sf2);
                }
            }
            return true;
        }
    },
    InHead {
        private boolean anythingElse(sf2 sf2, wf2 wf2) {
            wf2.f("head");
            return wf2.e(sf2);
        }

        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            mf2 mf2;
            if (mf2.isWhitespace(sf2)) {
                lf2.N(sf2.a());
                return true;
            }
            int i = p.a[sf2.a.ordinal()];
            if (i == 1) {
                lf2.O(sf2.b());
            } else if (i != 2) {
                if (i == 3) {
                    sf2.g e = sf2.e();
                    String C = e.C();
                    if (C.equals("html")) {
                        return mf2.InBody.process(sf2, lf2);
                    }
                    if (if2.b(C, "base", "basefont", "bgsound", "command", "link")) {
                        org.jsoup.nodes.h P = lf2.P(e);
                        if (C.equals("base") && P.u("href")) {
                            lf2.e0(P);
                        }
                    } else if (C.equals("meta")) {
                        lf2.P(e);
                    } else if (C.equals("title")) {
                        mf2.handleRcData(e, lf2);
                    } else if (if2.b(C, "noframes", "style")) {
                        mf2.handleRawtext(e, lf2);
                    } else if (C.equals("noscript")) {
                        lf2.L(e);
                        mf2 = mf2.InHeadNoscript;
                    } else if (C.equals("script")) {
                        lf2.b.v(vf2.ScriptData);
                        lf2.d0();
                        lf2.B0(mf2.Text);
                        lf2.L(e);
                    } else if (!C.equals("head")) {
                        return anythingElse(sf2, lf2);
                    } else {
                        lf2.p(this);
                        return false;
                    }
                } else if (i != 4) {
                    return anythingElse(sf2, lf2);
                } else {
                    String C2 = sf2.d().C();
                    if (C2.equals("head")) {
                        lf2.i0();
                        mf2 = mf2.AfterHead;
                    } else if (if2.b(C2, "body", "html", "br")) {
                        return anythingElse(sf2, lf2);
                    } else {
                        lf2.p(this);
                        return false;
                    }
                }
                lf2.B0(mf2);
            } else {
                lf2.p(this);
                return false;
            }
            return true;
        }
    },
    InHeadNoscript {
        private boolean anythingElse(sf2 sf2, lf2 lf2) {
            lf2.p(this);
            sf2.b bVar = new sf2.b();
            bVar.o(sf2.toString());
            lf2.N(bVar);
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (sf2.h()) {
                lf2.p(this);
                return true;
            } else if (sf2.k() && sf2.e().C().equals("html")) {
                return lf2.m0(sf2, mf2.InBody);
            } else {
                if (sf2.j() && sf2.d().C().equals("noscript")) {
                    lf2.i0();
                    lf2.B0(mf2.InHead);
                    return true;
                } else if (mf2.isWhitespace(sf2) || sf2.g() || (sf2.k() && if2.b(sf2.e().C(), "basefont", "bgsound", "link", "meta", "noframes", "style"))) {
                    return lf2.m0(sf2, mf2.InHead);
                } else {
                    if (sf2.j() && sf2.d().C().equals("br")) {
                        return anythingElse(sf2, lf2);
                    }
                    if ((!sf2.k() || !if2.b(sf2.e().C(), "head", "noscript")) && !sf2.j()) {
                        return anythingElse(sf2, lf2);
                    }
                    lf2.p(this);
                    return false;
                }
            }
        }
    },
    AfterHead {
        private boolean anythingElse(sf2 sf2, lf2 lf2) {
            lf2.g("body");
            lf2.q(true);
            return lf2.e(sf2);
        }

        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            mf2 mf2;
            sf2 sf22 = sf2;
            lf2 lf22 = lf2;
            if (mf2.isWhitespace(sf2)) {
                lf22.N(sf2.a());
                return true;
            } else if (sf2.g()) {
                lf22.O(sf2.b());
                return true;
            } else if (sf2.h()) {
                lf22.p(this);
                return true;
            } else {
                if (sf2.k()) {
                    sf2.g e = sf2.e();
                    String C = e.C();
                    if (C.equals("html")) {
                        return lf22.m0(sf22, mf2.InBody);
                    }
                    if (C.equals("body")) {
                        lf22.L(e);
                        lf22.q(false);
                        mf2 = mf2.InBody;
                    } else if (C.equals("frameset")) {
                        lf22.L(e);
                        mf2 = mf2.InFrameset;
                    } else if (if2.b(C, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title")) {
                        lf22.p(this);
                        org.jsoup.nodes.h z = lf2.z();
                        lf22.n0(z);
                        lf22.m0(sf22, mf2.InHead);
                        lf22.r0(z);
                        return true;
                    } else if (C.equals("head")) {
                        lf22.p(this);
                        return false;
                    }
                    lf22.B0(mf2);
                    return true;
                } else if (sf2.j() && !if2.b(sf2.d().C(), "body", "html")) {
                    lf22.p(this);
                    return false;
                }
                anythingElse(sf2, lf2);
                return true;
            }
        }
    },
    InBody {
        /* access modifiers changed from: package-private */
        public boolean anyOtherEndTag(sf2 sf2, lf2 lf2) {
            String C = sf2.d().C();
            ArrayList<org.jsoup.nodes.h> B = lf2.B();
            int size = B.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.jsoup.nodes.h hVar = B.get(size);
                if (hVar.x().equals(C)) {
                    lf2.t(C);
                    if (!C.equals(lf2.a().x())) {
                        lf2.p(this);
                    }
                    lf2.k0(C);
                } else if (lf2.b0(hVar)) {
                    lf2.p(this);
                    return false;
                } else {
                    size--;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ef, code lost:
            if (r18.a().x().equals(r5) == false) goto L_0x01bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0273, code lost:
            if (r18.a().x().equals(r5) == false) goto L_0x01bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x029a, code lost:
            if (r18.a().x().equals(r5) == false) goto L_0x01bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x0381, code lost:
            if (r2.C("p") != false) goto L_0x0383;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x03da, code lost:
            if (r2.C("p") != false) goto L_0x0383;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:301:0x0592, code lost:
            if (r2.C("p") != false) goto L_0x0383;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:335:0x064d, code lost:
            if (r2.P(r3).d("type").equalsIgnoreCase("hidden") == false) goto L_0x036e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x01bb, code lost:
            if (r18.a().x().equals(r5) == false) goto L_0x01bd;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(defpackage.sf2 r17, defpackage.lf2 r18) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                int[] r3 = defpackage.mf2.p.a
                sf2$i r4 = r1.a
                int r4 = r4.ordinal()
                r3 = r3[r4]
                r4 = 1
                if (r3 == r4) goto L_0x082e
                r5 = 2
                r6 = 0
                if (r3 == r5) goto L_0x082a
                java.lang.String r7 = "name"
                java.lang.String r8 = "html"
                java.lang.String r9 = "span"
                r10 = 3
                java.lang.String r11 = "form"
                java.lang.String r12 = "li"
                java.lang.String r13 = "body"
                java.lang.String r14 = "p"
                if (r3 == r10) goto L_0x032a
                r5 = 4
                if (r3 == r5) goto L_0x0062
                r5 = 5
                if (r3 == r5) goto L_0x0031
            L_0x002e:
                r1 = 1
                goto L_0x0837
            L_0x0031:
                sf2$b r1 = r17.a()
                java.lang.String r3 = r1.p()
                java.lang.String r5 = defpackage.mf2.nullString
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L_0x0047
                r2.p(r0)
                return r6
            L_0x0047:
                boolean r3 = r18.r()
                if (r3 == 0) goto L_0x005a
                boolean r3 = defpackage.mf2.isWhitespace((defpackage.sf2) r1)
                if (r3 == 0) goto L_0x005a
                r18.p0()
                r2.N(r1)
                goto L_0x002e
            L_0x005a:
                r18.p0()
                r2.N(r1)
                goto L_0x036e
            L_0x0062:
                sf2$f r3 = r17.d()
                java.lang.String r5 = r3.C()
                java.lang.String[] r15 = defpackage.mf2.y.p
                boolean r15 = defpackage.if2.c(r5, r15)
                r10 = 0
                if (r15 == 0) goto L_0x0198
                r3 = 0
            L_0x0076:
                r7 = 8
                if (r3 >= r7) goto L_0x002e
                org.jsoup.nodes.h r7 = r2.u(r5)
                if (r7 != 0) goto L_0x0085
                boolean r1 = r16.anyOtherEndTag(r17, r18)
                return r1
            L_0x0085:
                boolean r8 = r2.g0(r7)
                if (r8 != 0) goto L_0x0092
                r2.p(r0)
            L_0x008e:
                r2.q0(r7)
                return r4
            L_0x0092:
                java.lang.String r8 = r7.x()
                boolean r8 = r2.E(r8)
                if (r8 != 0) goto L_0x00a0
                r2.p(r0)
                return r6
            L_0x00a0:
                org.jsoup.nodes.h r8 = r18.a()
                if (r8 == r7) goto L_0x00a9
                r2.p(r0)
            L_0x00a9:
                java.util.ArrayList r8 = r18.B()
                int r9 = r8.size()
                r13 = r10
                r11 = 0
                r12 = 0
            L_0x00b4:
                if (r11 >= r9) goto L_0x00d9
                r14 = 64
                if (r11 >= r14) goto L_0x00d9
                java.lang.Object r14 = r8.get(r11)
                org.jsoup.nodes.h r14 = (org.jsoup.nodes.h) r14
                if (r14 != r7) goto L_0x00cd
                int r12 = r11 + -1
                java.lang.Object r12 = r8.get(r12)
                r13 = r12
                org.jsoup.nodes.h r13 = (org.jsoup.nodes.h) r13
                r12 = 1
                goto L_0x00d6
            L_0x00cd:
                if (r12 == 0) goto L_0x00d6
                boolean r15 = r2.b0(r14)
                if (r15 == 0) goto L_0x00d6
                goto L_0x00da
            L_0x00d6:
                int r11 = r11 + 1
                goto L_0x00b4
            L_0x00d9:
                r14 = r10
            L_0x00da:
                if (r14 != 0) goto L_0x00e4
                java.lang.String r1 = r7.x()
                r2.k0(r1)
                goto L_0x008e
            L_0x00e4:
                r9 = r14
                r11 = r9
                r8 = 0
            L_0x00e7:
                r12 = 3
                if (r8 >= r12) goto L_0x012c
                boolean r15 = r2.g0(r9)
                if (r15 == 0) goto L_0x00f4
                org.jsoup.nodes.h r9 = r2.j(r9)
            L_0x00f4:
                boolean r15 = r2.Z(r9)
                if (r15 != 0) goto L_0x00fe
                r2.r0(r9)
                goto L_0x0128
            L_0x00fe:
                if (r9 != r7) goto L_0x0101
                goto L_0x012c
            L_0x0101:
                org.jsoup.nodes.h r15 = new org.jsoup.nodes.h
                java.lang.String r12 = r9.x()
                pf2 r4 = defpackage.pf2.d
                rf2 r4 = defpackage.rf2.k(r12, r4)
                java.lang.String r12 = r18.v()
                r15.<init>(r4, r12)
                r2.t0(r9, r15)
                r2.v0(r9, r15)
                org.jsoup.nodes.h r4 = r11.G()
                if (r4 == 0) goto L_0x0123
                r11.K()
            L_0x0123:
                r15.a0(r11)
                r9 = r15
                r11 = r9
            L_0x0128:
                int r8 = r8 + 1
                r4 = 1
                goto L_0x00e7
            L_0x012c:
                java.lang.String r4 = r13.x()
                java.lang.String[] r8 = defpackage.mf2.y.q
                boolean r4 = defpackage.if2.c(r4, r8)
                if (r4 == 0) goto L_0x0147
                org.jsoup.nodes.h r4 = r11.G()
                if (r4 == 0) goto L_0x0143
                r11.K()
            L_0x0143:
                r2.R(r11)
                goto L_0x0153
            L_0x0147:
                org.jsoup.nodes.h r4 = r11.G()
                if (r4 == 0) goto L_0x0150
                r11.K()
            L_0x0150:
                r13.a0(r11)
            L_0x0153:
                org.jsoup.nodes.h r4 = new org.jsoup.nodes.h
                rf2 r8 = r7.C0()
                java.lang.String r9 = r18.v()
                r4.<init>(r8, r9)
                org.jsoup.nodes.b r8 = r4.f()
                org.jsoup.nodes.b r9 = r7.f()
                r8.c(r9)
                java.util.List r8 = r14.p()
                int r9 = r14.o()
                org.jsoup.nodes.k[] r9 = new org.jsoup.nodes.k[r9]
                java.lang.Object[] r8 = r8.toArray(r9)
                org.jsoup.nodes.k[] r8 = (org.jsoup.nodes.k[]) r8
                int r9 = r8.length
                r11 = 0
            L_0x017d:
                if (r11 >= r9) goto L_0x0187
                r12 = r8[r11]
                r4.a0(r12)
                int r11 = r11 + 1
                goto L_0x017d
            L_0x0187:
                r14.a0(r4)
                r2.q0(r7)
                r2.r0(r7)
                r2.U(r14, r4)
                int r3 = r3 + 1
                r4 = 1
                goto L_0x0076
            L_0x0198:
                java.lang.String[] r4 = defpackage.mf2.y.o
                boolean r4 = defpackage.if2.c(r5, r4)
                if (r4 == 0) goto L_0x01c5
                boolean r1 = r2.E(r5)
                if (r1 != 0) goto L_0x01ac
                r2.p(r0)
                return r6
            L_0x01ac:
                r18.s()
                org.jsoup.nodes.h r1 = r18.a()
                java.lang.String r1 = r1.x()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x01c0
            L_0x01bd:
                r2.p(r0)
            L_0x01c0:
                r2.k0(r5)
                goto L_0x002e
            L_0x01c5:
                boolean r4 = r5.equals(r9)
                if (r4 == 0) goto L_0x01d0
                boolean r1 = r16.anyOtherEndTag(r17, r18)
                return r1
            L_0x01d0:
                boolean r4 = r5.equals(r12)
                if (r4 == 0) goto L_0x01f2
                boolean r1 = r2.D(r5)
                if (r1 != 0) goto L_0x01e0
                r2.p(r0)
                return r6
            L_0x01e0:
                r2.t(r5)
                org.jsoup.nodes.h r1 = r18.a()
                java.lang.String r1 = r1.x()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x01c0
                goto L_0x01bd
            L_0x01f2:
                boolean r4 = r5.equals(r13)
                if (r4 == 0) goto L_0x0209
                boolean r1 = r2.E(r13)
                if (r1 != 0) goto L_0x0202
                r2.p(r0)
                return r6
            L_0x0202:
                mf2 r1 = defpackage.mf2.AfterBody
            L_0x0204:
                r2.B0(r1)
                goto L_0x002e
            L_0x0209:
                boolean r4 = r5.equals(r8)
                if (r4 == 0) goto L_0x021a
                boolean r1 = r2.f(r13)
                if (r1 == 0) goto L_0x002e
                boolean r1 = r2.e(r3)
                return r1
            L_0x021a:
                boolean r4 = r5.equals(r11)
                if (r4 == 0) goto L_0x024d
                org.jsoup.nodes.j r1 = r18.x()
                r2.x0(r10)
                if (r1 == 0) goto L_0x0249
                boolean r3 = r2.E(r5)
                if (r3 != 0) goto L_0x0230
                goto L_0x0249
            L_0x0230:
                r18.s()
                org.jsoup.nodes.h r3 = r18.a()
                java.lang.String r3 = r3.x()
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x0244
                r2.p(r0)
            L_0x0244:
                r2.r0(r1)
                goto L_0x002e
            L_0x0249:
                r2.p(r0)
                return r6
            L_0x024d:
                boolean r4 = r5.equals(r14)
                if (r4 == 0) goto L_0x0277
                boolean r1 = r2.C(r5)
                if (r1 != 0) goto L_0x0264
                r2.p(r0)
                r2.g(r5)
                boolean r1 = r2.e(r3)
                return r1
            L_0x0264:
                r2.t(r5)
                org.jsoup.nodes.h r1 = r18.a()
                java.lang.String r1 = r1.x()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x01c0
                goto L_0x01bd
            L_0x0277:
                java.lang.String[] r3 = defpackage.mf2.y.f
                boolean r3 = defpackage.if2.c(r5, r3)
                if (r3 == 0) goto L_0x029e
                boolean r1 = r2.E(r5)
                if (r1 != 0) goto L_0x028b
                r2.p(r0)
                return r6
            L_0x028b:
                r2.t(r5)
                org.jsoup.nodes.h r1 = r18.a()
                java.lang.String r1 = r1.x()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x01c0
                goto L_0x01bd
            L_0x029e:
                java.lang.String[] r3 = defpackage.mf2.y.c
                boolean r3 = defpackage.if2.c(r5, r3)
                if (r3 == 0) goto L_0x02d3
                java.lang.String[] r1 = defpackage.mf2.y.c
                boolean r1 = r2.G(r1)
                if (r1 != 0) goto L_0x02b6
                r2.p(r0)
                return r6
            L_0x02b6:
                r2.t(r5)
                org.jsoup.nodes.h r1 = r18.a()
                java.lang.String r1 = r1.x()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x02ca
                r2.p(r0)
            L_0x02ca:
                java.lang.String[] r1 = defpackage.mf2.y.c
                r2.l0(r1)
                goto L_0x002e
            L_0x02d3:
                java.lang.String r3 = "sarcasm"
                boolean r3 = r5.equals(r3)
                if (r3 == 0) goto L_0x02e0
                boolean r1 = r16.anyOtherEndTag(r17, r18)
                return r1
            L_0x02e0:
                java.lang.String[] r3 = defpackage.mf2.y.h
                boolean r3 = defpackage.if2.c(r5, r3)
                if (r3 == 0) goto L_0x0316
                boolean r1 = r2.E(r7)
                if (r1 != 0) goto L_0x002e
                boolean r1 = r2.E(r5)
                if (r1 != 0) goto L_0x02fa
                r2.p(r0)
                return r6
            L_0x02fa:
                r18.s()
                org.jsoup.nodes.h r1 = r18.a()
                java.lang.String r1 = r1.x()
                boolean r1 = r1.equals(r5)
                if (r1 != 0) goto L_0x030e
                r2.p(r0)
            L_0x030e:
                r2.k0(r5)
                r18.k()
                goto L_0x002e
            L_0x0316:
                java.lang.String r3 = "br"
                boolean r4 = r5.equals(r3)
                if (r4 == 0) goto L_0x0325
                r2.p(r0)
                r2.g(r3)
                return r6
            L_0x0325:
                boolean r1 = r16.anyOtherEndTag(r17, r18)
                return r1
            L_0x032a:
                sf2$g r3 = r17.e()
                java.lang.String r4 = r3.C()
                java.lang.String r10 = "a"
                boolean r15 = r4.equals(r10)
                if (r15 == 0) goto L_0x035e
                org.jsoup.nodes.h r1 = r2.u(r10)
                if (r1 == 0) goto L_0x0352
                r2.p(r0)
                r2.f(r10)
                org.jsoup.nodes.h r1 = r2.y(r10)
                if (r1 == 0) goto L_0x0352
                r2.q0(r1)
                r2.r0(r1)
            L_0x0352:
                r18.p0()
            L_0x0355:
                org.jsoup.nodes.h r1 = r2.L(r3)
                r2.o0(r1)
                goto L_0x002e
            L_0x035e:
                java.lang.String[] r10 = defpackage.mf2.y.i
                boolean r10 = defpackage.if2.c(r4, r10)
                if (r10 == 0) goto L_0x0373
                r18.p0()
            L_0x036b:
                r2.P(r3)
            L_0x036e:
                r2.q(r6)
                goto L_0x002e
            L_0x0373:
                java.lang.String[] r10 = defpackage.mf2.y.b
                boolean r10 = defpackage.if2.c(r4, r10)
                if (r10 == 0) goto L_0x0387
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x0390
            L_0x0383:
                r2.f(r14)
                goto L_0x0390
            L_0x0387:
                boolean r9 = r4.equals(r9)
                if (r9 == 0) goto L_0x0395
            L_0x038d:
                r18.p0()
            L_0x0390:
                r2.L(r3)
                goto L_0x002e
            L_0x0395:
                boolean r9 = r4.equals(r12)
                if (r9 == 0) goto L_0x03dd
                r2.q(r6)
                java.util.ArrayList r1 = r18.B()
                int r4 = r1.size()
                r5 = 1
                int r4 = r4 - r5
            L_0x03a8:
                if (r4 <= 0) goto L_0x03d6
                java.lang.Object r5 = r1.get(r4)
                org.jsoup.nodes.h r5 = (org.jsoup.nodes.h) r5
                java.lang.String r6 = r5.x()
                boolean r6 = r6.equals(r12)
                if (r6 == 0) goto L_0x03be
                r2.f(r12)
                goto L_0x03d6
            L_0x03be:
                boolean r6 = r2.b0(r5)
                if (r6 == 0) goto L_0x03d3
                java.lang.String r5 = r5.x()
                java.lang.String[] r6 = defpackage.mf2.y.e
                boolean r5 = defpackage.if2.c(r5, r6)
                if (r5 != 0) goto L_0x03d3
                goto L_0x03d6
            L_0x03d3:
                int r4 = r4 + -1
                goto L_0x03a8
            L_0x03d6:
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x0390
                goto L_0x0383
            L_0x03dd:
                boolean r8 = r4.equals(r8)
                if (r8 == 0) goto L_0x0416
                r2.p(r0)
                java.util.ArrayList r1 = r18.B()
                java.lang.Object r1 = r1.get(r6)
                org.jsoup.nodes.h r1 = (org.jsoup.nodes.h) r1
                org.jsoup.nodes.b r2 = r3.x()
                java.util.Iterator r2 = r2.iterator()
            L_0x03f8:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x002e
                java.lang.Object r3 = r2.next()
                org.jsoup.nodes.a r3 = (org.jsoup.nodes.a) r3
                java.lang.String r4 = r3.getKey()
                boolean r4 = r1.u(r4)
                if (r4 != 0) goto L_0x03f8
                org.jsoup.nodes.b r4 = r1.f()
                r4.y(r3)
                goto L_0x03f8
            L_0x0416:
                java.lang.String[] r8 = defpackage.mf2.y.a
                boolean r8 = defpackage.if2.c(r4, r8)
                if (r8 == 0) goto L_0x0427
                mf2 r3 = defpackage.mf2.InHead
                boolean r1 = r2.m0(r1, r3)
                return r1
            L_0x0427:
                boolean r1 = r4.equals(r13)
                if (r1 == 0) goto L_0x0482
                r2.p(r0)
                java.util.ArrayList r1 = r18.B()
                int r4 = r1.size()
                r7 = 1
                if (r4 == r7) goto L_0x0481
                int r4 = r1.size()
                if (r4 <= r5) goto L_0x0452
                java.lang.Object r4 = r1.get(r7)
                org.jsoup.nodes.h r4 = (org.jsoup.nodes.h) r4
                java.lang.String r4 = r4.x()
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x0452
                goto L_0x0481
            L_0x0452:
                r2.q(r6)
                java.lang.Object r1 = r1.get(r7)
                org.jsoup.nodes.h r1 = (org.jsoup.nodes.h) r1
                org.jsoup.nodes.b r2 = r3.x()
                java.util.Iterator r2 = r2.iterator()
            L_0x0463:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x002e
                java.lang.Object r3 = r2.next()
                org.jsoup.nodes.a r3 = (org.jsoup.nodes.a) r3
                java.lang.String r4 = r3.getKey()
                boolean r4 = r1.u(r4)
                if (r4 != 0) goto L_0x0463
                org.jsoup.nodes.b r4 = r1.f()
                r4.y(r3)
                goto L_0x0463
            L_0x0481:
                return r6
            L_0x0482:
                java.lang.String r1 = "frameset"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x04dd
                r2.p(r0)
                java.util.ArrayList r1 = r18.B()
                int r4 = r1.size()
                r7 = 1
                if (r4 == r7) goto L_0x04dc
                int r4 = r1.size()
                if (r4 <= r5) goto L_0x04af
                java.lang.Object r4 = r1.get(r7)
                org.jsoup.nodes.h r4 = (org.jsoup.nodes.h) r4
                java.lang.String r4 = r4.x()
                boolean r4 = r4.equals(r13)
                if (r4 != 0) goto L_0x04af
                goto L_0x04dc
            L_0x04af:
                boolean r4 = r18.r()
                if (r4 != 0) goto L_0x04b6
                return r6
            L_0x04b6:
                java.lang.Object r4 = r1.get(r7)
                org.jsoup.nodes.h r4 = (org.jsoup.nodes.h) r4
                org.jsoup.nodes.h r5 = r4.G()
                if (r5 == 0) goto L_0x04c5
                r4.K()
            L_0x04c5:
                int r4 = r1.size()
                if (r4 <= r7) goto L_0x04d5
                int r4 = r1.size()
                int r4 = r4 - r7
                r1.remove(r4)
                r7 = 1
                goto L_0x04c5
            L_0x04d5:
                r2.L(r3)
                mf2 r1 = defpackage.mf2.InFrameset
                goto L_0x0204
            L_0x04dc:
                return r6
            L_0x04dd:
                java.lang.String[] r1 = defpackage.mf2.y.c
                boolean r1 = defpackage.if2.c(r4, r1)
                if (r1 == 0) goto L_0x050a
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x04f0
                r2.f(r14)
            L_0x04f0:
                org.jsoup.nodes.h r1 = r18.a()
                java.lang.String r1 = r1.x()
                java.lang.String[] r4 = defpackage.mf2.y.c
                boolean r1 = defpackage.if2.c(r1, r4)
                if (r1 == 0) goto L_0x0390
                r2.p(r0)
                r18.i0()
                goto L_0x0390
            L_0x050a:
                java.lang.String[] r1 = defpackage.mf2.y.d
                boolean r1 = defpackage.if2.c(r4, r1)
                if (r1 == 0) goto L_0x0522
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x051d
                r2.f(r14)
            L_0x051d:
                r2.L(r3)
                goto L_0x036e
            L_0x0522:
                boolean r1 = r4.equals(r11)
                if (r1 == 0) goto L_0x0541
                org.jsoup.nodes.j r1 = r18.x()
                if (r1 == 0) goto L_0x0532
                r2.p(r0)
                return r6
            L_0x0532:
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x053b
                r2.f(r14)
            L_0x053b:
                r1 = 1
                r2.Q(r3, r1)
                goto L_0x0837
            L_0x0541:
                r1 = 1
                java.lang.String[] r5 = defpackage.mf2.y.f
                boolean r5 = defpackage.if2.c(r4, r5)
                if (r5 == 0) goto L_0x0596
                r2.q(r6)
                java.util.ArrayList r4 = r18.B()
                int r5 = r4.size()
                int r5 = r5 - r1
            L_0x0558:
                if (r5 <= 0) goto L_0x058e
                java.lang.Object r1 = r4.get(r5)
                org.jsoup.nodes.h r1 = (org.jsoup.nodes.h) r1
                java.lang.String r6 = r1.x()
                java.lang.String[] r7 = defpackage.mf2.y.f
                boolean r6 = defpackage.if2.c(r6, r7)
                if (r6 == 0) goto L_0x0576
                java.lang.String r1 = r1.x()
                r2.f(r1)
                goto L_0x058e
            L_0x0576:
                boolean r6 = r2.b0(r1)
                if (r6 == 0) goto L_0x058b
                java.lang.String r1 = r1.x()
                java.lang.String[] r6 = defpackage.mf2.y.e
                boolean r1 = defpackage.if2.c(r1, r6)
                if (r1 != 0) goto L_0x058b
                goto L_0x058e
            L_0x058b:
                int r5 = r5 + -1
                goto L_0x0558
            L_0x058e:
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x0390
                goto L_0x0383
            L_0x0596:
                java.lang.String r1 = "plaintext"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x05b3
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x05a7
                r2.f(r14)
            L_0x05a7:
                r2.L(r3)
                uf2 r1 = r2.b
                vf2 r2 = defpackage.vf2.PLAINTEXT
                r1.v(r2)
                goto L_0x002e
            L_0x05b3:
                java.lang.String r1 = "button"
                boolean r5 = r4.equals(r1)
                if (r5 == 0) goto L_0x05d1
                boolean r4 = r2.C(r1)
                if (r4 == 0) goto L_0x05cc
                r2.p(r0)
                r2.f(r1)
                r2.e(r3)
                goto L_0x002e
            L_0x05cc:
                r18.p0()
                goto L_0x051d
            L_0x05d1:
                java.lang.String[] r1 = defpackage.mf2.y.g
                boolean r1 = defpackage.if2.c(r4, r1)
                if (r1 == 0) goto L_0x05dd
                goto L_0x0352
            L_0x05dd:
                java.lang.String r1 = "nobr"
                boolean r5 = r4.equals(r1)
                if (r5 == 0) goto L_0x05f6
                r18.p0()
                boolean r4 = r2.E(r1)
                if (r4 == 0) goto L_0x0355
                r2.p(r0)
                r2.f(r1)
                goto L_0x0352
            L_0x05f6:
                java.lang.String[] r1 = defpackage.mf2.y.h
                boolean r1 = defpackage.if2.c(r4, r1)
                if (r1 == 0) goto L_0x060b
                r18.p0()
                r2.L(r3)
                r18.S()
                goto L_0x036e
            L_0x060b:
                java.lang.String r1 = "table"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0632
                org.jsoup.nodes.f r1 = r18.w()
                org.jsoup.nodes.f$b r1 = r1.J0()
                org.jsoup.nodes.f$b r4 = org.jsoup.nodes.f.b.quirks
                if (r1 == r4) goto L_0x0628
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x0628
                r2.f(r14)
            L_0x0628:
                r2.L(r3)
                r2.q(r6)
                mf2 r1 = defpackage.mf2.InTable
                goto L_0x0204
            L_0x0632:
                java.lang.String r1 = "input"
                boolean r5 = r4.equals(r1)
                if (r5 == 0) goto L_0x0651
                r18.p0()
                org.jsoup.nodes.h r1 = r2.P(r3)
                java.lang.String r3 = "type"
                java.lang.String r1 = r1.d(r3)
                java.lang.String r3 = "hidden"
                boolean r1 = r1.equalsIgnoreCase(r3)
                if (r1 != 0) goto L_0x002e
                goto L_0x036e
            L_0x0651:
                java.lang.String[] r5 = defpackage.mf2.y.j
                boolean r5 = defpackage.if2.c(r4, r5)
                if (r5 == 0) goto L_0x0660
                r2.P(r3)
                goto L_0x002e
            L_0x0660:
                java.lang.String r5 = "hr"
                boolean r8 = r4.equals(r5)
                if (r8 == 0) goto L_0x0673
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x036b
                r2.f(r14)
                goto L_0x036b
            L_0x0673:
                java.lang.String r8 = "image"
                boolean r8 = r4.equals(r8)
                if (r8 == 0) goto L_0x068d
                java.lang.String r1 = "svg"
                org.jsoup.nodes.h r1 = r2.y(r1)
                if (r1 != 0) goto L_0x0390
                java.lang.String r1 = "img"
                r3.A(r1)
                boolean r1 = r2.e(r3)
                return r1
            L_0x068d:
                java.lang.String r8 = "isindex"
                boolean r9 = r4.equals(r8)
                if (r9 == 0) goto L_0x0722
                r2.p(r0)
                org.jsoup.nodes.j r4 = r18.x()
                if (r4 == 0) goto L_0x069f
                return r6
            L_0x069f:
                uf2 r4 = r2.b
                r4.a()
                r2.g(r11)
                org.jsoup.nodes.b r4 = r3.j
                java.lang.String r6 = "action"
                boolean r4 = r4.o(r6)
                if (r4 == 0) goto L_0x06be
                org.jsoup.nodes.j r4 = r18.x()
                org.jsoup.nodes.b r9 = r3.j
                java.lang.String r9 = r9.j(r6)
                r4.e0(r6, r9)
            L_0x06be:
                r2.g(r5)
                java.lang.String r4 = "label"
                r2.g(r4)
                org.jsoup.nodes.b r4 = r3.j
                java.lang.String r6 = "prompt"
                boolean r4 = r4.o(r6)
                if (r4 == 0) goto L_0x06d9
                org.jsoup.nodes.b r4 = r3.j
                java.lang.String r6 = "prompt"
                java.lang.String r4 = r4.j(r6)
                goto L_0x06db
            L_0x06d9:
                java.lang.String r4 = "This is a searchable index. Enter search keywords: "
            L_0x06db:
                sf2$b r6 = new sf2$b
                r6.<init>()
                r6.o(r4)
                r2.e(r6)
                org.jsoup.nodes.b r4 = new org.jsoup.nodes.b
                r4.<init>()
                org.jsoup.nodes.b r3 = r3.j
                java.util.Iterator r3 = r3.iterator()
            L_0x06f1:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L_0x070f
                java.lang.Object r6 = r3.next()
                org.jsoup.nodes.a r6 = (org.jsoup.nodes.a) r6
                java.lang.String r9 = r6.getKey()
                java.lang.String[] r10 = defpackage.mf2.y.k
                boolean r9 = defpackage.if2.c(r9, r10)
                if (r9 != 0) goto L_0x06f1
                r4.y(r6)
                goto L_0x06f1
            L_0x070f:
                r4.u(r7, r8)
                r2.h(r1, r4)
                java.lang.String r1 = "label"
                r2.f(r1)
                r2.g(r5)
                r2.f(r11)
                goto L_0x002e
            L_0x0722:
                java.lang.String r1 = "textarea"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x073e
                r2.L(r3)
                uf2 r1 = r2.b
                vf2 r3 = defpackage.vf2.Rcdata
                r1.v(r3)
                r18.d0()
                r2.q(r6)
                mf2 r1 = defpackage.mf2.Text
                goto L_0x0204
            L_0x073e:
                java.lang.String r1 = "xmp"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0753
                boolean r1 = r2.C(r14)
                if (r1 == 0) goto L_0x074f
                r2.f(r14)
            L_0x074f:
                r18.p0()
                goto L_0x075b
            L_0x0753:
                java.lang.String r1 = "iframe"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0763
            L_0x075b:
                r2.q(r6)
            L_0x075e:
                defpackage.mf2.handleRawtext(r3, r2)
                goto L_0x002e
            L_0x0763:
                java.lang.String r1 = "noembed"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x076c
                goto L_0x075e
            L_0x076c:
                java.lang.String r1 = "select"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x07b2
                r18.p0()
                r2.L(r3)
                r2.q(r6)
                mf2 r1 = r18.A0()
                mf2 r3 = defpackage.mf2.InTable
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x07ae
                mf2 r3 = defpackage.mf2.InCaption
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x07ae
                mf2 r3 = defpackage.mf2.InTableBody
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x07ae
                mf2 r3 = defpackage.mf2.InRow
                boolean r3 = r1.equals(r3)
                if (r3 != 0) goto L_0x07ae
                mf2 r3 = defpackage.mf2.InCell
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L_0x07aa
                goto L_0x07ae
            L_0x07aa:
                mf2 r1 = defpackage.mf2.InSelect
                goto L_0x0204
            L_0x07ae:
                mf2 r1 = defpackage.mf2.InSelectInTable
                goto L_0x0204
            L_0x07b2:
                java.lang.String[] r1 = defpackage.mf2.y.l
                boolean r1 = defpackage.if2.c(r4, r1)
                if (r1 == 0) goto L_0x07d3
                org.jsoup.nodes.h r1 = r18.a()
                java.lang.String r1 = r1.x()
                java.lang.String r4 = "option"
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x038d
                java.lang.String r1 = "option"
                r2.f(r1)
                goto L_0x038d
            L_0x07d3:
                java.lang.String[] r1 = defpackage.mf2.y.m
                boolean r1 = defpackage.if2.c(r4, r1)
                if (r1 == 0) goto L_0x07fe
                java.lang.String r1 = "ruby"
                boolean r4 = r2.E(r1)
                if (r4 == 0) goto L_0x002e
                r18.s()
                org.jsoup.nodes.h r4 = r18.a()
                java.lang.String r4 = r4.x()
                boolean r4 = r4.equals(r1)
                if (r4 != 0) goto L_0x0390
                r2.p(r0)
                r2.j0(r1)
                goto L_0x0390
            L_0x07fe:
                java.lang.String r1 = "math"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x0813
            L_0x0806:
                r18.p0()
                r2.L(r3)
                uf2 r1 = r2.b
                r1.a()
                goto L_0x002e
            L_0x0813:
                java.lang.String r1 = "svg"
                boolean r1 = r4.equals(r1)
                if (r1 == 0) goto L_0x081c
                goto L_0x0806
            L_0x081c:
                java.lang.String[] r1 = defpackage.mf2.y.n
                boolean r1 = defpackage.if2.c(r4, r1)
                if (r1 == 0) goto L_0x038d
                r2.p(r0)
                return r6
            L_0x082a:
                r2.p(r0)
                return r6
            L_0x082e:
                sf2$c r1 = r17.b()
                r2.O(r1)
                goto L_0x002e
            L_0x0837:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mf2.v.process(sf2, lf2):boolean");
        }
    },
    Text {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (sf2.f()) {
                lf2.N(sf2.a());
                return true;
            } else if (sf2.i()) {
                lf2.p(this);
                lf2.i0();
                lf2.B0(lf2.h0());
                return lf2.e(sf2);
            } else if (!sf2.j()) {
                return true;
            } else {
                lf2.i0();
                lf2.B0(lf2.h0());
                return true;
            }
        }
    },
    InTable {
        /* access modifiers changed from: package-private */
        public boolean anythingElse(sf2 sf2, lf2 lf2) {
            lf2.p(this);
            if (!if2.b(lf2.a().x(), "table", "tbody", "tfoot", "thead", "tr")) {
                return lf2.m0(sf2, mf2.InBody);
            }
            lf2.y0(true);
            boolean m0 = lf2.m0(sf2, mf2.InBody);
            lf2.y0(false);
            return m0;
        }

        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            mf2 mf2;
            sf2 sf22 = sf2;
            lf2 lf22 = lf2;
            if (sf2.f()) {
                lf2.f0();
                lf2.d0();
                lf22.B0(mf2.InTableText);
                return lf22.e(sf22);
            } else if (sf2.g()) {
                lf22.O(sf2.b());
                return true;
            } else if (sf2.h()) {
                lf22.p(this);
                return false;
            } else if (sf2.k()) {
                sf2.g e = sf2.e();
                String C = e.C();
                if (C.equals("caption")) {
                    lf2.n();
                    lf2.S();
                    lf22.L(e);
                    mf2 = mf2.InCaption;
                } else if (C.equals("colgroup")) {
                    lf2.n();
                    lf22.L(e);
                    mf2 = mf2.InColumnGroup;
                } else if (C.equals("col")) {
                    lf22.g("colgroup");
                    return lf22.e(sf22);
                } else if (if2.b(C, "tbody", "tfoot", "thead")) {
                    lf2.n();
                    lf22.L(e);
                    mf2 = mf2.InTableBody;
                } else if (if2.b(C, "td", "th", "tr")) {
                    lf22.g("tbody");
                    return lf22.e(sf22);
                } else {
                    if (C.equals("table")) {
                        lf22.p(this);
                        if (lf22.f("table")) {
                            return lf22.e(sf22);
                        }
                    } else if (if2.b(C, "style", "script")) {
                        return lf22.m0(sf22, mf2.InHead);
                    } else {
                        if (C.equals("input")) {
                            if (!e.j.j("type").equalsIgnoreCase("hidden")) {
                                return anythingElse(sf2, lf2);
                            }
                            lf22.P(e);
                        } else if (!C.equals("form")) {
                            return anythingElse(sf2, lf2);
                        } else {
                            lf22.p(this);
                            if (lf2.x() != null) {
                                return false;
                            }
                            lf22.Q(e, false);
                        }
                    }
                    return true;
                }
                lf22.B0(mf2);
                return true;
            } else if (sf2.j()) {
                String C2 = sf2.d().C();
                if (C2.equals("table")) {
                    if (!lf22.K(C2)) {
                        lf22.p(this);
                        return false;
                    }
                    lf22.k0("table");
                    lf2.w0();
                    return true;
                } else if (!if2.b(C2, "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                    return anythingElse(sf2, lf2);
                } else {
                    lf22.p(this);
                    return false;
                }
            } else if (!sf2.i()) {
                return anythingElse(sf2, lf2);
            } else {
                if (lf2.a().x().equals("html")) {
                    lf22.p(this);
                }
                return true;
            }
        }
    },
    InTableText {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (p.a[sf2.a.ordinal()] != 5) {
                if (lf2.A().size() > 0) {
                    for (String next : lf2.A()) {
                        if (!mf2.isWhitespace(next)) {
                            lf2.p(this);
                            if (if2.b(lf2.a().x(), "table", "tbody", "tfoot", "thead", "tr")) {
                                lf2.y0(true);
                                sf2.b bVar = new sf2.b();
                                bVar.o(next);
                                lf2.m0(bVar, mf2.InBody);
                                lf2.y0(false);
                            } else {
                                sf2.b bVar2 = new sf2.b();
                                bVar2.o(next);
                                lf2.m0(bVar2, mf2.InBody);
                            }
                        } else {
                            sf2.b bVar3 = new sf2.b();
                            bVar3.o(next);
                            lf2.N(bVar3);
                        }
                    }
                    lf2.f0();
                }
                lf2.B0(lf2.h0());
                return lf2.e(sf2);
            }
            sf2.b a = sf2.a();
            if (a.p().equals(mf2.nullString)) {
                lf2.p(this);
                return false;
            }
            lf2.A().add(a.p());
            return true;
        }
    },
    InCaption {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (!sf2.j() || !sf2.d().C().equals("caption")) {
                if ((sf2.k() && if2.b(sf2.e().C(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) || (sf2.j() && sf2.d().C().equals("table"))) {
                    lf2.p(this);
                    if (lf2.f("caption")) {
                        return lf2.e(sf2);
                    }
                    return true;
                } else if (!sf2.j() || !if2.b(sf2.d().C(), "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                    return lf2.m0(sf2, mf2.InBody);
                } else {
                    lf2.p(this);
                    return false;
                }
            } else if (!lf2.K(sf2.d().C())) {
                lf2.p(this);
                return false;
            } else {
                lf2.s();
                if (!lf2.a().x().equals("caption")) {
                    lf2.p(this);
                }
                lf2.k0("caption");
                lf2.k();
                lf2.B0(mf2.InTable);
                return true;
            }
        }
    },
    InColumnGroup {
        private boolean anythingElse(sf2 sf2, wf2 wf2) {
            if (wf2.f("colgroup")) {
                return wf2.e(sf2);
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (mf2.isWhitespace(sf2)) {
                lf2.N(sf2.a());
                return true;
            }
            int i = p.a[sf2.a.ordinal()];
            if (i == 1) {
                lf2.O(sf2.b());
            } else if (i == 2) {
                lf2.p(this);
            } else if (i == 3) {
                sf2.g e = sf2.e();
                String C = e.C();
                if (C.equals("html")) {
                    return lf2.m0(sf2, mf2.InBody);
                }
                if (!C.equals("col")) {
                    return anythingElse(sf2, lf2);
                }
                lf2.P(e);
            } else if (i != 4) {
                if (i != 6) {
                    return anythingElse(sf2, lf2);
                }
                if (lf2.a().x().equals("html")) {
                    return true;
                }
                return anythingElse(sf2, lf2);
            } else if (!sf2.d().C().equals("colgroup")) {
                return anythingElse(sf2, lf2);
            } else {
                if (lf2.a().x().equals("html")) {
                    lf2.p(this);
                    return false;
                }
                lf2.i0();
                lf2.B0(mf2.InTable);
            }
            return true;
        }
    },
    InTableBody {
        private boolean anythingElse(sf2 sf2, lf2 lf2) {
            return lf2.m0(sf2, mf2.InTable);
        }

        private boolean exitTableBody(sf2 sf2, lf2 lf2) {
            if (lf2.K("tbody") || lf2.K("thead") || lf2.E("tfoot")) {
                lf2.m();
                lf2.f(lf2.a().x());
                return lf2.e(sf2);
            }
            lf2.p(this);
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            mf2 mf2;
            int i = p.a[sf2.a.ordinal()];
            if (i == 3) {
                sf2.g e = sf2.e();
                String C = e.C();
                if (C.equals("tr")) {
                    lf2.m();
                    lf2.L(e);
                    mf2 = mf2.InRow;
                } else if (!if2.b(C, "th", "td")) {
                    return if2.b(C, "caption", "col", "colgroup", "tbody", "tfoot", "thead") ? exitTableBody(sf2, lf2) : anythingElse(sf2, lf2);
                } else {
                    lf2.p(this);
                    lf2.g("tr");
                    return lf2.e(e);
                }
            } else if (i != 4) {
                return anythingElse(sf2, lf2);
            } else {
                String C2 = sf2.d().C();
                if (if2.b(C2, "tbody", "tfoot", "thead")) {
                    if (!lf2.K(C2)) {
                        lf2.p(this);
                        return false;
                    }
                    lf2.m();
                    lf2.i0();
                    mf2 = mf2.InTable;
                } else if (C2.equals("table")) {
                    return exitTableBody(sf2, lf2);
                } else {
                    if (!if2.b(C2, "body", "caption", "col", "colgroup", "html", "td", "th", "tr")) {
                        return anythingElse(sf2, lf2);
                    }
                    lf2.p(this);
                    return false;
                }
            }
            lf2.B0(mf2);
            return true;
        }
    },
    InRow {
        private boolean anythingElse(sf2 sf2, lf2 lf2) {
            return lf2.m0(sf2, mf2.InTable);
        }

        private boolean handleMissingTr(sf2 sf2, wf2 wf2) {
            if (wf2.f("tr")) {
                return wf2.e(sf2);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (sf2.k()) {
                sf2.g e = sf2.e();
                String C = e.C();
                if (!if2.b(C, "th", "td")) {
                    return if2.b(C, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr") ? handleMissingTr(sf2, lf2) : anythingElse(sf2, lf2);
                }
                lf2.o();
                lf2.L(e);
                lf2.B0(mf2.InCell);
                lf2.S();
                return true;
            } else if (!sf2.j()) {
                return anythingElse(sf2, lf2);
            } else {
                String C2 = sf2.d().C();
                if (C2.equals("tr")) {
                    if (!lf2.K(C2)) {
                        lf2.p(this);
                        return false;
                    }
                    lf2.o();
                    lf2.i0();
                    lf2.B0(mf2.InTableBody);
                    return true;
                } else if (C2.equals("table")) {
                    return handleMissingTr(sf2, lf2);
                } else {
                    if (if2.b(C2, "tbody", "tfoot", "thead")) {
                        if (!lf2.K(C2)) {
                            lf2.p(this);
                            return false;
                        }
                        lf2.f("tr");
                        return lf2.e(sf2);
                    } else if (!if2.b(C2, "body", "caption", "col", "colgroup", "html", "td", "th")) {
                        return anythingElse(sf2, lf2);
                    } else {
                        lf2.p(this);
                        return false;
                    }
                }
            }
        }
    },
    InCell {
        private boolean anythingElse(sf2 sf2, lf2 lf2) {
            return lf2.m0(sf2, mf2.InBody);
        }

        private void closeCell(lf2 lf2) {
            String str = "td";
            if (!lf2.K(str)) {
                str = "th";
            }
            lf2.f(str);
        }

        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (sf2.j()) {
                String C = sf2.d().C();
                if (if2.b(C, "td", "th")) {
                    if (!lf2.K(C)) {
                        lf2.p(this);
                        lf2.B0(mf2.InRow);
                        return false;
                    }
                    lf2.s();
                    if (!lf2.a().x().equals(C)) {
                        lf2.p(this);
                    }
                    lf2.k0(C);
                    lf2.k();
                    lf2.B0(mf2.InRow);
                    return true;
                } else if (if2.b(C, "body", "caption", "col", "colgroup", "html")) {
                    lf2.p(this);
                    return false;
                } else if (!if2.b(C, "table", "tbody", "tfoot", "thead", "tr")) {
                    return anythingElse(sf2, lf2);
                } else {
                    if (!lf2.K(C)) {
                        lf2.p(this);
                        return false;
                    }
                }
            } else if (!sf2.k() || !if2.b(sf2.e().C(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                return anythingElse(sf2, lf2);
            } else {
                if (!lf2.K("td") && !lf2.K("th")) {
                    lf2.p(this);
                    return false;
                }
            }
            closeCell(lf2);
            return lf2.e(sf2);
        }
    },
    InSelect {
        private boolean anythingElse(sf2 sf2, lf2 lf2) {
            lf2.p(this);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
            if (r9.a().x().equals("optgroup") != false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
            if (r9.a().x().equals("option") != false) goto L_0x00a7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(defpackage.sf2 r8, defpackage.lf2 r9) {
            /*
                r7 = this;
                int[] r0 = defpackage.mf2.p.a
                sf2$i r1 = r8.a
                int r1 = r1.ordinal()
                r0 = r0[r1]
                java.lang.String r1 = "html"
                r2 = 0
                java.lang.String r3 = "select"
                java.lang.String r4 = "optgroup"
                java.lang.String r5 = "option"
                switch(r0) {
                    case 1: goto L_0x015b;
                    case 2: goto L_0x0157;
                    case 3: goto L_0x00c9;
                    case 4: goto L_0x0049;
                    case 5: goto L_0x002e;
                    case 6: goto L_0x001b;
                    default: goto L_0x0016;
                }
            L_0x0016:
                boolean r8 = r7.anythingElse(r8, r9)
                return r8
            L_0x001b:
                org.jsoup.nodes.h r8 = r9.a()
                java.lang.String r8 = r8.x()
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x0162
            L_0x0029:
                r9.p(r7)
                goto L_0x0162
            L_0x002e:
                sf2$b r8 = r8.a()
                java.lang.String r0 = r8.p()
                java.lang.String r1 = defpackage.mf2.nullString
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0044
                r9.p(r7)
                return r2
            L_0x0044:
                r9.N(r8)
                goto L_0x0162
            L_0x0049:
                sf2$f r0 = r8.d()
                java.lang.String r0 = r0.C()
                boolean r1 = r0.equals(r4)
                if (r1 == 0) goto L_0x0093
                org.jsoup.nodes.h r8 = r9.a()
                java.lang.String r8 = r8.x()
                boolean r8 = r8.equals(r5)
                if (r8 == 0) goto L_0x0084
                org.jsoup.nodes.h r8 = r9.a()
                org.jsoup.nodes.h r8 = r9.j(r8)
                if (r8 == 0) goto L_0x0084
                org.jsoup.nodes.h r8 = r9.a()
                org.jsoup.nodes.h r8 = r9.j(r8)
                java.lang.String r8 = r8.x()
                boolean r8 = r8.equals(r4)
                if (r8 == 0) goto L_0x0084
                r9.f(r5)
            L_0x0084:
                org.jsoup.nodes.h r8 = r9.a()
                java.lang.String r8 = r8.x()
                boolean r8 = r8.equals(r4)
                if (r8 == 0) goto L_0x0029
                goto L_0x00a7
            L_0x0093:
                boolean r1 = r0.equals(r5)
                if (r1 == 0) goto L_0x00ac
                org.jsoup.nodes.h r8 = r9.a()
                java.lang.String r8 = r8.x()
                boolean r8 = r8.equals(r5)
                if (r8 == 0) goto L_0x0029
            L_0x00a7:
                r9.i0()
                goto L_0x0162
            L_0x00ac:
                boolean r1 = r0.equals(r3)
                if (r1 == 0) goto L_0x00c4
                boolean r8 = r9.H(r0)
                if (r8 != 0) goto L_0x00bc
                r9.p(r7)
                return r2
            L_0x00bc:
                r9.k0(r0)
                r9.w0()
                goto L_0x0162
            L_0x00c4:
                boolean r8 = r7.anythingElse(r8, r9)
                return r8
            L_0x00c9:
                sf2$g r0 = r8.e()
                java.lang.String r6 = r0.C()
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto L_0x00de
                mf2 r8 = defpackage.mf2.InBody
                boolean r8 = r9.m0(r0, r8)
                return r8
            L_0x00de:
                boolean r1 = r6.equals(r5)
                if (r1 == 0) goto L_0x00ec
            L_0x00e4:
                r9.f(r5)
            L_0x00e7:
                r9.L(r0)
                goto L_0x0162
            L_0x00ec:
                boolean r1 = r6.equals(r4)
                if (r1 == 0) goto L_0x0113
                org.jsoup.nodes.h r8 = r9.a()
                java.lang.String r8 = r8.x()
                boolean r8 = r8.equals(r5)
                if (r8 == 0) goto L_0x0101
                goto L_0x00e4
            L_0x0101:
                org.jsoup.nodes.h r8 = r9.a()
                java.lang.String r8 = r8.x()
                boolean r8 = r8.equals(r4)
                if (r8 == 0) goto L_0x00e7
                r9.f(r4)
                goto L_0x00e7
            L_0x0113:
                boolean r1 = r6.equals(r3)
                if (r1 == 0) goto L_0x0121
                r9.p(r7)
                boolean r8 = r9.f(r3)
                return r8
            L_0x0121:
                java.lang.String r1 = "input"
                java.lang.String r4 = "keygen"
                java.lang.String r5 = "textarea"
                java.lang.String[] r1 = new java.lang.String[]{r1, r4, r5}
                boolean r1 = defpackage.if2.b(r6, r1)
                if (r1 == 0) goto L_0x0143
                r9.p(r7)
                boolean r8 = r9.H(r3)
                if (r8 != 0) goto L_0x013b
                return r2
            L_0x013b:
                r9.f(r3)
                boolean r8 = r9.e(r0)
                return r8
            L_0x0143:
                java.lang.String r0 = "script"
                boolean r0 = r6.equals(r0)
                if (r0 == 0) goto L_0x0152
                mf2 r0 = defpackage.mf2.InHead
                boolean r8 = r9.m0(r8, r0)
                return r8
            L_0x0152:
                boolean r8 = r7.anythingElse(r8, r9)
                return r8
            L_0x0157:
                r9.p(r7)
                return r2
            L_0x015b:
                sf2$c r8 = r8.b()
                r9.O(r8)
            L_0x0162:
                r8 = 1
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mf2.g.process(sf2, lf2):boolean");
        }
    },
    InSelectInTable {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (sf2.k() && if2.b(sf2.e().C(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                lf2.p(this);
                lf2.f("select");
                return lf2.e(sf2);
            } else if (!sf2.j() || !if2.b(sf2.d().C(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                return lf2.m0(sf2, mf2.InSelect);
            } else {
                lf2.p(this);
                if (!lf2.K(sf2.d().C())) {
                    return false;
                }
                lf2.f("select");
                return lf2.e(sf2);
            }
        }
    },
    AfterBody {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (mf2.isWhitespace(sf2)) {
                return lf2.m0(sf2, mf2.InBody);
            }
            if (sf2.g()) {
                lf2.O(sf2.b());
                return true;
            } else if (sf2.h()) {
                lf2.p(this);
                return false;
            } else if (sf2.k() && sf2.e().C().equals("html")) {
                return lf2.m0(sf2, mf2.InBody);
            } else {
                if (!sf2.j() || !sf2.d().C().equals("html")) {
                    if (sf2.i()) {
                        return true;
                    }
                    lf2.p(this);
                    lf2.B0(mf2.InBody);
                    return lf2.e(sf2);
                } else if (lf2.Y()) {
                    lf2.p(this);
                    return false;
                } else {
                    lf2.B0(mf2.AfterAfterBody);
                    return true;
                }
            }
        }
    },
    InFrameset {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            mf2 mf2;
            if (mf2.isWhitespace(sf2)) {
                lf2.N(sf2.a());
            } else if (sf2.g()) {
                lf2.O(sf2.b());
            } else if (sf2.h()) {
                lf2.p(this);
                return false;
            } else if (sf2.k()) {
                sf2.g e = sf2.e();
                String C = e.C();
                if (C.equals("html")) {
                    mf2 = mf2.InBody;
                } else if (C.equals("frameset")) {
                    lf2.L(e);
                } else if (C.equals("frame")) {
                    lf2.P(e);
                } else if (C.equals("noframes")) {
                    mf2 = mf2.InHead;
                } else {
                    lf2.p(this);
                    return false;
                }
                return lf2.m0(e, mf2);
            } else if (!sf2.j() || !sf2.d().C().equals("frameset")) {
                if (!sf2.i()) {
                    lf2.p(this);
                    return false;
                } else if (!lf2.a().x().equals("html")) {
                    lf2.p(this);
                }
            } else if (lf2.a().x().equals("html")) {
                lf2.p(this);
                return false;
            } else {
                lf2.i0();
                if (!lf2.Y() && !lf2.a().x().equals("frameset")) {
                    lf2.B0(mf2.AfterFrameset);
                }
            }
            return true;
        }
    },
    AfterFrameset {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            mf2 mf2;
            if (mf2.isWhitespace(sf2)) {
                lf2.N(sf2.a());
                return true;
            } else if (sf2.g()) {
                lf2.O(sf2.b());
                return true;
            } else if (sf2.h()) {
                lf2.p(this);
                return false;
            } else {
                if (sf2.k() && sf2.e().C().equals("html")) {
                    mf2 = mf2.InBody;
                } else if (sf2.j() && sf2.d().C().equals("html")) {
                    lf2.B0(mf2.AfterAfterFrameset);
                    return true;
                } else if (sf2.k() && sf2.e().C().equals("noframes")) {
                    mf2 = mf2.InHead;
                } else if (sf2.i()) {
                    return true;
                } else {
                    lf2.p(this);
                    return false;
                }
                return lf2.m0(sf2, mf2);
            }
        }
    },
    AfterAfterBody {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (sf2.g()) {
                lf2.O(sf2.b());
                return true;
            } else if (sf2.h() || mf2.isWhitespace(sf2) || (sf2.k() && sf2.e().C().equals("html"))) {
                return lf2.m0(sf2, mf2.InBody);
            } else {
                if (sf2.i()) {
                    return true;
                }
                lf2.p(this);
                lf2.B0(mf2.InBody);
                return lf2.e(sf2);
            }
        }
    },
    AfterAfterFrameset {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            if (sf2.g()) {
                lf2.O(sf2.b());
                return true;
            } else if (sf2.h() || mf2.isWhitespace(sf2) || (sf2.k() && sf2.e().C().equals("html"))) {
                return lf2.m0(sf2, mf2.InBody);
            } else {
                if (sf2.i()) {
                    return true;
                }
                if (sf2.k() && sf2.e().C().equals("noframes")) {
                    return lf2.m0(sf2, mf2.InHead);
                }
                lf2.p(this);
                return false;
            }
        }
    },
    ForeignContent {
        /* access modifiers changed from: package-private */
        public boolean process(sf2 sf2, lf2 lf2) {
            return true;
        }
    };
    
    /* access modifiers changed from: private */
    public static String nullString;

    /* renamed from: mf2$p */
    static /* synthetic */ class p {
        static final /* synthetic */ int[] a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                sf2$i[] r0 = defpackage.sf2.i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                sf2$i r1 = defpackage.sf2.i.Comment     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                sf2$i r1 = defpackage.sf2.i.Doctype     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                sf2$i r1 = defpackage.sf2.i.StartTag     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                sf2$i r1 = defpackage.sf2.i.EndTag     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                sf2$i r1 = defpackage.sf2.i.Character     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                sf2$i r1 = defpackage.sf2.i.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mf2.p.<clinit>():void");
        }
    }

    /* renamed from: mf2$y */
    private static final class y {
        /* access modifiers changed from: private */
        public static final String[] a = null;
        /* access modifiers changed from: private */
        public static final String[] b = null;
        /* access modifiers changed from: private */
        public static final String[] c = null;
        /* access modifiers changed from: private */
        public static final String[] d = null;
        /* access modifiers changed from: private */
        public static final String[] e = null;
        /* access modifiers changed from: private */
        public static final String[] f = null;
        /* access modifiers changed from: private */
        public static final String[] g = null;
        /* access modifiers changed from: private */
        public static final String[] h = null;
        /* access modifiers changed from: private */
        public static final String[] i = null;
        /* access modifiers changed from: private */
        public static final String[] j = null;
        /* access modifiers changed from: private */
        public static final String[] k = null;
        /* access modifiers changed from: private */
        public static final String[] l = null;
        /* access modifiers changed from: private */
        public static final String[] m = null;
        /* access modifiers changed from: private */
        public static final String[] n = null;
        /* access modifiers changed from: private */
        public static final String[] o = null;
        /* access modifiers changed from: private */
        public static final String[] p = null;
        /* access modifiers changed from: private */
        public static final String[] q = null;

        static {
            a = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
            b = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
            c = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            d = new String[]{"pre", "listing"};
            e = new String[]{"address", "div", "p"};
            f = new String[]{"dd", "dt"};
            g = new String[]{"b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u"};
            h = new String[]{"applet", "marquee", "object"};
            i = new String[]{"area", "br", "embed", "img", "keygen", "wbr"};
            j = new String[]{"param", "source", "track"};
            k = new String[]{"name", "action", "prompt"};
            l = new String[]{"optgroup", "option"};
            m = new String[]{"rp", "rt"};
            n = new String[]{"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            o = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
            p = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
            q = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
        }
    }

    static {
        nullString = String.valueOf(0);
    }

    /* access modifiers changed from: private */
    public static void handleRawtext(sf2.g gVar, lf2 lf2) {
        lf2.L(gVar);
        lf2.b.v(vf2.Rawtext);
        lf2.d0();
        lf2.B0(Text);
    }

    /* access modifiers changed from: private */
    public static void handleRcData(sf2.g gVar, lf2 lf2) {
        lf2.L(gVar);
        lf2.b.v(vf2.Rcdata);
        lf2.d0();
        lf2.B0(Text);
    }

    /* access modifiers changed from: private */
    public static boolean isWhitespace(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!if2.f(str.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static boolean isWhitespace(sf2 sf2) {
        if (sf2.f()) {
            return isWhitespace(sf2.a().p());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean process(sf2 sf2, lf2 lf2);
}
