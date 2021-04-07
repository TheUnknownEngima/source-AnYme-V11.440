package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.upstream.w;
import com.google.android.exoplayer2.v;
import defpackage.ns;
import defpackage.x10;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: a20  reason: default package */
public final class a20 implements w.a<z10> {
    private static final Pattern A = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern B = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern C = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern D = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern E = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern F = c("AUTOSELECT");
    private static final Pattern G = c("DEFAULT");
    private static final Pattern H = c("FORCED");
    private static final Pattern I = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern K = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern b = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern c = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern d = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern e = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern f = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern g = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern h = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern i = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern j = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern k = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern l = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern m = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern n = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern o = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern p = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern r = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern s = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern t = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern u = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern v = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern w = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern x = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern y = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern z = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private final x10 a;

    /* renamed from: a20$a */
    private static class a {
        private final BufferedReader a;
        private final Queue<String> b;
        private String c;

        public a(Queue<String> queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean a() {
            String trim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                String poll = this.b.poll();
                q40.e(poll);
                this.c = poll;
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (a()) {
                String str = this.c;
                this.c = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }

    public a20() {
        this(x10.l);
    }

    public a20(x10 x10) {
        this.a = x10;
    }

    private static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int w2 = w(bufferedReader, true, read);
        for (int i2 = 0; i2 < 7; i2++) {
            if (w2 != "#EXTM3U".charAt(i2)) {
                return false;
            }
            w2 = bufferedReader.read();
        }
        return v50.g0(w(bufferedReader, false, w2));
    }

    private static Pattern c(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 9);
        sb.append(str);
        sb.append("=(");
        sb.append("NO");
        sb.append("|");
        sb.append("YES");
        sb.append(")");
        return Pattern.compile(sb.toString());
    }

    private static x10.b d(ArrayList<x10.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            x10.b bVar = arrayList.get(i2);
            if (str.equals(bVar.d)) {
                return bVar;
            }
        }
        return null;
    }

