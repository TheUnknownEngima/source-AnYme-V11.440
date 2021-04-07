package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.upstream.w;
import defpackage.ns;
import defpackage.p10;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: i10  reason: default package */
public class i10 extends DefaultHandler implements w.a<h10> {
    private static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern c = Pattern.compile("CC([1-4])=.*");
    private static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private final XmlPullParserFactory a;

    /* renamed from: i10$a */
    protected static final class a {
        public final f0 a;
        public final String b;
        public final p10 c;
        public final String d;
        public final ArrayList<ns.b> e;
        public final ArrayList<j10> f;
        public final long g;

        public a(f0 f0Var, String str, p10 p10, String str2, ArrayList<ns.b> arrayList, ArrayList<j10> arrayList2, long j) {
            this.a = f0Var;
            this.b = str;
            this.c = p10;
            this.d = str2;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = j;
        }
    }

    public i10() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    protected static int B(List<j10> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            j10 j10 = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(j10.a) && (str = j10.b) != null) {
                Matcher matcher = c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String valueOf = String.valueOf(j10.b);
                b50.h("MpdParser", valueOf.length() != 0 ? "Unable to parse CEA-608 channel number from: ".concat(valueOf) : new String("Unable to parse CEA-608 channel number from: "));
            }
        }
        return -1;
    }

    protected static int C(List<j10> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            j10 j10 = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(j10.a) && (str = j10.b) != null) {
                Matcher matcher = d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                String valueOf = String.valueOf(j10.b);
                b50.h("MpdParser", valueOf.length() != 0 ? "Unable to parse CEA-708 service block number from: ".concat(valueOf) : new String("Unable to parse CEA-708 service block number from: "));
            }
        }
        return -1;
    }

    protected static long G(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : v50.r0(attributeValue);
    }

    protected static j10 H(XmlPullParser xmlPullParser, String str) {
        String i0 = i0(xmlPullParser, "schemeIdUri", "");
        String i02 = i0(xmlPullParser, "value", (String) null);
        String i03 = i0(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!w50.d(xmlPullParser, str));
        return new j10(i0, i02, i03);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static int I(org.xmlpull.v1.XmlPullParser r5) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r5 = r5.getAttributeValue(r0, r1)
            java.lang.String r5 = defpackage.v50.G0(r5)
            r0 = -1
            if (r5 != 0) goto L_0x000f
            return r0
        L_0x000f:
            int r1 = r5.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case 1596796: goto L_0x0038;
                case 2937391: goto L_0x002e;
                case 3094035: goto L_0x0024;
                case 3133436: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0042
        L_0x001a:
            java.lang.String r1 = "fa01"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = 3
            goto L_0x0043
        L_0x0024:
            java.lang.String r1 = "f801"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = 2
            goto L_0x0043
        L_0x002e:
            java.lang.String r1 = "a000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0038:
            java.lang.String r1 = "4000"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0042
            r5 = 0
            goto L_0x0043
        L_0x0042:
            r5 = -1
        L_0x0043:
            if (r5 == 0) goto L_0x0052
            if (r5 == r4) goto L_0x0051
            if (r5 == r3) goto L_0x004f
            if (r5 == r2) goto L_0x004c
            return r0
        L_0x004c:
            r5 = 8
            return r5
        L_0x004f:
            r5 = 6
            return r5
        L_0x0051:
            return r3
        L_0x0052:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i10.I(org.xmlpull.v1.XmlPullParser):int");
    }

    protected static long J(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : v50.s0(attributeValue);
    }

    protected static String K(List<j10> list) {
        for (int i = 0; i < list.size(); i++) {
            j10 j10 = list.get(i);
            String str = j10.a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(j10.b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(j10.b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float O(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        float f2 = (float) parseInt;
        return !TextUtils.isEmpty(group) ? f2 / ((float) Integer.parseInt(group)) : f2;
    }

    protected static int Q(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    protected static long S(List<j10> list) {
        for (int i = 0; i < list.size(); i++) {
            j10 j10 = list.get(i);
            if ("http://dashif.org/guidelines/last-segment-number".equalsIgnoreCase(j10.a)) {
                return Long.parseLong(j10.b);
            }
        }
        return -1;
    }

    protected static long T(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    private long b(List<p10.d> list, long j, long j2, int i, long j3) {
        int j4 = i >= 0 ? i + 1 : (int) v50.j(j3 - j, j2);
        for (int i2 = 0; i2 < j4; i2++) {
            list.add(m(j, j2));
            j += j2;
        }
        return j;
    }

    protected static String i0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static String j0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                u(xmlPullParser);
            }
        } while (!w50.d(xmlPullParser, str));
        return str2;
    }

    private static int p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        q40.f(i == i2);
        return i;
    }

    private static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        q40.f(str.equals(str2));
        return str;
    }

    private static void r(ArrayList<ns.b> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ns.b bVar = arrayList.get(size);
            if (!bVar.d()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i).b(bVar)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    private static String t(String str, String str2) {
        if (e50.l(str)) {
            return e50.b(str2);
        }
        if (e50.n(str)) {
            return e50.k(str2);
        }
        if (v(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if (str2 != null) {
                if (str2.startsWith("stpp")) {
                    return "application/ttml+xml";
                }
                if (str2.startsWith("wvtt")) {
                    return "application/x-mp4-vtt";
                }
            }
        } else if ("application/x-rawcc".equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return "application/cea-708";
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return "application/cea-608";
            }
        }
        return null;
    }

    public static void u(XmlPullParser xmlPullParser) {
        if (w50.e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (w50.e(xmlPullParser)) {
                    i++;
                } else if (w50.c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    private static boolean v(String str) {
        return e50.m(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    /* access modifiers changed from: protected */
    public String A(XmlPullParser xmlPullParser, String str) {
        return u50.c(str, j0(xmlPullParser, "BaseURL"));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, defpackage.ns.b> D(org.xmlpull.v1.XmlPullParser r10) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0095
            java.lang.String r1 = defpackage.v50.G0(r1)
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 489446379(0x1d2c5beb, float:2.281153E-21)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L_0x0039
            r5 = 755418770(0x2d06c692, float:7.66111E-12)
            if (r4 == r5) goto L_0x002f
            r5 = 1812765994(0x6c0c9d2a, float:6.799672E26)
            if (r4 == r5) goto L_0x0025
            goto L_0x0042
        L_0x0025:
            java.lang.String r4 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0042
            r3 = 0
            goto L_0x0042
        L_0x002f:
            java.lang.String r4 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0042
            r3 = 2
            goto L_0x0042
        L_0x0039:
            java.lang.String r4 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0042
            r3 = 1
        L_0x0042:
            if (r3 == 0) goto L_0x0050
            if (r3 == r7) goto L_0x004c
            if (r3 == r6) goto L_0x0049
            goto L_0x0095
        L_0x0049:
            java.util.UUID r1 = com.google.android.exoplayer2.v.d
            goto L_0x004e
        L_0x004c:
            java.util.UUID r1 = com.google.android.exoplayer2.v.e
        L_0x004e:
            r3 = r0
            goto L_0x0097
        L_0x0050:
            java.lang.String r1 = "value"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            java.lang.String r3 = "default_KID"
            java.lang.String r3 = defpackage.w50.b(r10, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0090
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0090
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = 0
        L_0x0074:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x0082
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0074
        L_0x0082:
            java.util.UUID r3 = com.google.android.exoplayer2.v.b
            byte[] r3 = defpackage.jv.b(r3, r4, r0)
            java.util.UUID r4 = com.google.android.exoplayer2.v.b
            r5 = r0
            r8 = r3
            r3 = r1
            r1 = r4
            r4 = r8
            goto L_0x0099
        L_0x0090:
            r4 = r0
            r5 = r4
            r3 = r1
            r1 = r5
            goto L_0x0099
        L_0x0095:
            r1 = r0
            r3 = r1
        L_0x0097:
            r4 = r3
            r5 = r4
        L_0x0099:
            r10.next()
            java.lang.String r6 = "ms:laurl"
            boolean r6 = defpackage.w50.f(r10, r6)
            if (r6 == 0) goto L_0x00ab
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r10.getAttributeValue(r0, r5)
            goto L_0x0102
        L_0x00ab:
            r6 = 4
            if (r4 != 0) goto L_0x00d8
            java.lang.String r7 = "pssh"
            boolean r7 = defpackage.w50.g(r10, r7)
            if (r7 == 0) goto L_0x00d8
            int r7 = r10.next()
            if (r7 != r6) goto L_0x00d8
            java.lang.String r1 = r10.getText()
            byte[] r1 = android.util.Base64.decode(r1, r2)
            java.util.UUID r4 = defpackage.jv.d(r1)
            if (r4 != 0) goto L_0x00d4
            java.lang.String r1 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            defpackage.b50.h(r1, r6)
            r1 = r4
            r4 = r0
            goto L_0x0102
        L_0x00d4:
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x0102
        L_0x00d8:
            if (r4 != 0) goto L_0x00ff
            java.util.UUID r7 = com.google.android.exoplayer2.v.e
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00ff
            java.lang.String r7 = "mspr:pro"
            boolean r7 = defpackage.w50.f(r10, r7)
            if (r7 == 0) goto L_0x00ff
            int r7 = r10.next()
            if (r7 != r6) goto L_0x00ff
            java.util.UUID r4 = com.google.android.exoplayer2.v.e
            java.lang.String r6 = r10.getText()
            byte[] r6 = android.util.Base64.decode(r6, r2)
            byte[] r4 = defpackage.jv.a(r4, r6)
            goto L_0x0102
        L_0x00ff:
            u(r10)
        L_0x0102:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = defpackage.w50.d(r10, r6)
            if (r6 == 0) goto L_0x0099
            if (r1 == 0) goto L_0x0113
            ns$b r0 = new ns$b
            java.lang.String r10 = "video/mp4"
            r0.<init>(r1, r5, r10, r4)
        L_0x0113:
            android.util.Pair r10 = android.util.Pair.create(r3, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i10.D(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* access modifiers changed from: protected */
    public int E(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    /* access modifiers changed from: protected */
    public int F(String str) {
        if (str == null) {
            return 0;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c2 = 7;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c2 = 9;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c2 = 10;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c2 = 1;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c2 = 8;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c2 = 6;
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c2 = 3;
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 2048;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    public Pair<Long, fy> L(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long T = T(xmlPullParser2, "id", 0);
        long T2 = T(xmlPullParser2, "duration", -9223372036854775807L);
        long T3 = T(xmlPullParser2, "presentationTime", 0);
        long w0 = v50.w0(T2, 1000, j);
        long w02 = v50.w0(T3, 1000000, j);
        String i0 = i0(xmlPullParser2, "messageData", (String) null);
        byte[] M = M(xmlPullParser2, byteArrayOutputStream);
        Long valueOf = Long.valueOf(w02);
        if (i0 != null) {
            M = v50.Z(i0);
        }
        return Pair.create(valueOf, d(str, str2, T, w0, M));
    }

    /* access modifiers changed from: protected */
    public byte[] M(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, "UTF-8");
        while (true) {
            xmlPullParser.nextToken();
            if (!w50.d(xmlPullParser, "Event")) {
                switch (xmlPullParser.getEventType()) {
                    case 0:
                        newSerializer.startDocument((String) null, Boolean.FALSE);
                        break;
                    case 1:
                        newSerializer.endDocument();
                        break;
                    case 2:
                        newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                            newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                        }
                        break;
                    case 3:
                        newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                        break;
                    case 4:
                        newSerializer.text(xmlPullParser.getText());
                        break;
                    case 5:
                        newSerializer.cdsect(xmlPullParser.getText());
                        break;
                    case 6:
                        newSerializer.entityRef(xmlPullParser.getText());
                        break;
                    case 7:
                        newSerializer.ignorableWhitespace(xmlPullParser.getText());
                        break;
                    case 8:
                        newSerializer.processingInstruction(xmlPullParser.getText());
                        break;
                    case 9:
                        newSerializer.comment(xmlPullParser.getText());
                        break;
                    case 10:
                        newSerializer.docdecl(xmlPullParser.getText());
                        break;
                }
            } else {
                newSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* access modifiers changed from: protected */
    public k10 N(XmlPullParser xmlPullParser) {
        String i0 = i0(xmlPullParser, "schemeIdUri", "");
        String i02 = i0(xmlPullParser, "value", "");
        long T = T(xmlPullParser, "timescale", 1);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (w50.f(xmlPullParser, "Event")) {
                arrayList.add(L(xmlPullParser, i0, i02, T, byteArrayOutputStream));
            } else {
                u(xmlPullParser);
            }
        } while (!w50.d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        fy[] fyVarArr = new fy[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            fyVarArr[i] = (fy) pair.second;
        }
        return e(i0, i02, T, jArr, fyVarArr);
    }

    /* access modifiers changed from: protected */
    public n10 P(XmlPullParser xmlPullParser) {
        return X(xmlPullParser, "sourceURL", "range");
    }

    /* access modifiers changed from: protected */
    public String R(XmlPullParser xmlPullParser) {
        return j0(xmlPullParser, "Label");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0179 A[LOOP:0: B:15:0x0069->B:62:0x0179, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.h10 U(org.xmlpull.v1.XmlPullParser r34, java.lang.String r35) {
        /*
            r33 = this;
            r14 = r33
            r0 = r34
            java.lang.String r1 = "availabilityStartTime"
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r4 = G(r0, r1, r2)
            java.lang.String r1 = "mediaPresentationDuration"
            long r6 = J(r0, r1, r2)
            java.lang.String r1 = "minBufferTime"
            long r8 = J(r0, r1, r2)
            r1 = 0
            java.lang.String r10 = "type"
            java.lang.String r10 = r0.getAttributeValue(r1, r10)
            java.lang.String r11 = "dynamic"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0031
            java.lang.String r11 = "minimumUpdatePeriod"
            long r11 = J(r0, r11, r2)
            goto L_0x0032
        L_0x0031:
            r11 = r2
        L_0x0032:
            if (r10 == 0) goto L_0x003b
            java.lang.String r13 = "timeShiftBufferDepth"
            long r15 = J(r0, r13, r2)
            goto L_0x003c
        L_0x003b:
            r15 = r2
        L_0x003c:
            if (r10 == 0) goto L_0x0045
            java.lang.String r13 = "suggestedPresentationDelay"
            long r17 = J(r0, r13, r2)
            goto L_0x0047
        L_0x0045:
            r17 = r2
        L_0x0047:
            java.lang.String r13 = "publishTime"
            long r19 = G(r0, r13, r2)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            if (r10 == 0) goto L_0x0057
            r21 = r2
            goto L_0x0059
        L_0x0057:
            r21 = 0
        L_0x0059:
            r23 = 0
            r23 = r1
            r2 = r21
            r26 = 0
            r27 = 0
            r1 = r35
            r21 = r23
            r22 = r21
        L_0x0069:
            r34.next()
            r28 = r15
            java.lang.String r15 = "BaseURL"
            boolean r15 = defpackage.w50.f(r0, r15)
            r16 = 1
            if (r15 == 0) goto L_0x0088
            if (r26 != 0) goto L_0x0082
            java.lang.String r1 = r14.A(r0, r1)
            r26 = 1
            goto L_0x012d
        L_0x0082:
            r35 = r1
            r30 = r2
            goto L_0x0129
        L_0x0088:
            java.lang.String r15 = "ProgramInformation"
            boolean r15 = defpackage.w50.f(r0, r15)
            if (r15 == 0) goto L_0x0098
            m10 r15 = r33.W(r34)
            r21 = r15
            goto L_0x012d
        L_0x0098:
            java.lang.String r15 = "UTCTiming"
            boolean r15 = defpackage.w50.f(r0, r15)
            if (r15 == 0) goto L_0x00a8
            s10 r15 = r33.m0(r34)
            r22 = r15
            goto L_0x012d
        L_0x00a8:
            java.lang.String r15 = "Location"
            boolean r15 = defpackage.w50.f(r0, r15)
            if (r15 == 0) goto L_0x00bc
            java.lang.String r15 = r34.nextText()
            android.net.Uri r15 = android.net.Uri.parse(r15)
            r23 = r15
            goto L_0x012d
        L_0x00bc:
            java.lang.String r15 = "Period"
            boolean r15 = defpackage.w50.f(r0, r15)
            if (r15 == 0) goto L_0x0122
            if (r27 != 0) goto L_0x0122
            android.util.Pair r15 = r14.V(r0, r1, r2)
            r35 = r1
            java.lang.Object r1 = r15.first
            l10 r1 = (defpackage.l10) r1
            r30 = r2
            long r2 = r1.b
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r32 = (r2 > r24 ? 1 : (r2 == r24 ? 0 : -1))
            if (r32 != 0) goto L_0x0101
            if (r10 == 0) goto L_0x00e4
            r2 = r30
            r27 = 1
            goto L_0x011f
        L_0x00e4:
            com.google.android.exoplayer2.m0 r0 = new com.google.android.exoplayer2.m0
            int r1 = r13.size()
            r2 = 47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unable to determine start of period "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0101:
            java.lang.Object r2 = r15.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r30 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r30 != 0) goto L_0x0118
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x011c
        L_0x0118:
            long r14 = r1.b
            long r14 = r14 + r2
            r2 = r14
        L_0x011c:
            r13.add(r1)
        L_0x011f:
            r1 = r35
            goto L_0x012d
        L_0x0122:
            r35 = r1
            r30 = r2
            u(r34)
        L_0x0129:
            r1 = r35
            r2 = r30
        L_0x012d:
            java.lang.String r14 = "MPD"
            boolean r14 = defpackage.w50.d(r0, r14)
            if (r14 == 0) goto L_0x0179
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x014f
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0144
            r6 = r2
            goto L_0x014f
        L_0x0144:
            if (r10 == 0) goto L_0x0147
            goto L_0x014f
        L_0x0147:
            com.google.android.exoplayer2.m0 r0 = new com.google.android.exoplayer2.m0
            java.lang.String r1 = "Unable to determine duration of static manifest."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x014f:
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0171
            r0 = r33
            r1 = r4
            r3 = r6
            r5 = r8
            r7 = r10
            r8 = r11
            r10 = r28
            r24 = r13
            r12 = r17
            r14 = r19
            r16 = r21
            r17 = r22
            r18 = r23
            r19 = r24
            h10 r0 = r0.g(r1, r3, r5, r7, r8, r10, r12, r14, r16, r17, r18, r19)
            return r0
        L_0x0171:
            com.google.android.exoplayer2.m0 r0 = new com.google.android.exoplayer2.m0
            java.lang.String r1 = "No periods found."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0179:
            r14 = r33
            r15 = r28
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i10.U(org.xmlpull.v1.XmlPullParser, java.lang.String):h10");
    }

    /* access modifiers changed from: protected */
    public Pair<l10, Long> V(XmlPullParser xmlPullParser, String str, long j) {
        String str2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "id");
        long J = J(xmlPullParser2, "start", j);
        long J2 = J(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str3 = str;
        p10 p10 = null;
        j10 j10 = null;
        boolean z = false;
        do {
            xmlPullParser.next();
            if (w50.f(xmlPullParser2, "BaseURL")) {
                if (!z) {
                    str3 = A(xmlPullParser2, str3);
                    z = true;
                } else {
                    str2 = str3;
                }
            } else if (w50.f(xmlPullParser2, "AdaptationSet")) {
                str2 = str3;
                arrayList.add(x(xmlPullParser, str3, p10, J2));
            } else {
                str2 = str3;
                if (w50.f(xmlPullParser2, "EventStream")) {
                    arrayList2.add(N(xmlPullParser));
                } else if (w50.f(xmlPullParser2, "SegmentBase")) {
                    p10 = c0(xmlPullParser2, (p10.e) null);
                } else if (w50.f(xmlPullParser2, "SegmentList")) {
                    p10 = d0(xmlPullParser2, (p10.b) null, J2);
                } else if (w50.f(xmlPullParser2, "SegmentTemplate")) {
                    p10 = e0(xmlPullParser, (p10.c) null, Collections.emptyList(), J2);
                } else if (w50.f(xmlPullParser2, "AssetIdentifier")) {
                    j10 = H(xmlPullParser2, "AssetIdentifier");
                } else {
                    u(xmlPullParser);
                }
            }
            str3 = str2;
        } while (!w50.d(xmlPullParser2, "Period"));
        return Pair.create(h(attributeValue, J, arrayList, arrayList2, j10), Long.valueOf(J2));
    }

    /* access modifiers changed from: protected */
    public m10 W(XmlPullParser xmlPullParser) {
        String str = null;
        String i0 = i0(xmlPullParser, "moreInformationURL", (String) null);
        String i02 = i0(xmlPullParser, "lang", (String) null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (w50.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (w50.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (w50.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                u(xmlPullParser);
            }
            String str4 = str3;
            if (w50.d(xmlPullParser, "ProgramInformation")) {
                return new m10(str, str2, str4, i0, i02);
            }
            str3 = str4;
        }
    }

    /* access modifiers changed from: protected */
    public n10 X(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return i(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return i(attributeValue, j2, j);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019e A[LOOP:0: B:1:0x0064->B:48:0x019e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015a A[EDGE_INSN: B:49:0x015a->B:42:0x015a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.i10.a Y(org.xmlpull.v1.XmlPullParser r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, int r31, float r32, int r33, int r34, java.lang.String r35, java.util.List<defpackage.j10> r36, java.util.List<defpackage.j10> r37, java.util.List<defpackage.j10> r38, java.util.List<defpackage.j10> r39, defpackage.p10 r40, long r41) {
        /*
            r25 = this;
            r15 = r25
            r0 = r26
            r1 = 0
            java.lang.String r2 = "id"
            java.lang.String r2 = r0.getAttributeValue(r1, r2)
            java.lang.String r3 = "bandwidth"
            r4 = -1
            int r8 = Q(r0, r3, r4)
            java.lang.String r3 = "mimeType"
            r4 = r28
            java.lang.String r3 = i0(r0, r3, r4)
            java.lang.String r4 = "codecs"
            r5 = r29
            java.lang.String r12 = i0(r0, r4, r5)
            java.lang.String r4 = "width"
            r5 = r30
            int r4 = Q(r0, r4, r5)
            java.lang.String r5 = "height"
            r6 = r31
            int r5 = Q(r0, r5, r6)
            r6 = r32
            float r6 = O(r0, r6)
            java.lang.String r7 = "audioSamplingRate"
            r9 = r34
            int r7 = Q(r0, r7, r9)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r9 = r38
            r11.<init>(r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r9 = r39
            r10.<init>(r9)
            r16 = 0
            r16 = r33
            r17 = r40
            r18 = r1
            r19 = 0
            r1 = r27
        L_0x0064:
            r26.next()
            java.lang.String r9 = "BaseURL"
            boolean r9 = defpackage.w50.f(r0, r9)
            if (r9 == 0) goto L_0x008e
            if (r19 != 0) goto L_0x0084
            java.lang.String r1 = r15.A(r0, r1)
            r9 = 1
            r34 = r7
            r20 = r8
            r9 = r16
            r19 = 1
        L_0x007e:
            r7 = r41
        L_0x0080:
            r16 = r1
            goto L_0x0152
        L_0x0084:
            r27 = r1
            r34 = r7
            r20 = r8
            r7 = r41
            goto L_0x014e
        L_0x008e:
            java.lang.String r9 = "AudioChannelConfiguration"
            boolean r9 = defpackage.w50.f(r0, r9)
            if (r9 == 0) goto L_0x00a4
            int r9 = r25.z(r26)
            r16 = r1
            r34 = r7
            r20 = r8
            r7 = r41
            goto L_0x0152
        L_0x00a4:
            java.lang.String r9 = "SegmentBase"
            boolean r9 = defpackage.w50.f(r0, r9)
            if (r9 == 0) goto L_0x00bd
            r9 = r17
            p10$e r9 = (defpackage.p10.e) r9
            p10$e r9 = r15.c0(r0, r9)
            r34 = r7
            r20 = r8
            r17 = r9
            r9 = r16
            goto L_0x007e
        L_0x00bd:
            java.lang.String r9 = "SegmentList"
            boolean r9 = defpackage.w50.f(r0, r9)
            if (r9 == 0) goto L_0x00d8
            r9 = r17
            p10$b r9 = (defpackage.p10.b) r9
            r34 = r7
            r20 = r8
            r7 = r41
            p10$b r9 = r15.d0(r0, r9, r7)
        L_0x00d3:
            r17 = r9
            r9 = r16
            goto L_0x0080
        L_0x00d8:
            r34 = r7
            r20 = r8
            r7 = r41
            java.lang.String r9 = "SegmentTemplate"
            boolean r9 = defpackage.w50.f(r0, r9)
            if (r9 == 0) goto L_0x00f9
            r9 = r17
            p10$c r9 = (defpackage.p10.c) r9
            r27 = r25
            r28 = r26
            r29 = r9
            r30 = r39
            r31 = r41
            p10$c r9 = r27.e0(r28, r29, r30, r31)
            goto L_0x00d3
        L_0x00f9:
            java.lang.String r9 = "ContentProtection"
            boolean r9 = defpackage.w50.f(r0, r9)
            if (r9 == 0) goto L_0x0119
            android.util.Pair r9 = r25.D(r26)
            r27 = r1
            java.lang.Object r1 = r9.first
            if (r1 == 0) goto L_0x010f
            r18 = r1
            java.lang.String r18 = (java.lang.String) r18
        L_0x010f:
            java.lang.Object r1 = r9.second
            if (r1 == 0) goto L_0x014e
            ns$b r1 = (defpackage.ns.b) r1
            r14.add(r1)
            goto L_0x014e
        L_0x0119:
            r27 = r1
            java.lang.String r1 = "InbandEventStream"
            boolean r9 = defpackage.w50.f(r0, r1)
            if (r9 == 0) goto L_0x012b
            j10 r1 = H(r0, r1)
            r13.add(r1)
            goto L_0x014e
        L_0x012b:
            java.lang.String r1 = "EssentialProperty"
            boolean r9 = defpackage.w50.f(r0, r1)
            if (r9 == 0) goto L_0x013b
            j10 r1 = H(r0, r1)
            r11.add(r1)
            goto L_0x014e
        L_0x013b:
            java.lang.String r1 = "SupplementalProperty"
            boolean r9 = defpackage.w50.f(r0, r1)
            if (r9 == 0) goto L_0x014b
            j10 r1 = H(r0, r1)
            r10.add(r1)
            goto L_0x014e
        L_0x014b:
            u(r26)
        L_0x014e:
            r9 = r16
            r16 = r27
        L_0x0152:
            java.lang.String r1 = "Representation"
            boolean r1 = defpackage.w50.d(r0, r1)
            if (r1 == 0) goto L_0x019e
            r0 = r25
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r9
            r7 = r34
            r8 = r20
            r9 = r35
            r21 = r10
            r10 = r36
            r22 = r11
            r11 = r37
            r23 = r13
            r13 = r22
            r24 = r14
            r14 = r21
            com.google.android.exoplayer2.f0 r0 = r0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r17 == 0) goto L_0x0181
            r1 = r17
            goto L_0x0186
        L_0x0181:
            p10$e r1 = new p10$e
            r1.<init>()
        L_0x0186:
            i10$a r2 = new i10$a
            r3 = -1
            r26 = r2
            r27 = r0
            r28 = r16
            r29 = r1
            r30 = r18
            r31 = r24
            r32 = r23
            r33 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            return r2
        L_0x019e:
            r7 = r34
            r1 = r16
            r8 = r20
            r16 = r9
            r9 = r39
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i10.Y(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, p10, long):i10$a");
    }

    /* access modifiers changed from: protected */
    public int Z(List<j10> list) {
        int k0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            j10 j10 = list.get(i2);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(j10.a)) {
                k0 = F(j10.b);
            } else if ("urn:tva:metadata:cs:AudioPurposeCS:2007".equalsIgnoreCase(j10.a)) {
                k0 = k0(j10.b);
            }
            i |= k0;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public int a0(List<j10> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if ("http://dashif.org/guidelines/trickmode".equalsIgnoreCase(list.get(i2).a)) {
                i |= 16384;
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public int b0(List<j10> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            j10 j10 = list.get(i2);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(j10.a)) {
                i |= F(j10.b);
            }
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public g10 c(int i, int i2, List<o10> list, List<j10> list2, List<j10> list3, List<j10> list4) {
        return new g10(i, i2, list, list2, list3, list4);
    }

    /* access modifiers changed from: protected */
    public p10.e c0(XmlPullParser xmlPullParser, p10.e eVar) {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        p10.e eVar2 = eVar;
        long T = T(xmlPullParser2, "timescale", eVar2 != null ? eVar2.b : 1);
        long j3 = 0;
        long T2 = T(xmlPullParser2, "presentationTimeOffset", eVar2 != null ? eVar2.c : 0);
        long j4 = eVar2 != null ? eVar2.d : 0;
        if (eVar2 != null) {
            j3 = eVar2.e;
        }
        n10 n10 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j2 = parseLong;
        } else {
            j = j3;
            j2 = j4;
        }
        if (eVar2 != null) {
            n10 = eVar2.a;
        }
        do {
            xmlPullParser.next();
            if (w50.f(xmlPullParser2, "Initialization")) {
                n10 = P(xmlPullParser);
            } else {
                u(xmlPullParser);
            }
        } while (!w50.d(xmlPullParser2, "SegmentBase"));
        return n(n10, T, T2, j2, j);
    }

    /* access modifiers changed from: protected */
    public fy d(String str, String str2, long j, long j2, byte[] bArr) {
        return new fy(str, str2, j2, j, bArr);
    }

    /* access modifiers changed from: protected */
    public p10.b d0(XmlPullParser xmlPullParser, p10.b bVar, long j) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        p10.b bVar2 = bVar;
        long j2 = 1;
        long T = T(xmlPullParser2, "timescale", bVar2 != null ? bVar2.b : 1);
        long T2 = T(xmlPullParser2, "presentationTimeOffset", bVar2 != null ? bVar2.c : 0);
        long T3 = T(xmlPullParser2, "duration", bVar2 != null ? bVar2.e : -9223372036854775807L);
        if (bVar2 != null) {
            j2 = bVar2.d;
        }
        long T4 = T(xmlPullParser2, "startNumber", j2);
        List<p10.d> list = null;
        List list2 = null;
        n10 n10 = null;
        do {
            xmlPullParser.next();
            if (w50.f(xmlPullParser2, "Initialization")) {
                n10 = P(xmlPullParser);
            } else if (w50.f(xmlPullParser2, "SegmentTimeline")) {
                list = f0(xmlPullParser, T, j);
            } else if (w50.f(xmlPullParser2, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(g0(xmlPullParser));
            } else {
                u(xmlPullParser);
            }
        } while (!w50.d(xmlPullParser2, "SegmentList"));
        if (bVar2 != null) {
            if (n10 == null) {
                n10 = bVar2.a;
            }
            if (list == null) {
                list = bVar2.f;
            }
            if (list2 == null) {
                list2 = bVar2.g;
            }
        }
        return k(n10, T, T2, T4, T3, list, list2);
    }

    /* access modifiers changed from: protected */
    public k10 e(String str, String str2, long j, long[] jArr, fy[] fyVarArr) {
        return new k10(str, str2, j, jArr, fyVarArr);
    }

    /* access modifiers changed from: protected */
    public p10.c e0(XmlPullParser xmlPullParser, p10.c cVar, List<j10> list, long j) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        p10.c cVar2 = cVar;
        long j2 = 1;
        long T = T(xmlPullParser2, "timescale", cVar2 != null ? cVar2.b : 1);
        long T2 = T(xmlPullParser2, "presentationTimeOffset", cVar2 != null ? cVar2.c : 0);
        long T3 = T(xmlPullParser2, "duration", cVar2 != null ? cVar2.e : -9223372036854775807L);
        if (cVar2 != null) {
            j2 = cVar2.d;
        }
        long T4 = T(xmlPullParser2, "startNumber", j2);
        long S = S(list);
        List<p10.d> list2 = null;
        r10 l0 = l0(xmlPullParser2, "media", cVar2 != null ? cVar2.h : null);
        r10 l02 = l0(xmlPullParser2, "initialization", cVar2 != null ? cVar2.g : null);
        n10 n10 = null;
        do {
            xmlPullParser.next();
            if (w50.f(xmlPullParser2, "Initialization")) {
                n10 = P(xmlPullParser);
            } else if (w50.f(xmlPullParser2, "SegmentTimeline")) {
                list2 = f0(xmlPullParser, T, j);
            } else {
                u(xmlPullParser);
            }
        } while (!w50.d(xmlPullParser2, "SegmentTemplate"));
        if (cVar2 != null) {
            if (n10 == null) {
                n10 = cVar2.a;
            }
            if (list2 == null) {
                list2 = cVar2.f;
            }
        }
        return l(n10, T, T2, T4, S, T3, list2, l02, l0);
    }

    /* access modifiers changed from: protected */
    public f0 f(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<j10> list, List<j10> list2, String str4, List<j10> list3, List<j10> list4) {
        String str5;
        int i6;
        int C;
        List<j10> list5 = list;
        String t = t(str2, str4);
        int h0 = h0(list5);
        int b0 = b0(list5) | Z(list2) | a0(list3) | a0(list4);
        if (t != null) {
            String K = "audio/eac3".equals(t) ? K(list4) : t;
            if (e50.n(K)) {
                return f0.F(str, (String) null, str2, K, str4, (yx) null, i5, i, i2, f, (List<byte[]>) null, h0, b0);
            }
            if (e50.l(K)) {
                return f0.m(str, (String) null, str2, K, str4, (yx) null, i5, i3, i4, (List<byte[]>) null, h0, b0, str3);
            }
            if (v(K)) {
                if ("application/cea-608".equals(K)) {
                    C = B(list2);
                } else if ("application/cea-708".equals(K)) {
                    C = C(list2);
                } else {
                    i6 = -1;
                    return f0.x(str, (String) null, str2, K, str4, i5, h0, b0, str3, i6);
                }
                i6 = C;
                return f0.x(str, (String) null, str2, K, str4, i5, h0, b0, str3, i6);
            }
            str5 = K;
        } else {
            str5 = t;
        }
        return f0.q(str, (String) null, str2, str5, str4, i5, h0, b0, str3);
    }

    /* access modifiers changed from: protected */
    public List<p10.d> f0(XmlPullParser xmlPullParser, long j, long j2) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (w50.f(xmlPullParser2, "S")) {
                long T = T(xmlPullParser2, "t", -9223372036854775807L);
                if (z) {
                    j3 = b(arrayList, j3, j4, i, T);
                }
                if (T == -9223372036854775807L) {
                    T = j3;
                }
                j4 = T(xmlPullParser2, "d", -9223372036854775807L);
                i = Q(xmlPullParser2, "r", 0);
                j3 = T;
                z = true;
            } else {
                u(xmlPullParser);
            }
        } while (!w50.d(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            b(arrayList, j3, j4, i, v50.w0(j2, j, 1000));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public h10 g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, m10 m10, s10 s10, Uri uri, List<l10> list) {
        return new h10(j, j2, j3, z, j4, j5, j6, j7, m10, s10, uri, list);
    }

    /* access modifiers changed from: protected */
    public n10 g0(XmlPullParser xmlPullParser) {
        return X(xmlPullParser, "media", "mediaRange");
    }

    /* access modifiers changed from: protected */
    public l10 h(String str, long j, List<g10> list, List<k10> list2, j10 j10) {
        return new l10(str, j, list, list2, j10);
    }

    /* access modifiers changed from: protected */
    public int h0(List<j10> list) {
        for (int i = 0; i < list.size(); i++) {
            j10 j10 = list.get(i);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(j10.a) && "main".equals(j10.b)) {
                return 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public n10 i(String str, long j, long j2) {
        return new n10(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public o10 j(a aVar, String str, String str2, ArrayList<ns.b> arrayList, ArrayList<j10> arrayList2) {
        f0 f0Var = aVar.a;
        if (str != null) {
            f0Var = f0Var.h(str);
        }
        String str3 = aVar.d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<ns.b> arrayList3 = aVar.e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            f0Var = f0Var.d(new ns(str2, (List<ns.b>) arrayList3));
        }
        ArrayList<j10> arrayList4 = aVar.f;
        arrayList4.addAll(arrayList2);
        return o10.l(aVar.g, f0Var, aVar.b, aVar.c, arrayList4);
    }

    /* access modifiers changed from: protected */
    public p10.b k(n10 n10, long j, long j2, long j3, long j4, List<p10.d> list, List<n10> list2) {
        return new p10.b(n10, j, j2, j3, j4, list, list2);
    }

    /* access modifiers changed from: protected */
    public int k0(String str) {
        if (str == null) {
            return 0;
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c2 = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c2 = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c2 = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c2 = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        if (c2 == 0) {
            return 512;
        }
        if (c2 == 1) {
            return 2048;
        }
        if (c2 == 2) {
            return 4;
        }
        if (c2 != 3) {
            return c2 != 4 ? 0 : 1;
        }
        return 8;
    }

    /* access modifiers changed from: protected */
    public p10.c l(n10 n10, long j, long j2, long j3, long j4, long j5, List<p10.d> list, r10 r10, r10 r102) {
        return new p10.c(n10, j, j2, j3, j4, j5, list, r10, r102);
    }

    /* access modifiers changed from: protected */
    public r10 l0(XmlPullParser xmlPullParser, String str, r10 r10) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue != null ? r10.b(attributeValue) : r10;
    }

    /* access modifiers changed from: protected */
    public p10.d m(long j, long j2) {
        return new p10.d(j, j2);
    }

    /* access modifiers changed from: protected */
    public s10 m0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue((String) null, "schemeIdUri"), xmlPullParser.getAttributeValue((String) null, "value"));
    }

    /* access modifiers changed from: protected */
    public p10.e n(n10 n10, long j, long j2, long j3, long j4) {
        return new p10.e(n10, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    public s10 o(String str, String str2) {
        return new s10(str, str2);
    }

    /* access modifiers changed from: protected */
    public int s(f0 f0Var) {
        String str = f0Var.m;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (e50.n(str)) {
            return 2;
        }
        if (e50.l(str)) {
            return 1;
        }
        return v(str) ? 3 : -1;
    }

    /* renamed from: w */
    public h10 a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return U(newPullParser, uri.toString());
            }
            throw new m0("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw new m0((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0288 A[LOOP:0: B:1:0x0072->B:66:0x0288, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x024d A[EDGE_INSN: B:67:0x024d->B:60:0x024d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.g10 x(org.xmlpull.v1.XmlPullParser r44, java.lang.String r45, defpackage.p10 r46, long r47) {
        /*
            r43 = this;
            r15 = r43
            r14 = r44
            java.lang.String r0 = "id"
            r1 = -1
            int r18 = Q(r14, r0, r1)
            int r0 = r43.E(r44)
            r13 = 0
            java.lang.String r2 = "mimeType"
            java.lang.String r19 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "codecs"
            java.lang.String r20 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "width"
            int r21 = Q(r14, r2, r1)
            java.lang.String r2 = "height"
            int r22 = Q(r14, r2, r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r23 = O(r14, r2)
            java.lang.String r2 = "audioSamplingRate"
            int r24 = Q(r14, r2, r1)
            java.lang.String r12 = "lang"
            java.lang.String r2 = r14.getAttributeValue(r13, r12)
            java.lang.String r3 = "label"
            java.lang.String r3 = r14.getAttributeValue(r13, r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r25 = 0
            r4 = r45
            r26 = r46
            r28 = r3
            r30 = r13
            r27 = -1
            r29 = 0
            r3 = r0
        L_0x0072:
            r44.next()
            java.lang.String r0 = "BaseURL"
            boolean r0 = defpackage.w50.f(r14, r0)
            if (r0 == 0) goto L_0x00b8
            if (r29 != 0) goto L_0x009d
            java.lang.String r0 = r15.A(r14, r4)
            r29 = 1
            r4 = r0
        L_0x0086:
            r35 = r6
            r36 = r7
            r37 = r8
            r38 = r9
            r40 = r11
            r41 = r12
            r42 = r13
            r9 = r14
            r7 = r15
            r6 = r3
        L_0x0097:
            r8 = r5
            r12 = r10
            r10 = r47
            goto L_0x0245
        L_0x009d:
            r31 = r2
            r33 = r4
            r35 = r6
            r36 = r7
            r37 = r8
            r38 = r9
            r40 = r11
            r41 = r12
            r42 = r13
            r9 = r14
            r7 = r15
            r6 = r3
            r8 = r5
            r12 = r10
            r10 = r47
            goto L_0x0241
        L_0x00b8:
            java.lang.String r0 = "ContentProtection"
            boolean r0 = defpackage.w50.f(r14, r0)
            if (r0 == 0) goto L_0x00d6
            android.util.Pair r0 = r43.D(r44)
            java.lang.Object r1 = r0.first
            if (r1 == 0) goto L_0x00cc
            r30 = r1
            java.lang.String r30 = (java.lang.String) r30
        L_0x00cc:
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x0086
            ns$b r0 = (defpackage.ns.b) r0
            r11.add(r0)
            goto L_0x0086
        L_0x00d6:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = defpackage.w50.f(r14, r0)
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = r14.getAttributeValue(r13, r12)
            java.lang.String r0 = q(r2, r0)
            int r1 = r43.E(r44)
            int r1 = p(r3, r1)
            r2 = r0
            r35 = r6
            r36 = r7
            r37 = r8
            r38 = r9
            r40 = r11
            r41 = r12
            r42 = r13
            r9 = r14
            r7 = r15
            r6 = r1
            goto L_0x0097
        L_0x0101:
            java.lang.String r0 = "Role"
            boolean r1 = defpackage.w50.f(r14, r0)
            if (r1 == 0) goto L_0x0111
            j10 r0 = H(r14, r0)
            r8.add(r0)
            goto L_0x009d
        L_0x0111:
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = defpackage.w50.f(r14, r0)
            if (r0 == 0) goto L_0x0121
            int r0 = r43.z(r44)
            r27 = r0
            goto L_0x0086
        L_0x0121:
            java.lang.String r0 = "Accessibility"
            boolean r1 = defpackage.w50.f(r14, r0)
            if (r1 == 0) goto L_0x0132
            j10 r0 = H(r14, r0)
            r9.add(r0)
            goto L_0x009d
        L_0x0132:
            java.lang.String r0 = "EssentialProperty"
            boolean r1 = defpackage.w50.f(r14, r0)
            if (r1 == 0) goto L_0x0143
            j10 r0 = H(r14, r0)
            r7.add(r0)
            goto L_0x009d
        L_0x0143:
            java.lang.String r0 = "SupplementalProperty"
            boolean r1 = defpackage.w50.f(r14, r0)
            if (r1 == 0) goto L_0x0154
            j10 r0 = H(r14, r0)
            r6.add(r0)
            goto L_0x009d
        L_0x0154:
            java.lang.String r0 = "Representation"
            boolean r0 = defpackage.w50.f(r14, r0)
            if (r0 == 0) goto L_0x01b9
            r0 = r43
            r1 = r44
            r31 = r2
            r2 = r4
            r32 = r3
            r3 = r19
            r33 = r4
            r4 = r20
            r34 = r5
            r5 = r21
            r35 = r6
            r6 = r22
            r36 = r7
            r7 = r23
            r37 = r8
            r8 = r27
            r38 = r9
            r9 = r24
            r39 = r10
            r10 = r31
            r40 = r11
            r11 = r37
            r41 = r12
            r12 = r38
            r42 = r13
            r13 = r36
            r14 = r35
            r15 = r26
            r16 = r47
            i10$a r0 = r0.Y(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.google.android.exoplayer2.f0 r1 = r0.a
            r7 = r43
            int r1 = r7.s(r1)
            r6 = r32
            int r1 = p(r6, r1)
            r8 = r34
            r8.add(r0)
            r9 = r44
            r10 = r47
            r6 = r1
        L_0x01b1:
            r2 = r31
            r4 = r33
            r12 = r39
            goto L_0x0245
        L_0x01b9:
            r31 = r2
            r33 = r4
            r35 = r6
            r36 = r7
            r37 = r8
            r38 = r9
            r39 = r10
            r40 = r11
            r41 = r12
            r42 = r13
            r7 = r15
            r6 = r3
            r8 = r5
            java.lang.String r0 = "SegmentBase"
            r9 = r44
            boolean r0 = defpackage.w50.f(r9, r0)
            if (r0 == 0) goto L_0x01e7
            r0 = r26
            p10$e r0 = (defpackage.p10.e) r0
            p10$e r0 = r7.c0(r9, r0)
            r10 = r47
        L_0x01e4:
            r26 = r0
            goto L_0x01b1
        L_0x01e7:
            java.lang.String r0 = "SegmentList"
            boolean r0 = defpackage.w50.f(r9, r0)
            if (r0 == 0) goto L_0x01fa
            r0 = r26
            p10$b r0 = (defpackage.p10.b) r0
            r10 = r47
            p10$b r0 = r7.d0(r9, r0, r10)
            goto L_0x01e4
        L_0x01fa:
            r10 = r47
            java.lang.String r0 = "SegmentTemplate"
            boolean r0 = defpackage.w50.f(r9, r0)
            if (r0 == 0) goto L_0x0215
            r2 = r26
            p10$c r2 = (defpackage.p10.c) r2
            r0 = r43
            r1 = r44
            r3 = r35
            r4 = r47
            p10$c r0 = r0.e0(r1, r2, r3, r4)
            goto L_0x01e4
        L_0x0215:
            java.lang.String r0 = "InbandEventStream"
            boolean r1 = defpackage.w50.f(r9, r0)
            if (r1 == 0) goto L_0x0227
            j10 r0 = H(r9, r0)
            r12 = r39
            r12.add(r0)
            goto L_0x0241
        L_0x0227:
            r12 = r39
            java.lang.String r0 = "Label"
            boolean r0 = defpackage.w50.f(r9, r0)
            if (r0 == 0) goto L_0x0238
            java.lang.String r0 = r43.R(r44)
            r28 = r0
            goto L_0x0241
        L_0x0238:
            boolean r0 = defpackage.w50.e(r44)
            if (r0 == 0) goto L_0x0241
            r43.y(r44)
        L_0x0241:
            r2 = r31
            r4 = r33
        L_0x0245:
            java.lang.String r0 = "AdaptationSet"
            boolean r0 = defpackage.w50.d(r9, r0)
            if (r0 == 0) goto L_0x0288
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = r8.size()
            r9.<init>(r0)
            r10 = 0
        L_0x0257:
            int r0 = r8.size()
            if (r10 >= r0) goto L_0x0277
            java.lang.Object r0 = r8.get(r10)
            r1 = r0
            i10$a r1 = (defpackage.i10.a) r1
            r0 = r43
            r2 = r28
            r3 = r30
            r4 = r40
            r5 = r12
            o10 r0 = r0.j(r1, r2, r3, r4, r5)
            r9.add(r0)
            int r10 = r10 + 1
            goto L_0x0257
        L_0x0277:
            r0 = r43
            r1 = r18
            r2 = r6
            r3 = r9
            r4 = r38
            r5 = r36
            r6 = r35
            g10 r0 = r0.c(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0288:
            r3 = r6
            r15 = r7
            r5 = r8
            r14 = r9
            r10 = r12
            r6 = r35
            r7 = r36
            r8 = r37
            r9 = r38
            r11 = r40
            r12 = r41
            r13 = r42
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i10.x(org.xmlpull.v1.XmlPullParser, java.lang.String, p10, long):g10");
    }

    /* access modifiers changed from: protected */
    public void y(XmlPullParser xmlPullParser) {
        u(xmlPullParser);
    }

    /* access modifiers changed from: protected */
    public int z(XmlPullParser xmlPullParser) {
        String i0 = i0(xmlPullParser, "schemeIdUri", (String) null);
        int i = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(i0)) {
            i = Q(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(i0) || "urn:dolby:dash:audio_channel_configuration:2011".equals(i0)) {
            i = I(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!w50.d(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }
}
