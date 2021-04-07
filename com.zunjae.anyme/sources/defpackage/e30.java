package defpackage;

import android.graphics.PointF;
import android.text.Layout;
import defpackage.g30;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: e30  reason: default package */
public final class e30 extends i20 {
    private static final Pattern s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean n;
    private final f30 o;
    private Map<String, g30> p;
    private float q = -3.4028235E38f;
    private float r = -3.4028235E38f;

    public e30(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.n = false;
            this.o = null;
            return;
        }
        this.n = true;
        String x = v50.x(list.get(0));
        q40.a(x.startsWith("Format:"));
        f30 a = f30.a(x);
        q40.e(a);
        this.o = a;
        H(new i50(list.get(1)));
    }

    private static int C(long j, List<Long> list, List<List<h20>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() == j) {
                return size;
            } else {
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i != 0) {
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    private static float D(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static h20 E(String str, g30 g30, g30.b bVar, float f, float f2) {
        float f3;
        float f4;
        int i = bVar.a;
        if (i == -1) {
            i = g30 != null ? g30.b : -1;
        }
        int M = M(i);
        int L = L(i);
        PointF pointF = bVar.b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            f3 = D(M);
            f4 = D(L);
        } else {
            f4 = pointF.y / f2;
            f3 = pointF.x / f;
        }
        return new h20(str, N(i), f4, 0, L, f3, M, -3.4028235E38f);
    }

    private void F(String str, f30 f30, List<List<h20>> list, List<Long> list2) {
        int i;
        q40.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", f30.e);
        if (split.length != f30.e) {
            String valueOf = String.valueOf(str);
            b50.h("SsaDecoder", valueOf.length() != 0 ? "Skipping dialogue line with fewer columns than format: ".concat(valueOf) : new String("Skipping dialogue line with fewer columns than format: "));
            return;
        }
        long K = K(split[f30.a]);
        if (K == -9223372036854775807L) {
            String valueOf2 = String.valueOf(str);
            b50.h("SsaDecoder", valueOf2.length() != 0 ? "Skipping invalid timing: ".concat(valueOf2) : new String("Skipping invalid timing: "));
            return;
        }
        long K2 = K(split[f30.b]);
        if (K2 == -9223372036854775807L) {
            String valueOf3 = String.valueOf(str);
            b50.h("SsaDecoder", valueOf3.length() != 0 ? "Skipping invalid timing: ".concat(valueOf3) : new String("Skipping invalid timing: "));
            return;
        }
        Map<String, g30> map = this.p;
        g30 g30 = (map == null || (i = f30.c) == -1) ? null : map.get(split[i].trim());
        String str2 = split[f30.d];
        h20 E = E(g30.b.d(str2).replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n"), g30, g30.b.b(str2), this.q, this.r);
        int C = C(K2, list2, list);
        for (int C2 = C(K, list2, list); C2 < C; C2++) {
            list.get(C2).add(E);
        }
    }

    private void G(i50 i50, List<List<h20>> list, List<Long> list2) {
        f30 f30 = this.n ? this.o : null;
        while (true) {
            String m = i50.m();
            if (m == null) {
                return;
            }
            if (m.startsWith("Format:")) {
                f30 = f30.a(m);
            } else if (m.startsWith("Dialogue:")) {
                if (f30 == null) {
                    String valueOf = String.valueOf(m);
                    b50.h("SsaDecoder", valueOf.length() != 0 ? "Skipping dialogue line before complete format: ".concat(valueOf) : new String("Skipping dialogue line before complete format: "));
                } else {
                    F(m, f30, list, list2);
                }
            }
        }
    }

    private void H(i50 i50) {
        while (true) {
            String m = i50.m();
            if (m == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(m)) {
                I(i50);
            } else if ("[V4+ Styles]".equalsIgnoreCase(m)) {
                this.p = J(i50);
            } else if ("[V4 Styles]".equalsIgnoreCase(m)) {
                b50.f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(m)) {
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r2.equals("playresx") != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void I(defpackage.i50 r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.String r0 = r7.m()
            if (r0 == 0) goto L_0x0069
            int r1 = r7.a()
            if (r1 == 0) goto L_0x0014
            int r1 = r7.f()
            r2 = 91
            if (r1 == r2) goto L_0x0069
        L_0x0014:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            r1 = 0
            r2 = r0[r1]
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = defpackage.v50.G0(r2)
            r3 = -1
            int r4 = r2.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L_0x003e;
                case 1879649549: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x0047
        L_0x0034:
            java.lang.String r1 = "playresy"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x003e:
            java.lang.String r4 = "playresx"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r1 = -1
        L_0x0048:
            if (r1 == 0) goto L_0x005c
            if (r1 == r5) goto L_0x004d
            goto L_0x0000
        L_0x004d:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x005a }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x005a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x005a }
            r6.r = r0     // Catch:{ NumberFormatException -> 0x005a }
            goto L_0x0000
        L_0x005a:
            goto L_0x0000
        L_0x005c:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x005a }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x005a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x005a }
            r6.q = r0     // Catch:{ NumberFormatException -> 0x005a }
            goto L_0x0000
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e30.I(i50):void");
    }

    private static Map<String, g30> J(i50 i50) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g30.a aVar = null;
        while (true) {
            String m = i50.m();
            if (m == null || (i50.a() != 0 && i50.f() == 91)) {
                return linkedHashMap;
            }
            if (m.startsWith("Format:")) {
                aVar = g30.a.a(m);
            } else if (m.startsWith("Style:")) {
                if (aVar == null) {
                    String valueOf = String.valueOf(m);
                    b50.h("SsaDecoder", valueOf.length() != 0 ? "Skipping 'Style:' line before 'Format:' line: ".concat(valueOf) : new String("Skipping 'Style:' line before 'Format:' line: "));
                } else {
                    g30 b = g30.b(m, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long K(String str) {
        Matcher matcher = s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        v50.g(group);
        String group2 = matcher.group(2);
        v50.g(group2);
        String group3 = matcher.group(3);
        v50.g(group3);
        String group4 = matcher.group(4);
        v50.g(group4);
        return (Long.parseLong(group) * 60 * 60 * 1000000) + (Long.parseLong(group2) * 60 * 1000000) + (Long.parseLong(group3) * 1000000) + (Long.parseLong(group4) * 10000);
    }

    private static int L(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i);
                b50.h("SsaDecoder", sb.toString());
                return Integer.MIN_VALUE;
        }
    }

    private static int M(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i);
                b50.h("SsaDecoder", sb.toString());
                return Integer.MIN_VALUE;
        }
    }

    private static Layout.Alignment N(int i) {
        switch (i) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown alignment: ");
                sb.append(i);
                b50.h("SsaDecoder", sb.toString());
                return null;
        }
    }

    /* access modifiers changed from: protected */
    public k20 z(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        i50 i50 = new i50(bArr, i);
        if (!this.n) {
            H(i50);
        }
        G(i50, arrayList, arrayList2);
        return new h30(arrayList, arrayList2);
    }
}
