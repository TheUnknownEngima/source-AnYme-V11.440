package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import defpackage.w30;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: x30  reason: default package */
public final class x30 {
    public static final Pattern b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern c = Pattern.compile("(\\S+?):(\\S+)");
    private final StringBuilder a = new StringBuilder();

    /* renamed from: x30$a */
    private static final class a {
        private static final String[] e = new String[0];
        public final String a;
        public final int b;
        public final String c;
        public final String[] d;

        private a(String str, int i, String str2, String[] strArr) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = strArr;
        }

        public static a a(String str, int i) {
            String str2;
            String trim = str.trim();
            q40.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] z0 = v50.z0(trim, "\\.");
            return new a(z0[0], i, str2, z0.length > 1 ? (String[]) v50.q0(z0, 1, z0.length) : e);
        }

        public static a b() {
            return new a("", 0, "", new String[0]);
        }
    }

    /* renamed from: x30$b */
    private static final class b implements Comparable<b> {
        public final int e;
        public final v30 f;

        public b(int i, v30 v30) {
            this.e = i;
            this.f = v30;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            return this.e - bVar.e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r5, android.text.SpannableStringBuilder r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L_0x002e
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L_0x0024
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "nbsp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "amp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 3
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "lt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "gt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x007a
            if (r0 == r4) goto L_0x0077
            if (r0 == r3) goto L_0x0074
            if (r0 == r2) goto L_0x0071
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            int r6 = r6 + 33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.String r6 = "ignoring unsupported entity: '&"
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = ";'"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "WebvttCueParser"
            defpackage.b50.h(r6, r5)
            goto L_0x007f
        L_0x0071:
            r5 = 38
            goto L_0x007c
        L_0x0074:
            r5 = 32
            goto L_0x007c
        L_0x0077:
            r5 = 62
            goto L_0x007c
        L_0x007a:
            r5 = 60
        L_0x007c:
            r6.append(r5)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.a(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098 A[LOOP:0: B:44:0x0096->B:45:0x0098, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.lang.String r8, defpackage.x30.a r9, android.text.SpannableStringBuilder r10, java.util.List<defpackage.v30> r11, java.util.List<defpackage.x30.b> r12) {
        /*
            int r0 = r9.b
            int r1 = r10.length()
            java.lang.String r2 = r9.a
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0067
            r7 = 105(0x69, float:1.47E-43)
            if (r3 == r7) goto L_0x005d
            r7 = 3314158(0x3291ee, float:4.644125E-39)
            if (r3 == r7) goto L_0x0053
            r7 = 98
            if (r3 == r7) goto L_0x0049
            r7 = 99
            if (r3 == r7) goto L_0x003f
            r7 = 117(0x75, float:1.64E-43)
            if (r3 == r7) goto L_0x0035
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L_0x002b
            goto L_0x0071
        L_0x002b:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 5
            goto L_0x0072
        L_0x0035:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 2
            goto L_0x0072
        L_0x003f:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 3
            goto L_0x0072
        L_0x0049:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 0
            goto L_0x0072
        L_0x0053:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 4
            goto L_0x0072
        L_0x005d:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 1
            goto L_0x0072
        L_0x0067:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0071
            r2 = 6
            goto L_0x0072
        L_0x0071:
            r2 = -1
        L_0x0072:
            r3 = 33
            switch(r2) {
                case 0: goto L_0x0084;
                case 1: goto L_0x007e;
                case 2: goto L_0x0078;
                case 3: goto L_0x008c;
                case 4: goto L_0x008c;
                case 5: goto L_0x008c;
                case 6: goto L_0x008c;
                default: goto L_0x0077;
            }
        L_0x0077:
            return
        L_0x0078:
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            goto L_0x0089
        L_0x007e:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r5)
            goto L_0x0089
        L_0x0084:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
        L_0x0089:
            r10.setSpan(r2, r0, r1, r3)
        L_0x008c:
            r12.clear()
            e(r11, r8, r9, r12)
            int r8 = r12.size()
        L_0x0096:
            if (r4 >= r8) goto L_0x00a6
            java.lang.Object r9 = r12.get(r4)
            x30$b r9 = (defpackage.x30.b) r9
            v30 r9 = r9.f
            c(r10, r9, r0, r1)
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.b(java.lang.String, x30$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    private static void c(SpannableStringBuilder spannableStringBuilder, v30 v30, int i, int i2) {
        Object obj;
        if (v30 != null) {
            if (v30.g() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(v30.g()), i, i2, 33);
            }
            if (v30.k()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (v30.l()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (v30.j()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(v30.b()), i, i2, 33);
            }
            if (v30.i()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(v30.a()), i, i2, 33);
            }
            if (v30.c() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(v30.c()), i, i2, 33);
            }
            Layout.Alignment h = v30.h();
            if (h != null) {
                spannableStringBuilder.setSpan(new AlignmentSpan.Standard(h), i, i2, 33);
            }
            int e = v30.e();
            if (e == 1) {
                obj = new AbsoluteSizeSpan((int) v30.d(), true);
            } else if (e == 2) {
                obj = new RelativeSizeSpan(v30.d());
            } else if (e == 3) {
                obj = new RelativeSizeSpan(v30.d() / 100.0f);
            } else {
                return;
            }
            spannableStringBuilder.setSpan(obj, i, i2, 33);
        }
    }

    private static int d(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static void e(List<v30> list, String str, a aVar, List<b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            v30 v30 = list.get(i);
            int f = v30.f(str, aVar.a, aVar.d, aVar.c);
            if (f > 0) {
                list2.add(new b(f, v30));
            }
        }
        Collections.sort(list2);
    }

    private static String f(String str) {
        String trim = str.trim();
        q40.a(!trim.isEmpty());
        return v50.A0(trim, "[ \\.]")[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0063 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean g(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 98
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == r1) goto L_0x0056
            r1 = 99
            if (r0 == r1) goto L_0x004c
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L_0x0042
            r1 = 3314158(0x3291ee, float:4.644125E-39)
            if (r0 == r1) goto L_0x0038
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L_0x002e
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L_0x0024
            goto L_0x0060
        L_0x0024:
            java.lang.String r0 = "v"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 5
            goto L_0x0061
        L_0x002e:
            java.lang.String r0 = "u"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 4
            goto L_0x0061
        L_0x0038:
            java.lang.String r0 = "lang"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 3
            goto L_0x0061
        L_0x0042:
            java.lang.String r0 = "i"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 2
            goto L_0x0061
        L_0x004c:
            java.lang.String r0 = "c"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 1
            goto L_0x0061
        L_0x0056:
            java.lang.String r0 = "b"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0060
            r8 = 0
            goto L_0x0061
        L_0x0060:
            r8 = -1
        L_0x0061:
            if (r8 == 0) goto L_0x006e
            if (r8 == r7) goto L_0x006e
            if (r8 == r6) goto L_0x006e
            if (r8 == r5) goto L_0x006e
            if (r8 == r4) goto L_0x006e
            if (r8 == r3) goto L_0x006e
            return r2
        L_0x006e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.g(java.lang.String):boolean");
    }

    private static boolean i(String str, Matcher matcher, i50 i50, w30.b bVar, StringBuilder sb, List<v30> list) {
        try {
            bVar.n(z30.d(matcher.group(1)));
            bVar.h(z30.d(matcher.group(2)));
            j(matcher.group(3), bVar);
            sb.setLength(0);
            while (true) {
                String m = i50.m();
                if (!TextUtils.isEmpty(m)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(m.trim());
                } else {
                    k(str, sb.toString(), bVar, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            b50.h("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return false;
        }
    }

    static void j(String str, w30.b bVar) {
        Matcher matcher = c.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    l(group2, bVar);
                } else if ("align".equals(group)) {
                    bVar.p(o(group2));
                } else if ("position".equals(group)) {
                    n(group2, bVar);
                } else if ("size".equals(group)) {
                    bVar.q(z30.c(group2));
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(group).length() + 21 + String.valueOf(group2).length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    b50.h("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                b50.h("WebvttCueParser", valueOf.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    static void k(String str, String str2, w30.b bVar, List<v30> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = d(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String f = f(substring);
                        if (g(f)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    a aVar = (a) arrayDeque.pop();
                                    b(str, aVar, spannableStringBuilder, list, arrayList);
                                    if (aVar.a.equals(f)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(a.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            b(str, (a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        b(str, a.b(), spannableStringBuilder, list, arrayList);
        bVar.o(spannableStringBuilder);
    }

    private static void l(String str, w30.b bVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.j(m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            bVar.i(z30.c(str));
            bVar.k(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        bVar.i((float) parseInt);
        bVar.k(1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x002a;
                case -1074341483: goto L_0x0020;
                case 100571: goto L_0x0016;
                case 109757538: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x005d
            if (r0 == r4) goto L_0x005c
            if (r0 == r3) goto L_0x005c
            if (r0 == r2) goto L_0x005b
            java.lang.String r0 = "Invalid anchor value: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r1 = r5.length()
            if (r1 == 0) goto L_0x004e
            java.lang.String r5 = r0.concat(r5)
            goto L_0x0053
        L_0x004e:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
        L_0x0053:
            java.lang.String r0 = "WebvttCueParser"
            defpackage.b50.h(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x005b:
            return r3
        L_0x005c:
            return r4
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.m(java.lang.String):int");
    }

    private static void n(String str, w30.b bVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.m(m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        }
        bVar.l(z30.c(str));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int o(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            switch(r0) {
                case -1364013995: goto L_0x003f;
                case -1074341483: goto L_0x0035;
                case 100571: goto L_0x002b;
                case 3317767: goto L_0x0021;
                case 108511772: goto L_0x0017;
                case 109757538: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "start"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "right"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 5
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "left"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 4
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "middle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 3
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "center"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0076
            if (r0 == r4) goto L_0x0075
            if (r0 == r5) goto L_0x0074
            if (r0 == r3) goto L_0x0074
            if (r0 == r2) goto L_0x0073
            if (r0 == r1) goto L_0x0072
            java.lang.String r0 = "Invalid alignment value: "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r1 = r6.length()
            if (r1 == 0) goto L_0x0067
            java.lang.String r6 = r0.concat(r6)
            goto L_0x006c
        L_0x0067:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
        L_0x006c:
            java.lang.String r0 = "WebvttCueParser"
            defpackage.b50.h(r0, r6)
            return r5
        L_0x0072:
            return r1
        L_0x0073:
            return r3
        L_0x0074:
            return r5
        L_0x0075:
            return r2
        L_0x0076:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.o(java.lang.String):int");
    }

    public boolean h(i50 i50, w30.b bVar, List<v30> list) {
        String m = i50.m();
        if (m == null) {
            return false;
        }
        Matcher matcher = b.matcher(m);
        if (matcher.matches()) {
            return i((String) null, matcher, i50, bVar, this.a, list);
        }
        String m2 = i50.m();
        if (m2 == null) {
            return false;
        }
        Matcher matcher2 = b.matcher(m2);
        if (!matcher2.matches()) {
            return false;
        }
        return i(m.trim(), matcher2, i50, bVar, this.a, list);
    }
}
