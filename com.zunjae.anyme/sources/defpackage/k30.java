package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: k30  reason: default package */
public final class k30 extends i20 {
    private static final Pattern o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    private static final b u = new b(30.0f, 1, 1);
    private static final a v = new a(32, 15);
    private final XmlPullParserFactory n;

    /* renamed from: k30$a */
    private static final class a {
        final int a;

        a(int i, int i2) {
            this.a = i2;
        }
    }

    /* renamed from: k30$b */
    private static final class b {
        final float a;
        final int b;
        final int c;

        b(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    /* renamed from: k30$c */
    private static final class c {
        final int a;
        final int b;

        c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public k30() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private o30 C(o30 o30) {
        return o30 == null ? new o30() : o30;
    }

    private static boolean D(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private a E(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(attributeValue);
            b50.h("TtmlDecoder", valueOf.length() != 0 ? "Ignoring malformed cell resolution: ".concat(valueOf) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(parseInt);
            sb.append(" ");
            sb.append(parseInt2);
            throw new m20(sb.toString());
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(attributeValue);
            b50.h("TtmlDecoder", valueOf2.length() != 0 ? "Ignoring malformed cell resolution: ".concat(valueOf2) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    private static void F(String str, o30 o30) {
        Matcher matcher;
        String[] z0 = v50.z0(str, "\\s+");
        if (z0.length == 1) {
            matcher = q.matcher(str);
        } else if (z0.length == 2) {
            matcher = q.matcher(z0[1]);
            b50.h("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length = z0.length;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(length);
            sb.append(".");
            throw new m20(sb.toString());
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            char c2 = 65535;
            int hashCode = group.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592 && group.equals("px")) {
                        c2 = 0;
                    }
                } else if (group.equals("em")) {
                    c2 = 1;
                }
            } else if (group.equals("%")) {
                c2 = 2;
            }
            if (c2 == 0) {
                o30.t(1);
            } else if (c2 == 1) {
                o30.t(2);
            } else if (c2 == 2) {
                o30.t(3);
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(group).length() + 30);
                sb2.append("Invalid unit for fontSize: '");
                sb2.append(group);
                sb2.append("'.");
                throw new m20(sb2.toString());
            }
            o30.s(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 36);
        sb3.append("Invalid expression for fontSize: '");
        sb3.append(str);
        sb3.append("'.");
        throw new m20(sb3.toString());
    }

    private b G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] z0 = v50.z0(attributeValue2, " ");
            if (z0.length == 2) {
                f = ((float) Integer.parseInt(z0[0])) / ((float) Integer.parseInt(z0[1]));
            } else {
                throw new m20("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = u.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = u.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new b(((float) parseInt) * f, i, i2);
    }

    private Map<String, o30> H(XmlPullParser xmlPullParser, Map<String, o30> map, a aVar, c cVar, Map<String, m30> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (w50.f(xmlPullParser, "style")) {
                String a2 = w50.a(xmlPullParser, "style");
                o30 L = L(xmlPullParser, new o30());
                if (a2 != null) {
                    for (String str : M(a2)) {
                        L.a(map.get(str));
                    }
                }
                if (L.g() != null) {
                    map.put(L.g(), L);
                }
            } else if (w50.f(xmlPullParser, "region")) {
                m30 K = K(xmlPullParser, aVar, cVar);
                if (K != null) {
                    map2.put(K.a, K);
                }
            } else if (w50.f(xmlPullParser, "metadata")) {
                I(xmlPullParser, map3);
            }
        } while (!w50.d(xmlPullParser, "head"));
        return map;
    }

    private void I(XmlPullParser xmlPullParser, Map<String, String> map) {
        String a2;
        do {
            xmlPullParser.next();
            if (w50.f(xmlPullParser, "image") && (a2 = w50.a(xmlPullParser, "id")) != null) {
                map.put(a2, xmlPullParser.nextText());
            }
        } while (!w50.d(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.l30 J(org.xmlpull.v1.XmlPullParser r21, defpackage.l30 r22, java.util.Map<java.lang.String, defpackage.m30> r23, defpackage.k30.b r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r21.getAttributeCount()
            r5 = 0
            o30 r11 = r0.L(r1, r5)
            java.lang.String r9 = ""
            r12 = r5
            r14 = r12
            r13 = r9
            r5 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0026:
            if (r5 >= r4) goto L_0x00c5
            java.lang.String r6 = r1.getAttributeName(r5)
            java.lang.String r7 = r1.getAttributeValue(r5)
            int r19 = r6.hashCode()
            switch(r19) {
                case -934795532: goto L_0x006a;
                case 99841: goto L_0x0060;
                case 100571: goto L_0x0056;
                case 93616297: goto L_0x004c;
                case 109780401: goto L_0x0042;
                case 1292595405: goto L_0x0038;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0074
        L_0x0038:
            java.lang.String r8 = "backgroundImage"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 5
            goto L_0x0075
        L_0x0042:
            java.lang.String r8 = "style"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 3
            goto L_0x0075
        L_0x004c:
            java.lang.String r8 = "begin"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 0
            goto L_0x0075
        L_0x0056:
            java.lang.String r8 = "end"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 1
            goto L_0x0075
        L_0x0060:
            java.lang.String r8 = "dur"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 2
            goto L_0x0075
        L_0x006a:
            java.lang.String r8 = "region"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0074
            r8 = 4
            goto L_0x0075
        L_0x0074:
            r8 = -1
        L_0x0075:
            if (r8 == 0) goto L_0x00bb
            r6 = 1
            if (r8 == r6) goto L_0x00b4
            r6 = 2
            if (r8 == r6) goto L_0x00ad
            r6 = 3
            if (r8 == r6) goto L_0x00a2
            r6 = 4
            if (r8 == r6) goto L_0x0098
            r6 = 5
            if (r8 == r6) goto L_0x0087
            goto L_0x0095
        L_0x0087:
            java.lang.String r6 = "#"
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L_0x0095
            r6 = 1
            java.lang.String r6 = r7.substring(r6)
            r14 = r6
        L_0x0095:
            r6 = r23
            goto L_0x00c1
        L_0x0098:
            r6 = r23
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x00c1
            r13 = r7
            goto L_0x00c1
        L_0x00a2:
            r6 = r23
            java.lang.String[] r7 = r0.M(r7)
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00c1
            r12 = r7
            goto L_0x00c1
        L_0x00ad:
            r6 = r23
            long r17 = N(r7, r3)
            goto L_0x00c1
        L_0x00b4:
            r6 = r23
            long r15 = N(r7, r3)
            goto L_0x00c1
        L_0x00bb:
            r6 = r23
            long r9 = N(r7, r3)
        L_0x00c1:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x00c5:
            if (r2 == 0) goto L_0x00df
            long r3 = r2.d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00e4
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00d7
            long r9 = r9 + r3
        L_0x00d7:
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00e4
            long r3 = r2.d
            long r15 = r15 + r3
            goto L_0x00e4
        L_0x00df:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e4:
            r7 = r9
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00fc
            int r3 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00f2
            long r17 = r7 + r17
            r9 = r17
            goto L_0x00fd
        L_0x00f2:
            if (r2 == 0) goto L_0x00fc
            long r2 = r2.e
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00fc
            r9 = r2
            goto L_0x00fd
        L_0x00fc:
            r9 = r15
        L_0x00fd:
            java.lang.String r6 = r21.getName()
            l30 r1 = defpackage.l30.c(r6, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k30.J(org.xmlpull.v1.XmlPullParser, l30, java.util.Map, k30$b):l30");
    }

    private m30 K(XmlPullParser xmlPullParser, a aVar, c cVar) {
        String str;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        c cVar2 = cVar;
        String a2 = w50.a(xmlPullParser2, "id");
        if (a2 == null) {
            return null;
        }
        String a3 = w50.a(xmlPullParser2, "origin");
        if (a3 != null) {
            Matcher matcher = r.matcher(a3);
            Matcher matcher2 = s.matcher(a3);
            if (matcher.matches()) {
                try {
                    float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
                    f = Float.parseFloat(matcher.group(2)) / 100.0f;
                    f2 = parseFloat;
                } catch (NumberFormatException unused) {
                    String valueOf = String.valueOf(a3);
                    b50.h("TtmlDecoder", valueOf.length() != 0 ? "Ignoring region with malformed origin: ".concat(valueOf) : new String("Ignoring region with malformed origin: "));
                    return null;
                }
            } else if (!matcher2.matches()) {
                String valueOf2 = String.valueOf(a3);
                b50.h("TtmlDecoder", valueOf2.length() != 0 ? "Ignoring region with unsupported origin: ".concat(valueOf2) : new String("Ignoring region with unsupported origin: "));
                return null;
            } else if (cVar2 == null) {
                String valueOf3 = String.valueOf(a3);
                b50.h("TtmlDecoder", valueOf3.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(valueOf3) : new String("Ignoring region with missing tts:extent: "));
                return null;
            } else {
                try {
                    int parseInt = Integer.parseInt(matcher2.group(1));
                    int parseInt2 = Integer.parseInt(matcher2.group(2));
                    f2 = ((float) parseInt) / ((float) cVar2.a);
                    f = ((float) parseInt2) / ((float) cVar2.b);
                } catch (NumberFormatException unused2) {
                    String valueOf4 = String.valueOf(a3);
                    b50.h("TtmlDecoder", valueOf4.length() != 0 ? "Ignoring region with malformed origin: ".concat(valueOf4) : new String("Ignoring region with malformed origin: "));
                    return null;
                }
            }
            String a4 = w50.a(xmlPullParser2, "extent");
            if (a4 != null) {
                Matcher matcher3 = r.matcher(a4);
                Matcher matcher4 = s.matcher(a4);
                if (matcher3.matches()) {
                    try {
                        f4 = Float.parseFloat(matcher3.group(1)) / 100.0f;
                        f3 = Float.parseFloat(matcher3.group(2)) / 100.0f;
                    } catch (NumberFormatException unused3) {
                        String valueOf5 = String.valueOf(a3);
                        b50.h("TtmlDecoder", valueOf5.length() != 0 ? "Ignoring region with malformed extent: ".concat(valueOf5) : new String("Ignoring region with malformed extent: "));
                        return null;
                    }
                } else if (!matcher4.matches()) {
                    String valueOf6 = String.valueOf(a3);
                    b50.h("TtmlDecoder", valueOf6.length() != 0 ? "Ignoring region with unsupported extent: ".concat(valueOf6) : new String("Ignoring region with unsupported extent: "));
                    return null;
                } else if (cVar2 == null) {
                    String valueOf7 = String.valueOf(a3);
                    b50.h("TtmlDecoder", valueOf7.length() != 0 ? "Ignoring region with missing tts:extent: ".concat(valueOf7) : new String("Ignoring region with missing tts:extent: "));
                    return null;
                } else {
                    try {
                        int parseInt3 = Integer.parseInt(matcher4.group(1));
                        int parseInt4 = Integer.parseInt(matcher4.group(2));
                        f4 = ((float) parseInt3) / ((float) cVar2.a);
                        f3 = ((float) parseInt4) / ((float) cVar2.b);
                    } catch (NumberFormatException unused4) {
                        String valueOf8 = String.valueOf(a3);
                        b50.h("TtmlDecoder", valueOf8.length() != 0 ? "Ignoring region with malformed extent: ".concat(valueOf8) : new String("Ignoring region with malformed extent: "));
                        return null;
                    }
                }
                String a5 = w50.a(xmlPullParser2, "displayAlign");
                if (a5 != null) {
                    String G0 = v50.G0(a5);
                    char c2 = 65535;
                    int hashCode = G0.hashCode();
                    if (hashCode != -1364013995) {
                        if (hashCode == 92734940 && G0.equals("after")) {
                            c2 = 1;
                        }
                    } else if (G0.equals("center")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        f += f3 / 2.0f;
                        i = 1;
                    } else if (c2 == 1) {
                        f += f3;
                        i = 2;
                    }
                    return new m30(a2, f2, f, 0, i, f4, f3, 1, 1.0f / ((float) aVar.a));
                }
                i = 0;
                return new m30(a2, f2, f, 0, i, f4, f3, 1, 1.0f / ((float) aVar.a));
            }
            str = "Ignoring region without an extent";
        } else {
            str = "Ignoring region without an origin";
        }
        b50.h("TtmlDecoder", str);
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.o30 L(org.xmlpull.v1.XmlPullParser r12, defpackage.o30 r13) {
        /*
            r11 = this;
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x01e4
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            int r5 = r4.hashCode()
            r6 = 4
            r7 = -1
            r8 = 2
            r9 = 3
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x006e;
                case -1224696685: goto L_0x0064;
                case -1065511464: goto L_0x005a;
                case -879295043: goto L_0x004f;
                case -734428249: goto L_0x0045;
                case 3355: goto L_0x003b;
                case 94842723: goto L_0x0031;
                case 365601008: goto L_0x0027;
                case 1287124693: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0078
        L_0x001d:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 1
            goto L_0x0079
        L_0x0027:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 4
            goto L_0x0079
        L_0x0031:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 2
            goto L_0x0079
        L_0x003b:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 0
            goto L_0x0079
        L_0x0045:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 5
            goto L_0x0079
        L_0x004f:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 8
            goto L_0x0079
        L_0x005a:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 7
            goto L_0x0079
        L_0x0064:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 3
            goto L_0x0079
        L_0x006e:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0078
            r4 = 6
            goto L_0x0079
        L_0x0078:
            r4 = -1
        L_0x0079:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x01cd;
                case 1: goto L_0x01ad;
                case 2: goto L_0x018d;
                case 3: goto L_0x0185;
                case 4: goto L_0x0161;
                case 5: goto L_0x0152;
                case 6: goto L_0x0143;
                case 7: goto L_0x00e1;
                case 8: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x01e0
        L_0x0080:
            java.lang.String r3 = defpackage.v50.G0(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x00aa;
                case -1026963764: goto L_0x00a0;
                case 913457136: goto L_0x0096;
                case 1679736913: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x00b3
        L_0x008c:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b3
            r7 = 0
            goto L_0x00b3
        L_0x0096:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b3
            r7 = 1
            goto L_0x00b3
        L_0x00a0:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b3
            r7 = 2
            goto L_0x00b3
        L_0x00aa:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00b3
            r7 = 3
        L_0x00b3:
            if (r7 == 0) goto L_0x00d8
            if (r7 == r10) goto L_0x00cf
            if (r7 == r8) goto L_0x00c6
            if (r7 == r9) goto L_0x00bd
            goto L_0x01e0
        L_0x00bd:
            o30 r13 = r11.C(r13)
            r13.y(r1)
            goto L_0x01e0
        L_0x00c6:
            o30 r13 = r11.C(r13)
            r13.y(r10)
            goto L_0x01e0
        L_0x00cf:
            o30 r13 = r11.C(r13)
            r13.w(r1)
            goto L_0x01e0
        L_0x00d8:
            o30 r13 = r11.C(r13)
            r13.w(r10)
            goto L_0x01e0
        L_0x00e1:
            java.lang.String r3 = defpackage.v50.G0(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x0115;
                case 100571: goto L_0x010b;
                case 3317767: goto L_0x0101;
                case 108511772: goto L_0x00f7;
                case 109757538: goto L_0x00ed;
                default: goto L_0x00ec;
            }
        L_0x00ec:
            goto L_0x011e
        L_0x00ed:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 1
            goto L_0x011e
        L_0x00f7:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 2
            goto L_0x011e
        L_0x0101:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 0
            goto L_0x011e
        L_0x010b:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 3
            goto L_0x011e
        L_0x0115:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x011e
            r7 = 4
        L_0x011e:
            if (r7 == 0) goto L_0x0138
            if (r7 == r10) goto L_0x0138
            if (r7 == r8) goto L_0x0131
            if (r7 == r9) goto L_0x0131
            if (r7 == r6) goto L_0x012a
            goto L_0x01e0
        L_0x012a:
            o30 r13 = r11.C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x013e
        L_0x0131:
            o30 r13 = r11.C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x013e
        L_0x0138:
            o30 r13 = r11.C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x013e:
            r13.x(r3)
            goto L_0x01e0
        L_0x0143:
            o30 r13 = r11.C(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.v(r3)
            goto L_0x01e0
        L_0x0152:
            o30 r13 = r11.C(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r13.p(r3)
            goto L_0x01e0
        L_0x0161:
            o30 r13 = r11.C(r13)     // Catch:{ m20 -> 0x016a }
            F(r3, r13)     // Catch:{ m20 -> 0x016a }
            goto L_0x01e0
        L_0x016a:
            java.lang.String r4 = "Failed parsing fontSize value: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x017c
        L_0x0177:
            java.lang.String r3 = r4.concat(r3)
            goto L_0x0181
        L_0x017c:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
        L_0x0181:
            defpackage.b50.h(r5, r3)
            goto L_0x01e0
        L_0x0185:
            o30 r13 = r11.C(r13)
            r13.r(r3)
            goto L_0x01e0
        L_0x018d:
            o30 r13 = r11.C(r13)
            int r4 = defpackage.t40.d(r3)     // Catch:{ IllegalArgumentException -> 0x0199 }
            r13.q(r4)     // Catch:{ IllegalArgumentException -> 0x0199 }
            goto L_0x01e0
        L_0x0199:
            java.lang.String r4 = "Failed parsing color value: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x01a7
            goto L_0x0177
        L_0x01a7:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x0181
        L_0x01ad:
            o30 r13 = r11.C(r13)
            int r4 = defpackage.t40.d(r3)     // Catch:{ IllegalArgumentException -> 0x01b9 }
            r13.o(r4)     // Catch:{ IllegalArgumentException -> 0x01b9 }
            goto L_0x01e0
        L_0x01b9:
            java.lang.String r4 = "Failed parsing background value: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x01c7
            goto L_0x0177
        L_0x01c7:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x0181
        L_0x01cd:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01e0
            o30 r13 = r11.C(r13)
            r13.u(r3)
        L_0x01e0:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x01e4:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k30.L(org.xmlpull.v1.XmlPullParser, o30):o30");
    }

    private String[] M(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : v50.z0(trim, "\\s+");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bc, code lost:
        if (r14.equals("s") != false) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long N(java.lang.String r14, defpackage.k30.b r15) {
        /*
            java.util.regex.Pattern r0 = o
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0076
            java.lang.String r14 = r0.group(r8)
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x0048
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x0049
        L_0x0048:
            r10 = r5
        L_0x0049:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x005a
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.a
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x005b
        L_0x005a:
            r10 = r5
        L_0x005b:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x0071
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.b
            double r4 = (double) r14
            double r0 = r0 / r4
            float r14 = r15.a
            double r14 = (double) r14
            double r5 = r0 / r14
        L_0x0071:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x0076:
            java.util.regex.Pattern r0 = p
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x0110
            java.lang.String r14 = r0.group(r8)
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            r0 = -1
            int r1 = r14.hashCode()
            r11 = 102(0x66, float:1.43E-43)
            if (r1 == r11) goto L_0x00dd
            r11 = 104(0x68, float:1.46E-43)
            if (r1 == r11) goto L_0x00d3
            r11 = 109(0x6d, float:1.53E-43)
            if (r1 == r11) goto L_0x00c9
            r11 = 3494(0xda6, float:4.896E-42)
            if (r1 == r11) goto L_0x00bf
            r11 = 115(0x73, float:1.61E-43)
            if (r1 == r11) goto L_0x00b6
            r7 = 116(0x74, float:1.63E-43)
            if (r1 == r7) goto L_0x00ac
            goto L_0x00e7
        L_0x00ac:
            java.lang.String r1 = "t"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e7
            r7 = 5
            goto L_0x00e8
        L_0x00b6:
            java.lang.String r1 = "s"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00bf:
            java.lang.String r1 = "ms"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e7
            r7 = 3
            goto L_0x00e8
        L_0x00c9:
            java.lang.String r1 = "m"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e7
            r7 = 1
            goto L_0x00e8
        L_0x00d3:
            java.lang.String r1 = "h"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e7
            r7 = 0
            goto L_0x00e8
        L_0x00dd:
            java.lang.String r1 = "f"
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00e7
            r7 = 4
            goto L_0x00e8
        L_0x00e7:
            r7 = -1
        L_0x00e8:
            if (r7 == 0) goto L_0x0105
            if (r7 == r8) goto L_0x0102
            if (r7 == r6) goto L_0x00fb
            if (r7 == r5) goto L_0x00f7
            if (r7 == r4) goto L_0x00f3
            goto L_0x010c
        L_0x00f3:
            int r14 = r15.c
            double r14 = (double) r14
            goto L_0x0100
        L_0x00f7:
            float r14 = r15.a
            double r14 = (double) r14
            goto L_0x0100
        L_0x00fb:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x0100:
            double r9 = r9 / r14
            goto L_0x010c
        L_0x0102:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x010a
        L_0x0105:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x010a:
            double r9 = r9 * r14
        L_0x010c:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x0110:
            m20 r15 = new m20
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r14 = java.lang.String.valueOf(r14)
            int r1 = r14.length()
            if (r1 == 0) goto L_0x0123
            java.lang.String r14 = r0.concat(r14)
            goto L_0x0128
        L_0x0123:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r0)
        L_0x0128:
            r15.<init>((java.lang.String) r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k30.N(java.lang.String, k30$b):long");
    }

    private c O(XmlPullParser xmlPullParser) {
        String a2 = w50.a(xmlPullParser, "extent");
        if (a2 == null) {
            return null;
        }
        Matcher matcher = s.matcher(a2);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(a2);
            b50.h("TtmlDecoder", valueOf.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(valueOf) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
        } catch (NumberFormatException unused) {
            String valueOf2 = String.valueOf(a2);
            b50.h("TtmlDecoder", valueOf2.length() != 0 ? "Ignoring malformed tts extent: ".concat(valueOf2) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public k20 z(byte[] bArr, int i, boolean z) {
        p30 p30;
        b bVar;
        try {
            XmlPullParser newPullParser = this.n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            c cVar = null;
            hashMap2.put("", new m30((String) null));
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = u;
            a aVar = v;
            p30 p302 = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                l30 l30 = (l30) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = G(newPullParser);
                            aVar = E(newPullParser, v);
                            cVar = O(newPullParser);
                        }
                        c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (!D(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            b50.f("TtmlDecoder", valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i2++;
                            bVar2 = bVar3;
                            cVar = cVar2;
                            aVar = aVar2;
                            newPullParser.next();
                        } else {
                            if ("head".equals(name)) {
                                p30 = p302;
                                bVar = bVar3;
                                H(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                p30 = p302;
                                bVar = bVar3;
                                try {
                                    l30 J = J(newPullParser, l30, hashMap2, bVar);
                                    arrayDeque.push(J);
                                    if (l30 != null) {
                                        l30.a(J);
                                    }
                                } catch (m20 e) {
                                    b50.i("TtmlDecoder", "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar2 = bVar;
                            cVar = cVar2;
                            aVar = aVar2;
                        }
                    } else {
                        p30 = p302;
                        if (eventType == 4) {
                            l30.a(l30.d(newPullParser.getText()));
                        } else if (eventType == 3) {
                            p302 = newPullParser.getName().equals("tt") ? new p30((l30) arrayDeque.peek(), hashMap, hashMap2, hashMap3) : p30;
                            arrayDeque.pop();
                            newPullParser.next();
                        }
                    }
                } else {
                    p30 = p302;
                    if (eventType == 2) {
                        i2++;
                    } else if (eventType == 3) {
                        i2--;
                    }
                }
                p302 = p30;
                newPullParser.next();
            }
            return p302;
        } catch (XmlPullParserException e2) {
            throw new m20("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
