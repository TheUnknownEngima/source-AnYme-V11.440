package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: i30  reason: default package */
public final class i30 extends i20 {
    private static final Pattern p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern q = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder n = new StringBuilder();
    private final ArrayList<String> o = new ArrayList<>();

    public i30() {
        super("SubripDecoder");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.h20 C(android.text.Spanned r19, java.lang.String r20) {
        /*
            r18 = this;
            r0 = r20
            if (r0 != 0) goto L_0x000c
            h20 r0 = new h20
            r2 = r19
            r0.<init>(r2)
            return r0
        L_0x000c:
            r2 = r19
            int r1 = r20.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r16 = 0
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r1) {
                case -685620710: goto L_0x006f;
                case -685620679: goto L_0x0067;
                case -685620648: goto L_0x005f;
                case -685620617: goto L_0x0057;
                case -685620586: goto L_0x004f;
                case -685620555: goto L_0x0047;
                case -685620524: goto L_0x003f;
                case -685620493: goto L_0x0036;
                case -685620462: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0077
        L_0x002e:
            boolean r1 = r0.equals(r6)
            if (r1 == 0) goto L_0x0077
            r1 = 5
            goto L_0x0078
        L_0x0036:
            boolean r1 = r0.equals(r7)
            if (r1 == 0) goto L_0x0077
            r1 = 8
            goto L_0x0078
        L_0x003f:
            boolean r1 = r0.equals(r8)
            if (r1 == 0) goto L_0x0077
            r1 = 2
            goto L_0x0078
        L_0x0047:
            boolean r1 = r0.equals(r9)
            if (r1 == 0) goto L_0x0077
            r1 = 4
            goto L_0x0078
        L_0x004f:
            boolean r1 = r0.equals(r10)
            if (r1 == 0) goto L_0x0077
            r1 = 7
            goto L_0x0078
        L_0x0057:
            boolean r1 = r0.equals(r11)
            if (r1 == 0) goto L_0x0077
            r1 = 1
            goto L_0x0078
        L_0x005f:
            boolean r1 = r0.equals(r12)
            if (r1 == 0) goto L_0x0077
            r1 = 3
            goto L_0x0078
        L_0x0067:
            boolean r1 = r0.equals(r13)
            if (r1 == 0) goto L_0x0077
            r1 = 6
            goto L_0x0078
        L_0x006f:
            boolean r1 = r0.equals(r14)
            if (r1 == 0) goto L_0x0077
            r1 = 0
            goto L_0x0078
        L_0x0077:
            r1 = -1
        L_0x0078:
            if (r1 == 0) goto L_0x008b
            if (r1 == r3) goto L_0x008b
            if (r1 == r15) goto L_0x008b
            if (r1 == r5) goto L_0x0088
            if (r1 == r4) goto L_0x0088
            r4 = 5
            if (r1 == r4) goto L_0x0088
            r17 = 1
            goto L_0x008d
        L_0x0088:
            r17 = 2
            goto L_0x008d
        L_0x008b:
            r17 = 0
        L_0x008d:
            int r1 = r20.hashCode()
            switch(r1) {
                case -685620710: goto L_0x00d6;
                case -685620679: goto L_0x00ce;
                case -685620648: goto L_0x00c6;
                case -685620617: goto L_0x00be;
                case -685620586: goto L_0x00b6;
                case -685620555: goto L_0x00ad;
                case -685620524: goto L_0x00a5;
                case -685620493: goto L_0x009d;
                case -685620462: goto L_0x0095;
                default: goto L_0x0094;
            }
        L_0x0094:
            goto L_0x00de
        L_0x0095:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00de
            r0 = 5
            goto L_0x00df
        L_0x009d:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00de
            r0 = 4
            goto L_0x00df
        L_0x00a5:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00de
            r0 = 3
            goto L_0x00df
        L_0x00ad:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00de
            r0 = 8
            goto L_0x00df
        L_0x00b6:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00de
            r0 = 7
            goto L_0x00df
        L_0x00be:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00de
            r0 = 6
            goto L_0x00df
        L_0x00c6:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00de
            r0 = 2
            goto L_0x00df
        L_0x00ce:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00de
            r0 = 1
            goto L_0x00df
        L_0x00d6:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00de
            r0 = 0
            goto L_0x00df
        L_0x00de:
            r0 = -1
        L_0x00df:
            if (r0 == 0) goto L_0x00f1
            if (r0 == r3) goto L_0x00f1
            if (r0 == r15) goto L_0x00f1
            if (r0 == r5) goto L_0x00ef
            r1 = 4
            if (r0 == r1) goto L_0x00ef
            r1 = 5
            if (r0 == r1) goto L_0x00ef
            r6 = 1
            goto L_0x00f2
        L_0x00ef:
            r6 = 0
            goto L_0x00f2
        L_0x00f1:
            r6 = 2
        L_0x00f2:
            h20 r0 = new h20
            r3 = 0
            float r4 = D(r6)
            r5 = 0
            float r7 = D(r17)
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1 = r0
            r2 = r19
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i30.C(android.text.Spanned, java.lang.String):h20");
    }

    static float D(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long E(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String F(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = q.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public k20 z(byte[] bArr, int i, boolean z) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        c50 c50 = new c50();
        i50 i50 = new i50(bArr, i);
        while (true) {
            String m = i50.m();
            if (m == null) {
                break;
            } else if (m.length() != 0) {
                try {
                    Integer.parseInt(m);
                    String m2 = i50.m();
                    if (m2 == null) {
                        b50.h("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = p.matcher(m2);
                    if (matcher.matches()) {
                        c50.a(E(matcher, 1));
                        c50.a(E(matcher, 6));
                        int i2 = 0;
                        this.n.setLength(0);
                        this.o.clear();
                        while (true) {
                            String m3 = i50.m();
                            if (TextUtils.isEmpty(m3)) {
                                break;
                            }
                            if (this.n.length() > 0) {
                                this.n.append("<br>");
                            }
                            this.n.append(F(m3, this.o));
                        }
                        Spanned fromHtml = Html.fromHtml(this.n.toString());
                        String str4 = null;
                        while (true) {
                            if (i2 >= this.o.size()) {
                                break;
                            }
                            String str5 = this.o.get(i2);
                            if (str5.matches("\\{\\\\an[1-9]\\}")) {
                                str4 = str5;
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(C(fromHtml, str4));
                        arrayList.add(h20.s);
                    } else {
                        str2 = "Skipping invalid timing: ";
                        str3 = String.valueOf(m2);
                        if (str3.length() == 0) {
                            str = new String(str2);
                            b50.h("SubripDecoder", str);
                        }
                        str = str2.concat(str3);
                        b50.h("SubripDecoder", str);
                    }
                } catch (NumberFormatException unused) {
                    str2 = "Skipping invalid index: ";
                    str3 = String.valueOf(m);
                    if (str3.length() == 0) {
                        str = new String(str2);
                    }
                }
            }
        }
        h20[] h20Arr = new h20[arrayList.size()];
        arrayList.toArray(h20Arr);
        return new j30(h20Arr, c50.d());
    }
}
