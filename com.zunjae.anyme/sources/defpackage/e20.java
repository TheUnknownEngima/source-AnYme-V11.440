package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.upstream.w;
import defpackage.d20;
import defpackage.ns;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: e20  reason: default package */
public class e20 implements w.a<d20> {
    private final XmlPullParserFactory a;

    /* renamed from: e20$a */
    private static abstract class a {
        private final String a;
        private final String b;
        private final a c;
        private final List<Pair<String, Object>> d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.c = aVar;
            this.a = str;
            this.b = str2;
        }

        private a e(a aVar, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new d(aVar, str2);
            }
            if ("Protection".equals(str)) {
                return new c(aVar, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new f(aVar, str2);
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public void a(Object obj) {
        }

        /* access modifiers changed from: protected */
        public abstract Object b();

        /* access modifiers changed from: protected */
        public final Object c(String str) {
            for (int i = 0; i < this.d.size(); i++) {
                Pair pair = this.d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        /* access modifiers changed from: protected */
        public boolean d(String str) {
            return false;
        }

        public final Object f(XmlPullParser xmlPullParser) {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.b.equals(name)) {
                        n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (d(name)) {
                            n(xmlPullParser);
                        } else {
                            a e = e(this, name, this.a);
                            if (e == null) {
                                i = 1;
                            } else {
                                a(e.f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    h(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* access modifiers changed from: protected */
        public final boolean g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        /* access modifiers changed from: protected */
        public void h(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        public final int i(XmlPullParser xmlPullParser, String str, int i) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw new m0((Throwable) e);
            }
        }

        /* access modifiers changed from: protected */
        public final long j(XmlPullParser xmlPullParser, String str, long j) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw new m0((Throwable) e);
            }
        }

        /* access modifiers changed from: protected */
        public final int k(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Integer.parseInt(attributeValue);
                } catch (NumberFormatException e) {
                    throw new m0((Throwable) e);
                }
            } else {
                throw new b(str);
            }
        }

        /* access modifiers changed from: protected */
        public final long l(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                try {
                    return Long.parseLong(attributeValue);
                } catch (NumberFormatException e) {
                    throw new m0((Throwable) e);
                }
            } else {
                throw new b(str);
            }
        }

        /* access modifiers changed from: protected */
        public final String m(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new b(str);
        }

        /* access modifiers changed from: protected */
        public abstract void n(XmlPullParser xmlPullParser);

        /* access modifiers changed from: protected */
        public void o(XmlPullParser xmlPullParser) {
        }

        /* access modifiers changed from: protected */
        public final void p(String str, Object obj) {
            this.d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: e20$b */
    public static class b extends m0 {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "Missing required field: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>((java.lang.String) r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.e20.b.<init>(java.lang.String):void");
        }
    }

    /* renamed from: e20$c */
    private static class c extends a {
        private boolean e;
        private UUID f;
        private byte[] g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        private static mv[] q(byte[] bArr) {
            return new mv[]{new mv(true, (String) null, 8, r(bArr), 0, 0, (byte[]) null)};
        }

        private static byte[] r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String sb2 = sb.toString();
            byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
            t(decode, 0, 3);
            t(decode, 1, 2);
            t(decode, 4, 5);
            t(decode, 6, 7);
            return decode;
        }

        private static String s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        private static void t(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        public Object b() {
            UUID uuid = this.f;
            return new d20.a(uuid, jv.a(uuid, this.g), q(this.g));
        }

        public boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        public void h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.e = false;
            }
        }

        public void n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.e = true;
                this.f = UUID.fromString(s(xmlPullParser.getAttributeValue((String) null, "SystemID")));
            }
        }

        public void o(XmlPullParser xmlPullParser) {
            if (this.e) {
                this.g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* renamed from: e20$d */
    private static class d extends a {
        private f0 e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        private static List<byte[]> q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] A = v50.A(str);
                byte[][] m = s40.m(A);
                if (m == null) {
                    arrayList.add(A);
                } else {
                    Collections.addAll(arrayList, m);
                }
            }
            return arrayList;
        }

        private static String r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return "video/avc";
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase("ac-3") || str.equalsIgnoreCase("dac3")) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase("ec-3") || str.equalsIgnoreCase("dec3")) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase("dtsh") || str.equalsIgnoreCase("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        public Object b() {
            return this.e;
        }

        public void n(XmlPullParser xmlPullParser) {
            f0 q;
            XmlPullParser xmlPullParser2 = xmlPullParser;
            int intValue = ((Integer) c("Type")).intValue();
            String attributeValue = xmlPullParser2.getAttributeValue((String) null, "Index");
            String str = (String) c("Name");
            int k = k(xmlPullParser2, "Bitrate");
            String r = r(m(xmlPullParser2, "FourCC"));
            if (intValue == 2) {
                q = f0.F(attributeValue, str, "video/mp4", r, (String) null, (yx) null, k, k(xmlPullParser2, "MaxWidth"), k(xmlPullParser2, "MaxHeight"), -1.0f, q(xmlPullParser2.getAttributeValue((String) null, "CodecPrivateData")), 0, 0);
            } else if (intValue == 1) {
                if (r == null) {
                    r = "audio/mp4a-latm";
                }
                int k2 = k(xmlPullParser2, "Channels");
                int k3 = k(xmlPullParser2, "SamplingRate");
                List<byte[]> q2 = q(xmlPullParser2.getAttributeValue((String) null, "CodecPrivateData"));
                if (q2.isEmpty() && "audio/mp4a-latm".equals(r)) {
                    q2 = Collections.singletonList(s40.b(k3, k2));
                }
                q = f0.m(attributeValue, str, "audio/mp4", r, (String) null, (yx) null, k, k2, k3, q2, 0, 0, (String) c("Language"));
            } else if (intValue == 3) {
                String str2 = (String) c("Subtype");
                char c = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != 2061026) {
                    if (hashCode == 2094737 && str2.equals("DESC")) {
                        c = 1;
                    }
                } else if (str2.equals("CAPT")) {
                    c = 0;
                }
                q = f0.w(attributeValue, str, "application/mp4", r, (String) null, k, 0, c != 0 ? c != 1 ? 0 : 1024 : 64, (String) c("Language"));
            } else {
                q = f0.q(attributeValue, str, "application/mp4", r, (String) null, k, 0, 0, (String) null);
            }
            this.e = q;
        }
    }

    /* renamed from: e20$e */
    private static class e extends a {
        private final List<d20.b> e = new LinkedList();
        private int f;
        private int g;
        private long h;
        private long i;
        private long j;
        private int k = -1;
        private boolean l;
        private d20.a m = null;

        public e(a aVar, String str) {
            super(aVar, str, "SmoothStreamingMedia");
        }

        public void a(Object obj) {
            if (obj instanceof d20.b) {
                this.e.add((d20.b) obj);
            } else if (obj instanceof d20.a) {
                q40.f(this.m == null);
                this.m = (d20.a) obj;
            }
        }

        public Object b() {
            int size = this.e.size();
            d20.b[] bVarArr = new d20.b[size];
            this.e.toArray(bVarArr);
            if (this.m != null) {
                d20.a aVar = this.m;
                ns nsVar = new ns(new ns.b(aVar.a, "video/mp4", aVar.b));
                for (int i2 = 0; i2 < size; i2++) {
                    d20.b bVar = bVarArr[i2];
                    int i3 = bVar.a;
                    if (i3 == 2 || i3 == 1) {
                        f0[] f0VarArr = bVar.j;
                        for (int i4 = 0; i4 < f0VarArr.length; i4++) {
                            f0VarArr[i4] = f0VarArr[i4].d(nsVar);
                        }
                    }
                }
            }
            return new d20(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, bVarArr);
        }

        public void n(XmlPullParser xmlPullParser) {
            this.f = k(xmlPullParser, "MajorVersion");
            this.g = k(xmlPullParser, "MinorVersion");
            this.h = j(xmlPullParser, "TimeScale", 10000000);
            this.i = l(xmlPullParser, "Duration");
            this.j = j(xmlPullParser, "DVRWindowLength", 0);
            this.k = i(xmlPullParser, "LookaheadCount", -1);
            this.l = g(xmlPullParser, "IsLive", false);
            p("TimeScale", Long.valueOf(this.h));
        }
    }

    /* renamed from: e20$f */
    private static class f extends a {
        private final String e;
        private final List<f0> f = new LinkedList();
        private int g;
        private String h;
        private long i;
        private String j;
        private String k;
        private int l;
        private int m;
        private int n;
        private int o;
        private String p;
        private ArrayList<Long> q;
        private long r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.e = str;
        }

        private void q(XmlPullParser xmlPullParser) {
            int s = s(xmlPullParser);
            this.g = s;
            p("Type", Integer.valueOf(s));
            this.h = this.g == 3 ? m(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue((String) null, "Subtype");
            p("Subtype", this.h);
            this.j = xmlPullParser.getAttributeValue((String) null, "Name");
            this.k = m(xmlPullParser, "Url");
            this.l = i(xmlPullParser, "MaxWidth", -1);
            this.m = i(xmlPullParser, "MaxHeight", -1);
            this.n = i(xmlPullParser, "DisplayWidth", -1);
            this.o = i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Language");
            this.p = attributeValue;
            p("Language", attributeValue);
            long i2 = (long) i(xmlPullParser, "TimeScale", -1);
            this.i = i2;
            if (i2 == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList<>();
        }

        private void r(XmlPullParser xmlPullParser) {
            int size = this.q.size();
            long j2 = j(xmlPullParser, "t", -9223372036854775807L);
            int i2 = 1;
            if (j2 == -9223372036854775807L) {
                if (size == 0) {
                    j2 = 0;
                } else if (this.r != -1) {
                    j2 = this.q.get(size - 1).longValue() + this.r;
                } else {
                    throw new m0("Unable to infer start time");
                }
            }
            this.q.add(Long.valueOf(j2));
            this.r = j(xmlPullParser, "d", -9223372036854775807L);
            long j3 = j(xmlPullParser, "r", 1);
            if (j3 <= 1 || this.r != -9223372036854775807L) {
                while (true) {
                    long j4 = (long) i2;
                    if (j4 < j3) {
                        this.q.add(Long.valueOf((this.r * j4) + j2));
                        i2++;
                    } else {
                        return;
                    }
                }
            } else {
                throw new m0("Repeated chunk with unspecified duration");
            }
        }

        private int s(XmlPullParser xmlPullParser) {
            String attributeValue = xmlPullParser.getAttributeValue((String) null, "Type");
            if (attributeValue == null) {
                throw new b("Type");
            } else if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            } else {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    return 2;
                }
                if ("text".equalsIgnoreCase(attributeValue)) {
                    return 3;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(attributeValue).length() + 19);
                sb.append("Invalid key value[");
                sb.append(attributeValue);
                sb.append("]");
                throw new m0(sb.toString());
            }
        }

        public void a(Object obj) {
            if (obj instanceof f0) {
                this.f.add((f0) obj);
            }
        }

        public Object b() {
            f0[] f0VarArr = new f0[this.f.size()];
            this.f.toArray(f0VarArr);
            d20.b bVar = r2;
            d20.b bVar2 = new d20.b(this.e, this.k, this.g, this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, f0VarArr, this.q, this.r);
            return bVar;
        }

        public boolean d(String str) {
            return "c".equals(str);
        }

        public void n(XmlPullParser xmlPullParser) {
            if ("c".equals(xmlPullParser.getName())) {
                r(xmlPullParser);
            } else {
                q(xmlPullParser);
            }
        }
    }

    public e20() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* renamed from: b */
    public d20 a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            return (d20) new e((a) null, uri.toString()).f(newPullParser);
        } catch (XmlPullParserException e2) {
            throw new m0((Throwable) e2);
        }
    }
}