    private static x10.b e(ArrayList<x10.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            x10.b bVar = arrayList.get(i2);
            if (str.equals(bVar.e)) {
                return bVar;
            }
        }
        return null;
    }

    private static x10.b f(ArrayList<x10.b> arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            x10.b bVar = arrayList.get(i2);
            if (str.equals(bVar.c)) {
                return bVar;
            }
        }
        return null;
    }

    private static double h(String str, Pattern pattern) {
        return Double.parseDouble(u(str, pattern, Collections.emptyMap()));
    }

    private static ns.b i(String str, String str2, Map<String, String> map) {
        String q2 = q(str, w, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String u2 = u(str, x, map);
            return new ns.b(v.d, "video/mp4", Base64.decode(u2.substring(u2.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new ns.b(v.d, "hls", v50.Z(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(q2)) {
                return null;
            }
            String u3 = u(str, x, map);
            return new ns.b(v.e, "video/mp4", jv.a(v.e, Base64.decode(u3.substring(u3.indexOf(44)), 0)));
        }
    }

    private static String j(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int k(String str, Pattern pattern) {
        return Integer.parseInt(u(str, pattern, Collections.emptyMap()));
    }

    private static long l(String str, Pattern pattern) {
        return Long.parseLong(u(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.x10 m(defpackage.a20.a r41, java.lang.String r42) {
        /*
            r1 = r42
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r13 = 0
            r14 = 0
        L_0x0036:
            boolean r15 = r41.a()
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r15 == 0) goto L_0x01c1
            java.lang.String r15 = r41.b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x004d
            r8.add(r15)
        L_0x004d:
            java.lang.String r9 = "#EXT-X-DEFINE"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x006e
            java.util.regex.Pattern r9 = B
            java.lang.String r9 = u(r15, r9, r11)
            java.util.regex.Pattern r10 = I
            java.lang.String r10 = u(r15, r10, r11)
            r11.put(r9, r10)
        L_0x0064:
            r21 = r7
            r23 = r8
            r22 = r12
            r20 = r13
            goto L_0x01b7
        L_0x006e:
            java.lang.String r9 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x0078
            r13 = 1
            goto L_0x0036
        L_0x0078:
            java.lang.String r9 = "#EXT-X-MEDIA"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x0084
            r3.add(r15)
            goto L_0x0064
        L_0x0084:
            java.lang.String r9 = "#EXT-X-SESSION-KEY"
            boolean r9 = r15.startsWith(r9)
            if (r9 == 0) goto L_0x00be
            java.util.regex.Pattern r9 = v
            java.lang.String r10 = "identity"
            java.lang.String r9 = q(r15, r9, r10, r11)
            ns$b r9 = i(r15, r9, r11)
            if (r9 == 0) goto L_0x00b8
            java.util.regex.Pattern r10 = u
            java.lang.String r10 = u(r15, r10, r11)
            java.lang.String r10 = j(r10)
            ns r15 = new ns
            r21 = r7
            r20 = r13
            r13 = 1
            ns$b[] r7 = new defpackage.ns.b[r13]
            r13 = 0
            r7[r13] = r9
            r15.<init>((java.lang.String) r10, (defpackage.ns.b[]) r7)
            r12.add(r15)
            goto L_0x01b3
        L_0x00b8:
            r21 = r7
            r20 = r13
            goto L_0x01b3
        L_0x00be:
            r21 = r7
            r20 = r13
            java.lang.String r7 = "#EXT-X-STREAM-INF"
            boolean r7 = r15.startsWith(r7)
            if (r7 == 0) goto L_0x01b3
            java.lang.String r7 = "CLOSED-CAPTIONS=NONE"
            boolean r7 = r15.contains(r7)
            r14 = r14 | r7
            java.util.regex.Pattern r7 = g
            int r7 = k(r15, r7)
            java.util.regex.Pattern r9 = b
            r13 = -1
            p(r15, r9, r13)
            java.util.regex.Pattern r9 = i
            java.lang.String r26 = r(r15, r9, r11)
            java.util.regex.Pattern r9 = j
            java.lang.String r9 = r(r15, r9, r11)
            if (r9 == 0) goto L_0x010e
            java.lang.String r10 = "x"
            java.lang.String[] r9 = r9.split(r10)
            r10 = 0
            r18 = r9[r10]
            int r10 = java.lang.Integer.parseInt(r18)
            r18 = 1
            r9 = r9[r18]
            int r9 = java.lang.Integer.parseInt(r9)
            if (r10 <= 0) goto L_0x0108
            if (r9 > 0) goto L_0x0105
            goto L_0x0108
        L_0x0105:
            r13 = r9
            r9 = r10
            goto L_0x0109
        L_0x0108:
            r9 = -1
        L_0x0109:
            r29 = r9
            r30 = r13
            goto L_0x0112
        L_0x010e:
            r29 = -1
            r30 = -1
        L_0x0112:
            java.util.regex.Pattern r9 = k
            java.lang.String r9 = r(r15, r9, r11)
            if (r9 == 0) goto L_0x0121
            float r16 = java.lang.Float.parseFloat(r9)
            r31 = r16
            goto L_0x0123
        L_0x0121:
            r31 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0123:
            java.util.regex.Pattern r9 = c
            java.lang.String r9 = r(r15, r9, r11)
            java.util.regex.Pattern r10 = d
            java.lang.String r10 = r(r15, r10, r11)
            java.util.regex.Pattern r13 = e
            java.lang.String r13 = r(r15, r13, r11)
            r18 = r14
            java.util.regex.Pattern r14 = f
            java.lang.String r14 = r(r15, r14, r11)
            boolean r15 = r41.a()
            if (r15 == 0) goto L_0x01ab
            java.lang.String r15 = r41.b()
            java.lang.String r15 = v(r15, r11)
            android.net.Uri r15 = defpackage.u50.d(r1, r15)
            int r16 = r2.size()
            java.lang.String r22 = java.lang.Integer.toString(r16)
            r23 = 0
            r25 = 0
            r27 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            java.lang.String r24 = "application/x-mpegURL"
            r28 = r7
            com.google.android.exoplayer2.f0 r34 = com.google.android.exoplayer2.f0.F(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r22 = r12
            x10$b r12 = new x10$b
            r32 = r12
            r33 = r15
            r35 = r9
            r36 = r10
            r37 = r13
            r38 = r14
            r32.<init>(r33, r34, r35, r36, r37, r38)
            r2.add(r12)
            java.lang.Object r12 = r0.get(r15)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L_0x0191
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0.put(r15, r12)
        L_0x0191:
            com.google.android.exoplayer2.source.hls.p$b r15 = new com.google.android.exoplayer2.source.hls.p$b
            r23 = r8
            long r7 = (long) r7
            r32 = r15
            r33 = r7
            r35 = r9
            r36 = r10
            r37 = r13
            r38 = r14
            r32.<init>(r33, r35, r36, r37, r38)
            r12.add(r15)
            r14 = r18
            goto L_0x01b7
        L_0x01ab:
            com.google.android.exoplayer2.m0 r0 = new com.google.android.exoplayer2.m0
            java.lang.String r1 = "#EXT-X-STREAM-INF tag must be followed by another line"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01b3:
            r23 = r8
            r22 = r12
        L_0x01b7:
            r13 = r20
            r7 = r21
            r12 = r22
            r8 = r23
            goto L_0x0036
        L_0x01c1:
            r21 = r7
            r23 = r8
            r22 = r12
            r20 = r13
            r13 = -1
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r9 = 0
        L_0x01d5:
            int r10 = r2.size()
            r12 = 0
            if (r9 >= r10) goto L_0x0231
            java.lang.Object r10 = r2.get(r9)
            x10$b r10 = (defpackage.x10.b) r10
            android.net.Uri r15 = r10.a
            boolean r15 = r8.add(r15)
            if (r15 == 0) goto L_0x0225
            com.google.android.exoplayer2.f0 r15 = r10.b
            yx r15 = r15.k
            if (r15 != 0) goto L_0x01f2
            r15 = 1
            goto L_0x01f3
        L_0x01f2:
            r15 = 0
        L_0x01f3:
            defpackage.q40.f(r15)
            com.google.android.exoplayer2.source.hls.p r15 = new com.google.android.exoplayer2.source.hls.p
            android.net.Uri r13 = r10.a
            java.lang.Object r13 = r0.get(r13)
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            defpackage.q40.e(r13)
            java.util.List r13 = (java.util.List) r13
            r15.<init>(r12, r12, r13)
            com.google.android.exoplayer2.f0 r12 = r10.b
            yx r13 = new yx
            r24 = r0
            r41 = r8
            r0 = 1
            yx$b[] r8 = new defpackage.yx.b[r0]
            r0 = 0
            r8[r0] = r15
            r13.<init>((defpackage.yx.b[]) r8)
            com.google.android.exoplayer2.f0 r0 = r12.k(r13)
            x10$b r0 = r10.a(r0)
            r7.add(r0)
            goto L_0x0229
        L_0x0225:
            r24 = r0
            r41 = r8
        L_0x0229:
            int r9 = r9 + 1
            r8 = r41
            r0 = r24
            r13 = -1
            goto L_0x01d5
        L_0x0231:
            r0 = r12
            r8 = r0
            r13 = 0
        L_0x0234:
            int r9 = r3.size()
            if (r13 >= r9) goto L_0x0453
            java.lang.Object r9 = r3.get(r13)
            java.lang.String r9 = (java.lang.String) r9
            java.util.regex.Pattern r10 = C
            java.lang.String r10 = u(r9, r10, r11)
            java.util.regex.Pattern r15 = B
            java.lang.String r15 = u(r9, r15, r11)
            java.util.regex.Pattern r12 = x
            java.lang.String r12 = r(r9, r12, r11)
            if (r12 != 0) goto L_0x0256
            r12 = 0
            goto L_0x025a
        L_0x0256:
            android.net.Uri r12 = defpackage.u50.d(r1, r12)
        L_0x025a:
            java.util.regex.Pattern r1 = A
            java.lang.String r36 = r(r9, r1, r11)
            int r35 = t(r9)
            int r1 = s(r9, r11)
            java.lang.String r24 = java.lang.String.valueOf(r10)
            int r24 = r24.length()
            r19 = 1
            int r24 = r24 + 1
            java.lang.String r25 = java.lang.String.valueOf(r15)
            int r25 = r25.length()
            r37 = r3
            int r3 = r24 + r25
            r38 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r3)
            r8.append(r10)
            java.lang.String r3 = ":"
            r8.append(r3)
            r8.append(r15)
            java.lang.String r24 = r8.toString()
            yx r3 = new yx
            r39 = r7
            r8 = 1
            yx$b[] r7 = new defpackage.yx.b[r8]
            com.google.android.exoplayer2.source.hls.p r8 = new com.google.android.exoplayer2.source.hls.p
            r40 = r14
            java.util.List r14 = java.util.Collections.emptyList()
            r8.<init>(r10, r15, r14)
            r14 = 0
            r7[r14] = r8
            r3.<init>((defpackage.yx.b[]) r7)
            java.util.regex.Pattern r7 = z
            java.lang.String r7 = u(r9, r7, r11)
            int r8 = r7.hashCode()
            r14 = 2
            switch(r8) {
                case -959297733: goto L_0x02db;
                case -333210994: goto L_0x02d1;
                case 62628790: goto L_0x02c7;
                case 81665115: goto L_0x02bd;
                default: goto L_0x02bc;
            }
        L_0x02bc:
            goto L_0x02e5
        L_0x02bd:
            java.lang.String r8 = "VIDEO"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02e5
            r7 = 0
            goto L_0x02e6
        L_0x02c7:
            java.lang.String r8 = "AUDIO"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02e5
            r7 = 1
            goto L_0x02e6
        L_0x02d1:
            java.lang.String r8 = "CLOSED-CAPTIONS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02e5
            r7 = 3
            goto L_0x02e6
        L_0x02db:
            java.lang.String r8 = "SUBTITLES"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x02e5
            r7 = 2
            goto L_0x02e6
        L_0x02e5:
            r7 = -1
        L_0x02e6:
            if (r7 == 0) goto L_0x03f3
            r8 = 1
            if (r7 == r8) goto L_0x037e
            if (r7 == r14) goto L_0x033e
            r8 = 3
            if (r7 == r8) goto L_0x02f4
        L_0x02f0:
            r17 = 0
            goto L_0x0444
        L_0x02f4:
            java.util.regex.Pattern r3 = E
            java.lang.String r3 = u(r9, r3, r11)
            java.lang.String r7 = "CC"
            boolean r7 = r3.startsWith(r7)
            if (r7 == 0) goto L_0x030d
            java.lang.String r3 = r3.substring(r14)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r7 = "application/cea-608"
            goto L_0x0318
        L_0x030d:
            r7 = 7
            java.lang.String r3 = r3.substring(r7)
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.String r7 = "application/cea-708"
        L_0x0318:
            r33 = r3
            r27 = r7
            if (r0 != 0) goto L_0x0323
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0323:
            r26 = 0
            r28 = 0
            r29 = -1
            r25 = r15
            r30 = r35
            r31 = r1
            r32 = r36
            com.google.android.exoplayer2.f0 r1 = com.google.android.exoplayer2.f0.x(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0.add(r1)
            r8 = r38
            r17 = 0
            goto L_0x0446
        L_0x033e:
            x10$b r7 = e(r2, r10)
            if (r7 == 0) goto L_0x0354
            com.google.android.exoplayer2.f0 r7 = r7.b
            java.lang.String r7 = r7.j
            r8 = 3
            java.lang.String r7 = defpackage.v50.B(r7, r8)
            java.lang.String r8 = defpackage.e50.e(r7)
            r28 = r7
            goto L_0x0357
        L_0x0354:
            r8 = 0
            r28 = 0
        L_0x0357:
            if (r8 != 0) goto L_0x035e
            java.lang.String r7 = "text/vtt"
            r27 = r7
            goto L_0x0360
        L_0x035e:
            r27 = r8
        L_0x0360:
            r29 = -1
            java.lang.String r26 = "application/x-mpegURL"
            r25 = r15
            r30 = r35
            r31 = r1
            r32 = r36
            com.google.android.exoplayer2.f0 r1 = com.google.android.exoplayer2.f0.w(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            com.google.android.exoplayer2.f0 r1 = r1.k(r3)
            x10$a r3 = new x10$a
            r3.<init>(r12, r1, r10, r15)
            r6.add(r3)
            goto L_0x02f0
        L_0x037e:
            x10$b r7 = d(r2, r10)
            if (r7 == 0) goto L_0x0390
            com.google.android.exoplayer2.f0 r7 = r7.b
            java.lang.String r7 = r7.j
            r8 = 1
            java.lang.String r7 = defpackage.v50.B(r7, r8)
            r28 = r7
            goto L_0x0393
        L_0x0390:
            r8 = 1
            r28 = 0
        L_0x0393:
            if (r28 == 0) goto L_0x039a
            java.lang.String r7 = defpackage.e50.e(r28)
            goto L_0x039b
        L_0x039a:
            r7 = 0
        L_0x039b:
            java.util.regex.Pattern r14 = h
            java.lang.String r9 = r(r9, r14, r11)
            if (r9 == 0) goto L_0x03c8
            java.lang.String r14 = "/"
            java.lang.String[] r14 = defpackage.v50.A0(r9, r14)
            r17 = 0
            r14 = r14[r17]
            int r14 = java.lang.Integer.parseInt(r14)
            java.lang.String r8 = "audio/eac3"
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L_0x03c3
            java.lang.String r8 = "/JOC"
            boolean r8 = r9.endsWith(r8)
            if (r8 == 0) goto L_0x03c3
            java.lang.String r7 = "audio/eac3-joc"
        L_0x03c3:
            r27 = r7
            r31 = r14
            goto L_0x03ce
        L_0x03c8:
            r17 = 0
            r27 = r7
            r31 = -1
        L_0x03ce:
            r29 = 0
            r30 = -1
            r32 = -1
            r33 = 0
            java.lang.String r26 = "application/x-mpegURL"
            r25 = r15
            r34 = r35
            r35 = r1
            com.google.android.exoplayer2.f0 r1 = com.google.android.exoplayer2.f0.m(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            if (r12 != 0) goto L_0x03e6
            r8 = r1
            goto L_0x0446
        L_0x03e6:
            x10$a r7 = new x10$a
            com.google.android.exoplayer2.f0 r1 = r1.k(r3)
            r7.<init>(r12, r1, r10, r15)
            r5.add(r7)
            goto L_0x0444
        L_0x03f3:
            r17 = 0
            x10$b r7 = f(r2, r10)
            if (r7 == 0) goto L_0x0412
            com.google.android.exoplayer2.f0 r7 = r7.b
            java.lang.String r8 = r7.j
            java.lang.String r8 = defpackage.v50.B(r8, r14)
            int r9 = r7.r
            int r14 = r7.s
            float r7 = r7.t
            r33 = r7
            r28 = r8
            r31 = r9
            r32 = r14
            goto L_0x041a
        L_0x0412:
            r28 = 0
            r31 = -1
            r32 = -1
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x041a:
            if (r28 == 0) goto L_0x0423
            java.lang.String r7 = defpackage.e50.e(r28)
            r27 = r7
            goto L_0x0425
        L_0x0423:
            r27 = 0
        L_0x0425:
            r29 = 0
            r30 = -1
            r34 = 0
            java.lang.String r26 = "application/x-mpegURL"
            r25 = r15
            r36 = r1
            com.google.android.exoplayer2.f0 r1 = com.google.android.exoplayer2.f0.F(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            com.google.android.exoplayer2.f0 r1 = r1.k(r3)
            if (r12 != 0) goto L_0x043c
            goto L_0x0444
        L_0x043c:
            x10$a r3 = new x10$a
            r3.<init>(r12, r1, r10, r15)
            r4.add(r3)
        L_0x0444:
            r8 = r38
        L_0x0446:
            int r13 = r13 + 1
            r1 = r42
            r3 = r37
            r7 = r39
            r14 = r40
            r12 = 0
            goto L_0x0234
        L_0x0453:
            r39 = r7
            r38 = r8
            r40 = r14
            if (r40 == 0) goto L_0x045f
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x045f:
            r9 = r0
            x10 r13 = new x10
            r0 = r13
            r1 = r42
            r2 = r23
            r3 = r39
            r7 = r21
            r8 = r38
            r10 = r20
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a20.m(a20$a, java.lang.String):x10");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0141, code lost:
        if (r8 != null) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.y10 n(defpackage.x10 r64, defpackage.a20.a r65, java.lang.String r66) {
        /*
            r0 = r64
            boolean r1 = r0.c
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r7 = ""
            r13 = 0
            r14 = 1
            r26 = r1
            r16 = r4
            r24 = r16
            r37 = r7
            r1 = 0
            r4 = 0
            r5 = 0
            r12 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r23 = 1
            r27 = 0
            r28 = 0
            r29 = 0
            r38 = 0
            r40 = 0
            r45 = 0
            r46 = 0
            r47 = -1
            r49 = 0
            r50 = 0
            r52 = 0
        L_0x004b:
            r53 = 0
        L_0x004d:
            boolean r31 = r65.a()
            if (r31 == 0) goto L_0x0324
            java.lang.String r8 = r65.b()
            java.lang.String r9 = "#EXT"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0062
            r6.add(r8)
        L_0x0062:
            java.lang.String r9 = "#EXT-X-PLAYLIST-TYPE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0084
            java.util.regex.Pattern r9 = n
            java.lang.String r8 = u(r8, r9, r2)
            java.lang.String r9 = "VOD"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x007a
            r4 = 1
            goto L_0x004d
        L_0x007a:
            java.lang.String r9 = "EVENT"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x004d
            r4 = 2
            goto L_0x004d
        L_0x0084:
            java.lang.String r9 = "#EXT-X-START"
            boolean r9 = r8.startsWith(r9)
            r31 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r9 == 0) goto L_0x009d
            java.util.regex.Pattern r9 = r
            double r8 = h(r8, r9)
            double r8 = r8 * r31
            long r8 = (long) r8
            r16 = r8
            goto L_0x004d
        L_0x009d:
            java.lang.String r9 = "#EXT-X-MAP"
            boolean r9 = r8.startsWith(r9)
            java.lang.String r10 = "@"
            if (r9 == 0) goto L_0x00f2
            java.util.regex.Pattern r9 = x
            java.lang.String r9 = u(r8, r9, r2)
            java.util.regex.Pattern r11 = t
            java.lang.String r8 = r(r8, r11, r2)
            if (r8 == 0) goto L_0x00cd
            java.lang.String[] r8 = r8.split(r10)
            r10 = r8[r13]
            long r10 = java.lang.Long.parseLong(r10)
            int r13 = r8.length
            if (r13 <= r14) goto L_0x00c8
            r8 = r8[r14]
            long r29 = java.lang.Long.parseLong(r8)
        L_0x00c8:
            r33 = r10
            r31 = r29
            goto L_0x00d1
        L_0x00cd:
            r31 = r29
            r33 = r47
        L_0x00d1:
            if (r5 == 0) goto L_0x00de
            if (r46 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            com.google.android.exoplayer2.m0 r0 = new com.google.android.exoplayer2.m0
            java.lang.String r1 = "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00de:
            y10$a r52 = new y10$a
            r29 = r52
            r30 = r9
            r35 = r5
            r36 = r46
            r29.<init>(r30, r31, r33, r35, r36)
            r13 = 0
            r29 = 0
            r47 = -1
            goto L_0x004d
        L_0x00f2:
            java.lang.String r9 = "#EXT-X-TARGETDURATION"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0109
            java.util.regex.Pattern r9 = l
            int r8 = k(r8, r9)
            long r8 = (long) r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r24 = r8 * r10
        L_0x0106:
            r13 = 0
            goto L_0x004d
        L_0x0109:
            java.lang.String r9 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x011a
            java.util.regex.Pattern r9 = o
            long r38 = l(r8, r9)
            r21 = r38
            goto L_0x0106
        L_0x011a:
            java.lang.String r9 = "#EXT-X-VERSION"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0129
            java.util.regex.Pattern r9 = m
            int r23 = k(r8, r9)
            goto L_0x0106
        L_0x0129:
            java.lang.String r9 = "#EXT-X-DEFINE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x015c
            java.util.regex.Pattern r9 = J
            java.lang.String r9 = r(r8, r9, r2)
            if (r9 == 0) goto L_0x0144
            java.util.Map<java.lang.String, java.lang.String> r8 = r0.j
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0153
            goto L_0x0150
        L_0x0144:
            java.util.regex.Pattern r9 = B
            java.lang.String r9 = u(r8, r9, r2)
            java.util.regex.Pattern r10 = I
            java.lang.String r8 = u(r8, r10, r2)
        L_0x0150:
            r2.put(r9, r8)
        L_0x0153:
            r57 = r3
            r61 = r7
            r11 = 0
            r55 = -1
            goto L_0x031a
        L_0x015c:
            java.lang.String r9 = "#EXTINF"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0176
            java.util.regex.Pattern r9 = p
            double r9 = h(r8, r9)
            double r9 = r9 * r31
            long r9 = (long) r9
            java.util.regex.Pattern r11 = q
            java.lang.String r37 = q(r8, r11, r7, r2)
            r53 = r9
            goto L_0x0106
        L_0x0176:
            java.lang.String r9 = "#EXT-X-KEY"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x01d7
            java.util.regex.Pattern r5 = u
            java.lang.String r5 = u(r8, r5, r2)
            java.util.regex.Pattern r9 = v
            java.lang.String r10 = "identity"
            java.lang.String r9 = q(r8, r9, r10, r2)
            java.lang.String r11 = "NONE"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x019e
            r3.clear()
            r5 = 0
            r40 = 0
            r46 = 0
            goto L_0x0106
        L_0x019e:
            java.util.regex.Pattern r11 = y
            java.lang.String r11 = r(r8, r11, r2)
            boolean r10 = r10.equals(r9)
            if (r10 == 0) goto L_0x01c1
            java.lang.String r9 = "AES-128"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x01bc
            java.util.regex.Pattern r5 = x
            java.lang.String r5 = u(r8, r5, r2)
            r46 = r11
            goto L_0x0106
        L_0x01bc:
            r46 = r11
            r5 = 0
            goto L_0x0106
        L_0x01c1:
            if (r12 != 0) goto L_0x01c7
            java.lang.String r12 = j(r5)
        L_0x01c7:
            ns$b r5 = i(r8, r9, r2)
            if (r5 == 0) goto L_0x01bc
            r3.put(r9, r5)
            r46 = r11
            r5 = 0
            r40 = 0
            goto L_0x0106
        L_0x01d7:
            java.lang.String r9 = "#EXT-X-BYTERANGE"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x01fb
            java.util.regex.Pattern r9 = s
            java.lang.String r8 = u(r8, r9, r2)
            java.lang.String[] r8 = r8.split(r10)
            r9 = 0
            r10 = r8[r9]
            long r47 = java.lang.Long.parseLong(r10)
            int r9 = r8.length
            if (r9 <= r14) goto L_0x0106
            r8 = r8[r14]
            long r29 = java.lang.Long.parseLong(r8)
            goto L_0x0106
        L_0x01fb:
            java.lang.String r9 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r9 = r8.startsWith(r9)
            r10 = 58
            if (r9 == 0) goto L_0x0215
            int r1 = r8.indexOf(r10)
            int r1 = r1 + r14
            java.lang.String r1 = r8.substring(r1)
            int r20 = java.lang.Integer.parseInt(r1)
            r1 = 1
            goto L_0x0106
        L_0x0215:
            java.lang.String r9 = "#EXT-X-DISCONTINUITY"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0221
            int r49 = r49 + 1
            goto L_0x0106
        L_0x0221:
            java.lang.String r9 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x0244
            r31 = 0
            int r9 = (r18 > r31 ? 1 : (r18 == r31 ? 0 : -1))
            if (r9 != 0) goto L_0x0153
            int r9 = r8.indexOf(r10)
            int r9 = r9 + r14
            java.lang.String r8 = r8.substring(r9)
            long r8 = defpackage.v50.r0(r8)
            long r8 = com.google.android.exoplayer2.v.a(r8)
            long r18 = r8 - r50
            goto L_0x0106
        L_0x0244:
            java.lang.String r9 = "#EXT-X-GAP"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0251
            r13 = 0
            r45 = 1
            goto L_0x004d
        L_0x0251:
            java.lang.String r9 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x025e
            r13 = 0
            r26 = 1
            goto L_0x004d
        L_0x025e:
            java.lang.String r9 = "#EXT-X-ENDLIST"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x026b
            r13 = 0
            r27 = 1
            goto L_0x004d
        L_0x026b:
            java.lang.String r9 = "#"
            boolean r9 = r8.startsWith(r9)
            if (r9 != 0) goto L_0x0153
            if (r5 != 0) goto L_0x0277
            r9 = 0
            goto L_0x0280
        L_0x0277:
            if (r46 == 0) goto L_0x027c
            r9 = r46
            goto L_0x0280
        L_0x027c:
            java.lang.String r9 = java.lang.Long.toHexString(r38)
        L_0x0280:
            r10 = 1
            long r10 = r38 + r10
            r55 = -1
            int r13 = (r47 > r55 ? 1 : (r47 == r55 ? 0 : -1))
            if (r13 != 0) goto L_0x028d
            r58 = 0
            goto L_0x028f
        L_0x028d:
            r58 = r29
        L_0x028f:
            if (r40 != 0) goto L_0x02d3
            boolean r29 = r3.isEmpty()
            if (r29 != 0) goto L_0x02d3
            java.util.Collection r14 = r3.values()
            r57 = r3
            r0 = 0
            ns$b[] r3 = new defpackage.ns.b[r0]
            java.lang.Object[] r3 = r14.toArray(r3)
            ns$b[] r3 = (defpackage.ns.b[]) r3
            ns r14 = new ns
            r14.<init>((java.lang.String) r12, (defpackage.ns.b[]) r3)
            if (r28 != 0) goto L_0x02cd
            int r0 = r3.length
            ns$b[] r0 = new defpackage.ns.b[r0]
            r61 = r7
            r62 = r10
            r7 = 0
        L_0x02b5:
            int r10 = r3.length
            if (r7 >= r10) goto L_0x02c4
            r10 = r3[r7]
            r11 = 0
            ns$b r10 = r10.c(r11)
            r0[r7] = r10
            int r7 = r7 + 1
            goto L_0x02b5
        L_0x02c4:
            r11 = 0
            ns r3 = new ns
            r3.<init>((java.lang.String) r12, (defpackage.ns.b[]) r0)
            r28 = r3
            goto L_0x02dc
        L_0x02cd:
            r61 = r7
            r62 = r10
            r11 = 0
            goto L_0x02dc
        L_0x02d3:
            r57 = r3
            r61 = r7
            r62 = r10
            r11 = 0
            r14 = r40
        L_0x02dc:
            y10$a r0 = new y10$a
            r29 = r0
            java.lang.String r30 = v(r8, r2)
            r31 = r52
            r32 = r37
            r33 = r53
            r35 = r49
            r36 = r50
            r38 = r14
            r39 = r5
            r40 = r9
            r41 = r58
            r43 = r47
            r29.<init>(r30, r31, r32, r33, r35, r36, r38, r39, r40, r41, r43, r45)
            r15.add(r0)
            long r50 = r50 + r53
            if (r13 == 0) goto L_0x0304
            long r58 = r58 + r47
        L_0x0304:
            r29 = r58
            r0 = r64
            r40 = r14
            r47 = r55
            r3 = r57
            r7 = r61
            r37 = r7
            r38 = r62
            r13 = 0
            r14 = 1
            r45 = 0
            goto L_0x004b
        L_0x031a:
            r0 = r64
            r3 = r57
            r7 = r61
            r13 = 0
            r14 = 1
            goto L_0x004d
        L_0x0324:
            y10 r0 = new y10
            r2 = 0
            int r5 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x032f
            r60 = 1
            goto L_0x0331
        L_0x032f:
            r60 = 0
        L_0x0331:
            r3 = r0
            r5 = r66
            r7 = r16
            r9 = r18
            r11 = r1
            r12 = r20
            r13 = r21
            r1 = r15
            r15 = r23
            r16 = r24
            r18 = r26
            r19 = r27
            r20 = r60
            r21 = r28
            r22 = r1
            r3.<init>(r4, r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a20.n(x10, a20$a, java.lang.String):y10");
    }

    private static boolean o(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z2;
    }

    private static int p(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt(matcher.group(1)) : i2;
    }

    private static String q(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : v(str2, map);
    }

    private static String r(String str, Pattern pattern, Map<String, String> map) {
        return q(str, pattern, (String) null, map);
    }

    private static int s(String str, Map<String, String> map) {
        String r2 = r(str, D, map);
        int i2 = 0;
        if (TextUtils.isEmpty(r2)) {
            return 0;
        }
        String[] z0 = v50.z0(r2, ",");
        if (v50.q(z0, "public.accessibility.describes-video")) {
            i2 = 512;
        }
        if (v50.q(z0, "public.accessibility.transcribes-spoken-dialog")) {
            i2 |= 4096;
        }
        if (v50.q(z0, "public.accessibility.describes-music-and-sound")) {
            i2 |= 1024;
        }
        return v50.q(z0, "public.easy-to-read") ? i2 | 8192 : i2;
    }

    private static int t(String str) {
        int i2 = o(str, G, false) ? 1 : 0;
        if (o(str, H, false)) {
            i2 |= 2;
        }
        return o(str, F, false) ? i2 | 4 : i2;
    }

    private static String u(String str, Pattern pattern, Map<String, String> map) {
        String r2 = r(str, pattern, map);
        if (r2 != null) {
            return r2;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb = new StringBuilder(String.valueOf(pattern2).length() + 19 + String.valueOf(str).length());
        sb.append("Couldn't match ");
        sb.append(pattern2);
        sb.append(" in ");
        sb.append(str);
        throw new m0(sb.toString());
    }

    private static String v(String str, Map<String, String> map) {
        Matcher matcher = K.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int w(BufferedReader bufferedReader, boolean z2, int i2) {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !v50.g0(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    /* renamed from: g */
    public z10 a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (b(bufferedReader)) {
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        trim = readLine.trim();
                        if (!trim.isEmpty()) {
                            if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                    break;
                                } else if (trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    arrayDeque.add(trim);
                                }
                            } else {
                                arrayDeque.add(trim);
                                x10 m2 = m(new a(arrayDeque, bufferedReader), uri.toString());
                                v50.l(bufferedReader);
                                return m2;
                            }
                        }
                    } else {
                        v50.l(bufferedReader);
                        throw new m0("Failed to parse the playlist, could not identify any tags.");
                    }
                }
                arrayDeque.add(trim);
                return n(this.a, new a(arrayDeque, bufferedReader), uri.toString());
            }
            throw new q00("Input does not start with the #EXTM3U header.", uri);
        } finally {
            v50.l(bufferedReader);
        }
    }
}
