package defpackage;

import defpackage.sf2;
import java.util.Arrays;

/* renamed from: vf2  reason: default package */
enum vf2 {
    Data {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char p = kf2.p();
            if (p != 0) {
                if (p == '&') {
                    vf2 = vf2.CharacterReferenceInData;
                } else if (p == '<') {
                    vf2 = vf2.TagOpen;
                } else if (p != 65535) {
                    uf2.k(kf2.d());
                    return;
                } else {
                    uf2.l(new sf2.e());
                    return;
                }
                uf2.b(vf2);
                return;
            }
            uf2.s(this);
            uf2.j(kf2.c());
        }
    },
    CharacterReferenceInData {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.readCharRef(uf2, vf2.Data);
        }
    },
    Rcdata {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char p = kf2.p();
            if (p != 0) {
                if (p == '&') {
                    vf2 = vf2.CharacterReferenceInRcdata;
                } else if (p == '<') {
                    vf2 = vf2.RcdataLessthanSign;
                } else if (p != 65535) {
                    uf2.k(kf2.l('&', '<', vf2.nullChar));
                    return;
                } else {
                    uf2.l(new sf2.e());
                    return;
                }
                uf2.b(vf2);
                return;
            }
            uf2.s(this);
            kf2.a();
            uf2.j(vf2.replacementChar);
        }
    },
    CharacterReferenceInRcdata {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.readCharRef(uf2, vf2.Rcdata);
        }
    },
    Rawtext {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.readData(uf2, kf2, this, vf2.RawtextLessthanSign);
        }
    },
    ScriptData {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.readData(uf2, kf2, this, vf2.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            char p = kf2.p();
            if (p == 0) {
                uf2.s(this);
                kf2.a();
                uf2.j(vf2.replacementChar);
            } else if (p != 65535) {
                uf2.k(kf2.j(vf2.nullChar));
            } else {
                uf2.l(new sf2.e());
            }
        }
    },
    TagOpen {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            vf2 vf22;
            char p = kf2.p();
            if (p == '!') {
                vf2 = vf2.MarkupDeclarationOpen;
            } else if (p == '/') {
                vf2 = vf2.EndTagOpen;
            } else if (p != '?') {
                if (kf2.A()) {
                    uf2.h(true);
                    vf22 = vf2.TagName;
                } else {
                    uf2.s(this);
                    uf2.j('<');
                    vf22 = vf2.Data;
                }
                uf2.v(vf22);
                return;
            } else {
                vf2 = vf2.BogusComment;
            }
            uf2.b(vf2);
        }
    },
    EndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            if (kf2.q()) {
                uf2.q(this);
                uf2.k("</");
                vf2 = vf2.Data;
            } else if (kf2.A()) {
                uf2.h(false);
                vf2 = vf2.TagName;
            } else {
                boolean u = kf2.u('>');
                uf2.s(this);
                uf2.b(u ? vf2.Data : vf2.BogusComment);
                return;
            }
            uf2.v(vf2);
        }
    },
    TagName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            uf2.i.u(kf2.i());
            char c = kf2.c();
            if (c != 0) {
                if (c != ' ') {
                    if (c != '/') {
                        if (c == '>') {
                            uf2.p();
                        } else if (c == 65535) {
                            uf2.q(this);
                        } else if (!(c == 9 || c == 10 || c == 12 || c == 13)) {
                            return;
                        }
                        vf2 = vf2.Data;
                    } else {
                        vf2 = vf2.SelfClosingStartTag;
                    }
                    uf2.v(vf2);
                    return;
                }
                vf2 = vf2.BeforeAttributeName;
                uf2.v(vf2);
                return;
            }
            uf2.i.u(vf2.replacementStr);
        }
    },
    RcdataLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            if (kf2.u('/')) {
                uf2.i();
                uf2.b(vf2.RCDATAEndTagOpen);
                return;
            }
            if (kf2.A() && uf2.c() != null) {
                if (!kf2.o("</" + uf2.c())) {
                    sf2.h h = uf2.h(false);
                    h.A(uf2.c());
                    uf2.i = h;
                    uf2.p();
                    kf2.G();
                    vf2 = vf2.Data;
                    uf2.v(vf2);
                }
            }
            uf2.k("<");
            vf2 = vf2.Rcdata;
            uf2.v(vf2);
        }
    },
    RCDATAEndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            if (kf2.A()) {
                uf2.h(false);
                uf2.i.t(kf2.p());
                uf2.h.append(kf2.p());
                uf2.b(vf2.RCDATAEndTagName);
                return;
            }
            uf2.k("</");
            uf2.v(vf2.Rcdata);
        }
    },
    RCDATAEndTagName {
        private void anythingElse(uf2 uf2, kf2 kf2) {
            uf2.k("</" + uf2.h.toString());
            kf2.G();
            uf2.v(vf2.Rcdata);
        }

        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            if (kf2.A()) {
                String g = kf2.g();
                uf2.i.u(g);
                uf2.h.append(g);
                return;
            }
            char c = kf2.c();
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                if (uf2.t()) {
                    vf2 = vf2.BeforeAttributeName;
                    uf2.v(vf2);
                    return;
                }
            } else if (c != '/') {
                if (c == '>' && uf2.t()) {
                    uf2.p();
                    vf2 = vf2.Data;
                    uf2.v(vf2);
                    return;
                }
            } else if (uf2.t()) {
                vf2 = vf2.SelfClosingStartTag;
                uf2.v(vf2);
                return;
            }
            anythingElse(uf2, kf2);
        }
    },
    RawtextLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            if (kf2.u('/')) {
                uf2.i();
                uf2.b(vf2.RawtextEndTagOpen);
                return;
            }
            uf2.j('<');
            uf2.v(vf2.Rawtext);
        }
    },
    RawtextEndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.readEndTag(uf2, kf2, vf2.RawtextEndTagName, vf2.Rawtext);
        }
    },
    RawtextEndTagName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.handleDataEndTag(uf2, kf2, vf2.Rawtext);
        }
    },
    ScriptDataLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c == '!') {
                uf2.k("<!");
                vf2 = vf2.ScriptDataEscapeStart;
            } else if (c != '/') {
                uf2.k("<");
                kf2.G();
                vf2 = vf2.ScriptData;
            } else {
                uf2.i();
                vf2 = vf2.ScriptDataEndTagOpen;
            }
            uf2.v(vf2);
        }
    },
    ScriptDataEndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.readEndTag(uf2, kf2, vf2.ScriptDataEndTagName, vf2.ScriptData);
        }
    },
    ScriptDataEndTagName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.handleDataEndTag(uf2, kf2, vf2.ScriptData);
        }
    },
    ScriptDataEscapeStart {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            if (kf2.u('-')) {
                uf2.j('-');
                uf2.b(vf2.ScriptDataEscapeStartDash);
                return;
            }
            uf2.v(vf2.ScriptData);
        }
    },
    ScriptDataEscapeStartDash {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            if (kf2.u('-')) {
                uf2.j('-');
                uf2.b(vf2.ScriptDataEscapedDashDash);
                return;
            }
            uf2.v(vf2.ScriptData);
        }
    },
    ScriptDataEscaped {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            if (kf2.q()) {
                uf2.q(this);
                uf2.v(vf2.Data);
                return;
            }
            char p = kf2.p();
            if (p != 0) {
                if (p == '-') {
                    uf2.j('-');
                    vf2 = vf2.ScriptDataEscapedDash;
                } else if (p != '<') {
                    uf2.k(kf2.l('-', '<', vf2.nullChar));
                    return;
                } else {
                    vf2 = vf2.ScriptDataEscapedLessthanSign;
                }
                uf2.b(vf2);
                return;
            }
            uf2.s(this);
            kf2.a();
            uf2.j(vf2.replacementChar);
        }
    },
    ScriptDataEscapedDash {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            if (kf2.q()) {
                uf2.q(this);
                uf2.v(vf2.Data);
                return;
            }
            char c = kf2.c();
            if (c != 0) {
                if (c == '-') {
                    uf2.j(c);
                    vf2 = vf2.ScriptDataEscapedDashDash;
                } else if (c == '<') {
                    vf2 = vf2.ScriptDataEscapedLessthanSign;
                }
                uf2.v(vf2);
            }
            uf2.s(this);
            c = vf2.replacementChar;
            uf2.j(c);
            vf2 = vf2.ScriptDataEscaped;
            uf2.v(vf2);
        }
    },
    ScriptDataEscapedDashDash {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            if (kf2.q()) {
                uf2.q(this);
                uf2.v(vf2.Data);
                return;
            }
            char c = kf2.c();
            if (c == 0) {
                uf2.s(this);
                uf2.j(vf2.replacementChar);
            } else if (c != '-') {
                if (c != '<') {
                    uf2.j(c);
                    if (c == '>') {
                        vf2 = vf2.ScriptData;
                    }
                } else {
                    vf2 = vf2.ScriptDataEscapedLessthanSign;
                }
                uf2.v(vf2);
            } else {
                uf2.j(c);
                return;
            }
            vf2 = vf2.ScriptDataEscaped;
            uf2.v(vf2);
        }
    },
    ScriptDataEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            if (kf2.A()) {
                uf2.i();
                uf2.h.append(kf2.p());
                uf2.k("<" + kf2.p());
                vf2 = vf2.ScriptDataDoubleEscapeStart;
            } else if (kf2.u('/')) {
                uf2.i();
                vf2 = vf2.ScriptDataEscapedEndTagOpen;
            } else {
                uf2.j('<');
                uf2.v(vf2.ScriptDataEscaped);
                return;
            }
            uf2.b(vf2);
        }
    },
    ScriptDataEscapedEndTagOpen {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            if (kf2.A()) {
                uf2.h(false);
                uf2.i.t(kf2.p());
                uf2.h.append(kf2.p());
                uf2.b(vf2.ScriptDataEscapedEndTagName);
                return;
            }
            uf2.k("</");
            uf2.v(vf2.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.handleDataEndTag(uf2, kf2, vf2.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.handleDataDoubleEscapeTag(uf2, kf2, vf2.ScriptDataDoubleEscaped, vf2.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char p = kf2.p();
            if (p != 0) {
                if (p == '-') {
                    uf2.j(p);
                    vf2 = vf2.ScriptDataDoubleEscapedDash;
                } else if (p == '<') {
                    uf2.j(p);
                    vf2 = vf2.ScriptDataDoubleEscapedLessthanSign;
                } else if (p != 65535) {
                    uf2.k(kf2.l('-', '<', vf2.nullChar));
                    return;
                } else {
                    uf2.q(this);
                    uf2.v(vf2.Data);
                    return;
                }
                uf2.b(vf2);
                return;
            }
            uf2.s(this);
            kf2.a();
            uf2.j(vf2.replacementChar);
        }
    },
    ScriptDataDoubleEscapedDash {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c == '-') {
                    uf2.j(c);
                    vf2 = vf2.ScriptDataDoubleEscapedDashDash;
                } else if (c == '<') {
                    uf2.j(c);
                    vf2 = vf2.ScriptDataDoubleEscapedLessthanSign;
                } else if (c == 65535) {
                    uf2.q(this);
                    vf2 = vf2.Data;
                }
                uf2.v(vf2);
            }
            uf2.s(this);
            c = vf2.replacementChar;
            uf2.j(c);
            vf2 = vf2.ScriptDataDoubleEscaped;
            uf2.v(vf2);
        }
    },
    ScriptDataDoubleEscapedDashDash {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c == 0) {
                uf2.s(this);
                c = vf2.replacementChar;
            } else if (c != '-') {
                if (c == '<') {
                    uf2.j(c);
                    vf2 = vf2.ScriptDataDoubleEscapedLessthanSign;
                } else if (c == '>') {
                    uf2.j(c);
                    vf2 = vf2.ScriptData;
                } else if (c == 65535) {
                    uf2.q(this);
                    vf2 = vf2.Data;
                }
                uf2.v(vf2);
            } else {
                uf2.j(c);
                return;
            }
            uf2.j(c);
            vf2 = vf2.ScriptDataDoubleEscaped;
            uf2.v(vf2);
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            if (kf2.u('/')) {
                uf2.j('/');
                uf2.i();
                uf2.b(vf2.ScriptDataDoubleEscapeEnd);
                return;
            }
            uf2.v(vf2.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2.handleDataDoubleEscapeTag(uf2, kf2, vf2.ScriptDataEscaped, vf2.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c == 0) {
                uf2.s(this);
            } else if (c != ' ') {
                if (!(c == '\"' || c == '\'')) {
                    if (c != '/') {
                        if (c != 65535) {
                            if (c != 9 && c != 10 && c != 12 && c != 13) {
                                switch (c) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        uf2.p();
                                        break;
                                }
                            } else {
                                return;
                            }
                        } else {
                            uf2.q(this);
                        }
                        vf2 = vf2.Data;
                    } else {
                        vf2 = vf2.SelfClosingStartTag;
                    }
                    uf2.v(vf2);
                }
                uf2.s(this);
                uf2.i.B();
                uf2.i.o(c);
                vf2 = vf2.AttributeName;
                uf2.v(vf2);
            } else {
                return;
            }
            uf2.i.B();
            kf2.G();
            vf2 = vf2.AttributeName;
            uf2.v(vf2);
        }
    },
    AttributeName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            sf2.h hVar;
            vf2 vf2;
            uf2.i.p(kf2.m(vf2.attributeNameCharsSorted));
            char c = kf2.c();
            if (c != 0) {
                if (c != ' ') {
                    if (!(c == '\"' || c == '\'')) {
                        if (c != '/') {
                            if (c == 65535) {
                                uf2.q(this);
                            } else if (!(c == 9 || c == 10 || c == 12 || c == 13)) {
                                switch (c) {
                                    case '<':
                                        break;
                                    case '=':
                                        vf2 = vf2.BeforeAttributeValue;
                                        break;
                                    case '>':
                                        uf2.p();
                                        break;
                                    default:
                                        return;
                                }
                            }
                            vf2 = vf2.Data;
                        } else {
                            vf2 = vf2.SelfClosingStartTag;
                        }
                        uf2.v(vf2);
                        return;
                    }
                    uf2.s(this);
                    hVar = uf2.i;
                }
                vf2 = vf2.AfterAttributeName;
                uf2.v(vf2);
                return;
            }
            uf2.s(this);
            hVar = uf2.i;
            c = vf2.replacementChar;
            hVar.o(c);
        }
    },
    AfterAttributeName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            sf2.h hVar;
            char c = kf2.c();
            if (c == 0) {
                uf2.s(this);
                hVar = uf2.i;
                c = vf2.replacementChar;
            } else if (c != ' ') {
                if (!(c == '\"' || c == '\'')) {
                    if (c != '/') {
                        if (c != 65535) {
                            if (c != 9 && c != 10 && c != 12 && c != 13) {
                                switch (c) {
                                    case '<':
                                        break;
                                    case '=':
                                        vf2 = vf2.BeforeAttributeValue;
                                        break;
                                    case '>':
                                        uf2.p();
                                        break;
                                    default:
                                        uf2.i.B();
                                        kf2.G();
                                        break;
                                }
                            } else {
                                return;
                            }
                        } else {
                            uf2.q(this);
                        }
                        vf2 = vf2.Data;
                    } else {
                        vf2 = vf2.SelfClosingStartTag;
                    }
                    uf2.v(vf2);
                }
                uf2.s(this);
                uf2.i.B();
                hVar = uf2.i;
            } else {
                return;
            }
            hVar.o(c);
            vf2 = vf2.AttributeName;
            uf2.v(vf2);
        }
    },
    BeforeAttributeValue {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            sf2.h hVar;
            char c = kf2.c();
            if (c == 0) {
                uf2.s(this);
                hVar = uf2.i;
                c = vf2.replacementChar;
            } else if (c != ' ') {
                if (c != '\"') {
                    if (c != '`') {
                        if (c == 65535) {
                            uf2.q(this);
                        } else if (c != 9 && c != 10 && c != 12 && c != 13) {
                            if (c != '&') {
                                if (c != '\'') {
                                    switch (c) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            uf2.s(this);
                                            break;
                                    }
                                } else {
                                    vf2 = vf2.AttributeValue_singleQuoted;
                                }
                            }
                            kf2.G();
                            vf2 = vf2.AttributeValue_unquoted;
                        } else {
                            return;
                        }
                        uf2.p();
                        vf2 = vf2.Data;
                    }
                    uf2.s(this);
                    hVar = uf2.i;
                } else {
                    vf2 = vf2.AttributeValue_doubleQuoted;
                }
                uf2.v(vf2);
            } else {
                return;
            }
            hVar.q(c);
            vf2 = vf2.AttributeValue_unquoted;
            uf2.v(vf2);
        }
    },
    AttributeValue_doubleQuoted {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            String l = kf2.l(vf2.attributeDoubleValueCharsSorted);
            if (l.length() > 0) {
                uf2.i.r(l);
            } else {
                uf2.i.E();
            }
            char c = kf2.c();
            if (c != 0) {
                if (c == '\"') {
                    vf2 = vf2.AfterAttributeValue_quoted;
                } else if (c == '&') {
                    int[] e = uf2.e('\"', true);
                    sf2.h hVar = uf2.i;
                    if (e != null) {
                        hVar.s(e);
                        return;
                    } else {
                        hVar.q('&');
                        return;
                    }
                } else if (c == 65535) {
                    uf2.q(this);
                    vf2 = vf2.Data;
                } else {
                    return;
                }
                uf2.v(vf2);
                return;
            }
            uf2.s(this);
            uf2.i.q(vf2.replacementChar);
        }
    },
    AttributeValue_singleQuoted {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            String l = kf2.l(vf2.attributeSingleValueCharsSorted);
            if (l.length() > 0) {
                uf2.i.r(l);
            } else {
                uf2.i.E();
            }
            char c = kf2.c();
            if (c != 0) {
                if (c == 65535) {
                    uf2.q(this);
                    vf2 = vf2.Data;
                } else if (c == '&') {
                    int[] e = uf2.e('\'', true);
                    sf2.h hVar = uf2.i;
                    if (e != null) {
                        hVar.s(e);
                        return;
                    } else {
                        hVar.q('&');
                        return;
                    }
                } else if (c == '\'') {
                    vf2 = vf2.AfterAttributeValue_quoted;
                } else {
                    return;
                }
                uf2.v(vf2);
                return;
            }
            uf2.s(this);
            uf2.i.q(vf2.replacementChar);
        }
    },
    AttributeValue_unquoted {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            sf2.h hVar;
            vf2 vf2;
            String m = kf2.m(vf2.attributeValueUnquoted);
            if (m.length() > 0) {
                uf2.i.r(m);
            }
            char c = kf2.c();
            if (c != 0) {
                if (c != ' ') {
                    if (!(c == '\"' || c == '`')) {
                        if (c == 65535) {
                            uf2.q(this);
                        } else if (!(c == 9 || c == 10 || c == 12 || c == 13)) {
                            if (c == '&') {
                                int[] e = uf2.e('>', true);
                                sf2.h hVar2 = uf2.i;
                                if (e != null) {
                                    hVar2.s(e);
                                    return;
                                } else {
                                    hVar2.q('&');
                                    return;
                                }
                            } else if (c != '\'') {
                                switch (c) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        uf2.p();
                                        break;
                                    default:
                                        return;
                                }
                            }
                        }
                        vf2 = vf2.Data;
                        uf2.v(vf2);
                        return;
                    }
                    uf2.s(this);
                    hVar = uf2.i;
                }
                vf2 = vf2.BeforeAttributeName;
                uf2.v(vf2);
                return;
            }
            uf2.s(this);
            hVar = uf2.i;
            c = vf2.replacementChar;
            hVar.q(c);
        }
    },
    AfterAttributeValue_quoted {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
                if (c != '/') {
                    if (c == '>') {
                        uf2.p();
                    } else if (c != 65535) {
                        uf2.s(this);
                        kf2.G();
                    } else {
                        uf2.q(this);
                    }
                    vf2 = vf2.Data;
                } else {
                    vf2 = vf2.SelfClosingStartTag;
                }
                uf2.v(vf2);
            }
            vf2 = vf2.BeforeAttributeName;
            uf2.v(vf2);
        }
    },
    SelfClosingStartTag {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c == '>') {
                uf2.i.i = true;
                uf2.p();
            } else if (c != 65535) {
                uf2.s(this);
                kf2.G();
                vf2 = vf2.BeforeAttributeName;
                uf2.v(vf2);
            } else {
                uf2.q(this);
            }
            vf2 = vf2.Data;
            uf2.v(vf2);
        }
    },
    BogusComment {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            kf2.G();
            sf2.c cVar = new sf2.c();
            cVar.c = true;
            cVar.b.append(kf2.j('>'));
            uf2.l(cVar);
            uf2.b(vf2.Data);
        }
    },
    MarkupDeclarationOpen {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            if (kf2.s("--")) {
                uf2.f();
                vf2 = vf2.CommentStart;
            } else if (kf2.t("DOCTYPE")) {
                vf2 = vf2.Doctype;
            } else if (kf2.s("[CDATA[")) {
                vf2 = vf2.CdataSection;
            } else {
                uf2.s(this);
                uf2.b(vf2.BogusComment);
                return;
            }
            uf2.v(vf2);
        }
    },
    CommentStart {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c != '-') {
                    if (c == '>') {
                        uf2.s(this);
                    } else if (c != 65535) {
                        uf2.n.b.append(c);
                    } else {
                        uf2.q(this);
                    }
                    uf2.n();
                    vf2 = vf2.Data;
                } else {
                    vf2 = vf2.CommentStartDash;
                }
                uf2.v(vf2);
            }
            uf2.s(this);
            uf2.n.b.append(vf2.replacementChar);
            vf2 = vf2.Comment;
            uf2.v(vf2);
        }
    },
    CommentStartDash {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c != '-') {
                    if (c == '>') {
                        uf2.s(this);
                    } else if (c != 65535) {
                        uf2.n.b.append(c);
                    } else {
                        uf2.q(this);
                    }
                    uf2.n();
                    vf2 = vf2.Data;
                } else {
                    vf2 = vf2.CommentStartDash;
                }
                uf2.v(vf2);
            }
            uf2.s(this);
            uf2.n.b.append(vf2.replacementChar);
            vf2 = vf2.Comment;
            uf2.v(vf2);
        }
    },
    Comment {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            char p = kf2.p();
            if (p == 0) {
                uf2.s(this);
                kf2.a();
                uf2.n.b.append(vf2.replacementChar);
            } else if (p == '-') {
                uf2.b(vf2.CommentEndDash);
            } else if (p != 65535) {
                uf2.n.b.append(kf2.l('-', vf2.nullChar));
            } else {
                uf2.q(this);
                uf2.n();
                uf2.v(vf2.Data);
            }
        }
    },
    CommentEndDash {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c == '-') {
                    vf2 = vf2.CommentEnd;
                } else if (c != 65535) {
                    StringBuilder sb = uf2.n.b;
                    sb.append('-');
                    sb.append(c);
                } else {
                    uf2.q(this);
                    uf2.n();
                    vf2 = vf2.Data;
                }
                uf2.v(vf2);
            }
            uf2.s(this);
            StringBuilder sb2 = uf2.n.b;
            sb2.append('-');
            sb2.append(vf2.replacementChar);
            vf2 = vf2.Comment;
            uf2.v(vf2);
        }
    },
    CommentEnd {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c == '!') {
                    uf2.s(this);
                    vf2 = vf2.CommentEndBang;
                } else if (c != '-') {
                    if (c != '>') {
                        if (c != 65535) {
                            uf2.s(this);
                            StringBuilder sb = uf2.n.b;
                            sb.append("--");
                            sb.append(c);
                        } else {
                            uf2.q(this);
                        }
                    }
                    uf2.n();
                    vf2 = vf2.Data;
                } else {
                    uf2.s(this);
                    uf2.n.b.append('-');
                    return;
                }
                uf2.v(vf2);
            }
            uf2.s(this);
            StringBuilder sb2 = uf2.n.b;
            sb2.append("--");
            sb2.append(vf2.replacementChar);
            vf2 = vf2.Comment;
            uf2.v(vf2);
        }
    },
    CommentEndBang {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c != '-') {
                    if (c != '>') {
                        if (c != 65535) {
                            StringBuilder sb = uf2.n.b;
                            sb.append("--!");
                            sb.append(c);
                        } else {
                            uf2.q(this);
                        }
                    }
                    uf2.n();
                    vf2 = vf2.Data;
                } else {
                    uf2.n.b.append("--!");
                    vf2 = vf2.CommentEndDash;
                }
                uf2.v(vf2);
            }
            uf2.s(this);
            StringBuilder sb2 = uf2.n.b;
            sb2.append("--!");
            sb2.append(vf2.replacementChar);
            vf2 = vf2.Comment;
            uf2.v(vf2);
        }
    },
    Doctype {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
                if (c != '>') {
                    if (c != 65535) {
                        uf2.s(this);
                    } else {
                        uf2.q(this);
                    }
                }
                uf2.s(this);
                uf2.g();
                uf2.m.f = true;
                uf2.o();
                vf2 = vf2.Data;
                uf2.v(vf2);
            }
            vf2 = vf2.BeforeDoctypeName;
            uf2.v(vf2);
        }
    },
    BeforeDoctypeName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            if (kf2.A()) {
                uf2.g();
                uf2.v(vf2.DoctypeName);
                return;
            }
            char c = kf2.c();
            if (c == 0) {
                uf2.s(this);
                uf2.g();
                uf2.m.b.append(vf2.replacementChar);
            } else if (c == ' ') {
                return;
            } else {
                if (c == 65535) {
                    uf2.q(this);
                    uf2.g();
                    uf2.m.f = true;
                    uf2.o();
                    vf2 = vf2.Data;
                    uf2.v(vf2);
                } else if (c != 9 && c != 10 && c != 12 && c != 13) {
                    uf2.g();
                    uf2.m.b.append(c);
                } else {
                    return;
                }
            }
            vf2 = vf2.DoctypeName;
            uf2.v(vf2);
        }
    },
    DoctypeName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            StringBuilder sb;
            vf2 vf2;
            if (kf2.A()) {
                uf2.m.b.append(kf2.g());
                return;
            }
            char c = kf2.c();
            if (c != 0) {
                if (c != ' ') {
                    if (c != '>') {
                        if (c == 65535) {
                            uf2.q(this);
                            uf2.m.f = true;
                        } else if (!(c == 9 || c == 10 || c == 12 || c == 13)) {
                            sb = uf2.m.b;
                        }
                    }
                    uf2.o();
                    vf2 = vf2.Data;
                    uf2.v(vf2);
                    return;
                }
                vf2 = vf2.AfterDoctypeName;
                uf2.v(vf2);
                return;
            }
            uf2.s(this);
            sb = uf2.m.b;
            c = vf2.replacementChar;
            sb.append(c);
        }
    },
    AfterDoctypeName {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            vf2 vf22;
            if (kf2.q()) {
                uf2.q(this);
                uf2.m.f = true;
                uf2.o();
                uf2.v(vf2.Data);
            } else if (kf2.w(9, 10, 13, 12, ' ')) {
                kf2.a();
            } else {
                if (kf2.u('>')) {
                    uf2.o();
                    vf2 = vf2.Data;
                } else {
                    if (kf2.t("PUBLIC")) {
                        uf2.m.c = "PUBLIC";
                        vf22 = vf2.AfterDoctypePublicKeyword;
                    } else if (kf2.t("SYSTEM")) {
                        uf2.m.c = "SYSTEM";
                        vf22 = vf2.AfterDoctypeSystemKeyword;
                    } else {
                        uf2.s(this);
                        uf2.m.f = true;
                        vf2 = vf2.BogusDoctype;
                    }
                    uf2.v(vf22);
                    return;
                }
                uf2.b(vf2);
            }
        }
    },
    AfterDoctypePublicKeyword {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                vf2 = vf2.BeforeDoctypePublicIdentifier;
            } else if (c == '\"') {
                uf2.s(this);
                vf2 = vf2.DoctypePublicIdentifier_doubleQuoted;
            } else if (c != '\'') {
                if (c == '>') {
                    uf2.s(this);
                } else if (c != 65535) {
                    uf2.s(this);
                    uf2.m.f = true;
                    vf2 = vf2.BogusDoctype;
                } else {
                    uf2.q(this);
                }
                uf2.m.f = true;
                uf2.o();
                vf2 = vf2.Data;
            } else {
                uf2.s(this);
                vf2 = vf2.DoctypePublicIdentifier_singleQuoted;
            }
            uf2.v(vf2);
        }
    },
    BeforeDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 9 && c != 10 && c != 12 && c != 13 && c != ' ') {
                if (c == '\"') {
                    vf2 = vf2.DoctypePublicIdentifier_doubleQuoted;
                } else if (c != '\'') {
                    if (c == '>') {
                        uf2.s(this);
                    } else if (c != 65535) {
                        uf2.s(this);
                        uf2.m.f = true;
                        vf2 = vf2.BogusDoctype;
                    } else {
                        uf2.q(this);
                    }
                    uf2.m.f = true;
                    uf2.o();
                    vf2 = vf2.Data;
                } else {
                    vf2 = vf2.DoctypePublicIdentifier_singleQuoted;
                }
                uf2.v(vf2);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            StringBuilder sb;
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c != '\"') {
                    if (c == '>') {
                        uf2.s(this);
                    } else if (c != 65535) {
                        sb = uf2.m.d;
                    } else {
                        uf2.q(this);
                    }
                    uf2.m.f = true;
                    uf2.o();
                    vf2 = vf2.Data;
                } else {
                    vf2 = vf2.AfterDoctypePublicIdentifier;
                }
                uf2.v(vf2);
                return;
            }
            uf2.s(this);
            sb = uf2.m.d;
            c = vf2.replacementChar;
            sb.append(c);
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            StringBuilder sb;
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c != '\'') {
                    if (c == '>') {
                        uf2.s(this);
                    } else if (c != 65535) {
                        sb = uf2.m.d;
                    } else {
                        uf2.q(this);
                    }
                    uf2.m.f = true;
                    uf2.o();
                    vf2 = vf2.Data;
                } else {
                    vf2 = vf2.AfterDoctypePublicIdentifier;
                }
                uf2.v(vf2);
                return;
            }
            uf2.s(this);
            sb = uf2.m.d;
            c = vf2.replacementChar;
            sb.append(c);
        }
    },
    AfterDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                vf2 = vf2.BetweenDoctypePublicAndSystemIdentifiers;
            } else if (c == '\"') {
                uf2.s(this);
                vf2 = vf2.DoctypeSystemIdentifier_doubleQuoted;
            } else if (c != '\'') {
                if (c != '>') {
                    if (c != 65535) {
                        uf2.s(this);
                        uf2.m.f = true;
                        vf2 = vf2.BogusDoctype;
                    } else {
                        uf2.q(this);
                        uf2.m.f = true;
                    }
                }
                uf2.o();
                vf2 = vf2.Data;
            } else {
                uf2.s(this);
                vf2 = vf2.DoctypeSystemIdentifier_singleQuoted;
            }
            uf2.v(vf2);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 9 && c != 10 && c != 12 && c != 13 && c != ' ') {
                if (c == '\"') {
                    uf2.s(this);
                    vf2 = vf2.DoctypeSystemIdentifier_doubleQuoted;
                } else if (c != '\'') {
                    if (c != '>') {
                        if (c != 65535) {
                            uf2.s(this);
                            uf2.m.f = true;
                            vf2 = vf2.BogusDoctype;
                        } else {
                            uf2.q(this);
                            uf2.m.f = true;
                        }
                    }
                    uf2.o();
                    vf2 = vf2.Data;
                } else {
                    uf2.s(this);
                    vf2 = vf2.DoctypeSystemIdentifier_singleQuoted;
                }
                uf2.v(vf2);
            }
        }
    },
    AfterDoctypeSystemKeyword {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
                vf2 = vf2.BeforeDoctypeSystemIdentifier;
            } else if (c == '\"') {
                uf2.s(this);
                vf2 = vf2.DoctypeSystemIdentifier_doubleQuoted;
            } else if (c != '\'') {
                if (c == '>') {
                    uf2.s(this);
                } else if (c != 65535) {
                    uf2.s(this);
                    uf2.m.f = true;
                    uf2.o();
                    return;
                } else {
                    uf2.q(this);
                }
                uf2.m.f = true;
                uf2.o();
                vf2 = vf2.Data;
            } else {
                uf2.s(this);
                vf2 = vf2.DoctypeSystemIdentifier_singleQuoted;
            }
            uf2.v(vf2);
        }
    },
    BeforeDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 9 && c != 10 && c != 12 && c != 13 && c != ' ') {
                if (c == '\"') {
                    vf2 = vf2.DoctypeSystemIdentifier_doubleQuoted;
                } else if (c != '\'') {
                    if (c == '>') {
                        uf2.s(this);
                    } else if (c != 65535) {
                        uf2.s(this);
                        uf2.m.f = true;
                        vf2 = vf2.BogusDoctype;
                    } else {
                        uf2.q(this);
                    }
                    uf2.m.f = true;
                    uf2.o();
                    vf2 = vf2.Data;
                } else {
                    vf2 = vf2.DoctypeSystemIdentifier_singleQuoted;
                }
                uf2.v(vf2);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            StringBuilder sb;
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c != '\"') {
                    if (c == '>') {
                        uf2.s(this);
                    } else if (c != 65535) {
                        sb = uf2.m.e;
                    } else {
                        uf2.q(this);
                    }
                    uf2.m.f = true;
                    uf2.o();
                    vf2 = vf2.Data;
                } else {
                    vf2 = vf2.AfterDoctypeSystemIdentifier;
                }
                uf2.v(vf2);
                return;
            }
            uf2.s(this);
            sb = uf2.m.e;
            c = vf2.replacementChar;
            sb.append(c);
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            StringBuilder sb;
            vf2 vf2;
            char c = kf2.c();
            if (c != 0) {
                if (c != '\'') {
                    if (c == '>') {
                        uf2.s(this);
                    } else if (c != 65535) {
                        sb = uf2.m.e;
                    } else {
                        uf2.q(this);
                    }
                    uf2.m.f = true;
                    uf2.o();
                    vf2 = vf2.Data;
                } else {
                    vf2 = vf2.AfterDoctypeSystemIdentifier;
                }
                uf2.v(vf2);
                return;
            }
            uf2.s(this);
            sb = uf2.m.e;
            c = vf2.replacementChar;
            sb.append(c);
        }
    },
    AfterDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            vf2 vf2;
            char c = kf2.c();
            if (c != 9 && c != 10 && c != 12 && c != 13 && c != ' ') {
                if (c != '>') {
                    if (c != 65535) {
                        uf2.s(this);
                        vf2 = vf2.BogusDoctype;
                        uf2.v(vf2);
                    }
                    uf2.q(this);
                    uf2.m.f = true;
                }
                uf2.o();
                vf2 = vf2.Data;
                uf2.v(vf2);
            }
        }
    },
    BogusDoctype {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            char c = kf2.c();
            if (c == '>' || c == 65535) {
                uf2.o();
                uf2.v(vf2.Data);
            }
        }
    },
    CdataSection {
        /* access modifiers changed from: package-private */
        public void read(uf2 uf2, kf2 kf2) {
            uf2.k(kf2.k("]]>"));
            kf2.s("]]>");
            uf2.v(vf2.Data);
        }
    };
    
    /* access modifiers changed from: private */
    public static final char[] attributeDoubleValueCharsSorted = null;
    /* access modifiers changed from: private */
    public static final char[] attributeNameCharsSorted = null;
    /* access modifiers changed from: private */
    public static final char[] attributeSingleValueCharsSorted = null;
    /* access modifiers changed from: private */
    public static final char[] attributeValueUnquoted = null;
    private static final char eof = '￿';
    static final char nullChar = '\u0000';
    private static final char replacementChar = '�';
    /* access modifiers changed from: private */
    public static final String replacementStr = null;

    static {
        attributeSingleValueCharsSorted = new char[]{'\'', '&', nullChar};
        attributeDoubleValueCharsSorted = new char[]{'\"', '&', nullChar};
        attributeNameCharsSorted = new char[]{9, 10, 13, 12, ' ', '/', '=', '>', nullChar, '\"', '\'', '<'};
        attributeValueUnquoted = new char[]{9, 10, 13, 12, ' ', '&', '>', nullChar, '\"', '\'', '<', '=', '`'};
        replacementStr = String.valueOf(replacementChar);
        Arrays.sort(attributeSingleValueCharsSorted);
        Arrays.sort(attributeDoubleValueCharsSorted);
        Arrays.sort(attributeNameCharsSorted);
        Arrays.sort(attributeValueUnquoted);
    }

    /* access modifiers changed from: private */
    public static void handleDataDoubleEscapeTag(uf2 uf2, kf2 kf2, vf2 vf2, vf2 vf22) {
        if (kf2.A()) {
            String g2 = kf2.g();
            uf2.h.append(g2);
            uf2.k(g2);
            return;
        }
        char c2 = kf2.c();
        if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ' || c2 == '/' || c2 == '>') {
            if (uf2.h.toString().equals("script")) {
                uf2.v(vf2);
            } else {
                uf2.v(vf22);
            }
            uf2.j(c2);
            return;
        }
        kf2.G();
        uf2.v(vf22);
    }

    /* access modifiers changed from: private */
    public static void handleDataEndTag(uf2 uf2, kf2 kf2, vf2 vf2) {
        vf2 vf22;
        if (kf2.A()) {
            String g2 = kf2.g();
            uf2.i.u(g2);
            uf2.h.append(g2);
            return;
        }
        boolean z2 = false;
        boolean z3 = true;
        if (uf2.t() && !kf2.q()) {
            char c2 = kf2.c();
            if (c2 == 9 || c2 == 10 || c2 == 12 || c2 == 13 || c2 == ' ') {
                vf22 = BeforeAttributeName;
            } else if (c2 == '/') {
                vf22 = SelfClosingStartTag;
            } else if (c2 != '>') {
                uf2.h.append(c2);
                z2 = true;
                z3 = z2;
            } else {
                uf2.p();
                vf22 = Data;
            }
            uf2.v(vf22);
            z3 = z2;
        }
        if (z3) {
            uf2.k("</" + uf2.h.toString());
            uf2.v(vf2);
        }
    }

    /* access modifiers changed from: private */
    public static void readCharRef(uf2 uf2, vf2 vf2) {
        int[] e2 = uf2.e((Character) null, false);
        if (e2 == null) {
            uf2.j('&');
        } else {
            uf2.m(e2);
        }
        uf2.v(vf2);
    }

    /* access modifiers changed from: private */
    public static void readData(uf2 uf2, kf2 kf2, vf2 vf2, vf2 vf22) {
        char p2 = kf2.p();
        if (p2 == 0) {
            uf2.s(vf2);
            kf2.a();
            uf2.j(replacementChar);
        } else if (p2 == '<') {
            uf2.b(vf22);
        } else if (p2 != 65535) {
            uf2.k(kf2.l('<', nullChar));
        } else {
            uf2.l(new sf2.e());
        }
    }

    /* access modifiers changed from: private */
    public static void readEndTag(uf2 uf2, kf2 kf2, vf2 vf2, vf2 vf22) {
        if (kf2.A()) {
            uf2.h(false);
            uf2.v(vf2);
            return;
        }
        uf2.k("</");
        uf2.v(vf22);
    }

    /* access modifiers changed from: package-private */
    public abstract void read(uf2 uf2, kf2 kf2);
}
